package com.zykj.blackboard.core.canvas.view;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes4.dex */
public interface ActiveLayer {
    void clear();

    void draw(Bitmap bitmap, Matrix matrix);

    void draw(Path path, Paint paint, Matrix matrix);

    void refresh();
}
