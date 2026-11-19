package androidx.core.view;

import android.view.View;

/* loaded from: classes2.dex */
public interface NestedScrollingParent {
    int getNestedScrollAxes();

    boolean onNestedFling(View view, float f10, float f11, boolean z9);

    boolean onNestedPreFling(View view, float f10, float f11);

    void onNestedPreScroll(View view, int i10, int i11, int[] iArr);

    void onNestedScroll(View view, int i10, int i11, int i12, int i13);

    void onNestedScrollAccepted(View view, View view2, int i10);

    boolean onStartNestedScroll(View view, View view2, int i10);

    void onStopNestedScroll(View view);
}
