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
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Mitologias extends Application {

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

        Label tituloLabel = new Label("MITOLOGIAS BRASILEIRAS");
        tituloLabel.setId("titulo-label");
        vbox.getChildren().add(tituloLabel);

        Image curupiraImage = new Image("file:C:/Users/matheus.fgs/Desktop/FOLCLORE/Imagens/Personagens/Curupira.png");
        ImageView curupiraImageView = new ImageView(curupiraImage);
        curupiraImageView.setFitWidth(100);
        curupiraImageView.setFitHeight(100);
        curupiraImageView.setPreserveRatio(true);
        StackPane curupiraContainer = new StackPane();
        curupiraContainer.getChildren().add(curupiraImageView);
        curupiraContainer.setId("curupira-image");
        curupiraContainer.setPadding(new Insets(10));

        curupiraContainer.setOnMouseClicked(e -> {
            Stage curupiraStage = new Stage();
            Curipira curipira = new Curipira();
            curipira.start(curupiraStage);
            primaryStage.close();
        });

        Image saciImage = new Image("file:C:/Users/matheus.fgs/Desktop/FOLCLORE/Imagens/Personagens/Saci.png");
        ImageView saciImageView = new ImageView(saciImage);
        saciImageView.setFitWidth(100);
        saciImageView.setFitHeight(100);
        saciImageView.setPreserveRatio(true);
        StackPane saciContainer = new StackPane();
        saciContainer.getChildren().add(saciImageView);
        saciContainer.setId("saci-image");
        saciContainer.setPadding(new Insets(10));

        saciContainer.setOnMouseClicked(e -> {
            Stage saciStage = new Stage();
        });

        Image boitataImage = new Image("file:C:/Users/matheus.fgs/Desktop/FOLCLORE/Imagens/Personagens/Boitata.gif");
        ImageView boitataImageView = new ImageView(boitataImage);
        boitataImageView.setFitWidth(100);
        boitataImageView.setFitHeight(100);
        boitataImageView.setPreserveRatio(true);
        StackPane boitataContainer = new StackPane();
        boitataContainer.getChildren().add(boitataImageView);
        boitataContainer.setId("boitata-image");
        boitataContainer.setPadding(new Insets(10));

        boitataContainer.setOnMouseClicked(e -> {
            Stage boitataStage = new Stage();
        });

        vbox.getChildren().addAll(curupiraContainer, saciContainer, boitataContainer);

        folclore.setCenter(vbox);

        Button sair = new Button("SAIR");
        sair.setId("sair-button");
        sair.setOnAction(e -> {
            primaryStage.close();
            Stage inicialStage = new Stage();
            TelaInicial telaInicial = new TelaInicial();
            telaInicial.start(inicialStage);
        });

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10));
        hBox.getChildren().add(sair);

        folclore.setBottom(hBox);

        Scene scene = new Scene(folclore, 900, 540);
        scene.getStylesheets().add("/Styles/Mitologias.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}