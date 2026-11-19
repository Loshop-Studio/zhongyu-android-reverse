package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p325rc.AbstractC10964p;

/* loaded from: classes2.dex */
public final class SnapshotId_jvmKt {
    public static final long SnapshotIdInvalidValue = -1;
    public static final long SnapshotIdMax = Long.MAX_VALUE;
    public static final int SnapshotIdSize = 64;
    public static final long SnapshotIdZero = 0;

    public static final int binarySearch(long[] jArr, long j10) {
        int length = jArr.length - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (i10 + length) >>> 1;
            long j11 = jArr[i11];
            if (j10 > j11) {
                i10 = i11 + 1;
            } else {
                if (j10 >= j11) {
                    return i11;
                }
                length = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final int compareTo(long j10, long j11) {
        return AbstractC9979u.m20297j(j10, j11);
    }

    public static final void copyInto(long[] jArr, long[] jArr2) {
        AbstractC10964p.m24028u(jArr, jArr2, 0, 0, 0, 12, null);
    }

    public static final long div(long j10, int i10) {
        return j10 / i10;
    }

    public static final long first(long[] jArr) {
        return jArr[0];
    }

    public static final void forEach(long[] jArr, InterfaceC9540l interfaceC9540l) {
        for (long j10 : jArr) {
            interfaceC9540l.invoke(Long.valueOf(j10));
        }
    }

    public static final long get(long[] jArr, int i10) {
        return jArr[i10];
    }

    public static final int getSize(long[] jArr) {
        return jArr.length;
    }

    public static final long minus(long j10, int i10) {
        return j10 - i10;
    }

    public static final long plus(long j10, int i10) {
        return j10 + i10;
    }

    public static final void set(long[] jArr, int i10, long j10) {
        jArr[i10] = j10;
    }

    public static final long[] snapshotIdArrayOf(long j10) {
        return new long[]{j10};
    }

    public static final long[] snapshotIdArrayWithCapacity(int i10) {
        return new long[i10];
    }

    public static final long times(long j10, int i10) {
        return j10 * i10;
    }

    public static final int toInt(long j10) {
        return (int) j10;
    }

    public static final long toLong(long j10) {
        return j10;
    }

    public static final long toSnapshotId(int i10) {
        return i10;
    }

    public static final long[] withIdInsertedAt(long[] jArr, int i10, long j10) {
        int length = jArr.length;
        long[] jArr2 = new long[length + 1];
        AbstractC10964p.m24022o(jArr, jArr2, 0, 0, i10);
        AbstractC10964p.m24022o(jArr, jArr2, i10 + 1, i10, length);
        jArr2[i10] = j10;
        return jArr2;
    }

    public static final long[] withIdRemovedAt(long[] jArr, int i10) {
        int length = jArr.length;
        int i11 = length - 1;
        if (i11 == 0) {
            return null;
        }
        long[] jArr2 = new long[i11];
        if (i10 > 0) {
            AbstractC10964p.m24022o(jArr, jArr2, 0, 0, i10);
        }
        if (i10 < i11) {
            AbstractC10964p.m24022o(jArr, jArr2, i10, i10 + 1, length);
        }
        return jArr2;
    }

    public static final int compareTo(long j10, int i10) {
        return AbstractC9979u.m20297j(j10, i10);
    }

    public static final long minus(long j10, long j11) {
        return j10 - j11;
    }
}
