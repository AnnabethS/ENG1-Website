package io.github.annabeths;

import com.badlogic.gdx.graphics.g2d.Sprite;

public interface GameObject {
    //every GameObject needs to have these values, and define these methods

    int x = 0;
    int y = 0;
    float rotation = 0;
    Sprite sprite = null;    

    void Update(float delta);

    void Draw();
}
