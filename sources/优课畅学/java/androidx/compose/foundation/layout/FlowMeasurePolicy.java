package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.MultiContentMeasurePolicy;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.C8321f;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8792m0;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class FlowMeasurePolicy implements MultiContentMeasurePolicy, FlowLineMeasurePolicy {
    private final CrossAxisAlignment crossAxisAlignment;
    private final float crossAxisArrangementSpacing;
    private final Arrangement.Horizontal horizontalArrangement;
    private final boolean isHorizontal;
    private final float mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;
    private final FlowLayoutOverflowState overflow;
    private final Arrangement.Vertical verticalArrangement;

    public /* synthetic */ FlowMeasurePolicy(boolean z10, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f10, CrossAxisAlignment crossAxisAlignment, float f11, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState, AbstractC9126n abstractC9126n) {
        this(z10, horizontal, vertical, f10, crossAxisAlignment, f11, i10, i11, flowLayoutOverflowState);
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    private final float m20799component4D9Ej5fM() {
        return this.mainAxisSpacing;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name */
    private final float m20800component6D9Ej5fM() {
        return this.crossAxisArrangementSpacing;
    }

    private final int component7() {
        return this.maxItemsInMainAxis;
    }

    private final int component8() {
        return this.maxLines;
    }

    private final FlowLayoutOverflowState component9() {
        return this.overflow;
    }

    /* renamed from: copy-QuyCDyQ$default, reason: not valid java name */
    public static /* synthetic */ FlowMeasurePolicy m20801copyQuyCDyQ$default(FlowMeasurePolicy flowMeasurePolicy, boolean z10, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f10, CrossAxisAlignment crossAxisAlignment, float f11, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z10 = flowMeasurePolicy.isHorizontal;
        }
        if ((i12 & 2) != 0) {
            horizontal = flowMeasurePolicy.horizontalArrangement;
        }
        if ((i12 & 4) != 0) {
            vertical = flowMeasurePolicy.verticalArrangement;
        }
        if ((i12 & 8) != 0) {
            f10 = flowMeasurePolicy.mainAxisSpacing;
        }
        if ((i12 & 16) != 0) {
            crossAxisAlignment = flowMeasurePolicy.crossAxisAlignment;
        }
        if ((i12 & 32) != 0) {
            f11 = flowMeasurePolicy.crossAxisArrangementSpacing;
        }
        if ((i12 & 64) != 0) {
            i10 = flowMeasurePolicy.maxItemsInMainAxis;
        }
        if ((i12 & 128) != 0) {
            i11 = flowMeasurePolicy.maxLines;
        }
        if ((i12 & 256) != 0) {
            flowLayoutOverflowState = flowMeasurePolicy.overflow;
        }
        int i13 = i11;
        FlowLayoutOverflowState flowLayoutOverflowState2 = flowLayoutOverflowState;
        float f12 = f11;
        int i14 = i10;
        CrossAxisAlignment crossAxisAlignment2 = crossAxisAlignment;
        Arrangement.Vertical vertical2 = vertical;
        return flowMeasurePolicy.m20802copyQuyCDyQ(z10, horizontal, vertical2, f10, crossAxisAlignment2, f12, i14, i13, flowLayoutOverflowState2);
    }

    public final boolean component1() {
        return this.isHorizontal;
    }

    public final Arrangement.Horizontal component2() {
        return this.horizontalArrangement;
    }

    public final Arrangement.Vertical component3() {
        return this.verticalArrangement;
    }

    public final CrossAxisAlignment component5() {
        return this.crossAxisAlignment;
    }

    /* renamed from: copy-QuyCDyQ, reason: not valid java name */
    public final FlowMeasurePolicy m20802copyQuyCDyQ(boolean z10, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f10, CrossAxisAlignment crossAxisAlignment, float f11, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState) {
        return new FlowMeasurePolicy(z10, horizontal, vertical, f10, crossAxisAlignment, f11, i10, i11, flowLayoutOverflowState, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) obj;
        return this.isHorizontal == flowMeasurePolicy.isHorizontal && AbstractC9133u.m16128b(this.horizontalArrangement, flowMeasurePolicy.horizontalArrangement) && AbstractC9133u.m16128b(this.verticalArrangement, flowMeasurePolicy.verticalArrangement) && C3156Dp.m26904equalsimpl0(this.mainAxisSpacing, flowMeasurePolicy.mainAxisSpacing) && AbstractC9133u.m16128b(this.crossAxisAlignment, flowMeasurePolicy.crossAxisAlignment) && C3156Dp.m26904equalsimpl0(this.crossAxisArrangementSpacing, flowMeasurePolicy.crossAxisArrangementSpacing) && this.maxItemsInMainAxis == flowMeasurePolicy.maxItemsInMainAxis && this.maxLines == flowMeasurePolicy.maxLines && AbstractC9133u.m16128b(this.overflow, flowMeasurePolicy.overflow);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isHorizontal) * 31) + this.horizontalArrangement.hashCode()) * 31) + this.verticalArrangement.hashCode()) * 31) + C3156Dp.m26905hashCodeimpl(this.mainAxisSpacing)) * 31) + this.crossAxisAlignment.hashCode()) * 31) + C3156Dp.m26905hashCodeimpl(this.crossAxisArrangementSpacing)) * 31) + Integer.hashCode(this.maxItemsInMainAxis)) * 31) + Integer.hashCode(this.maxLines)) * 31) + this.overflow.hashCode();
    }

    public final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, int i10, int i11, int i12, int i13, int i14, FlowLayoutOverflowState flowLayoutOverflowState) {
        long jM20123constructorimpl;
        int i15 = 0;
        if (list.isEmpty()) {
            jM20123constructorimpl = IntIntPair.m20123constructorimpl(0, 0);
        } else {
            FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i13, flowLayoutOverflowState, OrientationIndependentConstraints.m20823constructorimpl(0, i10, 0, Integer.MAX_VALUE), i14, i11, i12, null);
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) AbstractC8778f0.m14569o0(list, 0);
            int iMinCrossAxisIntrinsicItemSize = intrinsicMeasurable != null ? minCrossAxisIntrinsicItemSize(intrinsicMeasurable, i10) : 0;
            int iMinMainAxisIntrinsicItemSize = intrinsicMeasurable != null ? minMainAxisIntrinsicItemSize(intrinsicMeasurable, iMinCrossAxisIntrinsicItemSize) : 0;
            int i16 = 0;
            if (flowLayoutBuildingBlocks.m20778getWrapInfoOpUlnko(list.size() > 1, 0, IntIntPair.m20123constructorimpl(i10, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.m20120boximpl(IntIntPair.m20123constructorimpl(iMinMainAxisIntrinsicItemSize, iMinCrossAxisIntrinsicItemSize)), 0, 0, 0, false, false).isLastItemInContainer()) {
                IntIntPair intIntPairM20783ellipsisSizeF35zmw$foundation_layout_release = flowLayoutOverflowState.m20783ellipsisSizeF35zmw$foundation_layout_release(intrinsicMeasurable != null, 0, 0);
                jM20123constructorimpl = IntIntPair.m20123constructorimpl(intIntPairM20783ellipsisSizeF35zmw$foundation_layout_release != null ? IntIntPair.m20128getSecondimpl(intIntPairM20783ellipsisSizeF35zmw$foundation_layout_release.m20131unboximpl()) : 0, 0);
            } else {
                int size = list.size();
                int i17 = i10;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                while (true) {
                    if (i18 >= size) {
                        break;
                    }
                    int i23 = i17 - iMinMainAxisIntrinsicItemSize;
                    int i24 = i18 + 1;
                    int iMax = Math.max(i22, iMinCrossAxisIntrinsicItemSize);
                    IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) AbstractC8778f0.m14569o0(list, i24);
                    int iMinCrossAxisIntrinsicItemSize2 = intrinsicMeasurable2 != null ? minCrossAxisIntrinsicItemSize(intrinsicMeasurable2, i10) : i15;
                    int iMinMainAxisIntrinsicItemSize2 = intrinsicMeasurable2 != null ? minMainAxisIntrinsicItemSize(intrinsicMeasurable2, iMinCrossAxisIntrinsicItemSize2) + i11 : i15;
                    boolean z10 = i18 + 2 < list.size();
                    int i25 = i24 - i20;
                    int i26 = i21;
                    int i27 = iMinMainAxisIntrinsicItemSize2;
                    int i28 = iMinCrossAxisIntrinsicItemSize2;
                    FlowLayoutBuildingBlocks.WrapInfo wrapInfoM20778getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m20778getWrapInfoOpUlnko(z10, i25, IntIntPair.m20123constructorimpl(i23, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.m20120boximpl(IntIntPair.m20123constructorimpl(iMinMainAxisIntrinsicItemSize2, iMinCrossAxisIntrinsicItemSize2)), i26, i16, iMax, false, false);
                    if (wrapInfoM20778getWrapInfoOpUlnko.isLastItemInLine()) {
                        int iM20128getSecondimpl = i16 + iMax + i12;
                        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM20778getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i26, iM20128getSecondimpl, i23, i25);
                        int i29 = i27 - i11;
                        i21 = i26 + 1;
                        if (wrapInfoM20778getWrapInfoOpUlnko.isLastItemInContainer()) {
                            if (wrapEllipsisInfo != null) {
                                long jM20779getEllipsisSizeOO21N7I = wrapEllipsisInfo.m20779getEllipsisSizeOO21N7I();
                                if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                                    iM20128getSecondimpl += IntIntPair.m20128getSecondimpl(jM20779getEllipsisSizeOO21N7I) + i12;
                                }
                            }
                            i16 = iM20128getSecondimpl;
                            i19 = i24;
                        } else {
                            i16 = iM20128getSecondimpl;
                            iMinMainAxisIntrinsicItemSize = i29;
                            i20 = i24;
                            i22 = 0;
                            i17 = i10;
                        }
                    } else {
                        i17 = i23;
                        i21 = i26;
                        i22 = iMax;
                        iMinMainAxisIntrinsicItemSize = i27;
                    }
                    iMinCrossAxisIntrinsicItemSize = i28;
                    i18 = i24;
                    i19 = i18;
                    i15 = 0;
                }
                jM20123constructorimpl = IntIntPair.m20123constructorimpl(i16 - i12, i19);
            }
        }
        return IntIntPair.m20127getFirstimpl(jM20123constructorimpl);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public boolean isHorizontal() {
        return this.isHorizontal;
    }

    @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) AbstractC8778f0.m14569o0(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) AbstractC8778f0.m14568n0(list2) : null;
        List list3 = (List) AbstractC8778f0.m14569o0(list, 2);
        flowLayoutOverflowState.m20785setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) AbstractC8778f0.m14568n0(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null));
        if (isHorizontal()) {
            List<? extends IntrinsicMeasurable> listM14771n = (List) AbstractC8778f0.m14568n0(list);
            if (listM14771n == null) {
                listM14771n = AbstractC8809v.m14771n();
            }
            return intrinsicCrossAxisSize(listM14771n, i10, intrinsicMeasureScope.mo20491roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo20491roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends IntrinsicMeasurable> listM14771n2 = (List) AbstractC8778f0.m14568n0(list);
        if (listM14771n2 == null) {
            listM14771n2 = AbstractC8809v.m14771n();
        }
        return maxIntrinsicMainAxisSize(listM14771n2, i10, intrinsicMeasureScope.mo20491roundToPx0680j_4(this.mainAxisSpacing));
    }

    public final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, int i10, int i11) {
        int i12 = this.maxItemsInMainAxis;
        int size = list.size();
        int i13 = 0;
        int iMax = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < size) {
            int iMaxMainAxisIntrinsicItemSize = maxMainAxisIntrinsicItemSize(list.get(i13), i10) + i11;
            int i16 = i13 + 1;
            if (i16 - i14 == i12 || i16 == list.size()) {
                iMax = Math.max(iMax, (i15 + iMaxMainAxisIntrinsicItemSize) - i11);
                i15 = 0;
                i14 = i13;
            } else {
                i15 += iMaxMainAxisIntrinsicItemSize;
            }
            i13 = i16;
        }
        return iMax;
    }

    @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) AbstractC8778f0.m14569o0(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) AbstractC8778f0.m14568n0(list2) : null;
        List list3 = (List) AbstractC8778f0.m14569o0(list, 2);
        flowLayoutOverflowState.m20785setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) AbstractC8778f0.m14568n0(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null));
        if (isHorizontal()) {
            List<? extends IntrinsicMeasurable> listM14771n = (List) AbstractC8778f0.m14568n0(list);
            if (listM14771n == null) {
                listM14771n = AbstractC8809v.m14771n();
            }
            return maxIntrinsicMainAxisSize(listM14771n, i10, intrinsicMeasureScope.mo20491roundToPx0680j_4(this.mainAxisSpacing));
        }
        List<? extends IntrinsicMeasurable> listM14771n2 = (List) AbstractC8778f0.m14568n0(list);
        if (listM14771n2 == null) {
            listM14771n2 = AbstractC8809v.m14771n();
        }
        return intrinsicCrossAxisSize(listM14771n2, i10, intrinsicMeasureScope.mo20491roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo20491roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int maxMainAxisIntrinsicItemSize(IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return isHorizontal() ? intrinsicMeasurable.maxIntrinsicWidth(i10) : intrinsicMeasurable.maxIntrinsicHeight(i10);
    }

    @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo20803measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j10) {
        if (this.maxLines == 0 || this.maxItemsInMainAxis == 0 || list.isEmpty() || (Constraints.m26851getMaxHeightimpl(j10) == 0 && this.overflow.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.Visible)) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$1
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C8736p.f16368a;
                }
            }, 4, null);
        }
        List list2 = (List) AbstractC8778f0.m14566l0(list);
        if (list2.isEmpty()) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$2
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C8736p.f16368a;
                }
            }, 4, null);
        }
        List list3 = (List) AbstractC8778f0.m14569o0(list, 1);
        Measurable measurable = list3 != null ? (Measurable) AbstractC8778f0.m14568n0(list3) : null;
        List list4 = (List) AbstractC8778f0.m14569o0(list, 2);
        Measurable measurable2 = list4 != null ? (Measurable) AbstractC8778f0.m14568n0(list4) : null;
        this.overflow.setItemCount$foundation_layout_release(list2.size());
        this.overflow.m20784setOverflowMeasurableshBUhpc$foundation_layout_release(this, measurable, measurable2, j10);
        return FlowLayoutKt.m20780breakDownItemsdi9J0FM(measureScope, this, list2.iterator(), this.mainAxisSpacing, this.crossAxisArrangementSpacing, OrientationIndependentConstraints.m20825constructorimpl(j10, isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int minCrossAxisIntrinsicItemSize(IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return isHorizontal() ? intrinsicMeasurable.minIntrinsicHeight(i10) : intrinsicMeasurable.minIntrinsicWidth(i10);
    }

    @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) AbstractC8778f0.m14569o0(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) AbstractC8778f0.m14568n0(list2) : null;
        List list3 = (List) AbstractC8778f0.m14569o0(list, 2);
        flowLayoutOverflowState.m20785setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) AbstractC8778f0.m14568n0(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null));
        if (isHorizontal()) {
            List<? extends IntrinsicMeasurable> listM14771n = (List) AbstractC8778f0.m14568n0(list);
            if (listM14771n == null) {
                listM14771n = AbstractC8809v.m14771n();
            }
            return intrinsicCrossAxisSize(listM14771n, i10, intrinsicMeasureScope.mo20491roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo20491roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends IntrinsicMeasurable> listM14771n2 = (List) AbstractC8778f0.m14568n0(list);
        if (listM14771n2 == null) {
            listM14771n2 = AbstractC8809v.m14771n();
        }
        return minIntrinsicMainAxisSize(listM14771n2, i10, intrinsicMeasureScope.mo20491roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo20491roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, int i10, int i11, int i12, int i13, int i14, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i15 = i13;
        int i16 = i14;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        int size3 = list.size();
        for (int i17 = 0; i17 < size3; i17++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i17);
            int iMinMainAxisIntrinsicItemSize = minMainAxisIntrinsicItemSize(intrinsicMeasurable, i10);
            iArr[i17] = iMinMainAxisIntrinsicItemSize;
            iArr2[i17] = minCrossAxisIntrinsicItemSize(intrinsicMeasurable, iMinMainAxisIntrinsicItemSize);
        }
        List<? extends IntrinsicMeasurable> list2 = list;
        int i18 = Integer.MAX_VALUE;
        if (i16 != Integer.MAX_VALUE && i15 != Integer.MAX_VALUE) {
            i18 = i15 * i16;
        }
        int iMin = Math.min(i18 - (((i18 >= list2.size() || !(flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandIndicator || flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) && (i18 < list2.size() || i16 < flowLayoutOverflowState.getMinLinesToShowCollapse$foundation_layout_release() || flowLayoutOverflowState.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? 0 : 1), list2.size());
        int iM14720m1 = AbstractC8801r.m14720m1(iArr) + ((list2.size() - 1) * i11);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i19 = iArr2[0];
        AbstractC8792m0 it = new C8321f(1, AbstractC8801r.m14745z0(iArr2)).iterator();
        while (it.hasNext()) {
            int i20 = iArr2[it.nextInt()];
            if (i19 < i20) {
                i19 = i20;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i21 = iArr[0];
        AbstractC8792m0 it2 = new C8321f(1, AbstractC8801r.m14745z0(iArr)).iterator();
        while (it2.hasNext()) {
            int i22 = iArr[it2.nextInt()];
            if (i21 < i22) {
                i21 = i22;
            }
        }
        int i23 = i21;
        int i24 = iM14720m1;
        while (i23 <= i24 && i19 != i10) {
            int i25 = (i23 + i24) / 2;
            long jIntrinsicCrossAxisSize = FlowLayoutKt.intrinsicCrossAxisSize(list2, iArr, iArr2, i25, i11, i12, i15, i16, flowLayoutOverflowState);
            int iM20127getFirstimpl = IntIntPair.m20127getFirstimpl(jIntrinsicCrossAxisSize);
            int iM20128getSecondimpl = IntIntPair.m20128getSecondimpl(jIntrinsicCrossAxisSize);
            if (iM20127getFirstimpl > i10 || iM20128getSecondimpl < iMin) {
                i23 = i25 + 1;
                if (i23 > i24) {
                    return i23;
                }
            } else {
                if (iM20127getFirstimpl >= i10) {
                    return i25;
                }
                i24 = i25 - 1;
            }
            list2 = list;
            i15 = i13;
            i16 = i14;
            iM14720m1 = i25;
            i19 = iM20127getFirstimpl;
        }
        return iM14720m1;
    }

    @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) AbstractC8778f0.m14569o0(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) AbstractC8778f0.m14568n0(list2) : null;
        List list3 = (List) AbstractC8778f0.m14569o0(list, 2);
        flowLayoutOverflowState.m20785setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) AbstractC8778f0.m14568n0(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null));
        if (isHorizontal()) {
            List<? extends IntrinsicMeasurable> listM14771n = (List) AbstractC8778f0.m14568n0(list);
            if (listM14771n == null) {
                listM14771n = AbstractC8809v.m14771n();
            }
            return minIntrinsicMainAxisSize(listM14771n, i10, intrinsicMeasureScope.mo20491roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo20491roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends IntrinsicMeasurable> listM14771n2 = (List) AbstractC8778f0.m14568n0(list);
        if (listM14771n2 == null) {
            listM14771n2 = AbstractC8809v.m14771n();
        }
        return intrinsicCrossAxisSize(listM14771n2, i10, intrinsicMeasureScope.mo20491roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo20491roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int minMainAxisIntrinsicItemSize(IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return isHorizontal() ? intrinsicMeasurable.minIntrinsicWidth(i10) : intrinsicMeasurable.minIntrinsicHeight(i10);
    }

    public String toString() {
        return "FlowMeasurePolicy(isHorizontal=" + this.isHorizontal + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", mainAxisSpacing=" + ((Object) C3156Dp.m26910toStringimpl(this.mainAxisSpacing)) + ", crossAxisAlignment=" + this.crossAxisAlignment + ", crossAxisArrangementSpacing=" + ((Object) C3156Dp.m26910toStringimpl(this.crossAxisArrangementSpacing)) + ", maxItemsInMainAxis=" + this.maxItemsInMainAxis + ", maxLines=" + this.maxLines + ", overflow=" + this.overflow + ')';
    }

    private FlowMeasurePolicy(boolean z10, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f10, CrossAxisAlignment crossAxisAlignment, float f11, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState) {
        this.isHorizontal = z10;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.mainAxisSpacing = f10;
        this.crossAxisAlignment = crossAxisAlignment;
        this.crossAxisArrangementSpacing = f11;
        this.maxItemsInMainAxis = i10;
        this.maxLines = i11;
        this.overflow = flowLayoutOverflowState;
    }
}
