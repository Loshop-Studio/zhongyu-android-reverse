package androidx.core.view;

import android.view.View;

/* loaded from: classes2.dex */
public interface NestedScrollingParent2 extends NestedScrollingParent {
    void onNestedPreScroll(View view, int i, int i8, int[] iArr, int i9);

    void onNestedScroll(View view, int i, int i8, int i9, int i10, int i11);

    void onNestedScrollAccepted(View view, View view2, int i, int i8);

    boolean onStartNestedScroll(View view, View view2, int i, int i8);

    void onStopNestedScroll(View view, int i);
}
