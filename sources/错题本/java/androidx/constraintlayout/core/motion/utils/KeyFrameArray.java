package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import java.io.PrintStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class KeyFrameArray {

    public static class CustomArray {
        private static final int EMPTY = 999;
        int mCount;
        int[] mKeys = new int[TypedValues.TYPE_TARGET];
        CustomAttribute[] mValues = new CustomAttribute[TypedValues.TYPE_TARGET];

        public CustomArray() {
            clear();
        }

        public void append(int i, CustomAttribute customAttribute) {
            if (this.mValues[i] != null) {
                remove(i);
            }
            this.mValues[i] = customAttribute;
            int[] iArr = this.mKeys;
            int i8 = this.mCount;
            this.mCount = i8 + 1;
            iArr[i8] = i;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.mKeys, 999);
            Arrays.fill(this.mValues, (Object) null);
            this.mCount = 0;
        }

        public void dump() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.mKeys, this.mCount)));
            System.out.print("K: [");
            int i = 0;
            while (i < this.mCount) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i == 0 ? "" : ", ");
                sb.append(valueAt(i));
                printStream.print(sb.toString());
                i++;
            }
            System.out.println("]");
        }

        public int keyAt(int i) {
            return this.mKeys[i];
        }

        public void remove(int i) {
            this.mValues[i] = null;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                int i10 = this.mCount;
                if (i8 >= i10) {
                    this.mCount = i10 - 1;
                    return;
                }
                int[] iArr = this.mKeys;
                if (i == iArr[i8]) {
                    iArr[i8] = 999;
                    i9++;
                }
                if (i8 != i9) {
                    iArr[i8] = iArr[i9];
                }
                i9++;
                i8++;
            }
        }

        public int size() {
            return this.mCount;
        }

        public CustomAttribute valueAt(int i) {
            return this.mValues[this.mKeys[i]];
        }
    }

    public static class CustomVar {
        private static final int EMPTY = 999;
        int mCount;
        int[] mKeys = new int[TypedValues.TYPE_TARGET];
        CustomVariable[] mValues = new CustomVariable[TypedValues.TYPE_TARGET];

        public CustomVar() {
            clear();
        }

        public void append(int i, CustomVariable customVariable) {
            if (this.mValues[i] != null) {
                remove(i);
            }
            this.mValues[i] = customVariable;
            int[] iArr = this.mKeys;
            int i8 = this.mCount;
            this.mCount = i8 + 1;
            iArr[i8] = i;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.mKeys, 999);
            Arrays.fill(this.mValues, (Object) null);
            this.mCount = 0;
        }

        public void dump() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.mKeys, this.mCount)));
            System.out.print("K: [");
            int i = 0;
            while (i < this.mCount) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i == 0 ? "" : ", ");
                sb.append(valueAt(i));
                printStream.print(sb.toString());
                i++;
            }
            System.out.println("]");
        }

        public int keyAt(int i) {
            return this.mKeys[i];
        }

        public void remove(int i) {
            this.mValues[i] = null;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                int i10 = this.mCount;
                if (i8 >= i10) {
                    this.mCount = i10 - 1;
                    return;
                }
                int[] iArr = this.mKeys;
                if (i == iArr[i8]) {
                    iArr[i8] = 999;
                    i9++;
                }
                if (i8 != i9) {
                    iArr[i8] = iArr[i9];
                }
                i9++;
                i8++;
            }
        }

        public int size() {
            return this.mCount;
        }

        public CustomVariable valueAt(int i) {
            return this.mValues[this.mKeys[i]];
        }
    }

    public static class FloatArray {
        private static final int EMPTY = 999;
        int mCount;
        int[] mKeys = new int[TypedValues.TYPE_TARGET];
        float[][] mValues = new float[TypedValues.TYPE_TARGET][];

        public FloatArray() {
            clear();
        }

        public void append(int i, float[] fArr) {
            if (this.mValues[i] != null) {
                remove(i);
            }
            this.mValues[i] = fArr;
            int[] iArr = this.mKeys;
            int i8 = this.mCount;
            this.mCount = i8 + 1;
            iArr[i8] = i;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.mKeys, 999);
            Arrays.fill(this.mValues, (Object) null);
            this.mCount = 0;
        }

        public void dump() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.mKeys, this.mCount)));
            System.out.print("K: [");
            int i = 0;
            while (i < this.mCount) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i == 0 ? "" : ", ");
                sb.append(Arrays.toString(valueAt(i)));
                printStream.print(sb.toString());
                i++;
            }
            System.out.println("]");
        }

        public int keyAt(int i) {
            return this.mKeys[i];
        }

        public void remove(int i) {
            this.mValues[i] = null;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                int i10 = this.mCount;
                if (i8 >= i10) {
                    this.mCount = i10 - 1;
                    return;
                }
                int[] iArr = this.mKeys;
                if (i == iArr[i8]) {
                    iArr[i8] = 999;
                    i9++;
                }
                if (i8 != i9) {
                    iArr[i8] = iArr[i9];
                }
                i9++;
                i8++;
            }
        }

        public int size() {
            return this.mCount;
        }

        public float[] valueAt(int i) {
            return this.mValues[this.mKeys[i]];
        }
    }
}
