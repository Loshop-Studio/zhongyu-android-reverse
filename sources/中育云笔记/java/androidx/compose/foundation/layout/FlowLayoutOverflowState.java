package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FlowLayoutOverflowState {
    public static final int $stable = 8;
    private Measurable collapseMeasurable;
    private Placeable collapsePlaceable;
    private IntIntPair collapseSize;
    private InterfaceC9544p getOverflowMeasurable;
    private int itemCount;
    private final int minCrossAxisSizeToShowCollapse;
    private final int minLinesToShowCollapse;
    private Measurable seeMoreMeasurable;
    private Placeable seeMorePlaceable;
    private IntIntPair seeMoreSize;
    private final FlowLayoutOverflow.OverflowType type;
    private final String shownItemLazyErrorMessage = "Accessing shownItemCount before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.";
    private int itemShown = -1;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlowLayoutOverflow.OverflowType.values().length];
            try {
                iArr[FlowLayoutOverflow.OverflowType.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.Clip.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandIndicator.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FlowLayoutOverflowState(FlowLayoutOverflow.OverflowType overflowType, int i10, int i11) {
        this.type = overflowType;
        this.minLinesToShowCollapse = i10;
        this.minCrossAxisSizeToShowCollapse = i11;
    }

    public static /* synthetic */ FlowLayoutOverflowState copy$default(FlowLayoutOverflowState flowLayoutOverflowState, FlowLayoutOverflow.OverflowType overflowType, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            overflowType = flowLayoutOverflowState.type;
        }
        if ((i12 & 2) != 0) {
            i10 = flowLayoutOverflowState.minLinesToShowCollapse;
        }
        if ((i12 & 4) != 0) {
            i11 = flowLayoutOverflowState.minCrossAxisSizeToShowCollapse;
        }
        return flowLayoutOverflowState.copy(overflowType, i10, i11);
    }

    public final FlowLayoutOverflow.OverflowType component1$foundation_layout_release() {
        return this.type;
    }

    public final int component2$foundation_layout_release() {
        return this.minLinesToShowCollapse;
    }

    public final int component3$foundation_layout_release() {
        return this.minCrossAxisSizeToShowCollapse;
    }

    public final FlowLayoutOverflowState copy(FlowLayoutOverflow.OverflowType overflowType, int i10, int i11) {
        return new FlowLayoutOverflowState(overflowType, i10, i11);
    }

    public final FlowLayoutBuildingBlocks.WrapEllipsisInfo ellipsisInfo$foundation_layout_release(boolean z10, int i10, int i11) {
        Measurable measurable;
        IntIntPair intIntPair;
        Placeable placeable;
        Measurable measurable2;
        Placeable placeable2;
        int i12 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            return null;
        }
        if (i12 != 3 && i12 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (z10) {
            InterfaceC9544p interfaceC9544p = this.getOverflowMeasurable;
            if (interfaceC9544p == null || (measurable = (Measurable) interfaceC9544p.invoke(Boolean.TRUE, Integer.valueOf(getShownItemCount$foundation_layout_release()))) == null) {
                measurable = this.seeMoreMeasurable;
            }
            intIntPair = this.seeMoreSize;
            if (this.getOverflowMeasurable == null) {
                placeable = this.seeMorePlaceable;
                measurable2 = measurable;
                placeable2 = placeable;
            }
            measurable2 = measurable;
            placeable2 = null;
        } else {
            if (i10 < this.minLinesToShowCollapse - 1 || i11 < this.minCrossAxisSizeToShowCollapse) {
                measurable = null;
            } else {
                InterfaceC9544p interfaceC9544p2 = this.getOverflowMeasurable;
                if (interfaceC9544p2 == null || (measurable = (Measurable) interfaceC9544p2.invoke(Boolean.FALSE, Integer.valueOf(getShownItemCount$foundation_layout_release()))) == null) {
                    measurable = this.collapseMeasurable;
                }
            }
            intIntPair = this.collapseSize;
            if (this.getOverflowMeasurable == null) {
                placeable = this.collapsePlaceable;
                measurable2 = measurable;
                placeable2 = placeable;
            }
            measurable2 = measurable;
            placeable2 = null;
        }
        if (measurable2 == null) {
            return null;
        }
        AbstractC9979u.m20291d(intIntPair);
        return new FlowLayoutBuildingBlocks.WrapEllipsisInfo(measurable2, placeable2, intIntPair.m26733unboximpl(), false, 8, null);
    }

    /* renamed from: ellipsisSize-F35zm-w$foundation_layout_release, reason: not valid java name */
    public final IntIntPair m27385ellipsisSizeF35zmw$foundation_layout_release(boolean z10, int i10, int i11) {
        int i12 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i12 != 1 && i12 != 2) {
            if (i12 != 3) {
                if (i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z10) {
                    return this.seeMoreSize;
                }
                if (i10 + 1 < this.minLinesToShowCollapse || i11 < this.minCrossAxisSizeToShowCollapse) {
                    return null;
                }
                return this.collapseSize;
            }
            if (z10) {
                return this.seeMoreSize;
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowLayoutOverflowState)) {
            return false;
        }
        FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) obj;
        return this.type == flowLayoutOverflowState.type && this.minLinesToShowCollapse == flowLayoutOverflowState.minLinesToShowCollapse && this.minCrossAxisSizeToShowCollapse == flowLayoutOverflowState.minCrossAxisSizeToShowCollapse;
    }

    public final int getItemCount$foundation_layout_release() {
        return this.itemCount;
    }

    public final int getItemShown$foundation_layout_release() {
        return this.itemShown;
    }

    public final int getMinCrossAxisSizeToShowCollapse$foundation_layout_release() {
        return this.minCrossAxisSizeToShowCollapse;
    }

    public final int getMinLinesToShowCollapse$foundation_layout_release() {
        return this.minLinesToShowCollapse;
    }

    public final int getShownItemCount$foundation_layout_release() {
        int i10 = this.itemShown;
        if (i10 != -1) {
            return i10;
        }
        throw new IllegalStateException(this.shownItemLazyErrorMessage);
    }

    public final String getShownItemLazyErrorMessage$foundation_layout_release() {
        return this.shownItemLazyErrorMessage;
    }

    public final FlowLayoutOverflow.OverflowType getType$foundation_layout_release() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + Integer.hashCode(this.minLinesToShowCollapse)) * 31) + Integer.hashCode(this.minCrossAxisSizeToShowCollapse);
    }

    public final void setItemCount$foundation_layout_release(int i10) {
        this.itemCount = i10;
    }

    public final void setItemShown$foundation_layout_release(int i10) {
        this.itemShown = i10;
    }

    /* renamed from: setOverflowMeasurables--hBUhpc$foundation_layout_release, reason: not valid java name */
    public final void m27387setOverflowMeasurableshBUhpc$foundation_layout_release(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMeasurable intrinsicMeasurable2, boolean z10, long j10) {
        long jM27427constructorimpl = OrientationIndependentConstraints.m27427constructorimpl(j10, z10 ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        if (intrinsicMeasurable != null) {
            int iMainAxisMin = FlowLayoutKt.mainAxisMin(intrinsicMeasurable, z10, Constraints.m33453getMaxHeightimpl(jM27427constructorimpl));
            this.seeMoreSize = IntIntPair.m26722boximpl(IntIntPair.m26725constructorimpl(iMainAxisMin, FlowLayoutKt.crossAxisMin(intrinsicMeasurable, z10, iMainAxisMin)));
            this.seeMoreMeasurable = intrinsicMeasurable instanceof Measurable ? (Measurable) intrinsicMeasurable : null;
            this.seeMorePlaceable = null;
        }
        if (intrinsicMeasurable2 != null) {
            int iMainAxisMin2 = FlowLayoutKt.mainAxisMin(intrinsicMeasurable2, z10, Constraints.m33453getMaxHeightimpl(jM27427constructorimpl));
            this.collapseSize = IntIntPair.m26722boximpl(IntIntPair.m26725constructorimpl(iMainAxisMin2, FlowLayoutKt.crossAxisMin(intrinsicMeasurable2, z10, iMainAxisMin2)));
            this.collapseMeasurable = intrinsicMeasurable2 instanceof Measurable ? (Measurable) intrinsicMeasurable2 : null;
            this.collapsePlaceable = null;
        }
    }

    /* renamed from: setOverflowMeasurables-VKLhPVY$foundation_layout_release, reason: not valid java name */
    public final void m27388setOverflowMeasurablesVKLhPVY$foundation_layout_release(FlowLineMeasurePolicy flowLineMeasurePolicy, long j10, InterfaceC9544p interfaceC9544p) {
        this.itemShown = 0;
        this.getOverflowMeasurable = interfaceC9544p;
        m27386setOverflowMeasurableshBUhpc$foundation_layout_release(flowLineMeasurePolicy, (Measurable) interfaceC9544p.invoke(Boolean.TRUE, 0), (Measurable) interfaceC9544p.invoke(Boolean.FALSE, 0), j10);
    }

    public String toString() {
        return "FlowLayoutOverflowState(type=" + this.type + ", minLinesToShowCollapse=" + this.minLinesToShowCollapse + ", minCrossAxisSizeToShowCollapse=" + this.minCrossAxisSizeToShowCollapse + ')';
    }

    /* renamed from: setOverflowMeasurables--hBUhpc$foundation_layout_release, reason: not valid java name */
    public final void m27386setOverflowMeasurableshBUhpc$foundation_layout_release(final FlowLineMeasurePolicy flowLineMeasurePolicy, Measurable measurable, Measurable measurable2, long j10) {
        LayoutOrientation layoutOrientation = flowLineMeasurePolicy.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical;
        long jM27440toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m27440toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m27429copyyUG9Ft0$default(OrientationIndependentConstraints.m27427constructorimpl(j10, layoutOrientation), 0, 0, 0, 0, 10, null), layoutOrientation);
        if (measurable != null) {
            FlowLayoutKt.m27383measureAndCacherqJ1uqs(measurable, flowLineMeasurePolicy, jM27440toBoxConstraintsOenEA2s, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.FlowLayoutOverflowState$setOverflowMeasurables$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(Placeable placeable) {
                    int iMainAxisSize;
                    int iCrossAxisSize;
                    if (placeable != null) {
                        FlowLineMeasurePolicy flowLineMeasurePolicy2 = flowLineMeasurePolicy;
                        iMainAxisSize = flowLineMeasurePolicy2.mainAxisSize(placeable);
                        iCrossAxisSize = flowLineMeasurePolicy2.crossAxisSize(placeable);
                    } else {
                        iMainAxisSize = 0;
                        iCrossAxisSize = 0;
                    }
                    this.this$0.seeMoreSize = IntIntPair.m26722boximpl(IntIntPair.m26725constructorimpl(iMainAxisSize, iCrossAxisSize));
                    this.this$0.seeMorePlaceable = placeable;
                }
            });
            this.seeMoreMeasurable = measurable;
        }
        if (measurable2 != null) {
            FlowLayoutKt.m27383measureAndCacherqJ1uqs(measurable2, flowLineMeasurePolicy, jM27440toBoxConstraintsOenEA2s, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.FlowLayoutOverflowState$setOverflowMeasurables$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(Placeable placeable) {
                    int iMainAxisSize;
                    int iCrossAxisSize;
                    if (placeable != null) {
                        FlowLineMeasurePolicy flowLineMeasurePolicy2 = flowLineMeasurePolicy;
                        iMainAxisSize = flowLineMeasurePolicy2.mainAxisSize(placeable);
                        iCrossAxisSize = flowLineMeasurePolicy2.crossAxisSize(placeable);
                    } else {
                        iMainAxisSize = 0;
                        iCrossAxisSize = 0;
                    }
                    this.this$0.collapseSize = IntIntPair.m26722boximpl(IntIntPair.m26725constructorimpl(iMainAxisSize, iCrossAxisSize));
                    this.this$0.collapsePlaceable = placeable;
                }
            });
            this.collapseMeasurable = measurable2;
        }
    }
}
