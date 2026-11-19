package androidx.compose.p014ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* renamed from: androidx.compose.ui.unit.Dp */
/* loaded from: classes2.dex */
public final class C3186Dp implements Comparable<C3186Dp> {
    public static final Companion Companion = new Companion(null);
    private static final float Hairline = m33501constructorimpl(0.0f);
    private static final float Infinity = m33501constructorimpl(Float.POSITIVE_INFINITY);
    private static final float Unspecified = m33501constructorimpl(Float.NaN);
    private final float value;

    /* renamed from: androidx.compose.ui.unit.Dp$Companion */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        /* renamed from: getHairline-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m33516getHairlineD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getInfinity-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m33517getInfinityD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m33518getUnspecifiedD9Ej5fM$annotations() {
        }

        /* renamed from: getHairline-D9Ej5fM, reason: not valid java name */
        public final float m33519getHairlineD9Ej5fM() {
            return C3186Dp.Hairline;
        }

        /* renamed from: getInfinity-D9Ej5fM, reason: not valid java name */
        public final float m33520getInfinityD9Ej5fM() {
            return C3186Dp.Infinity;
        }

        /* renamed from: getUnspecified-D9Ej5fM, reason: not valid java name */
        public final float m33521getUnspecifiedD9Ej5fM() {
            return C3186Dp.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ C3186Dp(float f10) {
        this.value = f10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ C3186Dp m33499boximpl(float f10) {
        return new C3186Dp(f10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m33501constructorimpl(float f10) {
        return f10;
    }

    @Stable
    /* renamed from: div-0680j_4, reason: not valid java name */
    public static final float m33502div0680j_4(float f10, float f11) {
        return f10 / f11;
    }

    @Stable
    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m33503divu2uoSUM(float f10, float f11) {
        return m33501constructorimpl(f10 / f11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33505equalsimpl(float f10, Object obj) {
        return (obj instanceof C3186Dp) && Float.compare(f10, ((C3186Dp) obj).m33515unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33506equalsimpl0(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33507hashCodeimpl(float f10) {
        return Float.hashCode(f10);
    }

    @Stable
    /* renamed from: minus-5rwHm24, reason: not valid java name */
    public static final float m33508minus5rwHm24(float f10, float f11) {
        return m33501constructorimpl(f10 - f11);
    }

    @Stable
    /* renamed from: plus-5rwHm24, reason: not valid java name */
    public static final float m33509plus5rwHm24(float f10, float f11) {
        return m33501constructorimpl(f10 + f11);
    }

    @Stable
    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m33510timesu2uoSUM(float f10, float f11) {
        return m33501constructorimpl(f10 * f11);
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33512toStringimpl(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @Stable
    /* renamed from: unaryMinus-D9Ej5fM, reason: not valid java name */
    public static final float m33513unaryMinusD9Ej5fM(float f10) {
        return m33501constructorimpl(-f10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C3186Dp c3186Dp) {
        return m33514compareTo0680j_4(c3186Dp.m33515unboximpl());
    }

    @Stable
    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public int m33514compareTo0680j_4(float f10) {
        return m33500compareTo0680j_4(this.value, f10);
    }

    public boolean equals(Object obj) {
        return m33505equalsimpl(this.value, obj);
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return m33507hashCodeimpl(this.value);
    }

    @Stable
    public String toString() {
        return m33512toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m33515unboximpl() {
        return this.value;
    }

    @Stable
    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public static int m33500compareTo0680j_4(float f10, float f11) {
        return Float.compare(f10, f11);
    }

    @Stable
    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m33504divu2uoSUM(float f10, int i10) {
        return m33501constructorimpl(f10 / i10);
    }

    @Stable
    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m33511timesu2uoSUM(float f10, int i10) {
        return m33501constructorimpl(f10 * i10);
    }
}
