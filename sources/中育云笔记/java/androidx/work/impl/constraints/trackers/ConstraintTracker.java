package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class ConstraintTracker<T> {
    private final Context appContext;
    private T currentState;
    private final LinkedHashSet<ConstraintListener<T>> listeners;
    private final Object lock;
    private final TaskExecutor taskExecutor;

    public ConstraintTracker(Context context, TaskExecutor taskExecutor) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(taskExecutor, "taskExecutor");
        this.taskExecutor = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        AbstractC9979u.m20293f(applicationContext, "context.applicationContext");
        this.appContext = applicationContext;
        this.lock = new Object();
        this.listeners = new LinkedHashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_state_$lambda$4$lambda$3(List list, ConstraintTracker constraintTracker) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ConstraintListener) it.next()).onConstraintChanged(constraintTracker.currentState);
        }
    }

    public final void addListener(ConstraintListener<T> listener) {
        AbstractC9979u.m20294g(listener, "listener");
        synchronized (this.lock) {
            try {
                if (this.listeners.add(listener)) {
                    if (this.listeners.size() == 1) {
                        this.currentState = readSystemState();
                        Logger.get().debug(ConstraintTrackerKt.TAG, getClass().getSimpleName() + ": initial state = " + this.currentState);
                        startTracking();
                    }
                    listener.onConstraintChanged(this.currentState);
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Context getAppContext() {
        return this.appContext;
    }

    public final T getState() {
        T t10 = this.currentState;
        return t10 == null ? readSystemState() : t10;
    }

    public abstract T readSystemState();

    public final void removeListener(ConstraintListener<T> listener) {
        AbstractC9979u.m20294g(listener, "listener");
        synchronized (this.lock) {
            try {
                if (this.listeners.remove(listener) && this.listeners.isEmpty()) {
                    stopTracking();
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setState(T t10) {
        synchronized (this.lock) {
            T t11 = this.currentState;
            if (t11 == null || !AbstractC9979u.m20289b(t11, t10)) {
                this.currentState = t10;
                final List listM23922X0 = AbstractC10947g0.m23922X0(this.listeners);
                this.taskExecutor.getMainThreadExecutor().execute(new Runnable() { // from class: androidx.work.impl.constraints.trackers.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConstraintTracker._set_state_$lambda$4$lambda$3(listM23922X0, this);
                    }
                });
                C10786q c10786q = C10786q.f26013a;
            }
        }
    }

    public abstract void startTracking();

    public abstract void stopTracking();
}
