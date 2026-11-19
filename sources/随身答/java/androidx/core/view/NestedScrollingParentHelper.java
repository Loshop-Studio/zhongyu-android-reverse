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

    public void onNestedScrollAccepted(View view, View view2, int i9) {
        onNestedScrollAccepted(view, view2, i9, 0);
    }

    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i9, int i10) {
        if (i10 == 1) {
            this.mNestedScrollAxesNonTouch = i9;
        } else {
            this.mNestedScrollAxesTouch = i9;
        }
    }

    public void onStopNestedScroll(View view, int i9) {
        if (i9 == 1) {
            this.mNestedScrollAxesNonTouch = 0;
        } else {
            this.mNestedScrollAxesTouch = 0;
        }
    }
}
