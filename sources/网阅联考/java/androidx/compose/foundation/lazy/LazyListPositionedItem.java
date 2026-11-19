package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.unit.IntOffset;
import androidx.compose.p006ui.unit.IntOffsetKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001Bn\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\u0019\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010'2\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000J\u000e\u0010$\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u001e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-J.\u0010.\u001a\u00020\u0012*\u00020\u00122\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000300H\u0082\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102R\u0011\u0010\u0016\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001aR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0019\u0010\u0011\u001a\u00020\u0012X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\"\u001a\u00020\u0003*\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00063"}, m5175d2 = {"Landroidx/compose/foundation/lazy/LazyListPositionedItem;", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "offset", "", "index", "key", "", "size", "minMainAxisOffset", "maxMainAxisOffset", "isVertical", "", "wrappers", "", "Landroidx/compose/foundation/lazy/LazyListPlaceableWrapper;", "placementAnimator", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "visualOffset", "Landroidx/compose/ui/unit/IntOffset;", "reverseLayout", "mainAxisLayoutSize", "(IILjava/lang/Object;IIIZLjava/util/List;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "hasAnimations", "getHasAnimations", "()Z", "getIndex", "()I", "getKey", "()Ljava/lang/Object;", "getOffset", "placeablesCount", "getPlaceablesCount", "getSize", "J", "mainAxisSize", "Landroidx/compose/ui/layout/Placeable;", "getMainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "getAnimationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getOffset-Bjo55l4", "(I)J", "place", "", "scope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "copy", "mainAxisMap", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListPositionedItem\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,193:1\n186#1:194\n86#2:195\n86#2:196\n*S KotlinDebug\n*F\n+ 1 LazyMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListPositionedItem\n*L\n170#1:194\n177#1:195\n179#1:196\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListPositionedItem implements LazyListItemInfo {
    private final boolean hasAnimations;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int mainAxisLayoutSize;
    private final int maxMainAxisOffset;
    private final int minMainAxisOffset;
    private final int offset;
    private final LazyListItemPlacementAnimator placementAnimator;
    private final boolean reverseLayout;
    private final int size;
    private final long visualOffset;
    private final List<LazyListPlaceableWrapper> wrappers;

    public /* synthetic */ LazyListPositionedItem(int i4, int i5, Object obj, int i6, int i7, int i8, boolean z3, List list, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j4, boolean z4, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, i5, obj, i6, i7, i8, z3, list, lazyListItemPlacementAnimator, j4, z4, i9);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m7427copy4Tuh3kE(long j4, Function1<? super Integer, Integer> function1) {
        int iM11643getXimpl = this.isVertical ? IntOffset.m11643getXimpl(j4) : function1.invoke(Integer.valueOf(IntOffset.m11643getXimpl(j4))).intValue();
        boolean z3 = this.isVertical;
        int iM11644getYimpl = IntOffset.m11644getYimpl(j4);
        if (z3) {
            iM11644getYimpl = function1.invoke(Integer.valueOf(iM11644getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(iM11643getXimpl, iM11644getYimpl);
    }

    public final FiniteAnimationSpec<IntOffset> getAnimationSpec(int index) {
        Object parentData = this.wrappers.get(index).getPlaceable().getParentData();
        if (parentData instanceof FiniteAnimationSpec) {
            return (FiniteAnimationSpec) parentData;
        }
        return null;
    }

    public final boolean getHasAnimations() {
        return this.hasAnimations;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public Object getKey() {
        return this.key;
    }

    public final int getMainAxisSize(int index) {
        return getMainAxisSize(this.wrappers.get(index).getPlaceable());
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getOffset() {
        return this.offset;
    }

    /* renamed from: getOffset-Bjo55l4, reason: not valid java name */
    public final long m7428getOffsetBjo55l4(int index) {
        return this.wrappers.get(index).getOffset();
    }

    public final int getPlaceablesCount() {
        return this.wrappers.size();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getSize() {
        return this.size;
    }

    public final void place(Placeable.PlacementScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        int placeablesCount = getPlaceablesCount();
        for (int i4 = 0; i4 < placeablesCount; i4++) {
            Placeable placeable = this.wrappers.get(i4).getPlaceable();
            long jM7420getAnimatedOffsetYT5a7pE = getAnimationSpec(i4) != null ? this.placementAnimator.m7420getAnimatedOffsetYT5a7pE(getKey(), i4, this.minMainAxisOffset - getMainAxisSize(placeable), this.maxMainAxisOffset, m7428getOffsetBjo55l4(i4)) : m7428getOffsetBjo55l4(i4);
            if (this.reverseLayout) {
                jM7420getAnimatedOffsetYT5a7pE = IntOffsetKt.IntOffset(this.isVertical ? IntOffset.m11643getXimpl(jM7420getAnimatedOffsetYT5a7pE) : (this.mainAxisLayoutSize - IntOffset.m11643getXimpl(jM7420getAnimatedOffsetYT5a7pE)) - getMainAxisSize(placeable), this.isVertical ? (this.mainAxisLayoutSize - IntOffset.m11644getYimpl(jM7420getAnimatedOffsetYT5a7pE)) - getMainAxisSize(placeable) : IntOffset.m11644getYimpl(jM7420getAnimatedOffsetYT5a7pE));
            }
            if (this.isVertical) {
                long j4 = this.visualOffset;
                Placeable.PlacementScope.m10623placeWithLayeraW9wM$default(scope, placeable, IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(jM7420getAnimatedOffsetYT5a7pE) + IntOffset.m11643getXimpl(j4), IntOffset.m11644getYimpl(jM7420getAnimatedOffsetYT5a7pE) + IntOffset.m11644getYimpl(j4)), 0.0f, null, 6, null);
            } else {
                long j5 = this.visualOffset;
                Placeable.PlacementScope.m10622placeRelativeWithLayeraW9wM$default(scope, placeable, IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(jM7420getAnimatedOffsetYT5a7pE) + IntOffset.m11643getXimpl(j5), IntOffset.m11644getYimpl(jM7420getAnimatedOffsetYT5a7pE) + IntOffset.m11644getYimpl(j5)), 0.0f, null, 6, null);
            }
        }
    }

    private LazyListPositionedItem(int i4, int i5, Object obj, int i6, int i7, int i8, boolean z3, List<LazyListPlaceableWrapper> list, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j4, boolean z4, int i9) {
        this.offset = i4;
        this.index = i5;
        this.key = obj;
        this.size = i6;
        this.minMainAxisOffset = i7;
        this.maxMainAxisOffset = i8;
        this.isVertical = z3;
        this.wrappers = list;
        this.placementAnimator = lazyListItemPlacementAnimator;
        this.visualOffset = j4;
        this.reverseLayout = z4;
        this.mainAxisLayoutSize = i9;
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

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }
}
