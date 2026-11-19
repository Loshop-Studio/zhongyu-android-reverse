package androidx.core.view;

import android.view.View;

/* loaded from: classes2.dex */
public interface NestedScrollingParent2 extends NestedScrollingParent {
    void onNestedPreScroll(View view, int i6, int i7, int[] iArr, int i8);

    void onNestedScroll(View view, int i6, int i7, int i8, int i9, int i10);

    void onNestedScrollAccepted(View view, View view2, int i6, int i7);

    boolean onStartNestedScroll(View view, View view2, int i6, int i7);

    void onStopNestedScroll(View view, int i6);
}
