package androidx.compose.p014ui.window;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import p325rc.AbstractC10978w;

@RequiresApi(29)
/* loaded from: classes2.dex */
final class PopupLayoutHelperImpl29 extends PopupLayoutHelperImpl {
    @Override // androidx.compose.p014ui.window.PopupLayoutHelperImpl, androidx.compose.p014ui.window.PopupLayoutHelper
    public void setGestureExclusionRects(View view, int i10, int i11) {
        view.setSystemGestureExclusionRects(AbstractC10978w.m24141s(new Rect(0, 0, i10, i11)));
    }
}
