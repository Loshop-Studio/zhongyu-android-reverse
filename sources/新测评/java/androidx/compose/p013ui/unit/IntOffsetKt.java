package androidx.compose.p013ui.unit;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\b¢\u0006\u0002\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\r\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0011\u001a\u0016\u0010\u0016\u001a\u00020\u0001*\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u000e*\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, m13558d2 = {"IntOffset", "Landroidx/compose/ui/unit/IntOffset;", "x", "", "y", "(II)J", "lerp", "start", "stop", "fraction", "", "lerp-81ZRxRo", "(JJF)J", "minus", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "minus-Nv-tHpc", "(JJ)J", "minus-oCl6YwE", "plus", "plus-Nv-tHpc", "plus-oCl6YwE", "round", "round-k-4lQ0M", "(J)J", "toOffset", "toOffset--gyyYBs", "ui-unit_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,171:1\n80#2:172\n80#2:173\n53#2,3:175\n60#2:179\n70#2:182\n53#2,3:184\n60#2:188\n70#2:191\n53#2,3:193\n60#2:197\n70#2:200\n53#2,3:202\n60#2:206\n70#2:209\n53#2,3:211\n60#2:215\n70#2,11:222\n30#3:174\n30#3:183\n30#3:192\n30#3:201\n30#3:210\n65#4:178\n69#4:181\n65#4:187\n69#4:190\n65#4:196\n69#4:199\n65#4:205\n69#4:208\n65#4:214\n69#4:221\n22#5:180\n22#5:189\n22#5:198\n22#5:207\n22#5,5:216\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n32#1:172\n156#1:173\n159#1:175,3\n161#1:179\n161#1:182\n161#1:184,3\n163#1:188\n163#1:191\n163#1:193,3\n165#1:197\n165#1:200\n165#1:202,3\n167#1:206\n167#1:209\n167#1:211,3\n170#1:215\n170#1:222,11\n159#1:174\n161#1:183\n163#1:192\n165#1:201\n167#1:210\n161#1:178\n161#1:181\n163#1:187\n163#1:190\n165#1:196\n165#1:199\n167#1:205\n167#1:208\n170#1:214\n170#1:221\n161#1:180\n163#1:189\n165#1:198\n167#1:207\n170#1:216,5\n*E\n"})
/* loaded from: classes2.dex */
public final class IntOffsetKt {
    @Stable
    public static final long IntOffset(int i10, int i11) {
        return IntOffset.m23683constructorimpl((i11 & 4294967295L) | (i10 << 32));
    }

    @Stable
    /* renamed from: lerp-81ZRxRo, reason: not valid java name */
    public static final long m23701lerp81ZRxRo(long j10, long j11, float f10) {
        return IntOffset.m23683constructorimpl((MathHelpersKt.lerp(IntOffset.m23689getXimpl(j10), IntOffset.m23689getXimpl(j11), f10) << 32) | (MathHelpersKt.lerp(IntOffset.m23690getYimpl(j10), IntOffset.m23690getYimpl(j11), f10) & 4294967295L));
    }

    @Stable
    /* renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m23702minusNvtHpc(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - IntOffset.m23689getXimpl(j11);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - IntOffset.m23690getYimpl(j11);
        return Offset.m20727constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: minus-oCl6YwE, reason: not valid java name */
    public static final long m23703minusoCl6YwE(long j10, long j11) {
        float fM23689getXimpl = IntOffset.m23689getXimpl(j10) - Float.intBitsToFloat((int) (j11 >> 32));
        float fM23690getYimpl = IntOffset.m23690getYimpl(j10) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return Offset.m20727constructorimpl((Float.floatToRawIntBits(fM23689getXimpl) << 32) | (Float.floatToRawIntBits(fM23690getYimpl) & 4294967295L));
    }

    @Stable
    /* renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m23704plusNvtHpc(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + IntOffset.m23689getXimpl(j11);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) + IntOffset.m23690getYimpl(j11);
        return Offset.m20727constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: plus-oCl6YwE, reason: not valid java name */
    public static final long m23705plusoCl6YwE(long j10, long j11) {
        float fM23689getXimpl = IntOffset.m23689getXimpl(j10) + Float.intBitsToFloat((int) (j11 >> 32));
        float fM23690getYimpl = IntOffset.m23690getYimpl(j10) + Float.intBitsToFloat((int) (j11 & 4294967295L));
        return Offset.m20727constructorimpl((Float.floatToRawIntBits(fM23689getXimpl) << 32) | (Float.floatToRawIntBits(fM23690getYimpl) & 4294967295L));
    }

    @Stable
    /* renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m23706roundk4lQ0M(long j10) {
        return IntOffset.m23683constructorimpl((Math.round(Float.intBitsToFloat((int) (j10 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j10 >> 32))) << 32));
    }

    @Stable
    /* renamed from: toOffset--gyyYBs, reason: not valid java name */
    public static final long m23707toOffsetgyyYBs(long j10) {
        float fM23689getXimpl = IntOffset.m23689getXimpl(j10);
        float fM23690getYimpl = IntOffset.m23690getYimpl(j10);
        return Offset.m20727constructorimpl((Float.floatToRawIntBits(fM23690getYimpl) & 4294967295L) | (Float.floatToRawIntBits(fM23689getXimpl) << 32));
    }
}
