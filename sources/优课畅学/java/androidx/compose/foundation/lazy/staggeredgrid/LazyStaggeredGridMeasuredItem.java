package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import p077d8.AbstractC8323h;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasuredItem implements LazyStaggeredGridItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> animator;
    private final int beforeContentPadding;
    private final long constraints;
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private boolean isVisible;
    private final Object key;
    private final int lane;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;
    private final List<Placeable> placeables;
    private final long size;
    private final int span;

    public /* synthetic */ LazyStaggeredGridMeasuredItem(int i10, Object obj, List list, boolean z10, int i11, int i12, int i13, int i14, int i15, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j10, AbstractC9126n abstractC9126n) {
        this(i10, obj, list, z10, i11, i12, i13, i14, i15, obj2, lazyLayoutItemAnimator, j10);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m21081copy4Tuh3kE(long j10, InterfaceC10570l interfaceC10570l) {
        int iM27027getXimpl = isVertical() ? IntOffset.m27027getXimpl(j10) : ((Number) interfaceC10570l.invoke(Integer.valueOf(IntOffset.m27027getXimpl(j10)))).intValue();
        boolean zIsVertical = isVertical();
        int iM27028getYimpl = IntOffset.m27028getYimpl(j10);
        if (zIsVertical) {
            iM27028getYimpl = ((Number) interfaceC10570l.invoke(Integer.valueOf(iM27028getYimpl))).intValue();
        }
        return IntOffset.m27021constructorimpl((iM27027getXimpl << 32) | (iM27028getYimpl & 4294967295L));
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m21082getMainAxisgyyYBs(long j10) {
        return isVertical() ? IntOffset.m27028getYimpl(j10) : IntOffset.m27027getXimpl(j10);
    }

    public final void applyScrollDelta(int i10, boolean z10) {
        if (getNonScrollableItem()) {
            return;
        }
        long jMo21064getOffsetnOccac = mo21064getOffsetnOccac();
        int iM27027getXimpl = isVertical() ? IntOffset.m27027getXimpl(jMo21064getOffsetnOccac) : IntOffset.m27027getXimpl(jMo21064getOffsetnOccac) + i10;
        boolean zIsVertical = isVertical();
        int iM27028getYimpl = IntOffset.m27028getYimpl(jMo21064getOffsetnOccac);
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

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getConstraints-msEJaDk */
    public long mo20969getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public Object getContentType() {
        return this.contentType;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getLane() {
        return this.lane;
    }

    public final int getMainAxisOffset() {
        return !isVertical() ? IntOffset.m27027getXimpl(mo21064getOffsetnOccac()) : IntOffset.m27028getYimpl(mo21064getOffsetnOccac());
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
        return mo21064getOffsetnOccac();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getOffset-nOcc-ac */
    public long mo21064getOffsetnOccac() {
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

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getSize-YbymL2g */
    public long mo21065getSizeYbymL2g() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean isVertical() {
        return this.isVertical;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void place(Placeable.PlacementScope placementScope, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, boolean z10) {
        GraphicsLayer layer;
        if (!(this.mainAxisLayoutSize != -1)) {
            InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Placeable placeable = list.get(i10);
            int height = this.minMainAxisOffset - (isVertical() ? placeable.getHeight() : placeable.getWidth());
            int i11 = this.maxMainAxisOffset;
            long jMo21064getOffsetnOccac = mo21064getOffsetnOccac();
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i10);
            if (animation != null) {
                if (z10) {
                    animation.m21021setLookaheadOffsetgyyYBs(jMo21064getOffsetnOccac);
                } else {
                    long jM27031plusqkQi6aY = IntOffset.m27031plusqkQi6aY(!IntOffset.m27026equalsimpl0(animation.m21017getLookaheadOffsetnOccac(), LazyLayoutItemAnimation.Companion.m21024getNotInitializednOccac()) ? animation.m21017getLookaheadOffsetnOccac() : jMo21064getOffsetnOccac, animation.m21018getPlacementDeltanOccac());
                    if ((m21082getMainAxisgyyYBs(jMo21064getOffsetnOccac) <= height && m21082getMainAxisgyyYBs(jM27031plusqkQi6aY) <= height) || (m21082getMainAxisgyyYBs(jMo21064getOffsetnOccac) >= i11 && m21082getMainAxisgyyYBs(jM27031plusqkQi6aY) >= i11)) {
                        animation.cancelPlacementAnimation();
                    }
                    jMo21064getOffsetnOccac = jM27031plusqkQi6aY;
                }
                layer = animation.getLayer();
            } else {
                layer = null;
            }
            if (lazyStaggeredGridMeasureContext.getReverseLayout()) {
                int iM27027getXimpl = isVertical() ? IntOffset.m27027getXimpl(jMo21064getOffsetnOccac) : (this.mainAxisLayoutSize - IntOffset.m27027getXimpl(jMo21064getOffsetnOccac)) - (isVertical() ? placeable.getHeight() : placeable.getWidth());
                jMo21064getOffsetnOccac = IntOffset.m27021constructorimpl(((isVertical() ? (this.mainAxisLayoutSize - IntOffset.m27028getYimpl(jMo21064getOffsetnOccac)) - (isVertical() ? placeable.getHeight() : placeable.getWidth()) : IntOffset.m27028getYimpl(jMo21064getOffsetnOccac)) & 4294967295L) | (iM27027getXimpl << 32));
            }
            long jM27031plusqkQi6aY2 = IntOffset.m27031plusqkQi6aY(jMo21064getOffsetnOccac, lazyStaggeredGridMeasureContext.m21069getContentOffsetnOccac());
            if (!z10 && animation != null) {
                animation.m21020setFinalOffsetgyyYBs(jM27031plusqkQi6aY2);
            }
            if (layer != null) {
                Placeable.PlacementScope.m25694placeRelativeWithLayeraW9wM$default(placementScope, placeable, jM27031plusqkQi6aY2, layer, 0.0f, 4, (Object) null);
            } else {
                Placeable.PlacementScope.m25693placeRelativeWithLayeraW9wM$default(placementScope, placeable, jM27031plusqkQi6aY2, 0.0f, (InterfaceC10570l) null, 6, (Object) null);
            }
        }
    }

    public final void position(int i10, int i11, int i12) {
        long jM27021constructorimpl;
        this.mainAxisLayoutSize = i12;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = i12 + this.afterContentPadding;
        if (isVertical()) {
            jM27021constructorimpl = IntOffset.m27021constructorimpl((i11 << 32) | (4294967295L & i10));
        } else {
            jM27021constructorimpl = IntOffset.m27021constructorimpl((i11 & 4294967295L) | (i10 << 32));
        }
        this.offset = jM27021constructorimpl;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void setNonScrollableItem(boolean z10) {
        this.nonScrollableItem = z10;
    }

    public final void setVisible(boolean z10) {
        this.isVisible = z10;
    }

    public String toString() {
        return super.toString();
    }

    public final void updateMainAxisLayoutSize(int i10) {
        this.mainAxisLayoutSize = i10;
        this.maxMainAxisOffset = i10 + this.afterContentPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyStaggeredGridMeasuredItem(int i10, Object obj, List<? extends Placeable> list, boolean z10, int i11, int i12, int i13, int i14, int i15, Object obj2, LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> lazyLayoutItemAnimator, long j10) {
        int height;
        this.index = i10;
        this.key = obj;
        this.placeables = list;
        this.isVertical = z10;
        this.lane = i12;
        this.span = i13;
        this.beforeContentPadding = i14;
        this.afterContentPadding = i15;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j10;
        int i16 = 1;
        this.isVisible = true;
        int i17 = 0;
        if (list.isEmpty()) {
            height = 0;
        } else {
            Placeable placeable = (Placeable) list.get(0);
            height = isVertical() ? placeable.getHeight() : placeable.getWidth();
            int iM14773p = AbstractC8809v.m14773p(list);
            if (1 <= iM14773p) {
                int i18 = 1;
                while (true) {
                    Placeable placeable2 = (Placeable) list.get(i18);
                    int height2 = isVertical() ? placeable2.getHeight() : placeable2.getWidth();
                    height = height2 > height ? height2 : height;
                    if (i18 == iM14773p) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
        }
        this.mainAxisSize = height;
        this.mainAxisSizeWithSpacings = AbstractC8323h.m13510e(height + i11, 0);
        List<Placeable> list2 = this.placeables;
        if (!list2.isEmpty()) {
            Placeable placeable3 = list2.get(0);
            int width = isVertical() ? placeable3.getWidth() : placeable3.getHeight();
            int iM14773p2 = AbstractC8809v.m14773p(list2);
            if (1 <= iM14773p2) {
                while (true) {
                    Placeable placeable4 = list2.get(i16);
                    int width2 = isVertical() ? placeable4.getWidth() : placeable4.getHeight();
                    width = width2 > width ? width2 : width;
                    if (i16 == iM14773p2) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            i17 = width;
        }
        this.crossAxisSize = i17;
        this.mainAxisLayoutSize = -1;
        this.size = isVertical() ? IntSize.m27065constructorimpl((this.mainAxisSize & 4294967295L) | (i17 << 32)) : IntSize.m27065constructorimpl((i17 & 4294967295L) | (this.mainAxisSize << 32));
        this.offset = IntOffset.Companion.m27038getZeronOccac();
    }

    private final int getMainAxisSize(Placeable placeable) {
        return isVertical() ? placeable.getHeight() : placeable.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void position(int i10, int i11, int i12, int i13) {
        if (isVertical()) {
            i12 = i13;
        }
        position(i10, i11, i12);
    }
}
