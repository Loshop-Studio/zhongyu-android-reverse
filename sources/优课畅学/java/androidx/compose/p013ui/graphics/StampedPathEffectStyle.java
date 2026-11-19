package androidx.compose.p013ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class StampedPathEffectStyle {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Translate = m24613constructorimpl(0);
    private static final int Rotate = m24613constructorimpl(1);
    private static final int Morph = m24613constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getMorph-Ypspkwk, reason: not valid java name */
        public final int m24619getMorphYpspkwk() {
            return StampedPathEffectStyle.Morph;
        }

        /* renamed from: getRotate-Ypspkwk, reason: not valid java name */
        public final int m24620getRotateYpspkwk() {
            return StampedPathEffectStyle.Rotate;
        }

        /* renamed from: getTranslate-Ypspkwk, reason: not valid java name */
        public final int m24621getTranslateYpspkwk() {
            return StampedPathEffectStyle.Translate;
        }

        private Companion() {
        }
    }

    private /* synthetic */ StampedPathEffectStyle(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StampedPathEffectStyle m24612boximpl(int i10) {
        return new StampedPathEffectStyle(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m24613constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24614equalsimpl(int i10, Object obj) {
        return (obj instanceof StampedPathEffectStyle) && i10 == ((StampedPathEffectStyle) obj).m24618unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24615equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24616hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m24617toStringimpl(int i10) {
        return m24615equalsimpl0(i10, Translate) ? "Translate" : m24615equalsimpl0(i10, Rotate) ? "Rotate" : m24615equalsimpl0(i10, Morph) ? "Morph" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m24614equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m24616hashCodeimpl(this.value);
    }

    public String toString() {
        return m24617toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m24618unboximpl() {
        return this.value;
    }
}
