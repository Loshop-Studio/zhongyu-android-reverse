package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.p009ui.geometry.Offset;
import androidx.compose.p009ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0080\b\u001a\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a&\u0010\f\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0080\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, m7880d2 = {"addExactOrElse", "", "right", "defaultValue", "Lkotlin/Function0;", "distanceSquaredToClosestCornerFromOutside", "", "Landroidx/compose/ui/geometry/Offset;", "rect", "Landroidx/compose/ui/geometry/Rect;", "distanceSquaredToClosestCornerFromOutside-3MmeM6k", "(JLandroidx/compose/ui/geometry/Rect;)F", "findClosestRect", "rect1", "rect2", "findClosestRect-9KIMszo", "(JLandroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)I", "subtractExactOrElse", "foundation_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nMathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MathUtils.kt\nandroidx/compose/foundation/text/input/internal/MathUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
/* loaded from: classes.dex */
public final class MathUtilsKt {
    public static final int addExactOrElse(int i6, int i7, Function0<Integer> function0) {
        int i8 = i6 + i7;
        return ((i6 ^ i8) & (i7 ^ i8)) < 0 ? function0.invoke().intValue() : i8;
    }

    /* renamed from: distanceSquaredToClosestCornerFromOutside-3MmeM6k, reason: not valid java name */
    private static final float m11136distanceSquaredToClosestCornerFromOutside3MmeM6k(long j6, Rect rect) {
        if (SelectionManagerKt.m11362containsInclusiveUv8p0NA(rect, j6)) {
            return 0.0f;
        }
        float fM13657getDistanceSquaredimpl = Offset.m13657getDistanceSquaredimpl(Offset.m13662minusMKHz9U(rect.m13693getTopLeftF1C5BW0(), j6));
        if (fM13657getDistanceSquaredimpl >= Float.MAX_VALUE) {
            fM13657getDistanceSquaredimpl = Float.MAX_VALUE;
        }
        float fM13657getDistanceSquaredimpl2 = Offset.m13657getDistanceSquaredimpl(Offset.m13662minusMKHz9U(rect.m13694getTopRightF1C5BW0(), j6));
        if (fM13657getDistanceSquaredimpl2 < fM13657getDistanceSquaredimpl) {
            fM13657getDistanceSquaredimpl = fM13657getDistanceSquaredimpl2;
        }
        float fM13657getDistanceSquaredimpl3 = Offset.m13657getDistanceSquaredimpl(Offset.m13662minusMKHz9U(rect.m13686getBottomLeftF1C5BW0(), j6));
        if (fM13657getDistanceSquaredimpl3 < fM13657getDistanceSquaredimpl) {
            fM13657getDistanceSquaredimpl = fM13657getDistanceSquaredimpl3;
        }
        float fM13657getDistanceSquaredimpl4 = Offset.m13657getDistanceSquaredimpl(Offset.m13662minusMKHz9U(rect.m13687getBottomRightF1C5BW0(), j6));
        return fM13657getDistanceSquaredimpl4 < fM13657getDistanceSquaredimpl ? fM13657getDistanceSquaredimpl4 : fM13657getDistanceSquaredimpl;
    }

    /* renamed from: findClosestRect-9KIMszo, reason: not valid java name */
    public static final int m11137findClosestRect9KIMszo(long j6, Rect rect, Rect rect2) {
        float fM11136distanceSquaredToClosestCornerFromOutside3MmeM6k = m11136distanceSquaredToClosestCornerFromOutside3MmeM6k(j6, rect);
        float fM11136distanceSquaredToClosestCornerFromOutside3MmeM6k2 = m11136distanceSquaredToClosestCornerFromOutside3MmeM6k(j6, rect2);
        if (fM11136distanceSquaredToClosestCornerFromOutside3MmeM6k == fM11136distanceSquaredToClosestCornerFromOutside3MmeM6k2) {
            return 0;
        }
        return fM11136distanceSquaredToClosestCornerFromOutside3MmeM6k < fM11136distanceSquaredToClosestCornerFromOutside3MmeM6k2 ? -1 : 1;
    }

    public static final int subtractExactOrElse(int i6, int i7, Function0<Integer> function0) {
        int i8 = i6 - i7;
        return ((i6 ^ i8) & (i7 ^ i6)) < 0 ? function0.invoke().intValue() : i8;
    }
}
