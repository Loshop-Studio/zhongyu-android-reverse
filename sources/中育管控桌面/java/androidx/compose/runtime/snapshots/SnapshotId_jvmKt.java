package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7879d1 = {"\u00002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u0019\u0010\f\u001a\u00060\bj\u0002`\t2\n\u0010\r\u001a\u00060\u0001j\u0002`\u0002H\u0080\b\u001a\u0014\u0010\u000e\u001a\u00060\bj\u0002`\t2\u0006\u0010\u000f\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0005*\u00060\bj\u0002`\t2\n\u0010\r\u001a\u00060\u0001j\u0002`\u0002H\u0000\u001a\u001d\u0010\u0011\u001a\u00020\u0005*\u00060\u0001j\u0002`\u00022\n\u0010\u0012\u001a\u00060\u0001j\u0002`\u0002H\u0080\n\u001a\u0019\u0010\u0011\u001a\u00020\u0005*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0080\n\u001a\u001d\u0010\u0013\u001a\u00020\u0014*\u00060\bj\u0002`\t2\n\u0010\u0012\u001a\u00060\bj\u0002`\tH\u0080\b\u001a\u001d\u0010\u0015\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0080\n\u001a\u0015\u0010\u0016\u001a\u00060\u0001j\u0002`\u0002*\u00060\bj\u0002`\tH\u0080\b\u001a)\u0010\u0017\u001a\u00020\u0014*\u00060\bj\u0002`\t2\u0016\u0010\u0018\u001a\u0012\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0012\u0004\u0012\u00020\u00140\u0019H\u0080\b\u001a\u001d\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002*\u00060\bj\u0002`\t2\u0006\u0010\u001b\u001a\u00020\u0005H\u0080\n\u001a!\u0010\u001c\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\n\u0010\u0012\u001a\u00060\u0001j\u0002`\u0002H\u0080\n\u001a\u001d\u0010\u001c\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0080\n\u001a\u001d\u0010\u001d\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0080\n\u001a%\u0010\u001e\u001a\u00020\u0014*\u00060\bj\u0002`\t2\u0006\u0010\u001b\u001a\u00020\u00052\n\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002H\u0080\n\u001a\u001d\u0010 \u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0080\n\u001a\u0011\u0010!\u001a\u00020\u0005*\u00060\u0001j\u0002`\u0002H\u0086\b\u001a\u0011\u0010\"\u001a\u00020\u0001*\u00060\u0001j\u0002`\u0002H\u0086\b\u001a\u0010\u0010#\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0005H\u0000\u001a(\u0010$\u001a\u00060\bj\u0002`\t*\u00060\bj\u0002`\t2\u0006\u0010\u001b\u001a\u00020\u00052\n\u0010\r\u001a\u00060\u0001j\u0002`\u0002H\u0000\u001a \u0010%\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t*\u00060\bj\u0002`\t2\u0006\u0010\u001b\u001a\u00020\u0005H\u0000\"\u0012\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002X\u0080T¢\u0006\u0002\n\u0000\"\u0012\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u0012\u0010\u0006\u001a\u00060\u0001j\u0002`\u0002X\u0080T¢\u0006\u0002\n\u0000\"\u001d\u0010\u0007\u001a\u00020\u0005*\u00060\bj\u0002`\t8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b*\n\u0010&\"\u00020\u00012\u00020\u0001*\n\u0010'\"\u00020\b2\u00020\b¨\u0006("}, m7880d2 = {"SnapshotIdInvalidValue", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "SnapshotIdMax", "SnapshotIdSize", "", "SnapshotIdZero", "size", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "getSize", "([J)I", "snapshotIdArrayOf", "id", "snapshotIdArrayWithCapacity", "capacity", "binarySearch", "compareTo", "other", "copyInto", "", "div", "first", "forEach", "block", "Lkotlin/Function1;", "get", "index", "minus", "plus", "set", "value", "times", "toInt", "toLong", "toSnapshotId", "withIdInsertedAt", "withIdRemovedAt", "SnapshotId", "SnapshotIdArray", "runtime_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class SnapshotId_jvmKt {
    public static final long SnapshotIdInvalidValue = -1;
    public static final long SnapshotIdMax = Long.MAX_VALUE;
    public static final int SnapshotIdSize = 64;
    public static final long SnapshotIdZero = 0;

    public static final int binarySearch(long[] jArr, long j6) {
        int length = jArr.length - 1;
        int i6 = 0;
        while (i6 <= length) {
            int i7 = (i6 + length) >>> 1;
            long j7 = jArr[i7];
            if (j6 > j7) {
                i6 = i7 + 1;
            } else {
                if (j6 >= j7) {
                    return i7;
                }
                length = i7 - 1;
            }
        }
        return -(i6 + 1);
    }

    public static final int compareTo(long j6, long j7) {
        return Intrinsics.compare(j6, j7);
    }

    public static final void copyInto(long[] jArr, long[] jArr2) {
        ArraysKt.copyInto$default(jArr, jArr2, 0, 0, 0, 12, (Object) null);
    }

    public static final long div(long j6, int i6) {
        return j6 / i6;
    }

    public static final long first(long[] jArr) {
        return jArr[0];
    }

    public static final void forEach(long[] jArr, Function1<? super Long, Unit> function1) {
        for (long j6 : jArr) {
            function1.invoke(Long.valueOf(j6));
        }
    }

    public static final long get(long[] jArr, int i6) {
        return jArr[i6];
    }

    public static final int getSize(long[] jArr) {
        return jArr.length;
    }

    public static final long minus(long j6, int i6) {
        return j6 - i6;
    }

    public static final long plus(long j6, int i6) {
        return j6 + i6;
    }

    public static final void set(long[] jArr, int i6, long j6) {
        jArr[i6] = j6;
    }

    public static final long[] snapshotIdArrayOf(long j6) {
        return new long[]{j6};
    }

    public static final long[] snapshotIdArrayWithCapacity(int i6) {
        return new long[i6];
    }

    public static final long times(long j6, int i6) {
        return j6 * i6;
    }

    public static final int toInt(long j6) {
        return (int) j6;
    }

    public static final long toLong(long j6) {
        return j6;
    }

    public static final long toSnapshotId(int i6) {
        return i6;
    }

    public static final long[] withIdInsertedAt(long[] jArr, int i6, long j6) {
        int length = jArr.length;
        long[] jArr2 = new long[length + 1];
        ArraysKt.copyInto(jArr, jArr2, 0, 0, i6);
        ArraysKt.copyInto(jArr, jArr2, i6 + 1, i6, length);
        jArr2[i6] = j6;
        return jArr2;
    }

    public static final long[] withIdRemovedAt(long[] jArr, int i6) {
        int length = jArr.length;
        int i7 = length - 1;
        if (i7 == 0) {
            return null;
        }
        long[] jArr2 = new long[i7];
        if (i6 > 0) {
            ArraysKt.copyInto(jArr, jArr2, 0, 0, i6);
        }
        if (i6 < i7) {
            ArraysKt.copyInto(jArr, jArr2, i6, i6 + 1, length);
        }
        return jArr2;
    }

    public static final int compareTo(long j6, int i6) {
        return Intrinsics.compare(j6, i6);
    }

    public static final long minus(long j6, long j7) {
        return j6 - j7;
    }
}
