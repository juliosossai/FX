package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    /*public void start(Stage palco) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        palco.setTitle("Hello World");
        palco.setScene(new Scene(root, 300, 275));
        palco.show();
    }*/
    public void start(Stage palco) throws Exception{
        AnchorPane janela = new AnchorPane();
        palco.setTitle("Estudo 1");
        VBox box = new VBox();
        box.setVgrow(janela, Priority.ALWAYS);

        Label lblValorA = new Label("Valor A:");
        TextField edtValorA = new TextField();

        Label lblValorB = new Label("Valor B:");
        TextField edtValorB = new TextField();

        box.getChildren().add(lblValorA);
        box.getChildren().add(edtValorA);
        box.getChildren().add(lblValorB);
        box.getChildren().add(edtValorB);

        Label lblResultado = new Label();
        Button btnSoma = new Button("Soma");
        Button btnSubtracao = new Button("Subtrair");

        HBox botao = new HBox();
        botao.getChildren().add(btnSoma);
        botao.getChildren().add(btnSubtracao);

        box.getChildren().add(botao);
        box.getChildren().add(lblResultado);


        btnSoma.setOnAction(action -> {
            Double vlA = Double.parseDouble(edtValorA.textProperty().getValue());
            Double vlB = Double.parseDouble(edtValorB.textProperty().getValue());
            Double x = vlA + vlB;
            lblResultado.textProperty().setValue(x.toString());
        });

        btnSubtracao.setOnAction(action -> {
            Double vlA = Double.parseDouble(edtValorA.textProperty().getValue());
            Double vlB = Double.parseDouble(edtValorB.textProperty().getValue());
            Double x = vlA - vlB;
            lblResultado.textProperty().setValue(x.toString());
        });

        janela.getChildren().add(box);




        palco.setScene(new Scene(janela, 300, 275));
        palco.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
