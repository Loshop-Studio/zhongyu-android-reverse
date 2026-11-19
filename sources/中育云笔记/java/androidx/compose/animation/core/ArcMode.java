package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes.dex */
public final class ArcMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int ArcAbove = m26852constructorimpl(5);
    private static final int ArcBelow = m26852constructorimpl(4);
    private static final int ArcLinear = m26852constructorimpl(0);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getArcAbove--9T-Mq4, reason: not valid java name */
        public final int m26858getArcAbove9TMq4() {
            return ArcMode.ArcAbove;
        }

        /* renamed from: getArcBelow--9T-Mq4, reason: not valid java name */
        public final int m26859getArcBelow9TMq4() {
            return ArcMode.ArcBelow;
        }

        /* renamed from: getArcLinear--9T-Mq4, reason: not valid java name */
        public final int m26860getArcLinear9TMq4() {
            return ArcMode.ArcLinear;
        }

        private Companion() {
        }
    }

    private /* synthetic */ ArcMode(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ArcMode m26851boximpl(int i10) {
        return new ArcMode(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m26852constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26853equalsimpl(int i10, Object obj) {
        return (obj instanceof ArcMode) && i10 == ((ArcMode) obj).m26857unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26854equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26855hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26856toStringimpl(int i10) {
        return "ArcMode(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m26853equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m26855hashCodeimpl(this.value);
    }

    public String toString() {
        return m26856toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m26857unboximpl() {
        return this.value;
    }
}
