package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.p012ui.graphics.layer.GraphicsLayer;
import androidx.compose.p012ui.layout.Placeable;
import androidx.compose.p012ui.unit.IntOffset;
import androidx.compose.p012ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0016\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u000bJ\u001d\u0010D\u001a\u0002032\u0006\u0010\u0003\u001a\u00020\u0004H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u001e\u0010H\u001a\u00020A2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u000bJ\u001e\u0010N\u001a\u00020A2\u0006\u0010<\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004J(\u0010N\u001a\u00020A2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u0004H\u0016J\b\u0010S\u001a\u00020TH\u0016J\u000e\u0010U\u001a\u00020A2\u0006\u0010&\u001a\u00020\u0004J+\u0010V\u001a\u000203*\u0002032\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040XH\u0082\bø\u0001\u0000¢\u0006\u0004\bY\u0010ZR\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u00020\u0015X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010 R\u001a\u0010!\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010 \"\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0014\u0010\r\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u000e\u0010&\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010'\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b(\u0010\u001eR\u0011\u0010)\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0014\u0010+\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u000e\u0010-\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010 \"\u0004\b1\u0010#R&\u00104\u001a\u0002032\u0006\u00102\u001a\u000203@RX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b5\u0010\u0018R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u001eR\u001c\u00108\u001a\u000209X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b:\u0010\u0018R\u0014\u0010\u000e\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u001eR\u0018\u0010<\u001a\u00020\u0004*\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0019\u0010)\u001a\u00020\u0004*\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, m13413d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "index", "", "key", "", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "isVertical", "", "spacing", "lane", "span", "beforeContentPadding", "afterContentPadding", "contentType", "animator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "(ILjava/lang/Object;Ljava/util/List;ZIIIIILjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getConstraints-msEJaDk", "()J", "J", "getContentType", "()Ljava/lang/Object;", "crossAxisSize", "getCrossAxisSize", "()I", "getIndex", "()Z", "isVisible", "setVisible", "(Z)V", "getKey", "getLane", "mainAxisLayoutSize", "mainAxisOffset", "getMainAxisOffset", "mainAxisSize", "getMainAxisSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "maxMainAxisOffset", "minMainAxisOffset", "nonScrollableItem", "getNonScrollableItem", "setNonScrollableItem", "<set-?>", "Landroidx/compose/ui/unit/IntOffset;", TypedValues.CycleType.S_WAVE_OFFSET, "getOffset-nOcc-ac", "placeablesCount", "getPlaceablesCount", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "getSpan", "mainAxis", "getMainAxis--gyyYBs", "(J)I", "(Landroidx/compose/ui/layout/Placeable;)I", "applyScrollDelta", "", "delta", "updateAnimations", "getOffset", "getOffset-Bjo55l4", "(I)J", "getParentData", "place", "scope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "context", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "isLookingAhead", RequestParameters.POSITION, "crossAxis", "crossAxisOffset", "layoutWidth", "layoutHeight", "toString", "", "updateMainAxisLayoutSize", "copy", "mainAxisMap", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,1475:1\n1461#1:1509\n1464#1:1510\n1461#1:1511\n1464#1:1515\n1464#1:1518\n344#2,8:1476\n344#2,8:1484\n70#2,4:1505\n75#2:1514\n30#3:1492\n30#3:1494\n80#4:1493\n80#4:1495\n80#4:1497\n80#4:1499\n80#4:1513\n80#4:1517\n80#4:1520\n80#4:1522\n32#5:1496\n32#5:1498\n32#5:1512\n32#5:1516\n32#5:1519\n32#5:1521\n96#6,5:1500\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n*L\n1379#1:1509\n1416#1:1510\n1417#1:1511\n1446#1:1515\n1451#1:1518\n1312#1:1476,8\n1319#1:1484,8\n1378#1:1505,4\n1378#1:1514\n1333#1:1492\n1335#1:1494\n1333#1:1493\n1335#1:1495\n1352#1:1497\n1354#1:1499\n1416#1:1513\n1446#1:1517\n1451#1:1520\n1464#1:1522\n1352#1:1496\n1354#1:1498\n1416#1:1512\n1446#1:1516\n1451#1:1519\n1464#1:1521\n1376#1:1500,5\n*E\n"})
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

    public /* synthetic */ LazyStaggeredGridMeasuredItem(int i9, Object obj, List list, boolean z9, int i10, int i11, int i12, int i13, int i14, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j9, DefaultConstructorMarker defaultConstructorMarker) {
        this(i9, obj, list, z9, i10, i11, i12, i13, i14, obj2, lazyLayoutItemAnimator, j9);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m18337copy4Tuh3kE(long j9, Function1<? super Integer, Integer> function1) {
        int iM24122getXimpl = getIsVertical() ? IntOffset.m24122getXimpl(j9) : function1.invoke(Integer.valueOf(IntOffset.m24122getXimpl(j9))).intValue();
        boolean isVertical = getIsVertical();
        int iM24123getYimpl = IntOffset.m24123getYimpl(j9);
        if (isVertical) {
            iM24123getYimpl = function1.invoke(Integer.valueOf(iM24123getYimpl)).intValue();
        }
        return IntOffset.m24116constructorimpl((iM24122getXimpl << 32) | (iM24123getYimpl & 4294967295L));
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m18338getMainAxisgyyYBs(long j9) {
        return getIsVertical() ? IntOffset.m24123getYimpl(j9) : IntOffset.m24122getXimpl(j9);
    }

    public final void applyScrollDelta(int delta, boolean updateAnimations) {
        if (getNonScrollableItem()) {
            return;
        }
        long offset = getOffset();
        int iM24122getXimpl = getIsVertical() ? IntOffset.m24122getXimpl(offset) : IntOffset.m24122getXimpl(offset) + delta;
        boolean isVertical = getIsVertical();
        int iM24123getYimpl = IntOffset.m24123getYimpl(offset);
        if (isVertical) {
            iM24123getYimpl += delta;
        }
        this.offset = IntOffset.m24116constructorimpl((iM24122getXimpl << 32) | (iM24123getYimpl & 4294967295L));
        if (updateAnimations) {
            int placeablesCount = getPlaceablesCount();
            for (int i9 = 0; i9 < placeablesCount; i9++) {
                LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i9);
                if (animation != null) {
                    long rawOffset = animation.getRawOffset();
                    int iM24122getXimpl2 = getIsVertical() ? IntOffset.m24122getXimpl(rawOffset) : Integer.valueOf(IntOffset.m24122getXimpl(rawOffset) + delta).intValue();
                    boolean isVertical2 = getIsVertical();
                    int iM24123getYimpl2 = IntOffset.m24123getYimpl(rawOffset);
                    if (isVertical2) {
                        iM24123getYimpl2 = Integer.valueOf(iM24123getYimpl2 + delta).intValue();
                    }
                    animation.m18280setRawOffsetgyyYBs(IntOffset.m24116constructorimpl((iM24123getYimpl2 & 4294967295L) | (iM24122getXimpl2 << 32)));
                }
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getConstraints-msEJaDk, reason: from getter */
    public long getConstraints() {
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
        return !getIsVertical() ? IntOffset.m24122getXimpl(getOffset()) : IntOffset.m24123getYimpl(getOffset());
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
    public long mo18228getOffsetBjo55l4(int index) {
        return getOffset();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getOffset-nOcc-ac, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getParentData(int index) {
        return this.placeables.get(index).getParentData();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getSize-YbymL2g, reason: from getter */
    public long getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: isVertical, reason: from getter */
    public boolean getIsVertical() {
        return this.isVertical;
    }

    /* renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public final void place(Placeable.PlacementScope scope, LazyStaggeredGridMeasureContext context, boolean isLookingAhead) {
        GraphicsLayer layer;
        if (!(this.mainAxisLayoutSize != -1)) {
            InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            Placeable placeable = list.get(i9);
            int height = this.minMainAxisOffset - (getIsVertical() ? placeable.getHeight() : placeable.getWidth());
            int i10 = this.maxMainAxisOffset;
            long offset = getOffset();
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i9);
            if (animation != null) {
                if (isLookingAhead) {
                    animation.m18279setLookaheadOffsetgyyYBs(offset);
                } else {
                    long jM24126plusqkQi6aY = IntOffset.m24126plusqkQi6aY(!IntOffset.m24121equalsimpl0(animation.getLookaheadOffset(), LazyLayoutItemAnimation.INSTANCE.m18281getNotInitializednOccac()) ? animation.getLookaheadOffset() : offset, animation.m18276getPlacementDeltanOccac());
                    if ((m18338getMainAxisgyyYBs(offset) <= height && m18338getMainAxisgyyYBs(jM24126plusqkQi6aY) <= height) || (m18338getMainAxisgyyYBs(offset) >= i10 && m18338getMainAxisgyyYBs(jM24126plusqkQi6aY) >= i10)) {
                        animation.cancelPlacementAnimation();
                    }
                    offset = jM24126plusqkQi6aY;
                }
                layer = animation.getLayer();
            } else {
                layer = null;
            }
            if (context.getReverseLayout()) {
                int iM24122getXimpl = getIsVertical() ? IntOffset.m24122getXimpl(offset) : (this.mainAxisLayoutSize - IntOffset.m24122getXimpl(offset)) - (getIsVertical() ? placeable.getHeight() : placeable.getWidth());
                offset = IntOffset.m24116constructorimpl(((getIsVertical() ? (this.mainAxisLayoutSize - IntOffset.m24123getYimpl(offset)) - (getIsVertical() ? placeable.getHeight() : placeable.getWidth()) : IntOffset.m24123getYimpl(offset)) & 4294967295L) | (iM24122getXimpl << 32));
            }
            long jM24126plusqkQi6aY2 = IntOffset.m24126plusqkQi6aY(offset, context.getContentOffset());
            if (!isLookingAhead && animation != null) {
                animation.m18278setFinalOffsetgyyYBs(jM24126plusqkQi6aY2);
            }
            if (layer != null) {
                Placeable.PlacementScope.m22824placeRelativeWithLayeraW9wM$default(scope, placeable, jM24126plusqkQi6aY2, layer, 0.0f, 4, (Object) null);
            } else {
                Placeable.PlacementScope.m22823placeRelativeWithLayeraW9wM$default(scope, placeable, jM24126plusqkQi6aY2, 0.0f, (Function1) null, 6, (Object) null);
            }
        }
    }

    public final void position(int mainAxis, int crossAxis, int mainAxisLayoutSize) {
        long jM24116constructorimpl;
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = mainAxisLayoutSize + this.afterContentPadding;
        if (getIsVertical()) {
            jM24116constructorimpl = IntOffset.m24116constructorimpl((crossAxis << 32) | (4294967295L & mainAxis));
        } else {
            jM24116constructorimpl = IntOffset.m24116constructorimpl((crossAxis & 4294967295L) | (mainAxis << 32));
        }
        this.offset = jM24116constructorimpl;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void setNonScrollableItem(boolean z9) {
        this.nonScrollableItem = z9;
    }

    public final void setVisible(boolean z9) {
        this.isVisible = z9;
    }

    public String toString() {
        return super.toString();
    }

    public final void updateMainAxisLayoutSize(int mainAxisLayoutSize) {
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.maxMainAxisOffset = mainAxisLayoutSize + this.afterContentPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyStaggeredGridMeasuredItem(int i9, Object obj, List<? extends Placeable> list, boolean z9, int i10, int i11, int i12, int i13, int i14, Object obj2, LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> lazyLayoutItemAnimator, long j9) {
        int height;
        this.index = i9;
        this.key = obj;
        this.placeables = list;
        this.isVertical = z9;
        this.lane = i11;
        this.span = i12;
        this.beforeContentPadding = i13;
        this.afterContentPadding = i14;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j9;
        int i15 = 1;
        this.isVisible = true;
        int i16 = 0;
        if (list.isEmpty()) {
            height = 0;
        } else {
            Placeable placeable = (Placeable) list.get(0);
            height = getIsVertical() ? placeable.getHeight() : placeable.getWidth();
            int lastIndex = CollectionsKt.getLastIndex(list);
            if (1 <= lastIndex) {
                int i17 = 1;
                while (true) {
                    Placeable placeable2 = (Placeable) list.get(i17);
                    int height2 = getIsVertical() ? placeable2.getHeight() : placeable2.getWidth();
                    height = height2 > height ? height2 : height;
                    if (i17 == lastIndex) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        }
        this.mainAxisSize = height;
        this.mainAxisSizeWithSpacings = RangesKt.coerceAtLeast(height + i10, 0);
        List<Placeable> list2 = this.placeables;
        if (!list2.isEmpty()) {
            Placeable placeable3 = list2.get(0);
            int width = getIsVertical() ? placeable3.getWidth() : placeable3.getHeight();
            int lastIndex2 = CollectionsKt.getLastIndex(list2);
            if (1 <= lastIndex2) {
                while (true) {
                    Placeable placeable4 = list2.get(i15);
                    int width2 = getIsVertical() ? placeable4.getWidth() : placeable4.getHeight();
                    width = width2 > width ? width2 : width;
                    if (i15 == lastIndex2) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            i16 = width;
        }
        this.crossAxisSize = i16;
        this.mainAxisLayoutSize = -1;
        this.size = getIsVertical() ? IntSize.m24160constructorimpl((this.mainAxisSize & 4294967295L) | (i16 << 32)) : IntSize.m24160constructorimpl((i16 & 4294967295L) | (this.mainAxisSize << 32));
        this.offset = IntOffset.INSTANCE.m24133getZeronOccac();
    }

    private final int getMainAxisSize(Placeable placeable) {
        return getIsVertical() ? placeable.getHeight() : placeable.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void position(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight) {
        if (getIsVertical()) {
            layoutWidth = layoutHeight;
        }
        position(mainAxisOffset, crossAxisOffset, layoutWidth);
    }
}
