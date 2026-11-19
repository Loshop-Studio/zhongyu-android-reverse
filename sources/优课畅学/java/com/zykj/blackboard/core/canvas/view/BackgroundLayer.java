package com.zykj.blackboard.core.canvas.view;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.zykj.blackboard.bean.BackgroundLineConfig;

/* loaded from: classes4.dex */
public interface BackgroundLayer {

    public static final class DefaultImpls {
        public static /* synthetic */ void drawBackground$default(BackgroundLayer backgroundLayer, Canvas canvas, Matrix matrix, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawBackground");
            }
            if ((i10 & 2) != 0) {
                matrix = new Matrix();
            }
            backgroundLayer.drawBackground(canvas, matrix);
        }
    }

    void drawBackground(Canvas canvas, Matrix matrix);

    BackgroundLineConfig getBackgroundLineConfig();

    int getMyBackgroundColor();

    void refresh();

    void setBackgroundLineConfig(BackgroundLineConfig backgroundLineConfig);

    void setMatrix(Matrix matrix);

    void setMyBackgroundColor(int i10);
}
