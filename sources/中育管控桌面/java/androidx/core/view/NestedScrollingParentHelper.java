package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class NestedScrollingParentHelper {
    private int mNestedScrollAxesNonTouch;
    private int mNestedScrollAxesTouch;

    public NestedScrollingParentHelper(ViewGroup viewGroup) {
    }

    public int getNestedScrollAxes() {
        return this.mNestedScrollAxesTouch | this.mNestedScrollAxesNonTouch;
    }

    public void onNestedScrollAccepted(View view, View view2, int i6) {
        onNestedScrollAccepted(view, view2, i6, 0);
    }

    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i6, int i7) {
        if (i7 == 1) {
            this.mNestedScrollAxesNonTouch = i6;
        } else {
            this.mNestedScrollAxesTouch = i6;
        }
    }

    public void onStopNestedScroll(View view, int i6) {
        if (i6 == 1) {
            this.mNestedScrollAxesNonTouch = 0;
        } else {
            this.mNestedScrollAxesTouch = 0;
        }
    }
}
