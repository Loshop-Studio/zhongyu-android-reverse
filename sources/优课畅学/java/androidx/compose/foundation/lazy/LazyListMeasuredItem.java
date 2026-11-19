package androidx.compose.foundation.lazy;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9126n;
import p077d8.AbstractC8323h;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyListMeasuredItem implements LazyListItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final LazyLayoutItemAnimator<LazyListMeasuredItem> animator;
    private final int beforeContentPadding;
    private final long constraints;
    private final Object contentType;
    private final int crossAxisSize;
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int lane;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private int offset;
    private final int[] placeableOffsets;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;
    private final int spacing;
    private final int span;
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    public /* synthetic */ LazyListMeasuredItem(int i10, List list, boolean z10, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z11, int i11, int i12, int i13, long j10, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j11, AbstractC9126n abstractC9126n) {
        this(i10, list, z10, horizontal, vertical, layoutDirection, z11, i11, i12, i13, j10, obj, obj2, lazyLayoutItemAnimator, j11);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m20967copy4Tuh3kE(long j10, InterfaceC10570l interfaceC10570l) {
        int iM27028getYimpl;
        long j11;
        if (isVertical()) {
            int iM27027getXimpl = IntOffset.m27027getXimpl(j10);
            iM27028getYimpl = ((Number) interfaceC10570l.invoke(Integer.valueOf(IntOffset.m27028getYimpl(j10)))).intValue();
            j11 = iM27027getXimpl;
        } else {
            int iIntValue = ((Number) interfaceC10570l.invoke(Integer.valueOf(IntOffset.m27027getXimpl(j10)))).intValue();
            iM27028getYimpl = IntOffset.m27028getYimpl(j10);
            j11 = iIntValue;
        }
        return IntOffset.m27021constructorimpl((j11 << 32) | (iM27028getYimpl & 4294967295L));
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m20968getMainAxisgyyYBs(long j10) {
        return isVertical() ? IntOffset.m27028getYimpl(j10) : IntOffset.m27027getXimpl(j10);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return isVertical() ? placeable.getHeight() : placeable.getWidth();
    }

    public final void applyScrollDelta(int i10, boolean z10) {
        int iIntValue;
        int iM27028getYimpl;
        if (getNonScrollableItem()) {
            return;
        }
        this.offset = getOffset() + i10;
        int length = this.placeableOffsets.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 & 1;
            if ((isVertical() && i12 != 0) || (!isVertical() && i12 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i11] = iArr[i11] + i10;
            }
        }
        if (z10) {
            int placeablesCount = getPlaceablesCount();
            for (int i13 = 0; i13 < placeablesCount; i13++) {
                LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i13);
                if (animation != null) {
                    long jM21019getRawOffsetnOccac = animation.m21019getRawOffsetnOccac();
                    if (isVertical()) {
                        iIntValue = IntOffset.m27027getXimpl(jM21019getRawOffsetnOccac);
                        iM27028getYimpl = Integer.valueOf(IntOffset.m27028getYimpl(jM21019getRawOffsetnOccac) + i10).intValue();
                    } else {
                        iIntValue = Integer.valueOf(IntOffset.m27027getXimpl(jM21019getRawOffsetnOccac) + i10).intValue();
                        iM27028getYimpl = IntOffset.m27028getYimpl(jM21019getRawOffsetnOccac);
                    }
                    animation.m21022setRawOffsetgyyYBs(IntOffset.m27021constructorimpl((iIntValue << 32) | (4294967295L & iM27028getYimpl)));
                }
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public long mo20969getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public Object getContentType() {
        return this.contentType;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getLane() {
        return this.lane;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getOffset-Bjo55l4, reason: not valid java name */
    public long mo20970getOffsetBjo55l4(int i10) {
        int[] iArr = this.placeableOffsets;
        int i11 = i10 * 2;
        return IntOffset.m27021constructorimpl((iArr[i11] << 32) | (iArr[i11 + 1] & 4294967295L));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getParentData(int i10) {
        return this.placeables.get(i10).getParentData();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getSize() {
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

    public final void place(Placeable.PlacementScope placementScope, boolean z10) {
        GraphicsLayer layer;
        Placeable.PlacementScope placementScope2;
        long jM27027getXimpl;
        int i10 = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        int placeablesCount = getPlaceablesCount();
        while (i10 < placeablesCount) {
            Placeable placeable = this.placeables.get(i10);
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i11 = this.maxMainAxisOffset;
            long jMo20970getOffsetBjo55l4 = mo20970getOffsetBjo55l4(i10);
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i10);
            if (animation != null) {
                if (z10) {
                    animation.m21021setLookaheadOffsetgyyYBs(jMo20970getOffsetBjo55l4);
                } else {
                    if (!IntOffset.m27026equalsimpl0(animation.m21017getLookaheadOffsetnOccac(), LazyLayoutItemAnimation.Companion.m21024getNotInitializednOccac())) {
                        jMo20970getOffsetBjo55l4 = animation.m21017getLookaheadOffsetnOccac();
                    }
                    long jM27031plusqkQi6aY = IntOffset.m27031plusqkQi6aY(jMo20970getOffsetBjo55l4, animation.m21018getPlacementDeltanOccac());
                    if ((m20968getMainAxisgyyYBs(jMo20970getOffsetBjo55l4) <= mainAxisSize && m20968getMainAxisgyyYBs(jM27031plusqkQi6aY) <= mainAxisSize) || (m20968getMainAxisgyyYBs(jMo20970getOffsetBjo55l4) >= i11 && m20968getMainAxisgyyYBs(jM27031plusqkQi6aY) >= i11)) {
                        animation.cancelPlacementAnimation();
                    }
                    jMo20970getOffsetBjo55l4 = jM27031plusqkQi6aY;
                }
                layer = animation.getLayer();
            } else {
                layer = null;
            }
            if (this.reverseLayout) {
                if (isVertical()) {
                    jM27027getXimpl = (((this.mainAxisLayoutSize - IntOffset.m27028getYimpl(jMo20970getOffsetBjo55l4)) - getMainAxisSize(placeable)) & 4294967295L) | (IntOffset.m27027getXimpl(jMo20970getOffsetBjo55l4) << 32);
                } else {
                    jM27027getXimpl = (((this.mainAxisLayoutSize - IntOffset.m27027getXimpl(jMo20970getOffsetBjo55l4)) - getMainAxisSize(placeable)) << 32) | (4294967295L & IntOffset.m27028getYimpl(jMo20970getOffsetBjo55l4));
                }
                jMo20970getOffsetBjo55l4 = IntOffset.m27021constructorimpl(jM27027getXimpl);
            }
            long jM27031plusqkQi6aY2 = IntOffset.m27031plusqkQi6aY(jMo20970getOffsetBjo55l4, this.visualOffset);
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
        position(i10, i12, i13);
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
    private LazyListMeasuredItem(int i10, List<? extends Placeable> list, boolean z10, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z11, int i11, int i12, int i13, long j10, Object obj, Object obj2, LazyLayoutItemAnimator<LazyListMeasuredItem> lazyLayoutItemAnimator, long j11) {
        this.index = i10;
        this.placeables = list;
        this.isVertical = z10;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z11;
        this.beforeContentPadding = i11;
        this.afterContentPadding = i12;
        this.spacing = i13;
        this.visualOffset = j10;
        this.key = obj;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j11;
        this.span = 1;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int height = 0;
        int iMax = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Placeable placeable = (Placeable) list.get(i14);
            height += isVertical() ? placeable.getHeight() : placeable.getWidth();
            iMax = Math.max(iMax, !isVertical() ? placeable.getHeight() : placeable.getWidth());
        }
        this.size = height;
        this.mainAxisSizeWithSpacings = AbstractC8323h.m13510e(getSize() + this.spacing, 0);
        this.crossAxisSize = iMax;
        this.placeableOffsets = new int[this.placeables.size() * 2];
    }

    public final void position(int i10, int i11, int i12) {
        int width;
        this.offset = i10;
        this.mainAxisLayoutSize = isVertical() ? i12 : i11;
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            Placeable placeable = list.get(i13);
            int i14 = i13 * 2;
            if (isVertical()) {
                int[] iArr = this.placeableOffsets;
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalAlignment when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                iArr[i14] = horizontal.align(placeable.getWidth(), i11, this.layoutDirection);
                this.placeableOffsets[i14 + 1] = i10;
                width = placeable.getHeight();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i14] = i10;
                int i15 = i14 + 1;
                Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalAlignment when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                iArr2[i15] = vertical.align(placeable.getHeight(), i12);
                width = placeable.getWidth();
            }
            i10 += width;
        }
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }
}
