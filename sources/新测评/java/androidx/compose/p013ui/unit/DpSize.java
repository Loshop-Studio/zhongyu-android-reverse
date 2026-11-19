package androidx.compose.p013ui.unit;

import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0010\u001a\u00020\u0007H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ\u0016\u0010\u0012\u001a\u00020\u0007H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000bJ$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u001cH\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010'J\u001e\u0010*\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001bJ\u001e\u0010*\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u001cH\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001dJ\u000f\u0010,\u001a\u00020-H\u0017¢\u0006\u0004\b.\u0010/R \u0010\u0006\u001a\u00020\u00078FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\tR \u0010\r\u001a\u00020\u00078FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, m13558d2 = {"Landroidx/compose/ui/unit/DpSize;", "", "packedValue", "", "constructor-impl", "(J)J", "height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM$annotations", "()V", "getHeight-D9Ej5fM", "(J)F", "getPackedValue$annotations", "width", "getWidth-D9Ej5fM$annotations", "getWidth-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "copy", "copy-DwJknco", "(JFF)J", "div", "other", "", "div-Gh9hcWk", "(JF)J", "", "(JI)J", "equals", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(J)I", "minus", "minus-e_xh8Ic", "(JJ)J", "plus", "plus-e_xh8Ic", "times", "times-Gh9hcWk", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,434:1\n60#2:435\n70#2:438\n53#2,3:441\n53#2,3:445\n53#2,3:449\n53#2,3:453\n53#2,3:457\n53#2,3:461\n53#2,3:465\n22#3:436\n22#3:439\n123#4:437\n123#4:440\n363#4:468\n52#5:444\n49#5:448\n68#5:452\n66#5:456\n60#5:460\n58#5:464\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n*L\n296#1:435\n301#1:438\n307#1:441,3\n312#1:445,3\n317#1:449,3\n325#1:453,3\n329#1:457,3\n333#1:461,3\n337#1:465,3\n296#1:436\n301#1:439\n296#1:437\n301#1:440\n341#1:468\n312#1:444\n317#1:448\n325#1:452\n329#1:456\n333#1:460\n337#1:464\n*E\n"})
/* loaded from: classes2.dex */
public final class DpSize {
    private final long packedValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = m23650constructorimpl(0);
    private static final long Unspecified = m23650constructorimpl(InlineClassHelperKt.UnspecifiedPackedFloats);

    @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, m13558d2 = {"Landroidx/compose/ui/unit/DpSize$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/unit/DpSize;", "getUnspecified-MYxV2XQ", "()J", "J", "Zero", "getZero-MYxV2XQ", "ui-unit_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getUnspecified-MYxV2XQ, reason: not valid java name */
        public final long m23668getUnspecifiedMYxV2XQ() {
            return DpSize.Unspecified;
        }

        /* renamed from: getZero-MYxV2XQ, reason: not valid java name */
        public final long m23669getZeroMYxV2XQ() {
            return DpSize.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ DpSize(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpSize m23647boximpl(long j10) {
        return new DpSize(j10);
    }

    @Stable
    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public static final float m23648component1D9Ej5fM(long j10) {
        return m23659getWidthD9Ej5fM(j10);
    }

    @Stable
    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public static final float m23649component2D9Ej5fM(long j10) {
        return m23657getHeightD9Ej5fM(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m23650constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: copy-DwJknco, reason: not valid java name */
    public static final long m23651copyDwJknco(long j10, float f10, float f11) {
        return m23650constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* renamed from: copy-DwJknco$default, reason: not valid java name */
    public static /* synthetic */ long m23652copyDwJknco$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m23659getWidthD9Ej5fM(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m23657getHeightD9Ej5fM(j10);
        }
        return m23651copyDwJknco(j10, f10, f11);
    }

    @Stable
    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m23654divGh9hcWk(long j10, int i10) {
        float f10 = i10;
        float fM23561constructorimpl = C3127Dp.m23561constructorimpl(m23659getWidthD9Ej5fM(j10) / f10);
        float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl(m23657getHeightD9Ej5fM(j10) / f10);
        return m23650constructorimpl((Float.floatToRawIntBits(fM23561constructorimpl) << 32) | (Float.floatToRawIntBits(fM23561constructorimpl2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23655equalsimpl(long j10, Object obj) {
        return (obj instanceof DpSize) && j10 == ((DpSize) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23656equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public static final float m23657getHeightD9Ej5fM(long j10) {
        return C3127Dp.m23561constructorimpl(Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    @Stable
    /* renamed from: getHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m23658getHeightD9Ej5fM$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public static final float m23659getWidthD9Ej5fM(long j10) {
        return C3127Dp.m23561constructorimpl(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    @Stable
    /* renamed from: getWidth-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m23660getWidthD9Ej5fM$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23661hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    @Stable
    /* renamed from: minus-e_xh8Ic, reason: not valid java name */
    public static final long m23662minuse_xh8Ic(long j10, long j11) {
        float fM23561constructorimpl = C3127Dp.m23561constructorimpl(m23659getWidthD9Ej5fM(j10) - m23659getWidthD9Ej5fM(j11));
        float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl(m23657getHeightD9Ej5fM(j10) - m23657getHeightD9Ej5fM(j11));
        return m23650constructorimpl((Float.floatToRawIntBits(fM23561constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(fM23561constructorimpl2)));
    }

    @Stable
    /* renamed from: plus-e_xh8Ic, reason: not valid java name */
    public static final long m23663pluse_xh8Ic(long j10, long j11) {
        float fM23561constructorimpl = C3127Dp.m23561constructorimpl(m23659getWidthD9Ej5fM(j10) + m23659getWidthD9Ej5fM(j11));
        float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl(m23657getHeightD9Ej5fM(j10) + m23657getHeightD9Ej5fM(j11));
        return m23650constructorimpl((Float.floatToRawIntBits(fM23561constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(fM23561constructorimpl2)));
    }

    @Stable
    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m23665timesGh9hcWk(long j10, int i10) {
        float f10 = i10;
        float fM23561constructorimpl = C3127Dp.m23561constructorimpl(m23659getWidthD9Ej5fM(j10) * f10);
        float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl(m23657getHeightD9Ej5fM(j10) * f10);
        return m23650constructorimpl((Float.floatToRawIntBits(fM23561constructorimpl) << 32) | (Float.floatToRawIntBits(fM23561constructorimpl2) & 4294967295L));
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23666toStringimpl(long j10) {
        if (j10 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "DpSize.Unspecified";
        }
        return ((Object) C3127Dp.m23572toStringimpl(m23659getWidthD9Ej5fM(j10))) + " x " + ((Object) C3127Dp.m23572toStringimpl(m23657getHeightD9Ej5fM(j10)));
    }

    public boolean equals(Object obj) {
        return m23655equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m23661hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m23666toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    @Stable
    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m23653divGh9hcWk(long j10, float f10) {
        float fM23561constructorimpl = C3127Dp.m23561constructorimpl(m23659getWidthD9Ej5fM(j10) / f10);
        float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl(m23657getHeightD9Ej5fM(j10) / f10);
        return m23650constructorimpl((Float.floatToRawIntBits(fM23561constructorimpl) << 32) | (Float.floatToRawIntBits(fM23561constructorimpl2) & 4294967295L));
    }

    @Stable
    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m23664timesGh9hcWk(long j10, float f10) {
        float fM23561constructorimpl = C3127Dp.m23561constructorimpl(m23659getWidthD9Ej5fM(j10) * f10);
        float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl(m23657getHeightD9Ej5fM(j10) * f10);
        return m23650constructorimpl((Float.floatToRawIntBits(fM23561constructorimpl) << 32) | (Float.floatToRawIntBits(fM23561constructorimpl2) & 4294967295L));
    }
}
