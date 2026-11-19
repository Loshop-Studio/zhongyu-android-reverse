package androidx.room.paging.util;

import androidx.annotation.RestrictTo;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class ThreadSafeInvalidationObserver extends InvalidationTracker.Observer {
    private final InterfaceC9529a onInvalidated;
    private final AtomicBoolean registered;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadSafeInvalidationObserver(String[] tables, InterfaceC9529a onInvalidated) {
        super(tables);
        AbstractC9979u.m20294g(tables, "tables");
        AbstractC9979u.m20294g(onInvalidated, "onInvalidated");
        this.onInvalidated = onInvalidated;
        this.registered = new AtomicBoolean(false);
    }

    public final InterfaceC9529a getOnInvalidated() {
        return this.onInvalidated;
    }

    @Override // androidx.room.InvalidationTracker.Observer
    public void onInvalidated(Set<String> tables) {
        AbstractC9979u.m20294g(tables, "tables");
        this.onInvalidated.invoke();
    }

    public final void registerIfNecessary(RoomDatabase db2) {
        AbstractC9979u.m20294g(db2, "db");
        if (this.registered.compareAndSet(false, true)) {
            db2.getInvalidationTracker().addWeakObserver(this);
        }
    }
}
