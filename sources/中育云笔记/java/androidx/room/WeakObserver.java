package androidx.room;

import androidx.room.InvalidationTracker;
import java.lang.ref.WeakReference;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class WeakObserver extends InvalidationTracker.Observer {
    private final WeakReference<InvalidationTracker.Observer> delegateRef;
    private final InvalidationTracker tracker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeakObserver(InvalidationTracker tracker, InvalidationTracker.Observer delegate) {
        super(delegate.getTables$room_runtime_release());
        AbstractC9979u.m20294g(tracker, "tracker");
        AbstractC9979u.m20294g(delegate, "delegate");
        this.tracker = tracker;
        this.delegateRef = new WeakReference<>(delegate);
    }

    @Override // androidx.room.InvalidationTracker.Observer
    public void onInvalidated(Set<String> tables) {
        AbstractC9979u.m20294g(tables, "tables");
        InvalidationTracker.Observer observer = this.delegateRef.get();
        if (observer == null) {
            this.tracker.removeObserver(this);
        } else {
            observer.onInvalidated(tables);
        }
    }
}
