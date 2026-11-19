package androidx.core.view;

/* loaded from: classes2.dex */
public interface NestedScrollingChild {
    boolean dispatchNestedFling(float f6, float f7, boolean z6);

    boolean dispatchNestedPreFling(float f6, float f7);

    boolean dispatchNestedPreScroll(int i6, int i7, int[] iArr, int[] iArr2);

    boolean dispatchNestedScroll(int i6, int i7, int i8, int i9, int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z6);

    boolean startNestedScroll(int i6);

    void stopNestedScroll();
}
