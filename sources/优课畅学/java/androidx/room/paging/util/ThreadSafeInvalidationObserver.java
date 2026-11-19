package androidx.room.paging.util;

import androidx.annotation.RestrictTo;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class ThreadSafeInvalidationObserver extends InvalidationTracker.Observer {
    private final InterfaceC10559a onInvalidated;
    private final AtomicBoolean registered;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadSafeInvalidationObserver(String[] tables, InterfaceC10559a onInvalidated) {
        super(tables);
        AbstractC9133u.m16133g(tables, "tables");
        AbstractC9133u.m16133g(onInvalidated, "onInvalidated");
        this.onInvalidated = onInvalidated;
        this.registered = new AtomicBoolean(false);
    }

    public final InterfaceC10559a getOnInvalidated() {
        return this.onInvalidated;
    }

    @Override // androidx.room.InvalidationTracker.Observer
    public void onInvalidated(Set<String> tables) {
        AbstractC9133u.m16133g(tables, "tables");
        this.onInvalidated.invoke();
    }

    public final void registerIfNecessary(RoomDatabase db) {
        AbstractC9133u.m16133g(db, "db");
        if (this.registered.compareAndSet(false, true)) {
            db.getInvalidationTracker().addWeakObserver(this);
        }
    }
}
