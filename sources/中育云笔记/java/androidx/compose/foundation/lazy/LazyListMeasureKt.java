package androidx.compose.foundation.lazy;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import p265nd.AbstractC10410o;
import p265nd.C10403h;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10968r;
import p325rc.AbstractC10978w;

/* loaded from: classes.dex */
public final class LazyListMeasureKt {
    private static final List<LazyListMeasuredItem> calculateItemsOffsets(List<LazyListMeasuredItem> list, List<LazyListMeasuredItem> list2, List<LazyListMeasuredItem> list3, int i10, int i11, int i12, int i13, int i14, boolean z10, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z11, Density density) {
        int i15 = z10 ? i11 : i10;
        int i16 = 0;
        boolean z12 = i12 < Math.min(i15, i13);
        if (z12) {
            if (!(i14 == 0)) {
                InlineClassHelperKt.throwIllegalStateException("non-zero itemsScrollOffset");
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z12) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                InlineClassHelperKt.throwIllegalArgumentException("no extra items");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i16 < size) {
                iArr[i16] = list.get(calculateItemsOffsets$reverseAware(i16, z11, size)).getSize();
                i16++;
            }
            int[] iArr2 = new int[size];
            if (z10) {
                if (vertical == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                vertical.arrange(density, i15, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalArrangement when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                horizontal.arrange(density, i15, iArr, LayoutDirection.Ltr, iArr2);
            }
            C10403h c10403hM24108v0 = AbstractC10968r.m24108v0(iArr2);
            if (z11) {
                c10403hM24108v0 = AbstractC10410o.m21766s(c10403hM24108v0);
            }
            int iM21733b = c10403hM24108v0.m21733b();
            int iM21734c = c10403hM24108v0.m21734c();
            int iM21735d = c10403hM24108v0.m21735d();
            if ((iM21735d > 0 && iM21733b <= iM21734c) || (iM21735d < 0 && iM21734c <= iM21733b)) {
                while (true) {
                    int size2 = iArr2[iM21733b];
                    LazyListMeasuredItem lazyListMeasuredItem = list.get(calculateItemsOffsets$reverseAware(iM21733b, z11, size));
                    if (z11) {
                        size2 = (i15 - size2) - lazyListMeasuredItem.getSize();
                    }
                    lazyListMeasuredItem.position(size2, i10, i11);
                    arrayList.add(lazyListMeasuredItem);
                    if (iM21733b == iM21734c) {
                        break;
                    }
                    iM21733b += iM21735d;
                }
            }
        } else {
            int size3 = list2.size();
            int mainAxisSizeWithSpacings = i14;
            for (int i17 = 0; i17 < size3; i17++) {
                LazyListMeasuredItem lazyListMeasuredItem2 = list2.get(i17);
                mainAxisSizeWithSpacings -= lazyListMeasuredItem2.getMainAxisSizeWithSpacings();
                lazyListMeasuredItem2.position(mainAxisSizeWithSpacings, i10, i11);
                arrayList.add(lazyListMeasuredItem2);
            }
            int size4 = list.size();
            int mainAxisSizeWithSpacings2 = i14;
            for (int i18 = 0; i18 < size4; i18++) {
                LazyListMeasuredItem lazyListMeasuredItem3 = list.get(i18);
                lazyListMeasuredItem3.position(mainAxisSizeWithSpacings2, i10, i11);
                arrayList.add(lazyListMeasuredItem3);
                mainAxisSizeWithSpacings2 += lazyListMeasuredItem3.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            while (i16 < size5) {
                LazyListMeasuredItem lazyListMeasuredItem4 = list3.get(i16);
                lazyListMeasuredItem4.position(mainAxisSizeWithSpacings2, i10, i11);
                arrayList.add(lazyListMeasuredItem4);
                mainAxisSizeWithSpacings2 += lazyListMeasuredItem4.getMainAxisSizeWithSpacings();
                i16++;
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }

    private static final List<LazyListMeasuredItem> createItemsAfterList(List<LazyListMeasuredItem> list, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i10, int i11, List<Integer> list2, float f10, boolean z10, LazyListLayoutInfo lazyListLayoutInfo) {
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
        int i12 = i10 - 1;
        int iMin2 = Math.min(((LazyListMeasuredItem) AbstractC10947g0.m23956y0(list)).getIndex() + i11, i12);
        int index2 = ((LazyListMeasuredItem) AbstractC10947g0.m23956y0(list)).getIndex() + 1;
        if (index2 <= iMin2) {
            int i13 = index2;
            arrayList = null;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(LazyListMeasuredItemProvider.m27573getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i13, 0L, 2, null));
                if (i13 == iMin2) {
                    break;
                }
                i13++;
            }
        } else {
            arrayList = null;
        }
        if (z10 && lazyListLayoutInfo != null && !lazyListLayoutInfo.getVisibleItemsInfo().isEmpty()) {
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
            LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) AbstractC10947g0.m23956y0(lazyListLayoutInfo.getVisibleItemsInfo());
            if (lazyListItemInfo != null && (index = lazyListItemInfo.getIndex()) <= (iMin = Math.min(lazyListItemInfo2.getIndex(), i12))) {
                int i14 = index;
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                lazyListMeasuredItem5 = null;
                                break;
                            }
                            lazyListMeasuredItem5 = arrayList.get(i15);
                            if (lazyListMeasuredItem5.getIndex() == i14) {
                                break;
                            }
                            i15++;
                        }
                        lazyListMeasuredItem4 = lazyListMeasuredItem5;
                    } else {
                        lazyListMeasuredItem4 = null;
                    }
                    if (lazyListMeasuredItem4 == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(LazyListMeasuredItemProvider.m27573getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i14, 0L, 2, null));
                    }
                    if (i14 == iMin) {
                        break;
                    }
                    i14++;
                }
            }
            float viewportEndOffset = ((lazyListLayoutInfo.getViewportEndOffset() - lazyListItemInfo2.getOffset()) - lazyListItemInfo2.getSize()) - f10;
            if (viewportEndOffset > 0.0f) {
                int index3 = lazyListItemInfo2.getIndex() + 1;
                int i16 = 0;
                while (index3 < i10 && i16 < viewportEndOffset) {
                    if (index3 <= iMin2) {
                        int size3 = list.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= size3) {
                                lazyListMeasuredItem3 = null;
                                break;
                            }
                            lazyListMeasuredItem3 = list.get(i17);
                            if (lazyListMeasuredItem3.getIndex() == index3) {
                                break;
                            }
                            i17++;
                        }
                        lazyListMeasuredItem = lazyListMeasuredItem3;
                    } else if (arrayList != null) {
                        int size4 = arrayList.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 >= size4) {
                                lazyListMeasuredItem2 = null;
                                break;
                            }
                            lazyListMeasuredItem2 = arrayList.get(i18);
                            if (lazyListMeasuredItem2.getIndex() == index3) {
                                break;
                            }
                            i18++;
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
                        arrayList.add(LazyListMeasuredItemProvider.m27573getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, index3, 0L, 2, null));
                        index3++;
                        mainAxisSizeWithSpacings = ((LazyListMeasuredItem) AbstractC10947g0.m23956y0(arrayList)).getMainAxisSizeWithSpacings();
                    }
                    i16 += mainAxisSizeWithSpacings;
                }
            }
        }
        if (arrayList != null && ((LazyListMeasuredItem) AbstractC10947g0.m23956y0(arrayList)).getIndex() > iMin2) {
            iMin2 = ((LazyListMeasuredItem) AbstractC10947g0.m23956y0(arrayList)).getIndex();
        }
        int size5 = list2.size();
        for (int i19 = 0; i19 < size5; i19++) {
            int iIntValue = list2.get(i19).intValue();
            if (iIntValue > iMin2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(LazyListMeasuredItemProvider.m27573getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, iIntValue, 0L, 2, null));
            }
        }
        return arrayList == null ? AbstractC10978w.m24136n() : arrayList;
    }

    private static final List<LazyListMeasuredItem> createItemsBeforeList(int i10, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i11, List<Integer> list) {
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider2;
        int iMax = Math.max(0, i10 - i11);
        int i12 = i10 - 1;
        ArrayList arrayList = null;
        if (iMax <= i12) {
            int i13 = i12;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
                arrayList.add(LazyListMeasuredItemProvider.m27573getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider2, i13, 0L, 2, null));
                if (i13 == iMax) {
                    break;
                }
                i13--;
                lazyListMeasuredItemProvider = lazyListMeasuredItemProvider2;
            }
        } else {
            lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i14 = size - 1;
                int iIntValue = list.get(size).intValue();
                if (iIntValue < iMax) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(LazyListMeasuredItemProvider.m27573getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider2, iIntValue, 0L, 2, null));
                }
                if (i14 < 0) {
                    break;
                }
                size = i14;
            }
        }
        return arrayList == null ? AbstractC10978w.m24136n() : arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03c0  */
    /* renamed from: measureLazyList-LCrQqZ4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.LazyListMeasureResult m27567measureLazyListLCrQqZ4(int r42, final androidx.compose.foundation.lazy.LazyListMeasuredItemProvider r43, int r44, int r45, int r46, int r47, int r48, int r49, float r50, long r51, boolean r53, androidx.compose.foundation.layout.Arrangement.Vertical r54, androidx.compose.foundation.layout.Arrangement.Horizontal r55, boolean r56, androidx.compose.p014ui.unit.Density r57, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<androidx.compose.foundation.lazy.LazyListMeasuredItem> r58, int r59, java.util.List<java.lang.Integer> r60, boolean r61, final boolean r62, androidx.compose.foundation.lazy.LazyListLayoutInfo r63, sd.InterfaceC11122i0 r64, final androidx.compose.runtime.MutableState<p309qc.C10786q> r65, androidx.compose.p014ui.graphics.GraphicsContext r66, androidx.compose.foundation.lazy.layout.StickyItemsPlacement r67, p181hd.InterfaceC9545q r68) {
        /*
            Method dump skipped, instructions count: 1119
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListMeasureKt.m27567measureLazyListLCrQqZ4(int, androidx.compose.foundation.lazy.LazyListMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator, int, java.util.List, boolean, boolean, androidx.compose.foundation.lazy.LazyListLayoutInfo, sd.i0, androidx.compose.runtime.MutableState, androidx.compose.ui.graphics.GraphicsContext, androidx.compose.foundation.lazy.layout.StickyItemsPlacement, hd.q):androidx.compose.foundation.lazy.LazyListMeasureResult");
    }
}
