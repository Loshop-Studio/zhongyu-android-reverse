package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.camera.video.AudioStats;
import androidx.collection.ScatterMapKt;
import androidx.compose.material3.AbstractC1923c;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.math.MathUtils;
import com.google.android.material.progressindicator.DrawingDelegate;
import com.google.android.material.transformation.FabTransformationScrimBehavior;

/* loaded from: classes2.dex */
final class CircularDrawingDelegate extends DrawingDelegate<CircularProgressIndicatorSpec> {
    private static final float ROUND_CAP_RAMP_DOWN_THRESHHOLD = 0.01f;
    private float adjustedRadius;
    private float displayedCornerRadius;
    private float displayedTrackThickness;

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d)
    private float totalTrackLengthFraction;
    private boolean useStrokeCap;

    public CircularDrawingDelegate(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
    }

    private void drawArc(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f7, @ColorInt int i, @Px int i8, @Px int i9) {
        float f8 = f7 >= f ? f7 - f : (f7 + 1.0f) - f;
        float f9 = f % 1.0f;
        if (this.totalTrackLengthFraction < 1.0f) {
            float f10 = f9 + f8;
            if (f10 > 1.0f) {
                drawArc(canvas, paint, f9, 1.0f, i, i8, 0);
                drawArc(canvas, paint, 1.0f, f10, i, 0, i9);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.displayedCornerRadius / this.adjustedRadius);
        if (f9 == 0.0f && f8 >= 0.99f) {
            f8 += (((degrees * 2.0f) / 360.0f) * (f8 - 0.99f)) / 0.01f;
        }
        float fLerp = MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, f9);
        float fLerp2 = MathUtils.lerp(0.0f, this.totalTrackLengthFraction, f8);
        float degrees2 = (float) Math.toDegrees(i8 / this.adjustedRadius);
        float degrees3 = ((fLerp2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i9 / this.adjustedRadius));
        float f11 = (fLerp * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.displayedTrackThickness);
        float f12 = degrees * 2.0f;
        if (degrees3 < f12) {
            float f13 = degrees3 / f12;
            paint.setStyle(Paint.Style.FILL);
            drawRoundedBlock(canvas, paint, (degrees * f13) + f11, this.displayedCornerRadius * 2.0f, this.displayedTrackThickness, f13);
            return;
        }
        float f14 = this.adjustedRadius;
        RectF rectF = new RectF(-f14, -f14, f14, f14);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.useStrokeCap ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f15 = f11 + degrees;
        canvas.drawArc(rectF, f15, degrees3 - f12, false, paint);
        if (this.useStrokeCap || this.displayedCornerRadius <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        drawRoundedBlock(canvas, paint, f15, this.displayedCornerRadius * 2.0f, this.displayedTrackThickness);
        drawRoundedBlock(canvas, paint, (f11 + degrees3) - degrees, this.displayedCornerRadius * 2.0f, this.displayedTrackThickness);
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f7, float f8) {
        drawRoundedBlock(canvas, paint, f, f7, f8, 1.0f);
    }

    private int getSize() {
        S s8 = this.spec;
        return (((CircularProgressIndicatorSpec) s8).indicatorInset * 2) + ((CircularProgressIndicatorSpec) s8).indicatorSize;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float f, boolean z8, boolean z9) {
        float fWidth = rect.width() / getPreferredWidth();
        float fHeight = rect.height() / getPreferredHeight();
        S s8 = this.spec;
        float f7 = (((CircularProgressIndicatorSpec) s8).indicatorSize / 2.0f) + ((CircularProgressIndicatorSpec) s8).indicatorInset;
        canvas.translate((f7 * fWidth) + rect.left, (f7 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (((CircularProgressIndicatorSpec) this.spec).indicatorDirection != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f8 = -f7;
        canvas.clipRect(f8, f8, f7, f7);
        S s9 = this.spec;
        this.useStrokeCap = ((CircularProgressIndicatorSpec) s9).trackThickness / 2 <= ((CircularProgressIndicatorSpec) s9).trackCornerRadius;
        this.displayedTrackThickness = ((CircularProgressIndicatorSpec) s9).trackThickness * f;
        this.displayedCornerRadius = Math.min(((CircularProgressIndicatorSpec) s9).trackThickness / 2, ((CircularProgressIndicatorSpec) s9).trackCornerRadius) * f;
        S s10 = this.spec;
        float f9 = (((CircularProgressIndicatorSpec) s10).indicatorSize - ((CircularProgressIndicatorSpec) s10).trackThickness) / 2.0f;
        this.adjustedRadius = f9;
        if (z8 || z9) {
            if ((z8 && ((CircularProgressIndicatorSpec) s10).showAnimationBehavior == 2) || (z9 && ((CircularProgressIndicatorSpec) s10).hideAnimationBehavior == 1)) {
                this.adjustedRadius = (((1.0f - f) * ((CircularProgressIndicatorSpec) s10).trackThickness) / 2.0f) + f9;
            } else if ((z8 && ((CircularProgressIndicatorSpec) s10).showAnimationBehavior == 1) || (z9 && ((CircularProgressIndicatorSpec) s10).hideAnimationBehavior == 2)) {
                this.adjustedRadius = AbstractC1923c.m1036D(1.0f - f, ((CircularProgressIndicatorSpec) s10).trackThickness, 2.0f, f9);
            }
        }
        if (z9 && ((CircularProgressIndicatorSpec) s10).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, m247to = ScatterMapKt.Sentinel) int i8) {
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate.ActiveIndicator activeIndicator, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, m247to = ScatterMapKt.Sentinel) int i) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i);
        float f = activeIndicator.startFraction;
        float f7 = activeIndicator.endFraction;
        int i8 = activeIndicator.gapSize;
        drawArc(canvas, paint, f, f7, iCompositeARGBWithAlpha, i8, i8);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f7, @ColorInt int i, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, m247to = ScatterMapKt.Sentinel) int i8, int i9) {
        drawArc(canvas, paint, f, f7, MaterialColors.compositeARGBWithAlpha(i, i8), i9, i9);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return getSize();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return getSize();
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f7, float f8, float f9) {
        float fMin = (int) Math.min(f8, this.displayedTrackThickness);
        float f10 = f7 / 2.0f;
        float fMin2 = Math.min(f10, (this.displayedCornerRadius * fMin) / this.displayedTrackThickness);
        RectF rectF = new RectF((-fMin) / 2.0f, (-f7) / 2.0f, fMin / 2.0f, f10);
        canvas.save();
        double d9 = f;
        canvas.translate((float) (Math.cos(Math.toRadians(d9)) * this.adjustedRadius), (float) (Math.sin(Math.toRadians(d9)) * this.adjustedRadius));
        canvas.rotate(f);
        canvas.scale(f9, f9);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }
}
