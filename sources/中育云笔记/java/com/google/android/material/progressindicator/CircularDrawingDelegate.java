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
import com.google.android.material.color.MaterialColors;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.math.MathUtils;
import com.google.android.material.progressindicator.DrawingDelegate;

/* loaded from: classes5.dex */
final class CircularDrawingDelegate extends DrawingDelegate<CircularProgressIndicatorSpec> {
    private static final float ROUND_CAP_RAMP_DOWN_THRESHHOLD = 0.01f;
    private float adjustedRadius;
    private float displayedCornerRadius;
    private float displayedTrackThickness;

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN)
    private float totalTrackLengthFraction;
    private boolean useStrokeCap;

    public CircularDrawingDelegate(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
    }

    private void drawArc(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, @ColorInt int i10, @Px int i11, @Px int i12) {
        float f12 = f11 >= f10 ? f11 - f10 : (f11 + 1.0f) - f10;
        float f13 = f10 % 1.0f;
        if (this.totalTrackLengthFraction < 1.0f) {
            float f14 = f13 + f12;
            if (f14 > 1.0f) {
                drawArc(canvas, paint, f13, 1.0f, i10, i11, 0);
                drawArc(canvas, paint, 1.0f, f14, i10, 0, i12);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.displayedCornerRadius / this.adjustedRadius);
        if (f13 == 0.0f && f12 >= 0.99f) {
            f12 += ((f12 - 0.99f) * ((degrees * 2.0f) / 360.0f)) / 0.01f;
        }
        float fLerp = MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, f13);
        float fLerp2 = MathUtils.lerp(0.0f, this.totalTrackLengthFraction, f12);
        float degrees2 = (float) Math.toDegrees(i11 / this.adjustedRadius);
        float degrees3 = ((fLerp2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i12 / this.adjustedRadius));
        float f15 = (fLerp * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i10);
        paint.setStrokeWidth(this.displayedTrackThickness);
        float f16 = degrees * 2.0f;
        if (degrees3 < f16) {
            float f17 = degrees3 / f16;
            paint.setStyle(Paint.Style.FILL);
            drawRoundedBlock(canvas, paint, f15 + (degrees * f17), this.displayedCornerRadius * 2.0f, this.displayedTrackThickness, f17);
            return;
        }
        float f18 = this.adjustedRadius;
        RectF rectF = new RectF(-f18, -f18, f18, f18);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.useStrokeCap ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f19 = f15 + degrees;
        canvas.drawArc(rectF, f19, degrees3 - f16, false, paint);
        if (this.useStrokeCap || this.displayedCornerRadius <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        drawRoundedBlock(canvas, paint, f19, this.displayedCornerRadius * 2.0f, this.displayedTrackThickness);
        drawRoundedBlock(canvas, paint, (f15 + degrees3) - degrees, this.displayedCornerRadius * 2.0f, this.displayedTrackThickness);
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, float f12) {
        drawRoundedBlock(canvas, paint, f10, f11, f12, 1.0f);
    }

    private int getSize() {
        S s10 = this.spec;
        return ((CircularProgressIndicatorSpec) s10).indicatorSize + (((CircularProgressIndicatorSpec) s10).indicatorInset * 2);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, boolean z10, boolean z11) {
        float fWidth = rect.width() / getPreferredWidth();
        float fHeight = rect.height() / getPreferredHeight();
        S s10 = this.spec;
        float f11 = (((CircularProgressIndicatorSpec) s10).indicatorSize / 2.0f) + ((CircularProgressIndicatorSpec) s10).indicatorInset;
        canvas.translate((f11 * fWidth) + rect.left, (f11 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (((CircularProgressIndicatorSpec) this.spec).indicatorDirection != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        S s11 = this.spec;
        this.useStrokeCap = ((CircularProgressIndicatorSpec) s11).trackThickness / 2 <= ((CircularProgressIndicatorSpec) s11).trackCornerRadius;
        this.displayedTrackThickness = ((CircularProgressIndicatorSpec) s11).trackThickness * f10;
        this.displayedCornerRadius = Math.min(((CircularProgressIndicatorSpec) s11).trackThickness / 2, ((CircularProgressIndicatorSpec) s11).trackCornerRadius) * f10;
        S s12 = this.spec;
        float f13 = (((CircularProgressIndicatorSpec) s12).indicatorSize - ((CircularProgressIndicatorSpec) s12).trackThickness) / 2.0f;
        this.adjustedRadius = f13;
        if (z10 || z11) {
            if ((z10 && ((CircularProgressIndicatorSpec) s12).showAnimationBehavior == 2) || (z11 && ((CircularProgressIndicatorSpec) s12).hideAnimationBehavior == 1)) {
                this.adjustedRadius = f13 + (((1.0f - f10) * ((CircularProgressIndicatorSpec) s12).trackThickness) / 2.0f);
            } else if ((z10 && ((CircularProgressIndicatorSpec) s12).showAnimationBehavior == 1) || (z11 && ((CircularProgressIndicatorSpec) s12).hideAnimationBehavior == 2)) {
                this.adjustedRadius = f13 - (((1.0f - f10) * ((CircularProgressIndicatorSpec) s12).trackThickness) / 2.0f);
            }
        }
        if (z11 && ((CircularProgressIndicatorSpec) s12).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f10;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i10, @IntRange(from = 0, m338to = 255) int i11) {
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate.ActiveIndicator activeIndicator, @IntRange(from = 0, m338to = 255) int i10) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i10);
        float f10 = activeIndicator.startFraction;
        float f11 = activeIndicator.endFraction;
        int i11 = activeIndicator.gapSize;
        drawArc(canvas, paint, f10, f11, iCompositeARGBWithAlpha, i11, i11);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, @ColorInt int i10, @IntRange(from = 0, m338to = 255) int i11, int i12) {
        drawArc(canvas, paint, f10, f11, MaterialColors.compositeARGBWithAlpha(i10, i11), i12, i12);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return getSize();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return getSize();
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, float f12, float f13) {
        float fMin = (int) Math.min(f12, this.displayedTrackThickness);
        float f14 = f11 / 2.0f;
        float fMin2 = Math.min(f14, (this.displayedCornerRadius * fMin) / this.displayedTrackThickness);
        RectF rectF = new RectF((-fMin) / 2.0f, (-f11) / 2.0f, fMin / 2.0f, f14);
        canvas.save();
        double d10 = f10;
        canvas.translate((float) (this.adjustedRadius * Math.cos(Math.toRadians(d10))), (float) (this.adjustedRadius * Math.sin(Math.toRadians(d10))));
        canvas.rotate(f10);
        canvas.scale(f13, f13);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }
}
