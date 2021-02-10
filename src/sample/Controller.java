package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Controller {

    @FXML
    ImageView heartImage;
    @FXML
    Button button;
    @FXML
    AnchorPane pane;
    @FXML
    TextField textInput;
    @FXML
    Text outputText;


    public void enter() throws MalformedURLException {


        if (textInput.getText().equals("yes")) {
            outputText.setText("correct");
            pane.setStyle("-fx-background-color: #1dff00;");
            Image image = new Image(String.valueOf(new URL("https://www.pikpng.com/pngl/b/564-5646680_fteemojis-emoji-wink-flirty-romantic-emojis-clipart.png")));
            heartImage.setImage(image);
            heartImage.setVisible(true);
        } else if (textInput.getText().equals("no")){
            outputText.setText("Incorrect");
            pane.setStyle("-fx-background-color: #ff0000;");
            Image image = new Image(String.valueOf(new URL("https://cdn.shopify.com/s/files/1/1061/1924/products/Very_Angry_Emoji_7f7bb8df-d9dc-4cda-b79f-5453e764d4ea_large.png?v=1571606036")));
            heartImage.setImage(image);
            heartImage.setVisible(true);
        }else{
            outputText.setText("Please enter either 'yes' or 'no'");
            pane.setStyle("-fx-background-color: #b500ff;");
            Image image = new Image(String.valueOf(new URL("https://www.clipartmax.com/png/full/44-447225_confused-emoji-clipart-confused-emoticons.png")));
            heartImage.setImage(image);
            heartImage.setVisible(true);


        }

    }


}
