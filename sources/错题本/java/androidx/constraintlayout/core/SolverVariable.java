package androidx.constraintlayout.core;

import android.support.v4.media.AbstractC0037f;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class SolverVariable implements Comparable<SolverVariable> {
    private static final boolean DO_NOT_USE = false;
    private static final boolean INTERNAL_DEBUG = false;
    static final int MAX_STRENGTH = 9;
    public static final int STRENGTH_BARRIER = 6;
    public static final int STRENGTH_CENTERING = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 8;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;
    private static final boolean VAR_USE_HASH = false;
    private static int sUniqueConstantId = 1;
    private static int sUniqueErrorId = 1;
    private static int sUniqueId = 1;
    private static int sUniqueSlackId = 1;
    private static int sUniqueUnrestrictedId = 1;
    public float computedValue;

    /* renamed from: id */
    public int f943id;
    public boolean inGoal;
    public boolean isFinalValue;
    ArrayRow[] mClientEquations;
    int mClientEquationsCount;
    int mDefinitionId;
    float[] mGoalStrengthVector;
    HashSet<ArrayRow> mInRows;
    boolean mIsSynonym;
    private String mName;
    float[] mStrengthVector;
    int mSynonym;
    float mSynonymDelta;
    Type mType;
    public int strength;
    public int usageInRowCount;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(String str, Type type) {
        this.f943id = -1;
        this.mDefinitionId = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.mStrengthVector = new float[9];
        this.mGoalStrengthVector = new float[9];
        this.mClientEquations = new ArrayRow[16];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        this.mInRows = null;
        this.mName = str;
        this.mType = type;
    }

    private static String getUniqueName(Type type, String str) {
        if (str != null) {
            StringBuilder sbM97v = AbstractC0037f.m97v(str);
            sbM97v.append(sUniqueErrorId);
            return sbM97v.toString();
        }
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            StringBuilder sb = new StringBuilder("U");
            int i = sUniqueUnrestrictedId + 1;
            sUniqueUnrestrictedId = i;
            sb.append(i);
            return sb.toString();
        }
        if (iOrdinal == 1) {
            StringBuilder sb2 = new StringBuilder("C");
            int i8 = sUniqueConstantId + 1;
            sUniqueConstantId = i8;
            sb2.append(i8);
            return sb2.toString();
        }
        if (iOrdinal == 2) {
            StringBuilder sb3 = new StringBuilder(ExifInterface.LATITUDE_SOUTH);
            int i9 = sUniqueSlackId + 1;
            sUniqueSlackId = i9;
            sb3.append(i9);
            return sb3.toString();
        }
        if (iOrdinal == 3) {
            StringBuilder sb4 = new StringBuilder("e");
            int i10 = sUniqueErrorId + 1;
            sUniqueErrorId = i10;
            sb4.append(i10);
            return sb4.toString();
        }
        if (iOrdinal != 4) {
            throw new AssertionError(type.name());
        }
        StringBuilder sb5 = new StringBuilder(ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        int i11 = sUniqueId + 1;
        sUniqueId = i11;
        sb5.append(i11);
        return sb5.toString();
    }

    public static void increaseErrorId() {
        sUniqueErrorId++;
    }

    public final void addToRow(ArrayRow arrayRow) {
        int i = 0;
        while (true) {
            int i8 = this.mClientEquationsCount;
            if (i >= i8) {
                ArrayRow[] arrayRowArr = this.mClientEquations;
                if (i8 >= arrayRowArr.length) {
                    this.mClientEquations = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                ArrayRow[] arrayRowArr2 = this.mClientEquations;
                int i9 = this.mClientEquationsCount;
                arrayRowArr2[i9] = arrayRow;
                this.mClientEquationsCount = i9 + 1;
                return;
            }
            if (this.mClientEquations[i] == arrayRow) {
                return;
            } else {
                i++;
            }
        }
    }

    public void clearStrengths() {
        for (int i = 0; i < 9; i++) {
            this.mStrengthVector[i] = 0.0f;
        }
    }

    public String getName() {
        return this.mName;
    }

    public final void removeFromRow(ArrayRow arrayRow) {
        int i = this.mClientEquationsCount;
        int i8 = 0;
        while (i8 < i) {
            if (this.mClientEquations[i8] == arrayRow) {
                while (i8 < i - 1) {
                    ArrayRow[] arrayRowArr = this.mClientEquations;
                    int i9 = i8 + 1;
                    arrayRowArr[i8] = arrayRowArr[i9];
                    i8 = i9;
                }
                this.mClientEquationsCount--;
                return;
            }
            i8++;
        }
    }

    public void reset() {
        this.mName = null;
        this.mType = Type.UNKNOWN;
        this.strength = 0;
        this.f943id = -1;
        this.mDefinitionId = -1;
        this.computedValue = 0.0f;
        this.isFinalValue = false;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        int i = this.mClientEquationsCount;
        for (int i8 = 0; i8 < i; i8++) {
            this.mClientEquations[i8] = null;
        }
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.inGoal = false;
        Arrays.fill(this.mGoalStrengthVector, 0.0f);
    }

    public void setFinalValue(LinearSystem linearSystem, float f) {
        this.computedValue = f;
        this.isFinalValue = true;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        int i = this.mClientEquationsCount;
        this.mDefinitionId = -1;
        for (int i8 = 0; i8 < i; i8++) {
            this.mClientEquations[i8].updateFromFinalVariable(linearSystem, this, false);
        }
        this.mClientEquationsCount = 0;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setSynonym(LinearSystem linearSystem, SolverVariable solverVariable, float f) {
        this.mIsSynonym = true;
        this.mSynonym = solverVariable.f943id;
        this.mSynonymDelta = f;
        int i = this.mClientEquationsCount;
        this.mDefinitionId = -1;
        for (int i8 = 0; i8 < i; i8++) {
            this.mClientEquations[i8].updateFromSynonymVariable(linearSystem, this, false);
        }
        this.mClientEquationsCount = 0;
        linearSystem.displayReadableRows();
    }

    public void setType(Type type, String str) {
        this.mType = type;
    }

    public String strengthsToString() {
        String strM74C = this + "[";
        int i = 0;
        boolean z8 = false;
        boolean z9 = true;
        while (i < this.mStrengthVector.length) {
            StringBuilder sbM97v = AbstractC0037f.m97v(strM74C);
            sbM97v.append(this.mStrengthVector[i]);
            String string = sbM97v.toString();
            float[] fArr = this.mStrengthVector;
            float f = fArr[i];
            if (f > 0.0f) {
                z8 = false;
            } else if (f < 0.0f) {
                z8 = true;
            }
            if (f != 0.0f) {
                z9 = false;
            }
            strM74C = i < fArr.length - 1 ? AbstractC0037f.m74C(string, ", ") : AbstractC0037f.m74C(string, "] ");
            i++;
        }
        if (z8) {
            strM74C = AbstractC0037f.m74C(strM74C, " (-)");
        }
        return z9 ? AbstractC0037f.m74C(strM74C, " (*)") : strM74C;
    }

    public String toString() {
        if (this.mName != null) {
            return "" + this.mName;
        }
        return "" + this.f943id;
    }

    public final void updateReferencesWithNewDefinition(LinearSystem linearSystem, ArrayRow arrayRow) {
        int i = this.mClientEquationsCount;
        for (int i8 = 0; i8 < i; i8++) {
            this.mClientEquations[i8].updateFromRow(linearSystem, arrayRow, false);
        }
        this.mClientEquationsCount = 0;
    }

    @Override // java.lang.Comparable
    public int compareTo(SolverVariable solverVariable) {
        return this.f943id - solverVariable.f943id;
    }

    public SolverVariable(Type type, String str) {
        this.f943id = -1;
        this.mDefinitionId = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.mStrengthVector = new float[9];
        this.mGoalStrengthVector = new float[9];
        this.mClientEquations = new ArrayRow[16];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        this.mInRows = null;
        this.mType = type;
    }
}
