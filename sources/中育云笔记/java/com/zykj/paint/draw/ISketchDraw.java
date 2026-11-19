package com.zykj.paint.draw;

import android.graphics.Canvas;

/* loaded from: classes6.dex */
public interface ISketchDraw {
    void cleanAll();

    void draw(Canvas canvas);

    boolean hasDraw();

    void touchDown(float f10, float f11);

    void touchMove(float f10, float f11);

    void touchUp(float f10, float f11);
}
