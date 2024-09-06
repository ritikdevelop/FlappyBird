import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class FlappyBird extends JPanel{
   int boardHeight=640;
   int boardWidth=360;

   FlappyBird(){
    setPreferredSize(new Dimension(boardWidth, boardHeight));
    setBackground(Color.blue);
   }
}