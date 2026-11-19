package androidx.constraintlayout.core;

import android.support.v4.media.AbstractC0037f;
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

    private void addToHashMap(SolverVariable solverVariable, int i) {
        int[] iArr;
        int i8 = solverVariable.f943id % this.mHashSize;
        int[] iArr2 = this.mKeys;
        int i9 = iArr2[i8];
        if (i9 == -1) {
            iArr2[i8] = i;
        } else {
            while (true) {
                iArr = this.mNextKeys;
                int i10 = iArr[i9];
                if (i10 == -1) {
                    break;
                } else {
                    i9 = i10;
                }
            }
            iArr[i9] = i;
        }
        this.mNextKeys[i] = -1;
    }

    private void addVariable(int i, SolverVariable solverVariable, float f) {
        this.mVariables[i] = solverVariable.f943id;
        this.mValues[i] = f;
        this.mPrevious[i] = -1;
        this.mNext[i] = -1;
        solverVariable.addToRow(this.mRow);
        solverVariable.usageInRowCount++;
        this.mCount++;
    }

    private void displayHash() {
        for (int i = 0; i < this.mHashSize; i++) {
            if (this.mKeys[i] != -1) {
                String string = hashCode() + " hash [" + i + "] => ";
                int i8 = this.mKeys[i];
                boolean z8 = false;
                while (!z8) {
                    StringBuilder sbM98w = AbstractC0037f.m98w(string, " ");
                    sbM98w.append(this.mVariables[i8]);
                    string = sbM98w.toString();
                    int i9 = this.mNextKeys[i8];
                    if (i9 != -1) {
                        i8 = i9;
                    } else {
                        z8 = true;
                    }
                }
                System.out.println(string);
            }
        }
    }

    private int findEmptySlot() {
        for (int i = 0; i < this.mSize; i++) {
            if (this.mVariables[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    private void increaseSize() {
        int i = this.mSize * 2;
        this.mVariables = Arrays.copyOf(this.mVariables, i);
        this.mValues = Arrays.copyOf(this.mValues, i);
        this.mPrevious = Arrays.copyOf(this.mPrevious, i);
        this.mNext = Arrays.copyOf(this.mNext, i);
        this.mNextKeys = Arrays.copyOf(this.mNextKeys, i);
        for (int i8 = this.mSize; i8 < i; i8++) {
            this.mVariables[i8] = -1;
            this.mNextKeys[i8] = -1;
        }
        this.mSize = i;
    }

    private void insertVariable(int i, SolverVariable solverVariable, float f) {
        int iFindEmptySlot = findEmptySlot();
        addVariable(iFindEmptySlot, solverVariable, f);
        if (i != -1) {
            this.mPrevious[iFindEmptySlot] = i;
            int[] iArr = this.mNext;
            iArr[iFindEmptySlot] = iArr[i];
            iArr[i] = iFindEmptySlot;
        } else {
            this.mPrevious[iFindEmptySlot] = -1;
            if (this.mCount > 0) {
                this.mNext[iFindEmptySlot] = this.mHead;
                this.mHead = iFindEmptySlot;
            } else {
                this.mNext[iFindEmptySlot] = -1;
            }
        }
        int i8 = this.mNext[iFindEmptySlot];
        if (i8 != -1) {
            this.mPrevious[i8] = iFindEmptySlot;
        }
        addToHashMap(solverVariable, iFindEmptySlot);
    }

    private void removeFromHashMap(SolverVariable solverVariable) {
        int[] iArr;
        int i;
        int i8 = solverVariable.f943id;
        int i9 = i8 % this.mHashSize;
        int[] iArr2 = this.mKeys;
        int i10 = iArr2[i9];
        if (i10 == -1) {
            return;
        }
        if (this.mVariables[i10] == i8) {
            int[] iArr3 = this.mNextKeys;
            iArr2[i9] = iArr3[i10];
            iArr3[i10] = -1;
            return;
        }
        while (true) {
            iArr = this.mNextKeys;
            i = iArr[i10];
            if (i == -1 || this.mVariables[i] == i8) {
                break;
            } else {
                i10 = i;
            }
        }
        if (i == -1 || this.mVariables[i] != i8) {
            return;
        }
        iArr[i10] = iArr[i];
        iArr[i] = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(SolverVariable solverVariable, float f, boolean z8) {
        float f7 = sEpsilon;
        if (f <= (-f7) || f >= f7) {
            int iIndexOf = indexOf(solverVariable);
            if (iIndexOf == -1) {
                put(solverVariable, f);
                return;
            }
            float[] fArr = this.mValues;
            float f8 = fArr[iIndexOf] + f;
            fArr[iIndexOf] = f8;
            float f9 = sEpsilon;
            if (f8 <= (-f9) || f8 >= f9) {
                return;
            }
            fArr[iIndexOf] = 0.0f;
            remove(solverVariable, z8);
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void clear() {
        int i = this.mCount;
        for (int i8 = 0; i8 < i; i8++) {
            SolverVariable variable = getVariable(i8);
            if (variable != null) {
                variable.removeFromRow(this.mRow);
            }
        }
        for (int i9 = 0; i9 < this.mSize; i9++) {
            this.mVariables[i9] = -1;
            this.mNextKeys[i9] = -1;
        }
        for (int i10 = 0; i10 < this.mHashSize; i10++) {
            this.mKeys[i10] = -1;
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
        int i = this.mCount;
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
        int i = this.mCount;
        int i8 = this.mHead;
        for (int i9 = 0; i9 < i; i9++) {
            float[] fArr = this.mValues;
            fArr[i8] = fArr[i8] / f;
            i8 = this.mNext[i8];
            if (i8 == -1) {
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
    public SolverVariable getVariable(int i) {
        int i8 = this.mCount;
        if (i8 == 0) {
            return null;
        }
        int i9 = this.mHead;
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == i && i9 != -1) {
                return this.mCache.mIndexedVariables[this.mVariables[i9]];
            }
            i9 = this.mNext[i9];
            if (i9 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i) {
        int i8 = this.mCount;
        int i9 = this.mHead;
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == i) {
                return this.mValues[i9];
            }
            i9 = this.mNext[i9];
            if (i9 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable solverVariable) {
        if (this.mCount != 0 && solverVariable != null) {
            int i = solverVariable.f943id;
            int i8 = this.mKeys[i % this.mHashSize];
            if (i8 == -1) {
                return -1;
            }
            if (this.mVariables[i8] == i) {
                return i8;
            }
            do {
                i8 = this.mNextKeys[i8];
                if (i8 == -1) {
                    break;
                }
            } while (this.mVariables[i8] != i);
            if (i8 != -1 && this.mVariables[i8] == i) {
                return i8;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i = this.mCount;
        int i8 = this.mHead;
        for (int i9 = 0; i9 < i; i9++) {
            float[] fArr = this.mValues;
            fArr[i8] = fArr[i8] * (-1.0f);
            i8 = this.mNext[i8];
            if (i8 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void put(SolverVariable solverVariable, float f) {
        float f7 = sEpsilon;
        if (f > (-f7) && f < f7) {
            remove(solverVariable, true);
            return;
        }
        if (this.mCount == 0) {
            addVariable(0, solverVariable, f);
            addToHashMap(solverVariable, 0);
            this.mHead = 0;
            return;
        }
        int iIndexOf = indexOf(solverVariable);
        if (iIndexOf != -1) {
            this.mValues[iIndexOf] = f;
            return;
        }
        if (this.mCount + 1 >= this.mSize) {
            increaseSize();
        }
        int i = this.mCount;
        int i8 = this.mHead;
        int i9 = -1;
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = this.mVariables[i8];
            int i12 = solverVariable.f943id;
            if (i11 == i12) {
                this.mValues[i8] = f;
                return;
            }
            if (i11 < i12) {
                i9 = i8;
            }
            i8 = this.mNext[i8];
            if (i8 == -1) {
                break;
            }
        }
        insertVariable(i9, solverVariable, f);
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float remove(SolverVariable solverVariable, boolean z8) {
        int iIndexOf = indexOf(solverVariable);
        if (iIndexOf == -1) {
            return 0.0f;
        }
        removeFromHashMap(solverVariable);
        float f = this.mValues[iIndexOf];
        if (this.mHead == iIndexOf) {
            this.mHead = this.mNext[iIndexOf];
        }
        this.mVariables[iIndexOf] = -1;
        int[] iArr = this.mPrevious;
        int i = iArr[iIndexOf];
        if (i != -1) {
            int[] iArr2 = this.mNext;
            iArr2[i] = iArr2[iIndexOf];
        }
        int i8 = this.mNext[iIndexOf];
        if (i8 != -1) {
            iArr[i8] = iArr[iIndexOf];
        }
        this.mCount--;
        solverVariable.usageInRowCount--;
        if (z8) {
            solverVariable.removeFromRow(this.mRow);
        }
        return f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        return 0;
    }

    public String toString() {
        String strM74C;
        String strM74C2;
        String strM74C3 = hashCode() + " { ";
        int i = this.mCount;
        for (int i8 = 0; i8 < i; i8++) {
            SolverVariable variable = getVariable(i8);
            if (variable != null) {
                String str = strM74C3 + variable + " = " + getVariableValue(i8) + " ";
                int iIndexOf = indexOf(variable);
                String strM74C4 = AbstractC0037f.m74C(str, "[p: ");
                if (this.mPrevious[iIndexOf] != -1) {
                    StringBuilder sbM97v = AbstractC0037f.m97v(strM74C4);
                    sbM97v.append(this.mCache.mIndexedVariables[this.mVariables[this.mPrevious[iIndexOf]]]);
                    strM74C = sbM97v.toString();
                } else {
                    strM74C = AbstractC0037f.m74C(strM74C4, SchedulerSupport.NONE);
                }
                String strM74C5 = AbstractC0037f.m74C(strM74C, ", n: ");
                if (this.mNext[iIndexOf] != -1) {
                    StringBuilder sbM97v2 = AbstractC0037f.m97v(strM74C5);
                    sbM97v2.append(this.mCache.mIndexedVariables[this.mVariables[this.mNext[iIndexOf]]]);
                    strM74C2 = sbM97v2.toString();
                } else {
                    strM74C2 = AbstractC0037f.m74C(strM74C5, SchedulerSupport.NONE);
                }
                strM74C3 = AbstractC0037f.m74C(strM74C2, "]");
            }
        }
        return AbstractC0037f.m74C(strM74C3, " }");
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z8) {
        float f = get(arrayRow.mVariable);
        remove(arrayRow.mVariable, z8);
        SolverVariableValues solverVariableValues = (SolverVariableValues) arrayRow.variables;
        int currentSize = solverVariableValues.getCurrentSize();
        int i = 0;
        int i8 = 0;
        while (i < currentSize) {
            int i9 = solverVariableValues.mVariables[i8];
            if (i9 != -1) {
                add(this.mCache.mIndexedVariables[i9], solverVariableValues.mValues[i8] * f, z8);
                i++;
            }
            i8++;
        }
        return f;
    }
}
