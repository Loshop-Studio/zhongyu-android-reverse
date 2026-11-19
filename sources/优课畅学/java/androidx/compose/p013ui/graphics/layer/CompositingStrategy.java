package androidx.compose.p013ui.graphics.layer;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class CompositingStrategy {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Auto = m24901constructorimpl(0);
    private static final int Offscreen = m24901constructorimpl(1);
    private static final int ModulateAlpha = m24901constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getAuto-ke2Ky5w, reason: not valid java name */
        public final int m24907getAutoke2Ky5w() {
            return CompositingStrategy.Auto;
        }

        /* renamed from: getModulateAlpha-ke2Ky5w, reason: not valid java name */
        public final int m24908getModulateAlphake2Ky5w() {
            return CompositingStrategy.ModulateAlpha;
        }

        /* renamed from: getOffscreen-ke2Ky5w, reason: not valid java name */
        public final int m24909getOffscreenke2Ky5w() {
            return CompositingStrategy.Offscreen;
        }

        private Companion() {
        }
    }

    private /* synthetic */ CompositingStrategy(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CompositingStrategy m24900boximpl(int i10) {
        return new CompositingStrategy(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m24901constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24902equalsimpl(int i10, Object obj) {
        return (obj instanceof CompositingStrategy) && i10 == ((CompositingStrategy) obj).m24906unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24903equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24904hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m24905toStringimpl(int i10) {
        return "CompositingStrategy(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m24902equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m24904hashCodeimpl(this.value);
    }

    public String toString() {
        return m24905toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m24906unboximpl() {
        return this.value;
    }
}
