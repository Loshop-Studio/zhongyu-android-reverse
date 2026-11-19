package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p014ui.graphics.GraphicsContext;
import java.util.ArrayList;
import java.util.List;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p325rc.AbstractC10978w;
import p325rc.C10958m;
import sd.InterfaceC11122i0;

/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;
    private static final int Unset = Integer.MIN_VALUE;

    private static final List<LazyStaggeredGridMeasuredItem> calculateExtraItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, boolean z10) {
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        ArrayList arrayList = null;
        if (z10) {
            int size = pinnedItems.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i10 = size - 1;
                    int iIntValue = pinnedItems.get(size).intValue();
                    if (((Boolean) interfaceC9540l2.invoke(Integer.valueOf(iIntValue))).booleanValue()) {
                        long jM27673getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m27673getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue, 0);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM27682getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m27682getAndMeasurejy6DScQ(iIntValue, jM27673getSpanRangelOCCd4c);
                        interfaceC9540l.invoke(lazyStaggeredGridMeasuredItemM27682getAndMeasurejy6DScQ);
                        arrayList.add(lazyStaggeredGridMeasuredItemM27682getAndMeasurejy6DScQ);
                    }
                    if (i10 < 0) {
                        break;
                    }
                    size = i10;
                }
            }
        } else {
            int size2 = pinnedItems.size();
            for (int i11 = 0; i11 < size2; i11++) {
                int iIntValue2 = pinnedItems.get(i11).intValue();
                if (((Boolean) interfaceC9540l2.invoke(Integer.valueOf(iIntValue2))).booleanValue()) {
                    long jM27673getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext.m27673getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue2, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM27682getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m27682getAndMeasurejy6DScQ(iIntValue2, jM27673getSpanRangelOCCd4c2);
                    interfaceC9540l.invoke(lazyStaggeredGridMeasuredItemM27682getAndMeasurejy6DScQ2);
                    arrayList.add(lazyStaggeredGridMeasuredItemM27682getAndMeasurejy6DScQ2);
                }
            }
        }
        return arrayList == null ? AbstractC10978w.m24136n() : arrayList;
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateVisibleItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, C10958m[] c10958mArr, int[] iArr, int i10, int i11, int i12) {
        int size = 0;
        for (C10958m c10958m : c10958mArr) {
            size += c10958m.size();
        }
        ArrayList arrayList = new ArrayList(size);
        while (true) {
            for (C10958m c10958m2 : c10958mArr) {
                if (!c10958m2.isEmpty()) {
                    int length = c10958mArr.length;
                    int i13 = -1;
                    int i14 = Integer.MAX_VALUE;
                    for (int i15 = 0; i15 < length; i15++) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) c10958mArr[i15].m23969f();
                        int index = lazyStaggeredGridMeasuredItem != null ? lazyStaggeredGridMeasuredItem.getIndex() : Integer.MAX_VALUE;
                        if (i14 > index) {
                            i13 = i15;
                            i14 = index;
                        }
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) c10958mArr[i13].removeFirst();
                    if (lazyStaggeredGridMeasuredItem2.getLane() == i13) {
                        long jM27688constructorimpl = SpanRange.m27688constructorimpl(lazyStaggeredGridMeasuredItem2.getLane(), lazyStaggeredGridMeasuredItem2.getSpan());
                        int iM27677maxInRangejy6DScQ = m27677maxInRangejy6DScQ(iArr, jM27688constructorimpl);
                        int i16 = lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i13];
                        if (lazyStaggeredGridMeasuredItem2.getMainAxisSize() + iM27677maxInRangejy6DScQ >= i11 && iM27677maxInRangejy6DScQ <= i12) {
                            lazyStaggeredGridMeasuredItem2.position(iM27677maxInRangejy6DScQ, i16, i10);
                            arrayList.add(lazyStaggeredGridMeasuredItem2);
                        }
                        int i17 = (int) (jM27688constructorimpl & 4294967295L);
                        for (int i18 = (int) (jM27688constructorimpl >> 32); i18 < i17; i18++) {
                            iArr[i18] = lazyStaggeredGridMeasuredItem2.getMainAxisSizeWithSpacings() + iM27677maxInRangejy6DScQ;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final String debugRender(C10958m[] c10958mArr) {
        return "";
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i10) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i11 = length - 1;
            while (true) {
                if (iArr[length] < i10 && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[length], length);
            }
            if (i11 < 0) {
                return;
            } else {
                length = i11;
            }
        }
    }

    private static final <T> void fastForEach(List<? extends T> list, boolean z10, InterfaceC9540l interfaceC9540l) {
        if (!z10) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                interfaceC9540l.invoke(list.get(i10));
            }
            return;
        }
        int size2 = list.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i11 = size2 - 1;
            interfaceC9540l.invoke(list.get(size2));
            if (i11 < 0) {
                return;
            } else {
                size2 = i11;
            }
        }
    }

    public static /* synthetic */ void fastForEach$default(List list, boolean z10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if (!z10) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                interfaceC9540l.invoke(list.get(i11));
            }
            return;
        }
        int size2 = list.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i12 = size2 - 1;
            interfaceC9540l.invoke(list.get(size2));
            if (i12 < 0) {
                return;
            } else {
                size2 = i12;
            }
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i10, int i11) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i10, i11);
    }

    /* renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m27676forEachnIS5qE8(long j10, InterfaceC9540l interfaceC9540l) {
        int i10 = (int) (j10 & 4294967295L);
        for (int i11 = (int) (j10 >> 32); i11 < i10; i11++) {
            interfaceC9540l.invoke(Integer.valueOf(i11));
        }
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i10 = -1;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (i11 < i13) {
                i10 = i12;
                i11 = i13;
            }
        }
        return i10;
    }

    private static final <T> int indexOfMinBy(T[] tArr, InterfaceC9540l interfaceC9540l) {
        int length = tArr.length;
        int i10 = -1;
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < length; i12++) {
            int iIntValue = ((Number) interfaceC9540l.invoke(tArr[i12])).intValue();
            if (i11 > iIntValue) {
                i10 = i12;
                i11 = iIntValue;
            }
        }
        return i10;
    }

    public static final int indexOfMinValue(int[] iArr, int i10) {
        int length = iArr.length;
        int i11 = -1;
        int i12 = Integer.MAX_VALUE;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = i10 + 1;
            int i15 = iArr[i13];
            if (i14 <= i15 && i15 < i12) {
                i11 = i13;
                i12 = i15;
            }
        }
        return i11;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> itemsRetainedForLookahead(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext r7, int r8, int r9, boolean r10, p181hd.InterfaceC9544p r11) {
        /*
            r0 = 0
            if (r10 == 0) goto Lf1
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo r10 = r7.getApproachLayoutInfo()
            if (r10 == 0) goto Lf1
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo r10 = r7.getApproachLayoutInfo()
            java.util.List r10 = r10.getVisibleItemsInfo()
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto Lf1
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo r10 = r7.getApproachLayoutInfo()
            java.util.List r10 = r10.getVisibleItemsInfo()
            int r1 = r10.size()
            int r1 = r1 + (-1)
        L27:
            r2 = -1
            if (r2 >= r1) goto L50
            java.lang.Object r2 = r10.get(r1)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r2 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r2
            int r2 = r2.getIndex()
            if (r2 <= r8) goto L4d
            if (r1 == 0) goto L46
            int r2 = r1 + (-1)
            java.lang.Object r2 = r10.get(r2)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r2 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r2
            int r2 = r2.getIndex()
            if (r2 > r8) goto L4d
        L46:
            java.lang.Object r8 = r10.get(r1)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r8 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r8
            goto L51
        L4d:
            int r1 = r1 + (-1)
            goto L27
        L50:
            r8 = r0
        L51:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo r10 = r7.getApproachLayoutInfo()
            java.util.List r10 = r10.getVisibleItemsInfo()
            java.lang.Object r10 = p325rc.AbstractC10947g0.m23956y0(r10)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r10 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r10
            if (r8 == 0) goto Lf1
            int r8 = r8.getIndex()
            int r10 = r10.getIndex()
            int r9 = r9 + (-1)
            int r9 = java.lang.Math.min(r10, r9)
            if (r8 > r9) goto Lf1
            r10 = r0
        L72:
            r1 = 0
            if (r10 == 0) goto L8f
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r3 = r1
        L7d:
            if (r3 >= r2) goto L8f
            java.lang.Object r4 = r10.get(r3)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r4 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r4
            int r4 = r4.getIndex()
            if (r4 != r8) goto L8c
            goto Leb
        L8c:
            int r3 = r3 + 1
            goto L7d
        L8f:
            if (r10 != 0) goto L96
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L96:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo r2 = r7.getApproachLayoutInfo()
            java.util.List r2 = r2.getVisibleItemsInfo()
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = r1
        La6:
            if (r4 >= r3) goto Lb9
            java.lang.Object r5 = r2.get(r4)
            r6 = r5
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r6 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r6
            int r6 = r6.getIndex()
            if (r6 != r8) goto Lb6
            goto Lba
        Lb6:
            int r4 = r4 + 1
            goto La6
        Lb9:
            r5 = r0
        Lba:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r5 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r5
            if (r5 == 0) goto Lc3
            int r2 = r5.getLane()
            goto Lc4
        Lc3:
            r2 = r1
        Lc4:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r3 = r7.getItemProvider()
            long r3 = r7.m27673getSpanRangelOCCd4c(r3, r8, r2)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r5 = r7.getMeasuredItemProvider()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r3 = r5.m27682getAndMeasurejy6DScQ(r8, r3)
            r10.add(r3)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots r4 = r7.getResolvedSlots()
            int[] r4 = r4.getPositions()
            int r5 = r4.length
            if (r5 <= r2) goto Le4
            r1 = r4[r2]
        Le4:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.invoke(r3, r1)
        Leb:
            if (r8 == r9) goto Lf0
            int r8 = r8 + 1
            goto L72
        Lf0:
            return r10
        Lf1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.itemsRetainedForLookahead(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext, int, int, boolean, hd.p):java.util.List");
    }

    /* renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m27677maxInRangejy6DScQ(int[] iArr, long j10) {
        int i10 = (int) (j10 & 4294967295L);
        int iMax = Integer.MIN_VALUE;
        for (int i11 = (int) (j10 >> 32); i11 < i10; i11++) {
            iMax = Math.max(iMax, iArr[i11]);
        }
        return iMax;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x02f2, code lost:
    
        r4 = indexOfMinValue$default(r7, 0, 1, null);
        r6 = indexOfMaxValue(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02fd, code lost:
    
        if (r4 == r6) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0303, code lost:
    
        if (r7[r4] != r7[r6]) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0305, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0307, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0308, code lost:
    
        r6 = r28[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x030b, code lost:
    
        if (r6 != (-1)) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x030d, code lost:
    
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x030e, code lost:
    
        r6 = findPreviousItemIndex(r0, r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0312, code lost:
    
        if (r6 >= 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0314, code lost:
    
        r8 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0316, code lost:
    
        if (r1 != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x031c, code lost:
    
        if (measure$lambda$43$misalignedStart(r8, r0, r7, r4) == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x031e, code lost:
    
        if (r49 == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0320, code lost:
    
        r0.getLaneInfo().reset();
        r1 = r8.length;
        r2 = new int[r1];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x032b, code lost:
    
        if (r3 >= r1) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x032d, code lost:
    
        r2[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0334, code lost:
    
        r1 = r7.length;
        r3 = new int[r1];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0338, code lost:
    
        if (r5 >= r1) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x033a, code lost:
    
        r3[r5] = r7[r4];
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0348, code lost:
    
        return measure(r0, r29, r2, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0351, code lost:
    
        r8 = r28;
        r11 = r29;
        r25 = r14;
        r13 = r0.m27673getSpanRangelOCCd4c(r0.getItemProvider(), r6, r4);
        r4 = r0.getLaneInfo();
        r15 = r1;
        r46 = r2;
        r1 = (int) (r13 & 4294967295L);
        r27 = r3;
        r2 = (int) (r13 >> 32);
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0373, code lost:
    
        if (r3 == 1) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0375, code lost:
    
        r2 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0377, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0379, code lost:
    
        r4.setLane(r6, r2);
        r2 = r0.getMeasuredItemProvider().m27682getAndMeasurejy6DScQ(r6, r13);
        r4 = m27677maxInRangejy6DScQ(r7, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0389, code lost:
    
        if (r3 == 1) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x038b, code lost:
    
        r3 = r0.getLaneInfo().getGaps(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0394, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0395, code lost:
    
        r14 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0397, code lost:
    
        if (r14 >= r1) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x039b, code lost:
    
        if (r7[r14] == r4) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x039d, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x039e, code lost:
    
        r48[r14].addFirst(r2);
        r8[r14] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03a5, code lost:
    
        if (r3 != null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03a7, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03a9, code lost:
    
        r13 = r3[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03ab, code lost:
    
        r7[r14] = (r4 + r2.getMainAxisSizeWithSpacings()) + r13;
        r14 = r14 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:329:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0723 A[LOOP:21: B:312:0x066e->B:353:0x0723, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0735 A[EDGE_INSN: B:540:0x0735->B:355:0x0735 BREAK  A[LOOP:21: B:312:0x066e->B:353:0x0723], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult measure(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext r45, int r46, int[] r47, int[] r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 2773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.measure(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext, int, int[], int[], boolean):androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult");
    }

    private static final boolean measure$lambda$43$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            if (iArr2[i10] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i11 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$43$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i10) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i11], i11) == -1 && iArr2[i11] != iArr2[i10]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i12 = 0; i12 < length2; i12++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i12], i12) != -1 && iArr2[i12] >= iArr2[i10]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    /* renamed from: measureStaggeredGrid-C6celF4, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m27678measureStaggeredGridC6celF4(LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j10, boolean z10, boolean z11, long j11, int i10, int i11, int i12, int i13, InterfaceC11122i0 interfaceC11122i0, boolean z12, boolean z13, LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, GraphicsContext graphicsContext) {
        int iM27677maxInRangejy6DScQ;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j10, z10, lazyLayoutMeasureScope, i10, j11, i12, i13, z11, i11, interfaceC11122i0, z12, z13, lazyStaggeredGridLayoutInfo, graphicsContext, null);
        int[] iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyStaggeredGridItemProvider, lazyStaggeredGridState.getScrollPosition$foundation_release().getIndices());
        int[] scrollOffsets = lazyStaggeredGridState.getScrollPosition$foundation_release().getScrollOffsets();
        if (iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
            int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr = new int[laneCount];
            int i14 = 0;
            while (i14 < laneCount) {
                if (i14 >= iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release.length || (iM27677maxInRangejy6DScQ = iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release[i14]) == -1) {
                    iM27677maxInRangejy6DScQ = i14 == 0 ? 0 : m27677maxInRangejy6DScQ(iArr, SpanRange.m27688constructorimpl(0, i14)) + 1;
                }
                iArr[i14] = iM27677maxInRangejy6DScQ;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i14], i14);
                i14++;
            }
            iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = iArr;
        }
        if (scrollOffsets.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            int laneCount2 = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr2 = new int[laneCount2];
            int i15 = 0;
            while (i15 < laneCount2) {
                iArr2[i15] = i15 < scrollOffsets.length ? scrollOffsets[i15] : i15 == 0 ? 0 : iArr2[i15 - 1];
                i15++;
            }
            scrollOffsets = iArr2;
        }
        return measure(lazyStaggeredGridMeasureContext, Math.round(lazyStaggeredGridState.scrollToBeConsumed$foundation_release(z13)), iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release, scrollOffsets, true);
    }

    private static final void offsetBy(int[] iArr, int i10) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = iArr[i11] + i10;
        }
    }

    private static final int[] transform(int[] iArr, InterfaceC9540l interfaceC9540l) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) interfaceC9540l.invoke(Integer.valueOf(iArr[i10]))).intValue();
        }
        return iArr;
    }

    private static final <T> T withDebugLogging(LazyLayoutMeasureScope lazyLayoutMeasureScope, InterfaceC9540l interfaceC9540l) {
        return (T) interfaceC9540l.invoke(lazyLayoutMeasureScope);
    }

    private static final void debugLog(InterfaceC9529a interfaceC9529a) {
    }
}
