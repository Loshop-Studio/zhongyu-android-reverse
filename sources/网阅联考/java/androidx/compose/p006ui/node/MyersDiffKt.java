package androidx.compose.p006ui.node;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3335ai;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0013\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a]\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a \u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\bH\u0002\u001a \u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a8\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0014H\u0000\u001a]\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u0016\u001aU\u0010!\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a\u001c\u0010$\u001a\u00020\u0001*\u00020\u00142\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, m5175d2 = {"applyDiff", "", "oldSize", "", "newSize", "diagonals", "Landroidx/compose/ui/node/IntStack;", "callback", "Landroidx/compose/ui/node/DiffCallback;", "backward", "", "oldStart", "oldEnd", "newStart", "newEnd", "cb", "forward", "Landroidx/compose/ui/node/CenteredArray;", "d", "snake", "", "backward-4l5_RBY", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z", "calculateDiff", "executeDiff", "fillSnake", "startX", "startY", "endX", "endY", "reverse", "data", "forward-4l5_RBY", "midPoint", "midPoint-q5eDKzI", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[I[I)Z", "swap", C3335ai.f1660aA, "j", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class MyersDiffKt {
    private static final void applyDiff(int i4, int i5, IntStack intStack, DiffCallback diffCallback) {
        while (intStack.isNotEmpty()) {
            int iPop = intStack.pop();
            int iPop2 = intStack.pop();
            int iPop3 = intStack.pop();
            while (i4 > iPop3) {
                i4--;
                diffCallback.remove(i4);
            }
            while (i5 > iPop2) {
                i5--;
                diffCallback.insert(i4, i5);
            }
            while (true) {
                int i6 = iPop - 1;
                if (iPop > 0) {
                    i4--;
                    i5--;
                    diffCallback.same(i4, i5);
                    iPop = i6;
                }
            }
        }
        while (i4 > 0) {
            i4--;
            diffCallback.remove(i4);
        }
        while (i5 > 0) {
            i5--;
            diffCallback.insert(i4, i5);
        }
    }

    /* renamed from: backward-4l5_RBY, reason: not valid java name */
    private static final boolean m10732backward4l5_RBY(int i4, int i5, int i6, int i7, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i8, int[] iArr3) {
        int iM10665getimpl;
        int i9;
        int i10;
        int i11 = (i5 - i4) - (i7 - i6);
        boolean z3 = i11 % 2 == 0;
        int i12 = -i8;
        for (int i13 = i12; i13 <= i8; i13 += 2) {
            if (i13 == i12 || (i13 != i8 && CenteredArray.m10665getimpl(iArr2, i13 + 1) < CenteredArray.m10665getimpl(iArr2, i13 - 1))) {
                iM10665getimpl = CenteredArray.m10665getimpl(iArr2, i13 + 1);
                i9 = iM10665getimpl;
            } else {
                iM10665getimpl = CenteredArray.m10665getimpl(iArr2, i13 - 1);
                i9 = iM10665getimpl - 1;
            }
            int i14 = i7 - ((i5 - i9) - i13);
            int i15 = (i8 == 0 || i9 != iM10665getimpl) ? i14 : i14 + 1;
            while (i9 > i4 && i14 > i6) {
                if (!diffCallback.areItemsTheSame(i9 - 1, i14 - 1)) {
                    break;
                }
                i9--;
                i14--;
            }
            CenteredArray.m10668setimpl(iArr2, i13, i9);
            if (z3 && (i10 = i11 - i13) >= i12 && i10 <= i8) {
                if (CenteredArray.m10665getimpl(iArr, i10) >= i9) {
                    fillSnake(i9, i14, iM10665getimpl, i15, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final IntStack calculateDiff(int i4, int i5, DiffCallback diffCallback) {
        int i6 = ((i4 + i5) + 1) / 2;
        IntStack intStack = new IntStack(i6 * 3);
        IntStack intStack2 = new IntStack(i6 * 4);
        intStack2.pushRange(0, i4, 0, i5);
        int i7 = (i6 * 2) + 1;
        int[] iArrM10662constructorimpl = CenteredArray.m10662constructorimpl(new int[i7]);
        int[] iArrM10662constructorimpl2 = CenteredArray.m10662constructorimpl(new int[i7]);
        int[] iArrM10828constructorimpl = Snake.m10828constructorimpl(new int[5]);
        while (intStack2.isNotEmpty()) {
            int iPop = intStack2.pop();
            int iPop2 = intStack2.pop();
            int iPop3 = intStack2.pop();
            int iPop4 = intStack2.pop();
            int[] iArr = iArrM10662constructorimpl;
            int[] iArr2 = iArrM10662constructorimpl2;
            if (m10734midPointq5eDKzI(iPop4, iPop3, iPop2, iPop, diffCallback, iArrM10662constructorimpl, iArrM10662constructorimpl2, iArrM10828constructorimpl)) {
                if (Snake.m10831getDiagonalSizeimpl(iArrM10828constructorimpl) > 0) {
                    Snake.m10826addDiagonalToStackimpl(iArrM10828constructorimpl, intStack);
                }
                intStack2.pushRange(iPop4, Snake.m10836getStartXimpl(iArrM10828constructorimpl), iPop2, Snake.m10837getStartYimpl(iArrM10828constructorimpl));
                intStack2.pushRange(Snake.m10832getEndXimpl(iArrM10828constructorimpl), iPop3, Snake.m10833getEndYimpl(iArrM10828constructorimpl), iPop);
            }
            iArrM10662constructorimpl = iArr;
            iArrM10662constructorimpl2 = iArr2;
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i4, i5, 0);
        return intStack;
    }

    public static final void executeDiff(int i4, int i5, DiffCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        applyDiff(i4, i5, calculateDiff(i4, i5, callback), callback);
    }

    public static final void fillSnake(int i4, int i5, int i6, int i7, boolean z3, int[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        data[0] = i4;
        data[1] = i5;
        data[2] = i6;
        data[3] = i7;
        data[4] = z3 ? 1 : 0;
    }

    /* renamed from: forward-4l5_RBY, reason: not valid java name */
    private static final boolean m10733forward4l5_RBY(int i4, int i5, int i6, int i7, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i8, int[] iArr3) {
        int iM10665getimpl;
        int i9;
        int i10;
        int i11 = (i5 - i4) - (i7 - i6);
        boolean z3 = Math.abs(i11) % 2 == 1;
        int i12 = -i8;
        for (int i13 = i12; i13 <= i8; i13 += 2) {
            if (i13 == i12 || (i13 != i8 && CenteredArray.m10665getimpl(iArr, i13 + 1) > CenteredArray.m10665getimpl(iArr, i13 - 1))) {
                iM10665getimpl = CenteredArray.m10665getimpl(iArr, i13 + 1);
                i9 = iM10665getimpl;
            } else {
                iM10665getimpl = CenteredArray.m10665getimpl(iArr, i13 - 1);
                i9 = iM10665getimpl + 1;
            }
            int i14 = (i6 + (i9 - i4)) - i13;
            int i15 = (i8 == 0 || i9 != iM10665getimpl) ? i14 : i14 - 1;
            while (i9 < i5 && i14 < i7) {
                if (!diffCallback.areItemsTheSame(i9, i14)) {
                    break;
                }
                i9++;
                i14++;
            }
            CenteredArray.m10668setimpl(iArr, i13, i9);
            if (z3 && (i10 = i11 - i13) >= i12 + 1 && i10 <= i8 - 1) {
                if (CenteredArray.m10665getimpl(iArr2, i10) <= i9) {
                    fillSnake(iM10665getimpl, i15, i9, i14, false, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: midPoint-q5eDKzI, reason: not valid java name */
    private static final boolean m10734midPointq5eDKzI(int i4, int i5, int i6, int i7, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i8 = i5 - i4;
        int i9 = i7 - i6;
        if (i8 >= 1 && i9 >= 1) {
            int i10 = ((i8 + i9) + 1) / 2;
            CenteredArray.m10668setimpl(iArr, 1, i4);
            CenteredArray.m10668setimpl(iArr2, 1, i5);
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11;
                if (m10733forward4l5_RBY(i4, i5, i6, i7, diffCallback, iArr, iArr2, i11, iArr3) || m10732backward4l5_RBY(i4, i5, i6, i7, diffCallback, iArr, iArr2, i12, iArr3)) {
                    return true;
                }
                i11 = i12 + 1;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(int[] iArr, int i4, int i5) {
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
    }
}
