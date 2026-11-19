package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.collection.ScatterMapKt;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* loaded from: classes3.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {
    S spec;

    public static class ActiveIndicator {

        @ColorInt
        int color;

        @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN)
        float endFraction;

        @Px
        int gapSize;

        @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN)
        float startFraction;
    }

    public DrawingDelegate(S s6) {
        this.spec = s6;
    }

    public abstract void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = -1.0d, m58to = Contrast.RATIO_MIN) float f6, boolean z6, boolean z7);

    public abstract void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i6, @IntRange(from = 0, m59to = ScatterMapKt.Sentinel) int i7);

    public abstract void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull ActiveIndicator activeIndicator, @IntRange(from = 0, m59to = ScatterMapKt.Sentinel) int i6);

    public abstract void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float f6, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float f7, @ColorInt int i6, @IntRange(from = 0, m59to = ScatterMapKt.Sentinel) int i7, @Px int i8);

    public abstract int getPreferredHeight();

    public abstract int getPreferredWidth();

    public void validateSpecAndAdjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float f6, boolean z6, boolean z7) {
        this.spec.validateSpec();
        adjustCanvas(canvas, rect, f6, z6, z7);
    }
}
