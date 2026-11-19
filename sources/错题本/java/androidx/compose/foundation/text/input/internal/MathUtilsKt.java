package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a*\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0005\u001a&\u0010\r\u001a\u00020\u0000*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\u0012\u001a\u00020\u000f*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, m5110d2 = {"", "right", "Lkotlin/Function0;", "defaultValue", "addExactOrElse", "(IILr6/a;)I", "subtractExactOrElse", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Rect;", "rect1", "rect2", "findClosestRect-9KIMszo", "(JLandroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)I", "findClosestRect", "rect", "", "distanceSquaredToClosestCornerFromOutside-3MmeM6k", "(JLandroidx/compose/ui/geometry/Rect;)F", "distanceSquaredToClosestCornerFromOutside", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MathUtils.kt\nandroidx/compose/foundation/text/input/internal/MathUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
/* loaded from: classes.dex */
public final class MathUtilsKt {
    public static final int addExactOrElse(int i, int i8, @NotNull InterfaceC6469a interfaceC6469a) {
        int i9 = i + i8;
        return ((i ^ i9) & (i8 ^ i9)) < 0 ? ((Number) interfaceC6469a.invoke()).intValue() : i9;
    }

    /* renamed from: distanceSquaredToClosestCornerFromOutside-3MmeM6k, reason: not valid java name */
    private static final float m7822distanceSquaredToClosestCornerFromOutside3MmeM6k(long j7, Rect rect) {
        if (SelectionManagerKt.m8071containsInclusiveUv8p0NA(rect, j7)) {
            return 0.0f;
        }
        float fM10440getDistanceSquaredimpl = Offset.m10440getDistanceSquaredimpl(Offset.m10445minusMKHz9U(rect.m10476getTopLeftF1C5BW0(), j7));
        if (fM10440getDistanceSquaredimpl >= Float.MAX_VALUE) {
            fM10440getDistanceSquaredimpl = Float.MAX_VALUE;
        }
        float fM10440getDistanceSquaredimpl2 = Offset.m10440getDistanceSquaredimpl(Offset.m10445minusMKHz9U(rect.m10477getTopRightF1C5BW0(), j7));
        if (fM10440getDistanceSquaredimpl2 < fM10440getDistanceSquaredimpl) {
            fM10440getDistanceSquaredimpl = fM10440getDistanceSquaredimpl2;
        }
        float fM10440getDistanceSquaredimpl3 = Offset.m10440getDistanceSquaredimpl(Offset.m10445minusMKHz9U(rect.m10469getBottomLeftF1C5BW0(), j7));
        if (fM10440getDistanceSquaredimpl3 < fM10440getDistanceSquaredimpl) {
            fM10440getDistanceSquaredimpl = fM10440getDistanceSquaredimpl3;
        }
        float fM10440getDistanceSquaredimpl4 = Offset.m10440getDistanceSquaredimpl(Offset.m10445minusMKHz9U(rect.m10470getBottomRightF1C5BW0(), j7));
        return fM10440getDistanceSquaredimpl4 < fM10440getDistanceSquaredimpl ? fM10440getDistanceSquaredimpl4 : fM10440getDistanceSquaredimpl;
    }

    /* renamed from: findClosestRect-9KIMszo, reason: not valid java name */
    public static final int m7823findClosestRect9KIMszo(long j7, @NotNull Rect rect, @NotNull Rect rect2) {
        float fM7822distanceSquaredToClosestCornerFromOutside3MmeM6k = m7822distanceSquaredToClosestCornerFromOutside3MmeM6k(j7, rect);
        float fM7822distanceSquaredToClosestCornerFromOutside3MmeM6k2 = m7822distanceSquaredToClosestCornerFromOutside3MmeM6k(j7, rect2);
        if (fM7822distanceSquaredToClosestCornerFromOutside3MmeM6k == fM7822distanceSquaredToClosestCornerFromOutside3MmeM6k2) {
            return 0;
        }
        return fM7822distanceSquaredToClosestCornerFromOutside3MmeM6k < fM7822distanceSquaredToClosestCornerFromOutside3MmeM6k2 ? -1 : 1;
    }

    public static final int subtractExactOrElse(int i, int i8, @NotNull InterfaceC6469a interfaceC6469a) {
        int i9 = i - i8;
        return ((i ^ i9) & (i8 ^ i)) < 0 ? ((Number) interfaceC6469a.invoke()).intValue() : i9;
    }
}
