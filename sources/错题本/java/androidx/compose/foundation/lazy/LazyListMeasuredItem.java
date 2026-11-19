package androidx.compose.foundation.lazy;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.graphics.layer.GraphicsLayer;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0091\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010#\u001a\u00020\u0014*\u00020\u00142\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001fH\u0082\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%J/\u0010+\u001a\u00020*2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u0010,J%\u0010+\u001a\u00020*2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0003¢\u0006\u0004\b+\u0010-J\u0015\u0010/\u001a\u00020*2\u0006\u0010.\u001a\u00020\u0003¢\u0006\u0004\b/\u00100J\u001d\u00103\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u001d\u00106\u001a\u00020*2\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\b¢\u0006\u0004\b6\u00107J\u001d\u0010;\u001a\u00020*2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\b¢\u0006\u0004\b;\u0010<R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\b\t\u0010BR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010CR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010ER\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010AR\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010=R\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010=R\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010=R\u001a\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010FR\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010G\u001a\u0004\bJ\u0010IR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010KR \u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010F\u001a\u0004\bL\u0010MR$\u0010O\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bO\u0010=\u001a\u0004\b3\u0010?R\u001a\u0010P\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010=\u001a\u0004\bQ\u0010?R\u001a\u0010R\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\bR\u0010=\u001a\u0004\bS\u0010?R\u001a\u0010T\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\bT\u0010=\u001a\u0004\bU\u0010?R\u001a\u0010V\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010=\u001a\u0004\bW\u0010?R\u0017\u0010X\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bX\u0010=\u001a\u0004\bY\u0010?R\"\u0010Z\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bZ\u0010A\u001a\u0004\b[\u0010B\"\u0004\b\\\u0010]R\u0016\u0010.\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010=R\u0016\u0010^\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010=R\u0016\u0010_\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010=R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010e\u001a\u00020\u0003*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0018\u0010h\u001a\u00020\u0003*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010j\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006k"}, m5110d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "", "index", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "", "isVertical", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "reverseLayout", "beforeContentPadding", "afterContentPadding", "spacing", "Landroidx/compose/ui/unit/IntOffset;", "visualOffset", "", "key", "contentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "Landroidx/compose/ui/unit/Constraints;", "constraints", "<init>", "(ILjava/util/List;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZIIIJLjava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JLkotlin/jvm/internal/e;)V", "Lkotlin/Function1;", "mainAxisMap", "copy-4Tuh3kE", "(JLr6/c;)J", "copy", "getParentData", "(I)Ljava/lang/Object;", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "Ld6/s;", RequestParameters.POSITION, "(IIII)V", "(III)V", "mainAxisLayoutSize", "updateMainAxisLayoutSize", "(I)V", "getOffset-Bjo55l4", "(I)J", "getOffset", "delta", "updateAnimations", "applyScrollDelta", "(IZ)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "isLookingAhead", "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Z)V", "I", "getIndex", "()I", "Ljava/util/List;", "Z", "()Z", "Landroidx/compose/ui/Alignment$Horizontal;", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/ui/unit/LayoutDirection;", "J", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "getContentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "getConstraints-msEJaDk", "()J", "<set-?>", TypedValues.CycleType.S_WAVE_OFFSET, "size", "getSize", "lane", "getLane", "span", "getSpan", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "crossAxisSize", "getCrossAxisSize", "nonScrollableItem", "getNonScrollableItem", "setNonScrollableItem", "(Z)V", "minMainAxisOffset", "maxMainAxisOffset", "", "placeableOffsets", "[I", "getMainAxis--gyyYBs", "(J)I", "mainAxis", "getMainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "mainAxisSize", "getPlaceablesCount", "placeablesCount", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyListMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,264:1\n260#1:292\n260#1:300\n34#2,6:265\n70#2,4:271\n75#2:289\n107#3,7:275\n107#3,7:282\n96#3,5:295\n32#4:290\n32#4:293\n32#4:301\n32#4:303\n80#5:291\n80#5:294\n80#5:302\n80#5:304\n*S KotlinDebug\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n*L\n183#1:292\n229#1:300\n97#1:265,6\n129#1:271,4\n129#1:289\n133#1:275,7\n142#1:282,7\n191#1:295,5\n163#1:290\n183#1:293\n229#1:301\n260#1:303\n163#1:291\n183#1:294\n229#1:302\n260#1:304\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListMeasuredItem implements LazyListItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;

    @NotNull
    private final LazyLayoutItemAnimator<LazyListMeasuredItem> animator;
    private final int beforeContentPadding;
    private final long constraints;

    @Nullable
    private final Object contentType;
    private final int crossAxisSize;

    @Nullable
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;

    @NotNull
    private final Object key;
    private final int lane;

    @NotNull
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private int offset;

    @NotNull
    private final int[] placeableOffsets;

    @NotNull
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;
    private final int spacing;
    private final int span;

    @Nullable
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    public /* synthetic */ LazyListMeasuredItem(int i, List list, boolean z8, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z9, int i8, int i9, int i10, long j7, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j8, AbstractC5824e abstractC5824e) {
        this(i, list, z8, horizontal, vertical, layoutDirection, z9, i8, i9, i10, j7, obj, obj2, lazyLayoutItemAnimator, j8);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m7373copy4Tuh3kE(long j7, InterfaceC6471c interfaceC6471c) {
        int iM13434getYimpl;
        long j8;
        if (getIsVertical()) {
            int iM13433getXimpl = IntOffset.m13433getXimpl(j7);
            iM13434getYimpl = ((Number) interfaceC6471c.invoke(Integer.valueOf(IntOffset.m13434getYimpl(j7)))).intValue();
            j8 = iM13433getXimpl;
        } else {
            int iIntValue = ((Number) interfaceC6471c.invoke(Integer.valueOf(IntOffset.m13433getXimpl(j7)))).intValue();
            iM13434getYimpl = IntOffset.m13434getYimpl(j7);
            j8 = iIntValue;
        }
        return IntOffset.m13427constructorimpl((j8 << 32) | (iM13434getYimpl & 4294967295L));
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m7374getMainAxisgyyYBs(long j7) {
        return getIsVertical() ? IntOffset.m13434getYimpl(j7) : IntOffset.m13433getXimpl(j7);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return getIsVertical() ? placeable.getHeight() : placeable.getWidth();
    }

    public final void applyScrollDelta(int delta, boolean updateAnimations) {
        int iIntValue;
        int iM13434getYimpl;
        if (getNonScrollableItem()) {
            return;
        }
        this.offset = getOffset() + delta;
        int length = this.placeableOffsets.length;
        for (int i = 0; i < length; i++) {
            int i8 = i & 1;
            if ((getIsVertical() && i8 != 0) || (!getIsVertical() && i8 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i] = iArr[i] + delta;
            }
        }
        if (updateAnimations) {
            int placeablesCount = getPlaceablesCount();
            for (int i9 = 0; i9 < placeablesCount; i9++) {
                LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i9);
                if (animation != null) {
                    long rawOffset = animation.getRawOffset();
                    if (getIsVertical()) {
                        iIntValue = IntOffset.m13433getXimpl(rawOffset);
                        iM13434getYimpl = Integer.valueOf(IntOffset.m13434getYimpl(rawOffset) + delta).intValue();
                    } else {
                        iIntValue = Integer.valueOf(IntOffset.m13433getXimpl(rawOffset) + delta).intValue();
                        iM13434getYimpl = IntOffset.m13434getYimpl(rawOffset);
                    }
                    animation.m7428setRawOffsetgyyYBs(IntOffset.m13427constructorimpl((iIntValue << 32) | (4294967295L & iM13434getYimpl)));
                }
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getConstraints-msEJaDk, reason: not valid java name and from getter */
    public long getConstraints() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    @Nullable
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
    @NotNull
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
    public long mo7376getOffsetBjo55l4(int index) {
        int[] iArr = this.placeableOffsets;
        int i = index * 2;
        return IntOffset.m13427constructorimpl((iArr[i] << 32) | (iArr[i + 1] & 4294967295L));
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

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getSize() {
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

    public final void place(@NotNull Placeable.PlacementScope scope, boolean isLookingAhead) {
        GraphicsLayer layer;
        Placeable.PlacementScope placementScope;
        long jM13433getXimpl;
        int i = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        int placeablesCount = getPlaceablesCount();
        while (i < placeablesCount) {
            Placeable placeable = this.placeables.get(i);
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i8 = this.maxMainAxisOffset;
            long jMo7376getOffsetBjo55l4 = mo7376getOffsetBjo55l4(i);
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i);
            if (animation != null) {
                if (isLookingAhead) {
                    animation.m7427setLookaheadOffsetgyyYBs(jMo7376getOffsetBjo55l4);
                } else {
                    if (!IntOffset.m13432equalsimpl0(animation.getLookaheadOffset(), LazyLayoutItemAnimation.INSTANCE.m7430getNotInitializednOccac())) {
                        jMo7376getOffsetBjo55l4 = animation.getLookaheadOffset();
                    }
                    long jM13437plusqkQi6aY = IntOffset.m13437plusqkQi6aY(jMo7376getOffsetBjo55l4, animation.m7424getPlacementDeltanOccac());
                    if ((m7374getMainAxisgyyYBs(jMo7376getOffsetBjo55l4) <= mainAxisSize && m7374getMainAxisgyyYBs(jM13437plusqkQi6aY) <= mainAxisSize) || (m7374getMainAxisgyyYBs(jMo7376getOffsetBjo55l4) >= i8 && m7374getMainAxisgyyYBs(jM13437plusqkQi6aY) >= i8)) {
                        animation.cancelPlacementAnimation();
                    }
                    jMo7376getOffsetBjo55l4 = jM13437plusqkQi6aY;
                }
                layer = animation.getLayer();
            } else {
                layer = null;
            }
            if (this.reverseLayout) {
                if (getIsVertical()) {
                    jM13433getXimpl = (((this.mainAxisLayoutSize - IntOffset.m13434getYimpl(jMo7376getOffsetBjo55l4)) - getMainAxisSize(placeable)) & 4294967295L) | (IntOffset.m13433getXimpl(jMo7376getOffsetBjo55l4) << 32);
                } else {
                    jM13433getXimpl = (((this.mainAxisLayoutSize - IntOffset.m13433getXimpl(jMo7376getOffsetBjo55l4)) - getMainAxisSize(placeable)) << 32) | (4294967295L & IntOffset.m13434getYimpl(jMo7376getOffsetBjo55l4));
                }
                jMo7376getOffsetBjo55l4 = IntOffset.m13427constructorimpl(jM13433getXimpl);
            }
            long jM13437plusqkQi6aY2 = IntOffset.m13437plusqkQi6aY(jMo7376getOffsetBjo55l4, this.visualOffset);
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
        position(mainAxisOffset, layoutWidth, layoutHeight);
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
    private LazyListMeasuredItem(int i, List<? extends Placeable> list, boolean z8, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z9, int i8, int i9, int i10, long j7, Object obj, Object obj2, LazyLayoutItemAnimator<LazyListMeasuredItem> lazyLayoutItemAnimator, long j8) {
        this.index = i;
        this.placeables = list;
        this.isVertical = z8;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z9;
        this.beforeContentPadding = i8;
        this.afterContentPadding = i9;
        this.spacing = i10;
        this.visualOffset = j7;
        this.key = obj;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j8;
        this.span = 1;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int height = 0;
        int iMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Placeable placeable = (Placeable) list.get(i11);
            height += getIsVertical() ? placeable.getHeight() : placeable.getWidth();
            iMax = Math.max(iMax, !getIsVertical() ? placeable.getHeight() : placeable.getWidth());
        }
        this.size = height;
        int size2 = getSize() + this.spacing;
        this.mainAxisSizeWithSpacings = size2 >= 0 ? size2 : 0;
        this.crossAxisSize = iMax;
        this.placeableOffsets = new int[this.placeables.size() * 2];
    }

    public final void position(int mainAxisOffset, int layoutWidth, int layoutHeight) {
        int width;
        this.offset = mainAxisOffset;
        this.mainAxisLayoutSize = getIsVertical() ? layoutHeight : layoutWidth;
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Placeable placeable = list.get(i);
            int i8 = i * 2;
            if (getIsVertical()) {
                int[] iArr = this.placeableOffsets;
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalAlignment when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                iArr[i8] = horizontal.align(placeable.getWidth(), layoutWidth, this.layoutDirection);
                this.placeableOffsets[i8 + 1] = mainAxisOffset;
                width = placeable.getHeight();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i8] = mainAxisOffset;
                int i9 = i8 + 1;
                Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalAlignment when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                iArr2[i9] = vertical.align(placeable.getHeight(), layoutHeight);
                width = placeable.getWidth();
            }
            mainAxisOffset = width + mainAxisOffset;
        }
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }
}
