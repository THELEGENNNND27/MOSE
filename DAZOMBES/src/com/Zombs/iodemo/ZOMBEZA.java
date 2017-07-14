package com.Zombs.iodemo;

import java.awt.*;
public class ZOMBEZA {
    int speed;
    Rectangle bounds;

    public ZOMBEZA(Rectangle bounds){
        this.bounds = bounds;
        speed = 1;

    }

    public void draw(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
    }
    public void move(pLAYE player){
        Rectangle pBounds = player.getBounds();
        if (bounds.x > player.getBounds().x){
            bounds.x -= speed;
        }
        if (bounds.x < player.getBounds().x){
            bounds.x += speed;
        }
        if (bounds.y < player.getBounds().y){
            bounds.y += speed;
        }
        if (bounds.y > player.getBounds().y){
            bounds.y -= speed;
        }
    }
    private void act(pLAYE player){
        if(contains(player.bounds)){
            player.hit();
        }
    }
    public boolean contains(Rectangle rectangle){
        return bounds.intersects(rectangle);
    }

}