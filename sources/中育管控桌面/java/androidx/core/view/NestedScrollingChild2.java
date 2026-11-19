package androidx.core.view;

/* loaded from: classes2.dex */
public interface NestedScrollingChild2 extends NestedScrollingChild {
    boolean dispatchNestedPreScroll(int i6, int i7, int[] iArr, int[] iArr2, int i8);

    boolean dispatchNestedScroll(int i6, int i7, int i8, int i9, int[] iArr, int i10);

    boolean hasNestedScrollingParent(int i6);

    boolean startNestedScroll(int i6, int i7);

    void stopNestedScroll(int i6);
}
