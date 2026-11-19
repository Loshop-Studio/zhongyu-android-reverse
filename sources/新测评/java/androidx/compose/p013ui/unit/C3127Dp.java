package androidx.compose.p013ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0097\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u001e\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000fJ\u001b\u0010\u001c\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u000fJ\u001e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u000fJ\u001e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0011J\u000f\u0010 \u001a\u00020!H\u0017¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, m13558d2 = {"Landroidx/compose/ui/unit/Dp;", "", "value", "", "constructor-impl", "(F)F", "getValue", "()F", "compareTo", "", "other", "compareTo-0680j_4", "(FF)I", "div", "div-0680j_4", "(FF)F", "div-u2uoSUM", "(FI)F", "equals", "", "", "equals-impl", "(FLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(F)I", "minus", "minus-5rwHm24", "plus", "plus-5rwHm24", "times", "times-u2uoSUM", "toString", "", "toString-impl", "(F)Ljava/lang/String;", "unaryMinus", "unaryMinus-D9Ej5fM", "Companion", "ui-unit_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,434:1\n102#2:435\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n74#1:435\n*E\n"})
/* renamed from: androidx.compose.ui.unit.Dp */
/* loaded from: classes2.dex */
public final class C3127Dp implements Comparable<C3127Dp> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float Hairline = m23561constructorimpl(0.0f);
    private static final float Infinity = m23561constructorimpl(Float.POSITIVE_INFINITY);
    private static final float Unspecified = m23561constructorimpl(Float.NaN);
    private final float value;

    @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R$\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, m13558d2 = {"Landroidx/compose/ui/unit/Dp$Companion;", "", "()V", "Hairline", "Landroidx/compose/ui/unit/Dp;", "getHairline-D9Ej5fM$annotations", "getHairline-D9Ej5fM", "()F", "F", "Infinity", "getInfinity-D9Ej5fM$annotations", "getInfinity-D9Ej5fM", "Unspecified", "getUnspecified-D9Ej5fM$annotations", "getUnspecified-D9Ej5fM", "ui-unit_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    /* renamed from: androidx.compose.ui.unit.Dp$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getHairline-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m23576getHairlineD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getInfinity-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m23577getInfinityD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m23578getUnspecifiedD9Ej5fM$annotations() {
        }

        /* renamed from: getHairline-D9Ej5fM, reason: not valid java name */
        public final float m23579getHairlineD9Ej5fM() {
            return C3127Dp.Hairline;
        }

        /* renamed from: getInfinity-D9Ej5fM, reason: not valid java name */
        public final float m23580getInfinityD9Ej5fM() {
            return C3127Dp.Infinity;
        }

        /* renamed from: getUnspecified-D9Ej5fM, reason: not valid java name */
        public final float m23581getUnspecifiedD9Ej5fM() {
            return C3127Dp.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ C3127Dp(float f10) {
        this.value = f10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ C3127Dp m23559boximpl(float f10) {
        return new C3127Dp(f10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m23561constructorimpl(float f10) {
        return f10;
    }

    @Stable
    /* renamed from: div-0680j_4, reason: not valid java name */
    public static final float m23562div0680j_4(float f10, float f11) {
        return f10 / f11;
    }

    @Stable
    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m23563divu2uoSUM(float f10, float f11) {
        return m23561constructorimpl(f10 / f11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23565equalsimpl(float f10, Object obj) {
        return (obj instanceof C3127Dp) && Float.compare(f10, ((C3127Dp) obj).m23575unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23566equalsimpl0(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23567hashCodeimpl(float f10) {
        return Float.hashCode(f10);
    }

    @Stable
    /* renamed from: minus-5rwHm24, reason: not valid java name */
    public static final float m23568minus5rwHm24(float f10, float f11) {
        return m23561constructorimpl(f10 - f11);
    }

    @Stable
    /* renamed from: plus-5rwHm24, reason: not valid java name */
    public static final float m23569plus5rwHm24(float f10, float f11) {
        return m23561constructorimpl(f10 + f11);
    }

    @Stable
    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m23570timesu2uoSUM(float f10, float f11) {
        return m23561constructorimpl(f10 * f11);
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23572toStringimpl(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @Stable
    /* renamed from: unaryMinus-D9Ej5fM, reason: not valid java name */
    public static final float m23573unaryMinusD9Ej5fM(float f10) {
        return m23561constructorimpl(-f10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C3127Dp c3127Dp) {
        return m23574compareTo0680j_4(c3127Dp.m23575unboximpl());
    }

    @Stable
    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public int m23574compareTo0680j_4(float f10) {
        return m23560compareTo0680j_4(this.value, f10);
    }

    public boolean equals(Object obj) {
        return m23565equalsimpl(this.value, obj);
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return m23567hashCodeimpl(this.value);
    }

    @Stable
    public String toString() {
        return m23572toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m23575unboximpl() {
        return this.value;
    }

    @Stable
    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public static int m23560compareTo0680j_4(float f10, float f11) {
        return Float.compare(f10, f11);
    }

    @Stable
    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m23564divu2uoSUM(float f10, int i10) {
        return m23561constructorimpl(f10 / i10);
    }

    @Stable
    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m23571timesu2uoSUM(float f10, int i10) {
        return m23561constructorimpl(f10 * i10);
    }
}
