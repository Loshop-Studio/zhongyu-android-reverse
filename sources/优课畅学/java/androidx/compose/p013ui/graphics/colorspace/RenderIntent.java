package androidx.compose.p013ui.graphics.colorspace;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class RenderIntent {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Perceptual = m24704constructorimpl(0);
    private static final int Relative = m24704constructorimpl(1);
    private static final int Saturation = m24704constructorimpl(2);
    private static final int Absolute = m24704constructorimpl(3);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getAbsolute-uksYyKA, reason: not valid java name */
        public final int m24710getAbsoluteuksYyKA() {
            return RenderIntent.Absolute;
        }

        /* renamed from: getPerceptual-uksYyKA, reason: not valid java name */
        public final int m24711getPerceptualuksYyKA() {
            return RenderIntent.Perceptual;
        }

        /* renamed from: getRelative-uksYyKA, reason: not valid java name */
        public final int m24712getRelativeuksYyKA() {
            return RenderIntent.Relative;
        }

        /* renamed from: getSaturation-uksYyKA, reason: not valid java name */
        public final int m24713getSaturationuksYyKA() {
            return RenderIntent.Saturation;
        }

        private Companion() {
        }
    }

    private /* synthetic */ RenderIntent(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ RenderIntent m24703boximpl(int i10) {
        return new RenderIntent(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m24704constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24705equalsimpl(int i10, Object obj) {
        return (obj instanceof RenderIntent) && i10 == ((RenderIntent) obj).m24709unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24706equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24707hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m24708toStringimpl(int i10) {
        return m24706equalsimpl0(i10, Perceptual) ? "Perceptual" : m24706equalsimpl0(i10, Relative) ? "Relative" : m24706equalsimpl0(i10, Saturation) ? ExifInterface.TAG_SATURATION : m24706equalsimpl0(i10, Absolute) ? "Absolute" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m24705equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m24707hashCodeimpl(this.value);
    }

    public String toString() {
        return m24708toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m24709unboximpl() {
        return this.value;
    }
}
