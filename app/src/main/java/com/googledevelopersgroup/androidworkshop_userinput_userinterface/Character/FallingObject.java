package com.googledevelopersgroup.androidworkshop_userinput_userinterface.Character;

import android.graphics.Canvas;

public interface FallingObject extends GameCharacter {
    void setyVelocity(int yVelocity);
    void setFallingObjListener(FallingObjectListener listener);
}
interface FallingObjectListener{
    void onDestroyed(FallingObject fallingObject);
}
