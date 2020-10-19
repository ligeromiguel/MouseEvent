/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MouseEvent;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MouseEventDemo extends Application {
    
    //Variables de coordenadas
    private double startdragX;
    private double startdragY;

    @Override
public void start(Stage primaryStage){
    
    //Declaración del Layout y Componentes
    StackPane root = new StackPane();
    Label t1 = new Label("Programming is fun");

        //Handler Pulsar ratón
         t1.setOnMousePressed(e-> {
            startdragX=t1.getLayoutX();
            startdragY=t1.getLayoutY();
        });
         
        //Handler Soltar ratón
        t1.setOnMouseDragged(e-> {
           t1.setTranslateX(e.getSceneX()-startdragX);
           t1.setTranslateY(e.getSceneY()-startdragY);
        });

  
    root.getChildren().add(t1);
    Scene scene = new Scene(root,400,150);
    primaryStage.setScene(scene);
    primaryStage.setTitle("MouseEventDemo");
    primaryStage.show();
    
    };
}

