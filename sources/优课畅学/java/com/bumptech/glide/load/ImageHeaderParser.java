package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p193o.InterfaceC9498b;

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
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);


        /* renamed from: a */
        public final boolean f2911a;

        ImageType(boolean z10) {
            this.f2911a = z10;
        }

        public boolean hasAlpha() {
            return this.f2911a;
        }

        public boolean isWebp() {
            int i10 = C5399a.f2912a[ordinal()];
            return i10 == 1 || i10 == 2 || i10 == 3;
        }
    }

    /* renamed from: com.bumptech.glide.load.ImageHeaderParser$a */
    public static /* synthetic */ class C5399a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2912a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f2912a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2912a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2912a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    int mo2823a(ByteBuffer byteBuffer, InterfaceC9498b interfaceC9498b);

    /* renamed from: b */
    ImageType mo2824b(ByteBuffer byteBuffer);

    /* renamed from: c */
    int mo2825c(InputStream inputStream, InterfaceC9498b interfaceC9498b);

    /* renamed from: d */
    ImageType mo2826d(InputStream inputStream);
}
