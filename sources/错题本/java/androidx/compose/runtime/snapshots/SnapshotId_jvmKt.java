package androidx.compose.runtime.snapshots;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000.\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\u001a$\u0010\u0004\u001a\u00020\u0003*\u00060\u0000j\u0002`\u00012\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0080\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a \u0010\u0004\u001a\u00020\u0003*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\n¢\u0006\u0004\b\u0004\u0010\u0006\u001a$\u0010\u0007\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\n¢\u0006\u0004\b\u0007\u0010\b\u001a(\u0010\t\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0080\n¢\u0006\u0004\b\t\u0010\n\u001a$\u0010\t\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\n¢\u0006\u0004\b\t\u0010\b\u001a$\u0010\u000b\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\n¢\u0006\u0004\b\u000b\u0010\b\u001a$\u0010\f\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\n¢\u0006\u0004\b\f\u0010\b\u001a\u0018\u0010\r\u001a\u00020\u0003*\u00060\u0000j\u0002`\u0001H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0018\u0010\u000f\u001a\u00020\u0000*\u00060\u0000j\u0002`\u0001H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010\u0011\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a$\u0010\u0017\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0016\u001a\u00020\u0003H\u0080\n¢\u0006\u0004\b\u0017\u0010\u0018\u001a,\u0010\u001b\u001a\u00020\u001a*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0016\u001a\u00020\u00032\n\u0010\u0019\u001a\u00060\u0000j\u0002`\u0001H\u0080\n¢\u0006\u0004\b\u001b\u0010\u001c\u001a$\u0010\u001d\u001a\u00020\u001a*\u00060\u0012j\u0002`\u00132\n\u0010\u0002\u001a\u00060\u0012j\u0002`\u0013H\u0080\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001c\u0010\u001f\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0012j\u0002`\u0013H\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010\"\u001a\u00020\u0003*\u00060\u0012j\u0002`\u00132\n\u0010!\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\"\u0010#\u001a0\u0010&\u001a\u00020\u001a*\u00060\u0012j\u0002`\u00132\u0016\u0010%\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0001\u0012\u0004\u0012\u00020\u001a0$H\u0080\b¢\u0006\u0004\b&\u0010'\u001a/\u0010(\u001a\u00060\u0012j\u0002`\u0013*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0016\u001a\u00020\u00032\n\u0010!\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b(\u0010)\u001a'\u0010*\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0016\u001a\u00020\u0003H\u0000¢\u0006\u0004\b*\u0010+\u001a \u0010,\u001a\u00060\u0012j\u0002`\u00132\n\u0010!\u001a\u00060\u0000j\u0002`\u0001H\u0080\b¢\u0006\u0004\b,\u0010-\u001a\u0017\u0010.\u001a\u00060\u0000j\u0002`\u0001*\u00020\u0003H\u0000¢\u0006\u0004\b.\u0010/\"\u0018\u00100\u001a\u00060\u0000j\u0002`\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u00101\"\u0018\u00102\u001a\u00060\u0000j\u0002`\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u00101\"\u0014\u00103\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u00104\"\u0018\u00105\u001a\u00060\u0000j\u0002`\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u00101\"\u001d\u00108\u001a\u00020\u0003*\u00060\u0012j\u0002`\u00138À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107*\n\u00109\"\u00020\u00002\u00020\u0000*\n\u0010:\"\u00020\u00122\u00020\u0012¨\u0006;"}, m5110d2 = {"", "Landroidx/compose/runtime/snapshots/SnapshotId;", "other", "", "compareTo", "(JJ)I", "(JI)I", "plus", "(JI)J", "minus", "(JJ)J", "div", "times", "toInt", "(J)I", "toLong", "(J)J", "capacity", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "snapshotIdArrayWithCapacity", "(I)[J", "index", "get", "([JI)J", "value", "Ld6/s;", "set", "([JIJ)V", "copyInto", "([J[J)V", "first", "([J)J", "id", "binarySearch", "([JJ)I", "Lkotlin/Function1;", "block", "forEach", "([JLr6/c;)V", "withIdInsertedAt", "([JIJ)[J", "withIdRemovedAt", "([JI)[J", "snapshotIdArrayOf", "(J)[J", "toSnapshotId", "(I)J", "SnapshotIdZero", "J", "SnapshotIdMax", "SnapshotIdSize", "I", "SnapshotIdInvalidValue", "getSize", "([J)I", "size", "SnapshotId", "SnapshotIdArray", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SnapshotId_jvmKt {
    public static final long SnapshotIdInvalidValue = -1;
    public static final long SnapshotIdMax = Long.MAX_VALUE;
    public static final int SnapshotIdSize = 64;
    public static final long SnapshotIdZero = 0;

    public static final int binarySearch(@NotNull long[] jArr, long j7) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i8 = (i + length) >>> 1;
            long j8 = jArr[i8];
            if (j7 > j8) {
                i = i8 + 1;
            } else {
                if (j7 >= j8) {
                    return i8;
                }
                length = i8 - 1;
            }
        }
        return -(i + 1);
    }

    public static final int compareTo(long j7, long j8) {
        return AbstractC5830k.m5333j(j7, j8);
    }

    public static final void copyInto(@NotNull long[] jArr, @NotNull long[] jArr2) {
        AbstractC5802q.m5177D(jArr, jArr2, 0, 0, jArr.length);
    }

    public static final long div(long j7, int i) {
        return j7 / i;
    }

    public static final long first(@NotNull long[] jArr) {
        return jArr[0];
    }

    public static final void forEach(@NotNull long[] jArr, @NotNull InterfaceC6471c interfaceC6471c) {
        for (long j7 : jArr) {
            interfaceC6471c.invoke(Long.valueOf(j7));
        }
    }

    public static final long get(@NotNull long[] jArr, int i) {
        return jArr[i];
    }

    public static final int getSize(@NotNull long[] jArr) {
        return jArr.length;
    }

    public static final long minus(long j7, int i) {
        return j7 - i;
    }

    public static final long plus(long j7, int i) {
        return j7 + i;
    }

    public static final void set(@NotNull long[] jArr, int i, long j7) {
        jArr[i] = j7;
    }

    @NotNull
    public static final long[] snapshotIdArrayOf(long j7) {
        return new long[]{j7};
    }

    @NotNull
    public static final long[] snapshotIdArrayWithCapacity(int i) {
        return new long[i];
    }

    public static final long times(long j7, int i) {
        return j7 * i;
    }

    public static final int toInt(long j7) {
        return (int) j7;
    }

    public static final long toLong(long j7) {
        return j7;
    }

    public static final long toSnapshotId(int i) {
        return i;
    }

    @NotNull
    public static final long[] withIdInsertedAt(@NotNull long[] jArr, int i, long j7) {
        int length = jArr.length;
        long[] jArr2 = new long[length + 1];
        AbstractC5802q.m5177D(jArr, jArr2, 0, 0, i);
        AbstractC5802q.m5177D(jArr, jArr2, i + 1, i, length);
        jArr2[i] = j7;
        return jArr2;
    }

    @Nullable
    public static final long[] withIdRemovedAt(@NotNull long[] jArr, int i) {
        int length = jArr.length;
        int i8 = length - 1;
        if (i8 == 0) {
            return null;
        }
        long[] jArr2 = new long[i8];
        if (i > 0) {
            AbstractC5802q.m5177D(jArr, jArr2, 0, 0, i);
        }
        if (i < i8) {
            AbstractC5802q.m5177D(jArr, jArr2, i, i + 1, length);
        }
        return jArr2;
    }

    public static final int compareTo(long j7, int i) {
        return AbstractC5830k.m5333j(j7, i);
    }

    public static final long minus(long j7, long j8) {
        return j7 - j8;
    }
}
