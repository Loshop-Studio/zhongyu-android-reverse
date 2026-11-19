package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0086\u0002J%\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0011H\u0082\bJ\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tJ\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\rH\u0086\u0002J\u0016\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tJ\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m13413d2 = {"Landroidx/compose/runtime/BitVector;", "", "()V", "first", "", "others", "", "second", "size", "", "getSize", "()I", "get", "", "index", "nextBit", "valueSelector", "Lkotlin/Function1;", "nextClear", "nextSet", "set", "", "value", "setRange", "start", "end", "toString", "", "runtime_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/BitVector\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n1#1,3963:1\n3500#1,5:3967\n3505#1,27:3973\n3500#1,5:4000\n3505#1,27:4006\n3810#2:3964\n3810#2:3965\n3810#2:3966\n3580#2:3972\n3580#2:4005\n3580#2:4033\n3580#2:4034\n3580#2:4035\n3810#2:4036\n3810#2:4037\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/BitVector\n*L\n3490#1:3967,5\n3490#1:3973,27\n3492#1:4000,5\n3492#1:4006,27\n3467#1:3964\n3473#1:3965\n3487#1:3966\n3490#1:3972\n3492#1:4005\n3504#1:4033\n3510#1:4034\n3527#1:4035\n3544#1:4036\n3555#1:4037\n*E\n"})
/* loaded from: classes2.dex */
public final class BitVector {
    public static final int $stable = 8;
    private long first;
    private long[] others = SlotTableKt.EmptyLongArray;
    private long second;

    private final int nextBit(int index, Function1<? super Long, Long> valueSelector) {
        int iNumberOfTrailingZeros;
        if (index < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros((valueSelector.invoke(Long.valueOf(this.first)).longValue() >>> index) << index)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (index < 128) {
            int i9 = index - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros((valueSelector.invoke(Long.valueOf(this.second)).longValue() >>> i9) << i9);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(index, 128);
        int i10 = (iMax / 64) - 2;
        long[] jArr = this.others;
        int length = jArr.length;
        for (int i11 = i10; i11 < length; i11++) {
            long jLongValue = valueSelector.invoke(Long.valueOf(jArr[i11])).longValue();
            if (i11 == i10) {
                int i12 = iMax % 64;
                jLongValue = (jLongValue >>> i12) << i12;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(jLongValue);
            if (iNumberOfTrailingZeros3 < 64) {
                return (i11 * 64) + 128 + iNumberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final boolean get(int index) {
        int i9;
        if (index < 64) {
            return ((1 << index) & this.first) != 0;
        }
        if (index < 128) {
            return ((1 << (index - 64)) & this.second) != 0;
        }
        long[] jArr = this.others;
        int length = jArr.length;
        if (length != 0 && (index / 64) - 2 < length) {
            return ((1 << (index % 64)) & jArr[i9]) != 0;
        }
        return false;
    }

    public final int getSize() {
        return (this.others.length + 2) * 64;
    }

    public final int nextClear(int index) {
        int iNumberOfTrailingZeros;
        if (index < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros(((~this.first) >>> index) << index)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (index < 128) {
            int i9 = index - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(((~this.second) >>> i9) << i9);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(index, 128);
        int i10 = (iMax / 64) - 2;
        long[] jArr = this.others;
        int length = jArr.length;
        for (int i11 = i10; i11 < length; i11++) {
            long j9 = ~jArr[i11];
            if (i11 == i10) {
                int i12 = iMax % 64;
                j9 = (j9 >>> i12) << i12;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(j9);
            if (iNumberOfTrailingZeros3 < 64) {
                return (i11 * 64) + 128 + iNumberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final int nextSet(int index) {
        int iNumberOfTrailingZeros;
        if (index < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros((this.first >>> index) << index)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (index < 128) {
            int i9 = index - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros((this.second >>> i9) << i9);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(index, 128);
        int i10 = (iMax / 64) - 2;
        long[] jArr = this.others;
        int length = jArr.length;
        for (int i11 = i10; i11 < length; i11++) {
            long j9 = jArr[i11];
            if (i11 == i10) {
                int i12 = iMax % 64;
                j9 = (j9 >>> i12) << i12;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(j9);
            if (iNumberOfTrailingZeros3 < 64) {
                return (i11 * 64) + 128 + iNumberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final void set(int index, boolean value) {
        if (index < 64) {
            this.first = ((value ? 1L : 0L) << index) | ((~(1 << index)) & this.first);
            return;
        }
        if (index < 128) {
            this.second = ((value ? 1L : 0L) << index) | ((~(1 << (index - 64))) & this.second);
            return;
        }
        int i9 = index / 64;
        int i10 = i9 - 2;
        int i11 = index % 64;
        long j9 = 1 << i11;
        long[] jArrCopyOf = this.others;
        if (i10 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i9 - 1);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.others = jArrCopyOf;
        }
        jArrCopyOf[i10] = ((value ? 1L : 0L) << i11) | ((~j9) & jArrCopyOf[i10]);
    }

    public final void setRange(int start, int end) {
        long j9 = start < end ? -1L : 0L;
        this.first = ((((start < 64 ? 1 : 0) * j9) >>> (64 - (Math.min(64, end) - start))) << start) | this.first;
        if (end > 64) {
            int iMax = Math.max(start, 64);
            this.second = (((j9 * (iMax < 128 ? 1 : 0)) >>> (128 - (Math.min(128, end) - iMax))) << iMax) | this.second;
            if (end > 128) {
                for (int iMax2 = Math.max(iMax, 128); iMax2 < end; iMax2++) {
                    set(iMax2, true);
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BitVector [");
        int size = getSize();
        boolean z9 = true;
        for (int i9 = 0; i9 < size; i9++) {
            if (get(i9)) {
                if (!z9) {
                    sb.append(", ");
                }
                sb.append(i9);
                z9 = false;
            }
        }
        sb.append(']');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
