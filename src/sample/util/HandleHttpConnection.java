package sample.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HandleHttpConnection {
	public LogDetailsDto getResponse(String systemRefId) {
		LogDetailsDto logDetailsDto = null;
		try {
			URL url = new URL(Constants.getLogUrl(systemRefId));
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			httpURLConnection.setRequestProperty("Content-Type", "application/json;");
			httpURLConnection.setRequestMethod("GET");
//			httpURLConnection.setRequestProperty("Accept-Encoding", "UTF-8");

			int code = httpURLConnection.getResponseCode();
			if (code == 200) {
				InputStreamReader reader = new InputStreamReader(httpURLConnection.getInputStream());
				JsonElement jsonElement = JsonParser.parseReader(reader);

				Gson gson = new GsonBuilder()
						.setPrettyPrinting()
						.disableHtmlEscaping()
						.enableComplexMapKeySerialization()
						.serializeSpecialFloatingPointValues()
						.create();
				String jsonString = gson.toJson(jsonElement);
				int len = jsonString.length();
				String trimmedString = jsonString.substring(4, len - 2);
				logDetailsDto = gson.fromJson(trimmedString, LogDetailsDto.class);

				logDetailsDto.setRawResponse(gson.toJson(JsonParser.parseString(logDetailsDto.getRawResponse())));
				logDetailsDto.setUserReqData(gson.toJson(JsonParser.parseString(logDetailsDto.getUserReqData())));
			} else {
				System.err.println(code);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return logDetailsDto;
	}
}
