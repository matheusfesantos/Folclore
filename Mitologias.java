import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Mitologias extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("FOLCLORE SHARE");
        primaryStage.getIcons().add(new Image(getClass().getResource("/Imagens/LogoJanela.jpg").toExternalForm()));

        BorderPane folclore = new BorderPane();
        folclore.setStyle("-fx-background-image: url('file:C:/Users/matheus.fgs/Desktop/FOLCLORE/Imagens/FlorestBackground.gif');" +
                "-fx-background-size: cover;");

        GridPane grid = new GridPane();
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setPadding(new Insets(20));
        grid.setAlignment(Pos.CENTER);

        Label tituloLabel = new Label("MITOLOGIAS BRASILEIRAS");
        tituloLabel.setId("titulo-label");
        folclore.setTop(tituloLabel);
        BorderPane.setAlignment(tituloLabel, Pos.CENTER);

        // Curupira
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
        grid.add(curupiraContainer, 0, 0);

        // Saci
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
            Saci saci = new Saci();
            saci.start(saciStage);
            primaryStage.close();
        });
        grid.add(saciContainer, 1, 0);

        // Boitata
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
            Boitata boitata = new Boitata();
            boitata.start(boitataStage);
            primaryStage.close();
        });
        grid.add(boitataContainer, 2, 0);

        // Iara
        Image iaraImage = new Image("file:C:/Users/matheus.fgs/Desktop/FOLCLORE/Imagens/Personagens/Iara.png");
        ImageView iaraImageView = new ImageView(iaraImage);
        iaraImageView.setFitWidth(100);
        iaraImageView.setFitHeight(100);
        iaraImageView.setPreserveRatio(true);
        StackPane iaraContainer = new StackPane();
        iaraContainer.getChildren().add(iaraImageView);
        iaraContainer.setId("iara-image");
        iaraContainer.setPadding(new Insets(10));
        iaraContainer.setOnMouseClicked(e -> {
            Stage iaraStage = new Stage();
            //Iara iara = new Iara();
            //iara.start(iaraStage);
            primaryStage.close();
        });
        grid.add(iaraContainer, 3, 0);

        folclore.setCenter(grid);

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