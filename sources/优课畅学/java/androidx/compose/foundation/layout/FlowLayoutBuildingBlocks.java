package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FlowLayoutBuildingBlocks {
    public static final int $stable = 8;
    private final long constraints;
    private final int crossAxisSpacing;
    private final int mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;
    private final FlowLayoutOverflowState overflow;

    @StabilityInferred(parameters = 0)
    public static final class WrapEllipsisInfo {
        public static final int $stable = 8;
        private final Measurable ellipsis;
        private final long ellipsisSize;
        private boolean placeEllipsisOnLastContentLine;
        private final Placeable placeable;

        public /* synthetic */ WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j10, boolean z10, AbstractC9126n abstractC9126n) {
            this(measurable, placeable, j10, z10);
        }

        public final Measurable getEllipsis() {
            return this.ellipsis;
        }

        /* renamed from: getEllipsisSize-OO21N7I, reason: not valid java name */
        public final long m20779getEllipsisSizeOO21N7I() {
            return this.ellipsisSize;
        }

        public final boolean getPlaceEllipsisOnLastContentLine() {
            return this.placeEllipsisOnLastContentLine;
        }

        public final Placeable getPlaceable() {
            return this.placeable;
        }

        public final void setPlaceEllipsisOnLastContentLine(boolean z10) {
            this.placeEllipsisOnLastContentLine = z10;
        }

        private WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j10, boolean z10) {
            this.ellipsis = measurable;
            this.placeable = placeable;
            this.ellipsisSize = j10;
            this.placeEllipsisOnLastContentLine = z10;
        }

        public /* synthetic */ WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j10, boolean z10, int i10, AbstractC9126n abstractC9126n) {
            this(measurable, placeable, j10, (i10 & 8) != 0 ? true : z10, null);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class WrapInfo {
        public static final int $stable = 0;
        private final boolean isLastItemInContainer;
        private final boolean isLastItemInLine;

        /* JADX WARN: Illegal instructions before constructor call */
        public WrapInfo() {
            boolean z10 = false;
            this(z10, z10, 3, null);
        }

        public final boolean isLastItemInContainer() {
            return this.isLastItemInContainer;
        }

        public final boolean isLastItemInLine() {
            return this.isLastItemInLine;
        }

        public WrapInfo(boolean z10, boolean z11) {
            this.isLastItemInLine = z10;
            this.isLastItemInContainer = z11;
        }

        public /* synthetic */ WrapInfo(boolean z10, boolean z11, int i10, AbstractC9126n abstractC9126n) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
        }
    }

    public /* synthetic */ FlowLayoutBuildingBlocks(int i10, FlowLayoutOverflowState flowLayoutOverflowState, long j10, int i11, int i12, int i13, AbstractC9126n abstractC9126n) {
        this(i10, flowLayoutOverflowState, j10, i11, i12, i13);
    }

    public final WrapEllipsisInfo getWrapEllipsisInfo(WrapInfo wrapInfo, boolean z10, int i10, int i11, int i12, int i13) {
        WrapEllipsisInfo wrapEllipsisInfoEllipsisInfo$foundation_layout_release;
        if (!wrapInfo.isLastItemInContainer() || (wrapEllipsisInfoEllipsisInfo$foundation_layout_release = this.overflow.ellipsisInfo$foundation_layout_release(z10, i10, i11)) == null) {
            return null;
        }
        wrapEllipsisInfoEllipsisInfo$foundation_layout_release.setPlaceEllipsisOnLastContentLine(i10 >= 0 && (i13 == 0 || (i12 - IntIntPair.m20127getFirstimpl(wrapEllipsisInfoEllipsisInfo$foundation_layout_release.m20779getEllipsisSizeOO21N7I()) >= 0 && i13 < this.maxItemsInMainAxis)));
        return wrapEllipsisInfoEllipsisInfo$foundation_layout_release;
    }

    /* renamed from: getWrapInfo-OpUlnko, reason: not valid java name */
    public final WrapInfo m20778getWrapInfoOpUlnko(boolean z10, int i10, long j10, IntIntPair intIntPair, int i11, int i12, int i13, boolean z11, boolean z12) {
        int i14 = i12 + i13;
        if (intIntPair == null) {
            return new WrapInfo(true, true);
        }
        if (this.overflow.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.Visible && (i11 >= this.maxLines || IntIntPair.m20128getSecondimpl(j10) - IntIntPair.m20128getSecondimpl(intIntPair.m20131unboximpl()) < 0)) {
            return new WrapInfo(true, true);
        }
        if (i10 != 0 && (i10 >= this.maxItemsInMainAxis || IntIntPair.m20127getFirstimpl(j10) - IntIntPair.m20127getFirstimpl(intIntPair.m20131unboximpl()) < 0)) {
            return z11 ? new WrapInfo(true, true) : new WrapInfo(true, m20778getWrapInfoOpUlnko(z10, 0, IntIntPair.m20123constructorimpl(Constraints.m26852getMaxWidthimpl(this.constraints), (IntIntPair.m20128getSecondimpl(j10) - this.crossAxisSpacing) - i13), IntIntPair.m20120boximpl(IntIntPair.m20123constructorimpl(IntIntPair.m20127getFirstimpl(intIntPair.m20131unboximpl()) - this.mainAxisSpacing, IntIntPair.m20128getSecondimpl(intIntPair.m20131unboximpl()))), i11 + 1, i14, 0, true, false).isLastItemInContainer());
        }
        int iMax = i12 + Math.max(i13, IntIntPair.m20128getSecondimpl(intIntPair.m20131unboximpl()));
        IntIntPair intIntPairM20783ellipsisSizeF35zmw$foundation_layout_release = z12 ? null : this.overflow.m20783ellipsisSizeF35zmw$foundation_layout_release(z10, i11, iMax);
        if (intIntPairM20783ellipsisSizeF35zmw$foundation_layout_release != null) {
            intIntPairM20783ellipsisSizeF35zmw$foundation_layout_release.m20131unboximpl();
            if (i10 + 1 >= this.maxItemsInMainAxis || ((IntIntPair.m20127getFirstimpl(j10) - IntIntPair.m20127getFirstimpl(intIntPair.m20131unboximpl())) - this.mainAxisSpacing) - IntIntPair.m20127getFirstimpl(intIntPairM20783ellipsisSizeF35zmw$foundation_layout_release.m20131unboximpl()) < 0) {
                if (z12) {
                    return new WrapInfo(true, true);
                }
                WrapInfo wrapInfoM20778getWrapInfoOpUlnko = m20778getWrapInfoOpUlnko(false, 0, IntIntPair.m20123constructorimpl(Constraints.m26852getMaxWidthimpl(this.constraints), (IntIntPair.m20128getSecondimpl(j10) - this.crossAxisSpacing) - Math.max(i13, IntIntPair.m20128getSecondimpl(intIntPair.m20131unboximpl()))), intIntPairM20783ellipsisSizeF35zmw$foundation_layout_release, i11 + 1, iMax, 0, true, true);
                return new WrapInfo(wrapInfoM20778getWrapInfoOpUlnko.isLastItemInContainer(), wrapInfoM20778getWrapInfoOpUlnko.isLastItemInContainer());
            }
        }
        return new WrapInfo(false, false);
    }

    private FlowLayoutBuildingBlocks(int i10, FlowLayoutOverflowState flowLayoutOverflowState, long j10, int i11, int i12, int i13) {
        this.maxItemsInMainAxis = i10;
        this.overflow = flowLayoutOverflowState;
        this.constraints = j10;
        this.maxLines = i11;
        this.mainAxisSpacing = i12;
        this.crossAxisSpacing = i13;
    }
}
