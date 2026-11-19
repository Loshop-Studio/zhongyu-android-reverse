package p147rx.internal.util;

import java.util.Arrays;
import p001a0.InterfaceC0004c;
import p147rx.functions.Action1;
import p147rx.internal.util.unsafe.Pow2;

/* loaded from: classes2.dex */
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

    static int mix(int i4) {
        int i5 = i4 * INT_PHI;
        return i5 ^ (i5 >>> 16);
    }

    public boolean add(T t3) {
        T t4;
        T[] tArr = this.keys;
        int i4 = this.mask;
        int iMix = mix(t3.hashCode()) & i4;
        T t5 = tArr[iMix];
        if (t5 != null) {
            if (t5.equals(t3)) {
                return false;
            }
            do {
                iMix = (iMix + 1) & i4;
                t4 = tArr[iMix];
                if (t4 == null) {
                }
            } while (!t4.equals(t3));
            return false;
        }
        tArr[iMix] = t3;
        int i5 = this.size + 1;
        this.size = i5;
        if (i5 >= this.maxSize) {
            rehash();
        }
        return true;
    }

    public void clear(Action1<? super T> action1) {
        if (this.size == 0) {
            return;
        }
        T[] tArr = this.keys;
        for (InterfaceC0004c interfaceC0004c : tArr) {
            if (interfaceC0004c != null) {
                action1.call(interfaceC0004c);
            }
        }
        Arrays.fill(tArr, (Object) null);
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    void rehash() {
        T[] tArr = this.keys;
        int length = tArr.length;
        int i4 = length << 1;
        int i5 = i4 - 1;
        T[] tArr2 = (T[]) new Object[i4];
        int i6 = this.size;
        while (true) {
            int i7 = i6 - 1;
            if (i6 == 0) {
                this.mask = i5;
                this.maxSize = (int) (i4 * this.loadFactor);
                this.keys = tArr2;
                return;
            }
            do {
                length--;
            } while (tArr[length] == null);
            int iMix = mix(tArr[length].hashCode()) & i5;
            if (tArr2[iMix] != null) {
                do {
                    iMix = (iMix + 1) & i5;
                } while (tArr2[iMix] != null);
            }
            tArr2[iMix] = tArr[length];
            i6 = i7;
        }
    }

    public boolean remove(T t3) {
        T t4;
        T[] tArr = this.keys;
        int i4 = this.mask;
        int iMix = mix(t3.hashCode()) & i4;
        T t5 = tArr[iMix];
        if (t5 == null) {
            return false;
        }
        if (t5.equals(t3)) {
            return removeEntry(iMix, tArr, i4);
        }
        do {
            iMix = (iMix + 1) & i4;
            t4 = tArr[iMix];
            if (t4 == null) {
                return false;
            }
        } while (!t4.equals(t3));
        return removeEntry(iMix, tArr, i4);
    }

    boolean removeEntry(int i4, T[] tArr, int i5) {
        int i6;
        T t3;
        this.size--;
        while (true) {
            int i7 = i4 + 1;
            while (true) {
                i6 = i7 & i5;
                t3 = tArr[i6];
                if (t3 == null) {
                    tArr[i4] = null;
                    return true;
                }
                int iMix = mix(t3.hashCode()) & i5;
                if (i4 <= i6) {
                    if (i4 >= iMix || iMix > i6) {
                        break;
                    }
                    i7 = i6 + 1;
                } else if (i4 < iMix || iMix <= i6) {
                    i7 = i6 + 1;
                }
            }
            tArr[i4] = t3;
            i4 = i6;
        }
    }

    public void terminate() {
        this.size = 0;
        this.keys = (T[]) new Object[0];
    }

    public T[] values() {
        return this.keys;
    }

    public OpenHashSet(int i4) {
        this(i4, 0.75f);
    }

    public OpenHashSet(int i4, float f4) {
        this.loadFactor = f4;
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i4);
        this.mask = iRoundToPowerOfTwo - 1;
        this.maxSize = (int) (f4 * iRoundToPowerOfTwo);
        this.keys = (T[]) new Object[iRoundToPowerOfTwo];
    }
}
