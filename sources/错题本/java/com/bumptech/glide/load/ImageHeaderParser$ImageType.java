package com.bumptech.glide.load;

/* loaded from: classes2.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    UNKNOWN(false);

    private final boolean hasAlpha;

    ImageHeaderParser$ImageType(boolean z8) {
        this.hasAlpha = z8;
    }

    public boolean hasAlpha() {
        return this.hasAlpha;
    }
}
