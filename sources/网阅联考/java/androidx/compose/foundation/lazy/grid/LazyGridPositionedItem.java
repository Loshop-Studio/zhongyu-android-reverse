package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.unit.IntOffset;
import androidx.compose.p006ui.unit.IntOffsetKt;
import androidx.compose.p006ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B~\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0019\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010,2\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000J\u0006\u0010-\u001a\u00020\u0005J\u0006\u0010.\u001a\u00020\u0005J\u0006\u0010)\u001a\u00020\u0005J\u000e\u0010)\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202J.\u00103\u001a\u00020\u0003*\u00020\u00032\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000505H\u0082\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107R\u0014\u0010\t\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010$\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010\u001aR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u001f\u0010\n\u001a\u00020\u000bX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010#\u001a\u0004\b'\u0010\"R\u0019\u0010\u0015\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010#R\u0018\u0010(\u001a\u00020\u0005*\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, m5175d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "offset", "Landroidx/compose/ui/unit/IntOffset;", "index", "", "key", "", "row", "column", "size", "Landroidx/compose/ui/unit/IntSize;", "minMainAxisOffset", "maxMainAxisOffset", "isVertical", "", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "visualOffset", "mainAxisLayoutSize", "reverseLayout", "(JILjava/lang/Object;IIJIIZLjava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColumn", "()I", "hasAnimations", "getHasAnimations", "()Z", "getIndex", "getKey", "()Ljava/lang/Object;", "getOffset-nOcc-ac", "()J", "J", "placeablesCount", "getPlaceablesCount", "getRow", "getSize-YbymL2g", "mainAxisSize", "getMainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "getAnimationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getCrossAxisOffset", "getCrossAxisSize", "place", "", "scope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "copy", "mainAxisMap", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyGridMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridPositionedItem\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,196:1\n194#1:197\n86#2:198\n86#2:199\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridPositionedItem\n*L\n178#1:197\n185#1:198\n187#1:199\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridPositionedItem implements LazyGridItemInfo {
    private final int column;
    private final boolean hasAnimations;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int mainAxisLayoutSize;
    private final int maxMainAxisOffset;
    private final int minMainAxisOffset;
    private final long offset;
    private final List<Placeable> placeables;
    private final LazyGridItemPlacementAnimator placementAnimator;
    private final boolean reverseLayout;
    private final int row;
    private final long size;
    private final long visualOffset;

    public /* synthetic */ LazyGridPositionedItem(long j4, int i4, Object obj, int i5, int i6, long j5, int i7, int i8, boolean z3, List list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j6, int i9, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j4, i4, obj, i5, i6, j5, i7, i8, z3, list, lazyGridItemPlacementAnimator, j6, i9, z4);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m7482copy4Tuh3kE(long j4, Function1<? super Integer, Integer> function1) {
        int iM11643getXimpl = this.isVertical ? IntOffset.m11643getXimpl(j4) : function1.invoke(Integer.valueOf(IntOffset.m11643getXimpl(j4))).intValue();
        boolean z3 = this.isVertical;
        int iM11644getYimpl = IntOffset.m11644getYimpl(j4);
        if (z3) {
            iM11644getYimpl = function1.invoke(Integer.valueOf(iM11644getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(iM11643getXimpl, iM11644getYimpl);
    }

    public final FiniteAnimationSpec<IntOffset> getAnimationSpec(int index) {
        Object parentData = this.placeables.get(index).getParentData();
        if (parentData instanceof FiniteAnimationSpec) {
            return (FiniteAnimationSpec) parentData;
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.column;
    }

    public final int getCrossAxisOffset() {
        return this.isVertical ? IntOffset.m11643getXimpl(getOffset()) : IntOffset.m11644getYimpl(getOffset());
    }

    public final int getCrossAxisSize() {
        return this.isVertical ? IntSize.m11685getWidthimpl(getSize()) : IntSize.m11684getHeightimpl(getSize());
    }

    public final boolean getHasAnimations() {
        return this.hasAnimations;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public Object getKey() {
        return this.key;
    }

    public final int getMainAxisSize(int index) {
        return getMainAxisSize(this.placeables.get(index));
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getOffset-nOcc-ac, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.row;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getSize-YbymL2g, reason: from getter */
    public long getSize() {
        return this.size;
    }

    public final void place(Placeable.PlacementScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        int placeablesCount = getPlaceablesCount();
        for (int i4 = 0; i4 < placeablesCount; i4++) {
            Placeable placeable = this.placeables.get(i4);
            long jM7473getAnimatedOffsetYT5a7pE = getAnimationSpec(i4) != null ? this.placementAnimator.m7473getAnimatedOffsetYT5a7pE(getKey(), i4, this.minMainAxisOffset - getMainAxisSize(placeable), this.maxMainAxisOffset, getOffset()) : getOffset();
            if (this.reverseLayout) {
                jM7473getAnimatedOffsetYT5a7pE = IntOffsetKt.IntOffset(this.isVertical ? IntOffset.m11643getXimpl(jM7473getAnimatedOffsetYT5a7pE) : (this.mainAxisLayoutSize - IntOffset.m11643getXimpl(jM7473getAnimatedOffsetYT5a7pE)) - getMainAxisSize(placeable), this.isVertical ? (this.mainAxisLayoutSize - IntOffset.m11644getYimpl(jM7473getAnimatedOffsetYT5a7pE)) - getMainAxisSize(placeable) : IntOffset.m11644getYimpl(jM7473getAnimatedOffsetYT5a7pE));
            }
            if (this.isVertical) {
                long j4 = this.visualOffset;
                Placeable.PlacementScope.m10623placeWithLayeraW9wM$default(scope, placeable, IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(jM7473getAnimatedOffsetYT5a7pE) + IntOffset.m11643getXimpl(j4), IntOffset.m11644getYimpl(jM7473getAnimatedOffsetYT5a7pE) + IntOffset.m11644getYimpl(j4)), 0.0f, null, 6, null);
            } else {
                long j5 = this.visualOffset;
                Placeable.PlacementScope.m10622placeRelativeWithLayeraW9wM$default(scope, placeable, IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(jM7473getAnimatedOffsetYT5a7pE) + IntOffset.m11643getXimpl(j5), IntOffset.m11644getYimpl(jM7473getAnimatedOffsetYT5a7pE) + IntOffset.m11644getYimpl(j5)), 0.0f, null, 6, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyGridPositionedItem(long j4, int i4, Object obj, int i5, int i6, long j5, int i7, int i8, boolean z3, List<? extends Placeable> list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j6, int i9, boolean z4) {
        this.offset = j4;
        this.index = i4;
        this.key = obj;
        this.row = i5;
        this.column = i6;
        this.size = j5;
        this.minMainAxisOffset = i7;
        this.maxMainAxisOffset = i8;
        this.isVertical = z3;
        this.placeables = list;
        this.placementAnimator = lazyGridItemPlacementAnimator;
        this.visualOffset = j6;
        this.mainAxisLayoutSize = i9;
        this.reverseLayout = z4;
        int placeablesCount = getPlaceablesCount();
        boolean z5 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= placeablesCount) {
                break;
            }
            if (getAnimationSpec(i10) != null) {
                z5 = true;
                break;
            }
            i10++;
        }
        this.hasAnimations = z5;
    }

    public final int getMainAxisSize() {
        return this.isVertical ? IntSize.m11684getHeightimpl(getSize()) : IntSize.m11685getWidthimpl(getSize());
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }
}
