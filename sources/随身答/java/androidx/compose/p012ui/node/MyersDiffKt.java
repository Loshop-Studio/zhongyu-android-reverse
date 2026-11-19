package androidx.compose.p012ui.node;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0016\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001aZ\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002\u001a \u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a8\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0012H\u0000\u001aZ\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010\u0014\u001aR\u0010!\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001c\u0010$\u001a\u00020\u0001*\u00020\u00122\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0002\u001a\r\u0010'\u001a\u00020\t*\u00020\u0007H\u0082\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, m13413d2 = {"applyDiff", "", "diagonals", "Landroidx/compose/ui/node/IntStack;", "callback", "Landroidx/compose/ui/node/DiffCallback;", "backward", "", "oldStart", "", "oldEnd", "newStart", "newEnd", "cb", "forward", "Landroidx/compose/ui/node/CenteredArray;", "d", "snake", "", "backward-4l5_RBY", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z", "calculateDiff", "oldSize", "newSize", "executeDiff", "fillSnake", "startX", "startY", "endX", "endY", "reverse", "data", "forward-4l5_RBY", "midPoint", "midPoint-q5eDKzI", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[I[I)Z", "swap", "i", "j", "toInt", "ui_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n+ 2 MyersDiff.kt\nandroidx/compose/ui/node/Snake\n*L\n1#1,518:1\n375#1:528\n375#1:529\n329#2:519\n318#2:520\n310#2:521\n322#2:522\n314#2:523\n310#2:524\n314#2:525\n318#2:526\n322#2:527\n*S KotlinDebug\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n*L\n203#1:528\n270#1:529\n75#1:519\n75#1:520\n75#1:521\n75#1:522\n75#1:523\n82#1:524\n84#1:525\n89#1:526\n91#1:527\n*E\n"})
/* loaded from: classes2.dex */
public final class MyersDiffKt {
    private static final void applyDiff(IntStack intStack, DiffCallback diffCallback) {
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < intStack.getLastIndex()) {
            int i12 = i9 + 2;
            int i13 = intStack.get(i9) - intStack.get(i12);
            int i14 = intStack.get(i9 + 1) - intStack.get(i12);
            int i15 = intStack.get(i12);
            i9 += 3;
            while (i10 < i13) {
                diffCallback.remove(i11, i10);
                i10++;
            }
            while (i11 < i14) {
                diffCallback.insert(i11);
                i11++;
            }
            while (true) {
                int i16 = i15 - 1;
                if (i15 > 0) {
                    diffCallback.same(i10, i11);
                    i10++;
                    i11++;
                    i15 = i16;
                }
            }
        }
    }

    /* renamed from: backward-4l5_RBY, reason: not valid java name */
    private static final boolean m22976backward4l5_RBY(int i9, int i10, int i11, int i12, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i13, int[] iArr3) {
        int iM22869getimpl;
        int i14;
        int i15;
        int i16 = (i10 - i9) - (i12 - i11);
        boolean z9 = (i16 & 1) == 0;
        int i17 = -i13;
        for (int i18 = i17; i18 <= i13; i18 += 2) {
            if (i18 == i17 || (i18 != i13 && CenteredArray.m22869getimpl(iArr2, i18 + 1) < CenteredArray.m22869getimpl(iArr2, i18 - 1))) {
                iM22869getimpl = CenteredArray.m22869getimpl(iArr2, i18 + 1);
                i14 = iM22869getimpl;
            } else {
                iM22869getimpl = CenteredArray.m22869getimpl(iArr2, i18 - 1);
                i14 = iM22869getimpl - 1;
            }
            int i19 = i12 - ((i10 - i14) - i18);
            int i20 = ((i13 != 0 ? 1 : 0) & (i14 == iM22869getimpl ? 1 : 0)) + i19;
            while (i14 > i9 && i19 > i11) {
                if (!diffCallback.areItemsTheSame(i14 - 1, i19 - 1)) {
                    break;
                }
                i14--;
                i19--;
            }
            CenteredArray.m22872setimpl(iArr2, i18, i14);
            if (z9 && (i15 = i16 - i18) >= i17 && i15 <= i13) {
                if (CenteredArray.m22869getimpl(iArr, i15) >= i14) {
                    fillSnake(i14, i19, iM22869getimpl, i20, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final IntStack calculateDiff(int i9, int i10, DiffCallback diffCallback) {
        char c10 = 1;
        int i11 = ((i9 + i10) + 1) / 2;
        IntStack intStack = new IntStack(i11 * 3);
        IntStack intStack2 = new IntStack(i11 * 4);
        intStack2.pushRange(0, i9, 0, i10);
        int i12 = (i11 * 2) + 1;
        int[] iArrM22866constructorimpl = CenteredArray.m22866constructorimpl(new int[i12]);
        int[] iArrM22866constructorimpl2 = CenteredArray.m22866constructorimpl(new int[i12]);
        int[] iArrM23084constructorimpl = Snake.m23084constructorimpl(new int[5]);
        while (intStack2.isNotEmpty()) {
            int iPop = intStack2.pop();
            int iPop2 = intStack2.pop();
            int iPop3 = intStack2.pop();
            int iPop4 = intStack2.pop();
            int[] iArr = iArrM23084constructorimpl;
            if (m22978midPointq5eDKzI(iPop4, iPop3, iPop2, iPop, diffCallback, iArrM22866constructorimpl, iArrM22866constructorimpl2, iArrM23084constructorimpl)) {
                char c11 = c10;
                if (Math.min(iArr[2] - iArr[0], iArr[3] - iArr[c10]) > 0) {
                    Snake.m23082addDiagonalToStackimpl(iArr, intStack);
                }
                intStack2.pushRange(iPop4, iArr[0], iPop2, iArr[c11]);
                intStack2.pushRange(iArr[2], iPop3, iArr[3], iPop);
                iArrM23084constructorimpl = iArr;
                c10 = c11;
            } else {
                iArrM23084constructorimpl = iArr;
            }
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i9, i10, 0);
        return intStack;
    }

    public static final void executeDiff(int i9, int i10, DiffCallback diffCallback) {
        applyDiff(calculateDiff(i9, i10, diffCallback), diffCallback);
    }

    public static final void fillSnake(int i9, int i10, int i11, int i12, boolean z9, int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i9;
        iArr[1] = i10;
        iArr[2] = i11;
        iArr[3] = i12;
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
    private static final boolean m22977forward4l5_RBY(int i9, int i10, int i11, int i12, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i13, int[] iArr3) {
        int iM22869getimpl;
        int i14;
        ?? r16;
        int i15 = (i10 - i9) - (i12 - i11);
        int i16 = 1;
        boolean z9 = (Math.abs(i15) & 1) == 1;
        int i17 = -i13;
        int i18 = i17;
        while (i18 <= i13) {
            if (i18 == i17 || (i18 != i13 && CenteredArray.m22869getimpl(iArr, i18 + 1) > CenteredArray.m22869getimpl(iArr, i18 - 1))) {
                iM22869getimpl = CenteredArray.m22869getimpl(iArr, i18 + 1);
                i14 = iM22869getimpl;
            } else {
                iM22869getimpl = CenteredArray.m22869getimpl(iArr, i18 - 1);
                i14 = iM22869getimpl + 1;
            }
            int i19 = (i11 + (i14 - i9)) - i18;
            int i20 = i19 - ((i13 != 0 ? i16 : 0) & (i14 == iM22869getimpl ? i16 : 0));
            while (i14 < i10 && i19 < i12) {
                if (!diffCallback.areItemsTheSame(i14, i19)) {
                    break;
                }
                i14++;
                i19++;
            }
            CenteredArray.m22872setimpl(iArr, i18, i14);
            if (z9) {
                int i21 = i15 - i18;
                r16 = i16;
                r16 = r16;
                if (i21 >= i17 + 1) {
                    r16 = r16;
                    if (i21 <= i13 - 1) {
                        if (CenteredArray.m22869getimpl(iArr2, i21) <= i14) {
                            fillSnake(iM22869getimpl, i20, i14, i19, false, iArr3);
                            return r16;
                        }
                    }
                }
                i18 += 2;
                i16 = r16;
            } else {
                r16 = i16;
            }
            i18 += 2;
            i16 = r16;
        }
        return false;
    }

    /* renamed from: midPoint-q5eDKzI, reason: not valid java name */
    private static final boolean m22978midPointq5eDKzI(int i9, int i10, int i11, int i12, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i13 = i10 - i9;
        int i14 = i12 - i11;
        if (i13 >= 1 && i14 >= 1) {
            int i15 = ((i13 + i14) + 1) / 2;
            int[] iArr4 = iArr;
            CenteredArray.m22872setimpl(iArr4, 1, i9);
            int[] iArr5 = iArr2;
            CenteredArray.m22872setimpl(iArr5, 1, i10);
            int i16 = 0;
            while (i16 < i15) {
                if (m22977forward4l5_RBY(i9, i10, i11, i12, diffCallback, iArr4, iArr5, i16, iArr3) || m22976backward4l5_RBY(i9, i10, i11, i12, diffCallback, iArr, iArr2, i16, iArr3)) {
                    return true;
                }
                i16++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(int[] iArr, int i9, int i10) {
        int i11 = iArr[i9];
        iArr[i9] = iArr[i10];
        iArr[i10] = i11;
    }

    private static final int toInt(boolean z9) {
        return z9 ? 1 : 0;
    }
}
