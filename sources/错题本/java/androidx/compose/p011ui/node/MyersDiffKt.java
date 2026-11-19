package androidx.compose.p011ui.node;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aR\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aZ\u0010\u0014\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aZ\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001e\u001a\u0014\u0010 \u001a\u00020\u0000*\u00020\u0018H\u0082\b¢\u0006\u0004\b \u0010!\u001a?\u0010(\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0016H\u0000¢\u0006\u0004\b(\u0010)\u001a#\u0010,\u001a\u00020\n*\u00020\u00162\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0000H\u0002¢\u0006\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, m5110d2 = {"", "oldSize", "newSize", "Landroidx/compose/ui/node/DiffCallback;", "cb", "Landroidx/compose/ui/node/IntStack;", "calculateDiff", "(IILandroidx/compose/ui/node/DiffCallback;)Landroidx/compose/ui/node/IntStack;", "diagonals", "callback", "Ld6/s;", "applyDiff", "(Landroidx/compose/ui/node/IntStack;Landroidx/compose/ui/node/DiffCallback;)V", "executeDiff", "(IILandroidx/compose/ui/node/DiffCallback;)V", "oldStart", "oldEnd", "newStart", "newEnd", "Landroidx/compose/ui/node/CenteredArray;", "forward", "backward", "", "snake", "", "midPoint-q5eDKzI", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[I[I)Z", "midPoint", "d", "forward-4l5_RBY", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z", "backward-4l5_RBY", "toInt", "(Z)I", "startX", "startY", "endX", "endY", "reverse", "data", "fillSnake", "(IIIIZ[I)V", "i", "j", "swap", "([III)V", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n+ 2 MyersDiff.kt\nandroidx/compose/ui/node/Snake\n*L\n1#1,518:1\n375#1:528\n375#1:529\n329#2:519\n318#2:520\n310#2:521\n322#2:522\n314#2:523\n310#2:524\n314#2:525\n318#2:526\n322#2:527\n*S KotlinDebug\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n*L\n203#1:528\n270#1:529\n75#1:519\n75#1:520\n75#1:521\n75#1:522\n75#1:523\n82#1:524\n84#1:525\n89#1:526\n91#1:527\n*E\n"})
/* loaded from: classes2.dex */
public final class MyersDiffKt {
    private static final void applyDiff(IntStack intStack, DiffCallback diffCallback) {
        int i = 0;
        int i8 = 0;
        int i9 = 0;
        while (i < intStack.getLastIndex()) {
            int i10 = i + 2;
            int i11 = intStack.get(i) - intStack.get(i10);
            int i12 = intStack.get(i + 1) - intStack.get(i10);
            int i13 = intStack.get(i10);
            i += 3;
            while (i8 < i11) {
                diffCallback.remove(i9, i8);
                i8++;
            }
            while (i9 < i12) {
                diffCallback.insert(i9);
                i9++;
            }
            while (true) {
                int i14 = i13 - 1;
                if (i13 > 0) {
                    diffCallback.same(i8, i9);
                    i8++;
                    i9++;
                    i13 = i14;
                }
            }
        }
    }

    /* renamed from: backward-4l5_RBY, reason: not valid java name */
    private static final boolean m12266backward4l5_RBY(int i, int i8, int i9, int i10, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i11, int[] iArr3) {
        int iM12150getimpl;
        int i12;
        int i13;
        int i14 = (i8 - i) - (i10 - i9);
        boolean z8 = (i14 & 1) == 0;
        int i15 = -i11;
        for (int i16 = i15; i16 <= i11; i16 += 2) {
            if (i16 == i15 || (i16 != i11 && CenteredArray.m12150getimpl(iArr2, i16 + 1) < CenteredArray.m12150getimpl(iArr2, i16 - 1))) {
                iM12150getimpl = CenteredArray.m12150getimpl(iArr2, i16 + 1);
                i12 = iM12150getimpl;
            } else {
                iM12150getimpl = CenteredArray.m12150getimpl(iArr2, i16 - 1);
                i12 = iM12150getimpl - 1;
            }
            int i17 = i10 - ((i8 - i12) - i16);
            int i18 = ((i11 != 0 ? 1 : 0) & (i12 == iM12150getimpl ? 1 : 0)) + i17;
            while (i12 > i && i17 > i9) {
                if (!diffCallback.areItemsTheSame(i12 - 1, i17 - 1)) {
                    break;
                }
                i12--;
                i17--;
            }
            CenteredArray.m12153setimpl(iArr2, i16, i12);
            if (z8 && (i13 = i14 - i16) >= i15 && i13 <= i11) {
                if (CenteredArray.m12150getimpl(iArr, i13) >= i12) {
                    fillSnake(i12, i17, iM12150getimpl, i18, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final IntStack calculateDiff(int i, int i8, DiffCallback diffCallback) {
        char c = 1;
        int i9 = ((i + i8) + 1) / 2;
        IntStack intStack = new IntStack(i9 * 3);
        IntStack intStack2 = new IntStack(i9 * 4);
        intStack2.pushRange(0, i, 0, i8);
        int i10 = (i9 * 2) + 1;
        int[] iArrM12147constructorimpl = CenteredArray.m12147constructorimpl(new int[i10]);
        int[] iArrM12147constructorimpl2 = CenteredArray.m12147constructorimpl(new int[i10]);
        int[] iArrM12379constructorimpl = Snake.m12379constructorimpl(new int[5]);
        while (intStack2.isNotEmpty()) {
            int iPop = intStack2.pop();
            int iPop2 = intStack2.pop();
            int iPop3 = intStack2.pop();
            int iPop4 = intStack2.pop();
            int[] iArr = iArrM12379constructorimpl;
            if (m12268midPointq5eDKzI(iPop4, iPop3, iPop2, iPop, diffCallback, iArrM12147constructorimpl, iArrM12147constructorimpl2, iArrM12379constructorimpl)) {
                char c9 = c;
                if (Math.min(iArr[2] - iArr[0], iArr[3] - iArr[c]) > 0) {
                    Snake.m12377addDiagonalToStackimpl(iArr, intStack);
                }
                intStack2.pushRange(iPop4, iArr[0], iPop2, iArr[c9]);
                intStack2.pushRange(iArr[2], iPop3, iArr[3], iPop);
                iArrM12379constructorimpl = iArr;
                c = c9;
            } else {
                iArrM12379constructorimpl = iArr;
            }
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i, i8, 0);
        return intStack;
    }

    public static final void executeDiff(int i, int i8, @NotNull DiffCallback diffCallback) {
        applyDiff(calculateDiff(i, i8, diffCallback), diffCallback);
    }

    public static final void fillSnake(int i, int i8, int i9, int i10, boolean z8, @NotNull int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i;
        iArr[1] = i8;
        iArr[2] = i9;
        iArr[3] = i10;
        iArr[4] = z8 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* renamed from: forward-4l5_RBY, reason: not valid java name */
    private static final boolean m12267forward4l5_RBY(int i, int i8, int i9, int i10, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i11, int[] iArr3) {
        int iM12150getimpl;
        int i12;
        ?? r16;
        int i13 = (i8 - i) - (i10 - i9);
        int i14 = 1;
        boolean z8 = (Math.abs(i13) & 1) == 1;
        int i15 = -i11;
        int i16 = i15;
        while (i16 <= i11) {
            if (i16 == i15 || (i16 != i11 && CenteredArray.m12150getimpl(iArr, i16 + 1) > CenteredArray.m12150getimpl(iArr, i16 - 1))) {
                iM12150getimpl = CenteredArray.m12150getimpl(iArr, i16 + 1);
                i12 = iM12150getimpl;
            } else {
                iM12150getimpl = CenteredArray.m12150getimpl(iArr, i16 - 1);
                i12 = iM12150getimpl + 1;
            }
            int i17 = ((i12 - i) + i9) - i16;
            int i18 = i17 - ((i11 != 0 ? i14 : 0) & (i12 == iM12150getimpl ? i14 : 0));
            while (i12 < i8 && i17 < i10) {
                if (!diffCallback.areItemsTheSame(i12, i17)) {
                    break;
                }
                i12++;
                i17++;
            }
            CenteredArray.m12153setimpl(iArr, i16, i12);
            if (z8) {
                int i19 = i13 - i16;
                r16 = i14;
                r16 = r16;
                if (i19 >= i15 + 1) {
                    r16 = r16;
                    if (i19 <= i11 - 1) {
                        if (CenteredArray.m12150getimpl(iArr2, i19) <= i12) {
                            fillSnake(iM12150getimpl, i18, i12, i17, false, iArr3);
                            return r16;
                        }
                    }
                }
                i16 += 2;
                i14 = r16;
            } else {
                r16 = i14;
            }
            i16 += 2;
            i14 = r16;
        }
        return false;
    }

    /* renamed from: midPoint-q5eDKzI, reason: not valid java name */
    private static final boolean m12268midPointq5eDKzI(int i, int i8, int i9, int i10, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i11 = i8 - i;
        int i12 = i10 - i9;
        if (i11 >= 1 && i12 >= 1) {
            int i13 = ((i11 + i12) + 1) / 2;
            int[] iArr4 = iArr;
            CenteredArray.m12153setimpl(iArr4, 1, i);
            int[] iArr5 = iArr2;
            CenteredArray.m12153setimpl(iArr5, 1, i8);
            int i14 = 0;
            while (i14 < i13) {
                if (m12267forward4l5_RBY(i, i8, i9, i10, diffCallback, iArr4, iArr5, i14, iArr3) || m12266backward4l5_RBY(i, i8, i9, i10, diffCallback, iArr, iArr2, i14, iArr3)) {
                    return true;
                }
                i14++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(int[] iArr, int i, int i8) {
        int i9 = iArr[i];
        iArr[i] = iArr[i8];
        iArr[i8] = i9;
    }

    private static final int toInt(boolean z8) {
        return z8 ? 1 : 0;
    }
}
