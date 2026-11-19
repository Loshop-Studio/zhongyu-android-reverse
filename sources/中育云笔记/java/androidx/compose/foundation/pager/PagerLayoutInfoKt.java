package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;

/* loaded from: classes.dex */
public final class PagerLayoutInfoKt {
    public static final int getMainAxisViewportSize(PagerLayoutInfo pagerLayoutInfo) {
        return (int) (pagerLayoutInfo.getOrientation() == Orientation.Vertical ? pagerLayoutInfo.mo27708getViewportSizeYbymL2g() & 4294967295L : pagerLayoutInfo.mo27708getViewportSizeYbymL2g() >> 32);
    }
}
