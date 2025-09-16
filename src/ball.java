import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyAdapter;
import java.util.*;
import javax.swing.*;

public class ball extends Rectangle {

    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed = 2 ;

    ball(int x, int y, int width, int height){
       super(x,y,width,height);
       random = new Random();
       int randomXDirection = random.nextInt(2);
        if (randomXDirection ==0)
        randomXDirection--;
        setXDirection(randomXDirection*initialSpeed);

        int randomYDirection = random.nextInt(2);
       if (randomYDirection ==0)
       randomYDirection--;
       setYDirection(randomYDirection*initialSpeed);




    }
    public void setXDirection(int randomXDirection){
        xVelocity = randomXDirection;
    }
    public void setYDirection(int randomYDirection){
        yVelocity = randomYDirection;
    }
    public void move(){
        x += xVelocity;
        y += yVelocity;

    }
    public void draw(Graphics g){

        g.setColor(Color.white);
        g.fillOval(x, y, width, height);

    }
    public void start(){


    }
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode()== (KeyEvent.VK_SPACE)){
            setXDirection(xVelocity=0);
            setYDirection(yVelocity=0);
            move();
            }
         if(e.getKeyCode()== (KeyEvent.VK_ENTER)){
                setXDirection(xVelocity = 2);
                setYDirection(yVelocity = 2);
                move();
                }

    
}
}
