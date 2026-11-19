package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p265nd.C10403h;
import p325rc.AbstractC10968r;
import p325rc.AbstractC10978w;

/* loaded from: classes.dex */
public final class LazyGridMeasureKt {
    private static final <T> void addAllFromArray(List<T> list, T[] tArr) {
        for (T t10 : tArr) {
            list.add(t10);
        }
    }

    private static final List<LazyGridMeasuredItem> calculateExtraItems(List<Integer> list, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, InterfaceC9540l interfaceC9540l) {
        LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider2;
        int size = list.size();
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < size) {
            int iIntValue = list.get(i10).intValue();
            if (((Boolean) interfaceC9540l.invoke(Integer.valueOf(iIntValue))).booleanValue()) {
                int iSpanOf = lazyGridMeasuredLineProvider.spanOf(iIntValue);
                lazyGridMeasuredItemProvider2 = lazyGridMeasuredItemProvider;
                LazyGridMeasuredItem lazyGridMeasuredItemMo27574getAndMeasurehBUhpc = lazyGridMeasuredItemProvider2.mo27574getAndMeasurehBUhpc(iIntValue, 0, iSpanOf, lazyGridMeasuredLineProvider.m27606childConstraintsJhjzzOo$foundation_release(0, iSpanOf));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lazyGridMeasuredItemMo27574getAndMeasurehBUhpc);
            } else {
                lazyGridMeasuredItemProvider2 = lazyGridMeasuredItemProvider;
            }
            i10++;
            lazyGridMeasuredItemProvider = lazyGridMeasuredItemProvider2;
        }
        return arrayList == null ? AbstractC10978w.m24136n() : arrayList;
    }

    private static final List<LazyGridMeasuredItem> calculateItemsOffsets(List<LazyGridMeasuredLine> list, List<LazyGridMeasuredItem> list2, List<LazyGridMeasuredItem> list3, int i10, int i11, int i12, int i13, int i14, boolean z10, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z11, Density density) {
        int i15 = z10 ? i11 : i10;
        boolean z12 = i12 < Math.min(i15, i13);
        if (z12) {
            if (!(i14 == 0)) {
                InlineClassHelperKt.throwIllegalStateException("non-zero firstLineScrollOffset");
            }
        }
        List<LazyGridMeasuredLine> list4 = list;
        int size = list4.size();
        int length = 0;
        for (int i16 = 0; i16 < size; i16++) {
            length += list.get(i16).getItems().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (z12) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                InlineClassHelperKt.throwIllegalArgumentException("no items");
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i17 = 0; i17 < size2; i17++) {
                iArr[i17] = list.get(calculateItemsOffsets$reverseAware(i17, z11, size2)).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            if (z10) {
                if (vertical == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement");
                    throw new KotlinNothingValueException();
                }
                vertical.arrange(density, i15, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalArrangement");
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
                    int mainAxisSize = iArr2[iM21733b];
                    LazyGridMeasuredLine lazyGridMeasuredLine = list.get(calculateItemsOffsets$reverseAware(iM21733b, z11, size2));
                    if (z11) {
                        mainAxisSize = (i15 - mainAxisSize) - lazyGridMeasuredLine.getMainAxisSize();
                    }
                    addAllFromArray(arrayList, lazyGridMeasuredLine.position(mainAxisSize, i10, i11));
                    if (iM21733b == iM21734c) {
                        break;
                    }
                    iM21733b += iM21735d;
                }
            }
        } else {
            int size3 = list2.size() - 1;
            if (size3 >= 0) {
                int mainAxisSizeWithSpacings = i14;
                while (true) {
                    int i18 = size3 - 1;
                    LazyGridMeasuredItem lazyGridMeasuredItem = list2.get(size3);
                    mainAxisSizeWithSpacings -= lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                    lazyGridMeasuredItem.position(mainAxisSizeWithSpacings, 0, i10, i11);
                    arrayList.add(lazyGridMeasuredItem);
                    if (i18 < 0) {
                        break;
                    }
                    size3 = i18;
                }
            }
            int size4 = list4.size();
            int mainAxisSizeWithSpacings2 = i14;
            for (int i19 = 0; i19 < size4; i19++) {
                LazyGridMeasuredLine lazyGridMeasuredLine2 = list.get(i19);
                addAllFromArray(arrayList, lazyGridMeasuredLine2.position(mainAxisSizeWithSpacings2, i10, i11));
                mainAxisSizeWithSpacings2 += lazyGridMeasuredLine2.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            for (int i20 = 0; i20 < size5; i20++) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = list3.get(i20);
                lazyGridMeasuredItem2.position(mainAxisSizeWithSpacings2, 0, i10, i11);
                arrayList.add(lazyGridMeasuredItem2);
                mainAxisSizeWithSpacings2 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad A[LOOP:1: B:25:0x0072->B:39:0x00ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b0 A[EDGE_INSN: B:49:0x00b0->B:40:0x00b0 BREAK  A[LOOP:1: B:25:0x0072->B:39:0x00ad], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine> linesRetainedForLookahead(int r6, int r7, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider r8, boolean r9, java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine> r10, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo r11) {
        /*
            r0 = 0
            if (r9 == 0) goto Lb0
            if (r11 == 0) goto Lb0
            java.util.List r9 = r11.getVisibleItemsInfo()
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto Lb0
            java.util.List r9 = r11.getVisibleItemsInfo()
            int r1 = r9.size()
            int r1 = r1 + (-1)
        L1b:
            r2 = -1
            if (r2 >= r1) goto L44
            java.lang.Object r2 = r9.get(r1)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r2 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r2
            int r2 = r2.getIndex()
            if (r2 <= r6) goto L41
            if (r1 == 0) goto L3a
            int r2 = r1 + (-1)
            java.lang.Object r2 = r9.get(r2)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r2 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r2
            int r2 = r2.getIndex()
            if (r2 > r6) goto L41
        L3a:
            java.lang.Object r6 = r9.get(r1)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r6 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r6
            goto L45
        L41:
            int r1 = r1 + (-1)
            goto L1b
        L44:
            r6 = r0
        L45:
            java.util.List r9 = r11.getVisibleItemsInfo()
            java.lang.Object r9 = p325rc.AbstractC10947g0.m23956y0(r9)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r9 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r9
            java.lang.Object r10 = p325rc.AbstractC10947g0.m23957z0(r10)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r10 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r10
            r11 = 0
            if (r10 == 0) goto L5f
            int r10 = r10.getIndex()
            int r10 = r10 + 1
            goto L60
        L5f:
            r10 = r11
        L60:
            if (r6 == 0) goto Lb0
            int r6 = r6.getIndex()
            int r9 = r9.getIndex()
            int r7 = r7 + (-1)
            int r7 = java.lang.Math.min(r9, r7)
            if (r6 > r7) goto Lb0
        L72:
            if (r0 == 0) goto L9b
            r9 = r0
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            r1 = r11
        L7c:
            if (r1 >= r9) goto L9b
            java.lang.Object r2 = r0.get(r1)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r2 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r2
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r2 = r2.getItems()
            int r3 = r2.length
            r4 = r11
        L8a:
            if (r4 >= r3) goto L98
            r5 = r2[r4]
            int r5 = r5.getIndex()
            if (r5 != r6) goto L95
            goto Lab
        L95:
            int r4 = r4 + 1
            goto L8a
        L98:
            int r1 = r1 + 1
            goto L7c
        L9b:
            if (r0 != 0) goto La2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        La2:
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r9 = r8.getAndMeasure(r10)
            int r10 = r10 + 1
            r0.add(r9)
        Lab:
            if (r6 == r7) goto Lb0
            int r6 = r6 + 1
            goto L72
        Lb0:
            if (r0 != 0) goto Lb7
            java.util.List r6 = p325rc.AbstractC10978w.m24136n()
            return r6
        Lb7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.linesRetainedForLookahead(int, int, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider, boolean, java.util.List, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0445  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* renamed from: measureLazyGrid-GyuLg2I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.grid.LazyGridMeasureResult m27602measureLazyGridGyuLg2I(int r55, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider r56, final androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider r57, int r58, int r59, int r60, int r61, int r62, int r63, float r64, long r65, boolean r67, androidx.compose.foundation.layout.Arrangement.Vertical r68, androidx.compose.foundation.layout.Arrangement.Horizontal r69, boolean r70, androidx.compose.p014ui.unit.Density r71, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem> r72, int r73, java.util.List<java.lang.Integer> r74, boolean r75, final boolean r76, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo r77, sd.InterfaceC11122i0 r78, final androidx.compose.runtime.MutableState<p309qc.C10786q> r79, androidx.compose.p014ui.graphics.GraphicsContext r80, p181hd.InterfaceC9540l r81, androidx.compose.foundation.lazy.layout.StickyItemsPlacement r82, p181hd.InterfaceC9545q r83) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.m27602measureLazyGridGyuLg2I(int, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator, int, java.util.List, boolean, boolean, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo, sd.i0, androidx.compose.runtime.MutableState, androidx.compose.ui.graphics.GraphicsContext, hd.l, androidx.compose.foundation.lazy.layout.StickyItemsPlacement, hd.q):androidx.compose.foundation.lazy.grid.LazyGridMeasureResult");
    }
}
