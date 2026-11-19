package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
public final class MathUtilsKt {
    public static final int addExactOrElse(int i10, int i11, InterfaceC9529a interfaceC9529a) {
        int i12 = i10 + i11;
        return ((i10 ^ i12) & (i11 ^ i12)) < 0 ? ((Number) interfaceC9529a.invoke()).intValue() : i12;
    }

    /* renamed from: distanceSquaredToClosestCornerFromOutside-3MmeM6k, reason: not valid java name */
    private static final float m28018distanceSquaredToClosestCornerFromOutside3MmeM6k(long j10, Rect rect) {
        if (SelectionManagerKt.m28267containsInclusiveUv8p0NA(rect, j10)) {
            return 0.0f;
        }
        float fM30636getDistanceSquaredimpl = Offset.m30636getDistanceSquaredimpl(Offset.m30641minusMKHz9U(rect.m30672getTopLeftF1C5BW0(), j10));
        if (fM30636getDistanceSquaredimpl >= Float.MAX_VALUE) {
            fM30636getDistanceSquaredimpl = Float.MAX_VALUE;
        }
        float fM30636getDistanceSquaredimpl2 = Offset.m30636getDistanceSquaredimpl(Offset.m30641minusMKHz9U(rect.m30673getTopRightF1C5BW0(), j10));
        if (fM30636getDistanceSquaredimpl2 < fM30636getDistanceSquaredimpl) {
            fM30636getDistanceSquaredimpl = fM30636getDistanceSquaredimpl2;
        }
        float fM30636getDistanceSquaredimpl3 = Offset.m30636getDistanceSquaredimpl(Offset.m30641minusMKHz9U(rect.m30665getBottomLeftF1C5BW0(), j10));
        if (fM30636getDistanceSquaredimpl3 < fM30636getDistanceSquaredimpl) {
            fM30636getDistanceSquaredimpl = fM30636getDistanceSquaredimpl3;
        }
        float fM30636getDistanceSquaredimpl4 = Offset.m30636getDistanceSquaredimpl(Offset.m30641minusMKHz9U(rect.m30666getBottomRightF1C5BW0(), j10));
        return fM30636getDistanceSquaredimpl4 < fM30636getDistanceSquaredimpl ? fM30636getDistanceSquaredimpl4 : fM30636getDistanceSquaredimpl;
    }

    /* renamed from: findClosestRect-9KIMszo, reason: not valid java name */
    public static final int m28019findClosestRect9KIMszo(long j10, Rect rect, Rect rect2) {
        float fM28018distanceSquaredToClosestCornerFromOutside3MmeM6k = m28018distanceSquaredToClosestCornerFromOutside3MmeM6k(j10, rect);
        float fM28018distanceSquaredToClosestCornerFromOutside3MmeM6k2 = m28018distanceSquaredToClosestCornerFromOutside3MmeM6k(j10, rect2);
        if (fM28018distanceSquaredToClosestCornerFromOutside3MmeM6k == fM28018distanceSquaredToClosestCornerFromOutside3MmeM6k2) {
            return 0;
        }
        return fM28018distanceSquaredToClosestCornerFromOutside3MmeM6k < fM28018distanceSquaredToClosestCornerFromOutside3MmeM6k2 ? -1 : 1;
    }

    public static final int subtractExactOrElse(int i10, int i11, InterfaceC9529a interfaceC9529a) {
        int i12 = i10 - i11;
        return ((i10 ^ i12) & (i11 ^ i10)) < 0 ? ((Number) interfaceC9529a.invoke()).intValue() : i12;
    }
}
