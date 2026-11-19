package androidx.compose.p013ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class CompositingStrategy {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Auto = m24358constructorimpl(0);
    private static final int Offscreen = m24358constructorimpl(1);
    private static final int ModulateAlpha = m24358constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getAuto--NrFUSI, reason: not valid java name */
        public final int m24364getAutoNrFUSI() {
            return CompositingStrategy.Auto;
        }

        /* renamed from: getModulateAlpha--NrFUSI, reason: not valid java name */
        public final int m24365getModulateAlphaNrFUSI() {
            return CompositingStrategy.ModulateAlpha;
        }

        /* renamed from: getOffscreen--NrFUSI, reason: not valid java name */
        public final int m24366getOffscreenNrFUSI() {
            return CompositingStrategy.Offscreen;
        }

        private Companion() {
        }
    }

    private /* synthetic */ CompositingStrategy(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CompositingStrategy m24357boximpl(int i10) {
        return new CompositingStrategy(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m24358constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24359equalsimpl(int i10, Object obj) {
        return (obj instanceof CompositingStrategy) && i10 == ((CompositingStrategy) obj).m24363unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24360equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24361hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m24362toStringimpl(int i10) {
        return "CompositingStrategy(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m24359equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m24361hashCodeimpl(this.value);
    }

    public String toString() {
        return m24362toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m24363unboximpl() {
        return this.value;
    }
}
