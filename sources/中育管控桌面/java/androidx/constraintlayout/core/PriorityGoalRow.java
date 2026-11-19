package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
public class PriorityGoalRow extends ArrayRow {
    private static final boolean DEBUG = false;
    private static final float EPSILON = 1.0E-4f;
    static final int NOT_FOUND = -1;
    GoalVariableAccessor mAccessor;
    private SolverVariable[] mArrayGoals;
    Cache mCache;
    private int mNumGoals;
    private SolverVariable[] mSortArray;
    private int mTableSize;

    public class GoalVariableAccessor {
        PriorityGoalRow mRow;
        SolverVariable mVariable;

        public GoalVariableAccessor(PriorityGoalRow priorityGoalRow) {
            this.mRow = priorityGoalRow;
        }

        public void add(SolverVariable solverVariable) {
            for (int i6 = 0; i6 < 9; i6++) {
                float[] fArr = this.mVariable.mGoalStrengthVector;
                float f6 = fArr[i6] + solverVariable.mGoalStrengthVector[i6];
                fArr[i6] = f6;
                if (Math.abs(f6) < 1.0E-4f) {
                    this.mVariable.mGoalStrengthVector[i6] = 0.0f;
                }
            }
        }

        public boolean addToGoal(SolverVariable solverVariable, float f6) {
            boolean z6 = true;
            if (!this.mVariable.inGoal) {
                for (int i6 = 0; i6 < 9; i6++) {
                    float f7 = solverVariable.mGoalStrengthVector[i6];
                    if (f7 != 0.0f) {
                        float f8 = f7 * f6;
                        if (Math.abs(f8) < 1.0E-4f) {
                            f8 = 0.0f;
                        }
                        this.mVariable.mGoalStrengthVector[i6] = f8;
                    } else {
                        this.mVariable.mGoalStrengthVector[i6] = 0.0f;
                    }
                }
                return true;
            }
            for (int i7 = 0; i7 < 9; i7++) {
                float[] fArr = this.mVariable.mGoalStrengthVector;
                float f9 = fArr[i7] + (solverVariable.mGoalStrengthVector[i7] * f6);
                fArr[i7] = f9;
                if (Math.abs(f9) < 1.0E-4f) {
                    this.mVariable.mGoalStrengthVector[i7] = 0.0f;
                } else {
                    z6 = false;
                }
            }
            if (z6) {
                PriorityGoalRow.this.removeGoal(this.mVariable);
            }
            return false;
        }

        public void init(SolverVariable solverVariable) {
            this.mVariable = solverVariable;
        }

        public final boolean isNegative() {
            for (int i6 = 8; i6 >= 0; i6--) {
                float f6 = this.mVariable.mGoalStrengthVector[i6];
                if (f6 > 0.0f) {
                    return false;
                }
                if (f6 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isNull() {
            for (int i6 = 0; i6 < 9; i6++) {
                if (this.mVariable.mGoalStrengthVector[i6] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isSmallerThan(SolverVariable solverVariable) {
            int i6 = 8;
            while (true) {
                if (i6 < 0) {
                    break;
                }
                float f6 = solverVariable.mGoalStrengthVector[i6];
                float f7 = this.mVariable.mGoalStrengthVector[i6];
                if (f7 == f6) {
                    i6--;
                } else if (f7 < f6) {
                    return true;
                }
            }
            return false;
        }

        public void reset() {
            Arrays.fill(this.mVariable.mGoalStrengthVector, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.mVariable != null) {
                for (int i6 = 0; i6 < 9; i6++) {
                    str = str + this.mVariable.mGoalStrengthVector[i6] + " ";
                }
            }
            return str + "] " + this.mVariable;
        }
    }

    public PriorityGoalRow(Cache cache) {
        super(cache);
        this.mTableSize = 128;
        this.mArrayGoals = new SolverVariable[128];
        this.mSortArray = new SolverVariable[128];
        this.mNumGoals = 0;
        this.mAccessor = new GoalVariableAccessor(this);
        this.mCache = cache;
    }

    private void addToGoal(SolverVariable solverVariable) {
        int i6;
        int i7 = this.mNumGoals + 1;
        SolverVariable[] solverVariableArr = this.mArrayGoals;
        if (i7 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.mArrayGoals = solverVariableArr2;
            this.mSortArray = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.mArrayGoals;
        int i8 = this.mNumGoals;
        solverVariableArr3[i8] = solverVariable;
        int i9 = i8 + 1;
        this.mNumGoals = i9;
        if (i9 > 1 && solverVariableArr3[i8].f349id > solverVariable.f349id) {
            int i10 = 0;
            while (true) {
                i6 = this.mNumGoals;
                if (i10 >= i6) {
                    break;
                }
                this.mSortArray[i10] = this.mArrayGoals[i10];
                i10++;
            }
            Arrays.sort(this.mSortArray, 0, i6, new Comparator<SolverVariable>() { // from class: androidx.constraintlayout.core.PriorityGoalRow.1
                @Override // java.util.Comparator
                public int compare(SolverVariable solverVariable2, SolverVariable solverVariable3) {
                    return solverVariable2.f349id - solverVariable3.f349id;
                }
            });
            for (int i11 = 0; i11 < this.mNumGoals; i11++) {
                this.mArrayGoals[i11] = this.mSortArray[i11];
            }
        }
        solverVariable.inGoal = true;
        solverVariable.addToRow(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeGoal(SolverVariable solverVariable) {
        int i6 = 0;
        while (i6 < this.mNumGoals) {
            if (this.mArrayGoals[i6] == solverVariable) {
                while (true) {
                    int i7 = this.mNumGoals;
                    if (i6 >= i7 - 1) {
                        this.mNumGoals = i7 - 1;
                        solverVariable.inGoal = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.mArrayGoals;
                        int i8 = i6 + 1;
                        solverVariableArr[i6] = solverVariableArr[i8];
                        i6 = i8;
                    }
                }
            } else {
                i6++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void addError(SolverVariable solverVariable) {
        this.mAccessor.init(solverVariable);
        this.mAccessor.reset();
        solverVariable.mGoalStrengthVector[solverVariable.strength] = 1.0f;
        addToGoal(solverVariable);
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.mNumGoals = 0;
        this.mConstantValue = 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.constraintlayout.core.SolverVariable getPivotCandidate(androidx.constraintlayout.core.LinearSystem r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = r5
        L3:
            int r2 = r4.mNumGoals
            if (r0 >= r2) goto L32
            androidx.constraintlayout.core.SolverVariable[] r2 = r4.mArrayGoals
            r2 = r2[r0]
            int r3 = r2.f349id
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2f
        L12:
            androidx.constraintlayout.core.PriorityGoalRow$GoalVariableAccessor r3 = r4.mAccessor
            r3.init(r2)
            if (r1 != r5) goto L22
            androidx.constraintlayout.core.PriorityGoalRow$GoalVariableAccessor r2 = r4.mAccessor
            boolean r2 = r2.isNegative()
            if (r2 == 0) goto L2f
            goto L2e
        L22:
            androidx.constraintlayout.core.PriorityGoalRow$GoalVariableAccessor r2 = r4.mAccessor
            androidx.constraintlayout.core.SolverVariable[] r3 = r4.mArrayGoals
            r3 = r3[r1]
            boolean r2 = r2.isSmallerThan(r3)
            if (r2 == 0) goto L2f
        L2e:
            r1 = r0
        L2f:
            int r0 = r0 + 1
            goto L3
        L32:
            if (r1 != r5) goto L36
            r5 = 0
            return r5
        L36:
            androidx.constraintlayout.core.SolverVariable[] r5 = r4.mArrayGoals
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.PriorityGoalRow.getPivotCandidate(androidx.constraintlayout.core.LinearSystem, boolean[]):androidx.constraintlayout.core.SolverVariable");
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        return this.mNumGoals == 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public String toString() {
        String str = " goal -> (" + this.mConstantValue + ") : ";
        for (int i6 = 0; i6 < this.mNumGoals; i6++) {
            this.mAccessor.init(this.mArrayGoals[i6]);
            str = str + this.mAccessor + " ";
        }
        return str;
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z6) {
        SolverVariable solverVariable = arrayRow.mVariable;
        if (solverVariable == null) {
            return;
        }
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
        int currentSize = arrayRowVariables.getCurrentSize();
        for (int i6 = 0; i6 < currentSize; i6++) {
            SolverVariable variable = arrayRowVariables.getVariable(i6);
            float variableValue = arrayRowVariables.getVariableValue(i6);
            this.mAccessor.init(variable);
            if (this.mAccessor.addToGoal(solverVariable, variableValue)) {
                addToGoal(variable);
            }
            this.mConstantValue += arrayRow.mConstantValue * variableValue;
        }
        removeGoal(solverVariable);
    }
}
