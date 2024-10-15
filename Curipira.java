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

public class Curipira extends Application {

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

        Label tituloLabel = new Label("CURUPIRA");
        tituloLabel.setId("titulo-label");
        vbox.getChildren().addAll(tituloLabel);

        Image curupiraImage = new Image("file:C:/Users/matheus.fgs/Desktop/FOLCLORE/Imagens/Personagens/Curupira.png");
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
                "O Curupira é uma figura icônica do folclore brasileiro. Ele é o protetor das florestas, descrito como um ser de\n" +
                        "estatura baixa. Possui cabelos vermelhos e pés virados para trás, o que lhe confere um aspecto singular. Suas\n" +
                        "travessuras são conhecidas por confundir caçadores e desorientar aqueles que tentam invadir o seu território.\n" +
                        "O Curupira é um guardião da natureza, usando truques e armadilhas para proteger os animais e as plantas da\n" +
                        "floresta. Ele se comunica com os seres da mata, e seu assovio ecoa, reverberando entre as árvores, como um\n" +
                        "aviso para os invasores. Apesar de sua aparência assustadora, o Curupira é justo e ajuda aqueles que respeitam\n" +
                        "a floresta e suas criaturas. Ele é uma representação da sabedoria e da resistência da natureza, sempre pronto\n" +
                        "para defender seu lar e garantir que os ecossistemas continuem a florir. O Curupira é um símbolo da luta\n" +
                        "contra a destruição ambiental e a exploração desenfreada, e seu legado continua a inspirar as novas gerações\n" +
                        "a valorizar e proteger a biodiversidade do Brasil."
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