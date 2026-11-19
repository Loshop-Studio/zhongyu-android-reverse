package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.gestures.snapping.SnapPositionKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.p012ui.Alignment;
import androidx.compose.p012ui.layout.MeasureResult;
import androidx.compose.p012ui.layout.Placeable;
import androidx.compose.p012ui.unit.Constraints;
import androidx.compose.p012ui.unit.ConstraintsKt;
import androidx.compose.p012ui.unit.Density;
import androidx.compose.p012ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000¬\u0001\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aH\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002\u001aH\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0015H\u0002\u001a@\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0015H\u0002\u001a\u0017\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082\b\u001a\u008c\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e*\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0002\u001aj\u0010\u0014\u001a\u00020\u0004*\u00020\u001f2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010(\u001a\u00020)2\b\u00107\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020<2\u0006\u0010*\u001a\u00020+2\u0006\u0010/\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001añ\u0001\u0010?\u001a\u00020@*\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u00103\u001a\u0002042\u0006\u0010A\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00062\u0006\u0010D\u001a\u0002022\u0006\u0010(\u001a\u00020)2\b\u00109\u001a\u0004\u0018\u00010:2\b\u00107\u001a\u0004\u0018\u0001082\u0006\u0010*\u001a\u00020+2\u0006\u00105\u001a\u0002062\u0006\u0010/\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2/\u0010I\u001a+\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u00190\u0015¢\u0006\u0002\bL\u0012\u0004\u0012\u00020M0JH\u0000ø\u0001\u0000¢\u0006\u0004\bN\u0010O\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006P"}, m13413d2 = {"MaxPageOffset", "", "MinPageOffset", "calculateNewCurrentPage", "Landroidx/compose/foundation/pager/MeasuredPage;", "viewportSize", "", "visiblePagesInfo", "", "beforeContentPadding", "afterContentPadding", "itemSize", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "pageCount", "createPagesAfterList", "currentLastPage", "pagesCount", "beyondViewportPageCount", "pinnedPages", "getAndMeasure", "Lkotlin/Function1;", "createPagesBeforeList", "currentFirstPage", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "calculatePagesOffsets", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "pages", "extraPagesBefore", "extraPagesAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "pagesScrollOffset", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "reverseLayout", "", "density", "Landroidx/compose/ui/unit/Density;", "spaceBetweenPages", "pageAvailableSize", "index", "childConstraints", "Landroidx/compose/ui/unit/Constraints;", "pagerItemProvider", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "visualPageOffset", "Landroidx/compose/ui/unit/IntOffset;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getAndMeasure-SGf7dI0", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZI)Landroidx/compose/foundation/pager/MeasuredPage;", "measurePager", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "mainAxisAvailableSize", "currentPage", "currentPageOffset", "constraints", "placementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "layout", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measurePager-bmk8ZPk", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;IIIIIIJLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZJIILjava/util/List;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/pager/PagerMeasureResult;", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPagerMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,702:1\n698#1,4:713\n698#1,4:717\n698#1,4:721\n698#1,4:725\n698#1,4:729\n698#1,4:733\n698#1,4:784\n96#2,5:703\n96#2,5:708\n96#2,5:737\n50#2,5:813\n96#2,5:818\n34#3,6:742\n34#3,6:748\n230#3,3:754\n34#3,6:757\n233#3:763\n230#3,3:764\n34#3,6:767\n233#3:773\n230#3,3:774\n34#3,6:777\n233#3:783\n34#3,6:788\n34#3,6:794\n168#3,13:800\n34#3,6:824\n34#3,6:830\n34#3,6:836\n1#4:823\n*S KotlinDebug\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n*L\n71#1:713,4\n139#1:717,4\n160#1:721,4\n181#1:725,4\n220#1:729,4\n244#1:733,4\n456#1:784,4\n67#1:703,5\n68#1:708,5\n301#1:737,5\n626#1:813,5\n634#1:818,5\n348#1:742,6\n373#1:748,6\n410#1:754,3\n410#1:757,6\n410#1:763\n417#1:764,3\n417#1:767,6\n417#1:773\n421#1:774,3\n421#1:777,6\n421#1:783\n516#1:788,6\n541#1:794,6\n560#1:800,13\n672#1:824,6\n679#1:830,6\n685#1:836,6\n*E\n"})
/* loaded from: classes.dex */
public final class PagerMeasureKt {
    public static final float MaxPageOffset = 0.5f;
    public static final float MinPageOffset = -0.5f;

    private static final MeasuredPage calculateNewCurrentPage(int i9, List<MeasuredPage> list, int i10, int i11, int i12, SnapPosition snapPosition, int i13) {
        MeasuredPage measuredPage;
        if (list.isEmpty()) {
            measuredPage = null;
        } else {
            MeasuredPage measuredPage2 = list.get(0);
            MeasuredPage measuredPage3 = measuredPage2;
            float f10 = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(i9, i10, i11, i12, measuredPage3.getOffset(), measuredPage3.getIndex(), snapPosition, i13));
            int lastIndex = CollectionsKt.getLastIndex(list);
            if (1 <= lastIndex) {
                int i14 = 1;
                while (true) {
                    MeasuredPage measuredPage4 = list.get(i14);
                    MeasuredPage measuredPage5 = measuredPage4;
                    float f11 = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(i9, i10, i11, i12, measuredPage5.getOffset(), measuredPage5.getIndex(), snapPosition, i13));
                    if (Float.compare(f10, f11) < 0) {
                        f10 = f11;
                        measuredPage2 = measuredPage4;
                    }
                    if (i14 == lastIndex) {
                        break;
                    }
                    i14++;
                }
            }
            measuredPage = measuredPage2;
        }
        return measuredPage;
    }

    private static final List<MeasuredPage> calculatePagesOffsets(LazyLayoutMeasureScope lazyLayoutMeasureScope, List<MeasuredPage> list, List<MeasuredPage> list2, List<MeasuredPage> list3, int i9, int i10, int i11, int i12, int i13, Orientation orientation, boolean z9, Density density, int i14, int i15) {
        int i16 = i13;
        int i17 = i15 + i14;
        int i18 = orientation == Orientation.Vertical ? i10 : i9;
        int i19 = 0;
        boolean z10 = i11 < Math.min(i18, i12);
        if (z10) {
            if (!(i16 == 0)) {
                InlineClassHelperKt.throwIllegalStateException("non-zero pagesScrollOffset=" + i16);
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z10) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                InlineClassHelperKt.throwIllegalArgumentException("No extra pages");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i19 < size) {
                iArr[i19] = i15;
                i19++;
            }
            int[] iArr2 = new int[size];
            Arrangement.HorizontalOrVertical horizontalOrVerticalM17998spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m17998spacedBy0680j_4(lazyLayoutMeasureScope.mo17762toDpu2uoSUM(i14));
            if (orientation == Orientation.Vertical) {
                horizontalOrVerticalM17998spacedBy0680j_4.arrange(density, i18, iArr, iArr2);
            } else {
                horizontalOrVerticalM17998spacedBy0680j_4.arrange(density, i18, iArr, LayoutDirection.Ltr, iArr2);
            }
            IntProgression indices = ArraysKt.getIndices(iArr2);
            if (z9) {
                indices = RangesKt.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int size2 = iArr2[first];
                    MeasuredPage measuredPage = list.get(calculatePagesOffsets$reverseAware(first, z9, size));
                    if (z9) {
                        size2 = (i18 - size2) - measuredPage.getSize();
                    }
                    measuredPage.position(size2, i9, i10);
                    arrayList.add(measuredPage);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size();
            int i20 = i16;
            for (int i21 = 0; i21 < size3; i21++) {
                MeasuredPage measuredPage2 = list2.get(i21);
                i20 -= i17;
                measuredPage2.position(i20, i9, i10);
                arrayList.add(measuredPage2);
            }
            int size4 = list.size();
            for (int i22 = 0; i22 < size4; i22++) {
                MeasuredPage measuredPage3 = list.get(i22);
                measuredPage3.position(i16, i9, i10);
                arrayList.add(measuredPage3);
                i16 += i17;
            }
            int size5 = list3.size();
            while (i19 < size5) {
                MeasuredPage measuredPage4 = list3.get(i19);
                measuredPage4.position(i16, i9, i10);
                arrayList.add(measuredPage4);
                i16 += i17;
                i19++;
            }
        }
        return arrayList;
    }

    private static final int calculatePagesOffsets$reverseAware(int i9, boolean z9, int i10) {
        return !z9 ? i9 : (i10 - i9) - 1;
    }

    private static final List<MeasuredPage> createPagesAfterList(int i9, int i10, int i11, List<Integer> list, Function1<? super Integer, MeasuredPage> function1) {
        int iMin = Math.min(i11 + i9, i10 - 1);
        int i12 = i9 + 1;
        ArrayList arrayList = null;
        if (i12 <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i12)));
                if (i12 == iMin) {
                    break;
                }
                i12++;
            }
        }
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            int iIntValue = list.get(i13).intValue();
            if (iMin + 1 <= iIntValue && iIntValue < i10) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<MeasuredPage> createPagesBeforeList(int i9, int i10, List<Integer> list, Function1<? super Integer, MeasuredPage> function1) {
        int iMax = Math.max(0, i9 - i10);
        int i11 = i9 - 1;
        ArrayList arrayList = null;
        if (iMax <= i11) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i11)));
                if (i11 == iMax) {
                    break;
                }
                i11--;
            }
        }
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            int iIntValue = list.get(i12).intValue();
            if (iIntValue < iMax) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final void debugLog(Function0<String> function0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAndMeasure-SGf7dI0, reason: not valid java name */
    public static final MeasuredPage m18364getAndMeasureSGf7dI0(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i9, long j9, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j10, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z9, int i10) {
        return new MeasuredPage(i9, i10, lazyLayoutMeasureScope.mo18288measure0kLqBqw(i9, j9), j10, pagerLazyLayoutItemProvider.getKey(i9), orientation, horizontal, vertical, layoutDirection, z9, null);
    }

    /* renamed from: measurePager-bmk8ZPk, reason: not valid java name */
    public static final PagerMeasureResult m18365measurePagerbmk8ZPk(final LazyLayoutMeasureScope lazyLayoutMeasureScope, int i9, final PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i10, int i11, int i12, int i13, int i14, int i15, long j9, final Orientation orientation, final Alignment.Vertical vertical, final Alignment.Horizontal horizontal, final boolean z9, final long j10, final int i16, int i17, List<Integer> list, SnapPosition snapPosition, final MutableState<Unit> mutableState, CoroutineScope coroutineScope, Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> function3) {
        int i18;
        boolean z10;
        int iMax;
        int i19;
        int i20;
        int i21;
        List<MeasuredPage> arrayList;
        List arrayList2;
        List arrayList3;
        int i22;
        if (!(i11 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("negative beforeContentPadding");
        }
        if (!(i12 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("negative afterContentPadding");
        }
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i16 + i13, 0);
        if (i9 <= 0) {
            return new PagerMeasureResult(CollectionsKt.emptyList(), i16, i13, i12, orientation, -i11, i10 + i12, false, i17, null, null, 0.0f, 0, false, snapPosition, function3.invoke(Integer.valueOf(Constraints.m23949getMinWidthimpl(j9)), Integer.valueOf(Constraints.m23948getMinHeightimpl(j9)), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }), false, null, null, coroutineScope, 393216, null);
        }
        Orientation orientation2 = orientation;
        Orientation orientation3 = Orientation.Vertical;
        final long jConstraints$default = ConstraintsKt.Constraints$default(0, orientation2 == orientation3 ? Constraints.m23947getMaxWidthimpl(j9) : i16, 0, orientation2 != orientation3 ? Constraints.m23946getMaxHeightimpl(j9) : i16, 5, null);
        int i23 = i14;
        int i24 = i15;
        while (i23 > 0 && i24 > 0) {
            i23--;
            i24 -= iCoerceAtLeast;
        }
        int i25 = i24 * (-1);
        if (i23 >= i9) {
            i23 = i9 - 1;
            i25 = 0;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i26 = -i11;
        int i27 = (i13 < 0 ? i13 : 0) + i26;
        int i28 = i25 + i27;
        int iMax2 = 0;
        while (i28 < 0 && i23 > 0) {
            int i29 = i23 - 1;
            MeasuredPage measuredPageM18364getAndMeasureSGf7dI0 = m18364getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i29, jConstraints$default, pagerLazyLayoutItemProvider, j10, orientation2, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z9, i16);
            arrayDeque.add(0, measuredPageM18364getAndMeasureSGf7dI0);
            iMax2 = Math.max(iMax2, measuredPageM18364getAndMeasureSGf7dI0.getCrossAxisSize());
            i28 += iCoerceAtLeast;
            i27 = i27;
            i23 = i29;
            orientation2 = orientation;
        }
        int i30 = i27;
        int i31 = iMax2;
        if (i28 < i30) {
            i28 = i30;
        }
        int i32 = i28 - i30;
        int i33 = i10 + i12;
        int i34 = i23;
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast(i33, 0);
        int i35 = -i32;
        int i36 = i34;
        int i37 = 0;
        boolean z11 = false;
        while (i37 < arrayDeque.size()) {
            if (i35 >= iCoerceAtLeast2) {
                arrayDeque.remove(i37);
                z11 = true;
            } else {
                i36++;
                i35 += iCoerceAtLeast;
                i37++;
            }
        }
        int iMax3 = i31;
        int i38 = i36;
        boolean z12 = z11;
        int i39 = i32;
        while (i38 < i9 && (i35 < iCoerceAtLeast2 || i35 <= 0 || arrayDeque.isEmpty())) {
            int i40 = iCoerceAtLeast2;
            int i41 = i38;
            MeasuredPage measuredPageM18364getAndMeasureSGf7dI02 = m18364getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i41, jConstraints$default, pagerLazyLayoutItemProvider, j10, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z9, i16);
            int i42 = i39;
            int i43 = i9 - 1;
            i35 += i41 == i43 ? i16 : iCoerceAtLeast;
            if (i35 > i30 || i41 == i43) {
                iMax3 = Math.max(iMax3, measuredPageM18364getAndMeasureSGf7dI02.getCrossAxisSize());
                arrayDeque.add(measuredPageM18364getAndMeasureSGf7dI02);
                i22 = i34;
                i39 = i42;
            } else {
                i22 = i41 + 1;
                i39 = i42 - iCoerceAtLeast;
                z12 = true;
            }
            i38 = i41 + 1;
            i34 = i22;
            iCoerceAtLeast2 = i40;
        }
        int i44 = i39;
        if (i35 < i10) {
            int i45 = i10 - i35;
            i19 = i44 - i45;
            i35 += i45;
            iMax = iMax3;
            i20 = i34;
            while (i19 < i11 && i20 > 0) {
                int i46 = i20 - 1;
                MeasuredPage measuredPageM18364getAndMeasureSGf7dI03 = m18364getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i46, jConstraints$default, pagerLazyLayoutItemProvider, j10, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z9, i16);
                arrayDeque.add(0, measuredPageM18364getAndMeasureSGf7dI03);
                iMax = Math.max(iMax, measuredPageM18364getAndMeasureSGf7dI03.getCrossAxisSize());
                i19 += iCoerceAtLeast;
                i38 = i38;
                i20 = i46;
            }
            i18 = i38;
            z10 = false;
            if (i19 < 0) {
                i35 += i19;
                i19 = 0;
            }
        } else {
            i18 = i38;
            z10 = false;
            iMax = iMax3;
            i19 = i44;
            i20 = i34;
        }
        if (!(i19 >= 0 ? true : z10)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid currentFirstPageScrollOffset");
        }
        int i47 = iMax;
        int i48 = -i19;
        MeasuredPage measuredPage = (MeasuredPage) arrayDeque.first();
        if (i11 > 0 || i13 < 0) {
            int size = arrayDeque.size();
            i21 = i48;
            int i49 = 0;
            while (i49 < size && i19 != 0 && iCoerceAtLeast <= i19 && i49 != CollectionsKt.getLastIndex(arrayDeque)) {
                i19 -= iCoerceAtLeast;
                i49++;
                measuredPage = (MeasuredPage) arrayDeque.get(i49);
            }
        } else {
            i21 = i48;
        }
        int i50 = i19;
        MeasuredPage measuredPage2 = measuredPage;
        List<MeasuredPage> listCreatePagesBeforeList = createPagesBeforeList(i20, i17, list, new Function1<Integer, MeasuredPage>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesBefore$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ MeasuredPage invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final MeasuredPage invoke(int i51) {
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                return PagerMeasureKt.m18364getAndMeasureSGf7dI0(lazyLayoutMeasureScope2, i51, jConstraints$default, pagerLazyLayoutItemProvider, j10, orientation, horizontal, vertical, lazyLayoutMeasureScope2.getLayoutDirection(), z9, i16);
            }
        });
        int size2 = listCreatePagesBeforeList.size();
        int iMax4 = i47;
        int i51 = 0;
        while (i51 < size2) {
            iMax4 = Math.max(iMax4, listCreatePagesBeforeList.get(i51).getCrossAxisSize());
            i51++;
            listCreatePagesBeforeList = listCreatePagesBeforeList;
        }
        List<MeasuredPage> list2 = listCreatePagesBeforeList;
        List<MeasuredPage> listCreatePagesAfterList = createPagesAfterList(((MeasuredPage) arrayDeque.last()).getIndex(), i9, i17, list, new Function1<Integer, MeasuredPage>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesAfter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ MeasuredPage invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final MeasuredPage invoke(int i52) {
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                return PagerMeasureKt.m18364getAndMeasureSGf7dI0(lazyLayoutMeasureScope2, i52, jConstraints$default, pagerLazyLayoutItemProvider, j10, orientation, horizontal, vertical, lazyLayoutMeasureScope2.getLayoutDirection(), z9, i16);
            }
        });
        int size3 = listCreatePagesAfterList.size();
        for (int i52 = 0; i52 < size3; i52++) {
            iMax4 = Math.max(iMax4, listCreatePagesAfterList.get(i52).getCrossAxisSize());
        }
        boolean z13 = Intrinsics.areEqual(measuredPage2, arrayDeque.first()) && list2.isEmpty() && listCreatePagesAfterList.isEmpty();
        Orientation orientation4 = Orientation.Vertical;
        int iM23964constrainWidthK40F9xA = ConstraintsKt.m23964constrainWidthK40F9xA(j9, orientation == orientation4 ? iMax4 : i35);
        if (orientation == orientation4) {
            iMax4 = i35;
        }
        int iM23963constrainHeightK40F9xA = ConstraintsKt.m23963constrainHeightK40F9xA(j9, iMax4);
        int i53 = i18;
        int i54 = i35;
        final List<MeasuredPage> listCalculatePagesOffsets = calculatePagesOffsets(lazyLayoutMeasureScope, arrayDeque, list2, listCreatePagesAfterList, iM23964constrainWidthK40F9xA, iM23963constrainHeightK40F9xA, i54, i10, i21, orientation, z9, lazyLayoutMeasureScope, i13, i16);
        if (z13) {
            arrayList = listCalculatePagesOffsets;
        } else {
            arrayList = new ArrayList<>(listCalculatePagesOffsets.size());
            int size4 = listCalculatePagesOffsets.size();
            int i55 = 0;
            while (i55 < size4) {
                MeasuredPage measuredPage3 = listCalculatePagesOffsets.get(i55);
                MeasuredPage measuredPage4 = measuredPage3;
                MeasuredPage measuredPage5 = measuredPage2;
                int i56 = i53;
                if (measuredPage4.getIndex() >= ((MeasuredPage) arrayDeque.first()).getIndex() && measuredPage4.getIndex() <= ((MeasuredPage) arrayDeque.last()).getIndex()) {
                    arrayList.add(measuredPage3);
                }
                i55++;
                i53 = i56;
                measuredPage2 = measuredPage5;
            }
        }
        MeasuredPage measuredPage6 = measuredPage2;
        int i57 = i53;
        if (list2.isEmpty()) {
            arrayList2 = CollectionsKt.emptyList();
        } else {
            arrayList2 = new ArrayList(listCalculatePagesOffsets.size());
            int size5 = listCalculatePagesOffsets.size();
            for (int i58 = 0; i58 < size5; i58++) {
                MeasuredPage measuredPage7 = listCalculatePagesOffsets.get(i58);
                if (measuredPage7.getIndex() < ((MeasuredPage) arrayDeque.first()).getIndex()) {
                    arrayList2.add(measuredPage7);
                }
            }
        }
        List list3 = arrayList2;
        if (listCreatePagesAfterList.isEmpty()) {
            arrayList3 = CollectionsKt.emptyList();
        } else {
            arrayList3 = new ArrayList(listCalculatePagesOffsets.size());
            int size6 = listCalculatePagesOffsets.size();
            for (int i59 = 0; i59 < size6; i59++) {
                MeasuredPage measuredPage8 = listCalculatePagesOffsets.get(i59);
                if (measuredPage8.getIndex() > ((MeasuredPage) arrayDeque.last()).getIndex()) {
                    arrayList3.add(measuredPage8);
                }
            }
        }
        List list4 = arrayList3;
        MeasuredPage measuredPageCalculateNewCurrentPage = calculateNewCurrentPage(i10 + i11 + i12, arrayList, i11, i12, iCoerceAtLeast, snapPosition, i9);
        return new PagerMeasureResult(arrayList, i16, i13, i12, orientation, i26, i33, z9, i17, measuredPage6, measuredPageCalculateNewCurrentPage, iCoerceAtLeast == 0 ? 0.0f : RangesKt.coerceIn((snapPosition.position(r0, i16, i11, i12, measuredPageCalculateNewCurrentPage != null ? measuredPageCalculateNewCurrentPage.getIndex() : 0, i9) - (measuredPageCalculateNewCurrentPage != null ? measuredPageCalculateNewCurrentPage.getOffset() : 0)) / iCoerceAtLeast, -0.5f, 0.5f), i50, i57 < i9 || i54 > i10, snapPosition, function3.invoke(Integer.valueOf(iM23964constrainWidthK40F9xA), Integer.valueOf(iM23963constrainHeightK40F9xA), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$14
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                final List<MeasuredPage> list5 = listCalculatePagesOffsets;
                placementScope.withMotionFrameOfReferencePlacement(new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$14.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope2) {
                        invoke2(placementScope2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope2) {
                        List<MeasuredPage> list6 = list5;
                        int size7 = list6.size();
                        for (int i60 = 0; i60 < size7; i60++) {
                            list6.get(i60).place(placementScope2);
                        }
                    }
                });
                ObservableScopeInvalidator.m18293attachToScopeimpl(mutableState);
            }
        }), z12, list3, list4, coroutineScope);
    }
}
