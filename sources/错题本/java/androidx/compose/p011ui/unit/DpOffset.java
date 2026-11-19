package androidx.compose.p011ui.unit;

import androidx.compose.p011ui.geometry.InlineClassHelperKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020#H\u0017¢\u0006\u0004\b$\u0010%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u00020\t8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\u00020\t8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\u0088\u0001\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, m5110d2 = {"Landroidx/compose/ui/unit/DpOffset;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue", "()J", "x", "Landroidx/compose/ui/unit/Dp;", "getX-D9Ej5fM$annotations", "()V", "getX-D9Ej5fM", "(J)F", "y", "getY-D9Ej5fM$annotations", "getY-D9Ej5fM", "copy", "copy-tPigGR8", "(JFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "minus", "minus-CB-Mgk4", "(JJ)J", "plus", "plus-CB-Mgk4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,434:1\n60#2:435\n70#2:438\n53#2,3:441\n53#2,3:445\n53#2,3:449\n22#3:436\n22#3:439\n123#4:437\n123#4:440\n254#4:452\n52#5:444\n49#5:448\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n*L\n210#1:435\n215#1:438\n218#1:441,3\n223#1:445,3\n228#1:449,3\n210#1:436\n215#1:439\n210#1:437\n215#1:440\n232#1:452\n223#1:444\n228#1:448\n*E\n"})
/* loaded from: classes2.dex */
public final class DpOffset {
    private final long packedValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = m13361constructorimpl(0);
    private static final long Unspecified = m13361constructorimpl(InlineClassHelperKt.UnspecifiedPackedFloats);

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, m5110d2 = {"Landroidx/compose/ui/unit/DpOffset$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/unit/DpOffset;", "getUnspecified-RKDOV3M", "()J", "J", "Zero", "getZero-RKDOV3M", "ui-unit_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        /* renamed from: getUnspecified-RKDOV3M, reason: not valid java name */
        public final long m13375getUnspecifiedRKDOV3M() {
            return DpOffset.Unspecified;
        }

        /* renamed from: getZero-RKDOV3M, reason: not valid java name */
        public final long m13376getZeroRKDOV3M() {
            return DpOffset.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ DpOffset(long j7) {
        this.packedValue = j7;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpOffset m13360boximpl(long j7) {
        return new DpOffset(j7);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m13361constructorimpl(long j7) {
        return j7;
    }

    /* renamed from: copy-tPigGR8, reason: not valid java name */
    public static final long m13362copytPigGR8(long j7, float f, float f7) {
        return m13361constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L));
    }

    /* renamed from: copy-tPigGR8$default, reason: not valid java name */
    public static /* synthetic */ long m13363copytPigGR8$default(long j7, float f, float f7, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m13366getXD9Ej5fM(j7);
        }
        if ((i & 2) != 0) {
            f7 = m13368getYD9Ej5fM(j7);
        }
        return m13362copytPigGR8(j7, f, f7);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m13364equalsimpl(long j7, Object obj) {
        return (obj instanceof DpOffset) && j7 == ((DpOffset) obj).m13374unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m13365equalsimpl0(long j7, long j8) {
        return j7 == j8;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public static final float m13366getXD9Ej5fM(long j7) {
        return C2331Dp.m13305constructorimpl(Float.intBitsToFloat((int) (j7 >> 32)));
    }

    @Stable
    /* renamed from: getX-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m13367getXD9Ej5fM$annotations() {
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public static final float m13368getYD9Ej5fM(long j7) {
        return C2331Dp.m13305constructorimpl(Float.intBitsToFloat((int) (j7 & 4294967295L)));
    }

    @Stable
    /* renamed from: getY-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m13369getYD9Ej5fM$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m13370hashCodeimpl(long j7) {
        return Long.hashCode(j7);
    }

    @Stable
    /* renamed from: minus-CB-Mgk4, reason: not valid java name */
    public static final long m13371minusCBMgk4(long j7, long j8) {
        float fM13305constructorimpl = C2331Dp.m13305constructorimpl(m13366getXD9Ej5fM(j7) - m13366getXD9Ej5fM(j8));
        float fM13305constructorimpl2 = C2331Dp.m13305constructorimpl(m13368getYD9Ej5fM(j7) - m13368getYD9Ej5fM(j8));
        return m13361constructorimpl((Float.floatToRawIntBits(fM13305constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(fM13305constructorimpl2)));
    }

    @Stable
    /* renamed from: plus-CB-Mgk4, reason: not valid java name */
    public static final long m13372plusCBMgk4(long j7, long j8) {
        float fM13305constructorimpl = C2331Dp.m13305constructorimpl(m13366getXD9Ej5fM(j8) + m13366getXD9Ej5fM(j7));
        float fM13305constructorimpl2 = C2331Dp.m13305constructorimpl(m13368getYD9Ej5fM(j8) + m13368getYD9Ej5fM(j7));
        return m13361constructorimpl((Float.floatToRawIntBits(fM13305constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(fM13305constructorimpl2)));
    }

    @Stable
    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m13373toStringimpl(long j7) {
        if (j7 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) C2331Dp.m13316toStringimpl(m13366getXD9Ej5fM(j7))) + ", " + ((Object) C2331Dp.m13316toStringimpl(m13368getYD9Ej5fM(j7))) + ')';
    }

    public boolean equals(Object obj) {
        return m13364equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m13370hashCodeimpl(this.packedValue);
    }

    @Stable
    @NotNull
    public String toString() {
        return m13373toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m13374unboximpl() {
        return this.packedValue;
    }
}
