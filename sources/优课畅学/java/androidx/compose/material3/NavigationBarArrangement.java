package androidx.compose.material3;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public final class NavigationBarArrangement {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int EqualWeight = m22247constructorimpl(0);
    private static final int Centered = m22247constructorimpl(1);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getCentered-Ebr7WPU, reason: not valid java name */
        public final int m22253getCenteredEbr7WPU() {
            return NavigationBarArrangement.Centered;
        }

        /* renamed from: getEqualWeight-Ebr7WPU, reason: not valid java name */
        public final int m22254getEqualWeightEbr7WPU() {
            return NavigationBarArrangement.EqualWeight;
        }

        private Companion() {
        }
    }

    private /* synthetic */ NavigationBarArrangement(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NavigationBarArrangement m22246boximpl(int i10) {
        return new NavigationBarArrangement(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m22247constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m22248equalsimpl(int i10, Object obj) {
        return (obj instanceof NavigationBarArrangement) && i10 == ((NavigationBarArrangement) obj).m22252unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m22249equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m22250hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m22251toStringimpl(int i10) {
        return m22249equalsimpl0(i10, EqualWeight) ? "EqualWeight" : m22249equalsimpl0(i10, Centered) ? "Centered" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m22248equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m22250hashCodeimpl(this.value);
    }

    public String toString() {
        return m22251toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m22252unboximpl() {
        return this.value;
    }
}
