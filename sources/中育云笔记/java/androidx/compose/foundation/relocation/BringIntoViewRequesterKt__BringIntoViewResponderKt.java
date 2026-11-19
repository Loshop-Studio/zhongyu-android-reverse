package androidx.compose.foundation.relocation;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
final /* synthetic */ class BringIntoViewRequesterKt__BringIntoViewResponderKt {
    @InterfaceC10770a
    public static final Modifier bringIntoViewResponder(Modifier modifier, BringIntoViewResponder bringIntoViewResponder) {
        return modifier.then(new BringIntoViewResponderElement(bringIntoViewResponder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect localRectOf$BringIntoViewRequesterKt__BringIntoViewResponderKt(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, Rect rect) {
        return rect.m30674translatek4lQ0M(layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, false).m30672getTopLeftF1C5BW0());
    }
}
