package p147rx.schedulers;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p147rx.Scheduler;
import p147rx.Subscription;
import p147rx.functions.Action0;
import p147rx.internal.schedulers.SchedulePeriodicHelper;
import p147rx.subscriptions.BooleanSubscription;
import p147rx.subscriptions.Subscriptions;

/* loaded from: classes2.dex */
public class TestScheduler extends Scheduler {
    static long counter;
    final Queue<TimedAction> queue = new PriorityQueue(11, new CompareActionsByTime());
    long time;

    static final class CompareActionsByTime implements Comparator<TimedAction> {
        CompareActionsByTime() {
        }

        @Override // java.util.Comparator
        public int compare(TimedAction timedAction, TimedAction timedAction2) {
            long j4 = timedAction.time;
            long j5 = timedAction2.time;
            if (j4 == j5) {
                if (timedAction.count < timedAction2.count) {
                    return -1;
                }
                return timedAction.count > timedAction2.count ? 1 : 0;
            }
            if (j4 < j5) {
                return -1;
            }
            return j4 > j5 ? 1 : 0;
        }
    }

    static final class TimedAction {
        final Action0 action;
        private final long count;
        final Scheduler.Worker scheduler;
        final long time;

        TimedAction(Scheduler.Worker worker, long j4, Action0 action0) {
            long j5 = TestScheduler.counter;
            TestScheduler.counter = 1 + j5;
            this.count = j5;
            this.time = j4;
            this.action = action0;
            this.scheduler = worker;
        }

        public String toString() {
            return String.format("TimedAction(time = %d, action = %s)", Long.valueOf(this.time), this.action.toString());
        }
    }

    public void advanceTimeBy(long j4, TimeUnit timeUnit) {
        advanceTimeTo(this.time + timeUnit.toNanos(j4), TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j4, TimeUnit timeUnit) {
        triggerActions(timeUnit.toNanos(j4));
    }

    @Override // p147rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new InnerTestScheduler();
    }

    @Override // p147rx.Scheduler
    public long now() {
        return TimeUnit.NANOSECONDS.toMillis(this.time);
    }

    public void triggerActions() {
        triggerActions(this.time);
    }

    private void triggerActions(long j4) {
        while (!this.queue.isEmpty()) {
            TimedAction timedActionPeek = this.queue.peek();
            long j5 = timedActionPeek.time;
            if (j5 > j4) {
                break;
            }
            if (j5 == 0) {
                j5 = this.time;
            }
            this.time = j5;
            this.queue.remove();
            if (!timedActionPeek.scheduler.isUnsubscribed()) {
                timedActionPeek.action.call();
            }
        }
        this.time = j4;
    }

    final class InnerTestScheduler extends Scheduler.Worker implements SchedulePeriodicHelper.NowNanoSupplier {

        /* renamed from: s */
        private final BooleanSubscription f11808s = new BooleanSubscription();

        InnerTestScheduler() {
        }

        @Override // p147rx.Subscription
        public boolean isUnsubscribed() {
            return this.f11808s.isUnsubscribed();
        }

        @Override // rx.Scheduler.Worker
        public long now() {
            return TestScheduler.this.now();
        }

        @Override // rx.internal.schedulers.SchedulePeriodicHelper.NowNanoSupplier
        public long nowNanos() {
            return TestScheduler.this.time;
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j4, TimeUnit timeUnit) {
            final TimedAction timedAction = new TimedAction(this, TestScheduler.this.time + timeUnit.toNanos(j4), action0);
            TestScheduler.this.queue.add(timedAction);
            return Subscriptions.create(new Action0() { // from class: rx.schedulers.TestScheduler.InnerTestScheduler.1
                @Override // p147rx.functions.Action0
                public void call() {
                    TestScheduler.this.queue.remove(timedAction);
                }
            });
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedulePeriodically(Action0 action0, long j4, long j5, TimeUnit timeUnit) {
            return SchedulePeriodicHelper.schedulePeriodically(this, action0, j4, j5, timeUnit, this);
        }

        @Override // p147rx.Subscription
        public void unsubscribe() {
            this.f11808s.unsubscribe();
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            final TimedAction timedAction = new TimedAction(this, 0L, action0);
            TestScheduler.this.queue.add(timedAction);
            return Subscriptions.create(new Action0() { // from class: rx.schedulers.TestScheduler.InnerTestScheduler.2
                @Override // p147rx.functions.Action0
                public void call() {
                    TestScheduler.this.queue.remove(timedAction);
                }
            });
        }
    }
}
