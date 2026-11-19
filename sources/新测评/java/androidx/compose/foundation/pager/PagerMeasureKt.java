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

@Metadata(m13557d1 = {"\u0000¬\u0001\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aH\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002\u001aH\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0015H\u0002\u001a@\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0015H\u0002\u001a\u0017\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082\b\u001a\u008c\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e*\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0002\u001aj\u0010\u0014\u001a\u00020\u0004*\u00020\u001f2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010(\u001a\u00020)2\b\u00107\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020<2\u0006\u0010*\u001a\u00020+2\u0006\u0010/\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001añ\u0001\u0010?\u001a\u00020@*\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u00103\u001a\u0002042\u0006\u0010A\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00062\u0006\u0010D\u001a\u0002022\u0006\u0010(\u001a\u00020)2\b\u00109\u001a\u0004\u0018\u00010:2\b\u00107\u001a\u0004\u0018\u0001082\u0006\u0010*\u001a\u00020+2\u0006\u00105\u001a\u0002062\u0006\u0010/\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2/\u0010I\u001a+\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u00190\u0015¢\u0006\u0002\bL\u0012\u0004\u0012\u00020M0JH\u0000ø\u0001\u0000¢\u0006\u0004\bN\u0010O\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006P"}, m13558d2 = {"MaxPageOffset", "", "MinPageOffset", "calculateNewCurrentPage", "Landroidx/compose/foundation/pager/MeasuredPage;", "viewportSize", "", "visiblePagesInfo", "", "beforeContentPadding", "afterContentPadding", "itemSize", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "pageCount", "createPagesAfterList", "currentLastPage", "pagesCount", "beyondViewportPageCount", "pinnedPages", "getAndMeasure", "Lkotlin/Function1;", "createPagesBeforeList", "currentFirstPage", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "calculatePagesOffsets", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "pages", "extraPagesBefore", "extraPagesAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "pagesScrollOffset", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "reverseLayout", "", "density", "Landroidx/compose/ui/unit/Density;", "spaceBetweenPages", "pageAvailableSize", "index", "childConstraints", "Landroidx/compose/ui/unit/Constraints;", "pagerItemProvider", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "visualPageOffset", "Landroidx/compose/ui/unit/IntOffset;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getAndMeasure-SGf7dI0", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZI)Landroidx/compose/foundation/pager/MeasuredPage;", "measurePager", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "mainAxisAvailableSize", "currentPage", "currentPageOffset", "constraints", "placementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "layout", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measurePager-bmk8ZPk", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;IIIIIIJLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZJIILjava/util/List;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/pager/PagerMeasureResult;", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nPagerMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,702:1\n698#1,4:713\n698#1,4:717\n698#1,4:721\n698#1,4:725\n698#1,4:729\n698#1,4:733\n698#1,4:784\n96#2,5:703\n96#2,5:708\n96#2,5:737\n50#2,5:813\n96#2,5:818\n34#3,6:742\n34#3,6:748\n230#3,3:754\n34#3,6:757\n233#3:763\n230#3,3:764\n34#3,6:767\n233#3:773\n230#3,3:774\n34#3,6:777\n233#3:783\n34#3,6:788\n34#3,6:794\n168#3,13:800\n34#3,6:824\n34#3,6:830\n34#3,6:836\n1#4:823\n*S KotlinDebug\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n*L\n71#1:713,4\n139#1:717,4\n160#1:721,4\n181#1:725,4\n220#1:729,4\n244#1:733,4\n456#1:784,4\n67#1:703,5\n68#1:708,5\n301#1:737,5\n626#1:813,5\n634#1:818,5\n348#1:742,6\n373#1:748,6\n410#1:754,3\n410#1:757,6\n410#1:763\n417#1:764,3\n417#1:767,6\n417#1:773\n421#1:774,3\n421#1:777,6\n421#1:783\n516#1:788,6\n541#1:794,6\n560#1:800,13\n672#1:824,6\n679#1:830,6\n685#1:836,6\n*E\n"})
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
            int lastIndex = CollectionsKt.getLastIndex(list);
            if (1 <= lastIndex) {
                int i15 = 1;
                while (true) {
                    MeasuredPage measuredPage4 = list.get(i15);
                    MeasuredPage measuredPage5 = measuredPage4;
                    float f11 = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(i10, i11, i12, i13, measuredPage5.getOffset(), measuredPage5.getIndex(), snapPosition, i14));
                    if (Float.compare(f10, f11) < 0) {
                        f10 = f11;
                        measuredPage2 = measuredPage4;
                    }
                    if (i15 == lastIndex) {
                        break;
                    }
                    i15++;
                }
            }
            measuredPage = measuredPage2;
        }
        return measuredPage;
    }

    private static final List<MeasuredPage> calculatePagesOffsets(LazyLayoutMeasureScope lazyLayoutMeasureScope, List<MeasuredPage> list, List<MeasuredPage> list2, List<MeasuredPage> list3, int i10, int i11, int i12, int i13, int i14, Orientation orientation, boolean z9, Density density, int i15, int i16) {
        int i17 = i14;
        int i18 = i16 + i15;
        int i19 = orientation == Orientation.Vertical ? i11 : i10;
        int i20 = 0;
        boolean z10 = i12 < Math.min(i19, i13);
        if (z10) {
            if (!(i17 == 0)) {
                InlineClassHelperKt.throwIllegalStateException("non-zero pagesScrollOffset=" + i17);
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z10) {
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
            Arrangement.HorizontalOrVertical horizontalOrVerticalM17565spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m17565spacedBy0680j_4(lazyLayoutMeasureScope.mo17329toDpu2uoSUM(i15));
            if (orientation == Orientation.Vertical) {
                horizontalOrVerticalM17565spacedBy0680j_4.arrange(density, i19, iArr, iArr2);
            } else {
                horizontalOrVerticalM17565spacedBy0680j_4.arrange(density, i19, iArr, LayoutDirection.Ltr, iArr2);
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
                        size2 = (i19 - size2) - measuredPage.getSize();
                    }
                    measuredPage.position(size2, i10, i11);
                    arrayList.add(measuredPage);
                    if (first == last) {
                        break;
                    }
                    first += step;
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

    private static final int calculatePagesOffsets$reverseAware(int i10, boolean z9, int i11) {
        return !z9 ? i10 : (i11 - i10) - 1;
    }

    private static final List<MeasuredPage> createPagesAfterList(int i10, int i11, int i12, List<Integer> list, Function1<? super Integer, MeasuredPage> function1) {
        int iMin = Math.min(i12 + i10, i11 - 1);
        int i13 = i10 + 1;
        ArrayList arrayList = null;
        if (i13 <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i13)));
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
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<MeasuredPage> createPagesBeforeList(int i10, int i11, List<Integer> list, Function1<? super Integer, MeasuredPage> function1) {
        int iMax = Math.max(0, i10 - i11);
        int i12 = i10 - 1;
        ArrayList arrayList = null;
        if (iMax <= i12) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i12)));
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
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final void debugLog(Function0<String> function0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAndMeasure-SGf7dI0, reason: not valid java name */
    public static final MeasuredPage m17931getAndMeasureSGf7dI0(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i10, long j10, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j11, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z9, int i11) {
        return new MeasuredPage(i10, i11, lazyLayoutMeasureScope.mo17855measure0kLqBqw(i10, j10), j11, pagerLazyLayoutItemProvider.getKey(i10), orientation, horizontal, vertical, layoutDirection, z9, null);
    }

    /* renamed from: measurePager-bmk8ZPk, reason: not valid java name */
    public static final PagerMeasureResult m17932measurePagerbmk8ZPk(final LazyLayoutMeasureScope lazyLayoutMeasureScope, int i10, final PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i11, int i12, int i13, int i14, int i15, int i16, long j10, final Orientation orientation, final Alignment.Vertical vertical, final Alignment.Horizontal horizontal, final boolean z9, final long j11, final int i17, int i18, List<Integer> list, SnapPosition snapPosition, final MutableState<Unit> mutableState, CoroutineScope coroutineScope, Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> function3) {
        int i19;
        boolean z10;
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
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i17 + i14, 0);
        if (i10 <= 0) {
            return new PagerMeasureResult(CollectionsKt.emptyList(), i17, i14, i13, orientation, -i12, i11 + i13, false, i18, null, null, 0.0f, 0, false, snapPosition, function3.invoke(Integer.valueOf(Constraints.m23516getMinWidthimpl(j10)), Integer.valueOf(Constraints.m23515getMinHeightimpl(j10)), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$4
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
        final long jConstraints$default = ConstraintsKt.Constraints$default(0, orientation2 == orientation3 ? Constraints.m23514getMaxWidthimpl(j10) : i17, 0, orientation2 != orientation3 ? Constraints.m23513getMaxHeightimpl(j10) : i17, 5, null);
        int i24 = i15;
        int i25 = i16;
        while (i24 > 0 && i25 > 0) {
            i24--;
            i25 -= iCoerceAtLeast;
        }
        int i26 = i25 * (-1);
        if (i24 >= i10) {
            i24 = i10 - 1;
            i26 = 0;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i27 = -i12;
        int i28 = (i14 < 0 ? i14 : 0) + i27;
        int i29 = i26 + i28;
        int iMax2 = 0;
        while (i29 < 0 && i24 > 0) {
            int i30 = i24 - 1;
            MeasuredPage measuredPageM17931getAndMeasureSGf7dI0 = m17931getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i30, jConstraints$default, pagerLazyLayoutItemProvider, j11, orientation2, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z9, i17);
            arrayDeque.add(0, measuredPageM17931getAndMeasureSGf7dI0);
            iMax2 = Math.max(iMax2, measuredPageM17931getAndMeasureSGf7dI0.getCrossAxisSize());
            i29 += iCoerceAtLeast;
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
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast(i34, 0);
        int i36 = -i33;
        int i37 = i35;
        int i38 = 0;
        boolean z11 = false;
        while (i38 < arrayDeque.size()) {
            if (i36 >= iCoerceAtLeast2) {
                arrayDeque.remove(i38);
                z11 = true;
            } else {
                i37++;
                i36 += iCoerceAtLeast;
                i38++;
            }
        }
        int iMax3 = i32;
        int i39 = i37;
        boolean z12 = z11;
        int i40 = i33;
        while (i39 < i10 && (i36 < iCoerceAtLeast2 || i36 <= 0 || arrayDeque.isEmpty())) {
            int i41 = iCoerceAtLeast2;
            int i42 = i39;
            MeasuredPage measuredPageM17931getAndMeasureSGf7dI02 = m17931getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i42, jConstraints$default, pagerLazyLayoutItemProvider, j11, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z9, i17);
            int i43 = i40;
            int i44 = i10 - 1;
            i36 += i42 == i44 ? i17 : iCoerceAtLeast;
            if (i36 > i31 || i42 == i44) {
                iMax3 = Math.max(iMax3, measuredPageM17931getAndMeasureSGf7dI02.getCrossAxisSize());
                arrayDeque.add(measuredPageM17931getAndMeasureSGf7dI02);
                i23 = i35;
                i40 = i43;
            } else {
                i23 = i42 + 1;
                i40 = i43 - iCoerceAtLeast;
                z12 = true;
            }
            i39 = i42 + 1;
            i35 = i23;
            iCoerceAtLeast2 = i41;
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
                MeasuredPage measuredPageM17931getAndMeasureSGf7dI03 = m17931getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i47, jConstraints$default, pagerLazyLayoutItemProvider, j11, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z9, i17);
                arrayDeque.add(0, measuredPageM17931getAndMeasureSGf7dI03);
                iMax = Math.max(iMax, measuredPageM17931getAndMeasureSGf7dI03.getCrossAxisSize());
                i20 += iCoerceAtLeast;
                i39 = i39;
                i21 = i47;
            }
            i19 = i39;
            z10 = false;
            if (i20 < 0) {
                i36 += i20;
                i20 = 0;
            }
        } else {
            i19 = i39;
            z10 = false;
            iMax = iMax3;
            i20 = i45;
            i21 = i35;
        }
        if (!(i20 >= 0 ? true : z10)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid currentFirstPageScrollOffset");
        }
        int i48 = iMax;
        int i49 = -i20;
        MeasuredPage measuredPage = (MeasuredPage) arrayDeque.first();
        if (i12 > 0 || i14 < 0) {
            int size = arrayDeque.size();
            i22 = i49;
            int i50 = 0;
            while (i50 < size && i20 != 0 && iCoerceAtLeast <= i20 && i50 != CollectionsKt.getLastIndex(arrayDeque)) {
                i20 -= iCoerceAtLeast;
                i50++;
                measuredPage = (MeasuredPage) arrayDeque.get(i50);
            }
        } else {
            i22 = i49;
        }
        int i51 = i20;
        MeasuredPage measuredPage2 = measuredPage;
        List<MeasuredPage> listCreatePagesBeforeList = createPagesBeforeList(i21, i18, list, new Function1<Integer, MeasuredPage>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesBefore$1
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
                return PagerMeasureKt.m17931getAndMeasureSGf7dI0(lazyLayoutMeasureScope2, i52, jConstraints$default, pagerLazyLayoutItemProvider, j11, orientation, horizontal, vertical, lazyLayoutMeasureScope2.getLayoutDirection(), z9, i17);
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
        List<MeasuredPage> listCreatePagesAfterList = createPagesAfterList(((MeasuredPage) arrayDeque.last()).getIndex(), i10, i18, list, new Function1<Integer, MeasuredPage>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesAfter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ MeasuredPage invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final MeasuredPage invoke(int i53) {
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                return PagerMeasureKt.m17931getAndMeasureSGf7dI0(lazyLayoutMeasureScope2, i53, jConstraints$default, pagerLazyLayoutItemProvider, j11, orientation, horizontal, vertical, lazyLayoutMeasureScope2.getLayoutDirection(), z9, i17);
            }
        });
        int size3 = listCreatePagesAfterList.size();
        for (int i53 = 0; i53 < size3; i53++) {
            iMax4 = Math.max(iMax4, listCreatePagesAfterList.get(i53).getCrossAxisSize());
        }
        boolean z13 = Intrinsics.areEqual(measuredPage2, arrayDeque.first()) && list2.isEmpty() && listCreatePagesAfterList.isEmpty();
        Orientation orientation4 = Orientation.Vertical;
        int iM23531constrainWidthK40F9xA = ConstraintsKt.m23531constrainWidthK40F9xA(j10, orientation == orientation4 ? iMax4 : i36);
        if (orientation == orientation4) {
            iMax4 = i36;
        }
        int iM23530constrainHeightK40F9xA = ConstraintsKt.m23530constrainHeightK40F9xA(j10, iMax4);
        int i54 = i19;
        int i55 = i36;
        final List<MeasuredPage> listCalculatePagesOffsets = calculatePagesOffsets(lazyLayoutMeasureScope, arrayDeque, list2, listCreatePagesAfterList, iM23531constrainWidthK40F9xA, iM23530constrainHeightK40F9xA, i55, i11, i22, orientation, z9, lazyLayoutMeasureScope, i14, i17);
        if (z13) {
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
                if (measuredPage4.getIndex() >= ((MeasuredPage) arrayDeque.first()).getIndex() && measuredPage4.getIndex() <= ((MeasuredPage) arrayDeque.last()).getIndex()) {
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
            arrayList2 = CollectionsKt.emptyList();
        } else {
            arrayList2 = new ArrayList(listCalculatePagesOffsets.size());
            int size5 = listCalculatePagesOffsets.size();
            for (int i59 = 0; i59 < size5; i59++) {
                MeasuredPage measuredPage7 = listCalculatePagesOffsets.get(i59);
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
            for (int i60 = 0; i60 < size6; i60++) {
                MeasuredPage measuredPage8 = listCalculatePagesOffsets.get(i60);
                if (measuredPage8.getIndex() > ((MeasuredPage) arrayDeque.last()).getIndex()) {
                    arrayList3.add(measuredPage8);
                }
            }
        }
        List list4 = arrayList3;
        MeasuredPage measuredPageCalculateNewCurrentPage = calculateNewCurrentPage(i11 + i12 + i13, arrayList, i12, i13, iCoerceAtLeast, snapPosition, i10);
        return new PagerMeasureResult(arrayList, i17, i14, i13, orientation, i27, i34, z9, i18, measuredPage6, measuredPageCalculateNewCurrentPage, iCoerceAtLeast == 0 ? 0.0f : RangesKt.coerceIn((snapPosition.position(r0, i17, i12, i13, measuredPageCalculateNewCurrentPage != null ? measuredPageCalculateNewCurrentPage.getIndex() : 0, i10) - (measuredPageCalculateNewCurrentPage != null ? measuredPageCalculateNewCurrentPage.getOffset() : 0)) / iCoerceAtLeast, -0.5f, 0.5f), i51, i58 < i10 || i55 > i11, snapPosition, function3.invoke(Integer.valueOf(iM23531constrainWidthK40F9xA), Integer.valueOf(iM23530constrainHeightK40F9xA), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$14
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
                        for (int i61 = 0; i61 < size7; i61++) {
                            list6.get(i61).place(placementScope2);
                        }
                    }
                });
                ObservableScopeInvalidator.m17860attachToScopeimpl(mutableState);
            }
        }), z12, list3, list4, coroutineScope);
    }
}
