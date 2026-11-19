package androidx.compose.p013ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* renamed from: androidx.compose.ui.unit.Dp */
/* loaded from: classes2.dex */
public final class C3156Dp implements Comparable<C3156Dp> {
    public static final Companion Companion = new Companion(null);
    private static final float Hairline = m26899constructorimpl(0.0f);
    private static final float Infinity = m26899constructorimpl(Float.POSITIVE_INFINITY);
    private static final float Unspecified = m26899constructorimpl(Float.NaN);
    private final float value;

    /* renamed from: androidx.compose.ui.unit.Dp$Companion */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        @Stable
        /* renamed from: getHairline-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m26914getHairlineD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getInfinity-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m26915getInfinityD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m26916getUnspecifiedD9Ej5fM$annotations() {
        }

        /* renamed from: getHairline-D9Ej5fM, reason: not valid java name */
        public final float m26917getHairlineD9Ej5fM() {
            return C3156Dp.Hairline;
        }

        /* renamed from: getInfinity-D9Ej5fM, reason: not valid java name */
        public final float m26918getInfinityD9Ej5fM() {
            return C3156Dp.Infinity;
        }

        /* renamed from: getUnspecified-D9Ej5fM, reason: not valid java name */
        public final float m26919getUnspecifiedD9Ej5fM() {
            return C3156Dp.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ C3156Dp(float f10) {
        this.value = f10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ C3156Dp m26897boximpl(float f10) {
        return new C3156Dp(f10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m26899constructorimpl(float f10) {
        return f10;
    }

    @Stable
    /* renamed from: div-0680j_4, reason: not valid java name */
    public static final float m26900div0680j_4(float f10, float f11) {
        return f10 / f11;
    }

    @Stable
    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m26901divu2uoSUM(float f10, float f11) {
        return m26899constructorimpl(f10 / f11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26903equalsimpl(float f10, Object obj) {
        return (obj instanceof C3156Dp) && Float.compare(f10, ((C3156Dp) obj).m26913unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26904equalsimpl0(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26905hashCodeimpl(float f10) {
        return Float.hashCode(f10);
    }

    @Stable
    /* renamed from: minus-5rwHm24, reason: not valid java name */
    public static final float m26906minus5rwHm24(float f10, float f11) {
        return m26899constructorimpl(f10 - f11);
    }

    @Stable
    /* renamed from: plus-5rwHm24, reason: not valid java name */
    public static final float m26907plus5rwHm24(float f10, float f11) {
        return m26899constructorimpl(f10 + f11);
    }

    @Stable
    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m26908timesu2uoSUM(float f10, float f11) {
        return m26899constructorimpl(f10 * f11);
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26910toStringimpl(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @Stable
    /* renamed from: unaryMinus-D9Ej5fM, reason: not valid java name */
    public static final float m26911unaryMinusD9Ej5fM(float f10) {
        return m26899constructorimpl(-f10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C3156Dp c3156Dp) {
        return m26912compareTo0680j_4(c3156Dp.m26913unboximpl());
    }

    @Stable
    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public int m26912compareTo0680j_4(float f10) {
        return m26898compareTo0680j_4(this.value, f10);
    }

    public boolean equals(Object obj) {
        return m26903equalsimpl(this.value, obj);
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return m26905hashCodeimpl(this.value);
    }

    @Stable
    public String toString() {
        return m26910toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m26913unboximpl() {
        return this.value;
    }

    @Stable
    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public static int m26898compareTo0680j_4(float f10, float f11) {
        return Float.compare(f10, f11);
    }

    @Stable
    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m26902divu2uoSUM(float f10, int i10) {
        return m26899constructorimpl(f10 / i10);
    }

    @Stable
    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m26909timesu2uoSUM(float f10, int i10) {
        return m26899constructorimpl(f10 * i10);
    }
}
