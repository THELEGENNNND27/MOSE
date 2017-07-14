package com.Zombs.iodemo;
import com.sun.org.apache.regexp.internal.RE;
import javafx.stage.Screen;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Time;
import java.util.*;

public class Client extends JApplet implements KeyListener {
    private Graphics bg;
    private Image OffScreen;
    private pLAYE ASDFGHJKL;
    ArrayList<String> dirs;
    ArrayList<ZOMBEZA> ZXCVBNM;

    public void init() {
        Rectangle Screen = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        OffScreen = createImage(Screen.width, Screen.height);
        bg = OffScreen.getGraphics();
        addKeyListener((KeyListener) this);
        ASDFGHJKL = new pLAYE();
        ZXCVBNM = new ArrayList<ZOMBEZA>();
        for (int i = 0; i < 5; i++){
            ZXCVBNM.add(new ZOMBEZA(new Rectangle(Math.random().screen.width)), ne);
        }
        setFocusable(true);
        super.init();
        dirs = new ArrayList<>();
        Timer timer = new Timer(10, ae-> {
            ASDFGHJKL.move(dirs);
            repaint();

        });
        timer.start();
    }

    public void paint(Graphics g){
        bg.clearRect(0, 0, OffScreen.getWidth(this), OffScreen.getHeight(this));
        ASDFGHJKL.draw(bg);
        ZXCVBNM.draw(bg);
        g.drawImage(OffScreen, 0, 0, this);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 't' && !dirs.contains("up")){
            dirs.add("up");
        }

        if (e.getKeyChar() == 'g' && !dirs.contains("down")){
            dirs.add("down");
        }

        if (e.getKeyChar() == 'f' && !dirs.contains("left")){
            dirs.add("left");
        }

        if (e.getKeyChar() == 'h' && !dirs.contains("right")){
            dirs.add("right");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyChar() == 't'){
            dirs.remove("up");
        }

        if (e.getKeyChar() == 'g'){
            dirs.remove("down");
        }

        if (e.getKeyChar() == 'f'){
            dirs.remove("left");
        }

        if (e.getKeyChar() == 'h'){
            dirs.remove("right");
        }
    }
}