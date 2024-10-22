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

public class Saci extends Application {

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

        Label tituloLabel = new Label("SACI");
        tituloLabel.setId("titulo-label-saci");
        vbox.getChildren().addAll(tituloLabel);

        Image curupiraImage = new Image("file:C:/Users/matheus.fgs/Desktop/FOLCLORE/Imagens/Personagens/Saci.png");
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
                "O Saci-Pererê é uma das figuras mais travessas e encantadoras do folclore brasileiro. Ele é representado como um\n" +
                        "menino negro, de uma perna só, que usa um gorro vermelho mágico. Famoso por suas brincadeiras e travessuras, o Saci\n" +
                        "aparece em redemoinhos de vento, pregando peças nos desavisados. Ele esconde objetos, atrapalha tarefas domésticas\n" +
                        "e prega peças em viajantes. Apesar de suas travessuras, o Saci não é um ser mal-intencionado. Ele gosta de\n" +
                        "brincadeiras, mas também ajuda aqueles que o tratam com respeito. A lenda do Saci ensina sobre o valor da\n" +
                        "esperteza e da malícia, além de destacar o respeito pelas forças da natureza. Com seu gorro vermelho, o Saci\n" +
                        "mantém o controle de suas travessuras e guarda segredos da mata, sendo um personagem amado e temido ao mesmo tempo."
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