package androidx.compose.foundation.lazy.grid;

import androidx.compose.p006ui.unit.IntOffset;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(m5174d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\tR%\u0010\f\u001a\u00020\rX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, m5175d2 = {"Landroidx/compose/foundation/lazy/grid/ItemInfo;", "", "crossAxisSize", "", "crossAxisOffset", "(II)V", "getCrossAxisOffset", "()I", "setCrossAxisOffset", "(I)V", "getCrossAxisSize", "setCrossAxisSize", "notAnimatableDelta", "Landroidx/compose/ui/unit/IntOffset;", "getNotAnimatableDelta-nOcc-ac", "()J", "setNotAnimatableDelta--gyyYBs", "(J)V", "J", "placeables", "", "Landroidx/compose/foundation/lazy/grid/PlaceableInfo;", "getPlaceables", "()Ljava/util/List;", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class ItemInfo {
    private int crossAxisOffset;
    private int crossAxisSize;
    private long notAnimatableDelta = IntOffset.INSTANCE.m11653getZeronOccac();
    private final List<PlaceableInfo> placeables = new ArrayList();

    public ItemInfo(int i4, int i5) {
        this.crossAxisSize = i4;
        this.crossAxisOffset = i5;
    }

    public final int getCrossAxisOffset() {
        return this.crossAxisOffset;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* renamed from: getNotAnimatableDelta-nOcc-ac, reason: not valid java name and from getter */
    public final long getNotAnimatableDelta() {
        return this.notAnimatableDelta;
    }

    public final List<PlaceableInfo> getPlaceables() {
        return this.placeables;
    }

    public final void setCrossAxisOffset(int i4) {
        this.crossAxisOffset = i4;
    }

    public final void setCrossAxisSize(int i4) {
        this.crossAxisSize = i4;
    }

    /* renamed from: setNotAnimatableDelta--gyyYBs, reason: not valid java name */
    public final void m7462setNotAnimatableDeltagyyYBs(long j4) {
        this.notAnimatableDelta = j4;
    }
}
