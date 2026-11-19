package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p074i0.InterfaceC6497b;

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
        public final boolean f2269a;

        ImageType(boolean z6) {
            this.f2269a = z6;
        }

        public boolean hasAlpha() {
            return this.f2269a;
        }

        public boolean isWebp() {
            int i6 = C4686a.f2270a[ordinal()];
            return i6 == 1 || i6 == 2 || i6 == 3;
        }
    }

    /* renamed from: com.bumptech.glide.load.ImageHeaderParser$a */
    public static /* synthetic */ class C4686a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2270a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f2270a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2270a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2270a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    int mo2557a(InputStream inputStream, InterfaceC6497b interfaceC6497b);

    /* renamed from: b */
    ImageType mo2558b(ByteBuffer byteBuffer);

    /* renamed from: c */
    int mo2559c(ByteBuffer byteBuffer, InterfaceC6497b interfaceC6497b);

    /* renamed from: d */
    ImageType mo2560d(InputStream inputStream);
}
