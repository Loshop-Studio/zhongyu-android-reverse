package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0080\b\u001a\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a&\u0010\f\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0080\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, m13558d2 = {"addExactOrElse", "", "right", "defaultValue", "Lkotlin/Function0;", "distanceSquaredToClosestCornerFromOutside", "", "Landroidx/compose/ui/geometry/Offset;", "rect", "Landroidx/compose/ui/geometry/Rect;", "distanceSquaredToClosestCornerFromOutside-3MmeM6k", "(JLandroidx/compose/ui/geometry/Rect;)F", "findClosestRect", "rect1", "rect2", "findClosestRect-9KIMszo", "(JLandroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)I", "subtractExactOrElse", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nMathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MathUtils.kt\nandroidx/compose/foundation/text/input/internal/MathUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
/* loaded from: classes.dex */
public final class MathUtilsKt {
    public static final int addExactOrElse(int i10, int i11, Function0<Integer> function0) {
        int i12 = i10 + i11;
        return ((i10 ^ i12) & (i11 ^ i12)) < 0 ? function0.invoke().intValue() : i12;
    }

    /* renamed from: distanceSquaredToClosestCornerFromOutside-3MmeM6k, reason: not valid java name */
    private static final float m18213distanceSquaredToClosestCornerFromOutside3MmeM6k(long j10, Rect rect) {
        if (SelectionManagerKt.m18439containsInclusiveUv8p0NA(rect, j10)) {
            return 0.0f;
        }
        float fM20734getDistanceSquaredimpl = Offset.m20734getDistanceSquaredimpl(Offset.m20739minusMKHz9U(rect.m20770getTopLeftF1C5BW0(), j10));
        if (fM20734getDistanceSquaredimpl >= Float.MAX_VALUE) {
            fM20734getDistanceSquaredimpl = Float.MAX_VALUE;
        }
        float fM20734getDistanceSquaredimpl2 = Offset.m20734getDistanceSquaredimpl(Offset.m20739minusMKHz9U(rect.m20771getTopRightF1C5BW0(), j10));
        if (fM20734getDistanceSquaredimpl2 < fM20734getDistanceSquaredimpl) {
            fM20734getDistanceSquaredimpl = fM20734getDistanceSquaredimpl2;
        }
        float fM20734getDistanceSquaredimpl3 = Offset.m20734getDistanceSquaredimpl(Offset.m20739minusMKHz9U(rect.m20763getBottomLeftF1C5BW0(), j10));
        if (fM20734getDistanceSquaredimpl3 < fM20734getDistanceSquaredimpl) {
            fM20734getDistanceSquaredimpl = fM20734getDistanceSquaredimpl3;
        }
        float fM20734getDistanceSquaredimpl4 = Offset.m20734getDistanceSquaredimpl(Offset.m20739minusMKHz9U(rect.m20764getBottomRightF1C5BW0(), j10));
        return fM20734getDistanceSquaredimpl4 < fM20734getDistanceSquaredimpl ? fM20734getDistanceSquaredimpl4 : fM20734getDistanceSquaredimpl;
    }

    /* renamed from: findClosestRect-9KIMszo, reason: not valid java name */
    public static final int m18214findClosestRect9KIMszo(long j10, Rect rect, Rect rect2) {
        float fM18213distanceSquaredToClosestCornerFromOutside3MmeM6k = m18213distanceSquaredToClosestCornerFromOutside3MmeM6k(j10, rect);
        float fM18213distanceSquaredToClosestCornerFromOutside3MmeM6k2 = m18213distanceSquaredToClosestCornerFromOutside3MmeM6k(j10, rect2);
        if (fM18213distanceSquaredToClosestCornerFromOutside3MmeM6k == fM18213distanceSquaredToClosestCornerFromOutside3MmeM6k2) {
            return 0;
        }
        return fM18213distanceSquaredToClosestCornerFromOutside3MmeM6k < fM18213distanceSquaredToClosestCornerFromOutside3MmeM6k2 ? -1 : 1;
    }

    public static final int subtractExactOrElse(int i10, int i11, Function0<Integer> function0) {
        int i12 = i10 - i11;
        return ((i10 ^ i12) & (i11 ^ i10)) < 0 ? function0.invoke().intValue() : i12;
    }
}
