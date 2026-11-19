package androidx.compose.p014ui.semantics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class LiveRegionMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Polite = m32713constructorimpl(0);
    private static final int Assertive = m32713constructorimpl(1);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getAssertive-0phEisY, reason: not valid java name */
        public final int m32719getAssertive0phEisY() {
            return LiveRegionMode.Assertive;
        }

        /* renamed from: getPolite-0phEisY, reason: not valid java name */
        public final int m32720getPolite0phEisY() {
            return LiveRegionMode.Polite;
        }

        private Companion() {
        }
    }

    private /* synthetic */ LiveRegionMode(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LiveRegionMode m32712boximpl(int i10) {
        return new LiveRegionMode(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m32713constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m32714equalsimpl(int i10, Object obj) {
        return (obj instanceof LiveRegionMode) && i10 == ((LiveRegionMode) obj).m32718unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32715equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m32716hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m32717toStringimpl(int i10) {
        return m32715equalsimpl0(i10, Polite) ? "Polite" : m32715equalsimpl0(i10, Assertive) ? "Assertive" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m32714equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m32716hashCodeimpl(this.value);
    }

    public String toString() {
        return m32717toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m32718unboximpl() {
        return this.value;
    }
}
