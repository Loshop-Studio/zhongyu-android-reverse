package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.gestures.snapping.SnapPositionKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p265nd.AbstractC10410o;
import p265nd.C10403h;
import p309qc.C10786q;
import p325rc.AbstractC10968r;
import p325rc.AbstractC10978w;
import p325rc.C10958m;
import sd.InterfaceC11122i0;

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
            int iM24138p = AbstractC10978w.m24138p(list);
            if (1 <= iM24138p) {
                int i15 = 1;
                while (true) {
                    MeasuredPage measuredPage4 = list.get(i15);
                    MeasuredPage measuredPage5 = measuredPage4;
                    float f11 = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(i10, i11, i12, i13, measuredPage5.getOffset(), measuredPage5.getIndex(), snapPosition, i14));
                    if (Float.compare(f10, f11) < 0) {
                        f10 = f11;
                        measuredPage2 = measuredPage4;
                    }
                    if (i15 == iM24138p) {
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
        ArrayList arrayList;
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
        ArrayList arrayList2 = new ArrayList(list.size() + list2.size() + list3.size());
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
            Arrangement.HorizontalOrVertical horizontalOrVerticalM27342spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m27342spacedBy0680j_4(lazyLayoutMeasureScope.mo27096toDpu2uoSUM(i15));
            if (orientation == Orientation.Vertical) {
                horizontalOrVerticalM27342spacedBy0680j_4.arrange(density, i19, iArr, iArr2);
                arrayList = arrayList2;
            } else {
                arrayList = arrayList2;
                horizontalOrVerticalM27342spacedBy0680j_4.arrange(density, i19, iArr, LayoutDirection.Ltr, iArr2);
            }
            C10403h c10403hM24108v0 = AbstractC10968r.m24108v0(iArr2);
            if (z10) {
                c10403hM24108v0 = AbstractC10410o.m21766s(c10403hM24108v0);
            }
            int iM21733b = c10403hM24108v0.m21733b();
            int iM21734c = c10403hM24108v0.m21734c();
            int iM21735d = c10403hM24108v0.m21735d();
            if ((iM21735d > 0 && iM21733b <= iM21734c) || (iM21735d < 0 && iM21734c <= iM21733b)) {
                while (true) {
                    int size2 = iArr2[iM21733b];
                    MeasuredPage measuredPage = list.get(calculatePagesOffsets$reverseAware(iM21733b, z10, size));
                    if (z10) {
                        size2 = (i19 - size2) - measuredPage.getSize();
                    }
                    measuredPage.position(size2, i10, i11);
                    arrayList.add(measuredPage);
                    if (iM21733b == iM21734c) {
                        break;
                    }
                    iM21733b += iM21735d;
                }
            }
        } else {
            arrayList = arrayList2;
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

    private static final List<MeasuredPage> createPagesAfterList(int i10, int i11, int i12, List<Integer> list, InterfaceC9540l interfaceC9540l) {
        int iMin = Math.min(i12 + i10, i11 - 1);
        int i13 = i10 + 1;
        ArrayList arrayList = null;
        if (i13 <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(interfaceC9540l.invoke(Integer.valueOf(i13)));
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
                arrayList.add(interfaceC9540l.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? AbstractC10978w.m24136n() : arrayList;
    }

    private static final List<MeasuredPage> createPagesBeforeList(int i10, int i11, List<Integer> list, InterfaceC9540l interfaceC9540l) {
        int iMax = Math.max(0, i10 - i11);
        int i12 = i10 - 1;
        ArrayList arrayList = null;
        if (iMax <= i12) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(interfaceC9540l.invoke(Integer.valueOf(i12)));
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
                arrayList.add(interfaceC9540l.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? AbstractC10978w.m24136n() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAndMeasure-SGf7dI0, reason: not valid java name */
    public static final MeasuredPage m27710getAndMeasureSGf7dI0(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i10, long j10, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j11, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z10, int i11) {
        return new MeasuredPage(i10, i11, lazyLayoutMeasureScope.mo27634measure0kLqBqw(i10, j10), j11, pagerLazyLayoutItemProvider.getKey(i10), orientation, horizontal, vertical, layoutDirection, z10, null);
    }

    /* renamed from: measurePager-bmk8ZPk, reason: not valid java name */
    public static final PagerMeasureResult m27711measurePagerbmk8ZPk(final LazyLayoutMeasureScope lazyLayoutMeasureScope, int i10, final PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i11, int i12, int i13, int i14, int i15, int i16, long j10, final Orientation orientation, final Alignment.Vertical vertical, final Alignment.Horizontal horizontal, final boolean z10, final long j11, final int i17, int i18, List<Integer> list, SnapPosition snapPosition, final MutableState<C10786q> mutableState, InterfaceC11122i0 interfaceC11122i0, InterfaceC9545q interfaceC9545q) {
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
        int iM21752e = AbstractC10410o.m21752e(i17 + i14, 0);
        if (i10 <= 0) {
            return new PagerMeasureResult(AbstractC10978w.m24136n(), i17, i14, i13, orientation, -i12, i11 + i13, false, i18, null, null, 0.0f, 0, false, snapPosition, (MeasureResult) interfaceC9545q.invoke(Integer.valueOf(Constraints.m33456getMinWidthimpl(j10)), Integer.valueOf(Constraints.m33455getMinHeightimpl(j10)), new InterfaceC9540l() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$4
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C10786q.f26013a;
                }
            }), false, null, null, interfaceC11122i0, 393216, null);
        }
        Orientation orientation2 = orientation;
        Orientation orientation3 = Orientation.Vertical;
        final long jConstraints$default = ConstraintsKt.Constraints$default(0, orientation2 == orientation3 ? Constraints.m33454getMaxWidthimpl(j10) : i17, 0, orientation2 != orientation3 ? Constraints.m33453getMaxHeightimpl(j10) : i17, 5, null);
        int i24 = i15;
        int i25 = i16;
        while (i24 > 0 && i25 > 0) {
            i24--;
            i25 -= iM21752e;
        }
        int i26 = i25 * (-1);
        if (i24 >= i10) {
            i24 = i10 - 1;
            i26 = 0;
        }
        C10958m c10958m = new C10958m();
        int i27 = -i12;
        int i28 = (i14 < 0 ? i14 : 0) + i27;
        int i29 = i26 + i28;
        int iMax2 = 0;
        while (i29 < 0 && i24 > 0) {
            int i30 = i24 - 1;
            MeasuredPage measuredPageM27710getAndMeasureSGf7dI0 = m27710getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i30, jConstraints$default, pagerLazyLayoutItemProvider, j11, orientation2, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z10, i17);
            c10958m.add(0, measuredPageM27710getAndMeasureSGf7dI0);
            iMax2 = Math.max(iMax2, measuredPageM27710getAndMeasureSGf7dI0.getCrossAxisSize());
            i29 += iM21752e;
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
        int iM21752e2 = AbstractC10410o.m21752e(i34, 0);
        int i36 = -i33;
        int i37 = i35;
        int i38 = 0;
        boolean z12 = false;
        while (i38 < c10958m.size()) {
            if (i36 >= iM21752e2) {
                c10958m.remove(i38);
                z12 = true;
            } else {
                i37++;
                i36 += iM21752e;
                i38++;
            }
        }
        int iMax3 = i32;
        int i39 = i37;
        boolean z13 = z12;
        int i40 = i33;
        while (i39 < i10 && (i36 < iM21752e2 || i36 <= 0 || c10958m.isEmpty())) {
            int i41 = iM21752e2;
            int i42 = i39;
            MeasuredPage measuredPageM27710getAndMeasureSGf7dI02 = m27710getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i42, jConstraints$default, pagerLazyLayoutItemProvider, j11, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z10, i17);
            int i43 = i40;
            int i44 = i10 - 1;
            i36 += i42 == i44 ? i17 : iM21752e;
            if (i36 > i31 || i42 == i44) {
                iMax3 = Math.max(iMax3, measuredPageM27710getAndMeasureSGf7dI02.getCrossAxisSize());
                c10958m.add(measuredPageM27710getAndMeasureSGf7dI02);
                i23 = i35;
                i40 = i43;
            } else {
                i23 = i42 + 1;
                i40 = i43 - iM21752e;
                z13 = true;
            }
            i39 = i42 + 1;
            i35 = i23;
            iM21752e2 = i41;
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
                MeasuredPage measuredPageM27710getAndMeasureSGf7dI03 = m27710getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i47, jConstraints$default, pagerLazyLayoutItemProvider, j11, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z10, i17);
                c10958m.add(0, measuredPageM27710getAndMeasureSGf7dI03);
                iMax = Math.max(iMax, measuredPageM27710getAndMeasureSGf7dI03.getCrossAxisSize());
                i20 += iM21752e;
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
        MeasuredPage measuredPage = (MeasuredPage) c10958m.first();
        if (i12 > 0 || i14 < 0) {
            int size = c10958m.size();
            i22 = i49;
            int i50 = 0;
            while (i50 < size && i20 != 0 && iM21752e <= i20 && i50 != AbstractC10978w.m24138p(c10958m)) {
                i20 -= iM21752e;
                i50++;
                measuredPage = (MeasuredPage) c10958m.get(i50);
            }
        } else {
            i22 = i49;
        }
        int i51 = i20;
        MeasuredPage measuredPage2 = measuredPage;
        List<MeasuredPage> listCreatePagesBeforeList = createPagesBeforeList(i21, i18, list, new InterfaceC9540l() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesBefore$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final MeasuredPage invoke(int i52) {
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                return PagerMeasureKt.m27710getAndMeasureSGf7dI0(lazyLayoutMeasureScope2, i52, jConstraints$default, pagerLazyLayoutItemProvider, j11, orientation, horizontal, vertical, lazyLayoutMeasureScope2.getLayoutDirection(), z10, i17);
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
        List<MeasuredPage> listCreatePagesAfterList = createPagesAfterList(((MeasuredPage) c10958m.last()).getIndex(), i10, i18, list, new InterfaceC9540l() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesAfter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final MeasuredPage invoke(int i53) {
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                return PagerMeasureKt.m27710getAndMeasureSGf7dI0(lazyLayoutMeasureScope2, i53, jConstraints$default, pagerLazyLayoutItemProvider, j11, orientation, horizontal, vertical, lazyLayoutMeasureScope2.getLayoutDirection(), z10, i17);
            }
        });
        int size3 = listCreatePagesAfterList.size();
        for (int i53 = 0; i53 < size3; i53++) {
            iMax4 = Math.max(iMax4, listCreatePagesAfterList.get(i53).getCrossAxisSize());
        }
        boolean z14 = AbstractC9979u.m20289b(measuredPage2, c10958m.first()) && list2.isEmpty() && listCreatePagesAfterList.isEmpty();
        Orientation orientation4 = Orientation.Vertical;
        int iM33471constrainWidthK40F9xA = ConstraintsKt.m33471constrainWidthK40F9xA(j10, orientation == orientation4 ? iMax4 : i36);
        if (orientation == orientation4) {
            iMax4 = i36;
        }
        int iM33470constrainHeightK40F9xA = ConstraintsKt.m33470constrainHeightK40F9xA(j10, iMax4);
        int i54 = i19;
        int i55 = i36;
        final List<MeasuredPage> listCalculatePagesOffsets = calculatePagesOffsets(lazyLayoutMeasureScope, c10958m, list2, listCreatePagesAfterList, iM33471constrainWidthK40F9xA, iM33470constrainHeightK40F9xA, i55, i11, i22, orientation, z10, lazyLayoutMeasureScope, i14, i17);
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
                if (measuredPage4.getIndex() >= ((MeasuredPage) c10958m.first()).getIndex() && measuredPage4.getIndex() <= ((MeasuredPage) c10958m.last()).getIndex()) {
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
            arrayList2 = AbstractC10978w.m24136n();
        } else {
            arrayList2 = new ArrayList(listCalculatePagesOffsets.size());
            int size5 = listCalculatePagesOffsets.size();
            for (int i59 = 0; i59 < size5; i59++) {
                MeasuredPage measuredPage7 = listCalculatePagesOffsets.get(i59);
                if (measuredPage7.getIndex() < ((MeasuredPage) c10958m.first()).getIndex()) {
                    arrayList2.add(measuredPage7);
                }
            }
        }
        List list3 = arrayList2;
        if (listCreatePagesAfterList.isEmpty()) {
            arrayList3 = AbstractC10978w.m24136n();
        } else {
            arrayList3 = new ArrayList(listCalculatePagesOffsets.size());
            int size6 = listCalculatePagesOffsets.size();
            for (int i60 = 0; i60 < size6; i60++) {
                MeasuredPage measuredPage8 = listCalculatePagesOffsets.get(i60);
                if (measuredPage8.getIndex() > ((MeasuredPage) c10958m.last()).getIndex()) {
                    arrayList3.add(measuredPage8);
                }
            }
        }
        List list4 = arrayList3;
        MeasuredPage measuredPageCalculateNewCurrentPage = calculateNewCurrentPage(i11 + i12 + i13, arrayList, i12, i13, iM21752e, snapPosition, i10);
        return new PagerMeasureResult(arrayList, i17, i14, i13, orientation, i27, i34, z10, i18, measuredPage6, measuredPageCalculateNewCurrentPage, iM21752e == 0 ? 0.0f : AbstractC10410o.m21760m((snapPosition.position(r0, i17, i12, i13, measuredPageCalculateNewCurrentPage != null ? measuredPageCalculateNewCurrentPage.getIndex() : 0, i10) - (measuredPageCalculateNewCurrentPage != null ? measuredPageCalculateNewCurrentPage.getOffset() : 0)) / iM21752e, -0.5f, 0.5f), i51, i58 < i10 || i55 > i11, snapPosition, (MeasureResult) interfaceC9545q.invoke(Integer.valueOf(iM33471constrainWidthK40F9xA), Integer.valueOf(iM33470constrainHeightK40F9xA), new InterfaceC9540l() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$14
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                final List<MeasuredPage> list5 = listCalculatePagesOffsets;
                placementScope.withMotionFrameOfReferencePlacement(new InterfaceC9540l() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$14.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(Placeable.PlacementScope placementScope2) {
                        List<MeasuredPage> list6 = list5;
                        int size7 = list6.size();
                        for (int i61 = 0; i61 < size7; i61++) {
                            list6.get(i61).place(placementScope2);
                        }
                    }
                });
                ObservableScopeInvalidator.m27639attachToScopeimpl(mutableState);
            }
        }), z13, list3, list4, interfaceC11122i0);
    }

    private static final void debugLog(InterfaceC9529a interfaceC9529a) {
    }
}
