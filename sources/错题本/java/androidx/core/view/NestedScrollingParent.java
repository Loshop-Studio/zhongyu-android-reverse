package androidx.core.view;

import android.view.View;

/* loaded from: classes2.dex */
public interface NestedScrollingParent {
    int getNestedScrollAxes();

    boolean onNestedFling(View view, float f, float f7, boolean z8);

    boolean onNestedPreFling(View view, float f, float f7);

    void onNestedPreScroll(View view, int i, int i8, int[] iArr);

    void onNestedScroll(View view, int i, int i8, int i9, int i10);

    void onNestedScrollAccepted(View view, View view2, int i);

    boolean onStartNestedScroll(View view, View view2, int i);

    void onStopNestedScroll(View view);
}
