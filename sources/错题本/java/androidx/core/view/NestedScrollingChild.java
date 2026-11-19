package androidx.core.view;

/* loaded from: classes2.dex */
public interface NestedScrollingChild {
    boolean dispatchNestedFling(float f, float f7, boolean z8);

    boolean dispatchNestedPreFling(float f, float f7);

    boolean dispatchNestedPreScroll(int i, int i8, int[] iArr, int[] iArr2);

    boolean dispatchNestedScroll(int i, int i8, int i9, int i10, int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z8);

    boolean startNestedScroll(int i);

    void stopNestedScroll();
}
