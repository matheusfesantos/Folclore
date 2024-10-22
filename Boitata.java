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
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Boitata extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("FOLCLORE SHARE");
        primaryStage.getIcons().add(new Image(getClass().getResource("/Imagens/LogoJanela.jpg").toExternalForm()));

        BorderPane folclore = new BorderPane();
        folclore.setStyle("-fx-background-image: url('file:C:/Users/matheus.fgs/Desktop/FOLCLORE/Imagens/FlorestBackground.gif');" +
                "-fx-background-size: cover;");

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);
        vbox.setId("VBOX");

        Label tituloLabel = new Label("BOITATA");
        tituloLabel.setId("titulo-label-boitata");
        vbox.getChildren().addAll(tituloLabel);

        Image curupiraImage = new Image("file:C:/Users/matheus.fgs/Desktop/FOLCLORE/Imagens/Personagens/Boitata.gif");
        ImageView curupiraImageView = new ImageView(curupiraImage);
        curupiraImageView.setFitWidth(100);
        curupiraImageView.setFitHeight(100);
        curupiraImageView.setPreserveRatio(true);

        StackPane curupiraContainer = new StackPane();
        curupiraContainer.getChildren().add(curupiraImageView);
        curupiraContainer.setId("curupira-image");
        curupiraContainer.setPadding(new Insets(10));

        vbox.getChildren().addAll(curupiraContainer);

        Label historia = new Label(
                "O Boitatá é uma lenda do folclore brasileiro, conhecido como uma serpente de fogo que protege as florestas e campos\n" +
                        "dos invasores. Ele é descrito como um espírito brilhante que percorre os campos à noite, assustando aqueles que\n" +
                        "tentam destruir a natureza com incêndios. Seu corpo luminoso serpenteia pelo ar, criando um espetáculo assustador\n" +
                        "e fascinante. O Boitatá não é uma criatura maligna, mas sim um defensor feroz do meio ambiente. Ele persegue\n" +
                        "aqueles que ateiam fogo à mata, devolvendo as chamas com grande intensidade. Sua luz ofuscante é tanto uma\n" +
                        "advertência quanto uma punição para os que desrespeitam a natureza. Assim como o Curupira, o Boitatá é um símbolo\n" +
                        "de resistência, uma manifestação da fúria da terra contra a destruição e a falta de respeito pelo equilíbrio\n" +
                        "ambiental."
        );
        historia.setId("historia");
        vbox.getChildren().add(historia);

        folclore.setCenter(vbox);

        Button sair = new Button("SAIR");
        sair.setId("sair-button");
        sair.setOnAction(e -> {
            Stage mitologiasStage = new Stage();
            Mitologias mitologias = new Mitologias();
            mitologias.start(mitologiasStage);
            primaryStage.close();
        });

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10));
        hBox.getChildren().add(sair);

        folclore.setBottom(hBox);

        Scene scene = new Scene(folclore, 900, 540);
        scene.getStylesheets().add("/Styles/Historias.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}