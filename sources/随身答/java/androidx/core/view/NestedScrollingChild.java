package androidx.core.view;

/* loaded from: classes2.dex */
public interface NestedScrollingChild {
    boolean dispatchNestedFling(float f10, float f11, boolean z9);

    boolean dispatchNestedPreFling(float f10, float f11);

    boolean dispatchNestedPreScroll(int i9, int i10, int[] iArr, int[] iArr2);

    boolean dispatchNestedScroll(int i9, int i10, int i11, int i12, int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z9);

    boolean startNestedScroll(int i9);

    void stopNestedScroll();
}
