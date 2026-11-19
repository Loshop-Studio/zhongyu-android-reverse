package androidx.camera.core;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;
import com.google.android.material.color.utilities.Contrast;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class LayoutSettings {
    public static final LayoutSettings DEFAULT = new Builder().setAlpha(1.0f).setOffsetX(0.0f).setOffsetY(0.0f).setWidth(1.0f).setHeight(1.0f).build();
    private final float mAlpha;
    private final float mHeight;
    private final float mOffsetX;
    private final float mOffsetY;
    private final float mWidth;

    public static final class Builder {
        private float mAlpha = 1.0f;
        private float mOffsetX = 0.0f;
        private float mOffsetY = 0.0f;
        private float mWidth = 0.0f;
        private float mHeight = 0.0f;

        @NonNull
        public LayoutSettings build() {
            return new LayoutSettings(this.mAlpha, this.mOffsetX, this.mOffsetY, this.mWidth, this.mHeight);
        }

        @NonNull
        public Builder setAlpha(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float f10) {
            this.mAlpha = f10;
            return this;
        }

        @NonNull
        public Builder setHeight(@FloatRange(from = -1.0d, m487to = Contrast.RATIO_MIN) float f10) {
            this.mHeight = f10;
            return this;
        }

        @NonNull
        public Builder setOffsetX(@FloatRange(from = -1.0d, m487to = Contrast.RATIO_MIN) float f10) {
            this.mOffsetX = f10;
            return this;
        }

        @NonNull
        public Builder setOffsetY(@FloatRange(from = -1.0d, m487to = Contrast.RATIO_MIN) float f10) {
            this.mOffsetY = f10;
            return this;
        }

        @NonNull
        public Builder setWidth(@FloatRange(from = -1.0d, m487to = Contrast.RATIO_MIN) float f10) {
            this.mWidth = f10;
            return this;
        }
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public float getHeight() {
        return this.mHeight;
    }

    public float getOffsetX() {
        return this.mOffsetX;
    }

    public float getOffsetY() {
        return this.mOffsetY;
    }

    public float getWidth() {
        return this.mWidth;
    }

    private LayoutSettings(float f10, float f11, float f12, float f13, float f14) {
        this.mAlpha = f10;
        this.mOffsetX = f11;
        this.mOffsetY = f12;
        this.mWidth = f13;
        this.mHeight = f14;
    }
}
