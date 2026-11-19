package androidx.compose.p013ui.semantics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class LiveRegionMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Polite = m26111constructorimpl(0);
    private static final int Assertive = m26111constructorimpl(1);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getAssertive-0phEisY, reason: not valid java name */
        public final int m26117getAssertive0phEisY() {
            return LiveRegionMode.Assertive;
        }

        /* renamed from: getPolite-0phEisY, reason: not valid java name */
        public final int m26118getPolite0phEisY() {
            return LiveRegionMode.Polite;
        }

        private Companion() {
        }
    }

    private /* synthetic */ LiveRegionMode(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LiveRegionMode m26110boximpl(int i10) {
        return new LiveRegionMode(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m26111constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26112equalsimpl(int i10, Object obj) {
        return (obj instanceof LiveRegionMode) && i10 == ((LiveRegionMode) obj).m26116unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26113equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26114hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26115toStringimpl(int i10) {
        return m26113equalsimpl0(i10, Polite) ? "Polite" : m26113equalsimpl0(i10, Assertive) ? "Assertive" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m26112equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m26114hashCodeimpl(this.value);
    }

    public String toString() {
        return m26115toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m26116unboximpl() {
        return this.value;
    }
}
