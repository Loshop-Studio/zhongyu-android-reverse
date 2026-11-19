package androidx.compose.p013ui.window;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import p134i7.AbstractC8809v;

@RequiresApi(29)
/* loaded from: classes2.dex */
final class PopupLayoutHelperImpl29 extends PopupLayoutHelperImpl {
    @Override // androidx.compose.p013ui.window.PopupLayoutHelperImpl, androidx.compose.p013ui.window.PopupLayoutHelper
    public void setGestureExclusionRects(View view, int i10, int i11) {
        view.setSystemGestureExclusionRects(AbstractC8809v.m14776s(new Rect(0, 0, i10, i11)));
    }
}
