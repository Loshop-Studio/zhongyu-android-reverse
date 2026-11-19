package com.zykj.blackboard.core.canvas.view;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* loaded from: classes4.dex */
public interface FixLayer {
    void draw(Bitmap bitmap);

    Rect rect();

    void refresh();

    void reset();
}
