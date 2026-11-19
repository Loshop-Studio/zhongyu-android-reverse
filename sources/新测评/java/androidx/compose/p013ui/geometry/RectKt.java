package androidx.compose.p013ui.geometry;

import androidx.compose.p013ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a \u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\rH\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, m13558d2 = {"Rect", "Landroidx/compose/ui/geometry/Rect;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "bottomRight", "Rect-0a9Yr6o", "(JJ)Landroidx/compose/ui/geometry/Rect;", TypedValues.CycleType.S_WAVE_OFFSET, "size", "Landroidx/compose/ui/geometry/Size;", "Rect-tz77jQw", "center", "radius", "", "Rect-3MmeM6k", "(JF)Landroidx/compose/ui/geometry/Rect;", "lerp", "start", "stop", "fraction", "ui-geometry_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rect.kt\nandroidx/compose/ui/geometry/RectKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,287:1\n65#2:288\n69#2:291\n65#2:298\n69#2:301\n65#2:303\n69#2:306\n60#3:289\n70#3:292\n60#3:299\n70#3:302\n60#3:304\n70#3:307\n22#4:290\n22#4:300\n22#4:305\n57#5,5:293\n*S KotlinDebug\n*F\n+ 1 Rect.kt\nandroidx/compose/ui/geometry/RectKt\n*L\n243#1:288\n243#1:291\n254#1:298\n254#1:301\n264#1:303\n264#1:306\n243#1:289\n243#1:292\n254#1:299\n254#1:302\n264#1:304\n264#1:307\n243#1:290\n254#1:300\n264#1:305\n243#1:293,5\n*E\n"})
/* loaded from: classes2.dex */
public final class RectKt {
    @Stable
    /* renamed from: Rect-0a9Yr6o, reason: not valid java name */
    public static final Rect m20773Rect0a9Yr6o(long j10, long j11) {
        return new Rect(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    @Stable
    /* renamed from: Rect-3MmeM6k, reason: not valid java name */
    public static final Rect m20774Rect3MmeM6k(long j10, float f10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return new Rect(Float.intBitsToFloat(i10) - f10, Float.intBitsToFloat(i11) - f10, Float.intBitsToFloat(i10) + f10, Float.intBitsToFloat(i11) + f10);
    }

    @Stable
    /* renamed from: Rect-tz77jQw, reason: not valid java name */
    public static final Rect m20775Recttz77jQw(long j10, long j11) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return new Rect(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    @Stable
    public static final Rect lerp(Rect rect, Rect rect2, float f10) {
        return new Rect(MathHelpersKt.lerp(rect.getLeft(), rect2.getLeft(), f10), MathHelpersKt.lerp(rect.getTop(), rect2.getTop(), f10), MathHelpersKt.lerp(rect.getRight(), rect2.getRight(), f10), MathHelpersKt.lerp(rect.getBottom(), rect2.getBottom(), f10));
    }
}
