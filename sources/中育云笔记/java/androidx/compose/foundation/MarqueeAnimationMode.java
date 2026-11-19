package androidx.compose.foundation;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes.dex */
public final class MarqueeAnimationMode {
    public static final Companion Companion = new Companion(null);
    private static final int Immediately = m27027constructorimpl(0);
    private static final int WhileFocused = m27027constructorimpl(1);
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getImmediately-ZbEOnfQ, reason: not valid java name */
        public final int m27033getImmediatelyZbEOnfQ() {
            return MarqueeAnimationMode.Immediately;
        }

        /* renamed from: getWhileFocused-ZbEOnfQ, reason: not valid java name */
        public final int m27034getWhileFocusedZbEOnfQ() {
            return MarqueeAnimationMode.WhileFocused;
        }

        private Companion() {
        }
    }

    private /* synthetic */ MarqueeAnimationMode(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MarqueeAnimationMode m27026boximpl(int i10) {
        return new MarqueeAnimationMode(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m27027constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m27028equalsimpl(int i10, Object obj) {
        return (obj instanceof MarqueeAnimationMode) && i10 == ((MarqueeAnimationMode) obj).m27032unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27029equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m27030hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m27031toStringimpl(int i10) {
        if (m27029equalsimpl0(i10, Immediately)) {
            return "Immediately";
        }
        if (m27029equalsimpl0(i10, WhileFocused)) {
            return "WhileFocused";
        }
        throw new IllegalStateException(("invalid value: " + i10).toString());
    }

    public boolean equals(Object obj) {
        return m27028equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m27030hashCodeimpl(this.value);
    }

    public String toString() {
        return m27031toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m27032unboximpl() {
        return this.value;
    }
}
