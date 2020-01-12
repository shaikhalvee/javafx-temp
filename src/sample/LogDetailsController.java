package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Window;
import sample.util.AlertHelper;
import sample.util.HandleHttpConnection;
import sample.util.LogDetailsDto;

public class LogDetailsController {

	@FXML
	public TextField systemReferenceId;

	@FXML
	public Button searchButton;

	@FXML
	public TextField createdDate;

	@FXML
	public TextField sourceImgUri;

	@FXML
	public TextField targetImgUri;

	@FXML
	public TextField matchPercentage;

	@FXML
	public TextArea userReqData;

	@FXML
	public TextArea rawResponse;

	@FXML
	protected void handleSubmitButtonAction(ActionEvent actionEvent) {
		Window owner = searchButton.getScene().getWindow();
		if (systemReferenceId.getText().isEmpty()) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Error!",
					"Please enter System Reference Id.");
			return;
		}

		String systemRefId = systemReferenceId.getText();
		HandleHttpConnection handleHttpConnection = new HandleHttpConnection();
		LogDetailsDto logDetailsDto = handleHttpConnection.getResponse(systemRefId);

		createdDate.setText(logDetailsDto.getCreatedDate());
		matchPercentage.setText(logDetailsDto.getMatchPercentage() + " %");
		sourceImgUri.setText(logDetailsDto.getSourceImgUri());
		targetImgUri.setText(logDetailsDto.getTargetImgUri());
		rawResponse.setText(logDetailsDto.getRawResponse());
		userReqData.setText(logDetailsDto.getUserReqData());

	}
}
