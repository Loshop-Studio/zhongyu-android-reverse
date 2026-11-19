package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes.dex */
public final class ArcMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int ArcAbove = m20250constructorimpl(5);
    private static final int ArcBelow = m20250constructorimpl(4);
    private static final int ArcLinear = m20250constructorimpl(0);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getArcAbove--9T-Mq4, reason: not valid java name */
        public final int m20256getArcAbove9TMq4() {
            return ArcMode.ArcAbove;
        }

        /* renamed from: getArcBelow--9T-Mq4, reason: not valid java name */
        public final int m20257getArcBelow9TMq4() {
            return ArcMode.ArcBelow;
        }

        /* renamed from: getArcLinear--9T-Mq4, reason: not valid java name */
        public final int m20258getArcLinear9TMq4() {
            return ArcMode.ArcLinear;
        }

        private Companion() {
        }
    }

    private /* synthetic */ ArcMode(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ArcMode m20249boximpl(int i10) {
        return new ArcMode(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m20250constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m20251equalsimpl(int i10, Object obj) {
        return (obj instanceof ArcMode) && i10 == ((ArcMode) obj).m20255unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m20252equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m20253hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m20254toStringimpl(int i10) {
        return "ArcMode(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m20251equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m20253hashCodeimpl(this.value);
    }

    public String toString() {
        return m20254toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m20255unboximpl() {
        return this.value;
    }
}
