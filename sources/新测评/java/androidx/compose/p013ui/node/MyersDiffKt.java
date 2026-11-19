package androidx.compose.p013ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0016\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001aZ\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002\u001a \u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a8\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0012H\u0000\u001aZ\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010\u0014\u001aR\u0010!\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001c\u0010$\u001a\u00020\u0001*\u00020\u00122\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0002\u001a\r\u0010'\u001a\u00020\t*\u00020\u0007H\u0082\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, m13558d2 = {"applyDiff", "", "diagonals", "Landroidx/compose/ui/node/IntStack;", "callback", "Landroidx/compose/ui/node/DiffCallback;", "backward", "", "oldStart", "", "oldEnd", "newStart", "newEnd", "cb", "forward", "Landroidx/compose/ui/node/CenteredArray;", "d", "snake", "", "backward-4l5_RBY", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z", "calculateDiff", "oldSize", "newSize", "executeDiff", "fillSnake", "startX", "startY", "endX", "endY", "reverse", "data", "forward-4l5_RBY", "midPoint", "midPoint-q5eDKzI", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[I[I)Z", "swap", "i", "j", "toInt", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n+ 2 MyersDiff.kt\nandroidx/compose/ui/node/Snake\n*L\n1#1,518:1\n375#1:528\n375#1:529\n329#2:519\n318#2:520\n310#2:521\n322#2:522\n314#2:523\n310#2:524\n314#2:525\n318#2:526\n322#2:527\n*S KotlinDebug\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n*L\n203#1:528\n270#1:529\n75#1:519\n75#1:520\n75#1:521\n75#1:522\n75#1:523\n82#1:524\n84#1:525\n89#1:526\n91#1:527\n*E\n"})
/* loaded from: classes2.dex */
public final class MyersDiffKt {
    private static final void applyDiff(IntStack intStack, DiffCallback diffCallback) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < intStack.getLastIndex()) {
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
    private static final boolean m22543backward4l5_RBY(int i10, int i11, int i12, int i13, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iM22436getimpl;
        int i15;
        int i16;
        int i17 = (i11 - i10) - (i13 - i12);
        boolean z9 = (i17 & 1) == 0;
        int i18 = -i14;
        for (int i19 = i18; i19 <= i14; i19 += 2) {
            if (i19 == i18 || (i19 != i14 && CenteredArray.m22436getimpl(iArr2, i19 + 1) < CenteredArray.m22436getimpl(iArr2, i19 - 1))) {
                iM22436getimpl = CenteredArray.m22436getimpl(iArr2, i19 + 1);
                i15 = iM22436getimpl;
            } else {
                iM22436getimpl = CenteredArray.m22436getimpl(iArr2, i19 - 1);
                i15 = iM22436getimpl - 1;
            }
            int i20 = i13 - ((i11 - i15) - i19);
            int i21 = ((i14 != 0 ? 1 : 0) & (i15 == iM22436getimpl ? 1 : 0)) + i20;
            while (i15 > i10 && i20 > i12) {
                if (!diffCallback.areItemsTheSame(i15 - 1, i20 - 1)) {
                    break;
                }
                i15--;
                i20--;
            }
            CenteredArray.m22439setimpl(iArr2, i19, i15);
            if (z9 && (i16 = i17 - i19) >= i18 && i16 <= i14) {
                if (CenteredArray.m22436getimpl(iArr, i16) >= i15) {
                    fillSnake(i15, i20, iM22436getimpl, i21, true, iArr3);
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
        int[] iArrM22433constructorimpl = CenteredArray.m22433constructorimpl(new int[i13]);
        int[] iArrM22433constructorimpl2 = CenteredArray.m22433constructorimpl(new int[i13]);
        int[] iArrM22651constructorimpl = Snake.m22651constructorimpl(new int[5]);
        while (intStack2.isNotEmpty()) {
            int iPop = intStack2.pop();
            int iPop2 = intStack2.pop();
            int iPop3 = intStack2.pop();
            int iPop4 = intStack2.pop();
            int[] iArr = iArrM22651constructorimpl;
            if (m22545midPointq5eDKzI(iPop4, iPop3, iPop2, iPop, diffCallback, iArrM22433constructorimpl, iArrM22433constructorimpl2, iArrM22651constructorimpl)) {
                char c11 = c10;
                if (Math.min(iArr[2] - iArr[0], iArr[3] - iArr[c10]) > 0) {
                    Snake.m22649addDiagonalToStackimpl(iArr, intStack);
                }
                intStack2.pushRange(iPop4, iArr[0], iPop2, iArr[c11]);
                intStack2.pushRange(iArr[2], iPop3, iArr[3], iPop);
                iArrM22651constructorimpl = iArr;
                c10 = c11;
            } else {
                iArrM22651constructorimpl = iArr;
            }
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i10, i11, 0);
        return intStack;
    }

    public static final void executeDiff(int i10, int i11, DiffCallback diffCallback) {
        applyDiff(calculateDiff(i10, i11, diffCallback), diffCallback);
    }

    public static final void fillSnake(int i10, int i11, int i12, int i13, boolean z9, int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        iArr[3] = i13;
        iArr[4] = z9 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* renamed from: forward-4l5_RBY, reason: not valid java name */
    private static final boolean m22544forward4l5_RBY(int i10, int i11, int i12, int i13, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iM22436getimpl;
        int i15;
        ?? r16;
        int i16 = (i11 - i10) - (i13 - i12);
        int i17 = 1;
        boolean z9 = (Math.abs(i16) & 1) == 1;
        int i18 = -i14;
        int i19 = i18;
        while (i19 <= i14) {
            if (i19 == i18 || (i19 != i14 && CenteredArray.m22436getimpl(iArr, i19 + 1) > CenteredArray.m22436getimpl(iArr, i19 - 1))) {
                iM22436getimpl = CenteredArray.m22436getimpl(iArr, i19 + 1);
                i15 = iM22436getimpl;
            } else {
                iM22436getimpl = CenteredArray.m22436getimpl(iArr, i19 - 1);
                i15 = iM22436getimpl + 1;
            }
            int i20 = (i12 + (i15 - i10)) - i19;
            int i21 = i20 - ((i14 != 0 ? i17 : 0) & (i15 == iM22436getimpl ? i17 : 0));
            while (i15 < i11 && i20 < i13) {
                if (!diffCallback.areItemsTheSame(i15, i20)) {
                    break;
                }
                i15++;
                i20++;
            }
            CenteredArray.m22439setimpl(iArr, i19, i15);
            if (z9) {
                int i22 = i16 - i19;
                r16 = i17;
                r16 = r16;
                if (i22 >= i18 + 1) {
                    r16 = r16;
                    if (i22 <= i14 - 1) {
                        if (CenteredArray.m22436getimpl(iArr2, i22) <= i15) {
                            fillSnake(iM22436getimpl, i21, i15, i20, false, iArr3);
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
    private static final boolean m22545midPointq5eDKzI(int i10, int i11, int i12, int i13, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i14 = i11 - i10;
        int i15 = i13 - i12;
        if (i14 >= 1 && i15 >= 1) {
            int i16 = ((i14 + i15) + 1) / 2;
            int[] iArr4 = iArr;
            CenteredArray.m22439setimpl(iArr4, 1, i10);
            int[] iArr5 = iArr2;
            CenteredArray.m22439setimpl(iArr5, 1, i11);
            int i17 = 0;
            while (i17 < i16) {
                if (m22544forward4l5_RBY(i10, i11, i12, i13, diffCallback, iArr4, iArr5, i17, iArr3) || m22543backward4l5_RBY(i10, i11, i12, i13, diffCallback, iArr, iArr2, i17, iArr3)) {
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

    private static final int toInt(boolean z9) {
        return z9 ? 1 : 0;
    }
}
