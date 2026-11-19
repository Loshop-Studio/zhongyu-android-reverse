package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class BitVector {
    public static final int $stable = 8;
    private long first;
    private long[] others = SlotTableKt.EmptyLongArray;
    private long second;

    private final int nextBit(int i10, InterfaceC9540l interfaceC9540l) {
        int iNumberOfTrailingZeros;
        if (i10 < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros((((Number) interfaceC9540l.invoke(Long.valueOf(this.first))).longValue() >>> i10) << i10)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (i10 < 128) {
            int i11 = i10 - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros((((Number) interfaceC9540l.invoke(Long.valueOf(this.second))).longValue() >>> i11) << i11);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(i10, 128);
        int i12 = (iMax / 64) - 2;
        long[] jArr = this.others;
        int length = jArr.length;
        for (int i13 = i12; i13 < length; i13++) {
            long jLongValue = ((Number) interfaceC9540l.invoke(Long.valueOf(jArr[i13]))).longValue();
            if (i13 == i12) {
                int i14 = iMax % 64;
                jLongValue = (jLongValue >>> i14) << i14;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(jLongValue);
            if (iNumberOfTrailingZeros3 < 64) {
                return (i13 * 64) + 128 + iNumberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final boolean get(int i10) {
        int i11;
        if (i10 < 64) {
            return ((1 << i10) & this.first) != 0;
        }
        if (i10 < 128) {
            return ((1 << (i10 - 64)) & this.second) != 0;
        }
        long[] jArr = this.others;
        int length = jArr.length;
        if (length != 0 && (i10 / 64) - 2 < length) {
            return ((1 << (i10 % 64)) & jArr[i11]) != 0;
        }
        return false;
    }

    public final int getSize() {
        return (this.others.length + 2) * 64;
    }

    public final int nextClear(int i10) {
        int iNumberOfTrailingZeros;
        if (i10 < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros(((~this.first) >>> i10) << i10)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (i10 < 128) {
            int i11 = i10 - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(((~this.second) >>> i11) << i11);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(i10, 128);
        int i12 = (iMax / 64) - 2;
        long[] jArr = this.others;
        int length = jArr.length;
        for (int i13 = i12; i13 < length; i13++) {
            long j10 = ~jArr[i13];
            if (i13 == i12) {
                int i14 = iMax % 64;
                j10 = (j10 >>> i14) << i14;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(j10);
            if (iNumberOfTrailingZeros3 < 64) {
                return (i13 * 64) + 128 + iNumberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final int nextSet(int i10) {
        int iNumberOfTrailingZeros;
        if (i10 < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros((this.first >>> i10) << i10)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (i10 < 128) {
            int i11 = i10 - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros((this.second >>> i11) << i11);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(i10, 128);
        int i12 = (iMax / 64) - 2;
        long[] jArr = this.others;
        int length = jArr.length;
        for (int i13 = i12; i13 < length; i13++) {
            long j10 = jArr[i13];
            if (i13 == i12) {
                int i14 = iMax % 64;
                j10 = (j10 >>> i14) << i14;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(j10);
            if (iNumberOfTrailingZeros3 < 64) {
                return (i13 * 64) + 128 + iNumberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final void set(int i10, boolean z10) {
        if (i10 < 64) {
            this.first = ((z10 ? 1L : 0L) << i10) | ((~(1 << i10)) & this.first);
            return;
        }
        if (i10 < 128) {
            this.second = ((z10 ? 1L : 0L) << i10) | ((~(1 << (i10 - 64))) & this.second);
            return;
        }
        int i11 = i10 / 64;
        int i12 = i11 - 2;
        int i13 = i10 % 64;
        long j10 = 1 << i13;
        long[] jArrCopyOf = this.others;
        if (i12 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11 - 1);
            AbstractC9979u.m20293f(jArrCopyOf, "copyOf(...)");
            this.others = jArrCopyOf;
        }
        jArrCopyOf[i12] = ((z10 ? 1L : 0L) << i13) | ((~j10) & jArrCopyOf[i12]);
    }

    public final void setRange(int i10, int i11) {
        long j10 = i10 < i11 ? -1L : 0L;
        this.first = ((((i10 < 64 ? 1 : 0) * j10) >>> (64 - (Math.min(64, i11) - i10))) << i10) | this.first;
        if (i11 > 64) {
            int iMax = Math.max(i10, 64);
            this.second = (((j10 * (iMax < 128 ? 1 : 0)) >>> (128 - (Math.min(128, i11) - iMax))) << iMax) | this.second;
            if (i11 > 128) {
                for (int iMax2 = Math.max(iMax, 128); iMax2 < i11; iMax2++) {
                    set(iMax2, true);
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BitVector [");
        int size = getSize();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            if (get(i10)) {
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append(i10);
                z10 = false;
            }
        }
        sb2.append(']');
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }
}
