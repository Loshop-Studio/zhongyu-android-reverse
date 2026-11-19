package com.zykj.blackboard.core.graph.group;

import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: classes4.dex */
public interface IChangeField {
    void changeOriginalRectF(RectF rectF);

    void changeRenderMatrix(Matrix matrix);

    void changeUpdate(boolean z10);
}
