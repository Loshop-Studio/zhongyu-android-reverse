package androidx.compose.p013ui.node;

/* loaded from: classes2.dex */
public final class MyersDiffKt {
    private static final void applyDiff(IntStack intStack, DiffCallback diffCallback) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < intStack.getSize()) {
            int i13 = i10 + 2;
            int i14 = intStack.get(i10) - intStack.get(i13);
            int i15 = intStack.get(i10 + 1) - intStack.get(i13);
            int i16 = intStack.get(i13);
            i10 += 3;
            while (i11 < i14) {
                diffCallback.remove(i12, i11);
                i11++;
            }
            while (i12 < i15) {
                diffCallback.insert(i12);
                i12++;
            }
            while (true) {
                int i17 = i16 - 1;
                if (i16 > 0) {
                    diffCallback.same(i11, i12);
                    i11++;
                    i12++;
                    i16 = i17;
                }
            }
        }
    }

    /* renamed from: backward-4l5_RBY, reason: not valid java name */
    private static final boolean m25860backward4l5_RBY(int i10, int i11, int i12, int i13, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iM25744getimpl;
        int i15;
        int i16;
        int i17 = (i11 - i10) - (i13 - i12);
        boolean z10 = (i17 & 1) == 0;
        int i18 = -i14;
        for (int i19 = i18; i19 <= i14; i19 += 2) {
            if (i19 == i18 || (i19 != i14 && CenteredArray.m25744getimpl(iArr2, i19 + 1) < CenteredArray.m25744getimpl(iArr2, i19 - 1))) {
                iM25744getimpl = CenteredArray.m25744getimpl(iArr2, i19 + 1);
                i15 = iM25744getimpl;
            } else {
                iM25744getimpl = CenteredArray.m25744getimpl(iArr2, i19 - 1);
                i15 = iM25744getimpl - 1;
            }
            int i20 = i13 - ((i11 - i15) - i19);
            int i21 = ((i14 != 0 ? 1 : 0) & (i15 == iM25744getimpl ? 1 : 0)) + i20;
            while (i15 > i10 && i20 > i12) {
                if (!diffCallback.areItemsTheSame(i15 - 1, i20 - 1)) {
                    break;
                }
                i15--;
                i20--;
            }
            CenteredArray.m25747setimpl(iArr2, i19, i15);
            if (z10 && (i16 = i17 - i19) >= i18 && i16 <= i14) {
                if (CenteredArray.m25744getimpl(iArr, i16) >= i15) {
                    fillSnake(i15, i20, iM25744getimpl, i21, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final IntStack calculateDiff(int i10, int i11, DiffCallback diffCallback) {
        char c10 = 1;
        int i12 = ((i10 + i11) + 1) / 2;
        IntStack intStack = new IntStack(i12 * 3);
        IntStack intStack2 = new IntStack(i12 * 4);
        intStack2.pushRange(0, i10, 0, i11);
        int i13 = (i12 * 2) + 1;
        int[] iArrM25741constructorimpl = CenteredArray.m25741constructorimpl(new int[i13]);
        int[] iArrM25741constructorimpl2 = CenteredArray.m25741constructorimpl(new int[i13]);
        int[] iArrM25973constructorimpl = Snake.m25973constructorimpl(new int[5]);
        while (intStack2.isNotEmpty()) {
            int iPop = intStack2.pop();
            int iPop2 = intStack2.pop();
            int iPop3 = intStack2.pop();
            int iPop4 = intStack2.pop();
            int[] iArr = iArrM25973constructorimpl;
            if (m25862midPointq5eDKzI(iPop4, iPop3, iPop2, iPop, diffCallback, iArrM25741constructorimpl, iArrM25741constructorimpl2, iArrM25973constructorimpl)) {
                char c11 = c10;
                if (Math.min(iArr[2] - iArr[0], iArr[3] - iArr[c10]) > 0) {
                    Snake.m25971addDiagonalToStackimpl(iArr, intStack);
                }
                intStack2.pushRange(iPop4, iArr[0], iPop2, iArr[c11]);
                intStack2.pushRange(iArr[2], iPop3, iArr[3], iPop);
                iArrM25973constructorimpl = iArr;
                c10 = c11;
            } else {
                iArrM25973constructorimpl = iArr;
            }
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i10, i11, 0);
        return intStack;
    }

    public static final void executeDiff(int i10, int i11, DiffCallback diffCallback) {
        applyDiff(calculateDiff(i10, i11, diffCallback), diffCallback);
    }

    public static final void fillSnake(int i10, int i11, int i12, int i13, boolean z10, int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        iArr[3] = i13;
        iArr[4] = z10 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* renamed from: forward-4l5_RBY, reason: not valid java name */
    private static final boolean m25861forward4l5_RBY(int i10, int i11, int i12, int i13, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iM25744getimpl;
        int i15;
        ?? r16;
        int i16 = (i11 - i10) - (i13 - i12);
        int i17 = 1;
        boolean z10 = (Math.abs(i16) & 1) == 1;
        int i18 = -i14;
        int i19 = i18;
        while (i19 <= i14) {
            if (i19 == i18 || (i19 != i14 && CenteredArray.m25744getimpl(iArr, i19 + 1) > CenteredArray.m25744getimpl(iArr, i19 - 1))) {
                iM25744getimpl = CenteredArray.m25744getimpl(iArr, i19 + 1);
                i15 = iM25744getimpl;
            } else {
                iM25744getimpl = CenteredArray.m25744getimpl(iArr, i19 - 1);
                i15 = iM25744getimpl + 1;
            }
            int i20 = (i12 + (i15 - i10)) - i19;
            int i21 = i20 - ((i14 != 0 ? i17 : 0) & (i15 == iM25744getimpl ? i17 : 0));
            while (i15 < i11 && i20 < i13) {
                if (!diffCallback.areItemsTheSame(i15, i20)) {
                    break;
                }
                i15++;
                i20++;
            }
            CenteredArray.m25747setimpl(iArr, i19, i15);
            if (z10) {
                int i22 = i16 - i19;
                r16 = i17;
                r16 = r16;
                if (i22 >= i18 + 1) {
                    r16 = r16;
                    if (i22 <= i14 - 1) {
                        if (CenteredArray.m25744getimpl(iArr2, i22) <= i15) {
                            fillSnake(iM25744getimpl, i21, i15, i20, false, iArr3);
                            return r16;
                        }
                    }
                }
                i19 += 2;
                i17 = r16;
            } else {
                r16 = i17;
            }
            i19 += 2;
            i17 = r16;
        }
        return false;
    }

    /* renamed from: midPoint-q5eDKzI, reason: not valid java name */
    private static final boolean m25862midPointq5eDKzI(int i10, int i11, int i12, int i13, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i14 = i11 - i10;
        int i15 = i13 - i12;
        if (i14 >= 1 && i15 >= 1) {
            int i16 = ((i14 + i15) + 1) / 2;
            int[] iArr4 = iArr;
            CenteredArray.m25747setimpl(iArr4, 1, i10);
            int[] iArr5 = iArr2;
            CenteredArray.m25747setimpl(iArr5, 1, i11);
            int i17 = 0;
            while (i17 < i16) {
                if (m25861forward4l5_RBY(i10, i11, i12, i13, diffCallback, iArr4, iArr5, i17, iArr3) || m25860backward4l5_RBY(i10, i11, i12, i13, diffCallback, iArr, iArr2, i17, iArr3)) {
                    return true;
                }
                i17++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(int[] iArr, int i10, int i11) {
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
    }

    private static final int toInt(boolean z10) {
        return z10 ? 1 : 0;
    }
}
