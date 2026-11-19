package com.zykj.blackboard.core.canvas.view;

import android.graphics.RectF;

/* loaded from: classes4.dex */
public interface MaskLayer {
    void changeClipRectF(RectF rectF);

    void hide();

    void refresh();

    void show();
}
