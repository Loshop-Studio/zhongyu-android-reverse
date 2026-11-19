package com.blankj.utilcode.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class ArrayUtils {
    public static final int INDEX_NOT_FOUND = -1;

    public interface Closure<E> {
        void execute(int i4, E e4);
    }

    private ArrayUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @NonNull
    public static <T> T[] add(@Nullable T[] tArr, @Nullable T t3) {
        return (T[]) ((Object[]) realAddOne(tArr, t3, tArr != null ? tArr.getClass() : t3 != null ? t3.getClass() : Object.class));
    }

    @NonNull
    public static <T> List<T> asArrayList(@Nullable T... tArr) {
        ArrayList arrayList = new ArrayList();
        if (tArr != null && tArr.length != 0) {
            arrayList.addAll(Arrays.asList(tArr));
        }
        return arrayList;
    }

    @NonNull
    public static <T> List<T> asLinkedList(@Nullable T... tArr) {
        LinkedList linkedList = new LinkedList();
        if (tArr != null && tArr.length != 0) {
            linkedList.addAll(Arrays.asList(tArr));
        }
        return linkedList;
    }

    @NonNull
    public static <T> List<T> asList(@Nullable T... tArr) {
        return (tArr == null || tArr.length == 0) ? Collections.emptyList() : Arrays.asList(tArr);
    }

    @NonNull
    public static <T> List<T> asUnmodifiableList(@Nullable T... tArr) {
        return Collections.unmodifiableList(asList(tArr));
    }

    public static boolean contains(@Nullable Object[] objArr, @Nullable Object obj) {
        return indexOf(objArr, obj) != -1;
    }

    @Nullable
    public static <T> T[] copy(@Nullable T[] tArr) {
        if (tArr == null) {
            return null;
        }
        return (T[]) subArray(tArr, 0, tArr.length);
    }

    public static boolean equals(@Nullable Object[] objArr, @Nullable Object[] objArr2) {
        return Arrays.deepEquals(objArr, objArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> void forAllDo(@Nullable Object obj, @Nullable Closure<E> closure) {
        if (obj == null || closure == 0) {
            return;
        }
        int i4 = 0;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i4 < length) {
                closure.execute(i4, objArr[i4]);
                i4++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length2 = zArr.length;
            while (i4 < length2) {
                closure.execute(i4, zArr[i4] ? Boolean.TRUE : Boolean.FALSE);
                i4++;
            }
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length3 = bArr.length;
            while (i4 < length3) {
                closure.execute(i4, Byte.valueOf(bArr[i4]));
                i4++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length4 = cArr.length;
            while (i4 < length4) {
                closure.execute(i4, Character.valueOf(cArr[i4]));
                i4++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length5 = sArr.length;
            while (i4 < length5) {
                closure.execute(i4, Short.valueOf(sArr[i4]));
                i4++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length6 = iArr.length;
            while (i4 < length6) {
                closure.execute(i4, Integer.valueOf(iArr[i4]));
                i4++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length7 = jArr.length;
            while (i4 < length7) {
                closure.execute(i4, Long.valueOf(jArr[i4]));
                i4++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length8 = fArr.length;
            while (i4 < length8) {
                closure.execute(i4, Float.valueOf(fArr[i4]));
                i4++;
            }
            return;
        }
        if (!(obj instanceof double[])) {
            throw new IllegalArgumentException("Not an array: " + obj.getClass());
        }
        double[] dArr = (double[]) obj;
        int length9 = dArr.length;
        while (i4 < length9) {
            closure.execute(i4, Double.valueOf(dArr[i4]));
            i4++;
        }
    }

    @Nullable
    public static Object get(@Nullable Object obj, int i4) {
        return get(obj, i4, null);
    }

    public static int getLength(@Nullable Object obj) {
        if (obj == null) {
            return 0;
        }
        return Array.getLength(obj);
    }

    public static int indexOf(@Nullable Object[] objArr, @Nullable Object obj) {
        return indexOf(objArr, obj, 0);
    }

    public static boolean isEmpty(@Nullable Object obj) {
        return getLength(obj) == 0;
    }

    public static boolean isSameLength(@Nullable Object obj, @Nullable Object obj2) {
        return getLength(obj) == getLength(obj2);
    }

    public static int lastIndexOf(@Nullable Object[] objArr, @Nullable Object obj) {
        return lastIndexOf(objArr, obj, Integer.MAX_VALUE);
    }

    @NonNull
    public static <T> T[] newArray(T... tArr) {
        return tArr;
    }

    @NonNull
    public static boolean[] newBooleanArray(boolean... zArr) {
        return zArr;
    }

    @NonNull
    public static byte[] newByteArray(byte... bArr) {
        return bArr;
    }

    @NonNull
    public static char[] newCharArray(char... cArr) {
        return cArr;
    }

    @NonNull
    public static double[] newDoubleArray(double... dArr) {
        return dArr;
    }

    @NonNull
    public static float[] newFloatArray(float... fArr) {
        return fArr;
    }

    @NonNull
    public static int[] newIntArray(int... iArr) {
        return iArr;
    }

    @NonNull
    public static long[] newLongArray(long... jArr) {
        return jArr;
    }

    @NonNull
    public static short[] newShortArray(short... sArr) {
        return sArr;
    }

    @NonNull
    private static Object realAdd(@Nullable Object obj, int i4, @Nullable Object obj2, Class cls) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (obj == null) {
            if (i4 == 0) {
                Object objNewInstance = Array.newInstance((Class<?>) cls, 1);
                Array.set(objNewInstance, 0, obj2);
                return objNewInstance;
            }
            throw new IndexOutOfBoundsException("Index: " + i4 + ", Length: 0");
        }
        int length = Array.getLength(obj);
        if (i4 > length || i4 < 0) {
            throw new IndexOutOfBoundsException("Index: " + i4 + ", Length: " + length);
        }
        Object objNewInstance2 = Array.newInstance((Class<?>) cls, length + 1);
        System.arraycopy(obj, 0, objNewInstance2, 0, i4);
        Array.set(objNewInstance2, i4, obj2);
        if (i4 < length) {
            System.arraycopy(obj, i4, objNewInstance2, i4 + 1, length - i4);
        }
        return objNewInstance2;
    }

    private static Object realAddArr(@Nullable Object obj, @Nullable Object obj2) throws NegativeArraySizeException {
        if (obj == null && obj2 == null) {
            return null;
        }
        if (obj == null) {
            return realCopy(obj2);
        }
        if (obj2 == null) {
            return realCopy(obj);
        }
        int length = getLength(obj);
        int length2 = getLength(obj2);
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        System.arraycopy(obj2, 0, objNewInstance, length, length2);
        return objNewInstance;
    }

    @NonNull
    private static Object realAddOne(@Nullable Object obj, @Nullable Object obj2, Class cls) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object objNewInstance;
        int i4 = 0;
        if (obj != null) {
            int length = getLength(obj);
            objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length + 1);
            System.arraycopy(obj, 0, objNewInstance, 0, length);
            i4 = length;
        } else {
            objNewInstance = Array.newInstance((Class<?>) cls, 1);
        }
        Array.set(objNewInstance, i4, obj2);
        return objNewInstance;
    }

    @Nullable
    private static Object realCopy(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return realSubArray(obj, 0, getLength(obj));
    }

    @Nullable
    private static Object realSubArray(@Nullable Object obj, int i4, int i5) throws NegativeArraySizeException {
        if (obj == null) {
            return null;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        int length = getLength(obj);
        if (i5 > length) {
            i5 = length;
        }
        int i6 = i5 - i4;
        Class<?> componentType = obj.getClass().getComponentType();
        if (i6 <= 0) {
            return Array.newInstance(componentType, 0);
        }
        Object objNewInstance = Array.newInstance(componentType, i6);
        System.arraycopy(obj, i4, objNewInstance, 0, i6);
        return objNewInstance;
    }

    @Nullable
    public static Object[] remove(@Nullable Object[] objArr, int i4) {
        if (objArr == null) {
            return null;
        }
        return (Object[]) remove((Object) objArr, i4);
    }

    @Nullable
    public static Object[] removeElement(@Nullable Object[] objArr, @Nullable Object obj) {
        int iIndexOf = indexOf(objArr, obj);
        return iIndexOf == -1 ? copy(objArr) : remove(objArr, iIndexOf);
    }

    public static <T> void reverse(T[] tArr) {
        if (tArr == null) {
            return;
        }
        int length = tArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            T t3 = tArr[length];
            tArr[length] = tArr[i4];
            tArr[i4] = t3;
            length--;
        }
    }

    public static void set(@Nullable Object obj, int i4, @Nullable Object obj2) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            return;
        }
        Array.set(obj, i4, obj2);
    }

    public static <T> void sort(@Nullable T[] tArr, Comparator<? super T> comparator) {
        if (tArr == null || tArr.length < 2) {
            return;
        }
        Arrays.sort(tArr, comparator);
    }

    @Nullable
    public static <T> T[] subArray(@Nullable T[] tArr, int i4, int i5) {
        return (T[]) ((Object[]) realSubArray(tArr, i4, i5));
    }

    @Nullable
    public static Character[] toObject(@Nullable char[] cArr) {
        if (cArr == null) {
            return null;
        }
        if (cArr.length == 0) {
            return new Character[0];
        }
        Character[] chArr = new Character[cArr.length];
        for (int i4 = 0; i4 < cArr.length; i4++) {
            chArr[i4] = new Character(cArr[i4]);
        }
        return chArr;
    }

    @Nullable
    public static char[] toPrimitive(@Nullable Character[] chArr) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return new char[0];
        }
        char[] cArr = new char[chArr.length];
        for (int i4 = 0; i4 < chArr.length; i4++) {
            cArr[i4] = chArr[i4].charValue();
        }
        return cArr;
    }

    @NonNull
    public static String toString(@Nullable Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof Object[]) {
            return Arrays.deepToString((Object[]) obj);
        }
        if (obj instanceof boolean[]) {
            return Arrays.toString((boolean[]) obj);
        }
        if (obj instanceof byte[]) {
            return Arrays.toString((byte[]) obj);
        }
        if (obj instanceof char[]) {
            return Arrays.toString((char[]) obj);
        }
        if (obj instanceof double[]) {
            return Arrays.toString((double[]) obj);
        }
        if (obj instanceof float[]) {
            return Arrays.toString((float[]) obj);
        }
        if (obj instanceof int[]) {
            return Arrays.toString((int[]) obj);
        }
        if (obj instanceof long[]) {
            return Arrays.toString((long[]) obj);
        }
        if (obj instanceof short[]) {
            return Arrays.toString((short[]) obj);
        }
        throw new IllegalArgumentException("Array has incompatible type: " + obj.getClass());
    }

    public static boolean contains(@Nullable long[] jArr, long j4) {
        return indexOf(jArr, j4) != -1;
    }

    @Nullable
    public static long[] copy(@Nullable long[] jArr) {
        if (jArr == null) {
            return null;
        }
        return subArray(jArr, 0, jArr.length);
    }

    public static boolean equals(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    @Nullable
    public static Object get(@Nullable Object obj, int i4, @Nullable Object obj2) {
        if (obj == null) {
            return obj2;
        }
        try {
            return Array.get(obj, i4);
        } catch (Exception unused) {
            return obj2;
        }
    }

    public static int indexOf(@Nullable Object[] objArr, @Nullable Object obj, int i4) {
        if (objArr == null) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (obj == null) {
            while (i4 < objArr.length) {
                if (objArr[i4] == null) {
                    return i4;
                }
                i4++;
            }
        } else {
            while (i4 < objArr.length) {
                if (obj.equals(objArr[i4])) {
                    return i4;
                }
                i4++;
            }
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable Object[] objArr, @Nullable Object obj, int i4) {
        if (objArr == null || i4 < 0) {
            return -1;
        }
        if (i4 >= objArr.length) {
            i4 = objArr.length - 1;
        }
        if (obj == null) {
            while (i4 >= 0) {
                if (objArr[i4] == null) {
                    return i4;
                }
                i4--;
            }
        } else {
            while (i4 >= 0) {
                if (obj.equals(objArr[i4])) {
                    return i4;
                }
                i4--;
            }
        }
        return -1;
    }

    @Nullable
    public static boolean[] remove(@Nullable boolean[] zArr, int i4) {
        if (zArr == null) {
            return null;
        }
        return (boolean[]) remove((Object) zArr, i4);
    }

    @Nullable
    public static long[] subArray(@Nullable long[] jArr, int i4, int i5) {
        return (long[]) realSubArray(jArr, i4, i5);
    }

    @NonNull
    public static boolean[] add(@Nullable boolean[] zArr, boolean z3) {
        return (boolean[]) realAddOne(zArr, Boolean.valueOf(z3), Boolean.TYPE);
    }

    public static boolean contains(@Nullable int[] iArr, int i4) {
        return indexOf(iArr, i4) != -1;
    }

    @Nullable
    public static int[] copy(@Nullable int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return subArray(iArr, 0, iArr.length);
    }

    public static boolean equals(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    @Nullable
    public static byte[] remove(@Nullable byte[] bArr, int i4) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) remove((Object) bArr, i4);
    }

    public static void sort(@Nullable byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return;
        }
        Arrays.sort(bArr);
    }

    @Nullable
    public static int[] subArray(@Nullable int[] iArr, int i4, int i5) {
        return (int[]) realSubArray(iArr, i4, i5);
    }

    @NonNull
    public static byte[] add(@Nullable byte[] bArr, byte b4) {
        return (byte[]) realAddOne(bArr, Byte.valueOf(b4), Byte.TYPE);
    }

    public static boolean contains(@Nullable short[] sArr, short s3) {
        return indexOf(sArr, s3) != -1;
    }

    @Nullable
    public static short[] copy(@Nullable short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return subArray(sArr, 0, sArr.length);
    }

    public static boolean equals(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    @Nullable
    public static char[] remove(@Nullable char[] cArr, int i4) {
        if (cArr == null) {
            return null;
        }
        return (char[]) remove((Object) cArr, i4);
    }

    @Nullable
    public static boolean[] removeElement(@Nullable boolean[] zArr, boolean z3) {
        int iIndexOf = indexOf(zArr, z3);
        if (iIndexOf == -1) {
            return copy(zArr);
        }
        return remove(zArr, iIndexOf);
    }

    @Nullable
    public static short[] subArray(@Nullable short[] sArr, int i4, int i5) {
        return (short[]) realSubArray(sArr, i4, i5);
    }

    @NonNull
    public static char[] add(@Nullable char[] cArr, char c4) {
        return (char[]) realAddOne(cArr, Character.valueOf(c4), Character.TYPE);
    }

    public static boolean contains(@Nullable char[] cArr, char c4) {
        return indexOf(cArr, c4) != -1;
    }

    @Nullable
    public static char[] copy(@Nullable char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return subArray(cArr, 0, cArr.length);
    }

    public static boolean equals(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    @Nullable
    public static double[] remove(@Nullable double[] dArr, int i4) {
        if (dArr == null) {
            return null;
        }
        return (double[]) remove((Object) dArr, i4);
    }

    public static void reverse(long[] jArr) {
        if (jArr == null) {
            return;
        }
        int length = jArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            long j4 = jArr[length];
            jArr[length] = jArr[i4];
            jArr[i4] = j4;
            length--;
        }
    }

    public static void sort(@Nullable char[] cArr) {
        if (cArr == null || cArr.length < 2) {
            return;
        }
        Arrays.sort(cArr);
    }

    @Nullable
    public static char[] subArray(@Nullable char[] cArr, int i4, int i5) {
        return (char[]) realSubArray(cArr, i4, i5);
    }

    @Nullable
    public static Long[] toObject(@Nullable long[] jArr) {
        if (jArr == null) {
            return null;
        }
        if (jArr.length == 0) {
            return new Long[0];
        }
        Long[] lArr = new Long[jArr.length];
        for (int i4 = 0; i4 < jArr.length; i4++) {
            lArr[i4] = new Long(jArr[i4]);
        }
        return lArr;
    }

    @Nullable
    public static char[] toPrimitive(@Nullable Character[] chArr, char c4) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return new char[0];
        }
        char[] cArr = new char[chArr.length];
        for (int i4 = 0; i4 < chArr.length; i4++) {
            Character ch = chArr[i4];
            cArr[i4] = ch == null ? c4 : ch.charValue();
        }
        return cArr;
    }

    @NonNull
    public static double[] add(@Nullable double[] dArr, double d4) {
        return (double[]) realAddOne(dArr, Double.valueOf(d4), Double.TYPE);
    }

    public static boolean contains(@Nullable byte[] bArr, byte b4) {
        return indexOf(bArr, b4) != -1;
    }

    @Nullable
    public static byte[] copy(@Nullable byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return subArray(bArr, 0, bArr.length);
    }

    public static boolean equals(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    public static int indexOf(@Nullable long[] jArr, long j4) {
        return indexOf(jArr, j4, 0);
    }

    public static int lastIndexOf(@Nullable long[] jArr, long j4) {
        return lastIndexOf(jArr, j4, Integer.MAX_VALUE);
    }

    @Nullable
    public static float[] remove(@Nullable float[] fArr, int i4) {
        if (fArr == null) {
            return null;
        }
        return (float[]) remove((Object) fArr, i4);
    }

    @Nullable
    public static byte[] subArray(@Nullable byte[] bArr, int i4, int i5) {
        return (byte[]) realSubArray(bArr, i4, i5);
    }

    @NonNull
    public static float[] add(@Nullable float[] fArr, float f4) {
        return (float[]) realAddOne(fArr, Float.valueOf(f4), Float.TYPE);
    }

    public static boolean contains(@Nullable double[] dArr, double d4) {
        return indexOf(dArr, d4) != -1;
    }

    @Nullable
    public static double[] copy(@Nullable double[] dArr) {
        if (dArr == null) {
            return null;
        }
        return subArray(dArr, 0, dArr.length);
    }

    public static boolean equals(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    public static int indexOf(@Nullable long[] jArr, long j4, int i4) {
        if (jArr == null) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < jArr.length) {
            if (j4 == jArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable long[] jArr, long j4, int i4) {
        if (jArr == null || i4 < 0) {
            return -1;
        }
        if (i4 >= jArr.length) {
            i4 = jArr.length - 1;
        }
        while (i4 >= 0) {
            if (j4 == jArr[i4]) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    @Nullable
    public static int[] remove(@Nullable int[] iArr, int i4) {
        if (iArr == null) {
            return null;
        }
        return (int[]) remove((Object) iArr, i4);
    }

    @Nullable
    public static byte[] removeElement(@Nullable byte[] bArr, byte b4) {
        int iIndexOf = indexOf(bArr, b4);
        if (iIndexOf == -1) {
            return copy(bArr);
        }
        return remove(bArr, iIndexOf);
    }

    public static void sort(@Nullable double[] dArr) {
        if (dArr == null || dArr.length < 2) {
            return;
        }
        Arrays.sort(dArr);
    }

    @Nullable
    public static double[] subArray(@Nullable double[] dArr, int i4, int i5) {
        return (double[]) realSubArray(dArr, i4, i5);
    }

    @NonNull
    public static int[] add(@Nullable int[] iArr, int i4) {
        return (int[]) realAddOne(iArr, Integer.valueOf(i4), Integer.TYPE);
    }

    public static boolean contains(@Nullable double[] dArr, double d4, double d5) {
        return indexOf(dArr, d4, 0, d5) != -1;
    }

    @Nullable
    public static float[] copy(@Nullable float[] fArr) {
        if (fArr == null) {
            return null;
        }
        return subArray(fArr, 0, fArr.length);
    }

    public static boolean equals(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    @Nullable
    private static Object realAddArr(@Nullable Object obj, int i4, @Nullable Object obj2, Class cls) throws NegativeArraySizeException {
        if (obj == null && obj2 == null) {
            return null;
        }
        int length = getLength(obj);
        int length2 = getLength(obj2);
        if (length == 0) {
            if (i4 == 0) {
                return realCopy(obj2);
            }
            throw new IndexOutOfBoundsException("Index: " + i4 + ", array1 Length: 0");
        }
        if (length2 == 0) {
            return realCopy(obj);
        }
        if (i4 <= length && i4 >= 0) {
            Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
            if (i4 == length) {
                System.arraycopy(obj, 0, objNewInstance, 0, length);
                System.arraycopy(obj2, 0, objNewInstance, length, length2);
            } else if (i4 == 0) {
                System.arraycopy(obj2, 0, objNewInstance, 0, length2);
                System.arraycopy(obj, 0, objNewInstance, length2, length);
            } else {
                System.arraycopy(obj, 0, objNewInstance, 0, i4);
                System.arraycopy(obj2, 0, objNewInstance, i4, length2);
                System.arraycopy(obj, i4, objNewInstance, length2 + i4, length - i4);
            }
            return objNewInstance;
        }
        throw new IndexOutOfBoundsException("Index: " + i4 + ", array1 Length: " + length);
    }

    @Nullable
    public static long[] remove(@Nullable long[] jArr, int i4) {
        if (jArr == null) {
            return null;
        }
        return (long[]) remove((Object) jArr, i4);
    }

    @Nullable
    public static float[] subArray(@Nullable float[] fArr, int i4, int i5) {
        return (float[]) realSubArray(fArr, i4, i5);
    }

    @NonNull
    public static long[] add(@Nullable long[] jArr, long j4) {
        return (long[]) realAddOne(jArr, Long.valueOf(j4), Long.TYPE);
    }

    public static boolean contains(@Nullable float[] fArr, float f4) {
        return indexOf(fArr, f4) != -1;
    }

    @Nullable
    public static boolean[] copy(@Nullable boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        return subArray(zArr, 0, zArr.length);
    }

    public static int indexOf(@Nullable int[] iArr, int i4) {
        return indexOf(iArr, i4, 0);
    }

    @Nullable
    public static short[] remove(@Nullable short[] sArr, int i4) {
        if (sArr == null) {
            return null;
        }
        return (short[]) remove((Object) sArr, i4);
    }

    public static void reverse(int[] iArr) {
        if (iArr == null) {
            return;
        }
        int length = iArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            int i5 = iArr[length];
            iArr[length] = iArr[i4];
            iArr[i4] = i5;
            length--;
        }
    }

    public static void sort(@Nullable float[] fArr) {
        if (fArr == null || fArr.length < 2) {
            return;
        }
        Arrays.sort(fArr);
    }

    @Nullable
    public static boolean[] subArray(@Nullable boolean[] zArr, int i4, int i5) {
        return (boolean[]) realSubArray(zArr, i4, i5);
    }

    @Nullable
    public static Integer[] toObject(@Nullable int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length == 0) {
            return new Integer[0];
        }
        Integer[] numArr = new Integer[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            numArr[i4] = new Integer(iArr[i4]);
        }
        return numArr;
    }

    @NonNull
    public static short[] add(@Nullable short[] sArr, short s3) {
        return (short[]) realAddOne(sArr, Short.valueOf(s3), Short.TYPE);
    }

    public static boolean contains(@Nullable boolean[] zArr, boolean z3) {
        return indexOf(zArr, z3) != -1;
    }

    public static int indexOf(@Nullable int[] iArr, int i4, int i5) {
        if (iArr == null) {
            return -1;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < iArr.length) {
            if (i4 == iArr[i5]) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable int[] iArr, int i4) {
        return lastIndexOf(iArr, i4, Integer.MAX_VALUE);
    }

    @NonNull
    private static Object remove(@NonNull Object obj, int i4) throws NegativeArraySizeException {
        int length = getLength(obj);
        if (i4 >= 0 && i4 < length) {
            int i5 = length - 1;
            Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), i5);
            System.arraycopy(obj, 0, objNewInstance, 0, i4);
            if (i4 < i5) {
                System.arraycopy(obj, i4 + 1, objNewInstance, i4, (length - i4) - 1);
            }
            return objNewInstance;
        }
        throw new IndexOutOfBoundsException("Index: " + i4 + ", Length: " + length);
    }

    @Nullable
    public static char[] removeElement(@Nullable char[] cArr, char c4) {
        int iIndexOf = indexOf(cArr, c4);
        if (iIndexOf == -1) {
            return copy(cArr);
        }
        return remove(cArr, iIndexOf);
    }

    @Nullable
    public static long[] toPrimitive(@Nullable Long[] lArr) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return new long[0];
        }
        long[] jArr = new long[lArr.length];
        for (int i4 = 0; i4 < lArr.length; i4++) {
            jArr[i4] = lArr[i4].longValue();
        }
        return jArr;
    }

    @Nullable
    public static <T> T[] add(@Nullable T[] tArr, @Nullable T[] tArr2) {
        return (T[]) ((Object[]) realAddArr(tArr, tArr2));
    }

    public static int lastIndexOf(@Nullable int[] iArr, int i4, int i5) {
        if (iArr == null || i5 < 0) {
            return -1;
        }
        if (i5 >= iArr.length) {
            i5 = iArr.length - 1;
        }
        while (i5 >= 0) {
            if (i4 == iArr[i5]) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    public static void sort(@Nullable int[] iArr) {
        if (iArr == null || iArr.length < 2) {
            return;
        }
        Arrays.sort(iArr);
    }

    @Nullable
    public static boolean[] add(@Nullable boolean[] zArr, @Nullable boolean[] zArr2) {
        return (boolean[]) realAddArr(zArr, zArr2);
    }

    public static int indexOf(@Nullable short[] sArr, short s3) {
        return indexOf(sArr, s3, 0);
    }

    @Nullable
    public static char[] add(@Nullable char[] cArr, @Nullable char[] cArr2) {
        return (char[]) realAddArr(cArr, cArr2);
    }

    public static int indexOf(@Nullable short[] sArr, short s3, int i4) {
        if (sArr == null) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < sArr.length) {
            if (s3 == sArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @Nullable
    public static double[] removeElement(@Nullable double[] dArr, double d4) {
        int iIndexOf = indexOf(dArr, d4);
        if (iIndexOf == -1) {
            return copy(dArr);
        }
        return remove(dArr, iIndexOf);
    }

    public static void reverse(short[] sArr) {
        if (sArr == null) {
            return;
        }
        int length = sArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            short s3 = sArr[length];
            sArr[length] = sArr[i4];
            sArr[i4] = s3;
            length--;
        }
    }

    public static void sort(@Nullable long[] jArr) {
        if (jArr == null || jArr.length < 2) {
            return;
        }
        Arrays.sort(jArr);
    }

    @Nullable
    public static Short[] toObject(@Nullable short[] sArr) {
        if (sArr == null) {
            return null;
        }
        if (sArr.length == 0) {
            return new Short[0];
        }
        Short[] shArr = new Short[sArr.length];
        for (int i4 = 0; i4 < sArr.length; i4++) {
            shArr[i4] = new Short(sArr[i4]);
        }
        return shArr;
    }

    @Nullable
    public static byte[] add(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        return (byte[]) realAddArr(bArr, bArr2);
    }

    public static int lastIndexOf(@Nullable short[] sArr, short s3) {
        return lastIndexOf(sArr, s3, Integer.MAX_VALUE);
    }

    @Nullable
    public static long[] toPrimitive(@Nullable Long[] lArr, long j4) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return new long[0];
        }
        long[] jArr = new long[lArr.length];
        for (int i4 = 0; i4 < lArr.length; i4++) {
            Long l4 = lArr[i4];
            jArr[i4] = l4 == null ? j4 : l4.longValue();
        }
        return jArr;
    }

    @Nullable
    public static short[] add(@Nullable short[] sArr, @Nullable short[] sArr2) {
        return (short[]) realAddArr(sArr, sArr2);
    }

    public static int indexOf(@Nullable char[] cArr, char c4) {
        return indexOf(cArr, c4, 0);
    }

    public static int lastIndexOf(@Nullable short[] sArr, short s3, int i4) {
        if (sArr == null || i4 < 0) {
            return -1;
        }
        if (i4 >= sArr.length) {
            i4 = sArr.length - 1;
        }
        while (i4 >= 0) {
            if (s3 == sArr[i4]) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    public static void sort(@Nullable short[] sArr) {
        if (sArr == null || sArr.length < 2) {
            return;
        }
        Arrays.sort(sArr);
    }

    @Nullable
    public static int[] add(@Nullable int[] iArr, @Nullable int[] iArr2) {
        return (int[]) realAddArr(iArr, iArr2);
    }

    public static int indexOf(@Nullable char[] cArr, char c4, int i4) {
        if (cArr == null) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < cArr.length) {
            if (c4 == cArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @Nullable
    public static float[] removeElement(@Nullable float[] fArr, float f4) {
        int iIndexOf = indexOf(fArr, f4);
        if (iIndexOf == -1) {
            return copy(fArr);
        }
        return remove(fArr, iIndexOf);
    }

    @Nullable
    public static long[] add(@Nullable long[] jArr, @Nullable long[] jArr2) {
        return (long[]) realAddArr(jArr, jArr2);
    }

    public static void reverse(char[] cArr) {
        if (cArr == null) {
            return;
        }
        int length = cArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            char c4 = cArr[length];
            cArr[length] = cArr[i4];
            cArr[i4] = c4;
            length--;
        }
    }

    @Nullable
    public static Byte[] toObject(@Nullable byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new Byte[0];
        }
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            bArr2[i4] = new Byte(bArr[i4]);
        }
        return bArr2;
    }

    @Nullable
    public static float[] add(@Nullable float[] fArr, @Nullable float[] fArr2) {
        return (float[]) realAddArr(fArr, fArr2);
    }

    public static int indexOf(@Nullable byte[] bArr, byte b4) {
        return indexOf(bArr, b4, 0);
    }

    public static int lastIndexOf(@Nullable char[] cArr, char c4) {
        return lastIndexOf(cArr, c4, Integer.MAX_VALUE);
    }

    @Nullable
    public static double[] add(@Nullable double[] dArr, @Nullable double[] dArr2) {
        return (double[]) realAddArr(dArr, dArr2);
    }

    public static int indexOf(@Nullable byte[] bArr, byte b4, int i4) {
        if (bArr == null) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < bArr.length) {
            if (b4 == bArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable char[] cArr, char c4, int i4) {
        if (cArr == null || i4 < 0) {
            return -1;
        }
        if (i4 >= cArr.length) {
            i4 = cArr.length - 1;
        }
        while (i4 >= 0) {
            if (c4 == cArr[i4]) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    @Nullable
    public static int[] removeElement(@Nullable int[] iArr, int i4) {
        int iIndexOf = indexOf(iArr, i4);
        if (iIndexOf == -1) {
            return copy(iArr);
        }
        return remove(iArr, iIndexOf);
    }

    @Nullable
    public static int[] toPrimitive(@Nullable Integer[] numArr) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return new int[0];
        }
        int[] iArr = new int[numArr.length];
        for (int i4 = 0; i4 < numArr.length; i4++) {
            iArr[i4] = numArr[i4].intValue();
        }
        return iArr;
    }

    @Nullable
    public static <T> T[] add(@Nullable T[] tArr, int i4, @Nullable T[] tArr2) {
        Class<?> componentType;
        if (tArr != null) {
            componentType = tArr.getClass().getComponentType();
        } else {
            if (tArr2 == null) {
                return null;
            }
            componentType = tArr2.getClass().getComponentType();
        }
        return (T[]) ((Object[]) realAddArr(tArr, i4, tArr2, componentType));
    }

    public static int indexOf(@Nullable double[] dArr, double d4) {
        return indexOf(dArr, d4, 0);
    }

    public static void reverse(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int length = bArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            byte b4 = bArr[length];
            bArr[length] = bArr[i4];
            bArr[i4] = b4;
            length--;
        }
    }

    @Nullable
    public static Double[] toObject(@Nullable double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return new Double[0];
        }
        Double[] dArr2 = new Double[dArr.length];
        for (int i4 = 0; i4 < dArr.length; i4++) {
            dArr2[i4] = new Double(dArr[i4]);
        }
        return dArr2;
    }

    public static int indexOf(@Nullable double[] dArr, double d4, double d5) {
        return indexOf(dArr, d4, 0, d5);
    }

    public static int lastIndexOf(@Nullable byte[] bArr, byte b4) {
        return lastIndexOf(bArr, b4, Integer.MAX_VALUE);
    }

    @Nullable
    public static long[] removeElement(@Nullable long[] jArr, long j4) {
        int iIndexOf = indexOf(jArr, j4);
        if (iIndexOf == -1) {
            return copy(jArr);
        }
        return remove(jArr, iIndexOf);
    }

    @Nullable
    public static boolean[] add(@Nullable boolean[] zArr, int i4, @Nullable boolean[] zArr2) throws NegativeArraySizeException {
        Object objRealAddArr = realAddArr(zArr, i4, zArr2, Boolean.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (boolean[]) objRealAddArr;
    }

    public static int indexOf(@Nullable double[] dArr, double d4, int i4) {
        if (isEmpty(dArr)) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < dArr.length) {
            if (d4 == dArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable byte[] bArr, byte b4, int i4) {
        if (bArr == null || i4 < 0) {
            return -1;
        }
        if (i4 >= bArr.length) {
            i4 = bArr.length - 1;
        }
        while (i4 >= 0) {
            if (b4 == bArr[i4]) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    @Nullable
    public static int[] toPrimitive(@Nullable Integer[] numArr, int i4) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return new int[0];
        }
        int[] iArr = new int[numArr.length];
        for (int i5 = 0; i5 < numArr.length; i5++) {
            Integer num = numArr[i5];
            iArr[i5] = num == null ? i4 : num.intValue();
        }
        return iArr;
    }

    public static char[] add(@Nullable char[] cArr, int i4, @Nullable char[] cArr2) throws NegativeArraySizeException {
        Object objRealAddArr = realAddArr(cArr, i4, cArr2, Character.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (char[]) objRealAddArr;
    }

    @Nullable
    public static short[] removeElement(@Nullable short[] sArr, short s3) {
        int iIndexOf = indexOf(sArr, s3);
        if (iIndexOf == -1) {
            return copy(sArr);
        }
        return remove(sArr, iIndexOf);
    }

    public static void reverse(double[] dArr) {
        if (dArr == null) {
            return;
        }
        int length = dArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            double d4 = dArr[length];
            dArr[length] = dArr[i4];
            dArr[i4] = d4;
            length--;
        }
    }

    @Nullable
    public static Float[] toObject(@Nullable float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return new Float[0];
        }
        Float[] fArr2 = new Float[fArr.length];
        for (int i4 = 0; i4 < fArr.length; i4++) {
            fArr2[i4] = new Float(fArr[i4]);
        }
        return fArr2;
    }

    public static int indexOf(@Nullable double[] dArr, double d4, int i4, double d5) {
        if (isEmpty(dArr)) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        double d6 = d4 - d5;
        double d7 = d4 + d5;
        while (i4 < dArr.length) {
            double d8 = dArr[i4];
            if (d8 >= d6 && d8 <= d7) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable double[] dArr, double d4) {
        return lastIndexOf(dArr, d4, Integer.MAX_VALUE);
    }

    @Nullable
    public static byte[] add(@Nullable byte[] bArr, int i4, @Nullable byte[] bArr2) throws NegativeArraySizeException {
        Object objRealAddArr = realAddArr(bArr, i4, bArr2, Byte.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (byte[]) objRealAddArr;
    }

    public static int lastIndexOf(@Nullable double[] dArr, double d4, double d5) {
        return lastIndexOf(dArr, d4, Integer.MAX_VALUE, d5);
    }

    public static int lastIndexOf(@Nullable double[] dArr, double d4, int i4) {
        if (isEmpty(dArr) || i4 < 0) {
            return -1;
        }
        if (i4 >= dArr.length) {
            i4 = dArr.length - 1;
        }
        while (i4 >= 0) {
            if (d4 == dArr[i4]) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    @Nullable
    public static short[] toPrimitive(@Nullable Short[] shArr) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return new short[0];
        }
        short[] sArr = new short[shArr.length];
        for (int i4 = 0; i4 < shArr.length; i4++) {
            sArr[i4] = shArr[i4].shortValue();
        }
        return sArr;
    }

    @Nullable
    public static short[] add(@Nullable short[] sArr, int i4, @Nullable short[] sArr2) throws NegativeArraySizeException {
        Object objRealAddArr = realAddArr(sArr, i4, sArr2, Short.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (short[]) objRealAddArr;
    }

    public static int indexOf(@Nullable float[] fArr, float f4) {
        return indexOf(fArr, f4, 0);
    }

    public static void reverse(float[] fArr) {
        if (fArr == null) {
            return;
        }
        int length = fArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            float f4 = fArr[length];
            fArr[length] = fArr[i4];
            fArr[i4] = f4;
            length--;
        }
    }

    @Nullable
    public static Boolean[] toObject(@Nullable boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        if (zArr.length == 0) {
            return new Boolean[0];
        }
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i4 = 0; i4 < zArr.length; i4++) {
            boolArr[i4] = zArr[i4] ? Boolean.TRUE : Boolean.FALSE;
        }
        return boolArr;
    }

    public static int indexOf(@Nullable float[] fArr, float f4, int i4) {
        if (isEmpty(fArr)) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < fArr.length) {
            if (f4 == fArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @Nullable
    public static int[] add(@Nullable int[] iArr, int i4, @Nullable int[] iArr2) throws NegativeArraySizeException {
        Object objRealAddArr = realAddArr(iArr, i4, iArr2, Integer.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (int[]) objRealAddArr;
    }

    public static int lastIndexOf(@Nullable double[] dArr, double d4, int i4, double d5) {
        if (isEmpty(dArr) || i4 < 0) {
            return -1;
        }
        if (i4 >= dArr.length) {
            i4 = dArr.length - 1;
        }
        double d6 = d4 - d5;
        double d7 = d4 + d5;
        while (i4 >= 0) {
            double d8 = dArr[i4];
            if (d8 >= d6 && d8 <= d7) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    @Nullable
    public static short[] toPrimitive(@Nullable Short[] shArr, short s3) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return new short[0];
        }
        short[] sArr = new short[shArr.length];
        for (int i4 = 0; i4 < shArr.length; i4++) {
            Short sh = shArr[i4];
            sArr[i4] = sh == null ? s3 : sh.shortValue();
        }
        return sArr;
    }

    @Nullable
    public static long[] add(@Nullable long[] jArr, int i4, @Nullable long[] jArr2) throws NegativeArraySizeException {
        Object objRealAddArr = realAddArr(jArr, i4, jArr2, Long.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (long[]) objRealAddArr;
    }

    public static int indexOf(@Nullable boolean[] zArr, boolean z3) {
        return indexOf(zArr, z3, 0);
    }

    public static void reverse(boolean[] zArr) {
        if (zArr == null) {
            return;
        }
        int length = zArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            boolean z3 = zArr[length];
            zArr[length] = zArr[i4];
            zArr[i4] = z3;
            length--;
        }
    }

    public static int indexOf(@Nullable boolean[] zArr, boolean z3, int i4) {
        if (isEmpty(zArr)) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < zArr.length) {
            if (z3 == zArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @Nullable
    public static float[] add(@Nullable float[] fArr, int i4, @Nullable float[] fArr2) throws NegativeArraySizeException {
        Object objRealAddArr = realAddArr(fArr, i4, fArr2, Float.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (float[]) objRealAddArr;
    }

    public static int lastIndexOf(@Nullable float[] fArr, float f4) {
        return lastIndexOf(fArr, f4, Integer.MAX_VALUE);
    }

    @Nullable
    public static double[] add(@Nullable double[] dArr, int i4, @Nullable double[] dArr2) throws NegativeArraySizeException {
        Object objRealAddArr = realAddArr(dArr, i4, dArr2, Double.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (double[]) objRealAddArr;
    }

    public static int lastIndexOf(@Nullable float[] fArr, float f4, int i4) {
        if (isEmpty(fArr) || i4 < 0) {
            return -1;
        }
        if (i4 >= fArr.length) {
            i4 = fArr.length - 1;
        }
        while (i4 >= 0) {
            if (f4 == fArr[i4]) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    @Nullable
    public static byte[] toPrimitive(@Nullable Byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            bArr2[i4] = bArr[i4].byteValue();
        }
        return bArr2;
    }

    @NonNull
    public static <T> T[] add(@Nullable T[] tArr, int i4, @Nullable T t3) {
        Class<?> componentType;
        if (tArr != null) {
            componentType = tArr.getClass().getComponentType();
        } else {
            if (t3 == null) {
                T[] tArr2 = (T[]) new Object[1];
                tArr2[0] = null;
                return tArr2;
            }
            componentType = t3.getClass();
        }
        return (T[]) ((Object[]) realAdd(tArr, i4, t3, componentType));
    }

    public static int lastIndexOf(@Nullable boolean[] zArr, boolean z3) {
        return lastIndexOf(zArr, z3, Integer.MAX_VALUE);
    }

    @Nullable
    public static byte[] toPrimitive(@Nullable Byte[] bArr, byte b4) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            Byte b5 = bArr[i4];
            bArr2[i4] = b5 == null ? b4 : b5.byteValue();
        }
        return bArr2;
    }

    @NonNull
    public static boolean[] add(@Nullable boolean[] zArr, int i4, boolean z3) {
        return (boolean[]) realAdd(zArr, i4, Boolean.valueOf(z3), Boolean.TYPE);
    }

    public static int lastIndexOf(@Nullable boolean[] zArr, boolean z3, int i4) {
        if (isEmpty(zArr) || i4 < 0) {
            return -1;
        }
        if (i4 >= zArr.length) {
            i4 = zArr.length - 1;
        }
        while (i4 >= 0) {
            if (z3 == zArr[i4]) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    @NonNull
    public static char[] add(@Nullable char[] cArr, int i4, char c4) {
        return (char[]) realAdd(cArr, i4, Character.valueOf(c4), Character.TYPE);
    }

    @NonNull
    public static byte[] add(@Nullable byte[] bArr, int i4, byte b4) {
        return (byte[]) realAdd(bArr, i4, Byte.valueOf(b4), Byte.TYPE);
    }

    @NonNull
    public static short[] add(@Nullable short[] sArr, int i4, short s3) {
        return (short[]) realAdd(sArr, i4, Short.valueOf(s3), Short.TYPE);
    }

    @NonNull
    public static int[] add(@Nullable int[] iArr, int i4, int i5) {
        return (int[]) realAdd(iArr, i4, Integer.valueOf(i5), Integer.TYPE);
    }

    @Nullable
    public static double[] toPrimitive(@Nullable Double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return new double[0];
        }
        double[] dArr2 = new double[dArr.length];
        for (int i4 = 0; i4 < dArr.length; i4++) {
            dArr2[i4] = dArr[i4].doubleValue();
        }
        return dArr2;
    }

    @NonNull
    public static long[] add(@Nullable long[] jArr, int i4, long j4) {
        return (long[]) realAdd(jArr, i4, Long.valueOf(j4), Long.TYPE);
    }

    @NonNull
    public static float[] add(@Nullable float[] fArr, int i4, float f4) {
        return (float[]) realAdd(fArr, i4, Float.valueOf(f4), Float.TYPE);
    }

    @NonNull
    public static double[] add(@Nullable double[] dArr, int i4, double d4) {
        return (double[]) realAdd(dArr, i4, Double.valueOf(d4), Double.TYPE);
    }

    @Nullable
    public static double[] toPrimitive(@Nullable Double[] dArr, double d4) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return new double[0];
        }
        double[] dArr2 = new double[dArr.length];
        for (int i4 = 0; i4 < dArr.length; i4++) {
            Double d5 = dArr[i4];
            dArr2[i4] = d5 == null ? d4 : d5.doubleValue();
        }
        return dArr2;
    }

    @Nullable
    public static float[] toPrimitive(@Nullable Float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[fArr.length];
        for (int i4 = 0; i4 < fArr.length; i4++) {
            fArr2[i4] = fArr[i4].floatValue();
        }
        return fArr2;
    }

    @Nullable
    public static float[] toPrimitive(@Nullable Float[] fArr, float f4) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[fArr.length];
        for (int i4 = 0; i4 < fArr.length; i4++) {
            Float f5 = fArr[i4];
            fArr2[i4] = f5 == null ? f4 : f5.floatValue();
        }
        return fArr2;
    }

    @Nullable
    public static boolean[] toPrimitive(@Nullable Boolean[] boolArr) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return new boolean[0];
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i4 = 0; i4 < boolArr.length; i4++) {
            zArr[i4] = boolArr[i4].booleanValue();
        }
        return zArr;
    }

    @Nullable
    public static boolean[] toPrimitive(@Nullable Boolean[] boolArr, boolean z3) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return new boolean[0];
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i4 = 0; i4 < boolArr.length; i4++) {
            Boolean bool = boolArr[i4];
            zArr[i4] = bool == null ? z3 : bool.booleanValue();
        }
        return zArr;
    }
}
