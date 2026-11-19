package androidx.compose.p012ui.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u0014\u0010\rJ'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\tH\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001e\u0010%\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\tH\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010\u001bJ\u000f\u0010'\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\u0088\u0001\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006,"}, m13413d2 = {"Landroidx/compose/ui/layout/ScaleFactor;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue", "()J", "scaleX", "", "getScaleX$annotations", "()V", "getScaleX-impl", "(J)F", "scaleY", "getScaleY$annotations", "getScaleY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-8GGzs04", "(JFF)J", "div", "operand", "div-44nBxM0", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "times", "times-44nBxM0", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n1#1,150:1\n41#1:155\n46#1:158\n41#1:165\n46#1:168\n41#1:170\n46#1:173\n41#1:179\n46#1:182\n41#1:188\n46#1:191\n60#2:151\n70#2:153\n60#2:156\n70#2:159\n53#2,3:162\n60#2:166\n70#2:169\n60#2:171\n70#2:174\n53#2,3:176\n60#2:180\n70#2:183\n53#2,3:185\n60#2:189\n70#2:192\n53#2,3:194\n22#3:152\n22#3:154\n22#3:157\n22#3:160\n22#3:167\n22#3:172\n22#3:181\n22#3:190\n31#4:161\n31#4:175\n31#4:184\n31#4:193\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n*L\n48#1:155\n50#1:158\n56#1:165\n56#1:168\n63#1:170\n63#1:173\n70#1:179\n70#1:182\n72#1:188\n72#1:191\n41#1:151\n46#1:153\n48#1:156\n50#1:159\n56#1:162,3\n56#1:166\n56#1:169\n63#1:171\n63#1:174\n63#1:176,3\n70#1:180\n70#1:183\n70#1:185,3\n72#1:189\n72#1:192\n80#1:194,3\n41#1:152\n46#1:154\n48#1:157\n50#1:160\n56#1:167\n63#1:172\n70#1:181\n72#1:190\n56#1:161\n63#1:175\n70#1:184\n80#1:193\n*E\n"})
/* loaded from: classes2.dex */
public final class ScaleFactor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Unspecified = m22840constructorimpl((Float.floatToRawIntBits(Float.NaN) << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L));
    private final long packedValue;

    @Metadata(m13412d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, m13413d2 = {"Landroidx/compose/ui/layout/ScaleFactor$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/layout/ScaleFactor;", "getUnspecified-_hLwfpc$annotations", "getUnspecified-_hLwfpc", "()J", "J", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getUnspecified-_hLwfpc$annotations, reason: not valid java name */
        public static /* synthetic */ void m22852getUnspecified_hLwfpc$annotations() {
        }

        /* renamed from: getUnspecified-_hLwfpc, reason: not valid java name */
        public final long m22853getUnspecified_hLwfpc() {
            return ScaleFactor.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ ScaleFactor(long j9) {
        this.packedValue = j9;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ScaleFactor m22837boximpl(long j9) {
        return new ScaleFactor(j9);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m22838component1impl(long j9) {
        return Float.intBitsToFloat((int) (j9 >> 32));
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m22839component2impl(long j9) {
        return Float.intBitsToFloat((int) (j9 & 4294967295L));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m22840constructorimpl(long j9) {
        return j9;
    }

    /* renamed from: copy-8GGzs04, reason: not valid java name */
    public static final long m22841copy8GGzs04(long j9, float f10, float f11) {
        return m22840constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* renamed from: copy-8GGzs04$default, reason: not valid java name */
    public static /* synthetic */ long m22842copy8GGzs04$default(long j9, float f10, float f11, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j9 >> 32));
        }
        if ((i9 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (4294967295L & j9));
        }
        return m22841copy8GGzs04(j9, f10, f11);
    }

    @Stable
    /* renamed from: div-44nBxM0, reason: not valid java name */
    public static final long m22843div44nBxM0(long j9, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) / f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L)) / f10;
        return m22840constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m22844equalsimpl(long j9, Object obj) {
        return (obj instanceof ScaleFactor) && j9 == ((ScaleFactor) obj).m22851unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m22845equalsimpl0(long j9, long j10) {
        return j9 == j10;
    }

    @Stable
    public static /* synthetic */ void getScaleX$annotations() {
    }

    /* renamed from: getScaleX-impl, reason: not valid java name */
    public static final float m22846getScaleXimpl(long j9) {
        return Float.intBitsToFloat((int) (j9 >> 32));
    }

    @Stable
    public static /* synthetic */ void getScaleY$annotations() {
    }

    /* renamed from: getScaleY-impl, reason: not valid java name */
    public static final float m22847getScaleYimpl(long j9) {
        return Float.intBitsToFloat((int) (j9 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m22848hashCodeimpl(long j9) {
        return Long.hashCode(j9);
    }

    @Stable
    /* renamed from: times-44nBxM0, reason: not valid java name */
    public static final long m22849times44nBxM0(long j9, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L)) * f10;
        return m22840constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m22850toStringimpl(long j9) {
        return "ScaleFactor(" + Float.intBitsToFloat((int) (j9 >> 32)) + ", " + Float.intBitsToFloat((int) (j9 & 4294967295L)) + ')';
    }

    public boolean equals(Object obj) {
        return m22844equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m22848hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m22850toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m22851unboximpl() {
        return this.packedValue;
    }
}
