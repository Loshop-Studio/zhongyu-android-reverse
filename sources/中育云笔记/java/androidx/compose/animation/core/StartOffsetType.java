package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes.dex */
public final class StartOffsetType {
    public static final Companion Companion = new Companion(null);
    private static final int Delay = m26890constructorimpl(-1);
    private static final int FastForward = m26890constructorimpl(1);
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getDelay-Eo1U57Q, reason: not valid java name */
        public final int m26896getDelayEo1U57Q() {
            return StartOffsetType.Delay;
        }

        /* renamed from: getFastForward-Eo1U57Q, reason: not valid java name */
        public final int m26897getFastForwardEo1U57Q() {
            return StartOffsetType.FastForward;
        }

        private Companion() {
        }
    }

    private /* synthetic */ StartOffsetType(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffsetType m26889boximpl(int i10) {
        return new StartOffsetType(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m26890constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26891equalsimpl(int i10, Object obj) {
        return (obj instanceof StartOffsetType) && i10 == ((StartOffsetType) obj).m26895unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26892equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26893hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26894toStringimpl(int i10) {
        return "StartOffsetType(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m26891equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m26893hashCodeimpl(this.value);
    }

    public String toString() {
        return m26894toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m26895unboximpl() {
        return this.value;
    }
}
