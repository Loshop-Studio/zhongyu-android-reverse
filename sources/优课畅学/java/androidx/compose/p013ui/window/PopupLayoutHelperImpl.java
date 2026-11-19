package androidx.compose.p013ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: classes2.dex */
class PopupLayoutHelperImpl implements PopupLayoutHelper {
    @Override // androidx.compose.p013ui.window.PopupLayoutHelper
    public void getWindowVisibleDisplayFrame(View view, Rect rect) {
        view.getWindowVisibleDisplayFrame(rect);
    }

    @Override // androidx.compose.p013ui.window.PopupLayoutHelper
    public void setGestureExclusionRects(View view, int i10, int i11) {
    }

    @Override // androidx.compose.p013ui.window.PopupLayoutHelper
    public void updateViewLayout(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        windowManager.updateViewLayout(view, layoutParams);
    }
}
