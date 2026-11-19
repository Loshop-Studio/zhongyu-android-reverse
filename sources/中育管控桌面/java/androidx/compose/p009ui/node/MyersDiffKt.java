package androidx.compose.p009ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0016\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001aZ\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002\u001a \u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a8\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0012H\u0000\u001aZ\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010\u0014\u001aR\u0010!\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001c\u0010$\u001a\u00020\u0001*\u00020\u00122\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0002\u001a\r\u0010'\u001a\u00020\t*\u00020\u0007H\u0082\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, m7880d2 = {"applyDiff", "", "diagonals", "Landroidx/compose/ui/node/IntStack;", "callback", "Landroidx/compose/ui/node/DiffCallback;", "backward", "", "oldStart", "", "oldEnd", "newStart", "newEnd", "cb", "forward", "Landroidx/compose/ui/node/CenteredArray;", "d", "snake", "", "backward-4l5_RBY", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z", "calculateDiff", "oldSize", "newSize", "executeDiff", "fillSnake", "startX", "startY", "endX", "endY", "reverse", "data", "forward-4l5_RBY", "midPoint", "midPoint-q5eDKzI", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[I[I)Z", "swap", "i", "j", "toInt", "ui_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n+ 2 MyersDiff.kt\nandroidx/compose/ui/node/Snake\n*L\n1#1,518:1\n375#1:528\n375#1:529\n329#2:519\n318#2:520\n310#2:521\n322#2:522\n314#2:523\n310#2:524\n314#2:525\n318#2:526\n322#2:527\n*S KotlinDebug\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n*L\n203#1:528\n270#1:529\n75#1:519\n75#1:520\n75#1:521\n75#1:522\n75#1:523\n82#1:524\n84#1:525\n89#1:526\n91#1:527\n*E\n"})
/* loaded from: classes2.dex */
public final class MyersDiffKt {
    private static final void applyDiff(IntStack intStack, DiffCallback diffCallback) {
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < intStack.getLastIndex()) {
            int i9 = i6 + 2;
            int i10 = intStack.get(i6) - intStack.get(i9);
            int i11 = intStack.get(i6 + 1) - intStack.get(i9);
            int i12 = intStack.get(i9);
            i6 += 3;
            while (i7 < i10) {
                diffCallback.remove(i8, i7);
                i7++;
            }
            while (i8 < i11) {
                diffCallback.insert(i8);
                i8++;
            }
            while (true) {
                int i13 = i12 - 1;
                if (i12 > 0) {
                    diffCallback.same(i7, i8);
                    i7++;
                    i8++;
                    i12 = i13;
                }
            }
        }
    }

    /* renamed from: backward-4l5_RBY, reason: not valid java name */
    private static final boolean m15466backward4l5_RBY(int i6, int i7, int i8, int i9, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i10, int[] iArr3) {
        int iM15359getimpl;
        int i11;
        int i12;
        int i13 = (i7 - i6) - (i9 - i8);
        boolean z6 = (i13 & 1) == 0;
        int i14 = -i10;
        for (int i15 = i14; i15 <= i10; i15 += 2) {
            if (i15 == i14 || (i15 != i10 && CenteredArray.m15359getimpl(iArr2, i15 + 1) < CenteredArray.m15359getimpl(iArr2, i15 - 1))) {
                iM15359getimpl = CenteredArray.m15359getimpl(iArr2, i15 + 1);
                i11 = iM15359getimpl;
            } else {
                iM15359getimpl = CenteredArray.m15359getimpl(iArr2, i15 - 1);
                i11 = iM15359getimpl - 1;
            }
            int i16 = i9 - ((i7 - i11) - i15);
            int i17 = ((i10 != 0 ? 1 : 0) & (i11 == iM15359getimpl ? 1 : 0)) + i16;
            while (i11 > i6 && i16 > i8) {
                if (!diffCallback.areItemsTheSame(i11 - 1, i16 - 1)) {
                    break;
                }
                i11--;
                i16--;
            }
            CenteredArray.m15362setimpl(iArr2, i15, i11);
            if (z6 && (i12 = i13 - i15) >= i14 && i12 <= i10) {
                if (CenteredArray.m15359getimpl(iArr, i12) >= i11) {
                    fillSnake(i11, i16, iM15359getimpl, i17, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final IntStack calculateDiff(int i6, int i7, DiffCallback diffCallback) {
        char c7 = 1;
        int i8 = ((i6 + i7) + 1) / 2;
        IntStack intStack = new IntStack(i8 * 3);
        IntStack intStack2 = new IntStack(i8 * 4);
        intStack2.pushRange(0, i6, 0, i7);
        int i9 = (i8 * 2) + 1;
        int[] iArrM15356constructorimpl = CenteredArray.m15356constructorimpl(new int[i9]);
        int[] iArrM15356constructorimpl2 = CenteredArray.m15356constructorimpl(new int[i9]);
        int[] iArrM15574constructorimpl = Snake.m15574constructorimpl(new int[5]);
        while (intStack2.isNotEmpty()) {
            int iPop = intStack2.pop();
            int iPop2 = intStack2.pop();
            int iPop3 = intStack2.pop();
            int iPop4 = intStack2.pop();
            int[] iArr = iArrM15574constructorimpl;
            if (m15468midPointq5eDKzI(iPop4, iPop3, iPop2, iPop, diffCallback, iArrM15356constructorimpl, iArrM15356constructorimpl2, iArrM15574constructorimpl)) {
                char c8 = c7;
                if (Math.min(iArr[2] - iArr[0], iArr[3] - iArr[c7]) > 0) {
                    Snake.m15572addDiagonalToStackimpl(iArr, intStack);
                }
                intStack2.pushRange(iPop4, iArr[0], iPop2, iArr[c8]);
                intStack2.pushRange(iArr[2], iPop3, iArr[3], iPop);
                iArrM15574constructorimpl = iArr;
                c7 = c8;
            } else {
                iArrM15574constructorimpl = iArr;
            }
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i6, i7, 0);
        return intStack;
    }

    public static final void executeDiff(int i6, int i7, DiffCallback diffCallback) {
        applyDiff(calculateDiff(i6, i7, diffCallback), diffCallback);
    }

    public static final void fillSnake(int i6, int i7, int i8, int i9, boolean z6, int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i6;
        iArr[1] = i7;
        iArr[2] = i8;
        iArr[3] = i9;
        iArr[4] = z6 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* renamed from: forward-4l5_RBY, reason: not valid java name */
    private static final boolean m15467forward4l5_RBY(int i6, int i7, int i8, int i9, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i10, int[] iArr3) {
        int iM15359getimpl;
        int i11;
        ?? r16;
        int i12 = (i7 - i6) - (i9 - i8);
        int i13 = 1;
        boolean z6 = (Math.abs(i12) & 1) == 1;
        int i14 = -i10;
        int i15 = i14;
        while (i15 <= i10) {
            if (i15 == i14 || (i15 != i10 && CenteredArray.m15359getimpl(iArr, i15 + 1) > CenteredArray.m15359getimpl(iArr, i15 - 1))) {
                iM15359getimpl = CenteredArray.m15359getimpl(iArr, i15 + 1);
                i11 = iM15359getimpl;
            } else {
                iM15359getimpl = CenteredArray.m15359getimpl(iArr, i15 - 1);
                i11 = iM15359getimpl + 1;
            }
            int i16 = (i8 + (i11 - i6)) - i15;
            int i17 = i16 - ((i10 != 0 ? i13 : 0) & (i11 == iM15359getimpl ? i13 : 0));
            while (i11 < i7 && i16 < i9) {
                if (!diffCallback.areItemsTheSame(i11, i16)) {
                    break;
                }
                i11++;
                i16++;
            }
            CenteredArray.m15362setimpl(iArr, i15, i11);
            if (z6) {
                int i18 = i12 - i15;
                r16 = i13;
                r16 = r16;
                if (i18 >= i14 + 1) {
                    r16 = r16;
                    if (i18 <= i10 - 1) {
                        if (CenteredArray.m15359getimpl(iArr2, i18) <= i11) {
                            fillSnake(iM15359getimpl, i17, i11, i16, false, iArr3);
                            return r16;
                        }
                    }
                }
                i15 += 2;
                i13 = r16;
            } else {
                r16 = i13;
            }
            i15 += 2;
            i13 = r16;
        }
        return false;
    }

    /* renamed from: midPoint-q5eDKzI, reason: not valid java name */
    private static final boolean m15468midPointq5eDKzI(int i6, int i7, int i8, int i9, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i10 = i7 - i6;
        int i11 = i9 - i8;
        if (i10 >= 1 && i11 >= 1) {
            int i12 = ((i10 + i11) + 1) / 2;
            int[] iArr4 = iArr;
            CenteredArray.m15362setimpl(iArr4, 1, i6);
            int[] iArr5 = iArr2;
            CenteredArray.m15362setimpl(iArr5, 1, i7);
            int i13 = 0;
            while (i13 < i12) {
                if (m15467forward4l5_RBY(i6, i7, i8, i9, diffCallback, iArr4, iArr5, i13, iArr3) || m15466backward4l5_RBY(i6, i7, i8, i9, diffCallback, iArr, iArr2, i13, iArr3)) {
                    return true;
                }
                i13++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(int[] iArr, int i6, int i7) {
        int i8 = iArr[i6];
        iArr[i6] = iArr[i7];
        iArr[i7] = i8;
    }

    private static final int toInt(boolean z6) {
        return z6 ? 1 : 0;
    }
}
