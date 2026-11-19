package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class DisplayMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Picker = m28653constructorimpl(0);
    private static final int Input = m28653constructorimpl(1);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getInput-jFl-4v0, reason: not valid java name */
        public final int m28659getInputjFl4v0() {
            return DisplayMode.Input;
        }

        /* renamed from: getPicker-jFl-4v0, reason: not valid java name */
        public final int m28660getPickerjFl4v0() {
            return DisplayMode.Picker;
        }

        private Companion() {
        }
    }

    private /* synthetic */ DisplayMode(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DisplayMode m28652boximpl(int i10) {
        return new DisplayMode(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m28653constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m28654equalsimpl(int i10, Object obj) {
        return (obj instanceof DisplayMode) && i10 == ((DisplayMode) obj).m28658unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m28655equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m28656hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m28657toStringimpl(int i10) {
        return m28655equalsimpl0(i10, Picker) ? "Picker" : m28655equalsimpl0(i10, Input) ? "Input" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m28654equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m28656hashCodeimpl(this.value);
    }

    public String toString() {
        return m28657toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m28658unboximpl() {
        return this.value;
    }
}
