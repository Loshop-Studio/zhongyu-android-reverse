package androidx.constraintlayout.core;

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
    public int f349id;
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
        this.f349id = -1;
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
            return str + sUniqueErrorId;
        }
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("U");
            int i6 = sUniqueUnrestrictedId + 1;
            sUniqueUnrestrictedId = i6;
            sb.append(i6);
            return sb.toString();
        }
        if (iOrdinal == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("C");
            int i7 = sUniqueConstantId + 1;
            sUniqueConstantId = i7;
            sb2.append(i7);
            return sb2.toString();
        }
        if (iOrdinal == 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(ExifInterface.LATITUDE_SOUTH);
            int i8 = sUniqueSlackId + 1;
            sUniqueSlackId = i8;
            sb3.append(i8);
            return sb3.toString();
        }
        if (iOrdinal == 3) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("e");
            int i9 = sUniqueErrorId + 1;
            sUniqueErrorId = i9;
            sb4.append(i9);
            return sb4.toString();
        }
        if (iOrdinal != 4) {
            throw new AssertionError(type.name());
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        int i10 = sUniqueId + 1;
        sUniqueId = i10;
        sb5.append(i10);
        return sb5.toString();
    }

    public static void increaseErrorId() {
        sUniqueErrorId++;
    }

    public final void addToRow(ArrayRow arrayRow) {
        int i6 = 0;
        while (true) {
            int i7 = this.mClientEquationsCount;
            if (i6 >= i7) {
                ArrayRow[] arrayRowArr = this.mClientEquations;
                if (i7 >= arrayRowArr.length) {
                    this.mClientEquations = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                ArrayRow[] arrayRowArr2 = this.mClientEquations;
                int i8 = this.mClientEquationsCount;
                arrayRowArr2[i8] = arrayRow;
                this.mClientEquationsCount = i8 + 1;
                return;
            }
            if (this.mClientEquations[i6] == arrayRow) {
                return;
            } else {
                i6++;
            }
        }
    }

    public void clearStrengths() {
        for (int i6 = 0; i6 < 9; i6++) {
            this.mStrengthVector[i6] = 0.0f;
        }
    }

    public String getName() {
        return this.mName;
    }

    public final void removeFromRow(ArrayRow arrayRow) {
        int i6 = this.mClientEquationsCount;
        int i7 = 0;
        while (i7 < i6) {
            if (this.mClientEquations[i7] == arrayRow) {
                while (i7 < i6 - 1) {
                    ArrayRow[] arrayRowArr = this.mClientEquations;
                    int i8 = i7 + 1;
                    arrayRowArr[i7] = arrayRowArr[i8];
                    i7 = i8;
                }
                this.mClientEquationsCount--;
                return;
            }
            i7++;
        }
    }

    public void reset() {
        this.mName = null;
        this.mType = Type.UNKNOWN;
        this.strength = 0;
        this.f349id = -1;
        this.mDefinitionId = -1;
        this.computedValue = 0.0f;
        this.isFinalValue = false;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        int i6 = this.mClientEquationsCount;
        for (int i7 = 0; i7 < i6; i7++) {
            this.mClientEquations[i7] = null;
        }
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.inGoal = false;
        Arrays.fill(this.mGoalStrengthVector, 0.0f);
    }

    public void setFinalValue(LinearSystem linearSystem, float f6) {
        this.computedValue = f6;
        this.isFinalValue = true;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        int i6 = this.mClientEquationsCount;
        this.mDefinitionId = -1;
        for (int i7 = 0; i7 < i6; i7++) {
            this.mClientEquations[i7].updateFromFinalVariable(linearSystem, this, false);
        }
        this.mClientEquationsCount = 0;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setSynonym(LinearSystem linearSystem, SolverVariable solverVariable, float f6) {
        this.mIsSynonym = true;
        this.mSynonym = solverVariable.f349id;
        this.mSynonymDelta = f6;
        int i6 = this.mClientEquationsCount;
        this.mDefinitionId = -1;
        for (int i7 = 0; i7 < i6; i7++) {
            this.mClientEquations[i7].updateFromSynonymVariable(linearSystem, this, false);
        }
        this.mClientEquationsCount = 0;
        linearSystem.displayReadableRows();
    }

    public void setType(Type type, String str) {
        this.mType = type;
    }

    public String strengthsToString() {
        String str = this + "[";
        boolean z6 = false;
        boolean z7 = true;
        for (int i6 = 0; i6 < this.mStrengthVector.length; i6++) {
            String str2 = str + this.mStrengthVector[i6];
            float[] fArr = this.mStrengthVector;
            float f6 = fArr[i6];
            if (f6 > 0.0f) {
                z6 = false;
            } else if (f6 < 0.0f) {
                z6 = true;
            }
            if (f6 != 0.0f) {
                z7 = false;
            }
            str = i6 < fArr.length - 1 ? str2 + ", " : str2 + "] ";
        }
        if (z6) {
            str = str + " (-)";
        }
        if (!z7) {
            return str;
        }
        return str + " (*)";
    }

    public String toString() {
        if (this.mName != null) {
            return "" + this.mName;
        }
        return "" + this.f349id;
    }

    public final void updateReferencesWithNewDefinition(LinearSystem linearSystem, ArrayRow arrayRow) {
        int i6 = this.mClientEquationsCount;
        for (int i7 = 0; i7 < i6; i7++) {
            this.mClientEquations[i7].updateFromRow(linearSystem, arrayRow, false);
        }
        this.mClientEquationsCount = 0;
    }

    @Override // java.lang.Comparable
    public int compareTo(SolverVariable solverVariable) {
        return this.f349id - solverVariable.f349id;
    }

    public SolverVariable(Type type, String str) {
        this.f349id = -1;
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
