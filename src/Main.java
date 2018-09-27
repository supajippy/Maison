import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.geom.QuadCurve2D;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        primaryStage.setWidth(800);
        primaryStage.setHeight(400);
        primaryStage.setResizable(false);
        primaryStage.show();


        primaryStage.setScene(new Scene(dessin()));
        primaryStage.show();

    }


    public Group dessin() {
        Oiseau oiseau1=new Oiseau();
        Group oisadjf=oiseau1.createoiseaux();
        Group fond = fond();
        Soleil soleil=new Soleil();
        Group pingpont = soleil.rotatesoleil();
        Maison maison = new Maison();
        Group   okasdof= maison.Maisons();
        Étoiles star= new Étoiles();
        Group start=star.nuitétoilée();
        Lune lune=new Lune();
        Group luneasd=lune.créerlune();
        Text jour= new Text(170,350,"Jour");
        Text nuit= new Text(570,350,"Nuit");
        Font f= Font.font("Times New Roman",40);
        jour.setFont(f);
        nuit.setFont(f);
        nuit.setFill(Color.WHITE);



        return new Group(fond,oisadjf,pingpont,okasdof,start,luneasd,jour,nuit);
    }




    public Group fond(){
        Rectangle rect1=new Rectangle(0,0,800,400);
        rect1.setFill(Color.BLACK);
        Rectangle rect2=new Rectangle(0,0,400,390);
        rect2.setFill(Color.LIGHTGRAY);
        return new Group(rect1,rect2);
    }




}
