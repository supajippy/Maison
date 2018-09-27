import javafx.animation.FillTransition;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class Soleil extends Group

{
    public Group rotatesoleil() {


        Group soleil = createsoleil();
        RotateTransition trans = new RotateTransition(Duration.seconds(4), soleil);
        trans.setByAngle(360);
        trans.setCycleCount(Timeline.INDEFINITE);
        trans.setAutoReverse(false);
        trans.play();
        return new Group(soleil);
    }

    public Group createsoleil() {

        Circle centre = new Circle(325, 85, 30);
        centre.setFill(Color.YELLOW);
        Line lignen = new Line(325, 45, 325, 0);
        lignen.setStroke(Color.YELLOW);
        lignen.setStrokeWidth(1);
        Line lignes = new Line(325, 125, 325, 170);
        lignes.setStroke(Color.YELLOW);
        Line lignee = new Line(360, 85, 405, 85);
        lignee.setStroke(Color.YELLOW);
        Line ligneo = new Line(285, 85, 240, 85);
        ligneo.setStroke(Color.YELLOW);
        Line lignene = new Line(353, 57, 369, 41);
        lignene.setStroke(Color.YELLOW);
        Line ligneno = new Line(297, 57, 281, 41);
        ligneno.setStroke(Color.YELLOW);
        Line ligneso = new Line(297, 113, 281, 129);
        ligneso.setStroke(Color.YELLOW);
        Line lignese = new Line(353, 113, 369, 129);
        lignese.setStroke(Color.YELLOW);

        FillTransition trans = new FillTransition(
                Duration.seconds(5), centre);
        trans.setToValue(Color.SADDLEBROWN);
        trans.setCycleCount(Timeline.INDEFINITE);
        trans.setAutoReverse(true);
        trans.play();


        return new Group(centre, lignen, lignes, lignee, ligneo, lignene, lignese, ligneno, ligneso);
    }
}
