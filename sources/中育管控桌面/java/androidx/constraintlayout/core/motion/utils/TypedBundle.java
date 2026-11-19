package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class TypedBundle {
    private static final int INITIAL_BOOLEAN = 4;
    private static final int INITIAL_FLOAT = 10;
    private static final int INITIAL_INT = 10;
    private static final int INITIAL_STRING = 5;
    int[] mTypeInt = new int[10];
    int[] mValueInt = new int[10];
    int mCountInt = 0;
    int[] mTypeFloat = new int[10];
    float[] mValueFloat = new float[10];
    int mCountFloat = 0;
    int[] mTypeString = new int[5];
    String[] mValueString = new String[5];
    int mCountString = 0;
    int[] mTypeBoolean = new int[4];
    boolean[] mValueBoolean = new boolean[4];
    int mCountBoolean = 0;

    public void add(int i6, int i7) {
        int i8 = this.mCountInt;
        int[] iArr = this.mTypeInt;
        if (i8 >= iArr.length) {
            this.mTypeInt = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.mValueInt;
            this.mValueInt = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.mTypeInt;
        int i9 = this.mCountInt;
        iArr3[i9] = i6;
        int[] iArr4 = this.mValueInt;
        this.mCountInt = i9 + 1;
        iArr4[i9] = i7;
    }

    public void addIfNotNull(int i6, String str) {
        if (str != null) {
            add(i6, str);
        }
    }

    public void applyDelta(TypedValues typedValues) {
        for (int i6 = 0; i6 < this.mCountInt; i6++) {
            typedValues.setValue(this.mTypeInt[i6], this.mValueInt[i6]);
        }
        for (int i7 = 0; i7 < this.mCountFloat; i7++) {
            typedValues.setValue(this.mTypeFloat[i7], this.mValueFloat[i7]);
        }
        for (int i8 = 0; i8 < this.mCountString; i8++) {
            typedValues.setValue(this.mTypeString[i8], this.mValueString[i8]);
        }
        for (int i9 = 0; i9 < this.mCountBoolean; i9++) {
            typedValues.setValue(this.mTypeBoolean[i9], this.mValueBoolean[i9]);
        }
    }

    public void clear() {
        this.mCountBoolean = 0;
        this.mCountString = 0;
        this.mCountFloat = 0;
        this.mCountInt = 0;
    }

    public int getInteger(int i6) {
        for (int i7 = 0; i7 < this.mCountInt; i7++) {
            if (this.mTypeInt[i7] == i6) {
                return this.mValueInt[i7];
            }
        }
        return -1;
    }

    public String toString() {
        return "TypedBundle{mCountInt=" + this.mCountInt + ", mCountFloat=" + this.mCountFloat + ", mCountString=" + this.mCountString + ", mCountBoolean=" + this.mCountBoolean + '}';
    }

    public void add(int i6, float f6) {
        int i7 = this.mCountFloat;
        int[] iArr = this.mTypeFloat;
        if (i7 >= iArr.length) {
            this.mTypeFloat = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.mValueFloat;
            this.mValueFloat = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.mTypeFloat;
        int i8 = this.mCountFloat;
        iArr2[i8] = i6;
        float[] fArr2 = this.mValueFloat;
        this.mCountFloat = i8 + 1;
        fArr2[i8] = f6;
    }

    public void applyDelta(TypedBundle typedBundle) {
        for (int i6 = 0; i6 < this.mCountInt; i6++) {
            typedBundle.add(this.mTypeInt[i6], this.mValueInt[i6]);
        }
        for (int i7 = 0; i7 < this.mCountFloat; i7++) {
            typedBundle.add(this.mTypeFloat[i7], this.mValueFloat[i7]);
        }
        for (int i8 = 0; i8 < this.mCountString; i8++) {
            typedBundle.add(this.mTypeString[i8], this.mValueString[i8]);
        }
        for (int i9 = 0; i9 < this.mCountBoolean; i9++) {
            typedBundle.add(this.mTypeBoolean[i9], this.mValueBoolean[i9]);
        }
    }

    public void add(int i6, String str) {
        int i7 = this.mCountString;
        int[] iArr = this.mTypeString;
        if (i7 >= iArr.length) {
            this.mTypeString = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.mValueString;
            this.mValueString = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.mTypeString;
        int i8 = this.mCountString;
        iArr2[i8] = i6;
        String[] strArr2 = this.mValueString;
        this.mCountString = i8 + 1;
        strArr2[i8] = str;
    }

    public void add(int i6, boolean z6) {
        int i7 = this.mCountBoolean;
        int[] iArr = this.mTypeBoolean;
        if (i7 >= iArr.length) {
            this.mTypeBoolean = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.mValueBoolean;
            this.mValueBoolean = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.mTypeBoolean;
        int i8 = this.mCountBoolean;
        iArr2[i8] = i6;
        boolean[] zArr2 = this.mValueBoolean;
        this.mCountBoolean = i8 + 1;
        zArr2[i8] = z6;
    }
}
