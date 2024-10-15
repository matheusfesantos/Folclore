import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Sobre extends Application {

    public void start(Stage primaryStage) {
        primaryStage.setTitle("FOLCLORE SHARE");
        primaryStage.getIcons().add(new Image(getClass().getResource("/Imagens/LogoJanela.jpg").toExternalForm()));

        BorderPane TelaSobre = new BorderPane();
        TelaSobre.setStyle("-fx-background-image: url('file:C:/Users/matheus.fgs/Desktop/FOLCLORE/Imagens/FlorestBackground.gif');" +
                "-fx-background-size: cover;");

        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(20));

        String descricaoText = "O objeto do 'FOLCLORE SHARE' é divulgar a nossa cultura e mitologias " +
                "ligadas a nossa cultura. O 'SHARE' do nome é o nosso objetivo com você, " +
                "que você compartilhe e mostre as e se aprofunde nas diferenças mitologias brasileiras.";

        Label descricaoLabel = new Label(descricaoText);
        descricaoLabel.getStyleClass().add("descricao-label");
        descricaoLabel.setWrapText(true);
        descricaoLabel.setPrefWidth(800);

        vbox.getChildren().add(descricaoLabel);

        vbox.setSpacing(200);

        Button sair = new Button("SAIR");
        sair.setId("sair-button");

        sair.setOnAction(e -> {
            primaryStage.close();
            Stage inicialStage = new Stage();
            TelaInicial telaInicial = new TelaInicial();
            telaInicial.start(inicialStage);
        });

        vbox.getChildren().add(sair);

        TelaSobre.setCenter(vbox);

        HBox footer = new HBox(10);
        footer.setAlignment(Pos.CENTER);
        footer.setPadding(new Insets(10));
        footer.setId("footer");

        Label rodapeLabel = new Label("By Matheus Ferreira");
        rodapeLabel.setId("rodape-label");

        footer.getChildren().addAll(rodapeLabel);
        TelaSobre.setBottom(footer);

        Scene scene = new Scene(TelaSobre, 900, 540);
        scene.getStylesheets().add(getClass().getResource("/Styles/Sobre.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}