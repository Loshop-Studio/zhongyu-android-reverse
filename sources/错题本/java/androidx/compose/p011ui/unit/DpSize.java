package androidx.compose.p011ui.unit;

import androidx.compose.p011ui.geometry.InlineClassHelperKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0010\u001a\u00020\u0007H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ\u0016\u0010\u0012\u001a\u00020\u0007H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000bJ$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u001cH\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010'J\u001e\u0010*\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001bJ\u001e\u0010*\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u001cH\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001dJ\u000f\u0010,\u001a\u00020-H\u0017¢\u0006\u0004\b.\u0010/R \u0010\u0006\u001a\u00020\u00078FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\tR \u0010\r\u001a\u00020\u00078FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, m5110d2 = {"Landroidx/compose/ui/unit/DpSize;", "", "packedValue", "", "constructor-impl", "(J)J", "height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM$annotations", "()V", "getHeight-D9Ej5fM", "(J)F", "getPackedValue$annotations", "width", "getWidth-D9Ej5fM$annotations", "getWidth-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "copy", "copy-DwJknco", "(JFF)J", "div", "other", "", "div-Gh9hcWk", "(JF)J", "", "(JI)J", "equals", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(J)I", "minus", "minus-e_xh8Ic", "(JJ)J", "plus", "plus-e_xh8Ic", "times", "times-Gh9hcWk", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,434:1\n60#2:435\n70#2:438\n53#2,3:441\n53#2,3:445\n53#2,3:449\n53#2,3:453\n53#2,3:457\n53#2,3:461\n53#2,3:465\n22#3:436\n22#3:439\n123#4:437\n123#4:440\n363#4:468\n52#5:444\n49#5:448\n68#5:452\n66#5:456\n60#5:460\n58#5:464\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n*L\n296#1:435\n301#1:438\n307#1:441,3\n312#1:445,3\n317#1:449,3\n325#1:453,3\n329#1:457,3\n333#1:461,3\n337#1:465,3\n296#1:436\n301#1:439\n296#1:437\n301#1:440\n341#1:468\n312#1:444\n317#1:448\n325#1:452\n329#1:456\n333#1:460\n337#1:464\n*E\n"})
/* loaded from: classes2.dex */
public final class DpSize {
    private final long packedValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = m13394constructorimpl(0);
    private static final long Unspecified = m13394constructorimpl(InlineClassHelperKt.UnspecifiedPackedFloats);

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, m5110d2 = {"Landroidx/compose/ui/unit/DpSize$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/unit/DpSize;", "getUnspecified-MYxV2XQ", "()J", "J", "Zero", "getZero-MYxV2XQ", "ui-unit_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        /* renamed from: getUnspecified-MYxV2XQ, reason: not valid java name */
        public final long m13412getUnspecifiedMYxV2XQ() {
            return DpSize.Unspecified;
        }

        /* renamed from: getZero-MYxV2XQ, reason: not valid java name */
        public final long m13413getZeroMYxV2XQ() {
            return DpSize.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ DpSize(long j7) {
        this.packedValue = j7;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpSize m13391boximpl(long j7) {
        return new DpSize(j7);
    }

    @Stable
    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public static final float m13392component1D9Ej5fM(long j7) {
        return m13403getWidthD9Ej5fM(j7);
    }

    @Stable
    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public static final float m13393component2D9Ej5fM(long j7) {
        return m13401getHeightD9Ej5fM(j7);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m13394constructorimpl(long j7) {
        return j7;
    }

    /* renamed from: copy-DwJknco, reason: not valid java name */
    public static final long m13395copyDwJknco(long j7, float f, float f7) {
        return m13394constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L));
    }

    /* renamed from: copy-DwJknco$default, reason: not valid java name */
    public static /* synthetic */ long m13396copyDwJknco$default(long j7, float f, float f7, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m13403getWidthD9Ej5fM(j7);
        }
        if ((i & 2) != 0) {
            f7 = m13401getHeightD9Ej5fM(j7);
        }
        return m13395copyDwJknco(j7, f, f7);
    }

    @Stable
    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m13398divGh9hcWk(long j7, int i) {
        float f = i;
        float fM13305constructorimpl = C2331Dp.m13305constructorimpl(m13403getWidthD9Ej5fM(j7) / f);
        float fM13305constructorimpl2 = C2331Dp.m13305constructorimpl(m13401getHeightD9Ej5fM(j7) / f);
        return m13394constructorimpl((Float.floatToRawIntBits(fM13305constructorimpl) << 32) | (Float.floatToRawIntBits(fM13305constructorimpl2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m13399equalsimpl(long j7, Object obj) {
        return (obj instanceof DpSize) && j7 == ((DpSize) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m13400equalsimpl0(long j7, long j8) {
        return j7 == j8;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public static final float m13401getHeightD9Ej5fM(long j7) {
        return C2331Dp.m13305constructorimpl(Float.intBitsToFloat((int) (j7 & 4294967295L)));
    }

    @Stable
    /* renamed from: getHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m13402getHeightD9Ej5fM$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public static final float m13403getWidthD9Ej5fM(long j7) {
        return C2331Dp.m13305constructorimpl(Float.intBitsToFloat((int) (j7 >> 32)));
    }

    @Stable
    /* renamed from: getWidth-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m13404getWidthD9Ej5fM$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m13405hashCodeimpl(long j7) {
        return Long.hashCode(j7);
    }

    @Stable
    /* renamed from: minus-e_xh8Ic, reason: not valid java name */
    public static final long m13406minuse_xh8Ic(long j7, long j8) {
        float fM13305constructorimpl = C2331Dp.m13305constructorimpl(m13403getWidthD9Ej5fM(j7) - m13403getWidthD9Ej5fM(j8));
        float fM13305constructorimpl2 = C2331Dp.m13305constructorimpl(m13401getHeightD9Ej5fM(j7) - m13401getHeightD9Ej5fM(j8));
        return m13394constructorimpl((Float.floatToRawIntBits(fM13305constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(fM13305constructorimpl2)));
    }

    @Stable
    /* renamed from: plus-e_xh8Ic, reason: not valid java name */
    public static final long m13407pluse_xh8Ic(long j7, long j8) {
        float fM13305constructorimpl = C2331Dp.m13305constructorimpl(m13403getWidthD9Ej5fM(j8) + m13403getWidthD9Ej5fM(j7));
        float fM13305constructorimpl2 = C2331Dp.m13305constructorimpl(m13401getHeightD9Ej5fM(j8) + m13401getHeightD9Ej5fM(j7));
        return m13394constructorimpl((Float.floatToRawIntBits(fM13305constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(fM13305constructorimpl2)));
    }

    @Stable
    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m13409timesGh9hcWk(long j7, int i) {
        float f = i;
        float fM13305constructorimpl = C2331Dp.m13305constructorimpl(m13403getWidthD9Ej5fM(j7) * f);
        float fM13305constructorimpl2 = C2331Dp.m13305constructorimpl(m13401getHeightD9Ej5fM(j7) * f);
        return m13394constructorimpl((Float.floatToRawIntBits(fM13305constructorimpl) << 32) | (Float.floatToRawIntBits(fM13305constructorimpl2) & 4294967295L));
    }

    @Stable
    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m13410toStringimpl(long j7) {
        if (j7 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "DpSize.Unspecified";
        }
        return ((Object) C2331Dp.m13316toStringimpl(m13403getWidthD9Ej5fM(j7))) + " x " + ((Object) C2331Dp.m13316toStringimpl(m13401getHeightD9Ej5fM(j7)));
    }

    public boolean equals(Object obj) {
        return m13399equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m13405hashCodeimpl(this.packedValue);
    }

    @Stable
    @NotNull
    public String toString() {
        return m13410toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    @Stable
    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m13397divGh9hcWk(long j7, float f) {
        float fM13305constructorimpl = C2331Dp.m13305constructorimpl(m13403getWidthD9Ej5fM(j7) / f);
        float fM13305constructorimpl2 = C2331Dp.m13305constructorimpl(m13401getHeightD9Ej5fM(j7) / f);
        return m13394constructorimpl((Float.floatToRawIntBits(fM13305constructorimpl) << 32) | (Float.floatToRawIntBits(fM13305constructorimpl2) & 4294967295L));
    }

    @Stable
    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m13408timesGh9hcWk(long j7, float f) {
        float fM13305constructorimpl = C2331Dp.m13305constructorimpl(m13403getWidthD9Ej5fM(j7) * f);
        float fM13305constructorimpl2 = C2331Dp.m13305constructorimpl(m13401getHeightD9Ej5fM(j7) * f);
        return m13394constructorimpl((Float.floatToRawIntBits(fM13305constructorimpl) << 32) | (Float.floatToRawIntBits(fM13305constructorimpl2) & 4294967295L));
    }
}
