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

/* loaded from: classes3.dex */
public class ArrayUtils {
    public static final int INDEX_NOT_FOUND = -1;

    public interface Closure<E> {
        void execute(int i9, E e10);
    }

    private ArrayUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @NonNull
    public static <T> T[] add(@Nullable T[] tArr, @Nullable T t9) {
        return (T[]) ((Object[]) realAddOne(tArr, t9, tArr != null ? tArr.getClass() : t9 != null ? t9.getClass() : Object.class));
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
        return (tArr == null || tArr.length == 0) ? Collections.EMPTY_LIST : Arrays.asList(tArr);
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
        int i9 = 0;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i9 < length) {
                closure.execute(i9, objArr[i9]);
                i9++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length2 = zArr.length;
            while (i9 < length2) {
                closure.execute(i9, zArr[i9] ? Boolean.TRUE : Boolean.FALSE);
                i9++;
            }
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length3 = bArr.length;
            while (i9 < length3) {
                closure.execute(i9, Byte.valueOf(bArr[i9]));
                i9++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length4 = cArr.length;
            while (i9 < length4) {
                closure.execute(i9, Character.valueOf(cArr[i9]));
                i9++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length5 = sArr.length;
            while (i9 < length5) {
                closure.execute(i9, Short.valueOf(sArr[i9]));
                i9++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length6 = iArr.length;
            while (i9 < length6) {
                closure.execute(i9, Integer.valueOf(iArr[i9]));
                i9++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length7 = jArr.length;
            while (i9 < length7) {
                closure.execute(i9, Long.valueOf(jArr[i9]));
                i9++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length8 = fArr.length;
            while (i9 < length8) {
                closure.execute(i9, Float.valueOf(fArr[i9]));
                i9++;
            }
            return;
        }
        if (!(obj instanceof double[])) {
            throw new IllegalArgumentException("Not an array: " + obj.getClass());
        }
        double[] dArr = (double[]) obj;
        int length9 = dArr.length;
        while (i9 < length9) {
            closure.execute(i9, Double.valueOf(dArr[i9]));
            i9++;
        }
    }

    @Nullable
    public static Object get(@Nullable Object obj, int i9) {
        return get(obj, i9, null);
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
    private static Object realAdd(@Nullable Object obj, int i9, @Nullable Object obj2, Class cls) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (obj == null) {
            if (i9 == 0) {
                Object objNewInstance = Array.newInstance((Class<?>) cls, 1);
                Array.set(objNewInstance, 0, obj2);
                return objNewInstance;
            }
            throw new IndexOutOfBoundsException("Index: " + i9 + ", Length: 0");
        }
        int length = Array.getLength(obj);
        if (i9 > length || i9 < 0) {
            throw new IndexOutOfBoundsException("Index: " + i9 + ", Length: " + length);
        }
        Object objNewInstance2 = Array.newInstance((Class<?>) cls, length + 1);
        System.arraycopy(obj, 0, objNewInstance2, 0, i9);
        Array.set(objNewInstance2, i9, obj2);
        if (i9 < length) {
            System.arraycopy(obj, i9, objNewInstance2, i9 + 1, length - i9);
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
        int i9 = 0;
        if (obj != null) {
            int length = getLength(obj);
            objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length + 1);
            System.arraycopy(obj, 0, objNewInstance, 0, length);
            i9 = length;
        } else {
            objNewInstance = Array.newInstance((Class<?>) cls, 1);
        }
        Array.set(objNewInstance, i9, obj2);
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
    private static Object realSubArray(@Nullable Object obj, int i9, int i10) throws NegativeArraySizeException {
        if (obj == null) {
            return null;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        int length = getLength(obj);
        if (i10 > length) {
            i10 = length;
        }
        int i11 = i10 - i9;
        Class<?> componentType = obj.getClass().getComponentType();
        if (i11 <= 0) {
            return Array.newInstance(componentType, 0);
        }
        Object objNewInstance = Array.newInstance(componentType, i11);
        System.arraycopy(obj, i9, objNewInstance, 0, i11);
        return objNewInstance;
    }

    @Nullable
    public static Object[] remove(@Nullable Object[] objArr, int i9) {
        if (objArr == null) {
            return null;
        }
        return (Object[]) remove((Object) objArr, i9);
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
        for (int i9 = 0; length > i9; i9++) {
            T t9 = tArr[length];
            tArr[length] = tArr[i9];
            tArr[i9] = t9;
            length--;
        }
    }

    public static void set(@Nullable Object obj, int i9, @Nullable Object obj2) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            return;
        }
        Array.set(obj, i9, obj2);
    }

    public static <T> void sort(@Nullable T[] tArr, Comparator<? super T> comparator) {
        if (tArr == null || tArr.length < 2) {
            return;
        }
        Arrays.sort(tArr, comparator);
    }

    @Nullable
    public static <T> T[] subArray(@Nullable T[] tArr, int i9, int i10) {
        return (T[]) ((Object[]) realSubArray(tArr, i9, i10));
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
        for (int i9 = 0; i9 < cArr.length; i9++) {
            chArr[i9] = new Character(cArr[i9]);
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
        for (int i9 = 0; i9 < chArr.length; i9++) {
            cArr[i9] = chArr[i9].charValue();
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

    public static boolean contains(@Nullable long[] jArr, long j9) {
        return indexOf(jArr, j9) != -1;
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
    public static Object get(@Nullable Object obj, int i9, @Nullable Object obj2) {
        if (obj == null) {
            return obj2;
        }
        try {
            return Array.get(obj, i9);
        } catch (Exception unused) {
            return obj2;
        }
    }

    public static int indexOf(@Nullable Object[] objArr, @Nullable Object obj, int i9) {
        if (objArr == null) {
            return -1;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        if (obj == null) {
            while (i9 < objArr.length) {
                if (objArr[i9] == null) {
                    return i9;
                }
                i9++;
            }
        } else {
            while (i9 < objArr.length) {
                if (obj.equals(objArr[i9])) {
                    return i9;
                }
                i9++;
            }
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable Object[] objArr, @Nullable Object obj, int i9) {
        if (objArr == null || i9 < 0) {
            return -1;
        }
        if (i9 >= objArr.length) {
            i9 = objArr.length - 1;
        }
        if (obj == null) {
            while (i9 >= 0) {
                if (objArr[i9] == null) {
                    return i9;
                }
                i9--;
            }
        } else {
            while (i9 >= 0) {
                if (obj.equals(objArr[i9])) {
                    return i9;
                }
                i9--;
            }
        }
        return -1;
    }

    @Nullable
    public static boolean[] remove(@Nullable boolean[] zArr, int i9) {
        if (zArr == null) {
            return null;
        }
        return (boolean[]) remove((Object) zArr, i9);
    }

    @Nullable
    public static long[] subArray(@Nullable long[] jArr, int i9, int i10) {
        return (long[]) realSubArray(jArr, i9, i10);
    }

    @NonNull
    public static boolean[] add(@Nullable boolean[] zArr, boolean z9) {
        return (boolean[]) realAddOne(zArr, Boolean.valueOf(z9), Boolean.TYPE);
    }

    public static boolean contains(@Nullable int[] iArr, int i9) {
        return indexOf(iArr, i9) != -1;
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
    public static byte[] remove(@Nullable byte[] bArr, int i9) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) remove((Object) bArr, i9);
    }

    public static void sort(@Nullable byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return;
        }
        Arrays.sort(bArr);
    }

    @Nullable
    public static int[] subArray(@Nullable int[] iArr, int i9, int i10) {
        return (int[]) realSubArray(iArr, i9, i10);
    }

    @NonNull
    public static byte[] add(@Nullable byte[] bArr, byte b10) {
        return (byte[]) realAddOne(bArr, Byte.valueOf(b10), Byte.TYPE);
    }

    public static boolean contains(@Nullable short[] sArr, short s9) {
        return indexOf(sArr, s9) != -1;
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
    public static char[] remove(@Nullable char[] cArr, int i9) {
        if (cArr == null) {
            return null;
        }
        return (char[]) remove((Object) cArr, i9);
    }

    @Nullable
    public static boolean[] removeElement(@Nullable boolean[] zArr, boolean z9) {
        int iIndexOf = indexOf(zArr, z9);
        if (iIndexOf == -1) {
            return copy(zArr);
        }
        return remove(zArr, iIndexOf);
    }

    @Nullable
    public static short[] subArray(@Nullable short[] sArr, int i9, int i10) {
        return (short[]) realSubArray(sArr, i9, i10);
    }

    @NonNull
    public static char[] add(@Nullable char[] cArr, char c10) {
        return (char[]) realAddOne(cArr, Character.valueOf(c10), Character.TYPE);
    }

    public static boolean contains(@Nullable char[] cArr, char c10) {
        return indexOf(cArr, c10) != -1;
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
    public static double[] remove(@Nullable double[] dArr, int i9) {
        if (dArr == null) {
            return null;
        }
        return (double[]) remove((Object) dArr, i9);
    }

    public static void reverse(long[] jArr) {
        if (jArr == null) {
            return;
        }
        int length = jArr.length - 1;
        for (int i9 = 0; length > i9; i9++) {
            long j9 = jArr[length];
            jArr[length] = jArr[i9];
            jArr[i9] = j9;
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
    public static char[] subArray(@Nullable char[] cArr, int i9, int i10) {
        return (char[]) realSubArray(cArr, i9, i10);
    }

    @NonNull
    public static double[] add(@Nullable double[] dArr, double d10) {
        return (double[]) realAddOne(dArr, Double.valueOf(d10), Double.TYPE);
    }

    public static boolean contains(@Nullable byte[] bArr, byte b10) {
        return indexOf(bArr, b10) != -1;
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

    public static int indexOf(@Nullable long[] jArr, long j9) {
        return indexOf(jArr, j9, 0);
    }

    public static int lastIndexOf(@Nullable long[] jArr, long j9) {
        return lastIndexOf(jArr, j9, Integer.MAX_VALUE);
    }

    @Nullable
    public static float[] remove(@Nullable float[] fArr, int i9) {
        if (fArr == null) {
            return null;
        }
        return (float[]) remove((Object) fArr, i9);
    }

    @Nullable
    public static byte[] subArray(@Nullable byte[] bArr, int i9, int i10) {
        return (byte[]) realSubArray(bArr, i9, i10);
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
        for (int i9 = 0; i9 < jArr.length; i9++) {
            lArr[i9] = new Long(jArr[i9]);
        }
        return lArr;
    }

    @Nullable
    public static char[] toPrimitive(@Nullable Character[] chArr, char c10) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return new char[0];
        }
        char[] cArr = new char[chArr.length];
        for (int i9 = 0; i9 < chArr.length; i9++) {
            Character ch = chArr[i9];
            cArr[i9] = ch == null ? c10 : ch.charValue();
        }
        return cArr;
    }

    @NonNull
    public static float[] add(@Nullable float[] fArr, float f10) {
        return (float[]) realAddOne(fArr, Float.valueOf(f10), Float.TYPE);
    }

    public static boolean contains(@Nullable double[] dArr, double d10) {
        return indexOf(dArr, d10) != -1;
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

    public static int indexOf(@Nullable long[] jArr, long j9, int i9) {
        if (jArr == null) {
            return -1;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        while (i9 < jArr.length) {
            if (j9 == jArr[i9]) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable long[] jArr, long j9, int i9) {
        if (jArr == null || i9 < 0) {
            return -1;
        }
        if (i9 >= jArr.length) {
            i9 = jArr.length - 1;
        }
        while (i9 >= 0) {
            if (j9 == jArr[i9]) {
                return i9;
            }
            i9--;
        }
        return -1;
    }

    @Nullable
    public static int[] remove(@Nullable int[] iArr, int i9) {
        if (iArr == null) {
            return null;
        }
        return (int[]) remove((Object) iArr, i9);
    }

    @Nullable
    public static byte[] removeElement(@Nullable byte[] bArr, byte b10) {
        int iIndexOf = indexOf(bArr, b10);
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
    public static double[] subArray(@Nullable double[] dArr, int i9, int i10) {
        return (double[]) realSubArray(dArr, i9, i10);
    }

    @NonNull
    public static int[] add(@Nullable int[] iArr, int i9) {
        return (int[]) realAddOne(iArr, Integer.valueOf(i9), Integer.TYPE);
    }

    public static boolean contains(@Nullable double[] dArr, double d10, double d11) {
        return indexOf(dArr, d10, 0, d11) != -1;
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
    private static Object realAddArr(@Nullable Object obj, int i9, @Nullable Object obj2, Class cls) throws NegativeArraySizeException {
        if (obj == null && obj2 == null) {
            return null;
        }
        int length = getLength(obj);
        int length2 = getLength(obj2);
        if (length == 0) {
            if (i9 != 0) {
                throw new IndexOutOfBoundsException("Index: " + i9 + ", array1 Length: 0");
            }
            return realCopy(obj2);
        }
        if (length2 == 0) {
            return realCopy(obj);
        }
        if (i9 > length || i9 < 0) {
            throw new IndexOutOfBoundsException("Index: " + i9 + ", array1 Length: " + length);
        }
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
        if (i9 == length) {
            System.arraycopy(obj, 0, objNewInstance, 0, length);
            System.arraycopy(obj2, 0, objNewInstance, length, length2);
            return objNewInstance;
        }
        if (i9 == 0) {
            System.arraycopy(obj2, 0, objNewInstance, 0, length2);
            System.arraycopy(obj, 0, objNewInstance, length2, length);
            return objNewInstance;
        }
        System.arraycopy(obj, 0, objNewInstance, 0, i9);
        System.arraycopy(obj2, 0, objNewInstance, i9, length2);
        System.arraycopy(obj, i9, objNewInstance, length2 + i9, length - i9);
        return objNewInstance;
    }

    @Nullable
    public static long[] remove(@Nullable long[] jArr, int i9) {
        if (jArr == null) {
            return null;
        }
        return (long[]) remove((Object) jArr, i9);
    }

    @Nullable
    public static float[] subArray(@Nullable float[] fArr, int i9, int i10) {
        return (float[]) realSubArray(fArr, i9, i10);
    }

    @NonNull
    public static long[] add(@Nullable long[] jArr, long j9) {
        return (long[]) realAddOne(jArr, Long.valueOf(j9), Long.TYPE);
    }

    public static boolean contains(@Nullable float[] fArr, float f10) {
        return indexOf(fArr, f10) != -1;
    }

    @Nullable
    public static boolean[] copy(@Nullable boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        return subArray(zArr, 0, zArr.length);
    }

    public static int indexOf(@Nullable int[] iArr, int i9) {
        return indexOf(iArr, i9, 0);
    }

    @Nullable
    public static short[] remove(@Nullable short[] sArr, int i9) {
        if (sArr == null) {
            return null;
        }
        return (short[]) remove((Object) sArr, i9);
    }

    public static void reverse(int[] iArr) {
        if (iArr == null) {
            return;
        }
        int length = iArr.length - 1;
        for (int i9 = 0; length > i9; i9++) {
            int i10 = iArr[length];
            iArr[length] = iArr[i9];
            iArr[i9] = i10;
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
    public static boolean[] subArray(@Nullable boolean[] zArr, int i9, int i10) {
        return (boolean[]) realSubArray(zArr, i9, i10);
    }

    @NonNull
    public static short[] add(@Nullable short[] sArr, short s9) {
        return (short[]) realAddOne(sArr, Short.valueOf(s9), Short.TYPE);
    }

    public static boolean contains(@Nullable boolean[] zArr, boolean z9) {
        return indexOf(zArr, z9) != -1;
    }

    public static int indexOf(@Nullable int[] iArr, int i9, int i10) {
        if (iArr == null) {
            return -1;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < iArr.length) {
            if (i9 == iArr[i10]) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable int[] iArr, int i9) {
        return lastIndexOf(iArr, i9, Integer.MAX_VALUE);
    }

    @NonNull
    private static Object remove(@NonNull Object obj, int i9) throws NegativeArraySizeException {
        int length = getLength(obj);
        if (i9 >= 0 && i9 < length) {
            int i10 = length - 1;
            Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), i10);
            System.arraycopy(obj, 0, objNewInstance, 0, i9);
            if (i9 < i10) {
                System.arraycopy(obj, i9 + 1, objNewInstance, i9, (length - i9) - 1);
            }
            return objNewInstance;
        }
        throw new IndexOutOfBoundsException("Index: " + i9 + ", Length: " + length);
    }

    @Nullable
    public static char[] removeElement(@Nullable char[] cArr, char c10) {
        int iIndexOf = indexOf(cArr, c10);
        if (iIndexOf == -1) {
            return copy(cArr);
        }
        return remove(cArr, iIndexOf);
    }

    @Nullable
    public static <T> T[] add(@Nullable T[] tArr, @Nullable T[] tArr2) {
        return (T[]) ((Object[]) realAddArr(tArr, tArr2));
    }

    public static int lastIndexOf(@Nullable int[] iArr, int i9, int i10) {
        if (iArr == null || i10 < 0) {
            return -1;
        }
        if (i10 >= iArr.length) {
            i10 = iArr.length - 1;
        }
        while (i10 >= 0) {
            if (i9 == iArr[i10]) {
                return i10;
            }
            i10--;
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
    public static Integer[] toObject(@Nullable int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length == 0) {
            return new Integer[0];
        }
        Integer[] numArr = new Integer[iArr.length];
        for (int i9 = 0; i9 < iArr.length; i9++) {
            numArr[i9] = new Integer(iArr[i9]);
        }
        return numArr;
    }

    @Nullable
    public static boolean[] add(@Nullable boolean[] zArr, @Nullable boolean[] zArr2) {
        return (boolean[]) realAddArr(zArr, zArr2);
    }

    public static int indexOf(@Nullable short[] sArr, short s9) {
        return indexOf(sArr, s9, 0);
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
        for (int i9 = 0; i9 < lArr.length; i9++) {
            jArr[i9] = lArr[i9].longValue();
        }
        return jArr;
    }

    @Nullable
    public static char[] add(@Nullable char[] cArr, @Nullable char[] cArr2) {
        return (char[]) realAddArr(cArr, cArr2);
    }

    public static int indexOf(@Nullable short[] sArr, short s9, int i9) {
        if (sArr == null) {
            return -1;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        while (i9 < sArr.length) {
            if (s9 == sArr[i9]) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    @Nullable
    public static double[] removeElement(@Nullable double[] dArr, double d10) {
        int iIndexOf = indexOf(dArr, d10);
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
        for (int i9 = 0; length > i9; i9++) {
            short s9 = sArr[length];
            sArr[length] = sArr[i9];
            sArr[i9] = s9;
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
    public static byte[] add(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        return (byte[]) realAddArr(bArr, bArr2);
    }

    public static int lastIndexOf(@Nullable short[] sArr, short s9) {
        return lastIndexOf(sArr, s9, Integer.MAX_VALUE);
    }

    @Nullable
    public static short[] add(@Nullable short[] sArr, @Nullable short[] sArr2) {
        return (short[]) realAddArr(sArr, sArr2);
    }

    public static int indexOf(@Nullable char[] cArr, char c10) {
        return indexOf(cArr, c10, 0);
    }

    public static int lastIndexOf(@Nullable short[] sArr, short s9, int i9) {
        if (sArr == null || i9 < 0) {
            return -1;
        }
        if (i9 >= sArr.length) {
            i9 = sArr.length - 1;
        }
        while (i9 >= 0) {
            if (s9 == sArr[i9]) {
                return i9;
            }
            i9--;
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

    public static int indexOf(@Nullable char[] cArr, char c10, int i9) {
        if (cArr == null) {
            return -1;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        while (i9 < cArr.length) {
            if (c10 == cArr[i9]) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    @Nullable
    public static float[] removeElement(@Nullable float[] fArr, float f10) {
        int iIndexOf = indexOf(fArr, f10);
        if (iIndexOf == -1) {
            return copy(fArr);
        }
        return remove(fArr, iIndexOf);
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
        for (int i9 = 0; i9 < sArr.length; i9++) {
            shArr[i9] = new Short(sArr[i9]);
        }
        return shArr;
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
        for (int i9 = 0; length > i9; i9++) {
            char c10 = cArr[length];
            cArr[length] = cArr[i9];
            cArr[i9] = c10;
            length--;
        }
    }

    @Nullable
    public static long[] toPrimitive(@Nullable Long[] lArr, long j9) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return new long[0];
        }
        long[] jArr = new long[lArr.length];
        for (int i9 = 0; i9 < lArr.length; i9++) {
            Long l9 = lArr[i9];
            jArr[i9] = l9 == null ? j9 : l9.longValue();
        }
        return jArr;
    }

    @Nullable
    public static float[] add(@Nullable float[] fArr, @Nullable float[] fArr2) {
        return (float[]) realAddArr(fArr, fArr2);
    }

    public static int indexOf(@Nullable byte[] bArr, byte b10) {
        return indexOf(bArr, b10, 0);
    }

    public static int lastIndexOf(@Nullable char[] cArr, char c10) {
        return lastIndexOf(cArr, c10, Integer.MAX_VALUE);
    }

    @Nullable
    public static double[] add(@Nullable double[] dArr, @Nullable double[] dArr2) {
        return (double[]) realAddArr(dArr, dArr2);
    }

    public static int indexOf(@Nullable byte[] bArr, byte b10, int i9) {
        if (bArr == null) {
            return -1;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        while (i9 < bArr.length) {
            if (b10 == bArr[i9]) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable char[] cArr, char c10, int i9) {
        if (cArr == null || i9 < 0) {
            return -1;
        }
        if (i9 >= cArr.length) {
            i9 = cArr.length - 1;
        }
        while (i9 >= 0) {
            if (c10 == cArr[i9]) {
                return i9;
            }
            i9--;
        }
        return -1;
    }

    @Nullable
    public static int[] removeElement(@Nullable int[] iArr, int i9) {
        int iIndexOf = indexOf(iArr, i9);
        if (iIndexOf == -1) {
            return copy(iArr);
        }
        return remove(iArr, iIndexOf);
    }

    @Nullable
    public static <T> T[] add(@Nullable T[] tArr, int i9, @Nullable T[] tArr2) {
        Class<?> componentType;
        if (tArr != null) {
            componentType = tArr.getClass().getComponentType();
        } else {
            if (tArr2 == null) {
                return null;
            }
            componentType = tArr2.getClass().getComponentType();
        }
        return (T[]) ((Object[]) realAddArr(tArr, i9, tArr2, componentType));
    }

    public static int indexOf(@Nullable double[] dArr, double d10) {
        return indexOf(dArr, d10, 0);
    }

    public static void reverse(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int length = bArr.length - 1;
        for (int i9 = 0; length > i9; i9++) {
            byte b10 = bArr[length];
            bArr[length] = bArr[i9];
            bArr[i9] = b10;
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
        for (int i9 = 0; i9 < bArr.length; i9++) {
            bArr2[i9] = new Byte(bArr[i9]);
        }
        return bArr2;
    }

    public static int indexOf(@Nullable double[] dArr, double d10, double d11) {
        return indexOf(dArr, d10, 0, d11);
    }

    public static int lastIndexOf(@Nullable byte[] bArr, byte b10) {
        return lastIndexOf(bArr, b10, Integer.MAX_VALUE);
    }

    @Nullable
    public static long[] removeElement(@Nullable long[] jArr, long j9) {
        int iIndexOf = indexOf(jArr, j9);
        if (iIndexOf == -1) {
            return copy(jArr);
        }
        return remove(jArr, iIndexOf);
    }

    @Nullable
    public static boolean[] add(@Nullable boolean[] zArr, int i9, @Nullable boolean[] zArr2) throws NegativeArraySizeException {
        Object objRealAddArr = realAddArr(zArr, i9, zArr2, Boolean.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (boolean[]) objRealAddArr;
    }

    public static int indexOf(@Nullable double[] dArr, double d10, int i9) {
        if (isEmpty(dArr)) {
            return -1;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        while (i9 < dArr.length) {
            if (d10 == dArr[i9]) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable byte[] bArr, byte b10, int i9) {
        if (bArr == null || i9 < 0) {
            return -1;
        }
        if (i9 >= bArr.length) {
            i9 = bArr.length - 1;
        }
        while (i9 >= 0) {
            if (b10 == bArr[i9]) {
                return i9;
            }
            i9--;
        }
        return -1;
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
        for (int i9 = 0; i9 < numArr.length; i9++) {
            iArr[i9] = numArr[i9].intValue();
        }
        return iArr;
    }

    public static char[] add(@Nullable char[] cArr, int i9, @Nullable char[] cArr2) throws NegativeArraySizeException {
        Object objRealAddArr = realAddArr(cArr, i9, cArr2, Character.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (char[]) objRealAddArr;
    }

    @Nullable
    public static short[] removeElement(@Nullable short[] sArr, short s9) {
        int iIndexOf = indexOf(sArr, s9);
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
        for (int i9 = 0; length > i9; i9++) {
            double d10 = dArr[length];
            dArr[length] = dArr[i9];
            dArr[i9] = d10;
            length--;
        }
    }

    public static int indexOf(@Nullable double[] dArr, double d10, int i9, double d11) {
        if (isEmpty(dArr)) {
            return -1;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        double d12 = d10 - d11;
        double d13 = d10 + d11;
        while (i9 < dArr.length) {
            double d14 = dArr[i9];
            if (d14 >= d12 && d14 <= d13) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable double[] dArr, double d10) {
        return lastIndexOf(dArr, d10, Integer.MAX_VALUE);
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
        for (int i9 = 0; i9 < dArr.length; i9++) {
            dArr2[i9] = new Double(dArr[i9]);
        }
        return dArr2;
    }

    @Nullable
    public static byte[] add(@Nullable byte[] bArr, int i9, @Nullable byte[] bArr2) throws NegativeArraySizeException {
        Object objRealAddArr = realAddArr(bArr, i9, bArr2, Byte.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (byte[]) objRealAddArr;
    }

    public static int lastIndexOf(@Nullable double[] dArr, double d10, double d11) {
        return lastIndexOf(dArr, d10, Integer.MAX_VALUE, d11);
    }

    public static int lastIndexOf(@Nullable double[] dArr, double d10, int i9) {
        if (isEmpty(dArr) || i9 < 0) {
            return -1;
        }
        if (i9 >= dArr.length) {
            i9 = dArr.length - 1;
        }
        while (i9 >= 0) {
            if (d10 == dArr[i9]) {
                return i9;
            }
            i9--;
        }
        return -1;
    }

    @Nullable
    public static int[] toPrimitive(@Nullable Integer[] numArr, int i9) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return new int[0];
        }
        int[] iArr = new int[numArr.length];
        for (int i10 = 0; i10 < numArr.length; i10++) {
            Integer num = numArr[i10];
            iArr[i10] = num == null ? i9 : num.intValue();
        }
        return iArr;
    }

    @Nullable
    public static short[] add(@Nullable short[] sArr, int i9, @Nullable short[] sArr2) throws NegativeArraySizeException {
        Object objRealAddArr = realAddArr(sArr, i9, sArr2, Short.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (short[]) objRealAddArr;
    }

    public static int indexOf(@Nullable float[] fArr, float f10) {
        return indexOf(fArr, f10, 0);
    }

    public static void reverse(float[] fArr) {
        if (fArr == null) {
            return;
        }
        int length = fArr.length - 1;
        for (int i9 = 0; length > i9; i9++) {
            float f10 = fArr[length];
            fArr[length] = fArr[i9];
            fArr[i9] = f10;
            length--;
        }
    }

    public static int indexOf(@Nullable float[] fArr, float f10, int i9) {
        if (isEmpty(fArr)) {
            return -1;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        while (i9 < fArr.length) {
            if (f10 == fArr[i9]) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    @Nullable
    public static int[] add(@Nullable int[] iArr, int i9, @Nullable int[] iArr2) throws NegativeArraySizeException {
        Object objRealAddArr = realAddArr(iArr, i9, iArr2, Integer.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (int[]) objRealAddArr;
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
        for (int i9 = 0; i9 < fArr.length; i9++) {
            fArr2[i9] = new Float(fArr[i9]);
        }
        return fArr2;
    }

    public static int lastIndexOf(@Nullable double[] dArr, double d10, int i9, double d11) {
        if (isEmpty(dArr) || i9 < 0) {
            return -1;
        }
        if (i9 >= dArr.length) {
            i9 = dArr.length - 1;
        }
        double d12 = d10 - d11;
        double d13 = d10 + d11;
        while (i9 >= 0) {
            double d14 = dArr[i9];
            if (d14 >= d12 && d14 <= d13) {
                return i9;
            }
            i9--;
        }
        return -1;
    }

    @Nullable
    public static long[] add(@Nullable long[] jArr, int i9, @Nullable long[] jArr2) throws NegativeArraySizeException {
        Object objRealAddArr = realAddArr(jArr, i9, jArr2, Long.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (long[]) objRealAddArr;
    }

    public static int indexOf(@Nullable boolean[] zArr, boolean z9) {
        return indexOf(zArr, z9, 0);
    }

    public static void reverse(boolean[] zArr) {
        if (zArr == null) {
            return;
        }
        int length = zArr.length - 1;
        for (int i9 = 0; length > i9; i9++) {
            boolean z9 = zArr[length];
            zArr[length] = zArr[i9];
            zArr[i9] = z9;
            length--;
        }
    }

    public static int indexOf(@Nullable boolean[] zArr, boolean z9, int i9) {
        if (isEmpty(zArr)) {
            return -1;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        while (i9 < zArr.length) {
            if (z9 == zArr[i9]) {
                return i9;
            }
            i9++;
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
        for (int i9 = 0; i9 < shArr.length; i9++) {
            sArr[i9] = shArr[i9].shortValue();
        }
        return sArr;
    }

    @Nullable
    public static float[] add(@Nullable float[] fArr, int i9, @Nullable float[] fArr2) throws NegativeArraySizeException {
        Object objRealAddArr = realAddArr(fArr, i9, fArr2, Float.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (float[]) objRealAddArr;
    }

    public static int lastIndexOf(@Nullable float[] fArr, float f10) {
        return lastIndexOf(fArr, f10, Integer.MAX_VALUE);
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
        for (int i9 = 0; i9 < zArr.length; i9++) {
            boolArr[i9] = zArr[i9] ? Boolean.TRUE : Boolean.FALSE;
        }
        return boolArr;
    }

    @Nullable
    public static double[] add(@Nullable double[] dArr, int i9, @Nullable double[] dArr2) throws NegativeArraySizeException {
        Object objRealAddArr = realAddArr(dArr, i9, dArr2, Double.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (double[]) objRealAddArr;
    }

    public static int lastIndexOf(@Nullable float[] fArr, float f10, int i9) {
        if (isEmpty(fArr) || i9 < 0) {
            return -1;
        }
        if (i9 >= fArr.length) {
            i9 = fArr.length - 1;
        }
        while (i9 >= 0) {
            if (f10 == fArr[i9]) {
                return i9;
            }
            i9--;
        }
        return -1;
    }

    @NonNull
    public static <T> T[] add(@Nullable T[] tArr, int i9, @Nullable T t9) {
        Class<?> componentType;
        if (tArr != null) {
            componentType = tArr.getClass().getComponentType();
        } else if (t9 != null) {
            componentType = t9.getClass();
        } else {
            return (T[]) new Object[]{null};
        }
        return (T[]) ((Object[]) realAdd(tArr, i9, t9, componentType));
    }

    @Nullable
    public static short[] toPrimitive(@Nullable Short[] shArr, short s9) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return new short[0];
        }
        short[] sArr = new short[shArr.length];
        for (int i9 = 0; i9 < shArr.length; i9++) {
            Short sh = shArr[i9];
            sArr[i9] = sh == null ? s9 : sh.shortValue();
        }
        return sArr;
    }

    public static int lastIndexOf(@Nullable boolean[] zArr, boolean z9) {
        return lastIndexOf(zArr, z9, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(@Nullable boolean[] zArr, boolean z9, int i9) {
        if (isEmpty(zArr) || i9 < 0) {
            return -1;
        }
        if (i9 >= zArr.length) {
            i9 = zArr.length - 1;
        }
        while (i9 >= 0) {
            if (z9 == zArr[i9]) {
                return i9;
            }
            i9--;
        }
        return -1;
    }

    @NonNull
    public static boolean[] add(@Nullable boolean[] zArr, int i9, boolean z9) {
        return (boolean[]) realAdd(zArr, i9, Boolean.valueOf(z9), Boolean.TYPE);
    }

    @NonNull
    public static char[] add(@Nullable char[] cArr, int i9, char c10) {
        return (char[]) realAdd(cArr, i9, Character.valueOf(c10), Character.TYPE);
    }

    @NonNull
    public static byte[] add(@Nullable byte[] bArr, int i9, byte b10) {
        return (byte[]) realAdd(bArr, i9, Byte.valueOf(b10), Byte.TYPE);
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
        for (int i9 = 0; i9 < bArr.length; i9++) {
            bArr2[i9] = bArr[i9].byteValue();
        }
        return bArr2;
    }

    @NonNull
    public static short[] add(@Nullable short[] sArr, int i9, short s9) {
        return (short[]) realAdd(sArr, i9, Short.valueOf(s9), Short.TYPE);
    }

    @NonNull
    public static int[] add(@Nullable int[] iArr, int i9, int i10) {
        return (int[]) realAdd(iArr, i9, Integer.valueOf(i10), Integer.TYPE);
    }

    @NonNull
    public static long[] add(@Nullable long[] jArr, int i9, long j9) {
        return (long[]) realAdd(jArr, i9, Long.valueOf(j9), Long.TYPE);
    }

    @NonNull
    public static float[] add(@Nullable float[] fArr, int i9, float f10) {
        return (float[]) realAdd(fArr, i9, Float.valueOf(f10), Float.TYPE);
    }

    @NonNull
    public static double[] add(@Nullable double[] dArr, int i9, double d10) {
        return (double[]) realAdd(dArr, i9, Double.valueOf(d10), Double.TYPE);
    }

    @Nullable
    public static byte[] toPrimitive(@Nullable Byte[] bArr, byte b10) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i9 = 0; i9 < bArr.length; i9++) {
            Byte b11 = bArr[i9];
            bArr2[i9] = b11 == null ? b10 : b11.byteValue();
        }
        return bArr2;
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
        for (int i9 = 0; i9 < dArr.length; i9++) {
            dArr2[i9] = dArr[i9].doubleValue();
        }
        return dArr2;
    }

    @Nullable
    public static double[] toPrimitive(@Nullable Double[] dArr, double d10) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return new double[0];
        }
        double[] dArr2 = new double[dArr.length];
        for (int i9 = 0; i9 < dArr.length; i9++) {
            Double d11 = dArr[i9];
            dArr2[i9] = d11 == null ? d10 : d11.doubleValue();
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
        for (int i9 = 0; i9 < fArr.length; i9++) {
            fArr2[i9] = fArr[i9].floatValue();
        }
        return fArr2;
    }

    @Nullable
    public static float[] toPrimitive(@Nullable Float[] fArr, float f10) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[fArr.length];
        for (int i9 = 0; i9 < fArr.length; i9++) {
            Float f11 = fArr[i9];
            fArr2[i9] = f11 == null ? f10 : f11.floatValue();
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
        for (int i9 = 0; i9 < boolArr.length; i9++) {
            zArr[i9] = boolArr[i9].booleanValue();
        }
        return zArr;
    }

    @Nullable
    public static boolean[] toPrimitive(@Nullable Boolean[] boolArr, boolean z9) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return new boolean[0];
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i9 = 0; i9 < boolArr.length; i9++) {
            Boolean bool = boolArr[i9];
            zArr[i9] = bool == null ? z9 : bool.booleanValue();
        }
        return zArr;
    }
}
