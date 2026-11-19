package androidx.compose.foundation.lazy.layout;

/* loaded from: classes.dex */
public interface LazyLayoutMeasuredItem {
    /* renamed from: getConstraints-msEJaDk */
    long mo20969getConstraintsmsEJaDk();

    int getIndex();

    Object getKey();

    int getLane();

    int getMainAxisSizeWithSpacings();

    boolean getNonScrollableItem();

    /* renamed from: getOffset-Bjo55l4 */
    long mo20970getOffsetBjo55l4(int i10);

    Object getParentData(int i10);

    int getPlaceablesCount();

    int getSpan();

    boolean isVertical();

    void position(int i10, int i11, int i12, int i13);

    void setNonScrollableItem(boolean z10);
}
