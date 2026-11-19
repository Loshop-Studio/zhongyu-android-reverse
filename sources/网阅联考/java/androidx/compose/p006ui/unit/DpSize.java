package androidx.compose.p006ui.unit;

import androidx.compose.animation.AbstractC0321a;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0010\u001a\u00020\u0007H\u0087\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ\u0019\u0010\u0012\u001a\u00020\u0007H\u0087\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u001cH\u0087\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001e\u0010%\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010'J!\u0010*\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001bJ!\u0010*\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u001cH\u0087\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001dJ\u000f\u0010,\u001a\u00020-H\u0017¢\u0006\u0004\b.\u0010/R#\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\tR#\u0010\r\u001a\u00020\u00078FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, m5175d2 = {"Landroidx/compose/ui/unit/DpSize;", "", "packedValue", "", "constructor-impl", "(J)J", "height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM$annotations", "()V", "getHeight-D9Ej5fM", "(J)F", "getPackedValue$annotations", "width", "getWidth-D9Ej5fM$annotations", "getWidth-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "copy", "copy-DwJknco", "(JFF)J", "div", "other", "", "div-Gh9hcWk", "(JF)J", "", "(JI)J", "equals", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(J)I", "minus", "minus-e_xh8Ic", "(JJ)J", "plus", "plus-e_xh8Ic", "times", "times-Gh9hcWk", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n34#2:558\n41#2:560\n174#3:559\n174#3:561\n473#3:568\n154#3:569\n58#4:562\n51#4:563\n92#4:564\n88#4:565\n75#4:566\n71#4:567\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n*L\n391#1:558\n404#1:560\n391#1:559\n404#1:561\n447#1:568\n457#1:569\n418#1:562\n425#1:563\n434#1:564\n437#1:565\n440#1:566\n443#1:567\n*E\n"})
/* loaded from: classes.dex */
public final class DpSize {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Unspecified;
    private static final long Zero;
    private final long packedValue;

    @Metadata(m5174d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, m5175d2 = {"Landroidx/compose/ui/unit/DpSize$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/unit/DpSize;", "getUnspecified-MYxV2XQ", "()J", "J", "Zero", "getZero-MYxV2XQ", "ui-unit_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getUnspecified-MYxV2XQ, reason: not valid java name */
        public final long m11632getUnspecifiedMYxV2XQ() {
            return DpSize.Unspecified;
        }

        /* renamed from: getZero-MYxV2XQ, reason: not valid java name */
        public final long m11633getZeroMYxV2XQ() {
            return DpSize.Zero;
        }
    }

    static {
        float f4 = 0;
        Zero = DpKt.m11547DpSizeYgX7TsA(C1700Dp.m11525constructorimpl(f4), C1700Dp.m11525constructorimpl(f4));
        C1700Dp.Companion companion = C1700Dp.INSTANCE;
        Unspecified = DpKt.m11547DpSizeYgX7TsA(companion.m11545getUnspecifiedD9Ej5fM(), companion.m11545getUnspecifiedD9Ej5fM());
    }

    private /* synthetic */ DpSize(long j4) {
        this.packedValue = j4;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpSize m11611boximpl(long j4) {
        return new DpSize(j4);
    }

    @Stable
    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public static final float m11612component1D9Ej5fM(long j4) {
        return m11623getWidthD9Ej5fM(j4);
    }

    @Stable
    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public static final float m11613component2D9Ej5fM(long j4) {
        return m11621getHeightD9Ej5fM(j4);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m11614constructorimpl(long j4) {
        return j4;
    }

    /* renamed from: copy-DwJknco, reason: not valid java name */
    public static final long m11615copyDwJknco(long j4, float f4, float f5) {
        return DpKt.m11547DpSizeYgX7TsA(f4, f5);
    }

    /* renamed from: copy-DwJknco$default, reason: not valid java name */
    public static /* synthetic */ long m11616copyDwJknco$default(long j4, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = m11623getWidthD9Ej5fM(j4);
        }
        if ((i4 & 2) != 0) {
            f5 = m11621getHeightD9Ej5fM(j4);
        }
        return m11615copyDwJknco(j4, f4, f5);
    }

    @Stable
    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m11618divGh9hcWk(long j4, int i4) {
        float f4 = i4;
        return DpKt.m11547DpSizeYgX7TsA(C1700Dp.m11525constructorimpl(m11623getWidthD9Ej5fM(j4) / f4), C1700Dp.m11525constructorimpl(m11621getHeightD9Ej5fM(j4) / f4));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11619equalsimpl(long j4, Object obj) {
        return (obj instanceof DpSize) && j4 == ((DpSize) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11620equalsimpl0(long j4, long j5) {
        return j4 == j5;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public static final float m11621getHeightD9Ej5fM(long j4) {
        if (!(j4 != Unspecified)) {
            throw new IllegalStateException("DpSize is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return C1700Dp.m11525constructorimpl(Float.intBitsToFloat((int) (j4 & 4294967295L)));
    }

    @Stable
    /* renamed from: getHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m11622getHeightD9Ej5fM$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public static final float m11623getWidthD9Ej5fM(long j4) {
        if (!(j4 != Unspecified)) {
            throw new IllegalStateException("DpSize is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return C1700Dp.m11525constructorimpl(Float.intBitsToFloat((int) (j4 >> 32)));
    }

    @Stable
    /* renamed from: getWidth-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m11624getWidthD9Ej5fM$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11625hashCodeimpl(long j4) {
        return AbstractC0321a.m137a(j4);
    }

    @Stable
    /* renamed from: minus-e_xh8Ic, reason: not valid java name */
    public static final long m11626minuse_xh8Ic(long j4, long j5) {
        return DpKt.m11547DpSizeYgX7TsA(C1700Dp.m11525constructorimpl(m11623getWidthD9Ej5fM(j4) - m11623getWidthD9Ej5fM(j5)), C1700Dp.m11525constructorimpl(m11621getHeightD9Ej5fM(j4) - m11621getHeightD9Ej5fM(j5)));
    }

    @Stable
    /* renamed from: plus-e_xh8Ic, reason: not valid java name */
    public static final long m11627pluse_xh8Ic(long j4, long j5) {
        return DpKt.m11547DpSizeYgX7TsA(C1700Dp.m11525constructorimpl(m11623getWidthD9Ej5fM(j4) + m11623getWidthD9Ej5fM(j5)), C1700Dp.m11525constructorimpl(m11621getHeightD9Ej5fM(j4) + m11621getHeightD9Ej5fM(j5)));
    }

    @Stable
    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m11629timesGh9hcWk(long j4, int i4) {
        float f4 = i4;
        return DpKt.m11547DpSizeYgX7TsA(C1700Dp.m11525constructorimpl(m11623getWidthD9Ej5fM(j4) * f4), C1700Dp.m11525constructorimpl(m11621getHeightD9Ej5fM(j4) * f4));
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11630toStringimpl(long j4) {
        if (!(j4 != INSTANCE.m11632getUnspecifiedMYxV2XQ())) {
            return "DpSize.Unspecified";
        }
        return ((Object) C1700Dp.m11536toStringimpl(m11623getWidthD9Ej5fM(j4))) + " x " + ((Object) C1700Dp.m11536toStringimpl(m11621getHeightD9Ej5fM(j4)));
    }

    public boolean equals(Object obj) {
        return m11619equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m11625hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m11630toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    @Stable
    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m11617divGh9hcWk(long j4, float f4) {
        return DpKt.m11547DpSizeYgX7TsA(C1700Dp.m11525constructorimpl(m11623getWidthD9Ej5fM(j4) / f4), C1700Dp.m11525constructorimpl(m11621getHeightD9Ej5fM(j4) / f4));
    }

    @Stable
    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m11628timesGh9hcWk(long j4, float f4) {
        return DpKt.m11547DpSizeYgX7TsA(C1700Dp.m11525constructorimpl(m11623getWidthD9Ej5fM(j4) * f4), C1700Dp.m11525constructorimpl(m11621getHeightD9Ej5fM(j4) * f4));
    }
}
