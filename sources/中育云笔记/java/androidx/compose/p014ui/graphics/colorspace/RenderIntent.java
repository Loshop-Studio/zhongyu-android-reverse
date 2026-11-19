package androidx.compose.p014ui.graphics.colorspace;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class RenderIntent {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Perceptual = m31306constructorimpl(0);
    private static final int Relative = m31306constructorimpl(1);
    private static final int Saturation = m31306constructorimpl(2);
    private static final int Absolute = m31306constructorimpl(3);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getAbsolute-uksYyKA, reason: not valid java name */
        public final int m31312getAbsoluteuksYyKA() {
            return RenderIntent.Absolute;
        }

        /* renamed from: getPerceptual-uksYyKA, reason: not valid java name */
        public final int m31313getPerceptualuksYyKA() {
            return RenderIntent.Perceptual;
        }

        /* renamed from: getRelative-uksYyKA, reason: not valid java name */
        public final int m31314getRelativeuksYyKA() {
            return RenderIntent.Relative;
        }

        /* renamed from: getSaturation-uksYyKA, reason: not valid java name */
        public final int m31315getSaturationuksYyKA() {
            return RenderIntent.Saturation;
        }

        private Companion() {
        }
    }

    private /* synthetic */ RenderIntent(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ RenderIntent m31305boximpl(int i10) {
        return new RenderIntent(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m31306constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m31307equalsimpl(int i10, Object obj) {
        return (obj instanceof RenderIntent) && i10 == ((RenderIntent) obj).m31311unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31308equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m31309hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31310toStringimpl(int i10) {
        return m31308equalsimpl0(i10, Perceptual) ? "Perceptual" : m31308equalsimpl0(i10, Relative) ? "Relative" : m31308equalsimpl0(i10, Saturation) ? ExifInterface.TAG_SATURATION : m31308equalsimpl0(i10, Absolute) ? "Absolute" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m31307equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m31309hashCodeimpl(this.value);
    }

    public String toString() {
        return m31310toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31311unboximpl() {
        return this.value;
    }
}
