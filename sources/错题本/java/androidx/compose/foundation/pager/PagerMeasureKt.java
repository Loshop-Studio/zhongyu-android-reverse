package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.gestures.snapping.SnapPositionKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.C5801p;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6474f;
import p200x6.C6756f;

@Metadata(m5109d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\u001añ\u0001\u0010+\u001a\u00020(*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2/\u0010'\u001a+\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%\u0012\u0004\u0012\u00020&0!H\u0000ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001aO\u00100\u001a\b\u0012\u0004\u0012\u00020.0\u00192\u0006\u0010,\u001a\u00020\u00012\u0006\u0010-\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020.0\"H\u0002¢\u0006\u0004\b0\u00101\u001aG\u00103\u001a\b\u0012\u0004\u0012\u00020.0\u00192\u0006\u00102\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020.0\"H\u0002¢\u0006\u0004\b3\u00104\u001aO\u00108\u001a\u0004\u0018\u00010.2\u0006\u00105\u001a\u00020\u00012\f\u00106\u001a\b\u0012\u0004\u0012\u00020.0\u00192\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u00107\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b8\u00109\u001aj\u0010/\u001a\u00020.*\u00020\u00002\u0006\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010=\u001a\u00020<2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b>\u0010?\u001a\u0093\u0001\u0010K\u001a\b\u0012\u0004\u0012\u00020.0J*\u00020\u00002\f\u0010@\u001a\b\u0012\u0004\u0012\u00020.0\u00192\f\u0010A\u001a\b\u0012\u0004\u0012\u00020.0\u00192\f\u0010B\u001a\b\u0012\u0004\u0012\u00020.0\u00192\u0006\u0010C\u001a\u00020\u00012\u0006\u0010D\u001a\u00020\u00012\u0006\u0010E\u001a\u00020\u00012\u0006\u0010F\u001a\u00020\u00012\u0006\u0010G\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010I\u001a\u00020H2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0002¢\u0006\u0004\bK\u0010L\u001a\u001e\u0010P\u001a\u00020$2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020N0MH\u0082\b¢\u0006\u0004\bP\u0010Q\"\u0014\u0010S\u001a\u00020R8\u0000X\u0080T¢\u0006\u0006\n\u0004\bS\u0010T\"\u0014\u0010U\u001a\u00020R8\u0000X\u0080T¢\u0006\u0006\n\u0004\bU\u0010T\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006V"}, m5110d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "", "pageCount", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "pagerItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenPages", "currentPage", "currentPageOffset", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "", "reverseLayout", "Landroidx/compose/ui/unit/IntOffset;", "visualPageOffset", "pageAvailableSize", "beyondViewportPageCount", "", "pinnedPages", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "Lkotlinx/coroutines/v;", "coroutineScope", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "measurePager-bmk8ZPk", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;IIIIIIJLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZJIILjava/util/List;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/v;Lr6/f;)Landroidx/compose/foundation/pager/PagerMeasureResult;", "measurePager", "currentLastPage", "pagesCount", "Landroidx/compose/foundation/pager/MeasuredPage;", "getAndMeasure", "createPagesAfterList", "(IIILjava/util/List;Lr6/c;)Ljava/util/List;", "currentFirstPage", "createPagesBeforeList", "(IILjava/util/List;Lr6/c;)Ljava/util/List;", "viewportSize", "visiblePagesInfo", "itemSize", "calculateNewCurrentPage", "(ILjava/util/List;IIILandroidx/compose/foundation/gestures/snapping/SnapPosition;I)Landroidx/compose/foundation/pager/MeasuredPage;", "index", "childConstraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getAndMeasure-SGf7dI0", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZI)Landroidx/compose/foundation/pager/MeasuredPage;", "pages", "extraPagesBefore", "extraPagesAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "pagesScrollOffset", "Landroidx/compose/ui/unit/Density;", "density", "", "calculatePagesOffsets", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIILandroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/Density;II)Ljava/util/List;", "Lkotlin/Function0;", "", "generateMsg", "debugLog", "(Lr6/a;)V", "", "MinPageOffset", "F", "MaxPageOffset", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPagerMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,702:1\n698#1,4:713\n698#1,4:717\n698#1,4:721\n698#1,4:725\n698#1,4:729\n698#1,4:733\n698#1,4:784\n96#2,5:703\n96#2,5:708\n96#2,5:737\n50#2,5:813\n96#2,5:818\n34#3,6:742\n34#3,6:748\n230#3,3:754\n34#3,6:757\n233#3:763\n230#3,3:764\n34#3,6:767\n233#3:773\n230#3,3:774\n34#3,6:777\n233#3:783\n34#3,6:788\n34#3,6:794\n168#3,13:800\n34#3,6:824\n34#3,6:830\n34#3,6:836\n1#4:823\n*S KotlinDebug\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n*L\n71#1:713,4\n139#1:717,4\n160#1:721,4\n181#1:725,4\n220#1:729,4\n244#1:733,4\n456#1:784,4\n67#1:703,5\n68#1:708,5\n301#1:737,5\n626#1:813,5\n634#1:818,5\n348#1:742,6\n373#1:748,6\n410#1:754,3\n410#1:757,6\n410#1:763\n417#1:764,3\n417#1:767,6\n417#1:773\n421#1:774,3\n421#1:777,6\n421#1:783\n516#1:788,6\n541#1:794,6\n560#1:800,13\n672#1:824,6\n679#1:830,6\n685#1:836,6\n*E\n"})
/* loaded from: classes.dex */
public final class PagerMeasureKt {
    public static final float MaxPageOffset = 0.5f;
    public static final float MinPageOffset = -0.5f;

    private static final MeasuredPage calculateNewCurrentPage(int i, List<MeasuredPage> list, int i8, int i9, int i10, SnapPosition snapPosition, int i11) {
        MeasuredPage measuredPage;
        if (list.isEmpty()) {
            measuredPage = null;
        } else {
            MeasuredPage measuredPage2 = list.get(0);
            MeasuredPage measuredPage3 = measuredPage2;
            float f = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(i, i8, i9, i10, measuredPage3.getOffset(), measuredPage3.getIndex(), snapPosition, i11));
            int iM5282u = AbstractC5806u.m5282u(list);
            if (1 <= iM5282u) {
                int i12 = 1;
                while (true) {
                    MeasuredPage measuredPage4 = list.get(i12);
                    MeasuredPage measuredPage5 = measuredPage4;
                    float f7 = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(i, i8, i9, i10, measuredPage5.getOffset(), measuredPage5.getIndex(), snapPosition, i11));
                    if (Float.compare(f, f7) < 0) {
                        f = f7;
                        measuredPage2 = measuredPage4;
                    }
                    if (i12 == iM5282u) {
                        break;
                    }
                    i12++;
                }
            }
            measuredPage = measuredPage2;
        }
        return measuredPage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v9, types: [x6.d] */
    private static final List<MeasuredPage> calculatePagesOffsets(LazyLayoutMeasureScope lazyLayoutMeasureScope, List<MeasuredPage> list, List<MeasuredPage> list2, List<MeasuredPage> list3, int i, int i8, int i9, int i10, int i11, Orientation orientation, boolean z8, Density density, int i12, int i13) {
        int i14 = i11;
        int i15 = i13 + i12;
        int i16 = orientation == Orientation.Vertical ? i8 : i;
        int i17 = 0;
        boolean z9 = i9 < Math.min(i16, i10);
        if (z9 && i14 != 0) {
            InlineClassHelperKt.throwIllegalStateException("non-zero pagesScrollOffset=" + i14);
        }
        ArrayList arrayList = new ArrayList(list3.size() + list2.size() + list.size());
        if (z9) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                InlineClassHelperKt.throwIllegalArgumentException("No extra pages");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i17 < size) {
                iArr[i17] = i13;
                i17++;
            }
            int[] iArr2 = new int[size];
            Arrangement.HorizontalOrVertical horizontalOrVerticalM7146spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m7146spacedBy0680j_4(lazyLayoutMeasureScope.mo6900toDpu2uoSUM(i12));
            if (orientation == Orientation.Vertical) {
                horizontalOrVerticalM7146spacedBy0680j_4.arrange(density, i16, iArr, iArr2);
            } else {
                horizontalOrVerticalM7146spacedBy0680j_4.arrange(density, i16, iArr, LayoutDirection.Ltr, iArr2);
            }
            C6756f c6756fM5192S = AbstractC5802q.m5192S(iArr2);
            C6756f c6756fM5255I = c6756fM5192S;
            if (z8) {
                c6756fM5255I = AbstractC5806u.m5255I(c6756fM5192S);
            }
            int i18 = c6756fM5255I.f11420a;
            int i19 = c6756fM5255I.f11421b;
            int i20 = c6756fM5255I.f11422c;
            if ((i20 > 0 && i18 <= i19) || (i20 < 0 && i19 <= i18)) {
                while (true) {
                    int size2 = iArr2[i18];
                    MeasuredPage measuredPage = list.get(calculatePagesOffsets$reverseAware(i18, z8, size));
                    if (z8) {
                        size2 = (i16 - size2) - measuredPage.getSize();
                    }
                    measuredPage.position(size2, i, i8);
                    arrayList.add(measuredPage);
                    if (i18 == i19) {
                        break;
                    }
                    i18 += i20;
                }
            }
        } else {
            int size3 = list2.size();
            int i21 = i14;
            for (int i22 = 0; i22 < size3; i22++) {
                MeasuredPage measuredPage2 = list2.get(i22);
                i21 -= i15;
                measuredPage2.position(i21, i, i8);
                arrayList.add(measuredPage2);
            }
            int size4 = list.size();
            for (int i23 = 0; i23 < size4; i23++) {
                MeasuredPage measuredPage3 = list.get(i23);
                measuredPage3.position(i14, i, i8);
                arrayList.add(measuredPage3);
                i14 += i15;
            }
            int size5 = list3.size();
            while (i17 < size5) {
                MeasuredPage measuredPage4 = list3.get(i17);
                measuredPage4.position(i14, i, i8);
                arrayList.add(measuredPage4);
                i14 += i15;
                i17++;
            }
        }
        return arrayList;
    }

    private static final int calculatePagesOffsets$reverseAware(int i, boolean z8, int i8) {
        return !z8 ? i : (i8 - i) - 1;
    }

    private static final List<MeasuredPage> createPagesAfterList(int i, int i8, int i9, List<Integer> list, InterfaceC6471c interfaceC6471c) {
        int iMin = Math.min(i9 + i, i8 - 1);
        int i10 = i + 1;
        ArrayList arrayList = null;
        if (i10 <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(interfaceC6471c.invoke(Integer.valueOf(i10)));
                if (i10 == iMin) {
                    break;
                }
                i10++;
            }
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            int iIntValue = list.get(i11).intValue();
            if (iMin + 1 <= iIntValue && iIntValue < i8) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(interfaceC6471c.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? EmptyList.INSTANCE : arrayList;
    }

    private static final List<MeasuredPage> createPagesBeforeList(int i, int i8, List<Integer> list, InterfaceC6471c interfaceC6471c) {
        int iMax = Math.max(0, i - i8);
        int i9 = i - 1;
        ArrayList arrayList = null;
        if (iMax <= i9) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(interfaceC6471c.invoke(Integer.valueOf(i9)));
                if (i9 == iMax) {
                    break;
                }
                i9--;
            }
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iIntValue = list.get(i10).intValue();
            if (iIntValue < iMax) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(interfaceC6471c.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? EmptyList.INSTANCE : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAndMeasure-SGf7dI0, reason: not valid java name */
    public static final MeasuredPage m7514getAndMeasureSGf7dI0(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, long j7, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j8, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z8, int i8) {
        return new MeasuredPage(i, i8, lazyLayoutMeasureScope.mo7438measure0kLqBqw(i, j7), j8, pagerLazyLayoutItemProvider.getKey(i), orientation, horizontal, vertical, layoutDirection, z8, null);
    }

    @NotNull
    /* renamed from: measurePager-bmk8ZPk, reason: not valid java name */
    public static final PagerMeasureResult m7515measurePagerbmk8ZPk(@NotNull final LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, @NotNull final PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i8, int i9, int i10, int i11, int i12, int i13, long j7, @NotNull final Orientation orientation, @Nullable final Alignment.Vertical vertical, @Nullable final Alignment.Horizontal horizontal, final boolean z8, final long j8, final int i14, int i15, @NotNull List<Integer> list, @NotNull SnapPosition snapPosition, @NotNull final MutableState<C5443s> mutableState, @NotNull InterfaceC6009v interfaceC6009v, @NotNull InterfaceC6474f interfaceC6474f) {
        int i16;
        boolean z9;
        int iMax;
        int i17;
        int i18;
        int i19;
        List<MeasuredPage> arrayList;
        List<MeasuredPage> list2;
        List list3;
        List arrayList2;
        int i20;
        if (!(i9 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("negative beforeContentPadding");
        }
        if (!(i10 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("negative afterContentPadding");
        }
        int i21 = i14 + i11;
        if (i21 < 0) {
            i21 = 0;
        }
        if (i <= 0) {
            return new PagerMeasureResult(EmptyList.INSTANCE, i14, i11, i10, orientation, -i9, i8 + i10, false, i15, null, null, 0.0f, 0, false, snapPosition, (MeasureResult) interfaceC6474f.invoke(Integer.valueOf(Constraints.m13260getMinWidthimpl(j7)), Integer.valueOf(Constraints.m13259getMinHeightimpl(j7)), new InterfaceC6471c() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$4
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C5443s.f8405a;
                }
            }), false, null, null, interfaceC6009v, 393216, null);
        }
        Orientation orientation2 = orientation;
        Orientation orientation3 = Orientation.Vertical;
        final long jConstraints$default = ConstraintsKt.Constraints$default(0, orientation2 == orientation3 ? Constraints.m13258getMaxWidthimpl(j7) : i14, 0, orientation2 != orientation3 ? Constraints.m13257getMaxHeightimpl(j7) : i14, 5, null);
        int i22 = i12;
        int i23 = i13;
        while (i22 > 0 && i23 > 0) {
            i22--;
            i23 -= i21;
        }
        int i24 = i23 * (-1);
        if (i22 >= i) {
            i22 = i - 1;
            i24 = 0;
        }
        C5801p c5801p = new C5801p();
        int i25 = -i9;
        int i26 = (i11 < 0 ? i11 : 0) + i25;
        int i27 = i24 + i26;
        int iMax2 = 0;
        while (i27 < 0 && i22 > 0) {
            int i28 = i22 - 1;
            MeasuredPage measuredPageM7514getAndMeasureSGf7dI0 = m7514getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i28, jConstraints$default, pagerLazyLayoutItemProvider, j8, orientation2, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z8, i14);
            c5801p.add(0, measuredPageM7514getAndMeasureSGf7dI0);
            iMax2 = Math.max(iMax2, measuredPageM7514getAndMeasureSGf7dI0.getCrossAxisSize());
            i27 += i21;
            i26 = i26;
            i22 = i28;
            orientation2 = orientation;
        }
        int i29 = i26;
        int i30 = iMax2;
        if (i27 < i29) {
            i27 = i29;
        }
        int i31 = i27 - i29;
        int i32 = i8 + i10;
        int i33 = i32 >= 0 ? i32 : 0;
        int i34 = -i31;
        int i35 = i22;
        int i36 = i35;
        int i37 = 0;
        boolean z10 = false;
        while (i37 < c5801p.size()) {
            if (i34 >= i33) {
                c5801p.remove(i37);
                z10 = true;
            } else {
                i36++;
                i34 += i21;
                i37++;
            }
        }
        int i38 = i31;
        int iMax3 = i30;
        int i39 = i36;
        boolean z11 = z10;
        while (i39 < i && (i34 < i33 || i34 <= 0 || c5801p.isEmpty())) {
            int i40 = i33;
            int i41 = i39;
            MeasuredPage measuredPageM7514getAndMeasureSGf7dI02 = m7514getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i41, jConstraints$default, pagerLazyLayoutItemProvider, j8, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z8, i14);
            int i42 = i38;
            int i43 = i - 1;
            i34 += i41 == i43 ? i14 : i21;
            if (i34 > i29 || i41 == i43) {
                iMax3 = Math.max(iMax3, measuredPageM7514getAndMeasureSGf7dI02.getCrossAxisSize());
                c5801p.addLast(measuredPageM7514getAndMeasureSGf7dI02);
                i20 = i35;
                i38 = i42;
            } else {
                i20 = i41 + 1;
                i38 = i42 - i21;
                z11 = true;
            }
            i39 = i41 + 1;
            i35 = i20;
            i33 = i40;
        }
        int i44 = i38;
        if (i34 < i8) {
            int i45 = i8 - i34;
            i17 = i44 - i45;
            i34 += i45;
            iMax = iMax3;
            i18 = i35;
            while (i17 < i9 && i18 > 0) {
                int i46 = i18 - 1;
                MeasuredPage measuredPageM7514getAndMeasureSGf7dI03 = m7514getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i46, jConstraints$default, pagerLazyLayoutItemProvider, j8, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z8, i14);
                c5801p.add(0, measuredPageM7514getAndMeasureSGf7dI03);
                iMax = Math.max(iMax, measuredPageM7514getAndMeasureSGf7dI03.getCrossAxisSize());
                i17 += i21;
                i39 = i39;
                i18 = i46;
            }
            i16 = i39;
            z9 = false;
            if (i17 < 0) {
                i34 += i17;
                i17 = 0;
            }
        } else {
            i16 = i39;
            z9 = false;
            iMax = iMax3;
            i17 = i44;
            i18 = i35;
        }
        if (!(i17 >= 0 ? true : z9)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid currentFirstPageScrollOffset");
        }
        int i47 = iMax;
        int i48 = -i17;
        MeasuredPage measuredPage = (MeasuredPage) c5801p.first();
        if (i9 > 0 || i11 < 0) {
            int size = c5801p.size();
            i19 = i48;
            int i49 = 0;
            while (i49 < size && i17 != 0 && i21 <= i17 && i49 != AbstractC5806u.m5282u(c5801p)) {
                i17 -= i21;
                i49++;
                measuredPage = (MeasuredPage) c5801p.get(i49);
            }
        } else {
            i19 = i48;
        }
        int i50 = i17;
        MeasuredPage measuredPage2 = measuredPage;
        List<MeasuredPage> listCreatePagesBeforeList = createPagesBeforeList(i18, i15, list, new InterfaceC6471c() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesBefore$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final MeasuredPage invoke(int i51) {
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                return PagerMeasureKt.m7514getAndMeasureSGf7dI0(lazyLayoutMeasureScope2, i51, jConstraints$default, pagerLazyLayoutItemProvider, j8, orientation, horizontal, vertical, lazyLayoutMeasureScope2.getLayoutDirection(), z8, i14);
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
        List<MeasuredPage> list4 = listCreatePagesBeforeList;
        List<MeasuredPage> listCreatePagesAfterList = createPagesAfterList(((MeasuredPage) c5801p.last()).getIndex(), i, i15, list, new InterfaceC6471c() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesAfter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final MeasuredPage invoke(int i52) {
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                return PagerMeasureKt.m7514getAndMeasureSGf7dI0(lazyLayoutMeasureScope2, i52, jConstraints$default, pagerLazyLayoutItemProvider, j8, orientation, horizontal, vertical, lazyLayoutMeasureScope2.getLayoutDirection(), z8, i14);
            }
        });
        int size3 = listCreatePagesAfterList.size();
        for (int i52 = 0; i52 < size3; i52++) {
            iMax4 = Math.max(iMax4, listCreatePagesAfterList.get(i52).getCrossAxisSize());
        }
        boolean z12 = AbstractC5830k.m5325b(measuredPage2, c5801p.first()) && list4.isEmpty() && listCreatePagesAfterList.isEmpty();
        Orientation orientation4 = Orientation.Vertical;
        int iM13275constrainWidthK40F9xA = ConstraintsKt.m13275constrainWidthK40F9xA(j7, orientation == orientation4 ? iMax4 : i34);
        if (orientation == orientation4) {
            iMax4 = i34;
        }
        int iM13274constrainHeightK40F9xA = ConstraintsKt.m13274constrainHeightK40F9xA(j7, iMax4);
        int i53 = i34;
        int i54 = i21;
        final List<MeasuredPage> listCalculatePagesOffsets = calculatePagesOffsets(lazyLayoutMeasureScope, c5801p, list4, listCreatePagesAfterList, iM13275constrainWidthK40F9xA, iM13274constrainHeightK40F9xA, i53, i8, i19, orientation, z8, lazyLayoutMeasureScope, i11, i14);
        if (z12) {
            arrayList = listCalculatePagesOffsets;
        } else {
            arrayList = new ArrayList<>(listCalculatePagesOffsets.size());
            int size4 = listCalculatePagesOffsets.size();
            int i55 = 0;
            while (i55 < size4) {
                MeasuredPage measuredPage3 = listCalculatePagesOffsets.get(i55);
                MeasuredPage measuredPage4 = measuredPage3;
                MeasuredPage measuredPage5 = measuredPage2;
                int i56 = size4;
                if (measuredPage4.getIndex() >= ((MeasuredPage) c5801p.first()).getIndex() && measuredPage4.getIndex() <= ((MeasuredPage) c5801p.last()).getIndex()) {
                    arrayList.add(measuredPage3);
                }
                i55++;
                size4 = i56;
                measuredPage2 = measuredPage5;
            }
        }
        MeasuredPage measuredPage6 = measuredPage2;
        if (list4.isEmpty()) {
            list3 = EmptyList.INSTANCE;
            list2 = arrayList;
        } else {
            List arrayList3 = new ArrayList(listCalculatePagesOffsets.size());
            int size5 = listCalculatePagesOffsets.size();
            int i57 = 0;
            while (i57 < size5) {
                MeasuredPage measuredPage7 = listCalculatePagesOffsets.get(i57);
                List<MeasuredPage> list5 = arrayList;
                if (measuredPage7.getIndex() < ((MeasuredPage) c5801p.first()).getIndex()) {
                    arrayList3.add(measuredPage7);
                }
                i57++;
                arrayList = list5;
            }
            list2 = arrayList;
            list3 = arrayList3;
        }
        if (listCreatePagesAfterList.isEmpty()) {
            arrayList2 = EmptyList.INSTANCE;
        } else {
            arrayList2 = new ArrayList(listCalculatePagesOffsets.size());
            int size6 = listCalculatePagesOffsets.size();
            for (int i58 = 0; i58 < size6; i58++) {
                MeasuredPage measuredPage8 = listCalculatePagesOffsets.get(i58);
                if (measuredPage8.getIndex() > ((MeasuredPage) c5801p.last()).getIndex()) {
                    arrayList2.add(measuredPage8);
                }
            }
        }
        List list6 = arrayList2;
        List<MeasuredPage> list7 = list2;
        int i59 = i16;
        MeasuredPage measuredPageCalculateNewCurrentPage = calculateNewCurrentPage(i8 + i9 + i10, list7, i9, i10, i54, snapPosition, i);
        return new PagerMeasureResult(list7, i14, i11, i10, orientation, i25, i32, z8, i15, measuredPage6, measuredPageCalculateNewCurrentPage, i54 == 0 ? 0.0f : AbstractC5806u.m5273l((snapPosition.position(r0, i14, i9, i10, measuredPageCalculateNewCurrentPage != null ? measuredPageCalculateNewCurrentPage.getIndex() : 0, i) - (measuredPageCalculateNewCurrentPage != null ? measuredPageCalculateNewCurrentPage.getOffset() : 0)) / i54, -0.5f, 0.5f), i50, i59 < i || i53 > i8, snapPosition, (MeasureResult) interfaceC6474f.invoke(Integer.valueOf(iM13275constrainWidthK40F9xA), Integer.valueOf(iM13274constrainHeightK40F9xA), new InterfaceC6471c() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$14
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                final List<MeasuredPage> list8 = listCalculatePagesOffsets;
                placementScope.withMotionFrameOfReferencePlacement(new InterfaceC6471c() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$14.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(Placeable.PlacementScope placementScope2) {
                        List<MeasuredPage> list9 = list8;
                        int size7 = list9.size();
                        for (int i60 = 0; i60 < size7; i60++) {
                            list9.get(i60).place(placementScope2);
                        }
                    }
                });
                ObservableScopeInvalidator.m7443attachToScopeimpl(mutableState);
            }
        }), z11, list3, list6, interfaceC6009v);
    }

    private static final void debugLog(InterfaceC6469a interfaceC6469a) {
    }
}
