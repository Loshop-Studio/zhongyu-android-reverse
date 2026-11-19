package androidx.camera.camera2.internal;

import androidx.camera.core.ZoomState;
import androidx.core.math.MathUtils;

/* loaded from: classes.dex */
class ZoomStateImpl implements ZoomState {
    private float mLinearZoom;
    private final float mMaxZoomRatio;
    private final float mMinZoomRatio;
    private float mZoomRatio;

    public ZoomStateImpl(float f10, float f11) {
        this.mMaxZoomRatio = f10;
        this.mMinZoomRatio = f11;
    }

    private float getPercentageByRatio(float f10) {
        float f11 = this.mMaxZoomRatio;
        float f12 = this.mMinZoomRatio;
        if (f11 == f12) {
            return 0.0f;
        }
        if (f10 == f11) {
            return 1.0f;
        }
        if (f10 == f12) {
            return 0.0f;
        }
        float f13 = 1.0f / f12;
        return ((1.0f / f10) - f13) / ((1.0f / f11) - f13);
    }

    private float getRatioByPercentage(float f10) {
        if (f10 == 1.0f) {
            return this.mMaxZoomRatio;
        }
        if (f10 == 0.0f) {
            return this.mMinZoomRatio;
        }
        float f11 = this.mMaxZoomRatio;
        float f12 = this.mMinZoomRatio;
        double d10 = 1.0f / f12;
        return (float) MathUtils.clamp(1.0d / (d10 + (((1.0f / f11) - d10) * f10)), f12, f11);
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

    public void setLinearZoom(float f10) {
        if (f10 <= 1.0f && f10 >= 0.0f) {
            this.mLinearZoom = f10;
            this.mZoomRatio = getRatioByPercentage(f10);
        } else {
            throw new IllegalArgumentException("Requested linearZoom " + f10 + " is not within valid range [0..1]");
        }
    }

    public void setZoomRatio(float f10) {
        if (f10 <= this.mMaxZoomRatio && f10 >= this.mMinZoomRatio) {
            this.mZoomRatio = f10;
            this.mLinearZoom = getPercentageByRatio(f10);
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f10 + " is not within valid range [" + this.mMinZoomRatio + " , " + this.mMaxZoomRatio + "]");
    }
}
