package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class ArrayLinkedVariables implements ArrayRow.ArrayRowVariables {
    private static final boolean DEBUG = false;
    static final int NONE = -1;
    private static float sEpsilon = 0.001f;
    protected final Cache mCache;
    private final ArrayRow mRow;
    int mCurrentSize = 0;
    private int mRowSize = 8;
    private SolverVariable mCandidate = null;
    private int[] mArrayIndices = new int[8];
    private int[] mArrayNextIndices = new int[8];
    private float[] mArrayValues = new float[8];
    private int mHead = -1;
    private int mLast = -1;
    private boolean mDidFillOnce = false;

    public ArrayLinkedVariables(ArrayRow arrayRow, Cache cache) {
        this.mRow = arrayRow;
        this.mCache = cache;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(SolverVariable solverVariable, float f10, boolean z9) {
        float f11 = sEpsilon;
        if (f10 <= (-f11) || f10 >= f11) {
            int i9 = this.mHead;
            if (i9 == -1) {
                this.mHead = 0;
                this.mArrayValues[0] = f10;
                this.mArrayIndices[0] = solverVariable.f1300id;
                this.mArrayNextIndices[0] = -1;
                solverVariable.usageInRowCount++;
                solverVariable.addToRow(this.mRow);
                this.mCurrentSize++;
                if (this.mDidFillOnce) {
                    return;
                }
                int i10 = this.mLast + 1;
                this.mLast = i10;
                int[] iArr = this.mArrayIndices;
                if (i10 >= iArr.length) {
                    this.mDidFillOnce = true;
                    this.mLast = iArr.length - 1;
                    return;
                }
                return;
            }
            int i11 = -1;
            for (int i12 = 0; i9 != -1 && i12 < this.mCurrentSize; i12++) {
                int i13 = this.mArrayIndices[i9];
                int i14 = solverVariable.f1300id;
                if (i13 == i14) {
                    float[] fArr = this.mArrayValues;
                    float f12 = fArr[i9] + f10;
                    float f13 = sEpsilon;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i9] = f12;
                    if (f12 == 0.0f) {
                        if (i9 == this.mHead) {
                            this.mHead = this.mArrayNextIndices[i9];
                        } else {
                            int[] iArr2 = this.mArrayNextIndices;
                            iArr2[i11] = iArr2[i9];
                        }
                        if (z9) {
                            solverVariable.removeFromRow(this.mRow);
                        }
                        if (this.mDidFillOnce) {
                            this.mLast = i9;
                        }
                        solverVariable.usageInRowCount--;
                        this.mCurrentSize--;
                        return;
                    }
                    return;
                }
                if (i13 < i14) {
                    i11 = i9;
                }
                i9 = this.mArrayNextIndices[i9];
            }
            int length = this.mLast;
            int i15 = length + 1;
            if (this.mDidFillOnce) {
                int[] iArr3 = this.mArrayIndices;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i15;
            }
            int[] iArr4 = this.mArrayIndices;
            if (length >= iArr4.length && this.mCurrentSize < iArr4.length) {
                int i16 = 0;
                while (true) {
                    int[] iArr5 = this.mArrayIndices;
                    if (i16 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i16] == -1) {
                        length = i16;
                        break;
                    }
                    i16++;
                }
            }
            int[] iArr6 = this.mArrayIndices;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i17 = this.mRowSize * 2;
                this.mRowSize = i17;
                this.mDidFillOnce = false;
                this.mLast = length - 1;
                this.mArrayValues = Arrays.copyOf(this.mArrayValues, i17);
                this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.mRowSize);
                this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.mRowSize);
            }
            this.mArrayIndices[length] = solverVariable.f1300id;
            this.mArrayValues[length] = f10;
            if (i11 != -1) {
                int[] iArr7 = this.mArrayNextIndices;
                iArr7[length] = iArr7[i11];
                iArr7[i11] = length;
            } else {
                this.mArrayNextIndices[length] = this.mHead;
                this.mHead = length;
            }
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(this.mRow);
            this.mCurrentSize++;
            if (!this.mDidFillOnce) {
                this.mLast++;
            }
            int i18 = this.mLast;
            int[] iArr8 = this.mArrayIndices;
            if (i18 >= iArr8.length) {
                this.mDidFillOnce = true;
                this.mLast = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void clear() {
        int i9 = this.mHead;
        for (int i10 = 0; i9 != -1 && i10 < this.mCurrentSize; i10++) {
            SolverVariable solverVariable = this.mCache.mIndexedVariables[this.mArrayIndices[i9]];
            if (solverVariable != null) {
                solverVariable.removeFromRow(this.mRow);
            }
            i9 = this.mArrayNextIndices[i9];
        }
        this.mHead = -1;
        this.mLast = -1;
        this.mDidFillOnce = false;
        this.mCurrentSize = 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(SolverVariable solverVariable) {
        int i9 = this.mHead;
        if (i9 == -1) {
            return false;
        }
        for (int i10 = 0; i9 != -1 && i10 < this.mCurrentSize; i10++) {
            if (this.mArrayIndices[i9] == solverVariable.f1300id) {
                return true;
            }
            i9 = this.mArrayNextIndices[i9];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
        int i9 = this.mCurrentSize;
        System.out.print("{ ");
        for (int i10 = 0; i10 < i9; i10++) {
            SolverVariable variable = getVariable(i10);
            if (variable != null) {
                System.out.print(variable + " = " + getVariableValue(i10) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void divideByAmount(float f10) {
        int i9 = this.mHead;
        for (int i10 = 0; i9 != -1 && i10 < this.mCurrentSize; i10++) {
            float[] fArr = this.mArrayValues;
            fArr[i9] = fArr[i9] / f10;
            i9 = this.mArrayNextIndices[i9];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float get(SolverVariable solverVariable) {
        int i9 = this.mHead;
        for (int i10 = 0; i9 != -1 && i10 < this.mCurrentSize; i10++) {
            if (this.mArrayIndices[i9] == solverVariable.f1300id) {
                return this.mArrayValues[i9];
            }
            i9 = this.mArrayNextIndices[i9];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        return this.mCurrentSize;
    }

    public int getHead() {
        return this.mHead;
    }

    public final int getId(int i9) {
        return this.mArrayIndices[i9];
    }

    public final int getNextIndice(int i9) {
        return this.mArrayNextIndices[i9];
    }

    public SolverVariable getPivotCandidate() {
        SolverVariable solverVariable = this.mCandidate;
        if (solverVariable != null) {
            return solverVariable;
        }
        int i9 = this.mHead;
        SolverVariable solverVariable2 = null;
        for (int i10 = 0; i9 != -1 && i10 < this.mCurrentSize; i10++) {
            if (this.mArrayValues[i9] < 0.0f) {
                SolverVariable solverVariable3 = this.mCache.mIndexedVariables[this.mArrayIndices[i9]];
                if (solverVariable2 == null || solverVariable2.strength < solverVariable3.strength) {
                    solverVariable2 = solverVariable3;
                }
            }
            i9 = this.mArrayNextIndices[i9];
        }
        return solverVariable2;
    }

    public final float getValue(int i9) {
        return this.mArrayValues[i9];
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable getVariable(int i9) {
        int i10 = this.mHead;
        for (int i11 = 0; i10 != -1 && i11 < this.mCurrentSize; i11++) {
            if (i11 == i9) {
                return this.mCache.mIndexedVariables[this.mArrayIndices[i10]];
            }
            i10 = this.mArrayNextIndices[i10];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i9) {
        int i10 = this.mHead;
        for (int i11 = 0; i10 != -1 && i11 < this.mCurrentSize; i11++) {
            if (i11 == i9) {
                return this.mArrayValues[i10];
            }
            i10 = this.mArrayNextIndices[i10];
        }
        return 0.0f;
    }

    public boolean hasAtLeastOnePositiveVariable() {
        int i9 = this.mHead;
        for (int i10 = 0; i9 != -1 && i10 < this.mCurrentSize; i10++) {
            if (this.mArrayValues[i9] > 0.0f) {
                return true;
            }
            i9 = this.mArrayNextIndices[i9];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable solverVariable) {
        int i9 = this.mHead;
        if (i9 == -1) {
            return -1;
        }
        for (int i10 = 0; i9 != -1 && i10 < this.mCurrentSize; i10++) {
            if (this.mArrayIndices[i9] == solverVariable.f1300id) {
                return i9;
            }
            i9 = this.mArrayNextIndices[i9];
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i9 = this.mHead;
        for (int i10 = 0; i9 != -1 && i10 < this.mCurrentSize; i10++) {
            float[] fArr = this.mArrayValues;
            fArr[i9] = fArr[i9] * (-1.0f);
            i9 = this.mArrayNextIndices[i9];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void put(SolverVariable solverVariable, float f10) {
        if (f10 == 0.0f) {
            remove(solverVariable, true);
            return;
        }
        int i9 = this.mHead;
        if (i9 == -1) {
            this.mHead = 0;
            this.mArrayValues[0] = f10;
            this.mArrayIndices[0] = solverVariable.f1300id;
            this.mArrayNextIndices[0] = -1;
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(this.mRow);
            this.mCurrentSize++;
            if (this.mDidFillOnce) {
                return;
            }
            int i10 = this.mLast + 1;
            this.mLast = i10;
            int[] iArr = this.mArrayIndices;
            if (i10 >= iArr.length) {
                this.mDidFillOnce = true;
                this.mLast = iArr.length - 1;
                return;
            }
            return;
        }
        int i11 = -1;
        for (int i12 = 0; i9 != -1 && i12 < this.mCurrentSize; i12++) {
            int i13 = this.mArrayIndices[i9];
            int i14 = solverVariable.f1300id;
            if (i13 == i14) {
                this.mArrayValues[i9] = f10;
                return;
            }
            if (i13 < i14) {
                i11 = i9;
            }
            i9 = this.mArrayNextIndices[i9];
        }
        int length = this.mLast;
        int i15 = length + 1;
        if (this.mDidFillOnce) {
            int[] iArr2 = this.mArrayIndices;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i15;
        }
        int[] iArr3 = this.mArrayIndices;
        if (length >= iArr3.length && this.mCurrentSize < iArr3.length) {
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.mArrayIndices;
                if (i16 >= iArr4.length) {
                    break;
                }
                if (iArr4[i16] == -1) {
                    length = i16;
                    break;
                }
                i16++;
            }
        }
        int[] iArr5 = this.mArrayIndices;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i17 = this.mRowSize * 2;
            this.mRowSize = i17;
            this.mDidFillOnce = false;
            this.mLast = length - 1;
            this.mArrayValues = Arrays.copyOf(this.mArrayValues, i17);
            this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.mRowSize);
            this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.mRowSize);
        }
        this.mArrayIndices[length] = solverVariable.f1300id;
        this.mArrayValues[length] = f10;
        if (i11 != -1) {
            int[] iArr6 = this.mArrayNextIndices;
            iArr6[length] = iArr6[i11];
            iArr6[i11] = length;
        } else {
            this.mArrayNextIndices[length] = this.mHead;
            this.mHead = length;
        }
        solverVariable.usageInRowCount++;
        solverVariable.addToRow(this.mRow);
        int i18 = this.mCurrentSize + 1;
        this.mCurrentSize = i18;
        if (!this.mDidFillOnce) {
            this.mLast++;
        }
        int[] iArr7 = this.mArrayIndices;
        if (i18 >= iArr7.length) {
            this.mDidFillOnce = true;
        }
        if (this.mLast >= iArr7.length) {
            this.mDidFillOnce = true;
            this.mLast = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float remove(SolverVariable solverVariable, boolean z9) {
        if (this.mCandidate == solverVariable) {
            this.mCandidate = null;
        }
        int i9 = this.mHead;
        if (i9 == -1) {
            return 0.0f;
        }
        int i10 = 0;
        int i11 = -1;
        while (i9 != -1 && i10 < this.mCurrentSize) {
            if (this.mArrayIndices[i9] == solverVariable.f1300id) {
                if (i9 == this.mHead) {
                    this.mHead = this.mArrayNextIndices[i9];
                } else {
                    int[] iArr = this.mArrayNextIndices;
                    iArr[i11] = iArr[i9];
                }
                if (z9) {
                    solverVariable.removeFromRow(this.mRow);
                }
                solverVariable.usageInRowCount--;
                this.mCurrentSize--;
                this.mArrayIndices[i9] = -1;
                if (this.mDidFillOnce) {
                    this.mLast = i9;
                }
                return this.mArrayValues[i9];
            }
            i10++;
            i11 = i9;
            i9 = this.mArrayNextIndices[i9];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        return (this.mArrayIndices.length * 12) + 36;
    }

    public String toString() {
        int i9 = this.mHead;
        String str = "";
        for (int i10 = 0; i9 != -1 && i10 < this.mCurrentSize; i10++) {
            str = ((str + " -> ") + this.mArrayValues[i9] + " : ") + this.mCache.mIndexedVariables[this.mArrayIndices[i9]];
            i9 = this.mArrayNextIndices[i9];
        }
        return str;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z9) {
        float f10 = get(arrayRow.mVariable);
        remove(arrayRow.mVariable, z9);
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
        int currentSize = arrayRowVariables.getCurrentSize();
        for (int i9 = 0; i9 < currentSize; i9++) {
            SolverVariable variable = arrayRowVariables.getVariable(i9);
            add(variable, arrayRowVariables.get(variable) * f10, z9);
        }
        return f10;
    }
}
