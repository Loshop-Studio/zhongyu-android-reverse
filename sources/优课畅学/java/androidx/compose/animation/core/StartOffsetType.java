package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes.dex */
public final class StartOffsetType {
    public static final Companion Companion = new Companion(null);
    private static final int Delay = m20288constructorimpl(-1);
    private static final int FastForward = m20288constructorimpl(1);
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getDelay-Eo1U57Q, reason: not valid java name */
        public final int m20294getDelayEo1U57Q() {
            return StartOffsetType.Delay;
        }

        /* renamed from: getFastForward-Eo1U57Q, reason: not valid java name */
        public final int m20295getFastForwardEo1U57Q() {
            return StartOffsetType.FastForward;
        }

        private Companion() {
        }
    }

    private /* synthetic */ StartOffsetType(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffsetType m20287boximpl(int i10) {
        return new StartOffsetType(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m20288constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m20289equalsimpl(int i10, Object obj) {
        return (obj instanceof StartOffsetType) && i10 == ((StartOffsetType) obj).m20293unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m20290equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m20291hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m20292toStringimpl(int i10) {
        return "StartOffsetType(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m20289equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m20291hashCodeimpl(this.value);
    }

    public String toString() {
        return m20292toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m20293unboximpl() {
        return this.value;
    }
}
