package androidx.compose.p006ui.unit;

import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.OffsetKt;
import androidx.compose.p006ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;

@Metadata(m5174d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a-\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\"\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\"\u0010\r\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a\"\u0010\u0013\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011\u001a\"\u0010\u0013\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0011\u001a\u001a\u0010\u0016\u001a\u00020\u0001*\u00020\u000eH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001a\u0010\u0019\u001a\u00020\u000e*\u00020\u0001H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, m5175d2 = {"IntOffset", "Landroidx/compose/ui/unit/IntOffset;", "x", "", "y", "(II)J", "lerp", "start", "stop", "fraction", "", "lerp-81ZRxRo", "(JJF)J", "minus", "Landroidx/compose/ui/geometry/Offset;", "offset", "minus-Nv-tHpc", "(JJ)J", "minus-oCl6YwE", "plus", "plus-Nv-tHpc", "plus-oCl6YwE", "round", "round-k-4lQ0M", "(J)J", "toOffset", "toOffset--gyyYBs", "ui-unit_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,179:1\n48#2:180\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n39#1:180\n*E\n"})
/* loaded from: classes.dex */
public final class IntOffsetKt {
    @Stable
    public static final long IntOffset(int i4, int i5) {
        return IntOffset.m11637constructorimpl((i5 & 4294967295L) | (i4 << 32));
    }

    @Stable
    /* renamed from: lerp-81ZRxRo, reason: not valid java name */
    public static final long m11654lerp81ZRxRo(long j4, long j5, float f4) {
        return IntOffset(MathHelpersKt.lerp(IntOffset.m11643getXimpl(j4), IntOffset.m11643getXimpl(j5), f4), MathHelpersKt.lerp(IntOffset.m11644getYimpl(j4), IntOffset.m11644getYimpl(j5), f4));
    }

    @Stable
    /* renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m11655minusNvtHpc(long j4, long j5) {
        return OffsetKt.Offset(Offset.m8945getXimpl(j4) - IntOffset.m11643getXimpl(j5), Offset.m8946getYimpl(j4) - IntOffset.m11644getYimpl(j5));
    }

    @Stable
    /* renamed from: minus-oCl6YwE, reason: not valid java name */
    public static final long m11656minusoCl6YwE(long j4, long j5) {
        return OffsetKt.Offset(IntOffset.m11643getXimpl(j4) - Offset.m8945getXimpl(j5), IntOffset.m11644getYimpl(j4) - Offset.m8946getYimpl(j5));
    }

    @Stable
    /* renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m11657plusNvtHpc(long j4, long j5) {
        return OffsetKt.Offset(Offset.m8945getXimpl(j4) + IntOffset.m11643getXimpl(j5), Offset.m8946getYimpl(j4) + IntOffset.m11644getYimpl(j5));
    }

    @Stable
    /* renamed from: plus-oCl6YwE, reason: not valid java name */
    public static final long m11658plusoCl6YwE(long j4, long j5) {
        return OffsetKt.Offset(IntOffset.m11643getXimpl(j4) + Offset.m8945getXimpl(j5), IntOffset.m11644getYimpl(j4) + Offset.m8946getYimpl(j5));
    }

    @Stable
    /* renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m11659roundk4lQ0M(long j4) {
        return IntOffset(MathKt__MathJVMKt.roundToInt(Offset.m8945getXimpl(j4)), MathKt__MathJVMKt.roundToInt(Offset.m8946getYimpl(j4)));
    }

    @Stable
    /* renamed from: toOffset--gyyYBs, reason: not valid java name */
    public static final long m11660toOffsetgyyYBs(long j4) {
        return OffsetKt.Offset(IntOffset.m11643getXimpl(j4), IntOffset.m11644getYimpl(j4));
    }
}
