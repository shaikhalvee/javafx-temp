package sample.util;

public class LogDetailsDto {
	private String sourceImgUri;
	private String targetImgUri;
	private String matchPercentage;
	private String userReqData;
	private String rawResponse;
	private String createdDate;

	public LogDetailsDto() {}
	public LogDetailsDto(String sourceImgUri, String targetImgUri, String matchPercentage, String userReqData, String rawResponse, String createdDate) {
		this.sourceImgUri = sourceImgUri;
		this.targetImgUri = targetImgUri;
		this.matchPercentage = matchPercentage;
		this.userReqData = userReqData;
		this.rawResponse = rawResponse;
		this.createdDate = createdDate;
	}

	public String getSourceImgUri() {
		return sourceImgUri;
	}

	public void setSourceImgUri(String sourceImgUri) {
		this.sourceImgUri = sourceImgUri;
	}

	public String getTargetImgUri() {
		return targetImgUri;
	}

	public void setTargetImgUri(String targetImgUri) {
		this.targetImgUri = targetImgUri;
	}

	public String getMatchPercentage() {
		return matchPercentage;
	}

	public void setMatchPercentage(String matchPercentage) {
		this.matchPercentage = matchPercentage;
	}

	public String getUserReqData() {
		return userReqData;
	}

	public void setUserReqData(String userReqData) {
		this.userReqData = userReqData;
	}

	public String getRawResponse() {
		return rawResponse;
	}

	public void setRawResponse(String rawResponse) {
		this.rawResponse = rawResponse;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "matchPercentage: {\n\t" + matchPercentage + "},\n" + "createdDate: {\n\t" + createdDate + "},\n"
				+ "sourceImgUri: {\n\t" + sourceImgUri + "},\n" + "targetImgUri: {\n\t" + targetImgUri + "},\n"
				+ "userReqData: {\n\t" + userReqData + "},\n" + "rawResponse: {\n\t" + rawResponse + "}";
	}
}
