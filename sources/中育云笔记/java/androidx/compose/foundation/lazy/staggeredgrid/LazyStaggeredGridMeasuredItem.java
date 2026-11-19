package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p325rc.AbstractC10978w;

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

    public /* synthetic */ LazyStaggeredGridMeasuredItem(int i10, Object obj, List list, boolean z10, int i11, int i12, int i13, int i14, int i15, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j10, AbstractC9972n abstractC9972n) {
        this(i10, obj, list, z10, i11, i12, i13, i14, i15, obj2, lazyLayoutItemAnimator, j10);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m27683copy4Tuh3kE(long j10, InterfaceC9540l interfaceC9540l) {
        int iM33629getXimpl = isVertical() ? IntOffset.m33629getXimpl(j10) : ((Number) interfaceC9540l.invoke(Integer.valueOf(IntOffset.m33629getXimpl(j10)))).intValue();
        boolean zIsVertical = isVertical();
        int iM33630getYimpl = IntOffset.m33630getYimpl(j10);
        if (zIsVertical) {
            iM33630getYimpl = ((Number) interfaceC9540l.invoke(Integer.valueOf(iM33630getYimpl))).intValue();
        }
        return IntOffset.m33623constructorimpl((iM33629getXimpl << 32) | (iM33630getYimpl & 4294967295L));
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m27684getMainAxisgyyYBs(long j10) {
        return isVertical() ? IntOffset.m33630getYimpl(j10) : IntOffset.m33629getXimpl(j10);
    }

    public final void applyScrollDelta(int i10, boolean z10) {
        if (getNonScrollableItem()) {
            return;
        }
        long jMo27666getOffsetnOccac = mo27666getOffsetnOccac();
        int iM33629getXimpl = isVertical() ? IntOffset.m33629getXimpl(jMo27666getOffsetnOccac) : IntOffset.m33629getXimpl(jMo27666getOffsetnOccac) + i10;
        boolean zIsVertical = isVertical();
        int iM33630getYimpl = IntOffset.m33630getYimpl(jMo27666getOffsetnOccac);
        if (zIsVertical) {
            iM33630getYimpl += i10;
        }
        this.offset = IntOffset.m33623constructorimpl((iM33629getXimpl << 32) | (iM33630getYimpl & 4294967295L));
        if (z10) {
            int placeablesCount = getPlaceablesCount();
            for (int i11 = 0; i11 < placeablesCount; i11++) {
                LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i11);
                if (animation != null) {
                    long jM27621getRawOffsetnOccac = animation.m27621getRawOffsetnOccac();
                    int iM33629getXimpl2 = isVertical() ? IntOffset.m33629getXimpl(jM27621getRawOffsetnOccac) : Integer.valueOf(IntOffset.m33629getXimpl(jM27621getRawOffsetnOccac) + i10).intValue();
                    boolean zIsVertical2 = isVertical();
                    int iM33630getYimpl2 = IntOffset.m33630getYimpl(jM27621getRawOffsetnOccac);
                    if (zIsVertical2) {
                        iM33630getYimpl2 = Integer.valueOf(iM33630getYimpl2 + i10).intValue();
                    }
                    animation.m27624setRawOffsetgyyYBs(IntOffset.m33623constructorimpl((iM33630getYimpl2 & 4294967295L) | (iM33629getXimpl2 << 32)));
                }
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getConstraints-msEJaDk */
    public long mo27571getConstraintsmsEJaDk() {
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
        return !isVertical() ? IntOffset.m33629getXimpl(mo27666getOffsetnOccac()) : IntOffset.m33630getYimpl(mo27666getOffsetnOccac());
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
    public long mo27572getOffsetBjo55l4(int i10) {
        return mo27666getOffsetnOccac();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getOffset-nOcc-ac */
    public long mo27666getOffsetnOccac() {
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
    public long mo27667getSizeYbymL2g() {
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
            long jMo27666getOffsetnOccac = mo27666getOffsetnOccac();
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i10);
            if (animation != null) {
                if (z10) {
                    animation.m27623setLookaheadOffsetgyyYBs(jMo27666getOffsetnOccac);
                } else {
                    long jM33633plusqkQi6aY = IntOffset.m33633plusqkQi6aY(!IntOffset.m33628equalsimpl0(animation.m27619getLookaheadOffsetnOccac(), LazyLayoutItemAnimation.Companion.m27626getNotInitializednOccac()) ? animation.m27619getLookaheadOffsetnOccac() : jMo27666getOffsetnOccac, animation.m27620getPlacementDeltanOccac());
                    if ((m27684getMainAxisgyyYBs(jMo27666getOffsetnOccac) <= height && m27684getMainAxisgyyYBs(jM33633plusqkQi6aY) <= height) || (m27684getMainAxisgyyYBs(jMo27666getOffsetnOccac) >= i11 && m27684getMainAxisgyyYBs(jM33633plusqkQi6aY) >= i11)) {
                        animation.cancelPlacementAnimation();
                    }
                    jMo27666getOffsetnOccac = jM33633plusqkQi6aY;
                }
                layer = animation.getLayer();
            } else {
                layer = null;
            }
            if (lazyStaggeredGridMeasureContext.getReverseLayout()) {
                int iM33629getXimpl = isVertical() ? IntOffset.m33629getXimpl(jMo27666getOffsetnOccac) : (this.mainAxisLayoutSize - IntOffset.m33629getXimpl(jMo27666getOffsetnOccac)) - (isVertical() ? placeable.getHeight() : placeable.getWidth());
                jMo27666getOffsetnOccac = IntOffset.m33623constructorimpl(((isVertical() ? (this.mainAxisLayoutSize - IntOffset.m33630getYimpl(jMo27666getOffsetnOccac)) - (isVertical() ? placeable.getHeight() : placeable.getWidth()) : IntOffset.m33630getYimpl(jMo27666getOffsetnOccac)) & 4294967295L) | (iM33629getXimpl << 32));
            }
            long jM33633plusqkQi6aY2 = IntOffset.m33633plusqkQi6aY(jMo27666getOffsetnOccac, lazyStaggeredGridMeasureContext.m27671getContentOffsetnOccac());
            if (!z10 && animation != null) {
                animation.m27622setFinalOffsetgyyYBs(jM33633plusqkQi6aY2);
            }
            if (layer != null) {
                Placeable.PlacementScope.m32296placeRelativeWithLayeraW9wM$default(placementScope, placeable, jM33633plusqkQi6aY2, layer, 0.0f, 4, (Object) null);
            } else {
                Placeable.PlacementScope.m32295placeRelativeWithLayeraW9wM$default(placementScope, placeable, jM33633plusqkQi6aY2, 0.0f, (InterfaceC9540l) null, 6, (Object) null);
            }
        }
    }

    public final void position(int i10, int i11, int i12) {
        long jM33623constructorimpl;
        this.mainAxisLayoutSize = i12;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = i12 + this.afterContentPadding;
        if (isVertical()) {
            jM33623constructorimpl = IntOffset.m33623constructorimpl((i11 << 32) | (4294967295L & i10));
        } else {
            jM33623constructorimpl = IntOffset.m33623constructorimpl((i11 & 4294967295L) | (i10 << 32));
        }
        this.offset = jM33623constructorimpl;
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
            int iM24138p = AbstractC10978w.m24138p(list);
            if (1 <= iM24138p) {
                int i18 = 1;
                while (true) {
                    Placeable placeable2 = (Placeable) list.get(i18);
                    int height2 = isVertical() ? placeable2.getHeight() : placeable2.getWidth();
                    height = height2 > height ? height2 : height;
                    if (i18 == iM24138p) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
        }
        this.mainAxisSize = height;
        this.mainAxisSizeWithSpacings = AbstractC10410o.m21752e(height + i11, 0);
        List<Placeable> list2 = this.placeables;
        if (!list2.isEmpty()) {
            Placeable placeable3 = list2.get(0);
            int width = isVertical() ? placeable3.getWidth() : placeable3.getHeight();
            int iM24138p2 = AbstractC10978w.m24138p(list2);
            if (1 <= iM24138p2) {
                while (true) {
                    Placeable placeable4 = list2.get(i16);
                    int width2 = isVertical() ? placeable4.getWidth() : placeable4.getHeight();
                    width = width2 > width ? width2 : width;
                    if (i16 == iM24138p2) {
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
        this.size = isVertical() ? IntSize.m33667constructorimpl((this.mainAxisSize & 4294967295L) | (i17 << 32)) : IntSize.m33667constructorimpl((i17 & 4294967295L) | (this.mainAxisSize << 32));
        this.offset = IntOffset.Companion.m33640getZeronOccac();
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
