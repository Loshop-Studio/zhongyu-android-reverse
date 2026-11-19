package p147rx.android.schedulers;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p147rx.Scheduler;
import p147rx.Subscription;
import p147rx.android.plugins.RxAndroidPlugins;
import p147rx.functions.Action0;
import p147rx.internal.schedulers.ScheduledAction;
import p147rx.subscriptions.CompositeSubscription;
import p147rx.subscriptions.Subscriptions;

/* loaded from: classes.dex */
public final class HandlerScheduler extends Scheduler {
    private final Handler handler;

    HandlerScheduler(Handler handler) {
        this.handler = handler;
    }

    public static HandlerScheduler from(Handler handler) {
        Objects.requireNonNull(handler, "handler == null");
        return new HandlerScheduler(handler);
    }

    @Override // p147rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new HandlerWorker(this.handler);
    }

    static class HandlerWorker extends Scheduler.Worker {
        private final CompositeSubscription compositeSubscription = new CompositeSubscription();
        private final Handler handler;

        HandlerWorker(Handler handler) {
            this.handler = handler;
        }

        @Override // p147rx.Subscription
        public boolean isUnsubscribed() {
            return this.compositeSubscription.isUnsubscribed();
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j4, TimeUnit timeUnit) {
            if (this.compositeSubscription.isUnsubscribed()) {
                return Subscriptions.unsubscribed();
            }
            final ScheduledAction scheduledAction = new ScheduledAction(RxAndroidPlugins.getInstance().getSchedulersHook().onSchedule(action0));
            scheduledAction.addParent(this.compositeSubscription);
            this.compositeSubscription.add(scheduledAction);
            this.handler.postDelayed(scheduledAction, timeUnit.toMillis(j4));
            scheduledAction.add(Subscriptions.create(new Action0() { // from class: rx.android.schedulers.HandlerScheduler.HandlerWorker.1
                @Override // p147rx.functions.Action0
                public void call() {
                    HandlerWorker.this.handler.removeCallbacks(scheduledAction);
                }
            }));
            return scheduledAction;
        }

        @Override // p147rx.Subscription
        public void unsubscribe() {
            this.compositeSubscription.unsubscribe();
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            return schedule(action0, 0L, TimeUnit.MILLISECONDS);
        }
    }
}
