import javafx.scene.Group;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class Maison extends Group {
    public Group maison(){

        Rectangle rect1=new Rectangle(170,230,80,60);
        rect1.setFill(Color.BEIGE);
        DropShadow ds = new DropShadow(20,-10,10,Color.BLACK);
        rect1.setEffect(ds);
        Rectangle porte=new Rectangle(180,255,20,35);
        porte.setFill(Color.SADDLEBROWN);
        Circle poignee= new Circle(195,272,4);
        poignee.setFill(Color.YELLOWGREEN);
        Polygon toit= new Polygon(165,230,210,170,255,230);
        toit.setFill(Color.BROWN);
        Rectangle fenetre= new Rectangle (210,255,30,20);
        fenetre.setFill(Color.YELLOWGREEN);
        Group carré1=rectfenetre();
        Group carré2=rectfenetre();
        Group carré3=rectfenetre();
        Group carré4= rectfenetre();
        carré2.setTranslateX(15);
        carré3.setTranslateY(9);
        carré4.setTranslateX(15);
        carré4.setTranslateY(9);

        return new Group(rect1,porte,poignee,toit,fenetre,carré1,carré2,carré3,carré4);
    }
    public Group rectfenetre(){
        Rectangle petit=new Rectangle(212,257,12,7);
        petit.setFill(Color.AQUA);

        return new Group(petit);
    }
    public Group Maisons(){
        Maison maison1=new Maison();
        Group maison121=maison1.maison();
        Maison  maison2=new Maison();
        Group maison211=maison2.maison();
        maison211.setTranslateX(400);


        return new Group(maison121,maison211);
    }
}
