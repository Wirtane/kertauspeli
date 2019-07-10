
package kertauspeli;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;

public class Kayttoliittyma extends Application{
    
    public void suorita(){
        launch(Kayttoliittyma.class);
    }
    public void start(Stage softa){
        Logiikka log = new Logiikka();
        
        GridPane asettelu = new GridPane();
        asettelu.setPrefSize(360, 240);
        
        
        HBox laatikko = new HBox();
        
        Button haeSelite = new Button("hae selitys");
        Label selitys = new Label("LAABELI");
        
        laatikko.getChildren().addAll(haeSelite, selitys);
        asettelu.setAlignment(Pos.CENTER);
        asettelu.setVgap(10);
        asettelu.setHgap(10);
        
        asettelu.getChildren().add(laatikko);
        
        Scene naky = new Scene(asettelu);
        
        softa.setScene(naky);
        softa.show();
    }
}
