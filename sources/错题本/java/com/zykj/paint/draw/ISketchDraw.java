package com.zykj.paint.draw;

import android.graphics.Canvas;

/* loaded from: classes3.dex */
public interface ISketchDraw {
    void cleanAll();

    void draw(Canvas canvas);

    boolean hasDraw();

    void touchDown(float f, float f7);

    void touchMove(float f, float f7);

    void touchUp(float f, float f7);
}
