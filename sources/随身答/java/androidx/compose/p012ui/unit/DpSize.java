package androidx.compose.p012ui.unit;

import androidx.compose.p012ui.geometry.InlineClassHelperKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0010\u001a\u00020\u0007H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ\u0016\u0010\u0012\u001a\u00020\u0007H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000bJ$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u001cH\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010'J\u001e\u0010*\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001bJ\u001e\u0010*\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u001cH\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001dJ\u000f\u0010,\u001a\u00020-H\u0017¢\u0006\u0004\b.\u0010/R \u0010\u0006\u001a\u00020\u00078FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\tR \u0010\r\u001a\u00020\u00078FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, m13413d2 = {"Landroidx/compose/ui/unit/DpSize;", "", "packedValue", "", "constructor-impl", "(J)J", "height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM$annotations", "()V", "getHeight-D9Ej5fM", "(J)F", "getPackedValue$annotations", "width", "getWidth-D9Ej5fM$annotations", "getWidth-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "copy", "copy-DwJknco", "(JFF)J", "div", "other", "", "div-Gh9hcWk", "(JF)J", "", "(JI)J", "equals", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(J)I", "minus", "minus-e_xh8Ic", "(JJ)J", "plus", "plus-e_xh8Ic", "times", "times-Gh9hcWk", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,434:1\n60#2:435\n70#2:438\n53#2,3:441\n53#2,3:445\n53#2,3:449\n53#2,3:453\n53#2,3:457\n53#2,3:461\n53#2,3:465\n22#3:436\n22#3:439\n123#4:437\n123#4:440\n363#4:468\n52#5:444\n49#5:448\n68#5:452\n66#5:456\n60#5:460\n58#5:464\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n*L\n296#1:435\n301#1:438\n307#1:441,3\n312#1:445,3\n317#1:449,3\n325#1:453,3\n329#1:457,3\n333#1:461,3\n337#1:465,3\n296#1:436\n301#1:439\n296#1:437\n301#1:440\n341#1:468\n312#1:444\n317#1:448\n325#1:452\n329#1:456\n333#1:460\n337#1:464\n*E\n"})
/* loaded from: classes2.dex */
public final class DpSize {
    private final long packedValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = m24083constructorimpl(0);
    private static final long Unspecified = m24083constructorimpl(InlineClassHelperKt.UnspecifiedPackedFloats);

    @Metadata(m13412d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, m13413d2 = {"Landroidx/compose/ui/unit/DpSize$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/unit/DpSize;", "getUnspecified-MYxV2XQ", "()J", "J", "Zero", "getZero-MYxV2XQ", "ui-unit_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getUnspecified-MYxV2XQ, reason: not valid java name */
        public final long m24101getUnspecifiedMYxV2XQ() {
            return DpSize.Unspecified;
        }

        /* renamed from: getZero-MYxV2XQ, reason: not valid java name */
        public final long m24102getZeroMYxV2XQ() {
            return DpSize.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ DpSize(long j9) {
        this.packedValue = j9;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpSize m24080boximpl(long j9) {
        return new DpSize(j9);
    }

    @Stable
    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public static final float m24081component1D9Ej5fM(long j9) {
        return m24092getWidthD9Ej5fM(j9);
    }

    @Stable
    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public static final float m24082component2D9Ej5fM(long j9) {
        return m24090getHeightD9Ej5fM(j9);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m24083constructorimpl(long j9) {
        return j9;
    }

    /* renamed from: copy-DwJknco, reason: not valid java name */
    public static final long m24084copyDwJknco(long j9, float f10, float f11) {
        return m24083constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* renamed from: copy-DwJknco$default, reason: not valid java name */
    public static /* synthetic */ long m24085copyDwJknco$default(long j9, float f10, float f11, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            f10 = m24092getWidthD9Ej5fM(j9);
        }
        if ((i9 & 2) != 0) {
            f11 = m24090getHeightD9Ej5fM(j9);
        }
        return m24084copyDwJknco(j9, f10, f11);
    }

    @Stable
    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m24087divGh9hcWk(long j9, int i9) {
        float f10 = i9;
        float fM23994constructorimpl = C3115Dp.m23994constructorimpl(m24092getWidthD9Ej5fM(j9) / f10);
        float fM23994constructorimpl2 = C3115Dp.m23994constructorimpl(m24090getHeightD9Ej5fM(j9) / f10);
        return m24083constructorimpl((Float.floatToRawIntBits(fM23994constructorimpl) << 32) | (Float.floatToRawIntBits(fM23994constructorimpl2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24088equalsimpl(long j9, Object obj) {
        return (obj instanceof DpSize) && j9 == ((DpSize) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24089equalsimpl0(long j9, long j10) {
        return j9 == j10;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public static final float m24090getHeightD9Ej5fM(long j9) {
        return C3115Dp.m23994constructorimpl(Float.intBitsToFloat((int) (j9 & 4294967295L)));
    }

    @Stable
    /* renamed from: getHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m24091getHeightD9Ej5fM$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public static final float m24092getWidthD9Ej5fM(long j9) {
        return C3115Dp.m23994constructorimpl(Float.intBitsToFloat((int) (j9 >> 32)));
    }

    @Stable
    /* renamed from: getWidth-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m24093getWidthD9Ej5fM$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24094hashCodeimpl(long j9) {
        return Long.hashCode(j9);
    }

    @Stable
    /* renamed from: minus-e_xh8Ic, reason: not valid java name */
    public static final long m24095minuse_xh8Ic(long j9, long j10) {
        float fM23994constructorimpl = C3115Dp.m23994constructorimpl(m24092getWidthD9Ej5fM(j9) - m24092getWidthD9Ej5fM(j10));
        float fM23994constructorimpl2 = C3115Dp.m23994constructorimpl(m24090getHeightD9Ej5fM(j9) - m24090getHeightD9Ej5fM(j10));
        return m24083constructorimpl((Float.floatToRawIntBits(fM23994constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(fM23994constructorimpl2)));
    }

    @Stable
    /* renamed from: plus-e_xh8Ic, reason: not valid java name */
    public static final long m24096pluse_xh8Ic(long j9, long j10) {
        float fM23994constructorimpl = C3115Dp.m23994constructorimpl(m24092getWidthD9Ej5fM(j9) + m24092getWidthD9Ej5fM(j10));
        float fM23994constructorimpl2 = C3115Dp.m23994constructorimpl(m24090getHeightD9Ej5fM(j9) + m24090getHeightD9Ej5fM(j10));
        return m24083constructorimpl((Float.floatToRawIntBits(fM23994constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(fM23994constructorimpl2)));
    }

    @Stable
    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m24098timesGh9hcWk(long j9, int i9) {
        float f10 = i9;
        float fM23994constructorimpl = C3115Dp.m23994constructorimpl(m24092getWidthD9Ej5fM(j9) * f10);
        float fM23994constructorimpl2 = C3115Dp.m23994constructorimpl(m24090getHeightD9Ej5fM(j9) * f10);
        return m24083constructorimpl((Float.floatToRawIntBits(fM23994constructorimpl) << 32) | (Float.floatToRawIntBits(fM23994constructorimpl2) & 4294967295L));
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m24099toStringimpl(long j9) {
        if (j9 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "DpSize.Unspecified";
        }
        return ((Object) C3115Dp.m24005toStringimpl(m24092getWidthD9Ej5fM(j9))) + " x " + ((Object) C3115Dp.m24005toStringimpl(m24090getHeightD9Ej5fM(j9)));
    }

    public boolean equals(Object obj) {
        return m24088equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m24094hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m24099toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    @Stable
    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m24086divGh9hcWk(long j9, float f10) {
        float fM23994constructorimpl = C3115Dp.m23994constructorimpl(m24092getWidthD9Ej5fM(j9) / f10);
        float fM23994constructorimpl2 = C3115Dp.m23994constructorimpl(m24090getHeightD9Ej5fM(j9) / f10);
        return m24083constructorimpl((Float.floatToRawIntBits(fM23994constructorimpl) << 32) | (Float.floatToRawIntBits(fM23994constructorimpl2) & 4294967295L));
    }

    @Stable
    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m24097timesGh9hcWk(long j9, float f10) {
        float fM23994constructorimpl = C3115Dp.m23994constructorimpl(m24092getWidthD9Ej5fM(j9) * f10);
        float fM23994constructorimpl2 = C3115Dp.m23994constructorimpl(m24090getHeightD9Ej5fM(j9) * f10);
        return m24083constructorimpl((Float.floatToRawIntBits(fM23994constructorimpl) << 32) | (Float.floatToRawIntBits(fM23994constructorimpl2) & 4294967295L));
    }
}
