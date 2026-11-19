package androidx.compose.foundation.lazy;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.SourceDebugExtension;
import p200x6.C6756f;

@Metadata(m5109d1 = {"\u0000\u0090\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0013\u001a\u009f\u0002\u00103\u001a\u0002002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'2/\u0010/\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*¢\u0006\u0002\b-\u0012\u0004\u0012\u00020.0)H\u0000ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001ac\u00108\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u0018042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b2\u0006\u00106\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u000e2\b\u00107\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b8\u00109\u001a;\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001bH\u0002¢\u0006\u0004\b;\u0010<\u001a\u0093\u0001\u0010E\u001a\b\u0012\u0004\u0012\u00020\u0018042\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\bE\u0010F\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G"}, m5110d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenItems", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "itemAnimator", "beyondBoundsItemCount", "", "pinnedItems", "hasLookaheadOccurred", "isLookingAhead", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "approachLayoutInfo", "Lkotlinx/coroutines/v;", "coroutineScope", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "stickyItemsPlacement", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList-LCrQqZ4", "(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;Lkotlinx/coroutines/v;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Lr6/f;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList", "", "visibleItems", "consumedScroll", "lastApproachLayoutInfo", "createItemsAfterList", "(Ljava/util/List;Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IILjava/util/List;FZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;)Ljava/util/List;", "currentFirstItemIndex", "createItemsBeforeList", "(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;ILjava/util/List;)Ljava/util/List;", "items", "extraItemsBefore", "extraItemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", "calculateItemsOffsets", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,678:1\n96#2,5:679\n96#2,5:684\n96#2,5:696\n50#2,5:762\n96#2,5:767\n107#2,7:772\n107#2,7:779\n54#3:689\n59#3:691\n54#3:713\n59#3:715\n85#4:690\n90#4:692\n85#4:714\n90#4:716\n26#5:693\n26#5:694\n26#5:695\n34#6,6:701\n34#6,6:707\n34#6,6:717\n117#6,2:723\n34#6,6:725\n119#6:731\n117#6,2:732\n34#6,6:734\n119#6:740\n117#6,2:741\n34#6,6:743\n119#6:749\n34#6,6:750\n52#6,6:756\n34#6,6:786\n34#6,6:792\n34#6,6:798\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n*L\n79#1:679,5\n80#1:684,5\n287#1:696,5\n604#1:762,5\n611#1:767,5\n622#1:772,7\n630#1:779,7\n105#1:689\n106#1:691\n388#1:713\n390#1:715\n105#1:690\n106#1:692\n388#1:714\n390#1:716\n140#1:693\n269#1:694\n270#1:695\n321#1:701,6\n337#1:707,6\n393#1:717,6\n506#1:723,2\n506#1:725,6\n506#1:731\n526#1:732,2\n526#1:734,6\n526#1:740\n527#1:741,2\n527#1:743,6\n527#1:749\n548#1:750,6\n575#1:756,6\n657#1:786,6\n664#1:792,6\n670#1:798,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListMeasureKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [x6.d] */
    private static final List<LazyListMeasuredItem> calculateItemsOffsets(List<LazyListMeasuredItem> list, List<LazyListMeasuredItem> list2, List<LazyListMeasuredItem> list3, int i, int i8, int i9, int i10, int i11, boolean z8, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z9, Density density) {
        int i12 = z8 ? i8 : i;
        int i13 = 0;
        boolean z10 = i9 < Math.min(i12, i10);
        if (z10 && i11 != 0) {
            InlineClassHelperKt.throwIllegalStateException("non-zero itemsScrollOffset");
        }
        ArrayList arrayList = new ArrayList(list3.size() + list2.size() + list.size());
        if (z10) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                InlineClassHelperKt.throwIllegalArgumentException("no extra items");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i13 < size) {
                iArr[i13] = list.get(calculateItemsOffsets$reverseAware(i13, z9, size)).getSize();
                i13++;
            }
            int[] iArr2 = new int[size];
            if (z8) {
                if (vertical == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                vertical.arrange(density, i12, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalArrangement when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                horizontal.arrange(density, i12, iArr, LayoutDirection.Ltr, iArr2);
            }
            C6756f c6756fM5192S = AbstractC5802q.m5192S(iArr2);
            C6756f c6756fM5255I = c6756fM5192S;
            if (z9) {
                c6756fM5255I = AbstractC5806u.m5255I(c6756fM5192S);
            }
            int i14 = c6756fM5255I.f11420a;
            int i15 = c6756fM5255I.f11421b;
            int i16 = c6756fM5255I.f11422c;
            if ((i16 > 0 && i14 <= i15) || (i16 < 0 && i15 <= i14)) {
                while (true) {
                    int size2 = iArr2[i14];
                    LazyListMeasuredItem lazyListMeasuredItem = list.get(calculateItemsOffsets$reverseAware(i14, z9, size));
                    if (z9) {
                        size2 = (i12 - size2) - lazyListMeasuredItem.getSize();
                    }
                    lazyListMeasuredItem.position(size2, i, i8);
                    arrayList.add(lazyListMeasuredItem);
                    if (i14 == i15) {
                        break;
                    }
                    i14 += i16;
                }
            }
        } else {
            int size3 = list2.size();
            int mainAxisSizeWithSpacings = i11;
            for (int i17 = 0; i17 < size3; i17++) {
                LazyListMeasuredItem lazyListMeasuredItem2 = list2.get(i17);
                mainAxisSizeWithSpacings -= lazyListMeasuredItem2.getMainAxisSizeWithSpacings();
                lazyListMeasuredItem2.position(mainAxisSizeWithSpacings, i, i8);
                arrayList.add(lazyListMeasuredItem2);
            }
            int size4 = list.size();
            int mainAxisSizeWithSpacings2 = i11;
            for (int i18 = 0; i18 < size4; i18++) {
                LazyListMeasuredItem lazyListMeasuredItem3 = list.get(i18);
                lazyListMeasuredItem3.position(mainAxisSizeWithSpacings2, i, i8);
                arrayList.add(lazyListMeasuredItem3);
                mainAxisSizeWithSpacings2 += lazyListMeasuredItem3.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            while (i13 < size5) {
                LazyListMeasuredItem lazyListMeasuredItem4 = list3.get(i13);
                lazyListMeasuredItem4.position(mainAxisSizeWithSpacings2, i, i8);
                arrayList.add(lazyListMeasuredItem4);
                mainAxisSizeWithSpacings2 += lazyListMeasuredItem4.getMainAxisSizeWithSpacings();
                i13++;
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i, boolean z8, int i8) {
        return !z8 ? i : (i8 - i) - 1;
    }

    private static final List<LazyListMeasuredItem> createItemsAfterList(List<LazyListMeasuredItem> list, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i, int i8, List<Integer> list2, float f, boolean z8, LazyListLayoutInfo lazyListLayoutInfo) {
        ArrayList arrayList;
        LazyListItemInfo lazyListItemInfo;
        LazyListMeasuredItem lazyListMeasuredItem;
        LazyListMeasuredItem lazyListMeasuredItem2;
        int mainAxisSizeWithSpacings;
        LazyListMeasuredItem lazyListMeasuredItem3;
        int index;
        int iMin;
        LazyListMeasuredItem lazyListMeasuredItem4;
        LazyListMeasuredItem lazyListMeasuredItem5;
        int i9 = i - 1;
        int iMin2 = Math.min(((LazyListMeasuredItem) AbstractC5805t.m5235o0(list)).getIndex() + i8, i9);
        int index2 = ((LazyListMeasuredItem) AbstractC5805t.m5235o0(list)).getIndex() + 1;
        if (index2 <= iMin2) {
            int i10 = index2;
            arrayList = null;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(LazyListMeasuredItemProvider.m7377getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i10, 0L, 2, null));
                if (i10 == iMin2) {
                    break;
                }
                i10++;
            }
        } else {
            arrayList = null;
        }
        if (z8 && lazyListLayoutInfo != null && !lazyListLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            List<LazyListItemInfo> visibleItemsInfo = lazyListLayoutInfo.getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    lazyListItemInfo = null;
                    break;
                }
                if (visibleItemsInfo.get(size).getIndex() > iMin2 && (size == 0 || visibleItemsInfo.get(size - 1).getIndex() <= iMin2)) {
                    break;
                }
            }
            lazyListItemInfo = visibleItemsInfo.get(size);
            LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) AbstractC5805t.m5235o0(lazyListLayoutInfo.getVisibleItemsInfo());
            if (lazyListItemInfo != null && (index = lazyListItemInfo.getIndex()) <= (iMin = Math.min(lazyListItemInfo2.getIndex(), i9))) {
                int i11 = index;
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size2) {
                                lazyListMeasuredItem5 = null;
                                break;
                            }
                            lazyListMeasuredItem5 = arrayList.get(i12);
                            if (lazyListMeasuredItem5.getIndex() == i11) {
                                break;
                            }
                            i12++;
                        }
                        lazyListMeasuredItem4 = lazyListMeasuredItem5;
                    } else {
                        lazyListMeasuredItem4 = null;
                    }
                    if (lazyListMeasuredItem4 == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(LazyListMeasuredItemProvider.m7377getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i11, 0L, 2, null));
                    }
                    if (i11 == iMin) {
                        break;
                    }
                    i11++;
                }
            }
            float viewportEndOffset = ((lazyListLayoutInfo.getViewportEndOffset() - lazyListItemInfo2.getOffset()) - lazyListItemInfo2.getSize()) - f;
            if (viewportEndOffset > 0.0f) {
                int index3 = lazyListItemInfo2.getIndex() + 1;
                int i13 = 0;
                while (index3 < i && i13 < viewportEndOffset) {
                    if (index3 <= iMin2) {
                        int size3 = list.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size3) {
                                lazyListMeasuredItem3 = null;
                                break;
                            }
                            lazyListMeasuredItem3 = list.get(i14);
                            if (lazyListMeasuredItem3.getIndex() == index3) {
                                break;
                            }
                            i14++;
                        }
                        lazyListMeasuredItem = lazyListMeasuredItem3;
                    } else if (arrayList != null) {
                        int size4 = arrayList.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size4) {
                                lazyListMeasuredItem2 = null;
                                break;
                            }
                            lazyListMeasuredItem2 = arrayList.get(i15);
                            if (lazyListMeasuredItem2.getIndex() == index3) {
                                break;
                            }
                            i15++;
                        }
                        lazyListMeasuredItem = lazyListMeasuredItem2;
                    } else {
                        lazyListMeasuredItem = null;
                    }
                    if (lazyListMeasuredItem != null) {
                        index3++;
                        mainAxisSizeWithSpacings = lazyListMeasuredItem.getMainAxisSizeWithSpacings();
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(LazyListMeasuredItemProvider.m7377getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, index3, 0L, 2, null));
                        index3++;
                        mainAxisSizeWithSpacings = ((LazyListMeasuredItem) AbstractC5805t.m5235o0(arrayList)).getMainAxisSizeWithSpacings();
                    }
                    i13 += mainAxisSizeWithSpacings;
                }
            }
        }
        if (arrayList != null && ((LazyListMeasuredItem) AbstractC5805t.m5235o0(arrayList)).getIndex() > iMin2) {
            iMin2 = ((LazyListMeasuredItem) AbstractC5805t.m5235o0(arrayList)).getIndex();
        }
        int size5 = list2.size();
        for (int i16 = 0; i16 < size5; i16++) {
            int iIntValue = list2.get(i16).intValue();
            if (iIntValue > iMin2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(LazyListMeasuredItemProvider.m7377getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, iIntValue, 0L, 2, null));
            }
        }
        return arrayList == null ? EmptyList.INSTANCE : arrayList;
    }

    private static final List<LazyListMeasuredItem> createItemsBeforeList(int i, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i8, List<Integer> list) {
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider2;
        int iMax = Math.max(0, i - i8);
        int i9 = i - 1;
        ArrayList arrayList = null;
        if (iMax <= i9) {
            int i10 = i9;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
                arrayList.add(LazyListMeasuredItemProvider.m7377getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider2, i10, 0L, 2, null));
                if (i10 == iMax) {
                    break;
                }
                i10--;
                lazyListMeasuredItemProvider = lazyListMeasuredItemProvider2;
            }
        } else {
            lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i11 = size - 1;
                int iIntValue = list.get(size).intValue();
                if (iIntValue < iMax) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(LazyListMeasuredItemProvider.m7377getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider2, iIntValue, 0L, 2, null));
                }
                if (i11 < 0) {
                    break;
                }
                size = i11;
            }
        }
        return arrayList == null ? EmptyList.INSTANCE : arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0294 A[LOOP:4: B:116:0x0292->B:117:0x0294, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c4 A[LOOP:5: B:119:0x02c2->B:120:0x02c4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023c  */
    @org.jetbrains.annotations.NotNull
    /* renamed from: measureLazyList-LCrQqZ4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.LazyListMeasureResult m7371measureLazyListLCrQqZ4(int r42, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.lazy.LazyListMeasuredItemProvider r43, int r44, int r45, int r46, int r47, int r48, int r49, float r50, long r51, boolean r53, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r54, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r55, boolean r56, @org.jetbrains.annotations.NotNull androidx.compose.p011ui.unit.Density r57, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<androidx.compose.foundation.lazy.LazyListMeasuredItem> r58, int r59, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> r60, boolean r61, final boolean r62, @org.jetbrains.annotations.Nullable androidx.compose.foundation.lazy.LazyListLayoutInfo r63, @org.jetbrains.annotations.NotNull kotlinx.coroutines.InterfaceC6009v r64, @org.jetbrains.annotations.NotNull final androidx.compose.runtime.MutableState<p045d6.C5443s> r65, @org.jetbrains.annotations.NotNull androidx.compose.p011ui.graphics.GraphicsContext r66, @org.jetbrains.annotations.Nullable androidx.compose.foundation.lazy.layout.StickyItemsPlacement r67, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6474f r68) {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListMeasureKt.m7371measureLazyListLCrQqZ4(int, androidx.compose.foundation.lazy.LazyListMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator, int, java.util.List, boolean, boolean, androidx.compose.foundation.lazy.LazyListLayoutInfo, kotlinx.coroutines.v, androidx.compose.runtime.MutableState, androidx.compose.ui.graphics.GraphicsContext, androidx.compose.foundation.lazy.layout.StickyItemsPlacement, r6.f):androidx.compose.foundation.lazy.LazyListMeasureResult");
    }
}
