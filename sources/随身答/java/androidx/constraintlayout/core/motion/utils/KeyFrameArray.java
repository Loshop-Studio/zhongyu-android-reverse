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
        int[] mKeys = new int[101];
        CustomAttribute[] mValues = new CustomAttribute[101];

        public CustomArray() {
            clear();
        }

        public void append(int i9, CustomAttribute customAttribute) {
            if (this.mValues[i9] != null) {
                remove(i9);
            }
            this.mValues[i9] = customAttribute;
            int[] iArr = this.mKeys;
            int i10 = this.mCount;
            this.mCount = i10 + 1;
            iArr[i10] = i9;
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
            int i9 = 0;
            while (i9 < this.mCount) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i9 == 0 ? "" : ", ");
                sb.append(valueAt(i9));
                printStream.print(sb.toString());
                i9++;
            }
            System.out.println("]");
        }

        public int keyAt(int i9) {
            return this.mKeys[i9];
        }

        public void remove(int i9) {
            this.mValues[i9] = null;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = this.mCount;
                if (i10 >= i12) {
                    this.mCount = i12 - 1;
                    return;
                }
                int[] iArr = this.mKeys;
                if (i9 == iArr[i10]) {
                    iArr[i10] = 999;
                    i11++;
                }
                if (i10 != i11) {
                    iArr[i10] = iArr[i11];
                }
                i11++;
                i10++;
            }
        }

        public int size() {
            return this.mCount;
        }

        public CustomAttribute valueAt(int i9) {
            return this.mValues[this.mKeys[i9]];
        }
    }

    public static class CustomVar {
        private static final int EMPTY = 999;
        int mCount;
        int[] mKeys = new int[101];
        CustomVariable[] mValues = new CustomVariable[101];

        public CustomVar() {
            clear();
        }

        public void append(int i9, CustomVariable customVariable) {
            if (this.mValues[i9] != null) {
                remove(i9);
            }
            this.mValues[i9] = customVariable;
            int[] iArr = this.mKeys;
            int i10 = this.mCount;
            this.mCount = i10 + 1;
            iArr[i10] = i9;
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
            int i9 = 0;
            while (i9 < this.mCount) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i9 == 0 ? "" : ", ");
                sb.append(valueAt(i9));
                printStream.print(sb.toString());
                i9++;
            }
            System.out.println("]");
        }

        public int keyAt(int i9) {
            return this.mKeys[i9];
        }

        public void remove(int i9) {
            this.mValues[i9] = null;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = this.mCount;
                if (i10 >= i12) {
                    this.mCount = i12 - 1;
                    return;
                }
                int[] iArr = this.mKeys;
                if (i9 == iArr[i10]) {
                    iArr[i10] = 999;
                    i11++;
                }
                if (i10 != i11) {
                    iArr[i10] = iArr[i11];
                }
                i11++;
                i10++;
            }
        }

        public int size() {
            return this.mCount;
        }

        public CustomVariable valueAt(int i9) {
            return this.mValues[this.mKeys[i9]];
        }
    }

    public static class FloatArray {
        private static final int EMPTY = 999;
        int mCount;
        int[] mKeys = new int[101];
        float[][] mValues = new float[101][];

        public FloatArray() {
            clear();
        }

        public void append(int i9, float[] fArr) {
            if (this.mValues[i9] != null) {
                remove(i9);
            }
            this.mValues[i9] = fArr;
            int[] iArr = this.mKeys;
            int i10 = this.mCount;
            this.mCount = i10 + 1;
            iArr[i10] = i9;
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
            int i9 = 0;
            while (i9 < this.mCount) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i9 == 0 ? "" : ", ");
                sb.append(Arrays.toString(valueAt(i9)));
                printStream.print(sb.toString());
                i9++;
            }
            System.out.println("]");
        }

        public int keyAt(int i9) {
            return this.mKeys[i9];
        }

        public void remove(int i9) {
            this.mValues[i9] = null;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = this.mCount;
                if (i10 >= i12) {
                    this.mCount = i12 - 1;
                    return;
                }
                int[] iArr = this.mKeys;
                if (i9 == iArr[i10]) {
                    iArr[i10] = 999;
                    i11++;
                }
                if (i10 != i11) {
                    iArr[i10] = iArr[i11];
                }
                i11++;
                i10++;
            }
        }

        public int size() {
            return this.mCount;
        }

        public float[] valueAt(int i9) {
            return this.mValues[this.mKeys[i9]];
        }
    }
}
