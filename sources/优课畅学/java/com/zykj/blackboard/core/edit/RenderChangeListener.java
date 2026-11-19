package com.zykj.blackboard.core.edit;

import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: classes4.dex */
public interface RenderChangeListener {
    void onCameraChange(Matrix matrix);

    void onRenderChange(RectF rectF, RectF rectF2);
}
