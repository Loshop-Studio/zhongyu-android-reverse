package io.reactivex.internal.operators.observable;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import p145q5.AbstractC6438i;
import p145q5.InterfaceC6436g;
import p159s5.InterfaceC6559b;
import p185v7.AbstractC6675d;
import p192w5.InterfaceC6720a;
import p192w5.InterfaceC6721b;
import p206y5.C6776a;

/* loaded from: classes.dex */
final class ObservableObserveOn$ObserveOnObserver<T> extends BasicIntQueueDisposable<T> implements InterfaceC6436g, Runnable {
    private static final long serialVersionUID = 6576896619930983584L;
    final int bufferSize;
    final boolean delayError;
    volatile boolean disposed;
    volatile boolean done;
    final InterfaceC6436g downstream;
    Throwable error;
    boolean outputFused;
    InterfaceC6721b queue;
    int sourceMode;
    InterfaceC6559b upstream;
    final AbstractC6438i worker;

    public ObservableObserveOn$ObserveOnObserver(InterfaceC6436g interfaceC6436g, AbstractC6438i abstractC6438i, boolean z8, int i) {
        this.downstream = interfaceC6436g;
        this.worker = abstractC6438i;
        this.delayError = z8;
        this.bufferSize = i;
    }

    public boolean checkTerminated(boolean z8, boolean z9, InterfaceC6436g interfaceC6436g) {
        if (this.disposed) {
            this.queue.clear();
            return true;
        }
        if (!z8) {
            return false;
        }
        Throwable th = this.error;
        if (this.delayError) {
            if (!z9) {
                return false;
            }
            this.disposed = true;
            if (th != null) {
                interfaceC6436g.onError(th);
            } else {
                interfaceC6436g.onComplete();
            }
            this.worker.dispose();
            return true;
        }
        if (th != null) {
            this.disposed = true;
            this.queue.clear();
            interfaceC6436g.onError(th);
            this.worker.dispose();
            return true;
        }
        if (!z9) {
            return false;
        }
        this.disposed = true;
        interfaceC6436g.onComplete();
        this.worker.dispose();
        return true;
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, p192w5.InterfaceC6721b
    public void clear() {
        this.queue.clear();
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, p159s5.InterfaceC6559b
    public void dispose() {
        if (this.disposed) {
            return;
        }
        this.disposed = true;
        this.upstream.dispose();
        this.worker.dispose();
        if (this.outputFused || getAndIncrement() != 0) {
            return;
        }
        this.queue.clear();
    }

    public void drainFused() {
        int iAddAndGet = 1;
        while (!this.disposed) {
            boolean z8 = this.done;
            Throwable th = this.error;
            if (!this.delayError && z8 && th != null) {
                this.disposed = true;
                this.downstream.onError(this.error);
                this.worker.dispose();
                return;
            }
            this.downstream.onNext(null);
            if (z8) {
                this.disposed = true;
                Throwable th2 = this.error;
                if (th2 != null) {
                    this.downstream.onError(th2);
                } else {
                    this.downstream.onComplete();
                }
                this.worker.dispose();
                return;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        r3 = addAndGet(-r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r3 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void drainNormal() {
        /*
            r7 = this;
            w5.b r0 = r7.queue
            q5.g r1 = r7.downstream
            r2 = 1
            r3 = r2
        L6:
            boolean r4 = r7.done
            boolean r5 = r0.isEmpty()
            boolean r4 = r7.checkTerminated(r4, r5, r1)
            if (r4 == 0) goto L13
            goto L2e
        L13:
            boolean r4 = r7.done
            java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L33
            if (r5 != 0) goto L1d
            r6 = r2
            goto L1e
        L1d:
            r6 = 0
        L1e:
            boolean r4 = r7.checkTerminated(r4, r6, r1)
            if (r4 == 0) goto L25
            goto L2e
        L25:
            if (r6 == 0) goto L2f
            int r3 = -r3
            int r3 = r7.addAndGet(r3)
            if (r3 != 0) goto L6
        L2e:
            return
        L2f:
            r1.onNext(r5)
            goto L13
        L33:
            r3 = move-exception
            p073h4.AbstractC5625a.m4956p(r3)
            r7.disposed = r2
            s5.b r2 = r7.upstream
            r2.dispose()
            r0.clear()
            r1.onError(r3)
            q5.i r0 = r7.worker
            r0.dispose()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableObserveOn$ObserveOnObserver.drainNormal():void");
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable
    public boolean isDisposed() {
        return this.disposed;
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, p192w5.InterfaceC6721b
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    @Override // p145q5.InterfaceC6436g
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        schedule();
    }

    @Override // p145q5.InterfaceC6436g
    public void onError(Throwable th) {
        if (this.done) {
            AbstractC6675d.m6351q(th);
            return;
        }
        this.error = th;
        this.done = true;
        schedule();
    }

    @Override // p145q5.InterfaceC6436g
    public void onNext(T t8) {
        if (this.done) {
            return;
        }
        if (this.sourceMode != 2) {
            this.queue.offer(t8);
        }
        schedule();
    }

    @Override // p145q5.InterfaceC6436g
    public void onSubscribe(InterfaceC6559b interfaceC6559b) {
        if (DisposableHelper.validate(this.upstream, interfaceC6559b)) {
            this.upstream = interfaceC6559b;
            if (interfaceC6559b instanceof InterfaceC6720a) {
                InterfaceC6720a interfaceC6720a = (InterfaceC6720a) interfaceC6559b;
                int iRequestFusion = interfaceC6720a.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.sourceMode = iRequestFusion;
                    this.queue = interfaceC6720a;
                    this.done = true;
                    this.downstream.onSubscribe(this);
                    schedule();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.sourceMode = iRequestFusion;
                    this.queue = interfaceC6720a;
                    this.downstream.onSubscribe(this);
                    return;
                }
            }
            this.queue = new C6776a(this.bufferSize);
            this.downstream.onSubscribe(this);
        }
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, p192w5.InterfaceC6721b
    @Nullable
    public T poll() throws Exception {
        return (T) this.queue.poll();
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, p192w5.InterfaceC6720a
    public int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.outputFused = true;
        return 2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.outputFused) {
            drainFused();
        } else {
            drainNormal();
        }
    }

    public void schedule() {
        if (getAndIncrement() == 0) {
            this.worker.mo5085b(this);
        }
    }
}
