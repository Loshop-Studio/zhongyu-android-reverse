package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p098n.InterfaceC4393b;

/* loaded from: classes2.dex */
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
        public final boolean f655a;

        ImageType(boolean z3) {
            this.f655a = z3;
        }

        public boolean hasAlpha() {
            return this.f655a;
        }
    }

    /* renamed from: a */
    ImageType mo1753a(ByteBuffer byteBuffer);

    /* renamed from: b */
    ImageType mo1754b(InputStream inputStream);

    /* renamed from: c */
    int mo1755c(InputStream inputStream, InterfaceC4393b interfaceC4393b);
}
