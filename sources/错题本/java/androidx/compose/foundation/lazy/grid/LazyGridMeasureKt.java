package androidx.compose.foundation.lazy.grid;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.SourceDebugExtension;
import p152r6.InterfaceC6471c;
import p200x6.C6756f;

@Metadata(m5109d1 = {"\u0000´\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u001aÜ\u0002\u0010:\u001a\u0002072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'23\u0010.\u001a/\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e0-0\u001d0)2\b\u00100\u001a\u0004\u0018\u00010/2/\u00106\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002030)¢\u0006\u0002\b4\u0012\u0004\u0012\u00020501H\u0000ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001aH\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00100)H\u0082\b¢\u0006\u0004\b<\u0010=\u001aM\u0010B\u001a\b\u0012\u0004\u0012\u00020?0\u001d2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00102\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u001d2\b\u0010A\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\bB\u0010C\u001a\u0093\u0001\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001a0L2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020?0\u001d2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d2\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bM\u0010N\u001a-\u0010R\u001a\u000203\"\u0004\b\u0000\u0010O*\b\u0012\u0004\u0012\u00028\u00000L2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000PH\u0002¢\u0006\u0004\bR\u0010S\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006T"}, m5110d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "itemAnimator", "slotsPerLine", "", "pinnedItems", "isInLookaheadScope", "isLookingAhead", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "approachLayoutInfo", "Lkotlinx/coroutines/v;", "coroutineScope", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "line", "Lkotlin/Pair;", "prefetchInfoRetriever", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "stickyItemsScrollBehavior", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureLazyGrid-GyuLg2I", "(ILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;Lkotlinx/coroutines/v;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Lr6/c;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Lr6/f;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureLazyGrid", "filter", "calculateExtraItems", "(Ljava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Lr6/c;)Ljava/util/List;", "lastVisibleItemIndex", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "visibleLines", "lastApproachLayoutInfo", "linesRetainedForLookahead", "(IILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;ZLjava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)Ljava/util/List;", "lines", "itemsBefore", "itemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "", "calculateItemsOffsets", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;", ExifInterface.GPS_DIRECTION_TRUE, "", "arr", "addAllFromArray", "(Ljava/util/List;[Ljava/lang/Object;)V", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,635:1\n467#1,3:658\n470#1,16:665\n487#1:682\n467#1,3:683\n470#1:690\n471#1,15:701\n487#1:717\n96#2,5:636\n96#2,5:641\n96#2,5:653\n50#2,5:745\n96#2,5:760\n107#2,7:765\n107#2,7:772\n54#3:646\n59#3:648\n54#3:718\n59#3:720\n85#4:647\n90#4:649\n85#4:719\n90#4:721\n26#5:650\n26#5:651\n26#5:652\n34#6,4:661\n39#6:681\n34#6,4:686\n102#6,2:691\n34#6,4:693\n39#6:699\n104#6:700\n39#6:716\n34#6,6:722\n34#6,6:728\n102#6,2:735\n34#6,4:737\n39#6:743\n104#6:744\n133#6,3:750\n34#6,6:753\n136#6:759\n52#6,6:779\n34#6,6:785\n34#6,6:791\n12474#7,2:697\n12474#7,2:741\n1#8:734\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n*L\n290#1:658,3\n290#1:665,16\n290#1:682\n308#1:683,3\n308#1:690\n308#1:701,15\n308#1:717\n82#1:636,5\n83#1:641,5\n283#1:653,5\n562#1:745,5\n568#1:760,5\n575#1:765,7\n580#1:772,7\n107#1:646\n108#1:648\n393#1:718\n395#1:720\n107#1:647\n108#1:649\n393#1:719\n395#1:721\n137#1:650\n265#1:651\n266#1:652\n290#1:661,4\n290#1:681\n308#1:686,4\n315#1:691,2\n315#1:693,4\n315#1:699\n315#1:700\n308#1:716\n398#1:722,6\n469#1:728,6\n530#1:735,2\n530#1:737,4\n530#1:743\n530#1:744\n565#1:750,3\n565#1:753,6\n565#1:759\n608#1:779,6\n615#1:785,6\n620#1:791,6\n316#1:697,2\n530#1:741,2\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridMeasureKt {
    private static final <T> void addAllFromArray(List<T> list, T[] tArr) {
        for (T t8 : tArr) {
            list.add(t8);
        }
    }

    private static final List<LazyGridMeasuredItem> calculateExtraItems(List<Integer> list, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, InterfaceC6471c interfaceC6471c) {
        LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider2;
        int size = list.size();
        ArrayList arrayList = null;
        int i = 0;
        while (i < size) {
            int iIntValue = list.get(i).intValue();
            if (((Boolean) interfaceC6471c.invoke(Integer.valueOf(iIntValue))).booleanValue()) {
                int iSpanOf = lazyGridMeasuredLineProvider.spanOf(iIntValue);
                lazyGridMeasuredItemProvider2 = lazyGridMeasuredItemProvider;
                LazyGridMeasuredItem lazyGridMeasuredItemMo7378getAndMeasurehBUhpc = lazyGridMeasuredItemProvider2.mo7378getAndMeasurehBUhpc(iIntValue, 0, iSpanOf, lazyGridMeasuredLineProvider.m7410childConstraintsJhjzzOo$foundation_release(0, iSpanOf));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lazyGridMeasuredItemMo7378getAndMeasurehBUhpc);
            } else {
                lazyGridMeasuredItemProvider2 = lazyGridMeasuredItemProvider;
            }
            i++;
            lazyGridMeasuredItemProvider = lazyGridMeasuredItemProvider2;
        }
        return arrayList == null ? EmptyList.INSTANCE : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [x6.d] */
    private static final List<LazyGridMeasuredItem> calculateItemsOffsets(List<LazyGridMeasuredLine> list, List<LazyGridMeasuredItem> list2, List<LazyGridMeasuredItem> list3, int i, int i8, int i9, int i10, int i11, boolean z8, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z9, Density density) {
        int i12 = z8 ? i8 : i;
        boolean z10 = i9 < Math.min(i12, i10);
        if (z10 && i11 != 0) {
            InlineClassHelperKt.throwIllegalStateException("non-zero firstLineScrollOffset");
        }
        int size = list.size();
        int length = 0;
        for (int i13 = 0; i13 < size; i13++) {
            length += list.get(i13).getItems().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (z10) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                InlineClassHelperKt.throwIllegalArgumentException("no items");
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i14 = 0; i14 < size2; i14++) {
                iArr[i14] = list.get(calculateItemsOffsets$reverseAware(i14, z9, size2)).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            if (z8) {
                if (vertical == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement");
                    throw new KotlinNothingValueException();
                }
                vertical.arrange(density, i12, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalArrangement");
                    throw new KotlinNothingValueException();
                }
                horizontal.arrange(density, i12, iArr, LayoutDirection.Ltr, iArr2);
            }
            C6756f c6756fM5192S = AbstractC5802q.m5192S(iArr2);
            C6756f c6756fM5255I = c6756fM5192S;
            if (z9) {
                c6756fM5255I = AbstractC5806u.m5255I(c6756fM5192S);
            }
            int i15 = c6756fM5255I.f11420a;
            int i16 = c6756fM5255I.f11421b;
            int i17 = c6756fM5255I.f11422c;
            if ((i17 > 0 && i15 <= i16) || (i17 < 0 && i16 <= i15)) {
                while (true) {
                    int mainAxisSize = iArr2[i15];
                    LazyGridMeasuredLine lazyGridMeasuredLine = list.get(calculateItemsOffsets$reverseAware(i15, z9, size2));
                    if (z9) {
                        mainAxisSize = (i12 - mainAxisSize) - lazyGridMeasuredLine.getMainAxisSize();
                    }
                    addAllFromArray(arrayList, lazyGridMeasuredLine.position(mainAxisSize, i, i8));
                    if (i15 == i16) {
                        break;
                    }
                    i15 += i17;
                }
            }
        } else {
            int size3 = list2.size() - 1;
            if (size3 >= 0) {
                int mainAxisSizeWithSpacings = i11;
                while (true) {
                    int i18 = size3 - 1;
                    LazyGridMeasuredItem lazyGridMeasuredItem = list2.get(size3);
                    mainAxisSizeWithSpacings -= lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                    lazyGridMeasuredItem.position(mainAxisSizeWithSpacings, 0, i, i8);
                    arrayList.add(lazyGridMeasuredItem);
                    if (i18 < 0) {
                        break;
                    }
                    size3 = i18;
                }
            }
            int size4 = list.size();
            int mainAxisSizeWithSpacings2 = i11;
            for (int i19 = 0; i19 < size4; i19++) {
                LazyGridMeasuredLine lazyGridMeasuredLine2 = list.get(i19);
                addAllFromArray(arrayList, lazyGridMeasuredLine2.position(mainAxisSizeWithSpacings2, i, i8));
                mainAxisSizeWithSpacings2 += lazyGridMeasuredLine2.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            for (int i20 = 0; i20 < size5; i20++) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = list3.get(i20);
                lazyGridMeasuredItem2.position(mainAxisSizeWithSpacings2, 0, i, i8);
                arrayList.add(lazyGridMeasuredItem2);
                mainAxisSizeWithSpacings2 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i, boolean z8, int i8) {
        return !z8 ? i : (i8 - i) - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8 A[LOOP:1: B:25:0x0070->B:39:0x00a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ab A[EDGE_INSN: B:49:0x00ab->B:40:0x00ab BREAK  A[LOOP:1: B:25:0x0070->B:39:0x00a8], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine> linesRetainedForLookahead(int r6, int r7, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider r8, boolean r9, java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine> r10, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo r11) {
        /*
            r0 = 0
            if (r9 == 0) goto Lab
            if (r11 == 0) goto Lab
            java.util.List r9 = r11.getVisibleItemsInfo()
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto Lab
            java.util.List r9 = r11.getVisibleItemsInfo()
            int r1 = r9.size()
            int r1 = r1 + (-1)
        L19:
            r2 = -1
            if (r2 >= r1) goto L42
            java.lang.Object r2 = r9.get(r1)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r2 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r2
            int r2 = r2.getIndex()
            if (r2 <= r6) goto L3f
            if (r1 == 0) goto L38
            int r2 = r1 + (-1)
            java.lang.Object r2 = r9.get(r2)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r2 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r2
            int r2 = r2.getIndex()
            if (r2 > r6) goto L3f
        L38:
            java.lang.Object r6 = r9.get(r1)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r6 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r6
            goto L43
        L3f:
            int r1 = r1 + (-1)
            goto L19
        L42:
            r6 = r0
        L43:
            java.util.List r9 = r11.getVisibleItemsInfo()
            java.lang.Object r9 = kotlin.collections.AbstractC5805t.m5235o0(r9)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r9 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r9
            java.lang.Object r10 = kotlin.collections.AbstractC5805t.m5236p0(r10)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r10 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r10
            r11 = 0
            if (r10 == 0) goto L5d
            int r10 = r10.getIndex()
            int r10 = r10 + 1
            goto L5e
        L5d:
            r10 = r11
        L5e:
            if (r6 == 0) goto Lab
            int r6 = r6.getIndex()
            int r9 = r9.getIndex()
            int r7 = r7 + (-1)
            int r7 = java.lang.Math.min(r9, r7)
            if (r6 > r7) goto Lab
        L70:
            if (r0 == 0) goto L96
            int r9 = r0.size()
            r1 = r11
        L77:
            if (r1 >= r9) goto L96
            java.lang.Object r2 = r0.get(r1)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r2 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r2
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r2 = r2.getItems()
            int r3 = r2.length
            r4 = r11
        L85:
            if (r4 >= r3) goto L93
            r5 = r2[r4]
            int r5 = r5.getIndex()
            if (r5 != r6) goto L90
            goto La6
        L90:
            int r4 = r4 + 1
            goto L85
        L93:
            int r1 = r1 + 1
            goto L77
        L96:
            if (r0 != 0) goto L9d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L9d:
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r9 = r8.getAndMeasure(r10)
            int r10 = r10 + 1
            r0.add(r9)
        La6:
            if (r6 == r7) goto Lab
            int r6 = r6 + 1
            goto L70
        Lab:
            if (r0 != 0) goto Lb0
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.INSTANCE
            return r6
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.linesRetainedForLookahead(int, int, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider, boolean, java.util.List, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0171  */
    @org.jetbrains.annotations.NotNull
    /* renamed from: measureLazyGrid-GyuLg2I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.grid.LazyGridMeasureResult m7406measureLazyGridGyuLg2I(int r54, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider r55, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider r56, int r57, int r58, int r59, int r60, int r61, int r62, float r63, long r64, boolean r66, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r67, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r68, boolean r69, @org.jetbrains.annotations.NotNull androidx.compose.p011ui.unit.Density r70, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem> r71, int r72, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> r73, boolean r74, final boolean r75, @org.jetbrains.annotations.Nullable androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo r76, @org.jetbrains.annotations.NotNull kotlinx.coroutines.InterfaceC6009v r77, @org.jetbrains.annotations.NotNull final androidx.compose.runtime.MutableState<p045d6.C5443s> r78, @org.jetbrains.annotations.NotNull androidx.compose.p011ui.graphics.GraphicsContext r79, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r80, @org.jetbrains.annotations.Nullable androidx.compose.foundation.lazy.layout.StickyItemsPlacement r81, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6474f r82) {
        /*
            Method dump skipped, instructions count: 1181
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.m7406measureLazyGridGyuLg2I(int, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator, int, java.util.List, boolean, boolean, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo, kotlinx.coroutines.v, androidx.compose.runtime.MutableState, androidx.compose.ui.graphics.GraphicsContext, r6.c, androidx.compose.foundation.lazy.layout.StickyItemsPlacement, r6.f):androidx.compose.foundation.lazy.grid.LazyGridMeasureResult");
    }
}
