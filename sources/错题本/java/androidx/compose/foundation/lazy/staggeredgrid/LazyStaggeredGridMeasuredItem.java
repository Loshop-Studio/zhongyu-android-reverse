package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.p011ui.graphics.layer.GraphicsLayer;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003¢\u0006\u0004\b\"\u0010#J/\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010(J%\u0010.\u001a\u00020!2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\n¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0003¢\u0006\u0004\b0\u00101J\u001d\u00104\u001a\u00020!2\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\n¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J+\u0010=\u001a\u00020\u001a*\u00020\u001a2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000309H\u0082\bø\u0001\u0001¢\u0006\u0004\b;\u0010<R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010DR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\b\u000b\u0010FR\u001a\u0010\r\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\bG\u0010@R\u001a\u0010\u000e\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\bH\u0010@R\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010>R\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010>R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bI\u0010CR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010JR \u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0015\u0010K\u001a\u0004\bL\u0010MR\"\u0010N\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010E\u001a\u0004\bN\u0010F\"\u0004\bO\u0010PR\u0017\u0010Q\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bQ\u0010>\u001a\u0004\bR\u0010@R\u001a\u0010S\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010>\u001a\u0004\bT\u0010@R\u0017\u0010U\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bU\u0010>\u001a\u0004\bV\u0010@R\u0016\u0010 \u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010>R\u0016\u0010W\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010>R\u0016\u0010X\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010>R\"\u0010Y\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bY\u0010E\u001a\u0004\bZ\u0010F\"\u0004\b[\u0010PR \u0010]\u001a\u00020\\8\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b]\u0010K\u001a\u0004\b^\u0010MR*\u0010`\u001a\u00020\u001a2\u0006\u0010_\u001a\u00020\u001a8\u0016@RX\u0096\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b`\u0010K\u001a\u0004\ba\u0010MR\u0014\u0010c\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010@R\u0011\u0010$\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bd\u0010@R\u0018\u0010\u001e\u001a\u00020\u0003*\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0019\u0010Q\u001a\u00020\u0003*\u00020\b8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010g\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006h"}, m5110d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "", "index", "", "key", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "", "isVertical", "spacing", "lane", "span", "beforeContentPadding", "afterContentPadding", "contentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "Landroidx/compose/ui/unit/Constraints;", "constraints", "<init>", "(ILjava/lang/Object;Ljava/util/List;ZIIIIILjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JLkotlin/jvm/internal/e;)V", "getParentData", "(I)Ljava/lang/Object;", "Landroidx/compose/ui/unit/IntOffset;", "getOffset-Bjo55l4", "(I)J", "getOffset", "mainAxis", "crossAxis", "mainAxisLayoutSize", "Ld6/s;", RequestParameters.POSITION, "(III)V", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "(IIII)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "context", "isLookingAhead", "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;Z)V", "updateMainAxisLayoutSize", "(I)V", "delta", "updateAnimations", "applyScrollDelta", "(IZ)V", "", "toString", "()Ljava/lang/String;", "Lkotlin/Function1;", "mainAxisMap", "copy-4Tuh3kE", "(JLr6/c;)J", "copy", "I", "getIndex", "()I", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "Ljava/util/List;", "Z", "()Z", "getLane", "getSpan", "getContentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "J", "getConstraints-msEJaDk", "()J", "isVisible", "setVisible", "(Z)V", "mainAxisSize", "getMainAxisSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "crossAxisSize", "getCrossAxisSize", "minMainAxisOffset", "maxMainAxisOffset", "nonScrollableItem", "getNonScrollableItem", "setNonScrollableItem", "Landroidx/compose/ui/unit/IntSize;", "size", "getSize-YbymL2g", "<set-?>", TypedValues.CycleType.S_WAVE_OFFSET, "getOffset-nOcc-ac", "getPlaceablesCount", "placeablesCount", "getMainAxisOffset", "getMainAxis--gyyYBs", "(J)I", "(Landroidx/compose/ui/layout/Placeable;)I", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,1475:1\n1461#1:1509\n1464#1:1510\n1461#1:1511\n1464#1:1515\n1464#1:1518\n344#2,8:1476\n344#2,8:1484\n70#2,4:1505\n75#2:1514\n30#3:1492\n30#3:1494\n80#4:1493\n80#4:1495\n80#4:1497\n80#4:1499\n80#4:1513\n80#4:1517\n80#4:1520\n80#4:1522\n32#5:1496\n32#5:1498\n32#5:1512\n32#5:1516\n32#5:1519\n32#5:1521\n96#6,5:1500\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n*L\n1379#1:1509\n1416#1:1510\n1417#1:1511\n1446#1:1515\n1451#1:1518\n1312#1:1476,8\n1319#1:1484,8\n1378#1:1505,4\n1378#1:1514\n1333#1:1492\n1335#1:1494\n1333#1:1493\n1335#1:1495\n1352#1:1497\n1354#1:1499\n1416#1:1513\n1446#1:1517\n1451#1:1520\n1464#1:1522\n1352#1:1496\n1354#1:1498\n1416#1:1512\n1446#1:1516\n1451#1:1519\n1464#1:1521\n1376#1:1500,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasuredItem implements LazyStaggeredGridItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;

    @NotNull
    private final LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> animator;
    private final int beforeContentPadding;
    private final long constraints;

    @Nullable
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private boolean isVisible;

    @NotNull
    private final Object key;
    private final int lane;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;

    @NotNull
    private final List<Placeable> placeables;
    private final long size;
    private final int span;

    public /* synthetic */ LazyStaggeredGridMeasuredItem(int i, Object obj, List list, boolean z8, int i8, int i9, int i10, int i11, int i12, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j7, AbstractC5824e abstractC5824e) {
        this(i, obj, list, z8, i8, i9, i10, i11, i12, obj2, lazyLayoutItemAnimator, j7);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m7487copy4Tuh3kE(long j7, InterfaceC6471c interfaceC6471c) {
        int iM13433getXimpl = getIsVertical() ? IntOffset.m13433getXimpl(j7) : ((Number) interfaceC6471c.invoke(Integer.valueOf(IntOffset.m13433getXimpl(j7)))).intValue();
        boolean isVertical = getIsVertical();
        int iM13434getYimpl = IntOffset.m13434getYimpl(j7);
        if (isVertical) {
            iM13434getYimpl = ((Number) interfaceC6471c.invoke(Integer.valueOf(iM13434getYimpl))).intValue();
        }
        return IntOffset.m13427constructorimpl((iM13433getXimpl << 32) | (iM13434getYimpl & 4294967295L));
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m7488getMainAxisgyyYBs(long j7) {
        return getIsVertical() ? IntOffset.m13434getYimpl(j7) : IntOffset.m13433getXimpl(j7);
    }

    public final void applyScrollDelta(int delta, boolean updateAnimations) {
        if (getNonScrollableItem()) {
            return;
        }
        long offset = getOffset();
        int iM13433getXimpl = getIsVertical() ? IntOffset.m13433getXimpl(offset) : IntOffset.m13433getXimpl(offset) + delta;
        boolean isVertical = getIsVertical();
        int iM13434getYimpl = IntOffset.m13434getYimpl(offset);
        if (isVertical) {
            iM13434getYimpl += delta;
        }
        this.offset = IntOffset.m13427constructorimpl((iM13433getXimpl << 32) | (iM13434getYimpl & 4294967295L));
        if (updateAnimations) {
            int placeablesCount = getPlaceablesCount();
            for (int i = 0; i < placeablesCount; i++) {
                LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i);
                if (animation != null) {
                    long rawOffset = animation.getRawOffset();
                    int iM13433getXimpl2 = getIsVertical() ? IntOffset.m13433getXimpl(rawOffset) : Integer.valueOf(IntOffset.m13433getXimpl(rawOffset) + delta).intValue();
                    boolean isVertical2 = getIsVertical();
                    int iM13434getYimpl2 = IntOffset.m13434getYimpl(rawOffset);
                    if (isVertical2) {
                        iM13434getYimpl2 = Integer.valueOf(iM13434getYimpl2 + delta).intValue();
                    }
                    animation.m7428setRawOffsetgyyYBs(IntOffset.m13427constructorimpl((iM13434getYimpl2 & 4294967295L) | (iM13433getXimpl2 << 32)));
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
    @Nullable
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
    @NotNull
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getLane() {
        return this.lane;
    }

    public final int getMainAxisOffset() {
        return !getIsVertical() ? IntOffset.m13433getXimpl(getOffset()) : IntOffset.m13434getYimpl(getOffset());
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
    public long mo7376getOffsetBjo55l4(int index) {
        return getOffset();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getOffset-nOcc-ac, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    @Nullable
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

    public final void place(@NotNull Placeable.PlacementScope scope, @NotNull LazyStaggeredGridMeasureContext context, boolean isLookingAhead) {
        GraphicsLayer layer;
        if (!(this.mainAxisLayoutSize != -1)) {
            InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Placeable placeable = list.get(i);
            int height = this.minMainAxisOffset - (getIsVertical() ? placeable.getHeight() : placeable.getWidth());
            int i8 = this.maxMainAxisOffset;
            long offset = getOffset();
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i);
            if (animation != null) {
                if (isLookingAhead) {
                    animation.m7427setLookaheadOffsetgyyYBs(offset);
                } else {
                    long jM13437plusqkQi6aY = IntOffset.m13437plusqkQi6aY(!IntOffset.m13432equalsimpl0(animation.getLookaheadOffset(), LazyLayoutItemAnimation.INSTANCE.m7430getNotInitializednOccac()) ? animation.getLookaheadOffset() : offset, animation.m7424getPlacementDeltanOccac());
                    if ((m7488getMainAxisgyyYBs(offset) <= height && m7488getMainAxisgyyYBs(jM13437plusqkQi6aY) <= height) || (m7488getMainAxisgyyYBs(offset) >= i8 && m7488getMainAxisgyyYBs(jM13437plusqkQi6aY) >= i8)) {
                        animation.cancelPlacementAnimation();
                    }
                    offset = jM13437plusqkQi6aY;
                }
                layer = animation.getLayer();
            } else {
                layer = null;
            }
            if (context.getReverseLayout()) {
                int iM13433getXimpl = getIsVertical() ? IntOffset.m13433getXimpl(offset) : (this.mainAxisLayoutSize - IntOffset.m13433getXimpl(offset)) - (getIsVertical() ? placeable.getHeight() : placeable.getWidth());
                offset = IntOffset.m13427constructorimpl(((getIsVertical() ? (this.mainAxisLayoutSize - IntOffset.m13434getYimpl(offset)) - (getIsVertical() ? placeable.getHeight() : placeable.getWidth()) : IntOffset.m13434getYimpl(offset)) & 4294967295L) | (iM13433getXimpl << 32));
            }
            long jM13437plusqkQi6aY2 = IntOffset.m13437plusqkQi6aY(offset, context.getContentOffset());
            if (!isLookingAhead && animation != null) {
                animation.m7426setFinalOffsetgyyYBs(jM13437plusqkQi6aY2);
            }
            if (layer != null) {
                Placeable.PlacementScope.m12100placeRelativeWithLayeraW9wM$default(scope, placeable, jM13437plusqkQi6aY2, layer, 0.0f, 4, (Object) null);
            } else {
                Placeable.PlacementScope.m12099placeRelativeWithLayeraW9wM$default(scope, placeable, jM13437plusqkQi6aY2, 0.0f, (InterfaceC6471c) null, 6, (Object) null);
            }
        }
    }

    public final void position(int mainAxis, int crossAxis, int mainAxisLayoutSize) {
        long jM13427constructorimpl;
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = mainAxisLayoutSize + this.afterContentPadding;
        if (getIsVertical()) {
            jM13427constructorimpl = IntOffset.m13427constructorimpl((crossAxis << 32) | (4294967295L & mainAxis));
        } else {
            jM13427constructorimpl = IntOffset.m13427constructorimpl((crossAxis & 4294967295L) | (mainAxis << 32));
        }
        this.offset = jM13427constructorimpl;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void setNonScrollableItem(boolean z8) {
        this.nonScrollableItem = z8;
    }

    public final void setVisible(boolean z8) {
        this.isVisible = z8;
    }

    @NotNull
    public String toString() {
        return super.toString();
    }

    public final void updateMainAxisLayoutSize(int mainAxisLayoutSize) {
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.maxMainAxisOffset = mainAxisLayoutSize + this.afterContentPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyStaggeredGridMeasuredItem(int i, Object obj, List<? extends Placeable> list, boolean z8, int i8, int i9, int i10, int i11, int i12, Object obj2, LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> lazyLayoutItemAnimator, long j7) {
        int height;
        this.index = i;
        this.key = obj;
        this.placeables = list;
        this.isVertical = z8;
        this.lane = i9;
        this.span = i10;
        this.beforeContentPadding = i11;
        this.afterContentPadding = i12;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j7;
        int i13 = 1;
        this.isVisible = true;
        int i14 = 0;
        if (list.isEmpty()) {
            height = 0;
        } else {
            Placeable placeable = (Placeable) list.get(0);
            height = getIsVertical() ? placeable.getHeight() : placeable.getWidth();
            int iM5282u = AbstractC5806u.m5282u(list);
            if (1 <= iM5282u) {
                int i15 = 1;
                while (true) {
                    Placeable placeable2 = (Placeable) list.get(i15);
                    int height2 = getIsVertical() ? placeable2.getHeight() : placeable2.getWidth();
                    height = height2 > height ? height2 : height;
                    if (i15 == iM5282u) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        this.mainAxisSize = height;
        int i16 = height + i8;
        this.mainAxisSizeWithSpacings = i16 < 0 ? 0 : i16;
        List<Placeable> list2 = this.placeables;
        if (!list2.isEmpty()) {
            Placeable placeable3 = list2.get(0);
            int width = getIsVertical() ? placeable3.getWidth() : placeable3.getHeight();
            int iM5282u2 = AbstractC5806u.m5282u(list2);
            if (1 <= iM5282u2) {
                while (true) {
                    Placeable placeable4 = list2.get(i13);
                    int width2 = getIsVertical() ? placeable4.getWidth() : placeable4.getHeight();
                    width = width2 > width ? width2 : width;
                    if (i13 == iM5282u2) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            i14 = width;
        }
        this.crossAxisSize = i14;
        this.mainAxisLayoutSize = -1;
        this.size = getIsVertical() ? IntSize.m13471constructorimpl((this.mainAxisSize & 4294967295L) | (i14 << 32)) : IntSize.m13471constructorimpl((i14 & 4294967295L) | (this.mainAxisSize << 32));
        this.offset = IntOffset.INSTANCE.m13444getZeronOccac();
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
