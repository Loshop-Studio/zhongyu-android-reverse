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
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.progressindicator.DrawingDelegate;

/* loaded from: classes3.dex */
final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {
    private float displayedCornerRadius;
    private float displayedTrackThickness;

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN)
    private float totalTrackLengthFraction;
    private float trackLength;
    private boolean useStrokeCap;

    public LinearDrawingDelegate(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.trackLength = 300.0f;
    }

    private void drawLine(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, @ColorInt int i10, @Px int i11, @Px int i12) {
        float f12;
        float fClamp = MathUtils.clamp(f10, 0.0f, 1.0f);
        float fClamp2 = MathUtils.clamp(f11, 0.0f, 1.0f);
        float fLerp = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, fClamp);
        float fLerp2 = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, fClamp2);
        int iClamp = (int) ((i11 * MathUtils.clamp(fLerp, 0.0f, 0.01f)) / 0.01f);
        int iClamp2 = (int) ((i12 * (1.0f - MathUtils.clamp(fLerp2, 0.99f, 1.0f))) / 0.01f);
        float f13 = this.trackLength;
        int i13 = (int) ((fLerp * f13) + iClamp);
        int i14 = (int) ((fLerp2 * f13) - iClamp2);
        float f14 = (-f13) / 2.0f;
        if (i13 <= i14) {
            float f15 = this.displayedCornerRadius;
            float f16 = i13 + f15;
            float f17 = i14 - f15;
            float f18 = f15 * 2.0f;
            paint.setColor(i10);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.displayedTrackThickness);
            if (f16 >= f17) {
                drawRoundedBlock(canvas, paint, new PointF(f16 + f14, 0.0f), new PointF(f17 + f14, 0.0f), f18, this.displayedTrackThickness);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.useStrokeCap ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f19 = f16 + f14;
            float f20 = f17 + f14;
            canvas.drawLine(f19, 0.0f, f20, 0.0f, paint);
            if (this.useStrokeCap || this.displayedCornerRadius <= 0.0f) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            if (f16 > 0.0f) {
                f12 = f18;
                drawRoundedBlock(canvas, paint, new PointF(f19, 0.0f), f12, this.displayedTrackThickness);
            } else {
                f12 = f18;
            }
            if (f17 < this.trackLength) {
                drawRoundedBlock(canvas, paint, new PointF(f20, 0.0f), f12, this.displayedTrackThickness);
            }
        }
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull PointF pointF, float f10, float f11) {
        drawRoundedBlock(canvas, paint, pointF, null, f10, f11);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float f10, boolean z9, boolean z10) {
        this.trackLength = rect.width();
        float f11 = ((LinearProgressIndicatorSpec) this.spec).trackThickness;
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - f11) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.spec).drawHorizontallyInverse) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f12 = this.trackLength / 2.0f;
        float f13 = f11 / 2.0f;
        canvas.clipRect(-f12, -f13, f12, f13);
        S s10 = this.spec;
        this.useStrokeCap = ((LinearProgressIndicatorSpec) s10).trackThickness / 2 == ((LinearProgressIndicatorSpec) s10).trackCornerRadius;
        this.displayedTrackThickness = ((LinearProgressIndicatorSpec) s10).trackThickness * f10;
        this.displayedCornerRadius = Math.min(((LinearProgressIndicatorSpec) s10).trackThickness / 2, ((LinearProgressIndicatorSpec) s10).trackCornerRadius) * f10;
        if (z9 || z10) {
            if ((z9 && ((LinearProgressIndicatorSpec) this.spec).showAnimationBehavior == 2) || (z10 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z9 || (z10 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior != 3)) {
                canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.spec).trackThickness * (1.0f - f10)) / 2.0f);
            }
        }
        if (z10 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f10;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i10, @IntRange(from = 0, m488to = ScatterMapKt.Sentinel) int i11) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i10, i11);
        if (((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize <= 0 || iCompositeARGBWithAlpha == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iCompositeARGBWithAlpha);
        PointF pointF = new PointF((this.trackLength / 2.0f) - (this.displayedTrackThickness / 2.0f), 0.0f);
        S s10 = this.spec;
        drawRoundedBlock(canvas, paint, pointF, ((LinearProgressIndicatorSpec) s10).trackStopIndicatorSize, ((LinearProgressIndicatorSpec) s10).trackStopIndicatorSize);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate.ActiveIndicator activeIndicator, int i10) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i10);
        float f10 = activeIndicator.startFraction;
        float f11 = activeIndicator.endFraction;
        int i11 = activeIndicator.gapSize;
        drawLine(canvas, paint, f10, f11, iCompositeARGBWithAlpha, i11, i11);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, int i10, int i11, @Px int i12) {
        drawLine(canvas, paint, f10, f11, MaterialColors.compositeARGBWithAlpha(i10, i11), i12, i12);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return ((LinearProgressIndicatorSpec) this.spec).trackThickness;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return -1;
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull PointF pointF, @Nullable PointF pointF2, float f10, float f11) {
        float fMin = Math.min(f11, this.displayedTrackThickness);
        float f12 = f10 / 2.0f;
        float fMin2 = Math.min(f12, (this.displayedCornerRadius * fMin) / this.displayedTrackThickness);
        RectF rectF = new RectF((-f10) / 2.0f, (-fMin) / 2.0f, f12, fMin / 2.0f);
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
