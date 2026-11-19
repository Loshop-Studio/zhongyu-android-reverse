package androidx.compose.runtime.snapshots;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u00002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u0019\u0010\f\u001a\u00060\bj\u0002`\t2\n\u0010\r\u001a\u00060\u0001j\u0002`\u0002H\u0080\b\u001a\u0014\u0010\u000e\u001a\u00060\bj\u0002`\t2\u0006\u0010\u000f\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0005*\u00060\bj\u0002`\t2\n\u0010\r\u001a\u00060\u0001j\u0002`\u0002H\u0000\u001a\u001d\u0010\u0011\u001a\u00020\u0005*\u00060\u0001j\u0002`\u00022\n\u0010\u0012\u001a\u00060\u0001j\u0002`\u0002H\u0080\n\u001a\u0019\u0010\u0011\u001a\u00020\u0005*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0080\n\u001a\u001d\u0010\u0013\u001a\u00020\u0014*\u00060\bj\u0002`\t2\n\u0010\u0012\u001a\u00060\bj\u0002`\tH\u0080\b\u001a\u001d\u0010\u0015\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0080\n\u001a\u0015\u0010\u0016\u001a\u00060\u0001j\u0002`\u0002*\u00060\bj\u0002`\tH\u0080\b\u001a)\u0010\u0017\u001a\u00020\u0014*\u00060\bj\u0002`\t2\u0016\u0010\u0018\u001a\u0012\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0012\u0004\u0012\u00020\u00140\u0019H\u0080\b\u001a\u001d\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002*\u00060\bj\u0002`\t2\u0006\u0010\u001b\u001a\u00020\u0005H\u0080\n\u001a!\u0010\u001c\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\n\u0010\u0012\u001a\u00060\u0001j\u0002`\u0002H\u0080\n\u001a\u001d\u0010\u001c\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0080\n\u001a\u001d\u0010\u001d\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0080\n\u001a%\u0010\u001e\u001a\u00020\u0014*\u00060\bj\u0002`\t2\u0006\u0010\u001b\u001a\u00020\u00052\n\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002H\u0080\n\u001a\u001d\u0010 \u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0080\n\u001a\u0011\u0010!\u001a\u00020\u0005*\u00060\u0001j\u0002`\u0002H\u0086\b\u001a\u0011\u0010\"\u001a\u00020\u0001*\u00060\u0001j\u0002`\u0002H\u0086\b\u001a\u0010\u0010#\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0005H\u0000\u001a(\u0010$\u001a\u00060\bj\u0002`\t*\u00060\bj\u0002`\t2\u0006\u0010\u001b\u001a\u00020\u00052\n\u0010\r\u001a\u00060\u0001j\u0002`\u0002H\u0000\u001a \u0010%\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t*\u00060\bj\u0002`\t2\u0006\u0010\u001b\u001a\u00020\u0005H\u0000\"\u0012\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002X\u0080T¢\u0006\u0002\n\u0000\"\u0012\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u0012\u0010\u0006\u001a\u00060\u0001j\u0002`\u0002X\u0080T¢\u0006\u0002\n\u0000\"\u001d\u0010\u0007\u001a\u00020\u0005*\u00060\bj\u0002`\t8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b*\n\u0010&\"\u00020\u00012\u00020\u0001*\n\u0010'\"\u00020\b2\u00020\b¨\u0006("}, m13413d2 = {"SnapshotIdInvalidValue", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "SnapshotIdMax", "SnapshotIdSize", "", "SnapshotIdZero", "size", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "getSize", "([J)I", "snapshotIdArrayOf", "id", "snapshotIdArrayWithCapacity", "capacity", "binarySearch", "compareTo", "other", "copyInto", "", "div", "first", "forEach", "block", "Lkotlin/Function1;", "get", "index", "minus", "plus", "set", "value", "times", "toInt", "toLong", "toSnapshotId", "withIdInsertedAt", "withIdRemovedAt", "SnapshotId", "SnapshotIdArray", "runtime_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class SnapshotId_jvmKt {
    public static final long SnapshotIdInvalidValue = -1;
    public static final long SnapshotIdMax = Long.MAX_VALUE;
    public static final int SnapshotIdSize = 64;
    public static final long SnapshotIdZero = 0;

    public static final int binarySearch(long[] jArr, long j9) {
        int length = jArr.length - 1;
        int i9 = 0;
        while (i9 <= length) {
            int i10 = (i9 + length) >>> 1;
            long j10 = jArr[i10];
            if (j9 > j10) {
                i9 = i10 + 1;
            } else {
                if (j9 >= j10) {
                    return i10;
                }
                length = i10 - 1;
            }
        }
        return -(i9 + 1);
    }

    public static final int compareTo(long j9, long j10) {
        return Intrinsics.compare(j9, j10);
    }

    public static final void copyInto(long[] jArr, long[] jArr2) {
        ArraysKt.copyInto$default(jArr, jArr2, 0, 0, 0, 12, (Object) null);
    }

    public static final long div(long j9, int i9) {
        return j9 / i9;
    }

    public static final long first(long[] jArr) {
        return jArr[0];
    }

    public static final void forEach(long[] jArr, Function1<? super Long, Unit> function1) {
        for (long j9 : jArr) {
            function1.invoke(Long.valueOf(j9));
        }
    }

    public static final long get(long[] jArr, int i9) {
        return jArr[i9];
    }

    public static final int getSize(long[] jArr) {
        return jArr.length;
    }

    public static final long minus(long j9, int i9) {
        return j9 - i9;
    }

    public static final long plus(long j9, int i9) {
        return j9 + i9;
    }

    public static final void set(long[] jArr, int i9, long j9) {
        jArr[i9] = j9;
    }

    public static final long[] snapshotIdArrayOf(long j9) {
        return new long[]{j9};
    }

    public static final long[] snapshotIdArrayWithCapacity(int i9) {
        return new long[i9];
    }

    public static final long times(long j9, int i9) {
        return j9 * i9;
    }

    public static final int toInt(long j9) {
        return (int) j9;
    }

    public static final long toLong(long j9) {
        return j9;
    }

    public static final long toSnapshotId(int i9) {
        return i9;
    }

    public static final long[] withIdInsertedAt(long[] jArr, int i9, long j9) {
        int length = jArr.length;
        long[] jArr2 = new long[length + 1];
        ArraysKt.copyInto(jArr, jArr2, 0, 0, i9);
        ArraysKt.copyInto(jArr, jArr2, i9 + 1, i9, length);
        jArr2[i9] = j9;
        return jArr2;
    }

    public static final long[] withIdRemovedAt(long[] jArr, int i9) {
        int length = jArr.length;
        int i10 = length - 1;
        if (i10 == 0) {
            return null;
        }
        long[] jArr2 = new long[i10];
        if (i9 > 0) {
            ArraysKt.copyInto(jArr, jArr2, 0, 0, i9);
        }
        if (i9 < i10) {
            ArraysKt.copyInto(jArr, jArr2, i9, i9 + 1, length);
        }
        return jArr2;
    }

    public static final int compareTo(long j9, int i9) {
        return Intrinsics.compare(j9, i9);
    }

    public static final long minus(long j9, long j10) {
        return j9 - j10;
    }
}
