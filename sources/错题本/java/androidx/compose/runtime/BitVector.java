package androidx.compose.runtime;

import android.support.v4.media.AbstractC0037f;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, m5110d2 = {"Landroidx/compose/runtime/BitVector;", "", "<init>", "()V", "", "index", "Lkotlin/Function1;", "", "valueSelector", "nextBit", "(ILr6/c;)I", "", "get", "(I)Z", "value", "Ld6/s;", "set", "(IZ)V", "nextSet", "(I)I", "nextClear", "start", "end", "setRange", "(II)V", "", "toString", "()Ljava/lang/String;", "first", "J", "second", "", "others", "[J", "getSize", "()I", "size", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/BitVector\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n1#1,3963:1\n3500#1,5:3967\n3505#1,27:3973\n3500#1,5:4000\n3505#1,27:4006\n3810#2:3964\n3810#2:3965\n3810#2:3966\n3580#2:3972\n3580#2:4005\n3580#2:4033\n3580#2:4034\n3580#2:4035\n3810#2:4036\n3810#2:4037\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/BitVector\n*L\n3490#1:3967,5\n3490#1:3973,27\n3492#1:4000,5\n3492#1:4006,27\n3467#1:3964\n3473#1:3965\n3487#1:3966\n3490#1:3972\n3492#1:4005\n3504#1:4033\n3510#1:4034\n3527#1:4035\n3544#1:4036\n3555#1:4037\n*E\n"})
/* loaded from: classes.dex */
public final class BitVector {
    public static final int $stable = 8;
    private long first;

    @NotNull
    private long[] others = SlotTableKt.EmptyLongArray;
    private long second;

    private final int nextBit(int index, InterfaceC6471c valueSelector) {
        int iNumberOfTrailingZeros;
        if (index < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros((((Number) valueSelector.invoke(Long.valueOf(this.first))).longValue() >>> index) << index)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (index < 128) {
            int i = index - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros((((Number) valueSelector.invoke(Long.valueOf(this.second))).longValue() >>> i) << i);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(index, 128);
        int i8 = (iMax / 64) - 2;
        long[] jArr = this.others;
        int length = jArr.length;
        for (int i9 = i8; i9 < length; i9++) {
            long jLongValue = ((Number) valueSelector.invoke(Long.valueOf(jArr[i9]))).longValue();
            if (i9 == i8) {
                int i10 = iMax % 64;
                jLongValue = (jLongValue >>> i10) << i10;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(jLongValue);
            if (iNumberOfTrailingZeros3 < 64) {
                return (i9 * 64) + 128 + iNumberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final boolean get(int index) {
        int i;
        if (index < 64) {
            return ((1 << index) & this.first) != 0;
        }
        if (index < 128) {
            return ((1 << (index - 64)) & this.second) != 0;
        }
        long[] jArr = this.others;
        int length = jArr.length;
        if (length != 0 && (index / 64) - 2 < length) {
            return ((1 << (index % 64)) & jArr[i]) != 0;
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
            int i = index - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(((~this.second) >>> i) << i);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(index, 128);
        int i8 = (iMax / 64) - 2;
        long[] jArr = this.others;
        int length = jArr.length;
        for (int i9 = i8; i9 < length; i9++) {
            long j7 = ~jArr[i9];
            if (i9 == i8) {
                int i10 = iMax % 64;
                j7 = (j7 >>> i10) << i10;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(j7);
            if (iNumberOfTrailingZeros3 < 64) {
                return (i9 * 64) + 128 + iNumberOfTrailingZeros3;
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
            int i = index - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros((this.second >>> i) << i);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(index, 128);
        int i8 = (iMax / 64) - 2;
        long[] jArr = this.others;
        int length = jArr.length;
        for (int i9 = i8; i9 < length; i9++) {
            long j7 = jArr[i9];
            if (i9 == i8) {
                int i10 = iMax % 64;
                j7 = (j7 >>> i10) << i10;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(j7);
            if (iNumberOfTrailingZeros3 < 64) {
                return (i9 * 64) + 128 + iNumberOfTrailingZeros3;
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
        int i = index / 64;
        int i8 = i - 2;
        int i9 = index % 64;
        long j7 = 1 << i9;
        long[] jArrCopyOf = this.others;
        if (i8 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i - 1);
            AbstractC5830k.m5329f(jArrCopyOf, "copyOf(...)");
            this.others = jArrCopyOf;
        }
        jArrCopyOf[i8] = ((value ? 1L : 0L) << i9) | ((~j7) & jArrCopyOf[i8]);
    }

    public final void setRange(int start, int end) {
        long j7 = start < end ? -1L : 0L;
        this.first = ((((start < 64 ? 1 : 0) * j7) >>> (64 - (Math.min(64, end) - start))) << start) | this.first;
        if (end > 64) {
            int iMax = Math.max(start, 64);
            this.second = (((j7 * (iMax < 128 ? 1 : 0)) >>> (128 - (Math.min(128, end) - iMax))) << iMax) | this.second;
            if (end > 128) {
                for (int iMax2 = Math.max(iMax, 128); iMax2 < end; iMax2++) {
                    set(iMax2, true);
                }
            }
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BitVector [");
        int size = getSize();
        boolean z8 = true;
        for (int i = 0; i < size; i++) {
            if (get(i)) {
                if (!z8) {
                    sb.append(", ");
                }
                sb.append(i);
                z8 = false;
            }
        }
        return AbstractC0037f.m80e(']', "toString(...)", sb);
    }
}
