package jp.techacademy.kenichi.abe.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Enemy extends Sprite {

    // 横幅、高さ
    public static final float ENEMY_WIDTH = 1.0f;
    public static final float ENEMY_HEIGHT = 1.0f;

    // 状態
    //public static final int ENEMY_EXIST = 0;
    //public static final int ENEMY_NONE = 1;

    //int mState;

    //コンストラクタ
    public Enemy(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT);
        //mState = ENEMY_EXIST;
    }
}