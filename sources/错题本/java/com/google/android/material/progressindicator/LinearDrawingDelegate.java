package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.camera.video.AudioStats;
import androidx.collection.ScatterMapKt;
import androidx.core.math.MathUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.DrawingDelegate;
import com.google.android.material.transformation.FabTransformationScrimBehavior;

/* loaded from: classes2.dex */
final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {
    private float displayedCornerRadius;
    private float displayedTrackThickness;

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d)
    private float totalTrackLengthFraction;
    private float trackLength;
    private boolean useStrokeCap;

    public LinearDrawingDelegate(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.trackLength = 300.0f;
    }

    private void drawLine(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f7, @ColorInt int i, @Px int i8, @Px int i9) {
        float f8;
        float fClamp = MathUtils.clamp(f, 0.0f, 1.0f);
        float fClamp2 = MathUtils.clamp(f7, 0.0f, 1.0f);
        float fLerp = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, fClamp);
        float fLerp2 = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, fClamp2);
        int iClamp = (int) ((MathUtils.clamp(fLerp, 0.0f, 0.01f) * i8) / 0.01f);
        float fClamp3 = 1.0f - MathUtils.clamp(fLerp2, 0.99f, 1.0f);
        float f9 = this.trackLength;
        int i10 = (int) ((fLerp * f9) + iClamp);
        int i11 = (int) ((fLerp2 * f9) - ((int) ((fClamp3 * i9) / 0.01f)));
        float f10 = (-f9) / 2.0f;
        if (i10 <= i11) {
            float f11 = this.displayedCornerRadius;
            float f12 = i10 + f11;
            float f13 = i11 - f11;
            float f14 = f11 * 2.0f;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.displayedTrackThickness);
            if (f12 >= f13) {
                drawRoundedBlock(canvas, paint, new PointF(f12 + f10, 0.0f), new PointF(f13 + f10, 0.0f), f14, this.displayedTrackThickness);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.useStrokeCap ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f15 = f12 + f10;
            float f16 = f13 + f10;
            canvas.drawLine(f15, 0.0f, f16, 0.0f, paint);
            if (this.useStrokeCap || this.displayedCornerRadius <= 0.0f) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            if (f12 > 0.0f) {
                f8 = f14;
                drawRoundedBlock(canvas, paint, new PointF(f15, 0.0f), f8, this.displayedTrackThickness);
            } else {
                f8 = f14;
            }
            if (f13 < this.trackLength) {
                drawRoundedBlock(canvas, paint, new PointF(f16, 0.0f), f8, this.displayedTrackThickness);
            }
        }
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull PointF pointF, float f, float f7) {
        drawRoundedBlock(canvas, paint, pointF, null, f, f7);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float f, boolean z8, boolean z9) {
        this.trackLength = rect.width();
        float f7 = ((LinearProgressIndicatorSpec) this.spec).trackThickness;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - f7) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (((LinearProgressIndicatorSpec) this.spec).drawHorizontallyInverse) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f8 = this.trackLength / 2.0f;
        float f9 = f7 / 2.0f;
        canvas.clipRect(-f8, -f9, f8, f9);
        S s8 = this.spec;
        this.useStrokeCap = ((LinearProgressIndicatorSpec) s8).trackThickness / 2 == ((LinearProgressIndicatorSpec) s8).trackCornerRadius;
        this.displayedTrackThickness = ((LinearProgressIndicatorSpec) s8).trackThickness * f;
        this.displayedCornerRadius = Math.min(((LinearProgressIndicatorSpec) s8).trackThickness / 2, ((LinearProgressIndicatorSpec) s8).trackCornerRadius) * f;
        if (z8 || z9) {
            if ((z8 && ((LinearProgressIndicatorSpec) this.spec).showAnimationBehavior == 2) || (z9 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z8 || (z9 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior != 3)) {
                canvas.translate(0.0f, ((1.0f - f) * ((LinearProgressIndicatorSpec) this.spec).trackThickness) / 2.0f);
            }
        }
        if (z9 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, m247to = ScatterMapKt.Sentinel) int i8) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i, i8);
        if (((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize <= 0 || iCompositeARGBWithAlpha == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iCompositeARGBWithAlpha);
        PointF pointF = new PointF((this.trackLength / 2.0f) - (this.displayedTrackThickness / 2.0f), 0.0f);
        S s8 = this.spec;
        drawRoundedBlock(canvas, paint, pointF, ((LinearProgressIndicatorSpec) s8).trackStopIndicatorSize, ((LinearProgressIndicatorSpec) s8).trackStopIndicatorSize);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate.ActiveIndicator activeIndicator, int i) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i);
        float f = activeIndicator.startFraction;
        float f7 = activeIndicator.endFraction;
        int i8 = activeIndicator.gapSize;
        drawLine(canvas, paint, f, f7, iCompositeARGBWithAlpha, i8, i8);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f7, int i, int i8, @Px int i9) {
        drawLine(canvas, paint, f, f7, MaterialColors.compositeARGBWithAlpha(i, i8), i9, i9);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return ((LinearProgressIndicatorSpec) this.spec).trackThickness;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return -1;
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull PointF pointF, @Nullable PointF pointF2, float f, float f7) {
        float fMin = Math.min(f7, this.displayedTrackThickness);
        float f8 = f / 2.0f;
        float fMin2 = Math.min(f8, (this.displayedCornerRadius * fMin) / this.displayedTrackThickness);
        RectF rectF = new RectF((-f) / 2.0f, (-fMin) / 2.0f, f8, fMin / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, fMin2, fMin2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }
}
