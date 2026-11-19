package androidx.compose.p014ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class StampedPathEffectStyle {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Translate = m31215constructorimpl(0);
    private static final int Rotate = m31215constructorimpl(1);
    private static final int Morph = m31215constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getMorph-Ypspkwk, reason: not valid java name */
        public final int m31221getMorphYpspkwk() {
            return StampedPathEffectStyle.Morph;
        }

        /* renamed from: getRotate-Ypspkwk, reason: not valid java name */
        public final int m31222getRotateYpspkwk() {
            return StampedPathEffectStyle.Rotate;
        }

        /* renamed from: getTranslate-Ypspkwk, reason: not valid java name */
        public final int m31223getTranslateYpspkwk() {
            return StampedPathEffectStyle.Translate;
        }

        private Companion() {
        }
    }

    private /* synthetic */ StampedPathEffectStyle(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StampedPathEffectStyle m31214boximpl(int i10) {
        return new StampedPathEffectStyle(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m31215constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m31216equalsimpl(int i10, Object obj) {
        return (obj instanceof StampedPathEffectStyle) && i10 == ((StampedPathEffectStyle) obj).m31220unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31217equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m31218hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31219toStringimpl(int i10) {
        return m31217equalsimpl0(i10, Translate) ? "Translate" : m31217equalsimpl0(i10, Rotate) ? "Rotate" : m31217equalsimpl0(i10, Morph) ? "Morph" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m31216equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m31218hashCodeimpl(this.value);
    }

    public String toString() {
        return m31219toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31220unboximpl() {
        return this.value;
    }
}
