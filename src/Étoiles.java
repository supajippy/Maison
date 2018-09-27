import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;

public class Étoiles extends Group {

    public Group créeretoile() {

        Polygon etoile = new Polygon(75, 19, 86, 36, 63, 25, 87, 25, 64, 36, 75, 19);
        etoile.setFill(Color.YELLOW);
        etoile.setTranslateX(400);

        return new Group(etoile);
    }
    public Group nuitétoilée(){

        Group etoile1=créeretoile();

        FadeTransition fade=new FadeTransition(Duration.seconds(2),etoile1);
        fade.setFromValue(1.0);
        fade.setToValue(0);
        fade.setCycleCount(Timeline.INDEFINITE);
        fade.setAutoReverse(true);
        fade.play();


        Group etoile2=créeretoile();

        etoile2.setTranslateX(40);
        etoile2.setTranslateY(40);
        etoile2.setScaleX(.7);
        etoile2.setScaleY(.7);
        FadeTransition fade2=new FadeTransition(Duration.seconds(3),etoile2);
        fade2.setFromValue(1.0);
        fade2.setToValue(0);
        fade2.setCycleCount(Timeline.INDEFINITE);
        fade2.setAutoReverse(true);
        fade2.play();

        Group etoile3= créeretoile();
        etoile3.setTranslateX(140);
        etoile3.setTranslateY(80);
        etoile3.setScaleX(1.8);
        etoile3.setScaleY(1.8);
        FadeTransition fade3=new FadeTransition(Duration.seconds(1),etoile3);
        fade3.setFromValue(1.0);
        fade3.setToValue(0);
        fade3.setCycleCount(Timeline.INDEFINITE);
        fade3.setAutoReverse(true);
        fade3.play();

        Group etoile4= créeretoile();
        etoile4.setTranslateX(80);
        etoile4.setTranslateY(20);
        etoile4.setScaleX(.9);
        etoile4.setScaleY(.9);
        FadeTransition fade4=new FadeTransition(Duration.seconds(2),etoile4);
        fade4.setFromValue(1.0);
        fade4.setToValue(0);
        fade4.setCycleCount(Timeline.INDEFINITE);
        fade4.setAutoReverse(true);
        fade4.play();



        return new Group(etoile1,etoile2,etoile3,etoile4);
    }
}
