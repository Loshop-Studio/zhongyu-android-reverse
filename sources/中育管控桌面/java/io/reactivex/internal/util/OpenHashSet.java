package io.reactivex.internal.util;

/* loaded from: classes4.dex */
public final class OpenHashSet<T> {
    private static final int INT_PHI = -1640531527;
    T[] keys;
    final float loadFactor;
    int mask;
    int maxSize;
    int size;

    public OpenHashSet() {
        this(16, 0.75f);
    }

    public static int mix(int i6) {
        int i7 = i6 * INT_PHI;
        return i7 ^ (i7 >>> 16);
    }

    public boolean add(T t6) {
        T t7;
        T[] tArr = this.keys;
        int i6 = this.mask;
        int iMix = mix(t6.hashCode()) & i6;
        T t8 = tArr[iMix];
        if (t8 != null) {
            if (t8.equals(t6)) {
                return false;
            }
            do {
                iMix = (iMix + 1) & i6;
                t7 = tArr[iMix];
                if (t7 == null) {
                }
            } while (!t7.equals(t6));
            return false;
        }
        tArr[iMix] = t6;
        int i7 = this.size + 1;
        this.size = i7;
        if (i7 >= this.maxSize) {
            rehash();
        }
        return true;
    }

    public Object[] keys() {
        return this.keys;
    }

    public void rehash() {
        T t6;
        T[] tArr = this.keys;
        int length = tArr.length;
        int i6 = length << 1;
        int i7 = i6 - 1;
        T[] tArr2 = (T[]) new Object[i6];
        int i8 = this.size;
        while (true) {
            int i9 = i8 - 1;
            if (i8 == 0) {
                this.mask = i7;
                this.maxSize = (int) (i6 * this.loadFactor);
                this.keys = tArr2;
                return;
            }
            do {
                length--;
                t6 = tArr[length];
            } while (t6 == null);
            int iMix = mix(t6.hashCode()) & i7;
            if (tArr2[iMix] != null) {
                do {
                    iMix = (iMix + 1) & i7;
                } while (tArr2[iMix] != null);
            }
            tArr2[iMix] = tArr[length];
            i8 = i9;
        }
    }

    public boolean remove(T t6) {
        T t7;
        T[] tArr = this.keys;
        int i6 = this.mask;
        int iMix = mix(t6.hashCode()) & i6;
        T t8 = tArr[iMix];
        if (t8 == null) {
            return false;
        }
        if (t8.equals(t6)) {
            return removeEntry(iMix, tArr, i6);
        }
        do {
            iMix = (iMix + 1) & i6;
            t7 = tArr[iMix];
            if (t7 == null) {
                return false;
            }
        } while (!t7.equals(t6));
        return removeEntry(iMix, tArr, i6);
    }

    public boolean removeEntry(int i6, T[] tArr, int i7) {
        int i8;
        T t6;
        this.size--;
        while (true) {
            int i9 = i6 + 1;
            while (true) {
                i8 = i9 & i7;
                t6 = tArr[i8];
                if (t6 == null) {
                    tArr[i6] = null;
                    return true;
                }
                int iMix = mix(t6.hashCode()) & i7;
                if (i6 <= i8) {
                    if (i6 >= iMix || iMix > i8) {
                        break;
                    }
                    i9 = i8 + 1;
                } else if (i6 < iMix || iMix <= i8) {
                    i9 = i8 + 1;
                }
            }
            tArr[i6] = t6;
            i6 = i8;
        }
    }

    public int size() {
        return this.size;
    }

    public OpenHashSet(int i6) {
        this(i6, 0.75f);
    }

    public OpenHashSet(int i6, float f6) {
        this.loadFactor = f6;
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i6);
        this.mask = iRoundToPowerOfTwo - 1;
        this.maxSize = (int) (f6 * iRoundToPowerOfTwo);
        this.keys = (T[]) new Object[iRoundToPowerOfTwo];
    }
}
