package sample.util;

public class Constants {
	public static String ip;
	public static String port;

	public static String getLogUrl(String systemRefId) {
		String apiPath = "/data-processing-system/matchUserFaceWithNID/get-log-details?systemRefId=";
		return "http://" + ip + ":" + port + apiPath + systemRefId;
	}
}
