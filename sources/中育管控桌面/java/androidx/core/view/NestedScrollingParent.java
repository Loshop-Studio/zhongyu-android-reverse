package androidx.core.view;

import android.view.View;

/* loaded from: classes2.dex */
public interface NestedScrollingParent {
    int getNestedScrollAxes();

    boolean onNestedFling(View view, float f6, float f7, boolean z6);

    boolean onNestedPreFling(View view, float f6, float f7);

    void onNestedPreScroll(View view, int i6, int i7, int[] iArr);

    void onNestedScroll(View view, int i6, int i7, int i8, int i9);

    void onNestedScrollAccepted(View view, View view2, int i6);

    boolean onStartNestedScroll(View view, View view2, int i6);

    void onStopNestedScroll(View view);
}
