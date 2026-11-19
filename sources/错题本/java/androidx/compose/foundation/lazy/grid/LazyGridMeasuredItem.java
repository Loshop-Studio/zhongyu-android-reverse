package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.p011ui.graphics.layer.GraphicsLayer;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0095\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\"\u001a\u00020\u0013*\u00020\u00132\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001eH\u0082\bø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&J/\u0010-\u001a\u00020,2\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010.J=\u0010-\u001a\u00020,2\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0003¢\u0006\u0004\b-\u00101J\u0015\u00103\u001a\u00020,2\u0006\u00102\u001a\u00020\u0003¢\u0006\u0004\b3\u00104J\u001d\u00107\u001a\u00020,2\u0006\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0007¢\u0006\u0004\b7\u00108J\u001d\u0010<\u001a\u00020,2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u0007¢\u0006\u0004\b<\u0010=R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\b\b\u0010ER\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\bF\u0010@R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010DR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010GR\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010>R\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010>R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010HR\u001a\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010IR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010A\u001a\u0004\bJ\u0010CR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010KR \u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010I\u001a\u0004\bL\u0010MR\u001a\u0010\u001a\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010>\u001a\u0004\bN\u0010@R\u001a\u0010\u001b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010>\u001a\u0004\bO\u0010@R\u0017\u0010P\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bP\u0010>\u001a\u0004\bQ\u0010@R\u001a\u0010R\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010>\u001a\u0004\bS\u0010@R\u0016\u00102\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010>R\u0016\u0010T\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010>R\u0016\u0010U\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010>R \u0010W\u001a\u00020V8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bW\u0010I\u001a\u0004\bX\u0010MR*\u0010Z\u001a\u00020\u00132\u0006\u0010Y\u001a\u00020\u00138\u0016@RX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bZ\u0010I\u001a\u0004\b[\u0010MR$\u0010/\u001a\u00020\u00032\u0006\u0010Y\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b/\u0010>\u001a\u0004\b\\\u0010@R$\u00100\u001a\u00020\u00032\u0006\u0010Y\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b0\u0010>\u001a\u0004\b]\u0010@R\"\u0010^\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b^\u0010D\u001a\u0004\b_\u0010E\"\u0004\b`\u0010aR\u0018\u0010d\u001a\u00020\u0003*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0018\u0010P\u001a\u00020\u0003*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010eR\u0014\u0010g\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010@\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006h"}, m5110d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "", "index", "", "key", "", "isVertical", "crossAxisSize", "mainAxisSpacing", "reverseLayout", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "beforeContentPadding", "afterContentPadding", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Landroidx/compose/ui/unit/IntOffset;", "visualOffset", "contentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "Landroidx/compose/ui/unit/Constraints;", "constraints", "lane", "span", "<init>", "(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/LayoutDirection;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JIILkotlin/jvm/internal/e;)V", "Lkotlin/Function1;", "mainAxisMap", "copy-4Tuh3kE", "(JLr6/c;)J", "copy", "getParentData", "(I)Ljava/lang/Object;", "getOffset-Bjo55l4", "(I)J", "getOffset", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "Ld6/s;", RequestParameters.POSITION, "(IIII)V", "row", "column", "(IIIIII)V", "mainAxisLayoutSize", "updateMainAxisLayoutSize", "(I)V", "delta", "updateAnimations", "applyScrollDelta", "(IZ)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "isLookingAhead", "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Z)V", "I", "getIndex", "()I", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "Z", "()Z", "getCrossAxisSize", "Landroidx/compose/ui/unit/LayoutDirection;", "Ljava/util/List;", "J", "getContentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "getConstraints-msEJaDk", "()J", "getLane", "getSpan", "mainAxisSize", "getMainAxisSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "minMainAxisOffset", "maxMainAxisOffset", "Landroidx/compose/ui/unit/IntSize;", "size", "getSize-YbymL2g", "<set-?>", TypedValues.CycleType.S_WAVE_OFFSET, "getOffset-nOcc-ac", "getRow", "getColumn", "nonScrollableItem", "getNonScrollableItem", "setNonScrollableItem", "(Z)V", "getMainAxis--gyyYBs", "(J)I", "mainAxis", "(Landroidx/compose/ui/layout/Placeable;)I", "getPlaceablesCount", "placeablesCount", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyGridMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,259:1\n255#1:274\n255#1:277\n255#1:285\n34#2,6:260\n30#3:266\n30#3:268\n80#4:267\n80#4:269\n80#4:271\n80#4:273\n80#4:276\n80#4:279\n80#4:287\n80#4:289\n32#5:270\n32#5:272\n32#5:275\n32#5:278\n32#5:286\n32#5:288\n96#6,5:280\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n*L\n173#1:274\n178#1:277\n224#1:285\n78#1:260,6\n87#1:266\n89#1:268\n87#1:267\n89#1:269\n150#1:271\n152#1:273\n173#1:276\n178#1:279\n224#1:287\n255#1:289\n150#1:270\n152#1:272\n173#1:275\n178#1:278\n224#1:286\n255#1:288\n186#1:280,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridMeasuredItem implements LazyGridItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;

    @NotNull
    private final LazyLayoutItemAnimator<LazyGridMeasuredItem> animator;
    private final int beforeContentPadding;
    private int column;
    private final long constraints;

    @Nullable
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;

    @NotNull
    private final Object key;
    private final int lane;

    @NotNull
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;

    @NotNull
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private int row;
    private final long size;
    private final int span;
    private final long visualOffset;

    public /* synthetic */ LazyGridMeasuredItem(int i, Object obj, boolean z8, int i8, int i9, boolean z9, LayoutDirection layoutDirection, int i10, int i11, List list, long j7, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j8, int i12, int i13, AbstractC5824e abstractC5824e) {
        this(i, obj, z8, i8, i9, z9, layoutDirection, i10, i11, list, j7, obj2, lazyLayoutItemAnimator, j8, i12, i13);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m7407copy4Tuh3kE(long j7, InterfaceC6471c interfaceC6471c) {
        int iM13433getXimpl = getIsVertical() ? IntOffset.m13433getXimpl(j7) : ((Number) interfaceC6471c.invoke(Integer.valueOf(IntOffset.m13433getXimpl(j7)))).intValue();
        boolean isVertical = getIsVertical();
        int iM13434getYimpl = IntOffset.m13434getYimpl(j7);
        if (isVertical) {
            iM13434getYimpl = ((Number) interfaceC6471c.invoke(Integer.valueOf(iM13434getYimpl))).intValue();
        }
        return IntOffset.m13427constructorimpl((iM13433getXimpl << 32) | (iM13434getYimpl & 4294967295L));
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m7408getMainAxisgyyYBs(long j7) {
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

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.column;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getConstraints-msEJaDk, reason: from getter */
    public long getConstraints() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    @Nullable
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
    @NotNull
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
    public long mo7376getOffsetBjo55l4(int index) {
        return getOffset();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
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

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.row;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getSize-YbymL2g, reason: from getter */
    public long getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: isVertical, reason: from getter */
    public boolean getIsVertical() {
        return this.isVertical;
    }

    public final void place(@NotNull Placeable.PlacementScope scope, boolean isLookingAhead) {
        GraphicsLayer layer;
        Placeable.PlacementScope placementScope;
        int i = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        int placeablesCount = getPlaceablesCount();
        while (i < placeablesCount) {
            Placeable placeable = this.placeables.get(i);
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i8 = this.maxMainAxisOffset;
            long offset = getOffset();
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i);
            if (animation != null) {
                if (isLookingAhead) {
                    animation.m7427setLookaheadOffsetgyyYBs(offset);
                } else {
                    long jM13437plusqkQi6aY = IntOffset.m13437plusqkQi6aY(!IntOffset.m13432equalsimpl0(animation.getLookaheadOffset(), LazyLayoutItemAnimation.INSTANCE.m7430getNotInitializednOccac()) ? animation.getLookaheadOffset() : offset, animation.m7424getPlacementDeltanOccac());
                    if ((m7408getMainAxisgyyYBs(offset) <= mainAxisSize && m7408getMainAxisgyyYBs(jM13437plusqkQi6aY) <= mainAxisSize) || (m7408getMainAxisgyyYBs(offset) >= i8 && m7408getMainAxisgyyYBs(jM13437plusqkQi6aY) >= i8)) {
                        animation.cancelPlacementAnimation();
                    }
                    offset = jM13437plusqkQi6aY;
                }
                layer = animation.getLayer();
            } else {
                layer = null;
            }
            if (this.reverseLayout) {
                offset = IntOffset.m13427constructorimpl(((getIsVertical() ? (this.mainAxisLayoutSize - IntOffset.m13434getYimpl(offset)) - getMainAxisSize(placeable) : IntOffset.m13434getYimpl(offset)) & 4294967295L) | ((getIsVertical() ? IntOffset.m13433getXimpl(offset) : (this.mainAxisLayoutSize - IntOffset.m13433getXimpl(offset)) - getMainAxisSize(placeable)) << 32));
            }
            long jM13437plusqkQi6aY2 = IntOffset.m13437plusqkQi6aY(offset, this.visualOffset);
            if (!isLookingAhead && animation != null) {
                animation.m7426setFinalOffsetgyyYBs(jM13437plusqkQi6aY2);
            }
            if (!getIsVertical()) {
                placementScope = scope;
                GraphicsLayer graphicsLayer = layer;
                if (graphicsLayer != null) {
                    Placeable.PlacementScope.m12100placeRelativeWithLayeraW9wM$default(placementScope, placeable, jM13437plusqkQi6aY2, graphicsLayer, 0.0f, 4, (Object) null);
                } else {
                    Placeable.PlacementScope.m12099placeRelativeWithLayeraW9wM$default(placementScope, placeable, jM13437plusqkQi6aY2, 0.0f, (InterfaceC6471c) null, 6, (Object) null);
                }
            } else if (layer != null) {
                placementScope = scope;
                Placeable.PlacementScope.m12102placeWithLayeraW9wM$default(placementScope, placeable, jM13437plusqkQi6aY2, layer, 0.0f, 4, (Object) null);
            } else {
                placementScope = scope;
                Placeable.PlacementScope.m12101placeWithLayeraW9wM$default(placementScope, placeable, jM13437plusqkQi6aY2, 0.0f, (InterfaceC6471c) null, 6, (Object) null);
            }
            i++;
            scope = placementScope;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void position(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight) {
        position(mainAxisOffset, crossAxisOffset, layoutWidth, layoutHeight, -1, -1);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void setNonScrollableItem(boolean z8) {
        this.nonScrollableItem = z8;
    }

    public final void updateMainAxisLayoutSize(int mainAxisLayoutSize) {
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.maxMainAxisOffset = mainAxisLayoutSize + this.afterContentPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyGridMeasuredItem(int i, Object obj, boolean z8, int i8, int i9, boolean z9, LayoutDirection layoutDirection, int i10, int i11, List<? extends Placeable> list, long j7, Object obj2, LazyLayoutItemAnimator<LazyGridMeasuredItem> lazyLayoutItemAnimator, long j8, int i12, int i13) {
        this.index = i;
        this.key = obj;
        this.isVertical = z8;
        this.crossAxisSize = i8;
        this.reverseLayout = z9;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i10;
        this.afterContentPadding = i11;
        this.placeables = list;
        this.visualOffset = j7;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j8;
        this.lane = i12;
        this.span = i13;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int iMax = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Placeable placeable = (Placeable) list.get(i14);
            iMax = Math.max(iMax, getIsVertical() ? placeable.getHeight() : placeable.getWidth());
        }
        this.mainAxisSize = iMax;
        int i15 = i9 + iMax;
        this.mainAxisSizeWithSpacings = i15 >= 0 ? i15 : 0;
        this.size = getIsVertical() ? IntSize.m13471constructorimpl((iMax & 4294967295L) | (this.crossAxisSize << 32)) : IntSize.m13471constructorimpl((this.crossAxisSize & 4294967295L) | (iMax << 32));
        this.offset = IntOffset.INSTANCE.m13444getZeronOccac();
        this.row = -1;
        this.column = -1;
    }

    private final int getMainAxisSize(Placeable placeable) {
        return getIsVertical() ? placeable.getHeight() : placeable.getWidth();
    }

    public final void position(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight, int row, int column) {
        this.mainAxisLayoutSize = getIsVertical() ? layoutHeight : layoutWidth;
        if (!getIsVertical()) {
            layoutWidth = layoutHeight;
        }
        if (getIsVertical() && this.layoutDirection == LayoutDirection.Rtl) {
            crossAxisOffset = (layoutWidth - crossAxisOffset) - this.crossAxisSize;
        }
        this.offset = getIsVertical() ? IntOffset.m13427constructorimpl((crossAxisOffset << 32) | (4294967295L & mainAxisOffset)) : IntOffset.m13427constructorimpl((crossAxisOffset & 4294967295L) | (mainAxisOffset << 32));
        this.row = row;
        this.column = column;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }
}
