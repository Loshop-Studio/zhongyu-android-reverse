package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* loaded from: classes5.dex */
public final class ObservableRangeLong extends Observable<Long> {
    private final long count;
    private final long start;

    public static final class RangeDisposable extends BasicIntQueueDisposable<Long> {
        private static final long serialVersionUID = 396518478098735504L;
        final Observer<? super Long> downstream;
        final long end;
        boolean fused;
        long index;

        public RangeDisposable(Observer<? super Long> observer, long j9, long j10) {
            this.downstream = observer;
            this.index = j9;
            this.end = j10;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.index = this.end;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            set(1);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() != 0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.index == this.end;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i9) {
            if ((i9 & 1) == 0) {
                return 0;
            }
            this.fused = true;
            return 1;
        }

        public void run() {
            if (this.fused) {
                return;
            }
            Observer<? super Long> observer = this.downstream;
            long j9 = this.end;
            for (long j10 = this.index; j10 != j9 && get() == 0; j10++) {
                observer.onNext(Long.valueOf(j10));
            }
            if (get() == 0) {
                lazySet(1);
                observer.onComplete();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public Long poll() throws Exception {
            long j9 = this.index;
            if (j9 != this.end) {
                this.index = 1 + j9;
                return Long.valueOf(j9);
            }
            lazySet(1);
            return null;
        }
    }

    public ObservableRangeLong(long j9, long j10) {
        this.start = j9;
        this.count = j10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Long> observer) {
        long j9 = this.start;
        RangeDisposable rangeDisposable = new RangeDisposable(observer, j9, this.count + j9);
        observer.onSubscribe(rangeDisposable);
        rangeDisposable.run();
    }
}
