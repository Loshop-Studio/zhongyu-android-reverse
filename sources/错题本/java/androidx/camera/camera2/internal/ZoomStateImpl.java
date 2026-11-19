package androidx.camera.camera2.internal;

import android.support.v4.media.AbstractC0037f;
import androidx.camera.core.ZoomState;
import androidx.core.math.MathUtils;

/* loaded from: classes.dex */
class ZoomStateImpl implements ZoomState {
    private float mLinearZoom;
    private final float mMaxZoomRatio;
    private final float mMinZoomRatio;
    private float mZoomRatio;

    public ZoomStateImpl(float f, float f7) {
        this.mMaxZoomRatio = f;
        this.mMinZoomRatio = f7;
    }

    private float getPercentageByRatio(float f) {
        float f7 = this.mMaxZoomRatio;
        float f8 = this.mMinZoomRatio;
        if (f7 == f8) {
            return 0.0f;
        }
        if (f == f7) {
            return 1.0f;
        }
        if (f == f8) {
            return 0.0f;
        }
        float f9 = 1.0f / f8;
        return ((1.0f / f) - f9) / ((1.0f / f7) - f9);
    }

    private float getRatioByPercentage(float f) {
        if (f == 1.0f) {
            return this.mMaxZoomRatio;
        }
        if (f == 0.0f) {
            return this.mMinZoomRatio;
        }
        float f7 = this.mMaxZoomRatio;
        float f8 = this.mMinZoomRatio;
        double d9 = 1.0f / f8;
        return (float) MathUtils.clamp(1.0d / ((((1.0f / f7) - d9) * f) + d9), f8, f7);
    }

    @Override // androidx.camera.core.ZoomState
    public float getLinearZoom() {
        return this.mLinearZoom;
    }

    @Override // androidx.camera.core.ZoomState
    public float getMaxZoomRatio() {
        return this.mMaxZoomRatio;
    }

    @Override // androidx.camera.core.ZoomState
    public float getMinZoomRatio() {
        return this.mMinZoomRatio;
    }

    @Override // androidx.camera.core.ZoomState
    public float getZoomRatio() {
        return this.mZoomRatio;
    }

    public void setLinearZoom(float f) throws IllegalArgumentException {
        if (f <= 1.0f && f >= 0.0f) {
            this.mLinearZoom = f;
            this.mZoomRatio = getRatioByPercentage(f);
        } else {
            throw new IllegalArgumentException("Requested linearZoom " + f + " is not within valid range [0..1]");
        }
    }

    public void setZoomRatio(float f) throws IllegalArgumentException {
        if (f <= this.mMaxZoomRatio && f >= this.mMinZoomRatio) {
            this.mZoomRatio = f;
            this.mLinearZoom = getPercentageByRatio(f);
            return;
        }
        StringBuilder sb = new StringBuilder("Requested zoomRatio ");
        sb.append(f);
        sb.append(" is not within valid range [");
        sb.append(this.mMinZoomRatio);
        sb.append(" , ");
        throw new IllegalArgumentException(AbstractC0037f.m89n(sb, "]", this.mMaxZoomRatio));
    }
}
