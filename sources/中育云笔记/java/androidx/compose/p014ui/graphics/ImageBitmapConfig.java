package androidx.compose.p014ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class ImageBitmapConfig {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Argb8888 = m31091constructorimpl(0);
    private static final int Alpha8 = m31091constructorimpl(1);
    private static final int Rgb565 = m31091constructorimpl(2);
    private static final int F16 = m31091constructorimpl(3);
    private static final int Gpu = m31091constructorimpl(4);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getAlpha8-_sVssgQ, reason: not valid java name */
        public final int m31097getAlpha8_sVssgQ() {
            return ImageBitmapConfig.Alpha8;
        }

        /* renamed from: getArgb8888-_sVssgQ, reason: not valid java name */
        public final int m31098getArgb8888_sVssgQ() {
            return ImageBitmapConfig.Argb8888;
        }

        /* renamed from: getF16-_sVssgQ, reason: not valid java name */
        public final int m31099getF16_sVssgQ() {
            return ImageBitmapConfig.F16;
        }

        /* renamed from: getGpu-_sVssgQ, reason: not valid java name */
        public final int m31100getGpu_sVssgQ() {
            return ImageBitmapConfig.Gpu;
        }

        /* renamed from: getRgb565-_sVssgQ, reason: not valid java name */
        public final int m31101getRgb565_sVssgQ() {
            return ImageBitmapConfig.Rgb565;
        }

        private Companion() {
        }
    }

    private /* synthetic */ ImageBitmapConfig(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImageBitmapConfig m31090boximpl(int i10) {
        return new ImageBitmapConfig(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m31091constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m31092equalsimpl(int i10, Object obj) {
        return (obj instanceof ImageBitmapConfig) && i10 == ((ImageBitmapConfig) obj).m31096unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31093equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m31094hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31095toStringimpl(int i10) {
        return m31093equalsimpl0(i10, Argb8888) ? "Argb8888" : m31093equalsimpl0(i10, Alpha8) ? "Alpha8" : m31093equalsimpl0(i10, Rgb565) ? "Rgb565" : m31093equalsimpl0(i10, F16) ? "F16" : m31093equalsimpl0(i10, Gpu) ? "Gpu" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m31092equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m31094hashCodeimpl(this.value);
    }

    public String toString() {
        return m31095toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31096unboximpl() {
        return this.value;
    }
}
