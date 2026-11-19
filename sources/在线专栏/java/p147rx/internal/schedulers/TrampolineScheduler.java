package p147rx.internal.schedulers;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p147rx.Scheduler;
import p147rx.Subscription;
import p147rx.functions.Action0;
import p147rx.subscriptions.BooleanSubscription;
import p147rx.subscriptions.Subscriptions;

/* loaded from: classes2.dex */
public final class TrampolineScheduler extends Scheduler {
    public static final TrampolineScheduler INSTANCE = new TrampolineScheduler();

    static final class InnerCurrentThreadScheduler extends Scheduler.Worker {
        final AtomicInteger counter = new AtomicInteger();
        final PriorityBlockingQueue<TimedAction> queue = new PriorityBlockingQueue<>();
        private final BooleanSubscription innerSubscription = new BooleanSubscription();
        private final AtomicInteger wip = new AtomicInteger();

        InnerCurrentThreadScheduler() {
        }

        private Subscription enqueue(Action0 action0, long j4) {
            if (this.innerSubscription.isUnsubscribed()) {
                return Subscriptions.unsubscribed();
            }
            final TimedAction timedAction = new TimedAction(action0, Long.valueOf(j4), this.counter.incrementAndGet());
            this.queue.add(timedAction);
            if (this.wip.getAndIncrement() != 0) {
                return Subscriptions.create(new Action0() { // from class: rx.internal.schedulers.TrampolineScheduler.InnerCurrentThreadScheduler.1
                    @Override // p147rx.functions.Action0
                    public void call() {
                        InnerCurrentThreadScheduler.this.queue.remove(timedAction);
                    }
                });
            }
            do {
                TimedAction timedActionPoll = this.queue.poll();
                if (timedActionPoll != null) {
                    timedActionPoll.action.call();
                }
            } while (this.wip.decrementAndGet() > 0);
            return Subscriptions.unsubscribed();
        }

        @Override // p147rx.Subscription
        public boolean isUnsubscribed() {
            return this.innerSubscription.isUnsubscribed();
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            return enqueue(action0, now());
        }

        @Override // p147rx.Subscription
        public void unsubscribe() {
            this.innerSubscription.unsubscribe();
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j4, TimeUnit timeUnit) {
            long jNow = now() + timeUnit.toMillis(j4);
            return enqueue(new SleepingAction(action0, this, jNow), jNow);
        }
    }

    static final class TimedAction implements Comparable<TimedAction> {
        final Action0 action;
        final int count;
        final Long execTime;

        TimedAction(Action0 action0, Long l3, int i4) {
            this.action = action0;
            this.execTime = l3;
            this.count = i4;
        }

        @Override // java.lang.Comparable
        public int compareTo(TimedAction timedAction) {
            int iCompareTo = this.execTime.compareTo(timedAction.execTime);
            return iCompareTo == 0 ? TrampolineScheduler.compare(this.count, timedAction.count) : iCompareTo;
        }
    }

    private TrampolineScheduler() {
    }

    static int compare(int i4, int i5) {
        if (i4 < i5) {
            return -1;
        }
        return i4 == i5 ? 0 : 1;
    }

    @Override // p147rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new InnerCurrentThreadScheduler();
    }
}
