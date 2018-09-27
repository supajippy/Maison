import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;

public class Lune extends Group{

    public Group créerlune() {
        Circle lune = new Circle(725, 80, 30);
        lune.setFill(Color.WHITE);

        Stop[] stops= new Stop[]{
                new Stop(0,Color.WHITE),
                new Stop(1,Color.BLACK),
        };

        LinearGradient dégradé= new LinearGradient(
                0,0,
                1,1,
                true,
                CycleMethod.NO_CYCLE,
                stops);
        lune.setFill(dégradé);



        return new Group(lune);
    }

}
