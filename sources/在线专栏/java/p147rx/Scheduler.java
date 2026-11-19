package p147rx;

import java.util.concurrent.TimeUnit;
import p147rx.functions.Action0;
import p147rx.functions.Func1;
import p147rx.internal.schedulers.SchedulePeriodicHelper;
import p147rx.internal.schedulers.SchedulerWhen;

/* loaded from: classes.dex */
public abstract class Scheduler {

    public static abstract class Worker implements Subscription {
        public long now() {
            return System.currentTimeMillis();
        }

        public abstract Subscription schedule(Action0 action0);

        public abstract Subscription schedule(Action0 action0, long j4, TimeUnit timeUnit);

        public Subscription schedulePeriodically(Action0 action0, long j4, long j5, TimeUnit timeUnit) {
            return SchedulePeriodicHelper.schedulePeriodically(this, action0, j4, j5, timeUnit, null);
        }
    }

    public abstract Worker createWorker();

    public long now() {
        return System.currentTimeMillis();
    }

    public <S extends Scheduler & Subscription> S when(Func1<Observable<Observable<Completable>>, Completable> func1) {
        return new SchedulerWhen(func1, this);
    }
}
