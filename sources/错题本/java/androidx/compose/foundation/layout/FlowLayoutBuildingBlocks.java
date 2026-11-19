package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001:\u0002&'B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017JZ\u0010\"\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, m5110d2 = {"Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;", "", "", "maxItemsInMainAxis", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflow", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "constraints", "maxLines", "mainAxisSpacing", "crossAxisSpacing", "<init>", "(ILandroidx/compose/foundation/layout/FlowLayoutOverflowState;JIIILkotlin/jvm/internal/e;)V", "Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;", "wrapInfo", "", "hasNext", "lastContentLineIndex", "totalCrossAxisSize", "leftOverMainAxis", "nextIndexInLine", "Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "getWrapEllipsisInfo", "(Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;ZIIII)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "nextItemHasNext", "Landroidx/collection/IntIntPair;", "leftOver", "nextSize", "lineIndex", "currentLineCrossAxisSize", "isWrappingRound", "isEllipsisWrap", "getWrapInfo-OpUlnko", "(ZIJLandroidx/collection/IntIntPair;IIIZZ)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;", "getWrapInfo", "I", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "J", "WrapEllipsisInfo", "WrapInfo", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFlowLayoutBuildingBlocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutBuildingBlocks.kt\nandroidx/compose/foundation/layout/FlowLayoutBuildingBlocks\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,183:1\n213#2:184\n213#2:185\n*S KotlinDebug\n*F\n+ 1 FlowLayoutBuildingBlocks.kt\nandroidx/compose/foundation/layout/FlowLayoutBuildingBlocks\n*L\n114#1:184\n161#1:185\n*E\n"})
/* loaded from: classes.dex */
public final class FlowLayoutBuildingBlocks {
    public static final int $stable = 8;
    private final long constraints;
    private final int crossAxisSpacing;
    private final int mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;

    @NotNull
    private final FlowLayoutOverflowState overflow;

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, m5110d2 = {"Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "", "Landroidx/compose/ui/layout/Measurable;", "ellipsis", "Landroidx/compose/ui/layout/Placeable;", "placeable", "Landroidx/collection/IntIntPair;", "ellipsisSize", "", "placeEllipsisOnLastContentLine", "<init>", "(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/layout/Placeable;JZLkotlin/jvm/internal/e;)V", "Landroidx/compose/ui/layout/Measurable;", "getEllipsis", "()Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "getPlaceable", "()Landroidx/compose/ui/layout/Placeable;", "J", "getEllipsisSize-OO21N7I", "()J", "Z", "getPlaceEllipsisOnLastContentLine", "()Z", "setPlaceEllipsisOnLastContentLine", "(Z)V", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class WrapEllipsisInfo {
        public static final int $stable = 8;

        @NotNull
        private final Measurable ellipsis;
        private final long ellipsisSize;
        private boolean placeEllipsisOnLastContentLine;

        @Nullable
        private final Placeable placeable;

        public /* synthetic */ WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j7, boolean z8, AbstractC5824e abstractC5824e) {
            this(measurable, placeable, j7, z8);
        }

        @NotNull
        public final Measurable getEllipsis() {
            return this.ellipsis;
        }

        /* renamed from: getEllipsisSize-OO21N7I, reason: not valid java name and from getter */
        public final long getEllipsisSize() {
            return this.ellipsisSize;
        }

        public final boolean getPlaceEllipsisOnLastContentLine() {
            return this.placeEllipsisOnLastContentLine;
        }

        @Nullable
        public final Placeable getPlaceable() {
            return this.placeable;
        }

        public final void setPlaceEllipsisOnLastContentLine(boolean z8) {
            this.placeEllipsisOnLastContentLine = z8;
        }

        private WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j7, boolean z8) {
            this.ellipsis = measurable;
            this.placeable = placeable;
            this.ellipsisSize = j7;
            this.placeEllipsisOnLastContentLine = z8;
        }

        public /* synthetic */ WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j7, boolean z8, int i, AbstractC5824e abstractC5824e) {
            this(measurable, placeable, j7, (i & 8) != 0 ? true : z8, null);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, m5110d2 = {"Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;", "", "isLastItemInLine", "", "isLastItemInContainer", "(ZZ)V", "()Z", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class WrapInfo {
        public static final int $stable = 0;
        private final boolean isLastItemInContainer;
        private final boolean isLastItemInLine;

        /* JADX WARN: Illegal instructions before constructor call */
        public WrapInfo() {
            boolean z8 = false;
            this(z8, z8, 3, null);
        }

        /* renamed from: isLastItemInContainer, reason: from getter */
        public final boolean getIsLastItemInContainer() {
            return this.isLastItemInContainer;
        }

        /* renamed from: isLastItemInLine, reason: from getter */
        public final boolean getIsLastItemInLine() {
            return this.isLastItemInLine;
        }

        public WrapInfo(boolean z8, boolean z9) {
            this.isLastItemInLine = z8;
            this.isLastItemInContainer = z9;
        }

        public /* synthetic */ WrapInfo(boolean z8, boolean z9, int i, AbstractC5824e abstractC5824e) {
            this((i & 1) != 0 ? false : z8, (i & 2) != 0 ? false : z9);
        }
    }

    public /* synthetic */ FlowLayoutBuildingBlocks(int i, FlowLayoutOverflowState flowLayoutOverflowState, long j7, int i8, int i9, int i10, AbstractC5824e abstractC5824e) {
        this(i, flowLayoutOverflowState, j7, i8, i9, i10);
    }

    @Nullable
    public final WrapEllipsisInfo getWrapEllipsisInfo(@NotNull WrapInfo wrapInfo, boolean hasNext, int lastContentLineIndex, int totalCrossAxisSize, int leftOverMainAxis, int nextIndexInLine) {
        WrapEllipsisInfo wrapEllipsisInfoEllipsisInfo$foundation_layout_release;
        if (!wrapInfo.getIsLastItemInContainer() || (wrapEllipsisInfoEllipsisInfo$foundation_layout_release = this.overflow.ellipsisInfo$foundation_layout_release(hasNext, lastContentLineIndex, totalCrossAxisSize)) == null) {
            return null;
        }
        wrapEllipsisInfoEllipsisInfo$foundation_layout_release.setPlaceEllipsisOnLastContentLine(lastContentLineIndex >= 0 && (nextIndexInLine == 0 || (leftOverMainAxis - IntIntPair.m6533getFirstimpl(wrapEllipsisInfoEllipsisInfo$foundation_layout_release.getEllipsisSize()) >= 0 && nextIndexInLine < this.maxItemsInMainAxis)));
        return wrapEllipsisInfoEllipsisInfo$foundation_layout_release;
    }

    @NotNull
    /* renamed from: getWrapInfo-OpUlnko, reason: not valid java name */
    public final WrapInfo m7184getWrapInfoOpUlnko(boolean nextItemHasNext, int nextIndexInLine, long leftOver, @Nullable IntIntPair nextSize, int lineIndex, int totalCrossAxisSize, int currentLineCrossAxisSize, boolean isWrappingRound, boolean isEllipsisWrap) {
        int i = totalCrossAxisSize + currentLineCrossAxisSize;
        if (nextSize == null) {
            return new WrapInfo(true, true);
        }
        if (this.overflow.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.Visible && (lineIndex >= this.maxLines || IntIntPair.m6534getSecondimpl(leftOver) - IntIntPair.m6534getSecondimpl(nextSize.getPackedValue()) < 0)) {
            return new WrapInfo(true, true);
        }
        if (nextIndexInLine != 0 && (nextIndexInLine >= this.maxItemsInMainAxis || IntIntPair.m6533getFirstimpl(leftOver) - IntIntPair.m6533getFirstimpl(nextSize.getPackedValue()) < 0)) {
            return isWrappingRound ? new WrapInfo(true, true) : new WrapInfo(true, m7184getWrapInfoOpUlnko(nextItemHasNext, 0, IntIntPair.m6529constructorimpl(Constraints.m13258getMaxWidthimpl(this.constraints), (IntIntPair.m6534getSecondimpl(leftOver) - this.crossAxisSpacing) - currentLineCrossAxisSize), IntIntPair.m6526boximpl(IntIntPair.m6529constructorimpl(IntIntPair.m6533getFirstimpl(nextSize.getPackedValue()) - this.mainAxisSpacing, IntIntPair.m6534getSecondimpl(nextSize.getPackedValue()))), lineIndex + 1, i, 0, true, false).getIsLastItemInContainer());
        }
        int iMax = Math.max(currentLineCrossAxisSize, IntIntPair.m6534getSecondimpl(nextSize.getPackedValue())) + totalCrossAxisSize;
        IntIntPair intIntPairM7189ellipsisSizeF35zmw$foundation_layout_release = isEllipsisWrap ? null : this.overflow.m7189ellipsisSizeF35zmw$foundation_layout_release(nextItemHasNext, lineIndex, iMax);
        if (intIntPairM7189ellipsisSizeF35zmw$foundation_layout_release != null) {
            intIntPairM7189ellipsisSizeF35zmw$foundation_layout_release.getPackedValue();
            if (nextIndexInLine + 1 >= this.maxItemsInMainAxis || ((IntIntPair.m6533getFirstimpl(leftOver) - IntIntPair.m6533getFirstimpl(nextSize.getPackedValue())) - this.mainAxisSpacing) - IntIntPair.m6533getFirstimpl(intIntPairM7189ellipsisSizeF35zmw$foundation_layout_release.getPackedValue()) < 0) {
                if (isEllipsisWrap) {
                    return new WrapInfo(true, true);
                }
                WrapInfo wrapInfoM7184getWrapInfoOpUlnko = m7184getWrapInfoOpUlnko(false, 0, IntIntPair.m6529constructorimpl(Constraints.m13258getMaxWidthimpl(this.constraints), (IntIntPair.m6534getSecondimpl(leftOver) - this.crossAxisSpacing) - Math.max(currentLineCrossAxisSize, IntIntPair.m6534getSecondimpl(nextSize.getPackedValue()))), intIntPairM7189ellipsisSizeF35zmw$foundation_layout_release, lineIndex + 1, iMax, 0, true, true);
                return new WrapInfo(wrapInfoM7184getWrapInfoOpUlnko.getIsLastItemInContainer(), wrapInfoM7184getWrapInfoOpUlnko.getIsLastItemInContainer());
            }
        }
        return new WrapInfo(false, false);
    }

    private FlowLayoutBuildingBlocks(int i, FlowLayoutOverflowState flowLayoutOverflowState, long j7, int i8, int i9, int i10) {
        this.maxItemsInMainAxis = i;
        this.overflow = flowLayoutOverflowState;
        this.constraints = j7;
        this.maxLines = i8;
        this.mainAxisSpacing = i9;
        this.crossAxisSpacing = i10;
    }
}
