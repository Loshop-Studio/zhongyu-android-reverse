package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class SolverVariableValues implements ArrayRow.ArrayRowVariables {
    private static final boolean DEBUG = false;
    private static final boolean HASH = true;
    private static float sEpsilon = 0.001f;
    protected final Cache mCache;
    private final ArrayRow mRow;
    private final int mNone = -1;
    private int mSize = 16;
    private int mHashSize = 16;
    int[] mKeys = new int[16];
    int[] mNextKeys = new int[16];
    int[] mVariables = new int[16];
    float[] mValues = new float[16];
    int[] mPrevious = new int[16];
    int[] mNext = new int[16];
    int mCount = 0;
    int mHead = -1;

    public SolverVariableValues(ArrayRow arrayRow, Cache cache) {
        this.mRow = arrayRow;
        this.mCache = cache;
        clear();
    }

    private void addToHashMap(SolverVariable solverVariable, int i9) {
        int[] iArr;
        int i10 = solverVariable.f1300id % this.mHashSize;
        int[] iArr2 = this.mKeys;
        int i11 = iArr2[i10];
        if (i11 == -1) {
            iArr2[i10] = i9;
        } else {
            while (true) {
                iArr = this.mNextKeys;
                int i12 = iArr[i11];
                if (i12 == -1) {
                    break;
                } else {
                    i11 = i12;
                }
            }
            iArr[i11] = i9;
        }
        this.mNextKeys[i9] = -1;
    }

    private void addVariable(int i9, SolverVariable solverVariable, float f10) {
        this.mVariables[i9] = solverVariable.f1300id;
        this.mValues[i9] = f10;
        this.mPrevious[i9] = -1;
        this.mNext[i9] = -1;
        solverVariable.addToRow(this.mRow);
        solverVariable.usageInRowCount++;
        this.mCount++;
    }

    private void displayHash() {
        for (int i9 = 0; i9 < this.mHashSize; i9++) {
            if (this.mKeys[i9] != -1) {
                String str = hashCode() + " hash [" + i9 + "] => ";
                int i10 = this.mKeys[i9];
                boolean z9 = false;
                while (!z9) {
                    str = str + " " + this.mVariables[i10];
                    int i11 = this.mNextKeys[i10];
                    if (i11 != -1) {
                        i10 = i11;
                    } else {
                        z9 = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    private int findEmptySlot() {
        for (int i9 = 0; i9 < this.mSize; i9++) {
            if (this.mVariables[i9] == -1) {
                return i9;
            }
        }
        return -1;
    }

    private void increaseSize() {
        int i9 = this.mSize * 2;
        this.mVariables = Arrays.copyOf(this.mVariables, i9);
        this.mValues = Arrays.copyOf(this.mValues, i9);
        this.mPrevious = Arrays.copyOf(this.mPrevious, i9);
        this.mNext = Arrays.copyOf(this.mNext, i9);
        this.mNextKeys = Arrays.copyOf(this.mNextKeys, i9);
        for (int i10 = this.mSize; i10 < i9; i10++) {
            this.mVariables[i10] = -1;
            this.mNextKeys[i10] = -1;
        }
        this.mSize = i9;
    }

    private void insertVariable(int i9, SolverVariable solverVariable, float f10) {
        int iFindEmptySlot = findEmptySlot();
        addVariable(iFindEmptySlot, solverVariable, f10);
        if (i9 != -1) {
            this.mPrevious[iFindEmptySlot] = i9;
            int[] iArr = this.mNext;
            iArr[iFindEmptySlot] = iArr[i9];
            iArr[i9] = iFindEmptySlot;
        } else {
            this.mPrevious[iFindEmptySlot] = -1;
            if (this.mCount > 0) {
                this.mNext[iFindEmptySlot] = this.mHead;
                this.mHead = iFindEmptySlot;
            } else {
                this.mNext[iFindEmptySlot] = -1;
            }
        }
        int i10 = this.mNext[iFindEmptySlot];
        if (i10 != -1) {
            this.mPrevious[i10] = iFindEmptySlot;
        }
        addToHashMap(solverVariable, iFindEmptySlot);
    }

    private void removeFromHashMap(SolverVariable solverVariable) {
        int[] iArr;
        int i9;
        int i10 = solverVariable.f1300id;
        int i11 = i10 % this.mHashSize;
        int[] iArr2 = this.mKeys;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            return;
        }
        if (this.mVariables[i12] == i10) {
            int[] iArr3 = this.mNextKeys;
            iArr2[i11] = iArr3[i12];
            iArr3[i12] = -1;
            return;
        }
        while (true) {
            iArr = this.mNextKeys;
            i9 = iArr[i12];
            if (i9 == -1 || this.mVariables[i9] == i10) {
                break;
            } else {
                i12 = i9;
            }
        }
        if (i9 == -1 || this.mVariables[i9] != i10) {
            return;
        }
        iArr[i12] = iArr[i9];
        iArr[i9] = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(SolverVariable solverVariable, float f10, boolean z9) {
        float f11 = sEpsilon;
        if (f10 <= (-f11) || f10 >= f11) {
            int iIndexOf = indexOf(solverVariable);
            if (iIndexOf == -1) {
                put(solverVariable, f10);
                return;
            }
            float[] fArr = this.mValues;
            float f12 = fArr[iIndexOf] + f10;
            fArr[iIndexOf] = f12;
            float f13 = sEpsilon;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[iIndexOf] = 0.0f;
            remove(solverVariable, z9);
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void clear() {
        int i9 = this.mCount;
        for (int i10 = 0; i10 < i9; i10++) {
            SolverVariable variable = getVariable(i10);
            if (variable != null) {
                variable.removeFromRow(this.mRow);
            }
        }
        for (int i11 = 0; i11 < this.mSize; i11++) {
            this.mVariables[i11] = -1;
            this.mNextKeys[i11] = -1;
        }
        for (int i12 = 0; i12 < this.mHashSize; i12++) {
            this.mKeys[i12] = -1;
        }
        this.mCount = 0;
        this.mHead = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(SolverVariable solverVariable) {
        return indexOf(solverVariable) != -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
        int i9 = this.mCount;
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
        int i9 = this.mCount;
        int i10 = this.mHead;
        for (int i11 = 0; i11 < i9; i11++) {
            float[] fArr = this.mValues;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.mNext[i10];
            if (i10 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float get(SolverVariable solverVariable) {
        int iIndexOf = indexOf(solverVariable);
        if (iIndexOf != -1) {
            return this.mValues[iIndexOf];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        return this.mCount;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable getVariable(int i9) {
        int i10 = this.mCount;
        if (i10 == 0) {
            return null;
        }
        int i11 = this.mHead;
        for (int i12 = 0; i12 < i10; i12++) {
            if (i12 == i9 && i11 != -1) {
                return this.mCache.mIndexedVariables[this.mVariables[i11]];
            }
            i11 = this.mNext[i11];
            if (i11 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i9) {
        int i10 = this.mCount;
        int i11 = this.mHead;
        for (int i12 = 0; i12 < i10; i12++) {
            if (i12 == i9) {
                return this.mValues[i11];
            }
            i11 = this.mNext[i11];
            if (i11 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable solverVariable) {
        if (this.mCount != 0 && solverVariable != null) {
            int i9 = solverVariable.f1300id;
            int i10 = this.mKeys[i9 % this.mHashSize];
            if (i10 == -1) {
                return -1;
            }
            if (this.mVariables[i10] == i9) {
                return i10;
            }
            do {
                i10 = this.mNextKeys[i10];
                if (i10 == -1) {
                    break;
                }
            } while (this.mVariables[i10] != i9);
            if (i10 != -1 && this.mVariables[i10] == i9) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i9 = this.mCount;
        int i10 = this.mHead;
        for (int i11 = 0; i11 < i9; i11++) {
            float[] fArr = this.mValues;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.mNext[i10];
            if (i10 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void put(SolverVariable solverVariable, float f10) {
        float f11 = sEpsilon;
        if (f10 > (-f11) && f10 < f11) {
            remove(solverVariable, true);
            return;
        }
        if (this.mCount == 0) {
            addVariable(0, solverVariable, f10);
            addToHashMap(solverVariable, 0);
            this.mHead = 0;
            return;
        }
        int iIndexOf = indexOf(solverVariable);
        if (iIndexOf != -1) {
            this.mValues[iIndexOf] = f10;
            return;
        }
        if (this.mCount + 1 >= this.mSize) {
            increaseSize();
        }
        int i9 = this.mCount;
        int i10 = this.mHead;
        int i11 = -1;
        for (int i12 = 0; i12 < i9; i12++) {
            int i13 = this.mVariables[i10];
            int i14 = solverVariable.f1300id;
            if (i13 == i14) {
                this.mValues[i10] = f10;
                return;
            }
            if (i13 < i14) {
                i11 = i10;
            }
            i10 = this.mNext[i10];
            if (i10 == -1) {
                break;
            }
        }
        insertVariable(i11, solverVariable, f10);
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float remove(SolverVariable solverVariable, boolean z9) {
        int iIndexOf = indexOf(solverVariable);
        if (iIndexOf == -1) {
            return 0.0f;
        }
        removeFromHashMap(solverVariable);
        float f10 = this.mValues[iIndexOf];
        if (this.mHead == iIndexOf) {
            this.mHead = this.mNext[iIndexOf];
        }
        this.mVariables[iIndexOf] = -1;
        int[] iArr = this.mPrevious;
        int i9 = iArr[iIndexOf];
        if (i9 != -1) {
            int[] iArr2 = this.mNext;
            iArr2[i9] = iArr2[iIndexOf];
        }
        int i10 = this.mNext[iIndexOf];
        if (i10 != -1) {
            iArr[i10] = iArr[iIndexOf];
        }
        this.mCount--;
        solverVariable.usageInRowCount--;
        if (z9) {
            solverVariable.removeFromRow(this.mRow);
        }
        return f10;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        return 0;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i9 = this.mCount;
        for (int i10 = 0; i10 < i9; i10++) {
            SolverVariable variable = getVariable(i10);
            if (variable != null) {
                String str2 = str + variable + " = " + getVariableValue(i10) + " ";
                int iIndexOf = indexOf(variable);
                String str3 = str2 + "[p: ";
                String str4 = (this.mPrevious[iIndexOf] != -1 ? str3 + this.mCache.mIndexedVariables[this.mVariables[this.mPrevious[iIndexOf]]] : str3 + "none") + ", n: ";
                str = (this.mNext[iIndexOf] != -1 ? str4 + this.mCache.mIndexedVariables[this.mVariables[this.mNext[iIndexOf]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z9) {
        float f10 = get(arrayRow.mVariable);
        remove(arrayRow.mVariable, z9);
        SolverVariableValues solverVariableValues = (SolverVariableValues) arrayRow.variables;
        int currentSize = solverVariableValues.getCurrentSize();
        int i9 = 0;
        int i10 = 0;
        while (i9 < currentSize) {
            int i11 = solverVariableValues.mVariables[i10];
            if (i11 != -1) {
                add(this.mCache.mIndexedVariables[i11], solverVariableValues.mValues[i10] * f10, z9);
                i9++;
            }
            i10++;
        }
        return f10;
    }
}
