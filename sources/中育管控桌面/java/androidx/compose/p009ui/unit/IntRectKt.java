package androidx.compose.p009ui.unit;

import androidx.compose.p009ui.geometry.Rect;
import androidx.compose.p009ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a \u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\f\u0010\u0015\u001a\u00020\u0001*\u00020\u0016H\u0007\u001a\f\u0010\u0017\u001a\u00020\u0016*\u00020\u0001H\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, m7880d2 = {"IntRect", "Landroidx/compose/ui/unit/IntRect;", "topLeft", "Landroidx/compose/ui/unit/IntOffset;", "bottomRight", "IntRect-E1MhUcY", "(JJ)Landroidx/compose/ui/unit/IntRect;", TypedValues.CycleType.S_WAVE_OFFSET, "size", "Landroidx/compose/ui/unit/IntSize;", "IntRect-VbeCjmY", "center", "radius", "", "IntRect-ar5cAso", "(JI)Landroidx/compose/ui/unit/IntRect;", "lerp", "start", "stop", "fraction", "", "roundToIntRect", "Landroidx/compose/ui/geometry/Rect;", "toRect", "ui-unit_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nIntRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRectKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,276:1\n54#2:277\n59#2:279\n85#3:278\n90#3:280\n26#4:281\n26#4:282\n26#4:283\n26#4:284\n*S KotlinDebug\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRectKt\n*L\n209#1:277\n210#1:279\n209#1:278\n210#1:280\n271#1:281\n272#1:282\n273#1:283\n274#1:284\n*E\n"})
/* loaded from: classes2.dex */
public final class IntRectKt {
    @Stable
    /* renamed from: IntRect-E1MhUcY, reason: not valid java name */
    public static final IntRect m16644IntRectE1MhUcY(long j6, long j7) {
        return new IntRect(IntOffset.m16612getXimpl(j6), IntOffset.m16613getYimpl(j6), IntOffset.m16612getXimpl(j7), IntOffset.m16613getYimpl(j7));
    }

    @Stable
    /* renamed from: IntRect-VbeCjmY, reason: not valid java name */
    public static final IntRect m16645IntRectVbeCjmY(long j6, long j7) {
        return new IntRect(IntOffset.m16612getXimpl(j6), IntOffset.m16613getYimpl(j6), IntOffset.m16612getXimpl(j6) + ((int) (j7 >> 32)), IntOffset.m16613getYimpl(j6) + ((int) (j7 & 4294967295L)));
    }

    @Stable
    /* renamed from: IntRect-ar5cAso, reason: not valid java name */
    public static final IntRect m16646IntRectar5cAso(long j6, int i6) {
        return new IntRect(IntOffset.m16612getXimpl(j6) - i6, IntOffset.m16613getYimpl(j6) - i6, IntOffset.m16612getXimpl(j6) + i6, IntOffset.m16613getYimpl(j6) + i6);
    }

    @Stable
    public static final IntRect lerp(IntRect intRect, IntRect intRect2, float f6) {
        return new IntRect(MathHelpersKt.lerp(intRect.getLeft(), intRect2.getLeft(), f6), MathHelpersKt.lerp(intRect.getTop(), intRect2.getTop(), f6), MathHelpersKt.lerp(intRect.getRight(), intRect2.getRight(), f6), MathHelpersKt.lerp(intRect.getBottom(), intRect2.getBottom(), f6));
    }

    @Stable
    public static final IntRect roundToIntRect(Rect rect) {
        return new IntRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.getRight()), Math.round(rect.getBottom()));
    }

    @Stable
    public static final Rect toRect(IntRect intRect) {
        return new Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }
}
