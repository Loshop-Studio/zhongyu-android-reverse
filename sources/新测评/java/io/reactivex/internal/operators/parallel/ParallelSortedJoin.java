package io.reactivex.internal.operators.parallel;

import androidx.camera.view.AbstractC0920q;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class ParallelSortedJoin<T> extends Flowable<T> {
    final Comparator<? super T> comparator;
    final ParallelFlowable<List<T>> source;

    public static final class SortedJoinInnerSubscriber<T> extends AtomicReference<InterfaceC8990d> implements FlowableSubscriber<List<T>> {
        private static final long serialVersionUID = 6751017204873808094L;
        final int index;
        final SortedJoinSubscription<T> parent;

        public SortedJoinInnerSubscriber(SortedJoinSubscription<T> sortedJoinSubscription, int i10) {
            this.parent = sortedJoinSubscription;
            this.index = i10;
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            SubscriptionHelper.setOnce(this, interfaceC8990d, Long.MAX_VALUE);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(List<T> list) {
            this.parent.innerNext(list, this.index);
        }
    }

    public static final class SortedJoinSubscription<T> extends AtomicInteger implements InterfaceC8990d {
        private static final long serialVersionUID = 3481980673745556697L;
        volatile boolean cancelled;
        final Comparator<? super T> comparator;
        final InterfaceC8989c downstream;
        final int[] indexes;
        final List<T>[] lists;
        final SortedJoinInnerSubscriber<T>[] subscribers;
        final AtomicLong requested = new AtomicLong();
        final AtomicInteger remaining = new AtomicInteger();
        final AtomicReference<Throwable> error = new AtomicReference<>();

        public SortedJoinSubscription(InterfaceC8989c interfaceC8989c, int i10, Comparator<? super T> comparator) {
            this.downstream = interfaceC8989c;
            this.comparator = comparator;
            SortedJoinInnerSubscriber<T>[] sortedJoinInnerSubscriberArr = new SortedJoinInnerSubscriber[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                sortedJoinInnerSubscriberArr[i11] = new SortedJoinInnerSubscriber<>(this, i11);
            }
            this.subscribers = sortedJoinInnerSubscriberArr;
            this.lists = new List[i10];
            this.indexes = new int[i10];
            this.remaining.lazySet(i10);
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                Arrays.fill(this.lists, (Object) null);
            }
        }

        public void cancelAll() {
            for (SortedJoinInnerSubscriber<T> sortedJoinInnerSubscriber : this.subscribers) {
                sortedJoinInnerSubscriber.cancel();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x00a8, code lost:
        
            if (r11 != r7) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ac, code lost:
        
            if (r19.cancelled == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
        
            java.util.Arrays.fill(r3, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00b3, code lost:
        
            r5 = r19.error.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00bc, code lost:
        
            if (r5 == null) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00be, code lost:
        
            cancelAll();
            java.util.Arrays.fill(r3, (java.lang.Object) null);
            r2.onError(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00c7, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00c8, code lost:
        
            if (r14 >= r4) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00d2, code lost:
        
            if (r0[r14] == r3[r14].size()) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00d5, code lost:
        
            r14 = r14 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00d8, code lost:
        
            java.util.Arrays.fill(r3, (java.lang.Object) null);
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00df, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00e2, code lost:
        
            if (r11 == 0) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00eb, code lost:
        
            if (r7 == Long.MAX_VALUE) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00ed, code lost:
        
            r19.requested.addAndGet(-r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00f3, code lost:
        
            r5 = get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00f7, code lost:
        
            if (r5 != r6) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00f9, code lost:
        
            r5 = addAndGet(-r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00fe, code lost:
        
            if (r5 != 0) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void drain() {
            /*
                Method dump skipped, instructions count: 260
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelSortedJoin.SortedJoinSubscription.drain():void");
        }

        public void innerError(Throwable th) {
            if (AbstractC0920q.m1034a(this.error, null, th)) {
                drain();
            } else if (th != this.error.get()) {
                RxJavaPlugins.onError(th);
            }
        }

        public void innerNext(List<T> list, int i10) {
            this.lists[i10] = list;
            if (this.remaining.decrementAndGet() == 0) {
                drain();
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                if (this.remaining.get() == 0) {
                    drain();
                }
            }
        }
    }

    public ParallelSortedJoin(ParallelFlowable<List<T>> parallelFlowable, Comparator<? super T> comparator) {
        this.source = parallelFlowable;
        this.comparator = comparator;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        SortedJoinSubscription sortedJoinSubscription = new SortedJoinSubscription(interfaceC8989c, this.source.parallelism(), this.comparator);
        interfaceC8989c.onSubscribe(sortedJoinSubscription);
        this.source.subscribe(sortedJoinSubscription.subscribers);
    }
}
