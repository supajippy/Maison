import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.QuadCurve;
import javafx.util.Duration;

public class Oiseau extends Group {



    public Group createoiseaux() {

        QuadCurve quad1= new QuadCurve(25,100,40,75,55,100);
        quad1.setFill(Color.TRANSPARENT);
        quad1.setStroke(Color.BLACK);

        QuadCurve quad2= new QuadCurve(55,100,70,75,85,100);
        quad2.setFill(Color.TRANSPARENT);
        quad2.setStroke(Color.BLACK);


        QuadCurve quad3= new QuadCurve(165,50,180,25,195,50);
        quad3.setFill(Color.TRANSPARENT);
        quad3.setStroke(Color.BLACK);

        QuadCurve quad4= new QuadCurve(195,50,210,25,225,50);
        quad4.setFill(Color.TRANSPARENT);
        quad4.setStroke(Color.BLACK);

        //Aile de gauche
        KeyValue kv1= new KeyValue(quad1.startYProperty(),92);
        KeyFrame kf1= new KeyFrame(Duration.seconds(1),kv1);
        KeyValue kv2= new KeyValue(quad1.controlYProperty(),80);
        KeyFrame kf2= new KeyFrame(Duration.seconds(1),kv2);
        KeyValue kv5= new KeyValue(quad1.endYProperty(),98);
        KeyFrame kf5= new KeyFrame(Duration.seconds(1),kv5);
        //Aile de droite
        KeyValue kv3= new KeyValue(quad2.startYProperty(),98);
        KeyFrame kf3= new KeyFrame(Duration.seconds(1),kv3);
        KeyValue kv4= new KeyValue(quad2.controlYProperty(),80);
        KeyFrame kf4= new KeyFrame(Duration.seconds(1),kv4);
        KeyValue kv6= new KeyValue(quad2.endYProperty(),92);
        KeyFrame kf6= new KeyFrame(Duration.seconds(1),kv6);

        KeyValue kv7= new KeyValue(quad3.startYProperty(),42);
        KeyFrame kf7= new KeyFrame(Duration.seconds(1),kv7);
        KeyValue kv8= new KeyValue(quad3.controlYProperty(),20);
        KeyFrame kf8= new KeyFrame(Duration.seconds(1),kv8);
        KeyValue kv9= new KeyValue(quad3.endYProperty(),47);
        KeyFrame kf9= new KeyFrame(Duration.seconds(1),kv9);

        KeyValue kv10= new KeyValue(quad4.endYProperty(),42);
        KeyFrame kf10= new KeyFrame(Duration.seconds(1),kv10);
        KeyValue kv11= new KeyValue(quad4.controlYProperty(),20);
        KeyFrame kf11= new KeyFrame(Duration.seconds(1),kv11);
        KeyValue kv12= new KeyValue(quad4.startYProperty(),47);
        KeyFrame kf12= new KeyFrame(Duration.seconds(1),kv12);
        //Aile de droite oiseau gauche

        Timeline timeline= new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);
        timeline.getKeyFrames().addAll(kf1,kf2,kf3,kf4,kf5,kf6,kf7,kf8,kf9,kf10,kf11,kf12);
        timeline.play();
        return new Group(quad1,quad2,quad3,quad4);
    }
}
