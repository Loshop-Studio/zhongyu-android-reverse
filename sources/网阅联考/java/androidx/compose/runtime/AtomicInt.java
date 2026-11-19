package androidx.compose.runtime;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata(m5174d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003J\u0006\u0010\u000b\u001a\u00020\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m5175d2 = {"Landroidx/compose/runtime/AtomicInt;", "", "value", "", "(I)V", "delegate", "Ljava/util/concurrent/atomic/AtomicInteger;", "getDelegate", "()Ljava/util/concurrent/atomic/AtomicInteger;", "add", "amount", "get", "set", "", "runtime_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AtomicInt {
    private final AtomicInteger delegate;

    public AtomicInt(int i4) {
        this.delegate = new AtomicInteger(i4);
    }

    public final int add(int amount) {
        return this.delegate.addAndGet(amount);
    }

    public final int get() {
        return this.delegate.get();
    }

    public final AtomicInteger getDelegate() {
        return this.delegate;
    }

    public final void set(int value) {
        this.delegate.set(value);
    }
}
