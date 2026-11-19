package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DeltaCounter {
    public static final int $stable = 8;
    private int count;

    public DeltaCounter() {
        this(0, 1, null);
    }

    public static /* synthetic */ DeltaCounter copy$default(DeltaCounter deltaCounter, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = deltaCounter.count;
        }
        return deltaCounter.copy(i10);
    }

    public final int component1() {
        return this.count;
    }

    public final DeltaCounter copy(int i10) {
        return new DeltaCounter(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeltaCounter) && this.count == ((DeltaCounter) obj).count;
    }

    public final int getCount() {
        return this.count;
    }

    public int hashCode() {
        return Integer.hashCode(this.count);
    }

    public final void plusAssign(int i10) {
        this.count += i10;
    }

    public final void setCount(int i10) {
        this.count = i10;
    }

    public String toString() {
        return "DeltaCounter(count=" + this.count + ')';
    }

    public DeltaCounter(int i10) {
        this.count = i10;
    }

    public /* synthetic */ DeltaCounter(int i10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
