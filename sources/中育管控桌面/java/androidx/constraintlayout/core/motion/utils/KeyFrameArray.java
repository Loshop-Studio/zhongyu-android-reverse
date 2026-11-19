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

        public void append(int i6, CustomAttribute customAttribute) {
            if (this.mValues[i6] != null) {
                remove(i6);
            }
            this.mValues[i6] = customAttribute;
            int[] iArr = this.mKeys;
            int i7 = this.mCount;
            this.mCount = i7 + 1;
            iArr[i7] = i6;
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
            int i6 = 0;
            while (i6 < this.mCount) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i6 == 0 ? "" : ", ");
                sb.append(valueAt(i6));
                printStream.print(sb.toString());
                i6++;
            }
            System.out.println("]");
        }

        public int keyAt(int i6) {
            return this.mKeys[i6];
        }

        public void remove(int i6) {
            this.mValues[i6] = null;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int i9 = this.mCount;
                if (i7 >= i9) {
                    this.mCount = i9 - 1;
                    return;
                }
                int[] iArr = this.mKeys;
                if (i6 == iArr[i7]) {
                    iArr[i7] = 999;
                    i8++;
                }
                if (i7 != i8) {
                    iArr[i7] = iArr[i8];
                }
                i8++;
                i7++;
            }
        }

        public int size() {
            return this.mCount;
        }

        public CustomAttribute valueAt(int i6) {
            return this.mValues[this.mKeys[i6]];
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

        public void append(int i6, CustomVariable customVariable) {
            if (this.mValues[i6] != null) {
                remove(i6);
            }
            this.mValues[i6] = customVariable;
            int[] iArr = this.mKeys;
            int i7 = this.mCount;
            this.mCount = i7 + 1;
            iArr[i7] = i6;
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
            int i6 = 0;
            while (i6 < this.mCount) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i6 == 0 ? "" : ", ");
                sb.append(valueAt(i6));
                printStream.print(sb.toString());
                i6++;
            }
            System.out.println("]");
        }

        public int keyAt(int i6) {
            return this.mKeys[i6];
        }

        public void remove(int i6) {
            this.mValues[i6] = null;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int i9 = this.mCount;
                if (i7 >= i9) {
                    this.mCount = i9 - 1;
                    return;
                }
                int[] iArr = this.mKeys;
                if (i6 == iArr[i7]) {
                    iArr[i7] = 999;
                    i8++;
                }
                if (i7 != i8) {
                    iArr[i7] = iArr[i8];
                }
                i8++;
                i7++;
            }
        }

        public int size() {
            return this.mCount;
        }

        public CustomVariable valueAt(int i6) {
            return this.mValues[this.mKeys[i6]];
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

        public void append(int i6, float[] fArr) {
            if (this.mValues[i6] != null) {
                remove(i6);
            }
            this.mValues[i6] = fArr;
            int[] iArr = this.mKeys;
            int i7 = this.mCount;
            this.mCount = i7 + 1;
            iArr[i7] = i6;
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
            int i6 = 0;
            while (i6 < this.mCount) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i6 == 0 ? "" : ", ");
                sb.append(Arrays.toString(valueAt(i6)));
                printStream.print(sb.toString());
                i6++;
            }
            System.out.println("]");
        }

        public int keyAt(int i6) {
            return this.mKeys[i6];
        }

        public void remove(int i6) {
            this.mValues[i6] = null;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int i9 = this.mCount;
                if (i7 >= i9) {
                    this.mCount = i9 - 1;
                    return;
                }
                int[] iArr = this.mKeys;
                if (i6 == iArr[i7]) {
                    iArr[i7] = 999;
                    i8++;
                }
                if (i7 != i8) {
                    iArr[i7] = iArr[i8];
                }
                i8++;
                i7++;
            }
        }

        public int size() {
            return this.mCount;
        }

        public float[] valueAt(int i6) {
            return this.mValues[this.mKeys[i6]];
        }
    }
}
