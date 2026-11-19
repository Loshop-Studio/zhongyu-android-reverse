package androidx.compose.p014ui.graphics.layer;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class CompositingStrategy {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Auto = m31503constructorimpl(0);
    private static final int Offscreen = m31503constructorimpl(1);
    private static final int ModulateAlpha = m31503constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getAuto-ke2Ky5w, reason: not valid java name */
        public final int m31509getAutoke2Ky5w() {
            return CompositingStrategy.Auto;
        }

        /* renamed from: getModulateAlpha-ke2Ky5w, reason: not valid java name */
        public final int m31510getModulateAlphake2Ky5w() {
            return CompositingStrategy.ModulateAlpha;
        }

        /* renamed from: getOffscreen-ke2Ky5w, reason: not valid java name */
        public final int m31511getOffscreenke2Ky5w() {
            return CompositingStrategy.Offscreen;
        }

        private Companion() {
        }
    }

    private /* synthetic */ CompositingStrategy(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CompositingStrategy m31502boximpl(int i10) {
        return new CompositingStrategy(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m31503constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m31504equalsimpl(int i10, Object obj) {
        return (obj instanceof CompositingStrategy) && i10 == ((CompositingStrategy) obj).m31508unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31505equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m31506hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31507toStringimpl(int i10) {
        return "CompositingStrategy(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m31504equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m31506hashCodeimpl(this.value);
    }

    public String toString() {
        return m31507toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31508unboximpl() {
        return this.value;
    }
}
