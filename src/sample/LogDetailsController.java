package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Window;

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

	protected void handleSubmitButtonAction(ActionEvent actionEvent) {
		Window owner = searchButton.getScene().getWindow();
		if (systemReferenceId.getText().isEmpty()) {
			AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Error!",
					"Please enter System Reference Id.");
			return;
		}

	}
}
