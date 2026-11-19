package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
public final class MathUtilsKt {
    public static final int addExactOrElse(int i10, int i11, InterfaceC10559a interfaceC10559a) {
        int i12 = i10 + i11;
        return ((i10 ^ i12) & (i11 ^ i12)) < 0 ? ((Number) interfaceC10559a.invoke()).intValue() : i12;
    }

    /* renamed from: distanceSquaredToClosestCornerFromOutside-3MmeM6k, reason: not valid java name */
    private static final float m21416distanceSquaredToClosestCornerFromOutside3MmeM6k(long j10, Rect rect) {
        if (SelectionManagerKt.m21665containsInclusiveUv8p0NA(rect, j10)) {
            return 0.0f;
        }
        float fM24034getDistanceSquaredimpl = Offset.m24034getDistanceSquaredimpl(Offset.m24039minusMKHz9U(rect.m24070getTopLeftF1C5BW0(), j10));
        if (fM24034getDistanceSquaredimpl >= Float.MAX_VALUE) {
            fM24034getDistanceSquaredimpl = Float.MAX_VALUE;
        }
        float fM24034getDistanceSquaredimpl2 = Offset.m24034getDistanceSquaredimpl(Offset.m24039minusMKHz9U(rect.m24071getTopRightF1C5BW0(), j10));
        if (fM24034getDistanceSquaredimpl2 < fM24034getDistanceSquaredimpl) {
            fM24034getDistanceSquaredimpl = fM24034getDistanceSquaredimpl2;
        }
        float fM24034getDistanceSquaredimpl3 = Offset.m24034getDistanceSquaredimpl(Offset.m24039minusMKHz9U(rect.m24063getBottomLeftF1C5BW0(), j10));
        if (fM24034getDistanceSquaredimpl3 < fM24034getDistanceSquaredimpl) {
            fM24034getDistanceSquaredimpl = fM24034getDistanceSquaredimpl3;
        }
        float fM24034getDistanceSquaredimpl4 = Offset.m24034getDistanceSquaredimpl(Offset.m24039minusMKHz9U(rect.m24064getBottomRightF1C5BW0(), j10));
        return fM24034getDistanceSquaredimpl4 < fM24034getDistanceSquaredimpl ? fM24034getDistanceSquaredimpl4 : fM24034getDistanceSquaredimpl;
    }

    /* renamed from: findClosestRect-9KIMszo, reason: not valid java name */
    public static final int m21417findClosestRect9KIMszo(long j10, Rect rect, Rect rect2) {
        float fM21416distanceSquaredToClosestCornerFromOutside3MmeM6k = m21416distanceSquaredToClosestCornerFromOutside3MmeM6k(j10, rect);
        float fM21416distanceSquaredToClosestCornerFromOutside3MmeM6k2 = m21416distanceSquaredToClosestCornerFromOutside3MmeM6k(j10, rect2);
        if (fM21416distanceSquaredToClosestCornerFromOutside3MmeM6k == fM21416distanceSquaredToClosestCornerFromOutside3MmeM6k2) {
            return 0;
        }
        return fM21416distanceSquaredToClosestCornerFromOutside3MmeM6k < fM21416distanceSquaredToClosestCornerFromOutside3MmeM6k2 ? -1 : 1;
    }

    public static final int subtractExactOrElse(int i10, int i11, InterfaceC10559a interfaceC10559a) {
        int i12 = i10 - i11;
        return ((i10 ^ i12) & (i11 ^ i10)) < 0 ? ((Number) interfaceC10559a.invoke()).intValue() : i12;
    }
}
