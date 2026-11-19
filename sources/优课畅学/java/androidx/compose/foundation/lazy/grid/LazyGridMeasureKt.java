package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import p077d8.AbstractC8323h;
import p077d8.C8319d;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class LazyGridMeasureKt {
    private static final <T> void addAllFromArray(List<T> list, T[] tArr) {
        for (T t10 : tArr) {
            list.add(t10);
        }
    }

    private static final List<LazyGridMeasuredItem> calculateExtraItems(List<Integer> list, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, InterfaceC10570l interfaceC10570l) {
        LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider2;
        int size = list.size();
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < size) {
            int iIntValue = list.get(i10).intValue();
            if (((Boolean) interfaceC10570l.invoke(Integer.valueOf(iIntValue))).booleanValue()) {
                int iSpanOf = lazyGridMeasuredLineProvider.spanOf(iIntValue);
                lazyGridMeasuredItemProvider2 = lazyGridMeasuredItemProvider;
                LazyGridMeasuredItem lazyGridMeasuredItemMo20972getAndMeasurehBUhpc = lazyGridMeasuredItemProvider2.mo20972getAndMeasurehBUhpc(iIntValue, 0, iSpanOf, lazyGridMeasuredLineProvider.m21004childConstraintsJhjzzOo$foundation_release(0, iSpanOf));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lazyGridMeasuredItemMo20972getAndMeasurehBUhpc);
            } else {
                lazyGridMeasuredItemProvider2 = lazyGridMeasuredItemProvider;
            }
            i10++;
            lazyGridMeasuredItemProvider = lazyGridMeasuredItemProvider2;
        }
        return arrayList == null ? AbstractC8809v.m14771n() : arrayList;
    }

    private static final List<LazyGridMeasuredItem> calculateItemsOffsets(List<LazyGridMeasuredLine> list, List<LazyGridMeasuredItem> list2, List<LazyGridMeasuredItem> list3, int i10, int i11, int i12, int i13, int i14, boolean z10, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z11, Density density) {
        int i15 = z10 ? i11 : i10;
        boolean z12 = i12 < Math.min(i15, i13);
        if (z12) {
            if (!(i14 == 0)) {
                InlineClassHelperKt.throwIllegalStateException("non-zero firstLineScrollOffset");
            }
        }
        int size = list.size();
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
            C8319d c8319dM14739w0 = AbstractC8801r.m14739w0(iArr2);
            if (z11) {
                c8319dM14739w0 = AbstractC8323h.m13523r(c8319dM14739w0);
            }
            int iM13496b = c8319dM14739w0.m13496b();
            int iM13497c = c8319dM14739w0.m13497c();
            int iM13498d = c8319dM14739w0.m13498d();
            if ((iM13498d > 0 && iM13496b <= iM13497c) || (iM13498d < 0 && iM13497c <= iM13496b)) {
                while (true) {
                    int mainAxisSize = iArr2[iM13496b];
                    LazyGridMeasuredLine lazyGridMeasuredLine = list.get(calculateItemsOffsets$reverseAware(iM13496b, z11, size2));
                    if (z11) {
                        mainAxisSize = (i15 - mainAxisSize) - lazyGridMeasuredLine.getMainAxisSize();
                    }
                    addAllFromArray(arrayList, lazyGridMeasuredLine.position(mainAxisSize, i10, i11));
                    if (iM13496b == iM13497c) {
                        break;
                    }
                    iM13496b += iM13498d;
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
            int size4 = list.size();
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
            java.lang.Object r9 = p134i7.AbstractC8778f0.m14578x0(r9)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r9 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r9
            java.lang.Object r10 = p134i7.AbstractC8778f0.m14579y0(r10)
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
            if (r0 != 0) goto Lb2
            java.util.List r6 = p134i7.AbstractC8809v.m14771n()
            return r6
        Lb2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.linesRetainedForLookahead(int, int, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider, boolean, java.util.List, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0437  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* renamed from: measureLazyGrid-GyuLg2I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.grid.LazyGridMeasureResult m21000measureLazyGridGyuLg2I(int r55, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider r56, final androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider r57, int r58, int r59, int r60, int r61, int r62, int r63, float r64, long r65, boolean r67, androidx.compose.foundation.layout.Arrangement.Vertical r68, androidx.compose.foundation.layout.Arrangement.Horizontal r69, boolean r70, androidx.compose.p013ui.unit.Density r71, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem> r72, int r73, java.util.List<java.lang.Integer> r74, boolean r75, final boolean r76, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo r77, p135i8.InterfaceC8822b0 r78, final androidx.compose.runtime.MutableState<p123h7.C8736p> r79, androidx.compose.p013ui.graphics.GraphicsContext r80, p300x7.InterfaceC10570l r81, androidx.compose.foundation.lazy.layout.StickyItemsPlacement r82, p300x7.InterfaceC10575q r83) {
        /*
            Method dump skipped, instructions count: 1190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.m21000measureLazyGridGyuLg2I(int, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator, int, java.util.List, boolean, boolean, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo, i8.b0, androidx.compose.runtime.MutableState, androidx.compose.ui.graphics.GraphicsContext, x7.l, androidx.compose.foundation.lazy.layout.StickyItemsPlacement, x7.q):androidx.compose.foundation.lazy.grid.LazyGridMeasureResult");
    }
}
