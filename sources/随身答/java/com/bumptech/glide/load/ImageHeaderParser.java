package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p164l0.InterfaceC8865b;

/* loaded from: classes3.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);


        /* renamed from: a */
        public final boolean f3309a;

        ImageType(boolean z9) {
            this.f3309a = z9;
        }

        public boolean hasAlpha() {
            return this.f3309a;
        }
    }

    /* renamed from: a */
    int mo3078a(InputStream inputStream, InterfaceC8865b interfaceC8865b);

    /* renamed from: b */
    ImageType mo3079b(ByteBuffer byteBuffer);

    /* renamed from: c */
    ImageType mo3080c(InputStream inputStream);
}
