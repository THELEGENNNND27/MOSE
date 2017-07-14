package com.Zombs.iodemo;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by John on 7/11/2017.
 */
public class pLAYE {
    Rectangle bounds;
    double vx, vy;
    int speed;
    int accel;
    public int x;

    public pLAYE(){
        bounds = new Rectangle(20, 20, 10, 10);
        vx = 0;
        vy = 0;
        speed = 3;
        accel = 1;
    }
    public void draw(Graphics g){
        g.setColor(Color.MAGENTA);
        g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
    }
    public void move(ArrayList<String> dirs){
        for (int i = 0; i < dirs.size(); i++) {
            if(dirs.get(i).equals("up")){
                vy -= accel;
            }
            if(dirs.get(i).equals("down")) {
                vy += accel;
            }
            if(dirs.get(i).equals("left")) {
                vx -= accel;
            }
            if(dirs.get(i).equals("right")) {
                vx += accel;
            }

        }
        if (vx > speed){
            vx = speed;
        }
        if (vx < -speed){
            vx = -speed;
        }
        if (vy > speed){
            vy = speed;
        }
        if (vy < -speed){
            vy = -speed;
        }
        bounds.x += (int) vx;
        bounds.y += (int) vy;
        vx *= 0.9;
        vy *= 0.9;

    }
    public Rectangle getBounds(){
        return bounds;
    }

    public void hit() {

    }
}