package com.xuexiang.xui.widget.imageview.edit;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class SaveSettings {
    private Bitmap.CompressFormat compressFormat;
    private int compressQuality;
    private boolean isClearViewsEnabled;
    private boolean isTransparencyEnabled;

    public static class Builder {
        private boolean isTransparencyEnabled = true;
        private boolean isClearViewsEnabled = true;
        private Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        private int compressQuality = 100;

        public SaveSettings build() {
            return new SaveSettings(this);
        }

        public Builder setClearViewsEnabled(boolean z3) {
            this.isClearViewsEnabled = z3;
            return this;
        }

        public Builder setCompressFormat(Bitmap.CompressFormat compressFormat) {
            this.compressFormat = compressFormat;
            return this;
        }

        public Builder setCompressQuality(int i4) {
            this.compressQuality = i4;
            return this;
        }

        public Builder setTransparencyEnabled(boolean z3) {
            this.isTransparencyEnabled = z3;
            return this;
        }
    }

    Bitmap.CompressFormat getCompressFormat() {
        return this.compressFormat;
    }

    int getCompressQuality() {
        return this.compressQuality;
    }

    boolean isClearViewsEnabled() {
        return this.isClearViewsEnabled;
    }

    boolean isTransparencyEnabled() {
        return this.isTransparencyEnabled;
    }

    private SaveSettings(Builder builder) {
        this.isClearViewsEnabled = builder.isClearViewsEnabled;
        this.isTransparencyEnabled = builder.isTransparencyEnabled;
        this.compressFormat = builder.compressFormat;
        this.compressQuality = builder.compressQuality;
    }
}
