package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p213k0.InterfaceC9770b;

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


        /* renamed from: c */
        public final boolean f4681c;

        ImageType(boolean z10) {
            this.f4681c = z10;
        }

        public boolean hasAlpha() {
            return this.f4681c;
        }

        public boolean isWebp() {
            int i10 = C5818a.f4682a[ordinal()];
            return i10 == 1 || i10 == 2 || i10 == 3;
        }
    }

    /* renamed from: com.bumptech.glide.load.ImageHeaderParser$a */
    public static /* synthetic */ class C5818a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4682a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f4682a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4682a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4682a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    int mo4029a(InputStream inputStream, InterfaceC9770b interfaceC9770b);

    /* renamed from: b */
    ImageType mo4030b(ByteBuffer byteBuffer);

    /* renamed from: c */
    ImageType mo4031c(InputStream inputStream);

    /* renamed from: d */
    int mo4032d(ByteBuffer byteBuffer, InterfaceC9770b interfaceC9770b);
}
