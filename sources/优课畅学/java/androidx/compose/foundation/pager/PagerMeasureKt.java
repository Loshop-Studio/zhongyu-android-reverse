package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.gestures.snapping.SnapPositionKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p077d8.C8319d;
import p123h7.C8736p;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8809v;
import p134i7.C8791m;
import p135i8.InterfaceC8822b0;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

/* loaded from: classes.dex */
public final class PagerMeasureKt {
    public static final float MaxPageOffset = 0.5f;
    public static final float MinPageOffset = -0.5f;

    private static final MeasuredPage calculateNewCurrentPage(int i10, List<MeasuredPage> list, int i11, int i12, int i13, SnapPosition snapPosition, int i14) {
        MeasuredPage measuredPage;
        if (list.isEmpty()) {
            measuredPage = null;
        } else {
            MeasuredPage measuredPage2 = list.get(0);
            MeasuredPage measuredPage3 = measuredPage2;
            float f10 = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(i10, i11, i12, i13, measuredPage3.getOffset(), measuredPage3.getIndex(), snapPosition, i14));
            int iM14773p = AbstractC8809v.m14773p(list);
            if (1 <= iM14773p) {
                int i15 = 1;
                while (true) {
                    MeasuredPage measuredPage4 = list.get(i15);
                    MeasuredPage measuredPage5 = measuredPage4;
                    float f11 = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(i10, i11, i12, i13, measuredPage5.getOffset(), measuredPage5.getIndex(), snapPosition, i14));
                    if (Float.compare(f10, f11) < 0) {
                        f10 = f11;
                        measuredPage2 = measuredPage4;
                    }
                    if (i15 == iM14773p) {
                        break;
                    }
                    i15++;
                }
            }
            measuredPage = measuredPage2;
        }
        return measuredPage;
    }

    private static final List<MeasuredPage> calculatePagesOffsets(LazyLayoutMeasureScope lazyLayoutMeasureScope, List<MeasuredPage> list, List<MeasuredPage> list2, List<MeasuredPage> list3, int i10, int i11, int i12, int i13, int i14, Orientation orientation, boolean z10, Density density, int i15, int i16) {
        int i17 = i14;
        int i18 = i16 + i15;
        int i19 = orientation == Orientation.Vertical ? i11 : i10;
        int i20 = 0;
        boolean z11 = i12 < Math.min(i19, i13);
        if (z11) {
            if (!(i17 == 0)) {
                InlineClassHelperKt.throwIllegalStateException("non-zero pagesScrollOffset=" + i17);
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z11) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                InlineClassHelperKt.throwIllegalArgumentException("No extra pages");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i20 < size) {
                iArr[i20] = i16;
                i20++;
            }
            int[] iArr2 = new int[size];
            Arrangement.HorizontalOrVertical horizontalOrVerticalM20740spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m20740spacedBy0680j_4(lazyLayoutMeasureScope.mo20494toDpu2uoSUM(i15));
            if (orientation == Orientation.Vertical) {
                horizontalOrVerticalM20740spacedBy0680j_4.arrange(density, i19, iArr, iArr2);
            } else {
                horizontalOrVerticalM20740spacedBy0680j_4.arrange(density, i19, iArr, LayoutDirection.Ltr, iArr2);
            }
            C8319d c8319dM14739w0 = AbstractC8801r.m14739w0(iArr2);
            if (z10) {
                c8319dM14739w0 = AbstractC8323h.m13523r(c8319dM14739w0);
            }
            int iM13496b = c8319dM14739w0.m13496b();
            int iM13497c = c8319dM14739w0.m13497c();
            int iM13498d = c8319dM14739w0.m13498d();
            if ((iM13498d > 0 && iM13496b <= iM13497c) || (iM13498d < 0 && iM13497c <= iM13496b)) {
                while (true) {
                    int size2 = iArr2[iM13496b];
                    MeasuredPage measuredPage = list.get(calculatePagesOffsets$reverseAware(iM13496b, z10, size));
                    if (z10) {
                        size2 = (i19 - size2) - measuredPage.getSize();
                    }
                    measuredPage.position(size2, i10, i11);
                    arrayList.add(measuredPage);
                    if (iM13496b == iM13497c) {
                        break;
                    }
                    iM13496b += iM13498d;
                }
            }
        } else {
            int size3 = list2.size();
            int i21 = i17;
            for (int i22 = 0; i22 < size3; i22++) {
                MeasuredPage measuredPage2 = list2.get(i22);
                i21 -= i18;
                measuredPage2.position(i21, i10, i11);
                arrayList.add(measuredPage2);
            }
            int size4 = list.size();
            for (int i23 = 0; i23 < size4; i23++) {
                MeasuredPage measuredPage3 = list.get(i23);
                measuredPage3.position(i17, i10, i11);
                arrayList.add(measuredPage3);
                i17 += i18;
            }
            int size5 = list3.size();
            while (i20 < size5) {
                MeasuredPage measuredPage4 = list3.get(i20);
                measuredPage4.position(i17, i10, i11);
                arrayList.add(measuredPage4);
                i17 += i18;
                i20++;
            }
        }
        return arrayList;
    }

    private static final int calculatePagesOffsets$reverseAware(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }

    private static final List<MeasuredPage> createPagesAfterList(int i10, int i11, int i12, List<Integer> list, InterfaceC10570l interfaceC10570l) {
        int iMin = Math.min(i12 + i10, i11 - 1);
        int i13 = i10 + 1;
        ArrayList arrayList = null;
        if (i13 <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(interfaceC10570l.invoke(Integer.valueOf(i13)));
                if (i13 == iMin) {
                    break;
                }
                i13++;
            }
        }
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            int iIntValue = list.get(i14).intValue();
            if (iMin + 1 <= iIntValue && iIntValue < i11) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(interfaceC10570l.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? AbstractC8809v.m14771n() : arrayList;
    }

    private static final List<MeasuredPage> createPagesBeforeList(int i10, int i11, List<Integer> list, InterfaceC10570l interfaceC10570l) {
        int iMax = Math.max(0, i10 - i11);
        int i12 = i10 - 1;
        ArrayList arrayList = null;
        if (iMax <= i12) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(interfaceC10570l.invoke(Integer.valueOf(i12)));
                if (i12 == iMax) {
                    break;
                }
                i12--;
            }
        }
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            int iIntValue = list.get(i13).intValue();
            if (iIntValue < iMax) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(interfaceC10570l.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? AbstractC8809v.m14771n() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAndMeasure-SGf7dI0, reason: not valid java name */
    public static final MeasuredPage m21108getAndMeasureSGf7dI0(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i10, long j10, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j11, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z10, int i11) {
        return new MeasuredPage(i10, i11, lazyLayoutMeasureScope.mo21032measure0kLqBqw(i10, j10), j11, pagerLazyLayoutItemProvider.getKey(i10), orientation, horizontal, vertical, layoutDirection, z10, null);
    }

    /* renamed from: measurePager-bmk8ZPk, reason: not valid java name */
    public static final PagerMeasureResult m21109measurePagerbmk8ZPk(final LazyLayoutMeasureScope lazyLayoutMeasureScope, int i10, final PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i11, int i12, int i13, int i14, int i15, int i16, long j10, final Orientation orientation, final Alignment.Vertical vertical, final Alignment.Horizontal horizontal, final boolean z10, final long j11, final int i17, int i18, List<Integer> list, SnapPosition snapPosition, final MutableState<C8736p> mutableState, InterfaceC8822b0 interfaceC8822b0, InterfaceC10575q interfaceC10575q) {
        int i19;
        boolean z11;
        int iMax;
        int i20;
        int i21;
        int i22;
        List<MeasuredPage> arrayList;
        List arrayList2;
        List arrayList3;
        int i23;
        if (!(i12 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("negative beforeContentPadding");
        }
        if (!(i13 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("negative afterContentPadding");
        }
        int iM13510e = AbstractC8323h.m13510e(i17 + i14, 0);
        if (i10 <= 0) {
            return new PagerMeasureResult(AbstractC8809v.m14771n(), i17, i14, i13, orientation, -i12, i11 + i13, false, i18, null, null, 0.0f, 0, false, snapPosition, (MeasureResult) interfaceC10575q.invoke(Integer.valueOf(Constraints.m26854getMinWidthimpl(j10)), Integer.valueOf(Constraints.m26853getMinHeightimpl(j10)), new InterfaceC10570l() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$4
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C8736p.f16368a;
                }
            }), false, null, null, interfaceC8822b0, 393216, null);
        }
        Orientation orientation2 = orientation;
        Orientation orientation3 = Orientation.Vertical;
        final long jConstraints$default = ConstraintsKt.Constraints$default(0, orientation2 == orientation3 ? Constraints.m26852getMaxWidthimpl(j10) : i17, 0, orientation2 != orientation3 ? Constraints.m26851getMaxHeightimpl(j10) : i17, 5, null);
        int i24 = i15;
        int i25 = i16;
        while (i24 > 0 && i25 > 0) {
            i24--;
            i25 -= iM13510e;
        }
        int i26 = i25 * (-1);
        if (i24 >= i10) {
            i24 = i10 - 1;
            i26 = 0;
        }
        C8791m c8791m = new C8791m();
        int i27 = -i12;
        int i28 = (i14 < 0 ? i14 : 0) + i27;
        int i29 = i26 + i28;
        int iMax2 = 0;
        while (i29 < 0 && i24 > 0) {
            int i30 = i24 - 1;
            MeasuredPage measuredPageM21108getAndMeasureSGf7dI0 = m21108getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i30, jConstraints$default, pagerLazyLayoutItemProvider, j11, orientation2, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z10, i17);
            c8791m.add(0, measuredPageM21108getAndMeasureSGf7dI0);
            iMax2 = Math.max(iMax2, measuredPageM21108getAndMeasureSGf7dI0.getCrossAxisSize());
            i29 += iM13510e;
            i28 = i28;
            i24 = i30;
            orientation2 = orientation;
        }
        int i31 = i28;
        int i32 = iMax2;
        if (i29 < i31) {
            i29 = i31;
        }
        int i33 = i29 - i31;
        int i34 = i11 + i13;
        int i35 = i24;
        int iM13510e2 = AbstractC8323h.m13510e(i34, 0);
        int i36 = -i33;
        int i37 = i35;
        int i38 = 0;
        boolean z12 = false;
        while (i38 < c8791m.size()) {
            if (i36 >= iM13510e2) {
                c8791m.remove(i38);
                z12 = true;
            } else {
                i37++;
                i36 += iM13510e;
                i38++;
            }
        }
        int iMax3 = i32;
        int i39 = i37;
        boolean z13 = z12;
        int i40 = i33;
        while (i39 < i10 && (i36 < iM13510e2 || i36 <= 0 || c8791m.isEmpty())) {
            int i41 = iM13510e2;
            int i42 = i39;
            MeasuredPage measuredPageM21108getAndMeasureSGf7dI02 = m21108getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i42, jConstraints$default, pagerLazyLayoutItemProvider, j11, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z10, i17);
            int i43 = i40;
            int i44 = i10 - 1;
            i36 += i42 == i44 ? i17 : iM13510e;
            if (i36 > i31 || i42 == i44) {
                iMax3 = Math.max(iMax3, measuredPageM21108getAndMeasureSGf7dI02.getCrossAxisSize());
                c8791m.add(measuredPageM21108getAndMeasureSGf7dI02);
                i23 = i35;
                i40 = i43;
            } else {
                i23 = i42 + 1;
                i40 = i43 - iM13510e;
                z13 = true;
            }
            i39 = i42 + 1;
            i35 = i23;
            iM13510e2 = i41;
        }
        int i45 = i40;
        if (i36 < i11) {
            int i46 = i11 - i36;
            i20 = i45 - i46;
            i36 += i46;
            iMax = iMax3;
            i21 = i35;
            while (i20 < i12 && i21 > 0) {
                int i47 = i21 - 1;
                MeasuredPage measuredPageM21108getAndMeasureSGf7dI03 = m21108getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i47, jConstraints$default, pagerLazyLayoutItemProvider, j11, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z10, i17);
                c8791m.add(0, measuredPageM21108getAndMeasureSGf7dI03);
                iMax = Math.max(iMax, measuredPageM21108getAndMeasureSGf7dI03.getCrossAxisSize());
                i20 += iM13510e;
                i39 = i39;
                i21 = i47;
            }
            i19 = i39;
            z11 = false;
            if (i20 < 0) {
                i36 += i20;
                i20 = 0;
            }
        } else {
            i19 = i39;
            z11 = false;
            iMax = iMax3;
            i20 = i45;
            i21 = i35;
        }
        if (!(i20 >= 0 ? true : z11)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid currentFirstPageScrollOffset");
        }
        int i48 = iMax;
        int i49 = -i20;
        MeasuredPage measuredPage = (MeasuredPage) c8791m.first();
        if (i12 > 0 || i14 < 0) {
            int size = c8791m.size();
            i22 = i49;
            int i50 = 0;
            while (i50 < size && i20 != 0 && iM13510e <= i20 && i50 != AbstractC8809v.m14773p(c8791m)) {
                i20 -= iM13510e;
                i50++;
                measuredPage = (MeasuredPage) c8791m.get(i50);
            }
        } else {
            i22 = i49;
        }
        int i51 = i20;
        MeasuredPage measuredPage2 = measuredPage;
        List<MeasuredPage> listCreatePagesBeforeList = createPagesBeforeList(i21, i18, list, new InterfaceC10570l() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesBefore$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final MeasuredPage invoke(int i52) {
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                return PagerMeasureKt.m21108getAndMeasureSGf7dI0(lazyLayoutMeasureScope2, i52, jConstraints$default, pagerLazyLayoutItemProvider, j11, orientation, horizontal, vertical, lazyLayoutMeasureScope2.getLayoutDirection(), z10, i17);
            }
        });
        int size2 = listCreatePagesBeforeList.size();
        int iMax4 = i48;
        int i52 = 0;
        while (i52 < size2) {
            iMax4 = Math.max(iMax4, listCreatePagesBeforeList.get(i52).getCrossAxisSize());
            i52++;
            listCreatePagesBeforeList = listCreatePagesBeforeList;
        }
        List<MeasuredPage> list2 = listCreatePagesBeforeList;
        List<MeasuredPage> listCreatePagesAfterList = createPagesAfterList(((MeasuredPage) c8791m.last()).getIndex(), i10, i18, list, new InterfaceC10570l() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesAfter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final MeasuredPage invoke(int i53) {
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                return PagerMeasureKt.m21108getAndMeasureSGf7dI0(lazyLayoutMeasureScope2, i53, jConstraints$default, pagerLazyLayoutItemProvider, j11, orientation, horizontal, vertical, lazyLayoutMeasureScope2.getLayoutDirection(), z10, i17);
            }
        });
        int size3 = listCreatePagesAfterList.size();
        for (int i53 = 0; i53 < size3; i53++) {
            iMax4 = Math.max(iMax4, listCreatePagesAfterList.get(i53).getCrossAxisSize());
        }
        boolean z14 = AbstractC9133u.m16128b(measuredPage2, c8791m.first()) && list2.isEmpty() && listCreatePagesAfterList.isEmpty();
        Orientation orientation4 = Orientation.Vertical;
        int iM26869constrainWidthK40F9xA = ConstraintsKt.m26869constrainWidthK40F9xA(j10, orientation == orientation4 ? iMax4 : i36);
        if (orientation == orientation4) {
            iMax4 = i36;
        }
        int iM26868constrainHeightK40F9xA = ConstraintsKt.m26868constrainHeightK40F9xA(j10, iMax4);
        int i54 = i19;
        int i55 = i36;
        final List<MeasuredPage> listCalculatePagesOffsets = calculatePagesOffsets(lazyLayoutMeasureScope, c8791m, list2, listCreatePagesAfterList, iM26869constrainWidthK40F9xA, iM26868constrainHeightK40F9xA, i55, i11, i22, orientation, z10, lazyLayoutMeasureScope, i14, i17);
        if (z14) {
            arrayList = listCalculatePagesOffsets;
        } else {
            arrayList = new ArrayList<>(listCalculatePagesOffsets.size());
            int size4 = listCalculatePagesOffsets.size();
            int i56 = 0;
            while (i56 < size4) {
                MeasuredPage measuredPage3 = listCalculatePagesOffsets.get(i56);
                MeasuredPage measuredPage4 = measuredPage3;
                MeasuredPage measuredPage5 = measuredPage2;
                int i57 = i54;
                if (measuredPage4.getIndex() >= ((MeasuredPage) c8791m.first()).getIndex() && measuredPage4.getIndex() <= ((MeasuredPage) c8791m.last()).getIndex()) {
                    arrayList.add(measuredPage3);
                }
                i56++;
                i54 = i57;
                measuredPage2 = measuredPage5;
            }
        }
        MeasuredPage measuredPage6 = measuredPage2;
        int i58 = i54;
        if (list2.isEmpty()) {
            arrayList2 = AbstractC8809v.m14771n();
        } else {
            arrayList2 = new ArrayList(listCalculatePagesOffsets.size());
            int size5 = listCalculatePagesOffsets.size();
            for (int i59 = 0; i59 < size5; i59++) {
                MeasuredPage measuredPage7 = listCalculatePagesOffsets.get(i59);
                if (measuredPage7.getIndex() < ((MeasuredPage) c8791m.first()).getIndex()) {
                    arrayList2.add(measuredPage7);
                }
            }
        }
        List list3 = arrayList2;
        if (listCreatePagesAfterList.isEmpty()) {
            arrayList3 = AbstractC8809v.m14771n();
        } else {
            arrayList3 = new ArrayList(listCalculatePagesOffsets.size());
            int size6 = listCalculatePagesOffsets.size();
            for (int i60 = 0; i60 < size6; i60++) {
                MeasuredPage measuredPage8 = listCalculatePagesOffsets.get(i60);
                if (measuredPage8.getIndex() > ((MeasuredPage) c8791m.last()).getIndex()) {
                    arrayList3.add(measuredPage8);
                }
            }
        }
        List list4 = arrayList3;
        MeasuredPage measuredPageCalculateNewCurrentPage = calculateNewCurrentPage(i11 + i12 + i13, arrayList, i12, i13, iM13510e, snapPosition, i10);
        return new PagerMeasureResult(arrayList, i17, i14, i13, orientation, i27, i34, z10, i18, measuredPage6, measuredPageCalculateNewCurrentPage, iM13510e == 0 ? 0.0f : AbstractC8323h.m13517l((snapPosition.position(r0, i17, i12, i13, measuredPageCalculateNewCurrentPage != null ? measuredPageCalculateNewCurrentPage.getIndex() : 0, i10) - (measuredPageCalculateNewCurrentPage != null ? measuredPageCalculateNewCurrentPage.getOffset() : 0)) / iM13510e, -0.5f, 0.5f), i51, i58 < i10 || i55 > i11, snapPosition, (MeasureResult) interfaceC10575q.invoke(Integer.valueOf(iM26869constrainWidthK40F9xA), Integer.valueOf(iM26868constrainHeightK40F9xA), new InterfaceC10570l() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$14
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                final List<MeasuredPage> list5 = listCalculatePagesOffsets;
                placementScope.withMotionFrameOfReferencePlacement(new InterfaceC10570l() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$14.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return C8736p.f16368a;
                    }

                    public final void invoke(Placeable.PlacementScope placementScope2) {
                        List<MeasuredPage> list6 = list5;
                        int size7 = list6.size();
                        for (int i61 = 0; i61 < size7; i61++) {
                            list6.get(i61).place(placementScope2);
                        }
                    }
                });
                ObservableScopeInvalidator.m21037attachToScopeimpl(mutableState);
            }
        }), z13, list3, list4, interfaceC8822b0);
    }

    private static final void debugLog(InterfaceC10559a interfaceC10559a) {
    }
}
