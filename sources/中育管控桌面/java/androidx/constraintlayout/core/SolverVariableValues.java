package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import io.reactivex.annotations.SchedulerSupport;
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

    private void addToHashMap(SolverVariable solverVariable, int i6) {
        int[] iArr;
        int i7 = solverVariable.f349id % this.mHashSize;
        int[] iArr2 = this.mKeys;
        int i8 = iArr2[i7];
        if (i8 == -1) {
            iArr2[i7] = i6;
        } else {
            while (true) {
                iArr = this.mNextKeys;
                int i9 = iArr[i8];
                if (i9 == -1) {
                    break;
                } else {
                    i8 = i9;
                }
            }
            iArr[i8] = i6;
        }
        this.mNextKeys[i6] = -1;
    }

    private void addVariable(int i6, SolverVariable solverVariable, float f6) {
        this.mVariables[i6] = solverVariable.f349id;
        this.mValues[i6] = f6;
        this.mPrevious[i6] = -1;
        this.mNext[i6] = -1;
        solverVariable.addToRow(this.mRow);
        solverVariable.usageInRowCount++;
        this.mCount++;
    }

    private void displayHash() {
        for (int i6 = 0; i6 < this.mHashSize; i6++) {
            if (this.mKeys[i6] != -1) {
                String str = hashCode() + " hash [" + i6 + "] => ";
                int i7 = this.mKeys[i6];
                boolean z6 = false;
                while (!z6) {
                    str = str + " " + this.mVariables[i7];
                    int i8 = this.mNextKeys[i7];
                    if (i8 != -1) {
                        i7 = i8;
                    } else {
                        z6 = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    private int findEmptySlot() {
        for (int i6 = 0; i6 < this.mSize; i6++) {
            if (this.mVariables[i6] == -1) {
                return i6;
            }
        }
        return -1;
    }

    private void increaseSize() {
        int i6 = this.mSize * 2;
        this.mVariables = Arrays.copyOf(this.mVariables, i6);
        this.mValues = Arrays.copyOf(this.mValues, i6);
        this.mPrevious = Arrays.copyOf(this.mPrevious, i6);
        this.mNext = Arrays.copyOf(this.mNext, i6);
        this.mNextKeys = Arrays.copyOf(this.mNextKeys, i6);
        for (int i7 = this.mSize; i7 < i6; i7++) {
            this.mVariables[i7] = -1;
            this.mNextKeys[i7] = -1;
        }
        this.mSize = i6;
    }

    private void insertVariable(int i6, SolverVariable solverVariable, float f6) {
        int iFindEmptySlot = findEmptySlot();
        addVariable(iFindEmptySlot, solverVariable, f6);
        if (i6 != -1) {
            this.mPrevious[iFindEmptySlot] = i6;
            int[] iArr = this.mNext;
            iArr[iFindEmptySlot] = iArr[i6];
            iArr[i6] = iFindEmptySlot;
        } else {
            this.mPrevious[iFindEmptySlot] = -1;
            if (this.mCount > 0) {
                this.mNext[iFindEmptySlot] = this.mHead;
                this.mHead = iFindEmptySlot;
            } else {
                this.mNext[iFindEmptySlot] = -1;
            }
        }
        int i7 = this.mNext[iFindEmptySlot];
        if (i7 != -1) {
            this.mPrevious[i7] = iFindEmptySlot;
        }
        addToHashMap(solverVariable, iFindEmptySlot);
    }

    private void removeFromHashMap(SolverVariable solverVariable) {
        int[] iArr;
        int i6;
        int i7 = solverVariable.f349id;
        int i8 = i7 % this.mHashSize;
        int[] iArr2 = this.mKeys;
        int i9 = iArr2[i8];
        if (i9 == -1) {
            return;
        }
        if (this.mVariables[i9] == i7) {
            int[] iArr3 = this.mNextKeys;
            iArr2[i8] = iArr3[i9];
            iArr3[i9] = -1;
            return;
        }
        while (true) {
            iArr = this.mNextKeys;
            i6 = iArr[i9];
            if (i6 == -1 || this.mVariables[i6] == i7) {
                break;
            } else {
                i9 = i6;
            }
        }
        if (i6 == -1 || this.mVariables[i6] != i7) {
            return;
        }
        iArr[i9] = iArr[i6];
        iArr[i6] = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(SolverVariable solverVariable, float f6, boolean z6) {
        float f7 = sEpsilon;
        if (f6 <= (-f7) || f6 >= f7) {
            int iIndexOf = indexOf(solverVariable);
            if (iIndexOf == -1) {
                put(solverVariable, f6);
                return;
            }
            float[] fArr = this.mValues;
            float f8 = fArr[iIndexOf] + f6;
            fArr[iIndexOf] = f8;
            float f9 = sEpsilon;
            if (f8 <= (-f9) || f8 >= f9) {
                return;
            }
            fArr[iIndexOf] = 0.0f;
            remove(solverVariable, z6);
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void clear() {
        int i6 = this.mCount;
        for (int i7 = 0; i7 < i6; i7++) {
            SolverVariable variable = getVariable(i7);
            if (variable != null) {
                variable.removeFromRow(this.mRow);
            }
        }
        for (int i8 = 0; i8 < this.mSize; i8++) {
            this.mVariables[i8] = -1;
            this.mNextKeys[i8] = -1;
        }
        for (int i9 = 0; i9 < this.mHashSize; i9++) {
            this.mKeys[i9] = -1;
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
        int i6 = this.mCount;
        System.out.print("{ ");
        for (int i7 = 0; i7 < i6; i7++) {
            SolverVariable variable = getVariable(i7);
            if (variable != null) {
                System.out.print(variable + " = " + getVariableValue(i7) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void divideByAmount(float f6) {
        int i6 = this.mCount;
        int i7 = this.mHead;
        for (int i8 = 0; i8 < i6; i8++) {
            float[] fArr = this.mValues;
            fArr[i7] = fArr[i7] / f6;
            i7 = this.mNext[i7];
            if (i7 == -1) {
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
    public SolverVariable getVariable(int i6) {
        int i7 = this.mCount;
        if (i7 == 0) {
            return null;
        }
        int i8 = this.mHead;
        for (int i9 = 0; i9 < i7; i9++) {
            if (i9 == i6 && i8 != -1) {
                return this.mCache.mIndexedVariables[this.mVariables[i8]];
            }
            i8 = this.mNext[i8];
            if (i8 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i6) {
        int i7 = this.mCount;
        int i8 = this.mHead;
        for (int i9 = 0; i9 < i7; i9++) {
            if (i9 == i6) {
                return this.mValues[i8];
            }
            i8 = this.mNext[i8];
            if (i8 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable solverVariable) {
        if (this.mCount != 0 && solverVariable != null) {
            int i6 = solverVariable.f349id;
            int i7 = this.mKeys[i6 % this.mHashSize];
            if (i7 == -1) {
                return -1;
            }
            if (this.mVariables[i7] == i6) {
                return i7;
            }
            do {
                i7 = this.mNextKeys[i7];
                if (i7 == -1) {
                    break;
                }
            } while (this.mVariables[i7] != i6);
            if (i7 != -1 && this.mVariables[i7] == i6) {
                return i7;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i6 = this.mCount;
        int i7 = this.mHead;
        for (int i8 = 0; i8 < i6; i8++) {
            float[] fArr = this.mValues;
            fArr[i7] = fArr[i7] * (-1.0f);
            i7 = this.mNext[i7];
            if (i7 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void put(SolverVariable solverVariable, float f6) {
        float f7 = sEpsilon;
        if (f6 > (-f7) && f6 < f7) {
            remove(solverVariable, true);
            return;
        }
        if (this.mCount == 0) {
            addVariable(0, solverVariable, f6);
            addToHashMap(solverVariable, 0);
            this.mHead = 0;
            return;
        }
        int iIndexOf = indexOf(solverVariable);
        if (iIndexOf != -1) {
            this.mValues[iIndexOf] = f6;
            return;
        }
        if (this.mCount + 1 >= this.mSize) {
            increaseSize();
        }
        int i6 = this.mCount;
        int i7 = this.mHead;
        int i8 = -1;
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = this.mVariables[i7];
            int i11 = solverVariable.f349id;
            if (i10 == i11) {
                this.mValues[i7] = f6;
                return;
            }
            if (i10 < i11) {
                i8 = i7;
            }
            i7 = this.mNext[i7];
            if (i7 == -1) {
                break;
            }
        }
        insertVariable(i8, solverVariable, f6);
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float remove(SolverVariable solverVariable, boolean z6) {
        int iIndexOf = indexOf(solverVariable);
        if (iIndexOf == -1) {
            return 0.0f;
        }
        removeFromHashMap(solverVariable);
        float f6 = this.mValues[iIndexOf];
        if (this.mHead == iIndexOf) {
            this.mHead = this.mNext[iIndexOf];
        }
        this.mVariables[iIndexOf] = -1;
        int[] iArr = this.mPrevious;
        int i6 = iArr[iIndexOf];
        if (i6 != -1) {
            int[] iArr2 = this.mNext;
            iArr2[i6] = iArr2[iIndexOf];
        }
        int i7 = this.mNext[iIndexOf];
        if (i7 != -1) {
            iArr[i7] = iArr[iIndexOf];
        }
        this.mCount--;
        solverVariable.usageInRowCount--;
        if (z6) {
            solverVariable.removeFromRow(this.mRow);
        }
        return f6;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        return 0;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i6 = this.mCount;
        for (int i7 = 0; i7 < i6; i7++) {
            SolverVariable variable = getVariable(i7);
            if (variable != null) {
                String str2 = str + variable + " = " + getVariableValue(i7) + " ";
                int iIndexOf = indexOf(variable);
                String str3 = str2 + "[p: ";
                String str4 = (this.mPrevious[iIndexOf] != -1 ? str3 + this.mCache.mIndexedVariables[this.mVariables[this.mPrevious[iIndexOf]]] : str3 + SchedulerSupport.NONE) + ", n: ";
                str = (this.mNext[iIndexOf] != -1 ? str4 + this.mCache.mIndexedVariables[this.mVariables[this.mNext[iIndexOf]]] : str4 + SchedulerSupport.NONE) + "]";
            }
        }
        return str + " }";
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z6) {
        float f6 = get(arrayRow.mVariable);
        remove(arrayRow.mVariable, z6);
        SolverVariableValues solverVariableValues = (SolverVariableValues) arrayRow.variables;
        int currentSize = solverVariableValues.getCurrentSize();
        int i6 = 0;
        int i7 = 0;
        while (i6 < currentSize) {
            int i8 = solverVariableValues.mVariables[i7];
            if (i8 != -1) {
                add(this.mCache.mIndexedVariables[i8], solverVariableValues.mValues[i7] * f6, z6);
                i6++;
            }
            i7++;
        }
        return f6;
    }
}
