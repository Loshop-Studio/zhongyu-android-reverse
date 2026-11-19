package androidx.core.view;

import android.view.View;

/* loaded from: classes2.dex */
public interface NestedScrollingParent2 extends NestedScrollingParent {
    void onNestedPreScroll(View view, int i9, int i10, int[] iArr, int i11);

    void onNestedScroll(View view, int i9, int i10, int i11, int i12, int i13);

    void onNestedScrollAccepted(View view, View view2, int i9, int i10);

    boolean onStartNestedScroll(View view, View view2, int i9, int i10);

    void onStopNestedScroll(View view, int i9);
}
