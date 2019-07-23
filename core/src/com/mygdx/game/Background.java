package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Background {

    class BGPicture{
        private Texture backgroundImage;
        private Vector2 backgroundPosition;

        public BGPicture(Vector2 pos){
            backgroundImage=new Texture("back.png");
            backgroundPosition=pos;
        }
    }

    private BGPicture [] backs;
   private int speed;

   public Background(){
     backs=new BGPicture[2];
     backs[0]=new BGPicture(new Vector2(0,0));
     backs[1]=new BGPicture(new Vector2(800,0));
     speed=4;
 }
    public void render(SpriteBatch spriteBatch){
       for (int i=0;i<backs.length;i++){
           spriteBatch.draw(backs[i].backgroundImage,backs[i].backgroundPosition.x,backs[i].backgroundPosition.y);
        }
    }
    public void update(){
       for(int i=0;i<backs.length;i++) {
           backs[i].backgroundPosition.x -= speed;
       }
           if(backs[0].backgroundPosition.x<- 800){
               backs[0].backgroundPosition.x=0;
               backs[1].backgroundPosition.x=800;
           }

    }
}
