package io.reactivex.internal.util;

/* loaded from: classes5.dex */
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

    public static int mix(int i9) {
        int i10 = i9 * INT_PHI;
        return i10 ^ (i10 >>> 16);
    }

    public boolean add(T t9) {
        T t10;
        T[] tArr = this.keys;
        int i9 = this.mask;
        int iMix = mix(t9.hashCode()) & i9;
        T t11 = tArr[iMix];
        if (t11 != null) {
            if (t11.equals(t9)) {
                return false;
            }
            do {
                iMix = (iMix + 1) & i9;
                t10 = tArr[iMix];
                if (t10 == null) {
                }
            } while (!t10.equals(t9));
            return false;
        }
        tArr[iMix] = t9;
        int i10 = this.size + 1;
        this.size = i10;
        if (i10 >= this.maxSize) {
            rehash();
        }
        return true;
    }

    public Object[] keys() {
        return this.keys;
    }

    public void rehash() {
        T t9;
        T[] tArr = this.keys;
        int length = tArr.length;
        int i9 = length << 1;
        int i10 = i9 - 1;
        T[] tArr2 = (T[]) new Object[i9];
        int i11 = this.size;
        while (true) {
            int i12 = i11 - 1;
            if (i11 == 0) {
                this.mask = i10;
                this.maxSize = (int) (i9 * this.loadFactor);
                this.keys = tArr2;
                return;
            }
            do {
                length--;
                t9 = tArr[length];
            } while (t9 == null);
            int iMix = mix(t9.hashCode()) & i10;
            if (tArr2[iMix] != null) {
                do {
                    iMix = (iMix + 1) & i10;
                } while (tArr2[iMix] != null);
            }
            tArr2[iMix] = tArr[length];
            i11 = i12;
        }
    }

    public boolean remove(T t9) {
        T t10;
        T[] tArr = this.keys;
        int i9 = this.mask;
        int iMix = mix(t9.hashCode()) & i9;
        T t11 = tArr[iMix];
        if (t11 == null) {
            return false;
        }
        if (t11.equals(t9)) {
            return removeEntry(iMix, tArr, i9);
        }
        do {
            iMix = (iMix + 1) & i9;
            t10 = tArr[iMix];
            if (t10 == null) {
                return false;
            }
        } while (!t10.equals(t9));
        return removeEntry(iMix, tArr, i9);
    }

    public boolean removeEntry(int i9, T[] tArr, int i10) {
        int i11;
        T t9;
        this.size--;
        while (true) {
            int i12 = i9 + 1;
            while (true) {
                i11 = i12 & i10;
                t9 = tArr[i11];
                if (t9 == null) {
                    tArr[i9] = null;
                    return true;
                }
                int iMix = mix(t9.hashCode()) & i10;
                if (i9 <= i11) {
                    if (i9 >= iMix || iMix > i11) {
                        break;
                    }
                    i12 = i11 + 1;
                } else if (i9 < iMix || iMix <= i11) {
                    i12 = i11 + 1;
                }
            }
            tArr[i9] = t9;
            i9 = i11;
        }
    }

    public int size() {
        return this.size;
    }

    public OpenHashSet(int i9) {
        this(i9, 0.75f);
    }

    public OpenHashSet(int i9, float f10) {
        this.loadFactor = f10;
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i9);
        this.mask = iRoundToPowerOfTwo - 1;
        this.maxSize = (int) (f10 * iRoundToPowerOfTwo);
        this.keys = (T[]) new Object[iRoundToPowerOfTwo];
    }
}
