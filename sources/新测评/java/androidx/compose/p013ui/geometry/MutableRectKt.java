package androidx.compose.p013ui.geometry;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, m13558d2 = {"MutableRect", "Landroidx/compose/ui/geometry/MutableRect;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "bottomRight", "MutableRect-0a9Yr6o", "(JJ)Landroidx/compose/ui/geometry/MutableRect;", TypedValues.CycleType.S_WAVE_OFFSET, "size", "Landroidx/compose/ui/geometry/Size;", "MutableRect-tz77jQw", "center", "radius", "", "MutableRect-3MmeM6k", "(JF)Landroidx/compose/ui/geometry/MutableRect;", "toRect", "Landroidx/compose/ui/geometry/Rect;", "ui-geometry_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nMutableRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRectKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,232:1\n65#2:233\n69#2:236\n65#2:243\n69#2:246\n65#2:248\n69#2:251\n60#3:234\n70#3:237\n60#3:244\n70#3:247\n60#3:249\n70#3:252\n22#4:235\n22#4:245\n22#4:250\n57#5,5:238\n*S KotlinDebug\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRectKt\n*L\n212#1:233\n212#1:236\n222#1:243\n222#1:246\n231#1:248\n231#1:251\n212#1:234\n212#1:237\n222#1:244\n222#1:247\n231#1:249\n231#1:252\n212#1:235\n222#1:245\n231#1:250\n212#1:238,5\n*E\n"})
/* loaded from: classes2.dex */
public final class MutableRectKt {
    /* renamed from: MutableRect-0a9Yr6o, reason: not valid java name */
    public static final MutableRect m20721MutableRect0a9Yr6o(long j10, long j11) {
        return new MutableRect(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    /* renamed from: MutableRect-3MmeM6k, reason: not valid java name */
    public static final MutableRect m20722MutableRect3MmeM6k(long j10, float f10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return new MutableRect(Float.intBitsToFloat(i10) - f10, Float.intBitsToFloat(i11) - f10, Float.intBitsToFloat(i10) + f10, Float.intBitsToFloat(i11) + f10);
    }

    /* renamed from: MutableRect-tz77jQw, reason: not valid java name */
    public static final MutableRect m20723MutableRecttz77jQw(long j10, long j11) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return new MutableRect(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    public static final Rect toRect(MutableRect mutableRect) {
        return new Rect(mutableRect.getLeft(), mutableRect.getTop(), mutableRect.getRight(), mutableRect.getBottom());
    }
}
