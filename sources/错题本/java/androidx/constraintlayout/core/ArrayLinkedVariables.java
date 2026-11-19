package androidx.constraintlayout.core;

import android.support.v4.media.AbstractC0037f;
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
    public void add(SolverVariable solverVariable, float f, boolean z8) {
        float f7 = sEpsilon;
        if (f <= (-f7) || f >= f7) {
            int i = this.mHead;
            if (i == -1) {
                this.mHead = 0;
                this.mArrayValues[0] = f;
                this.mArrayIndices[0] = solverVariable.f943id;
                this.mArrayNextIndices[0] = -1;
                solverVariable.usageInRowCount++;
                solverVariable.addToRow(this.mRow);
                this.mCurrentSize++;
                if (this.mDidFillOnce) {
                    return;
                }
                int i8 = this.mLast + 1;
                this.mLast = i8;
                int[] iArr = this.mArrayIndices;
                if (i8 >= iArr.length) {
                    this.mDidFillOnce = true;
                    this.mLast = iArr.length - 1;
                    return;
                }
                return;
            }
            int i9 = -1;
            for (int i10 = 0; i != -1 && i10 < this.mCurrentSize; i10++) {
                int i11 = this.mArrayIndices[i];
                int i12 = solverVariable.f943id;
                if (i11 == i12) {
                    float[] fArr = this.mArrayValues;
                    float f8 = fArr[i] + f;
                    float f9 = sEpsilon;
                    if (f8 > (-f9) && f8 < f9) {
                        f8 = 0.0f;
                    }
                    fArr[i] = f8;
                    if (f8 == 0.0f) {
                        if (i == this.mHead) {
                            this.mHead = this.mArrayNextIndices[i];
                        } else {
                            int[] iArr2 = this.mArrayNextIndices;
                            iArr2[i9] = iArr2[i];
                        }
                        if (z8) {
                            solverVariable.removeFromRow(this.mRow);
                        }
                        if (this.mDidFillOnce) {
                            this.mLast = i;
                        }
                        solverVariable.usageInRowCount--;
                        this.mCurrentSize--;
                        return;
                    }
                    return;
                }
                if (i11 < i12) {
                    i9 = i;
                }
                i = this.mArrayNextIndices[i];
            }
            int length = this.mLast;
            int i13 = length + 1;
            if (this.mDidFillOnce) {
                int[] iArr3 = this.mArrayIndices;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i13;
            }
            int[] iArr4 = this.mArrayIndices;
            if (length >= iArr4.length && this.mCurrentSize < iArr4.length) {
                int i14 = 0;
                while (true) {
                    int[] iArr5 = this.mArrayIndices;
                    if (i14 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i14] == -1) {
                        length = i14;
                        break;
                    }
                    i14++;
                }
            }
            int[] iArr6 = this.mArrayIndices;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i15 = this.mRowSize * 2;
                this.mRowSize = i15;
                this.mDidFillOnce = false;
                this.mLast = length - 1;
                this.mArrayValues = Arrays.copyOf(this.mArrayValues, i15);
                this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.mRowSize);
                this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.mRowSize);
            }
            this.mArrayIndices[length] = solverVariable.f943id;
            this.mArrayValues[length] = f;
            if (i9 != -1) {
                int[] iArr7 = this.mArrayNextIndices;
                iArr7[length] = iArr7[i9];
                iArr7[i9] = length;
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
            int i16 = this.mLast;
            int[] iArr8 = this.mArrayIndices;
            if (i16 >= iArr8.length) {
                this.mDidFillOnce = true;
                this.mLast = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void clear() {
        int i = this.mHead;
        for (int i8 = 0; i != -1 && i8 < this.mCurrentSize; i8++) {
            SolverVariable solverVariable = this.mCache.mIndexedVariables[this.mArrayIndices[i]];
            if (solverVariable != null) {
                solverVariable.removeFromRow(this.mRow);
            }
            i = this.mArrayNextIndices[i];
        }
        this.mHead = -1;
        this.mLast = -1;
        this.mDidFillOnce = false;
        this.mCurrentSize = 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(SolverVariable solverVariable) {
        int i = this.mHead;
        if (i == -1) {
            return false;
        }
        for (int i8 = 0; i != -1 && i8 < this.mCurrentSize; i8++) {
            if (this.mArrayIndices[i] == solverVariable.f943id) {
                return true;
            }
            i = this.mArrayNextIndices[i];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
        int i = this.mCurrentSize;
        System.out.print("{ ");
        for (int i8 = 0; i8 < i; i8++) {
            SolverVariable variable = getVariable(i8);
            if (variable != null) {
                System.out.print(variable + " = " + getVariableValue(i8) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void divideByAmount(float f) {
        int i = this.mHead;
        for (int i8 = 0; i != -1 && i8 < this.mCurrentSize; i8++) {
            float[] fArr = this.mArrayValues;
            fArr[i] = fArr[i] / f;
            i = this.mArrayNextIndices[i];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float get(SolverVariable solverVariable) {
        int i = this.mHead;
        for (int i8 = 0; i != -1 && i8 < this.mCurrentSize; i8++) {
            if (this.mArrayIndices[i] == solverVariable.f943id) {
                return this.mArrayValues[i];
            }
            i = this.mArrayNextIndices[i];
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

    public final int getId(int i) {
        return this.mArrayIndices[i];
    }

    public final int getNextIndice(int i) {
        return this.mArrayNextIndices[i];
    }

    public SolverVariable getPivotCandidate() {
        SolverVariable solverVariable = this.mCandidate;
        if (solverVariable != null) {
            return solverVariable;
        }
        int i = this.mHead;
        SolverVariable solverVariable2 = null;
        for (int i8 = 0; i != -1 && i8 < this.mCurrentSize; i8++) {
            if (this.mArrayValues[i] < 0.0f) {
                SolverVariable solverVariable3 = this.mCache.mIndexedVariables[this.mArrayIndices[i]];
                if (solverVariable2 == null || solverVariable2.strength < solverVariable3.strength) {
                    solverVariable2 = solverVariable3;
                }
            }
            i = this.mArrayNextIndices[i];
        }
        return solverVariable2;
    }

    public final float getValue(int i) {
        return this.mArrayValues[i];
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable getVariable(int i) {
        int i8 = this.mHead;
        for (int i9 = 0; i8 != -1 && i9 < this.mCurrentSize; i9++) {
            if (i9 == i) {
                return this.mCache.mIndexedVariables[this.mArrayIndices[i8]];
            }
            i8 = this.mArrayNextIndices[i8];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i) {
        int i8 = this.mHead;
        for (int i9 = 0; i8 != -1 && i9 < this.mCurrentSize; i9++) {
            if (i9 == i) {
                return this.mArrayValues[i8];
            }
            i8 = this.mArrayNextIndices[i8];
        }
        return 0.0f;
    }

    public boolean hasAtLeastOnePositiveVariable() {
        int i = this.mHead;
        for (int i8 = 0; i != -1 && i8 < this.mCurrentSize; i8++) {
            if (this.mArrayValues[i] > 0.0f) {
                return true;
            }
            i = this.mArrayNextIndices[i];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable solverVariable) {
        int i = this.mHead;
        if (i == -1) {
            return -1;
        }
        for (int i8 = 0; i != -1 && i8 < this.mCurrentSize; i8++) {
            if (this.mArrayIndices[i] == solverVariable.f943id) {
                return i;
            }
            i = this.mArrayNextIndices[i];
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i = this.mHead;
        for (int i8 = 0; i != -1 && i8 < this.mCurrentSize; i8++) {
            float[] fArr = this.mArrayValues;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.mArrayNextIndices[i];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void put(SolverVariable solverVariable, float f) {
        if (f == 0.0f) {
            remove(solverVariable, true);
            return;
        }
        int i = this.mHead;
        if (i == -1) {
            this.mHead = 0;
            this.mArrayValues[0] = f;
            this.mArrayIndices[0] = solverVariable.f943id;
            this.mArrayNextIndices[0] = -1;
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(this.mRow);
            this.mCurrentSize++;
            if (this.mDidFillOnce) {
                return;
            }
            int i8 = this.mLast + 1;
            this.mLast = i8;
            int[] iArr = this.mArrayIndices;
            if (i8 >= iArr.length) {
                this.mDidFillOnce = true;
                this.mLast = iArr.length - 1;
                return;
            }
            return;
        }
        int i9 = -1;
        for (int i10 = 0; i != -1 && i10 < this.mCurrentSize; i10++) {
            int i11 = this.mArrayIndices[i];
            int i12 = solverVariable.f943id;
            if (i11 == i12) {
                this.mArrayValues[i] = f;
                return;
            }
            if (i11 < i12) {
                i9 = i;
            }
            i = this.mArrayNextIndices[i];
        }
        int length = this.mLast;
        int i13 = length + 1;
        if (this.mDidFillOnce) {
            int[] iArr2 = this.mArrayIndices;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i13;
        }
        int[] iArr3 = this.mArrayIndices;
        if (length >= iArr3.length && this.mCurrentSize < iArr3.length) {
            int i14 = 0;
            while (true) {
                int[] iArr4 = this.mArrayIndices;
                if (i14 >= iArr4.length) {
                    break;
                }
                if (iArr4[i14] == -1) {
                    length = i14;
                    break;
                }
                i14++;
            }
        }
        int[] iArr5 = this.mArrayIndices;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i15 = this.mRowSize * 2;
            this.mRowSize = i15;
            this.mDidFillOnce = false;
            this.mLast = length - 1;
            this.mArrayValues = Arrays.copyOf(this.mArrayValues, i15);
            this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.mRowSize);
            this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.mRowSize);
        }
        this.mArrayIndices[length] = solverVariable.f943id;
        this.mArrayValues[length] = f;
        if (i9 != -1) {
            int[] iArr6 = this.mArrayNextIndices;
            iArr6[length] = iArr6[i9];
            iArr6[i9] = length;
        } else {
            this.mArrayNextIndices[length] = this.mHead;
            this.mHead = length;
        }
        solverVariable.usageInRowCount++;
        solverVariable.addToRow(this.mRow);
        int i16 = this.mCurrentSize + 1;
        this.mCurrentSize = i16;
        if (!this.mDidFillOnce) {
            this.mLast++;
        }
        int[] iArr7 = this.mArrayIndices;
        if (i16 >= iArr7.length) {
            this.mDidFillOnce = true;
        }
        if (this.mLast >= iArr7.length) {
            this.mDidFillOnce = true;
            this.mLast = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float remove(SolverVariable solverVariable, boolean z8) {
        if (this.mCandidate == solverVariable) {
            this.mCandidate = null;
        }
        int i = this.mHead;
        if (i == -1) {
            return 0.0f;
        }
        int i8 = 0;
        int i9 = -1;
        while (i != -1 && i8 < this.mCurrentSize) {
            if (this.mArrayIndices[i] == solverVariable.f943id) {
                if (i == this.mHead) {
                    this.mHead = this.mArrayNextIndices[i];
                } else {
                    int[] iArr = this.mArrayNextIndices;
                    iArr[i9] = iArr[i];
                }
                if (z8) {
                    solverVariable.removeFromRow(this.mRow);
                }
                solverVariable.usageInRowCount--;
                this.mCurrentSize--;
                this.mArrayIndices[i] = -1;
                if (this.mDidFillOnce) {
                    this.mLast = i;
                }
                return this.mArrayValues[i];
            }
            i8++;
            i9 = i;
            i = this.mArrayNextIndices[i];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        return (this.mArrayIndices.length * 12) + 36;
    }

    public String toString() {
        int i = this.mHead;
        String string = "";
        for (int i8 = 0; i != -1 && i8 < this.mCurrentSize; i8++) {
            StringBuilder sbM97v = AbstractC0037f.m97v(AbstractC0037f.m89n(AbstractC0037f.m97v(AbstractC0037f.m74C(string, " -> ")), " : ", this.mArrayValues[i]));
            sbM97v.append(this.mCache.mIndexedVariables[this.mArrayIndices[i]]);
            string = sbM97v.toString();
            i = this.mArrayNextIndices[i];
        }
        return string;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z8) {
        float f = get(arrayRow.mVariable);
        remove(arrayRow.mVariable, z8);
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
        int currentSize = arrayRowVariables.getCurrentSize();
        for (int i = 0; i < currentSize; i++) {
            SolverVariable variable = arrayRowVariables.getVariable(i);
            add(variable, arrayRowVariables.get(variable) * f, z8);
        }
        return f;
    }
}
