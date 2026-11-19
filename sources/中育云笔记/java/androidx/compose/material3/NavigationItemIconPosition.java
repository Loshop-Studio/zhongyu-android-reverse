package androidx.compose.material3;

import kotlin.jvm.internal.AbstractC9972n;

@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class NavigationItemIconPosition {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Top = m28905constructorimpl(0);
    private static final int Start = m28905constructorimpl(1);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getStart--xw1Ddg, reason: not valid java name */
        public final int m28911getStartxw1Ddg() {
            return NavigationItemIconPosition.Start;
        }

        /* renamed from: getTop--xw1Ddg, reason: not valid java name */
        public final int m28912getTopxw1Ddg() {
            return NavigationItemIconPosition.Top;
        }

        private Companion() {
        }
    }

    private /* synthetic */ NavigationItemIconPosition(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NavigationItemIconPosition m28904boximpl(int i10) {
        return new NavigationItemIconPosition(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m28905constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m28906equalsimpl(int i10, Object obj) {
        return (obj instanceof NavigationItemIconPosition) && i10 == ((NavigationItemIconPosition) obj).m28910unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m28907equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m28908hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m28909toStringimpl(int i10) {
        return m28907equalsimpl0(i10, Top) ? "Top" : m28907equalsimpl0(i10, Start) ? "Start" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m28906equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m28908hashCodeimpl(this.value);
    }

    public String toString() {
        return m28909toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m28910unboximpl() {
        return this.value;
    }
}
