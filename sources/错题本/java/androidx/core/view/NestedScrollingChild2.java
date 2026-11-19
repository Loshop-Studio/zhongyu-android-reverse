package androidx.core.view;

/* loaded from: classes2.dex */
public interface NestedScrollingChild2 extends NestedScrollingChild {
    boolean dispatchNestedPreScroll(int i, int i8, int[] iArr, int[] iArr2, int i9);

    boolean dispatchNestedScroll(int i, int i8, int i9, int i10, int[] iArr, int i11);

    boolean hasNestedScrollingParent(int i);

    boolean startNestedScroll(int i, int i8);

    void stopNestedScroll(int i);
}
