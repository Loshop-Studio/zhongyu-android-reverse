package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.gestures.snapping.SnapPositionKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.p009ui.Alignment;
import androidx.compose.p009ui.layout.MeasureResult;
import androidx.compose.p009ui.layout.Placeable;
import androidx.compose.p009ui.unit.Constraints;
import androidx.compose.p009ui.unit.ConstraintsKt;
import androidx.compose.p009ui.unit.Density;
import androidx.compose.p009ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableState;
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

@Metadata(m7879d1 = {"\u0000¬\u0001\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aH\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002\u001aH\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0015H\u0002\u001a@\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0015H\u0002\u001a\u0017\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082\b\u001a\u008c\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e*\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0002\u001aj\u0010\u0014\u001a\u00020\u0004*\u00020\u001f2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010(\u001a\u00020)2\b\u00107\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020<2\u0006\u0010*\u001a\u00020+2\u0006\u0010/\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001añ\u0001\u0010?\u001a\u00020@*\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u00103\u001a\u0002042\u0006\u0010A\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00062\u0006\u0010D\u001a\u0002022\u0006\u0010(\u001a\u00020)2\b\u00109\u001a\u0004\u0018\u00010:2\b\u00107\u001a\u0004\u0018\u0001082\u0006\u0010*\u001a\u00020+2\u0006\u00105\u001a\u0002062\u0006\u0010/\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2/\u0010I\u001a+\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u00190\u0015¢\u0006\u0002\bL\u0012\u0004\u0012\u00020M0JH\u0000ø\u0001\u0000¢\u0006\u0004\bN\u0010O\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006P"}, m7880d2 = {"MaxPageOffset", "", "MinPageOffset", "calculateNewCurrentPage", "Landroidx/compose/foundation/pager/MeasuredPage;", "viewportSize", "", "visiblePagesInfo", "", "beforeContentPadding", "afterContentPadding", "itemSize", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "pageCount", "createPagesAfterList", "currentLastPage", "pagesCount", "beyondViewportPageCount", "pinnedPages", "getAndMeasure", "Lkotlin/Function1;", "createPagesBeforeList", "currentFirstPage", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "calculatePagesOffsets", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "pages", "extraPagesBefore", "extraPagesAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "pagesScrollOffset", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "reverseLayout", "", "density", "Landroidx/compose/ui/unit/Density;", "spaceBetweenPages", "pageAvailableSize", "index", "childConstraints", "Landroidx/compose/ui/unit/Constraints;", "pagerItemProvider", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "visualPageOffset", "Landroidx/compose/ui/unit/IntOffset;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getAndMeasure-SGf7dI0", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZI)Landroidx/compose/foundation/pager/MeasuredPage;", "measurePager", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "mainAxisAvailableSize", "currentPage", "currentPageOffset", "constraints", "placementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "layout", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measurePager-bmk8ZPk", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;IIIIIIJLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZJIILjava/util/List;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/pager/PagerMeasureResult;", "foundation_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nPagerMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,702:1\n698#1,4:713\n698#1,4:717\n698#1,4:721\n698#1,4:725\n698#1,4:729\n698#1,4:733\n698#1,4:784\n96#2,5:703\n96#2,5:708\n96#2,5:737\n50#2,5:813\n96#2,5:818\n34#3,6:742\n34#3,6:748\n230#3,3:754\n34#3,6:757\n233#3:763\n230#3,3:764\n34#3,6:767\n233#3:773\n230#3,3:774\n34#3,6:777\n233#3:783\n34#3,6:788\n34#3,6:794\n168#3,13:800\n34#3,6:824\n34#3,6:830\n34#3,6:836\n1#4:823\n*S KotlinDebug\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n*L\n71#1:713,4\n139#1:717,4\n160#1:721,4\n181#1:725,4\n220#1:729,4\n244#1:733,4\n456#1:784,4\n67#1:703,5\n68#1:708,5\n301#1:737,5\n626#1:813,5\n634#1:818,5\n348#1:742,6\n373#1:748,6\n410#1:754,3\n410#1:757,6\n410#1:763\n417#1:764,3\n417#1:767,6\n417#1:773\n421#1:774,3\n421#1:777,6\n421#1:783\n516#1:788,6\n541#1:794,6\n560#1:800,13\n672#1:824,6\n679#1:830,6\n685#1:836,6\n*E\n"})
/* loaded from: classes.dex */
public final class PagerMeasureKt {
    public static final float MaxPageOffset = 0.5f;
    public static final float MinPageOffset = -0.5f;

    private static final MeasuredPage calculateNewCurrentPage(int i6, List<MeasuredPage> list, int i7, int i8, int i9, SnapPosition snapPosition, int i10) {
        MeasuredPage measuredPage;
        if (list.isEmpty()) {
            measuredPage = null;
        } else {
            MeasuredPage measuredPage2 = list.get(0);
            MeasuredPage measuredPage3 = measuredPage2;
            float f6 = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(i6, i7, i8, i9, measuredPage3.getOffset(), measuredPage3.getIndex(), snapPosition, i10));
            int lastIndex = CollectionsKt.getLastIndex(list);
            if (1 <= lastIndex) {
                int i11 = 1;
                while (true) {
                    MeasuredPage measuredPage4 = list.get(i11);
                    MeasuredPage measuredPage5 = measuredPage4;
                    float f7 = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(i6, i7, i8, i9, measuredPage5.getOffset(), measuredPage5.getIndex(), snapPosition, i10));
                    if (Float.compare(f6, f7) < 0) {
                        f6 = f7;
                        measuredPage2 = measuredPage4;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
            measuredPage = measuredPage2;
        }
        return measuredPage;
    }

    private static final List<MeasuredPage> calculatePagesOffsets(LazyLayoutMeasureScope lazyLayoutMeasureScope, List<MeasuredPage> list, List<MeasuredPage> list2, List<MeasuredPage> list3, int i6, int i7, int i8, int i9, int i10, Orientation orientation, boolean z6, Density density, int i11, int i12) {
        int i13 = i10;
        int i14 = i12 + i11;
        int i15 = orientation == Orientation.Vertical ? i7 : i6;
        int i16 = 0;
        boolean z7 = i8 < Math.min(i15, i9);
        if (z7) {
            if (!(i13 == 0)) {
                InlineClassHelperKt.throwIllegalStateException("non-zero pagesScrollOffset=" + i13);
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z7) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                InlineClassHelperKt.throwIllegalArgumentException("No extra pages");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i16 < size) {
                iArr[i16] = i12;
                i16++;
            }
            int[] iArr2 = new int[size];
            Arrangement.HorizontalOrVertical horizontalOrVerticalM10488spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m10488spacedBy0680j_4(lazyLayoutMeasureScope.mo10252toDpu2uoSUM(i11));
            if (orientation == Orientation.Vertical) {
                horizontalOrVerticalM10488spacedBy0680j_4.arrange(density, i15, iArr, iArr2);
            } else {
                horizontalOrVerticalM10488spacedBy0680j_4.arrange(density, i15, iArr, LayoutDirection.Ltr, iArr2);
            }
            IntProgression indices = ArraysKt.getIndices(iArr2);
            if (z6) {
                indices = RangesKt.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int size2 = iArr2[first];
                    MeasuredPage measuredPage = list.get(calculatePagesOffsets$reverseAware(first, z6, size));
                    if (z6) {
                        size2 = (i15 - size2) - measuredPage.getSize();
                    }
                    measuredPage.position(size2, i6, i7);
                    arrayList.add(measuredPage);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size();
            int i17 = i13;
            for (int i18 = 0; i18 < size3; i18++) {
                MeasuredPage measuredPage2 = list2.get(i18);
                i17 -= i14;
                measuredPage2.position(i17, i6, i7);
                arrayList.add(measuredPage2);
            }
            int size4 = list.size();
            for (int i19 = 0; i19 < size4; i19++) {
                MeasuredPage measuredPage3 = list.get(i19);
                measuredPage3.position(i13, i6, i7);
                arrayList.add(measuredPage3);
                i13 += i14;
            }
            int size5 = list3.size();
            while (i16 < size5) {
                MeasuredPage measuredPage4 = list3.get(i16);
                measuredPage4.position(i13, i6, i7);
                arrayList.add(measuredPage4);
                i13 += i14;
                i16++;
            }
        }
        return arrayList;
    }

    private static final int calculatePagesOffsets$reverseAware(int i6, boolean z6, int i7) {
        return !z6 ? i6 : (i7 - i6) - 1;
    }

    private static final List<MeasuredPage> createPagesAfterList(int i6, int i7, int i8, List<Integer> list, Function1<? super Integer, MeasuredPage> function1) {
        int iMin = Math.min(i8 + i6, i7 - 1);
        int i9 = i6 + 1;
        ArrayList arrayList = null;
        if (i9 <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i9)));
                if (i9 == iMin) {
                    break;
                }
                i9++;
            }
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iIntValue = list.get(i10).intValue();
            if (iMin + 1 <= iIntValue && iIntValue < i7) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<MeasuredPage> createPagesBeforeList(int i6, int i7, List<Integer> list, Function1<? super Integer, MeasuredPage> function1) {
        int iMax = Math.max(0, i6 - i7);
        int i8 = i6 - 1;
        ArrayList arrayList = null;
        if (iMax <= i8) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i8)));
                if (i8 == iMax) {
                    break;
                }
                i8--;
            }
        }
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            int iIntValue = list.get(i9).intValue();
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
    public static final MeasuredPage m10854getAndMeasureSGf7dI0(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i6, long j6, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j7, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z6, int i7) {
        return new MeasuredPage(i6, i7, lazyLayoutMeasureScope.mo10778measure0kLqBqw(i6, j6), j7, pagerLazyLayoutItemProvider.getKey(i6), orientation, horizontal, vertical, layoutDirection, z6, null);
    }

    /* renamed from: measurePager-bmk8ZPk, reason: not valid java name */
    public static final PagerMeasureResult m10855measurePagerbmk8ZPk(final LazyLayoutMeasureScope lazyLayoutMeasureScope, int i6, final PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i7, int i8, int i9, int i10, int i11, int i12, long j6, final Orientation orientation, final Alignment.Vertical vertical, final Alignment.Horizontal horizontal, final boolean z6, final long j7, final int i13, int i14, List<Integer> list, SnapPosition snapPosition, final MutableState<Unit> mutableState, CoroutineScope coroutineScope, Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> function3) {
        int i15;
        boolean z7;
        int iMax;
        int i16;
        int i17;
        int i18;
        List<MeasuredPage> arrayList;
        List arrayList2;
        List arrayList3;
        int i19;
        if (!(i8 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("negative beforeContentPadding");
        }
        if (!(i9 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("negative afterContentPadding");
        }
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i13 + i10, 0);
        if (i6 <= 0) {
            return new PagerMeasureResult(CollectionsKt.emptyList(), i13, i10, i9, orientation, -i8, i7 + i9, false, i14, null, null, 0.0f, 0, false, snapPosition, function3.invoke(Integer.valueOf(Constraints.m16439getMinWidthimpl(j6)), Integer.valueOf(Constraints.m16438getMinHeightimpl(j6)), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$4
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
        final long jConstraints$default = ConstraintsKt.Constraints$default(0, orientation2 == orientation3 ? Constraints.m16437getMaxWidthimpl(j6) : i13, 0, orientation2 != orientation3 ? Constraints.m16436getMaxHeightimpl(j6) : i13, 5, null);
        int i20 = i11;
        int i21 = i12;
        while (i20 > 0 && i21 > 0) {
            i20--;
            i21 -= iCoerceAtLeast;
        }
        int i22 = i21 * (-1);
        if (i20 >= i6) {
            i20 = i6 - 1;
            i22 = 0;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i23 = -i8;
        int i24 = (i10 < 0 ? i10 : 0) + i23;
        int i25 = i22 + i24;
        int iMax2 = 0;
        while (i25 < 0 && i20 > 0) {
            int i26 = i20 - 1;
            MeasuredPage measuredPageM10854getAndMeasureSGf7dI0 = m10854getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i26, jConstraints$default, pagerLazyLayoutItemProvider, j7, orientation2, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z6, i13);
            arrayDeque.add(0, measuredPageM10854getAndMeasureSGf7dI0);
            iMax2 = Math.max(iMax2, measuredPageM10854getAndMeasureSGf7dI0.getCrossAxisSize());
            i25 += iCoerceAtLeast;
            i24 = i24;
            i20 = i26;
            orientation2 = orientation;
        }
        int i27 = i24;
        int i28 = iMax2;
        if (i25 < i27) {
            i25 = i27;
        }
        int i29 = i25 - i27;
        int i30 = i7 + i9;
        int i31 = i20;
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast(i30, 0);
        int i32 = -i29;
        int i33 = i31;
        int i34 = 0;
        boolean z8 = false;
        while (i34 < arrayDeque.size()) {
            if (i32 >= iCoerceAtLeast2) {
                arrayDeque.remove(i34);
                z8 = true;
            } else {
                i33++;
                i32 += iCoerceAtLeast;
                i34++;
            }
        }
        int iMax3 = i28;
        int i35 = i33;
        boolean z9 = z8;
        int i36 = i29;
        while (i35 < i6 && (i32 < iCoerceAtLeast2 || i32 <= 0 || arrayDeque.isEmpty())) {
            int i37 = iCoerceAtLeast2;
            int i38 = i35;
            MeasuredPage measuredPageM10854getAndMeasureSGf7dI02 = m10854getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i38, jConstraints$default, pagerLazyLayoutItemProvider, j7, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z6, i13);
            int i39 = i36;
            int i40 = i6 - 1;
            i32 += i38 == i40 ? i13 : iCoerceAtLeast;
            if (i32 > i27 || i38 == i40) {
                iMax3 = Math.max(iMax3, measuredPageM10854getAndMeasureSGf7dI02.getCrossAxisSize());
                arrayDeque.add(measuredPageM10854getAndMeasureSGf7dI02);
                i19 = i31;
                i36 = i39;
            } else {
                i19 = i38 + 1;
                i36 = i39 - iCoerceAtLeast;
                z9 = true;
            }
            i35 = i38 + 1;
            i31 = i19;
            iCoerceAtLeast2 = i37;
        }
        int i41 = i36;
        if (i32 < i7) {
            int i42 = i7 - i32;
            i16 = i41 - i42;
            i32 += i42;
            iMax = iMax3;
            i17 = i31;
            while (i16 < i8 && i17 > 0) {
                int i43 = i17 - 1;
                MeasuredPage measuredPageM10854getAndMeasureSGf7dI03 = m10854getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i43, jConstraints$default, pagerLazyLayoutItemProvider, j7, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z6, i13);
                arrayDeque.add(0, measuredPageM10854getAndMeasureSGf7dI03);
                iMax = Math.max(iMax, measuredPageM10854getAndMeasureSGf7dI03.getCrossAxisSize());
                i16 += iCoerceAtLeast;
                i35 = i35;
                i17 = i43;
            }
            i15 = i35;
            z7 = false;
            if (i16 < 0) {
                i32 += i16;
                i16 = 0;
            }
        } else {
            i15 = i35;
            z7 = false;
            iMax = iMax3;
            i16 = i41;
            i17 = i31;
        }
        if (!(i16 >= 0 ? true : z7)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid currentFirstPageScrollOffset");
        }
        int i44 = iMax;
        int i45 = -i16;
        MeasuredPage measuredPage = (MeasuredPage) arrayDeque.first();
        if (i8 > 0 || i10 < 0) {
            int size = arrayDeque.size();
            i18 = i45;
            int i46 = 0;
            while (i46 < size && i16 != 0 && iCoerceAtLeast <= i16 && i46 != CollectionsKt.getLastIndex(arrayDeque)) {
                i16 -= iCoerceAtLeast;
                i46++;
                measuredPage = (MeasuredPage) arrayDeque.get(i46);
            }
        } else {
            i18 = i45;
        }
        int i47 = i16;
        MeasuredPage measuredPage2 = measuredPage;
        List<MeasuredPage> listCreatePagesBeforeList = createPagesBeforeList(i17, i14, list, new Function1<Integer, MeasuredPage>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesBefore$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ MeasuredPage invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final MeasuredPage invoke(int i48) {
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                return PagerMeasureKt.m10854getAndMeasureSGf7dI0(lazyLayoutMeasureScope2, i48, jConstraints$default, pagerLazyLayoutItemProvider, j7, orientation, horizontal, vertical, lazyLayoutMeasureScope2.getLayoutDirection(), z6, i13);
            }
        });
        int size2 = listCreatePagesBeforeList.size();
        int iMax4 = i44;
        int i48 = 0;
        while (i48 < size2) {
            iMax4 = Math.max(iMax4, listCreatePagesBeforeList.get(i48).getCrossAxisSize());
            i48++;
            listCreatePagesBeforeList = listCreatePagesBeforeList;
        }
        List<MeasuredPage> list2 = listCreatePagesBeforeList;
        List<MeasuredPage> listCreatePagesAfterList = createPagesAfterList(((MeasuredPage) arrayDeque.last()).getIndex(), i6, i14, list, new Function1<Integer, MeasuredPage>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesAfter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ MeasuredPage invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final MeasuredPage invoke(int i49) {
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                return PagerMeasureKt.m10854getAndMeasureSGf7dI0(lazyLayoutMeasureScope2, i49, jConstraints$default, pagerLazyLayoutItemProvider, j7, orientation, horizontal, vertical, lazyLayoutMeasureScope2.getLayoutDirection(), z6, i13);
            }
        });
        int size3 = listCreatePagesAfterList.size();
        for (int i49 = 0; i49 < size3; i49++) {
            iMax4 = Math.max(iMax4, listCreatePagesAfterList.get(i49).getCrossAxisSize());
        }
        boolean z10 = Intrinsics.areEqual(measuredPage2, arrayDeque.first()) && list2.isEmpty() && listCreatePagesAfterList.isEmpty();
        Orientation orientation4 = Orientation.Vertical;
        int iM16454constrainWidthK40F9xA = ConstraintsKt.m16454constrainWidthK40F9xA(j6, orientation == orientation4 ? iMax4 : i32);
        if (orientation == orientation4) {
            iMax4 = i32;
        }
        int iM16453constrainHeightK40F9xA = ConstraintsKt.m16453constrainHeightK40F9xA(j6, iMax4);
        int i50 = i15;
        int i51 = i32;
        final List<MeasuredPage> listCalculatePagesOffsets = calculatePagesOffsets(lazyLayoutMeasureScope, arrayDeque, list2, listCreatePagesAfterList, iM16454constrainWidthK40F9xA, iM16453constrainHeightK40F9xA, i51, i7, i18, orientation, z6, lazyLayoutMeasureScope, i10, i13);
        if (z10) {
            arrayList = listCalculatePagesOffsets;
        } else {
            arrayList = new ArrayList<>(listCalculatePagesOffsets.size());
            int size4 = listCalculatePagesOffsets.size();
            int i52 = 0;
            while (i52 < size4) {
                MeasuredPage measuredPage3 = listCalculatePagesOffsets.get(i52);
                MeasuredPage measuredPage4 = measuredPage3;
                MeasuredPage measuredPage5 = measuredPage2;
                int i53 = i50;
                if (measuredPage4.getIndex() >= ((MeasuredPage) arrayDeque.first()).getIndex() && measuredPage4.getIndex() <= ((MeasuredPage) arrayDeque.last()).getIndex()) {
                    arrayList.add(measuredPage3);
                }
                i52++;
                i50 = i53;
                measuredPage2 = measuredPage5;
            }
        }
        MeasuredPage measuredPage6 = measuredPage2;
        int i54 = i50;
        if (list2.isEmpty()) {
            arrayList2 = CollectionsKt.emptyList();
        } else {
            arrayList2 = new ArrayList(listCalculatePagesOffsets.size());
            int size5 = listCalculatePagesOffsets.size();
            for (int i55 = 0; i55 < size5; i55++) {
                MeasuredPage measuredPage7 = listCalculatePagesOffsets.get(i55);
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
            for (int i56 = 0; i56 < size6; i56++) {
                MeasuredPage measuredPage8 = listCalculatePagesOffsets.get(i56);
                if (measuredPage8.getIndex() > ((MeasuredPage) arrayDeque.last()).getIndex()) {
                    arrayList3.add(measuredPage8);
                }
            }
        }
        List list4 = arrayList3;
        MeasuredPage measuredPageCalculateNewCurrentPage = calculateNewCurrentPage(i7 + i8 + i9, arrayList, i8, i9, iCoerceAtLeast, snapPosition, i6);
        return new PagerMeasureResult(arrayList, i13, i10, i9, orientation, i23, i30, z6, i14, measuredPage6, measuredPageCalculateNewCurrentPage, iCoerceAtLeast == 0 ? 0.0f : RangesKt.coerceIn((snapPosition.position(r0, i13, i8, i9, measuredPageCalculateNewCurrentPage != null ? measuredPageCalculateNewCurrentPage.getIndex() : 0, i6) - (measuredPageCalculateNewCurrentPage != null ? measuredPageCalculateNewCurrentPage.getOffset() : 0)) / iCoerceAtLeast, -0.5f, 0.5f), i47, i54 < i6 || i51 > i7, snapPosition, function3.invoke(Integer.valueOf(iM16454constrainWidthK40F9xA), Integer.valueOf(iM16453constrainHeightK40F9xA), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$14
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
                        for (int i57 = 0; i57 < size7; i57++) {
                            list6.get(i57).place(placementScope2);
                        }
                    }
                });
                ObservableScopeInvalidator.m10783attachToScopeimpl(mutableState);
            }
        }), z9, list3, list4, coroutineScope);
    }
}
