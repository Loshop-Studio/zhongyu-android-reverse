package androidx.constraintlayout.core;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ArrayRow implements LinearSystem.Row {
    private static final boolean DEBUG = false;
    private static final boolean FULL_NEW_CHECK = false;
    public ArrayRowVariables variables;
    SolverVariable mVariable = null;
    float mConstantValue = 0.0f;
    boolean mUsed = false;
    ArrayList<SolverVariable> mVariablesToUpdate = new ArrayList<>();
    boolean mIsSimpleDefinition = false;

    public interface ArrayRowVariables {
        void add(SolverVariable solverVariable, float f10, boolean z9);

        void clear();

        boolean contains(SolverVariable solverVariable);

        void display();

        void divideByAmount(float f10);

        float get(SolverVariable solverVariable);

        int getCurrentSize();

        SolverVariable getVariable(int i9);

        float getVariableValue(int i9);

        int indexOf(SolverVariable solverVariable);

        void invert();

        void put(SolverVariable solverVariable, float f10);

        float remove(SolverVariable solverVariable, boolean z9);

        int sizeInBytes();

        float use(ArrayRow arrayRow, boolean z9);
    }

    public ArrayRow() {
    }

    private boolean isNew(SolverVariable solverVariable, LinearSystem linearSystem) {
        return solverVariable.usageInRowCount <= 1;
    }

    private SolverVariable pickPivotInVariables(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int currentSize = this.variables.getCurrentSize();
        SolverVariable solverVariable2 = null;
        float f10 = 0.0f;
        for (int i9 = 0; i9 < currentSize; i9++) {
            float variableValue = this.variables.getVariableValue(i9);
            if (variableValue < 0.0f) {
                SolverVariable variable = this.variables.getVariable(i9);
                if ((zArr == null || !zArr[variable.f1300id]) && variable != solverVariable && (((type = variable.mType) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && variableValue < f10)) {
                    f10 = variableValue;
                    solverVariable2 = variable;
                }
            }
        }
        return solverVariable2;
    }

    public ArrayRow addError(LinearSystem linearSystem, int i9) {
        this.variables.put(linearSystem.createErrorVariable(i9, "ep"), 1.0f);
        this.variables.put(linearSystem.createErrorVariable(i9, "em"), -1.0f);
        return this;
    }

    public ArrayRow addSingleError(SolverVariable solverVariable, int i9) {
        this.variables.put(solverVariable, i9);
        return this;
    }

    public boolean chooseSubject(LinearSystem linearSystem) {
        boolean z9;
        SolverVariable solverVariableChooseSubjectInVariables = chooseSubjectInVariables(linearSystem);
        if (solverVariableChooseSubjectInVariables == null) {
            z9 = true;
        } else {
            pivot(solverVariableChooseSubjectInVariables);
            z9 = false;
        }
        if (this.variables.getCurrentSize() == 0) {
            this.mIsSimpleDefinition = true;
        }
        return z9;
    }

    public SolverVariable chooseSubjectInVariables(LinearSystem linearSystem) {
        int currentSize = this.variables.getCurrentSize();
        SolverVariable solverVariable = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z9 = false;
        boolean z10 = false;
        SolverVariable solverVariable2 = null;
        for (int i9 = 0; i9 < currentSize; i9++) {
            float variableValue = this.variables.getVariableValue(i9);
            SolverVariable variable = this.variables.getVariable(i9);
            if (variable.mType == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null || f10 > variableValue) {
                    boolean zIsNew = isNew(variable, linearSystem);
                    z9 = zIsNew;
                    f10 = variableValue;
                    solverVariable = variable;
                } else if (!z9 && isNew(variable, linearSystem)) {
                    f10 = variableValue;
                    solverVariable = variable;
                    z9 = true;
                }
            } else if (solverVariable == null && variableValue < 0.0f) {
                if (solverVariable2 == null || f11 > variableValue) {
                    boolean zIsNew2 = isNew(variable, linearSystem);
                    z10 = zIsNew2;
                    f11 = variableValue;
                    solverVariable2 = variable;
                } else if (!z10 && isNew(variable, linearSystem)) {
                    f11 = variableValue;
                    solverVariable2 = variable;
                    z10 = true;
                }
            }
        }
        return solverVariable != null ? solverVariable : solverVariable2;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.variables.clear();
        this.mVariable = null;
        this.mConstantValue = 0.0f;
    }

    public ArrayRow createRowCentering(SolverVariable solverVariable, SolverVariable solverVariable2, int i9, float f10, SolverVariable solverVariable3, SolverVariable solverVariable4, int i10) {
        if (solverVariable2 == solverVariable3) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            if (i9 > 0 || i10 > 0) {
                this.mConstantValue = (-i9) + i10;
                return this;
            }
        } else {
            if (f10 <= 0.0f) {
                this.variables.put(solverVariable, -1.0f);
                this.variables.put(solverVariable2, 1.0f);
                this.mConstantValue = i9;
                return this;
            }
            if (f10 >= 1.0f) {
                this.variables.put(solverVariable4, -1.0f);
                this.variables.put(solverVariable3, 1.0f);
                this.mConstantValue = -i10;
                return this;
            }
            float f11 = 1.0f - f10;
            this.variables.put(solverVariable, f11 * 1.0f);
            this.variables.put(solverVariable2, f11 * (-1.0f));
            this.variables.put(solverVariable3, (-1.0f) * f10);
            this.variables.put(solverVariable4, 1.0f * f10);
            if (i9 > 0 || i10 > 0) {
                this.mConstantValue = ((-i9) * f11) + (i10 * f10);
                return this;
            }
        }
        return this;
    }

    public ArrayRow createRowDefinition(SolverVariable solverVariable, int i9) {
        this.mVariable = solverVariable;
        float f10 = i9;
        solverVariable.computedValue = f10;
        this.mConstantValue = f10;
        this.mIsSimpleDefinition = true;
        return this;
    }

    public ArrayRow createRowDimensionPercent(SolverVariable solverVariable, SolverVariable solverVariable2, float f10) {
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, f10);
        return this;
    }

    public ArrayRow createRowDimensionRatio(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f10) {
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        this.variables.put(solverVariable3, f10);
        this.variables.put(solverVariable4, -f10);
        return this;
    }

    public ArrayRow createRowEqualDimension(float f10, float f11, float f12, SolverVariable solverVariable, int i9, SolverVariable solverVariable2, int i10, SolverVariable solverVariable3, int i11, SolverVariable solverVariable4, int i12) {
        if (f11 == 0.0f || f10 == f12) {
            this.mConstantValue = ((-i9) - i10) + i11 + i12;
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.mConstantValue = ((-i9) - i10) + (i11 * f13) + (i12 * f13);
        this.variables.put(solverVariable, 1.0f);
        this.variables.put(solverVariable2, -1.0f);
        this.variables.put(solverVariable4, f13);
        this.variables.put(solverVariable3, -f13);
        return this;
    }

    public ArrayRow createRowEqualMatchDimensions(float f10, float f11, float f12, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.mConstantValue = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
            return this;
        }
        if (f10 == 0.0f) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            return this;
        }
        if (f12 == 0.0f) {
            this.variables.put(solverVariable3, 1.0f);
            this.variables.put(solverVariable4, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.variables.put(solverVariable, 1.0f);
        this.variables.put(solverVariable2, -1.0f);
        this.variables.put(solverVariable4, f13);
        this.variables.put(solverVariable3, -f13);
        return this;
    }

    public ArrayRow createRowEquals(SolverVariable solverVariable, int i9) {
        if (i9 < 0) {
            this.mConstantValue = i9 * (-1);
            this.variables.put(solverVariable, 1.0f);
            return this;
        }
        this.mConstantValue = i9;
        this.variables.put(solverVariable, -1.0f);
        return this;
    }

    public ArrayRow createRowGreaterThan(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i9) {
        boolean z9 = false;
        if (i9 != 0) {
            if (i9 < 0) {
                i9 *= -1;
                z9 = true;
            }
            this.mConstantValue = i9;
        }
        if (z9) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, -1.0f);
            return this;
        }
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        this.variables.put(solverVariable3, 1.0f);
        return this;
    }

    public ArrayRow createRowLowerThan(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i9) {
        boolean z9 = false;
        if (i9 != 0) {
            if (i9 < 0) {
                i9 *= -1;
                z9 = true;
            }
            this.mConstantValue = i9;
        }
        if (z9) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, 1.0f);
            return this;
        }
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        this.variables.put(solverVariable3, -1.0f);
        return this;
    }

    public ArrayRow createRowWithAngle(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f10) {
        this.variables.put(solverVariable3, 0.5f);
        this.variables.put(solverVariable4, 0.5f);
        this.variables.put(solverVariable, -0.5f);
        this.variables.put(solverVariable2, -0.5f);
        this.mConstantValue = -f10;
        return this;
    }

    public void ensurePositiveConstant() {
        float f10 = this.mConstantValue;
        if (f10 < 0.0f) {
            this.mConstantValue = f10 * (-1.0f);
            this.variables.invert();
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getKey() {
        return this.mVariable;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr) {
        return pickPivotInVariables(zArr, null);
    }

    public boolean hasKeyVariable() {
        SolverVariable solverVariable = this.mVariable;
        if (solverVariable != null) {
            return solverVariable.mType == SolverVariable.Type.UNRESTRICTED || this.mConstantValue >= 0.0f;
        }
        return false;
    }

    public boolean hasVariable(SolverVariable solverVariable) {
        return this.variables.contains(solverVariable);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void initFromRow(LinearSystem.Row row) {
        if (row instanceof ArrayRow) {
            ArrayRow arrayRow = (ArrayRow) row;
            this.mVariable = null;
            this.variables.clear();
            for (int i9 = 0; i9 < arrayRow.variables.getCurrentSize(); i9++) {
                this.variables.add(arrayRow.variables.getVariable(i9), arrayRow.variables.getVariableValue(i9), true);
            }
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        return this.mVariable == null && this.mConstantValue == 0.0f && this.variables.getCurrentSize() == 0;
    }

    public SolverVariable pickPivot(SolverVariable solverVariable) {
        return pickPivotInVariables(null, solverVariable);
    }

    public void pivot(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.mVariable;
        if (solverVariable2 != null) {
            this.variables.put(solverVariable2, -1.0f);
            this.mVariable.mDefinitionId = -1;
            this.mVariable = null;
        }
        float fRemove = this.variables.remove(solverVariable, true) * (-1.0f);
        this.mVariable = solverVariable;
        if (fRemove == 1.0f) {
            return;
        }
        this.mConstantValue /= fRemove;
        this.variables.divideByAmount(fRemove);
    }

    public void reset() {
        this.mVariable = null;
        this.variables.clear();
        this.mConstantValue = 0.0f;
        this.mIsSimpleDefinition = false;
    }

    public int sizeInBytes() {
        return (this.mVariable != null ? 4 : 0) + 8 + this.variables.sizeInBytes();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toReadableString() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.ArrayRow.toReadableString():java.lang.String");
    }

    public String toString() {
        return toReadableString();
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromFinalVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z9) {
        if (solverVariable == null || !solverVariable.isFinalValue) {
            return;
        }
        this.mConstantValue += solverVariable.computedValue * this.variables.get(solverVariable);
        this.variables.remove(solverVariable, z9);
        if (z9) {
            solverVariable.removeFromRow(this);
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
            this.mIsSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z9) {
        this.mConstantValue += arrayRow.mConstantValue * this.variables.use(arrayRow, z9);
        if (z9) {
            arrayRow.mVariable.removeFromRow(this);
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.mVariable != null && this.variables.getCurrentSize() == 0) {
            this.mIsSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    public void updateFromSynonymVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z9) {
        if (solverVariable == null || !solverVariable.mIsSynonym) {
            return;
        }
        float f10 = this.variables.get(solverVariable);
        this.mConstantValue += solverVariable.mSynonymDelta * f10;
        this.variables.remove(solverVariable, z9);
        if (z9) {
            solverVariable.removeFromRow(this);
        }
        this.variables.add(linearSystem.mCache.mIndexedVariables[solverVariable.mSynonym], f10, z9);
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
            this.mIsSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromSystem(LinearSystem linearSystem) {
        if (linearSystem.mRows.length == 0) {
            return;
        }
        boolean z9 = false;
        while (!z9) {
            int currentSize = this.variables.getCurrentSize();
            for (int i9 = 0; i9 < currentSize; i9++) {
                SolverVariable variable = this.variables.getVariable(i9);
                if (variable.mDefinitionId != -1 || variable.isFinalValue || variable.mIsSynonym) {
                    this.mVariablesToUpdate.add(variable);
                }
            }
            int size = this.mVariablesToUpdate.size();
            if (size > 0) {
                for (int i10 = 0; i10 < size; i10++) {
                    SolverVariable solverVariable = this.mVariablesToUpdate.get(i10);
                    if (solverVariable.isFinalValue) {
                        updateFromFinalVariable(linearSystem, solverVariable, true);
                    } else if (solverVariable.mIsSynonym) {
                        updateFromSynonymVariable(linearSystem, solverVariable, true);
                    } else {
                        updateFromRow(linearSystem, linearSystem.mRows[solverVariable.mDefinitionId], true);
                    }
                }
                this.mVariablesToUpdate.clear();
            } else {
                z9 = true;
            }
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.mVariable != null && this.variables.getCurrentSize() == 0) {
            this.mIsSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void addError(SolverVariable solverVariable) {
        int i9 = solverVariable.strength;
        float f10 = 1.0f;
        if (i9 != 1) {
            if (i9 == 2) {
                f10 = 1000.0f;
            } else if (i9 == 3) {
                f10 = 1000000.0f;
            } else if (i9 == 4) {
                f10 = 1.0E9f;
            } else if (i9 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.variables.put(solverVariable, f10);
    }

    public ArrayRow createRowEquals(SolverVariable solverVariable, SolverVariable solverVariable2, int i9) {
        boolean z9 = false;
        if (i9 != 0) {
            if (i9 < 0) {
                i9 *= -1;
                z9 = true;
            }
            this.mConstantValue = i9;
        }
        if (!z9) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            return this;
        }
        this.variables.put(solverVariable, 1.0f);
        this.variables.put(solverVariable2, -1.0f);
        return this;
    }

    public ArrayRow(Cache cache) {
        this.variables = new ArrayLinkedVariables(this, cache);
    }

    public ArrayRow createRowGreaterThan(SolverVariable solverVariable, int i9, SolverVariable solverVariable2) {
        this.mConstantValue = i9;
        this.variables.put(solverVariable, -1.0f);
        return this;
    }
}
