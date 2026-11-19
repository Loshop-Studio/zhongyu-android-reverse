package com.google.android.material.canvas;

import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class CanvasCompat {

    public interface CanvasOperation {
        void run(@NonNull Canvas canvas);
    }

    private CanvasCompat() {
    }

    public static int saveLayerAlpha(@NonNull Canvas canvas, @Nullable RectF rectF, int i6) {
        return canvas.saveLayerAlpha(rectF, i6);
    }

    public static int saveLayerAlpha(@NonNull Canvas canvas, float f6, float f7, float f8, float f9, int i6) {
        return canvas.saveLayerAlpha(f6, f7, f8, f9, i6);
    }
}
