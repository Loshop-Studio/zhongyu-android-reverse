package androidx.core.view;

/* loaded from: classes2.dex */
public interface NestedScrollingChild {
    boolean dispatchNestedFling(float f10, float f11, boolean z9);

    boolean dispatchNestedPreFling(float f10, float f11);

    boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2);

    boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z9);

    boolean startNestedScroll(int i10);

    void stopNestedScroll();
}
