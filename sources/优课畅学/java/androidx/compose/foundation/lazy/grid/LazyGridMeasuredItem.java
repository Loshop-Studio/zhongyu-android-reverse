package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import p077d8.AbstractC8323h;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyGridMeasuredItem implements LazyGridItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final LazyLayoutItemAnimator<LazyGridMeasuredItem> animator;
    private final int beforeContentPadding;
    private int column;
    private final long constraints;
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int lane;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private int row;
    private final long size;
    private final int span;
    private final long visualOffset;

    public /* synthetic */ LazyGridMeasuredItem(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, LayoutDirection layoutDirection, int i13, int i14, List list, long j10, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j11, int i15, int i16, AbstractC9126n abstractC9126n) {
        this(i10, obj, z10, i11, i12, z11, layoutDirection, i13, i14, list, j10, obj2, lazyLayoutItemAnimator, j11, i15, i16);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m21001copy4Tuh3kE(long j10, InterfaceC10570l interfaceC10570l) {
        int iM27027getXimpl = isVertical() ? IntOffset.m27027getXimpl(j10) : ((Number) interfaceC10570l.invoke(Integer.valueOf(IntOffset.m27027getXimpl(j10)))).intValue();
        boolean zIsVertical = isVertical();
        int iM27028getYimpl = IntOffset.m27028getYimpl(j10);
        if (zIsVertical) {
            iM27028getYimpl = ((Number) interfaceC10570l.invoke(Integer.valueOf(iM27028getYimpl))).intValue();
        }
        return IntOffset.m27021constructorimpl((iM27027getXimpl << 32) | (iM27028getYimpl & 4294967295L));
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m21002getMainAxisgyyYBs(long j10) {
        return isVertical() ? IntOffset.m27028getYimpl(j10) : IntOffset.m27027getXimpl(j10);
    }

    public final void applyScrollDelta(int i10, boolean z10) {
        if (getNonScrollableItem()) {
            return;
        }
        long jMo20995getOffsetnOccac = mo20995getOffsetnOccac();
        int iM27027getXimpl = isVertical() ? IntOffset.m27027getXimpl(jMo20995getOffsetnOccac) : IntOffset.m27027getXimpl(jMo20995getOffsetnOccac) + i10;
        boolean zIsVertical = isVertical();
        int iM27028getYimpl = IntOffset.m27028getYimpl(jMo20995getOffsetnOccac);
        if (zIsVertical) {
            iM27028getYimpl += i10;
        }
        this.offset = IntOffset.m27021constructorimpl((iM27027getXimpl << 32) | (iM27028getYimpl & 4294967295L));
        if (z10) {
            int placeablesCount = getPlaceablesCount();
            for (int i11 = 0; i11 < placeablesCount; i11++) {
                LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i11);
                if (animation != null) {
                    long jM21019getRawOffsetnOccac = animation.m21019getRawOffsetnOccac();
                    int iM27027getXimpl2 = isVertical() ? IntOffset.m27027getXimpl(jM21019getRawOffsetnOccac) : Integer.valueOf(IntOffset.m27027getXimpl(jM21019getRawOffsetnOccac) + i10).intValue();
                    boolean zIsVertical2 = isVertical();
                    int iM27028getYimpl2 = IntOffset.m27028getYimpl(jM21019getRawOffsetnOccac);
                    if (zIsVertical2) {
                        iM27028getYimpl2 = Integer.valueOf(iM27028getYimpl2 + i10).intValue();
                    }
                    animation.m21022setRawOffsetgyyYBs(IntOffset.m27021constructorimpl((iM27028getYimpl2 & 4294967295L) | (iM27027getXimpl2 << 32)));
                }
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.column;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getConstraints-msEJaDk */
    public long mo20969getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public Object getContentType() {
        return this.contentType;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getLane() {
        return this.lane;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getOffset-Bjo55l4 */
    public long mo20970getOffsetBjo55l4(int i10) {
        return mo20995getOffsetnOccac();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getOffset-nOcc-ac */
    public long mo20995getOffsetnOccac() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getParentData(int i10) {
        return this.placeables.get(i10).getParentData();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.row;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getSize-YbymL2g */
    public long mo20996getSizeYbymL2g() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean isVertical() {
        return this.isVertical;
    }

    public final void place(Placeable.PlacementScope placementScope, boolean z10) {
        GraphicsLayer layer;
        Placeable.PlacementScope placementScope2;
        int i10 = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        int placeablesCount = getPlaceablesCount();
        while (i10 < placeablesCount) {
            Placeable placeable = this.placeables.get(i10);
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i11 = this.maxMainAxisOffset;
            long jMo20995getOffsetnOccac = mo20995getOffsetnOccac();
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i10);
            if (animation != null) {
                if (z10) {
                    animation.m21021setLookaheadOffsetgyyYBs(jMo20995getOffsetnOccac);
                } else {
                    long jM27031plusqkQi6aY = IntOffset.m27031plusqkQi6aY(!IntOffset.m27026equalsimpl0(animation.m21017getLookaheadOffsetnOccac(), LazyLayoutItemAnimation.Companion.m21024getNotInitializednOccac()) ? animation.m21017getLookaheadOffsetnOccac() : jMo20995getOffsetnOccac, animation.m21018getPlacementDeltanOccac());
                    if ((m21002getMainAxisgyyYBs(jMo20995getOffsetnOccac) <= mainAxisSize && m21002getMainAxisgyyYBs(jM27031plusqkQi6aY) <= mainAxisSize) || (m21002getMainAxisgyyYBs(jMo20995getOffsetnOccac) >= i11 && m21002getMainAxisgyyYBs(jM27031plusqkQi6aY) >= i11)) {
                        animation.cancelPlacementAnimation();
                    }
                    jMo20995getOffsetnOccac = jM27031plusqkQi6aY;
                }
                layer = animation.getLayer();
            } else {
                layer = null;
            }
            if (this.reverseLayout) {
                jMo20995getOffsetnOccac = IntOffset.m27021constructorimpl(((isVertical() ? (this.mainAxisLayoutSize - IntOffset.m27028getYimpl(jMo20995getOffsetnOccac)) - getMainAxisSize(placeable) : IntOffset.m27028getYimpl(jMo20995getOffsetnOccac)) & 4294967295L) | ((isVertical() ? IntOffset.m27027getXimpl(jMo20995getOffsetnOccac) : (this.mainAxisLayoutSize - IntOffset.m27027getXimpl(jMo20995getOffsetnOccac)) - getMainAxisSize(placeable)) << 32));
            }
            long jM27031plusqkQi6aY2 = IntOffset.m27031plusqkQi6aY(jMo20995getOffsetnOccac, this.visualOffset);
            if (!z10 && animation != null) {
                animation.m21020setFinalOffsetgyyYBs(jM27031plusqkQi6aY2);
            }
            if (!isVertical()) {
                placementScope2 = placementScope;
                GraphicsLayer graphicsLayer = layer;
                if (graphicsLayer != null) {
                    Placeable.PlacementScope.m25694placeRelativeWithLayeraW9wM$default(placementScope2, placeable, jM27031plusqkQi6aY2, graphicsLayer, 0.0f, 4, (Object) null);
                } else {
                    Placeable.PlacementScope.m25693placeRelativeWithLayeraW9wM$default(placementScope2, placeable, jM27031plusqkQi6aY2, 0.0f, (InterfaceC10570l) null, 6, (Object) null);
                }
            } else if (layer != null) {
                placementScope2 = placementScope;
                Placeable.PlacementScope.m25696placeWithLayeraW9wM$default(placementScope2, placeable, jM27031plusqkQi6aY2, layer, 0.0f, 4, (Object) null);
            } else {
                placementScope2 = placementScope;
                Placeable.PlacementScope.m25695placeWithLayeraW9wM$default(placementScope2, placeable, jM27031plusqkQi6aY2, 0.0f, (InterfaceC10570l) null, 6, (Object) null);
            }
            i10++;
            placementScope = placementScope2;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void position(int i10, int i11, int i12, int i13) {
        position(i10, i11, i12, i13, -1, -1);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void setNonScrollableItem(boolean z10) {
        this.nonScrollableItem = z10;
    }

    public final void updateMainAxisLayoutSize(int i10) {
        this.mainAxisLayoutSize = i10;
        this.maxMainAxisOffset = i10 + this.afterContentPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyGridMeasuredItem(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, LayoutDirection layoutDirection, int i13, int i14, List<? extends Placeable> list, long j10, Object obj2, LazyLayoutItemAnimator<LazyGridMeasuredItem> lazyLayoutItemAnimator, long j11, int i15, int i16) {
        this.index = i10;
        this.key = obj;
        this.isVertical = z10;
        this.crossAxisSize = i11;
        this.reverseLayout = z11;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i13;
        this.afterContentPadding = i14;
        this.placeables = list;
        this.visualOffset = j10;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j11;
        this.lane = i15;
        this.span = i16;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int iMax = 0;
        for (int i17 = 0; i17 < size; i17++) {
            Placeable placeable = (Placeable) list.get(i17);
            iMax = Math.max(iMax, isVertical() ? placeable.getHeight() : placeable.getWidth());
        }
        this.mainAxisSize = iMax;
        this.mainAxisSizeWithSpacings = AbstractC8323h.m13510e(i12 + iMax, 0);
        this.size = isVertical() ? IntSize.m27065constructorimpl((iMax & 4294967295L) | (this.crossAxisSize << 32)) : IntSize.m27065constructorimpl((this.crossAxisSize & 4294967295L) | (iMax << 32));
        this.offset = IntOffset.Companion.m27038getZeronOccac();
        this.row = -1;
        this.column = -1;
    }

    private final int getMainAxisSize(Placeable placeable) {
        return isVertical() ? placeable.getHeight() : placeable.getWidth();
    }

    public final void position(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.mainAxisLayoutSize = isVertical() ? i13 : i12;
        if (!isVertical()) {
            i12 = i13;
        }
        if (isVertical() && this.layoutDirection == LayoutDirection.Rtl) {
            i11 = (i12 - i11) - this.crossAxisSize;
        }
        this.offset = isVertical() ? IntOffset.m27021constructorimpl((i11 << 32) | (4294967295L & i10)) : IntOffset.m27021constructorimpl((i11 & 4294967295L) | (i10 << 32));
        this.row = i14;
        this.column = i15;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }
}
