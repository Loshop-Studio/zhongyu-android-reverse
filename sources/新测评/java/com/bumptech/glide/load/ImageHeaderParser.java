package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p195p0.InterfaceC8802b;

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
        public final boolean f3478a;

        ImageType(boolean z9) {
            this.f3478a = z9;
        }

        public boolean hasAlpha() {
            return this.f3478a;
        }

        public boolean isWebp() {
            int i10 = C5350a.f3479a[ordinal()];
            return i10 == 1 || i10 == 2 || i10 == 3;
        }
    }

    /* renamed from: com.bumptech.glide.load.ImageHeaderParser$a */
    public static /* synthetic */ class C5350a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3479a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f3479a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3479a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3479a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    int mo3376a(ByteBuffer byteBuffer, InterfaceC8802b interfaceC8802b);

    /* renamed from: b */
    ImageType mo3377b(ByteBuffer byteBuffer);

    /* renamed from: c */
    int mo3378c(InputStream inputStream, InterfaceC8802b interfaceC8802b);

    /* renamed from: d */
    ImageType mo3379d(InputStream inputStream);
}
