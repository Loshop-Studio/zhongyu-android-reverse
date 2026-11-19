package androidx.compose.p014ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class CompositingStrategy {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Auto = m30960constructorimpl(0);
    private static final int Offscreen = m30960constructorimpl(1);
    private static final int ModulateAlpha = m30960constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getAuto--NrFUSI, reason: not valid java name */
        public final int m30966getAutoNrFUSI() {
            return CompositingStrategy.Auto;
        }

        /* renamed from: getModulateAlpha--NrFUSI, reason: not valid java name */
        public final int m30967getModulateAlphaNrFUSI() {
            return CompositingStrategy.ModulateAlpha;
        }

        /* renamed from: getOffscreen--NrFUSI, reason: not valid java name */
        public final int m30968getOffscreenNrFUSI() {
            return CompositingStrategy.Offscreen;
        }

        private Companion() {
        }
    }

    private /* synthetic */ CompositingStrategy(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CompositingStrategy m30959boximpl(int i10) {
        return new CompositingStrategy(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m30960constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m30961equalsimpl(int i10, Object obj) {
        return (obj instanceof CompositingStrategy) && i10 == ((CompositingStrategy) obj).m30965unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30962equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30963hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m30964toStringimpl(int i10) {
        return "CompositingStrategy(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m30961equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m30963hashCodeimpl(this.value);
    }

    public String toString() {
        return m30964toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m30965unboximpl() {
        return this.value;
    }
}
