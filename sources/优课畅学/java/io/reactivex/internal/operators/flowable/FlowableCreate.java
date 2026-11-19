package io.reactivex.internal.operators.flowable;

import ba.InterfaceC5218b;
import ba.InterfaceC5219c;
import io.reactivex.BackpressureStrategy;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p038c7.C5273a;
import p088e7.AbstractC8368a;
import p100f7.AbstractC8462a;
import p244s6.AbstractC10045b;
import p244s6.InterfaceC10046c;
import p244s6.InterfaceC10047d;
import p288w6.AbstractC10359a;

/* loaded from: classes5.dex */
public final class FlowableCreate extends AbstractC10045b {

    /* renamed from: b */
    public final InterfaceC10047d f17038b;

    /* renamed from: c */
    public final BackpressureStrategy f17039c;

    public static abstract class BaseEmitter<T> extends AtomicLong implements InterfaceC10046c, InterfaceC5219c {

        /* renamed from: a */
        public final InterfaceC5218b f17040a;

        /* renamed from: b */
        public final SequentialDisposable f17041b = new SequentialDisposable();

        public BaseEmitter(InterfaceC5218b interfaceC5218b) {
            this.f17040a = interfaceC5218b;
        }

        /* renamed from: a */
        public void m15537a() {
            if (m15539c()) {
                return;
            }
            try {
                this.f17040a.onComplete();
            } finally {
                this.f17041b.dispose();
            }
        }

        /* renamed from: b */
        public boolean m15538b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (m15539c()) {
                return false;
            }
            try {
                this.f17040a.onError(th);
                this.f17041b.dispose();
                return true;
            } catch (Throwable th2) {
                this.f17041b.dispose();
                throw th2;
            }
        }

        /* renamed from: c */
        public final boolean m15539c() {
            return this.f17041b.isDisposed();
        }

        @Override // ba.InterfaceC5219c
        public final void cancel() {
            this.f17041b.dispose();
            mo15541e();
        }

        /* renamed from: d */
        public void mo15540d() {
        }

        /* renamed from: e */
        public void mo15541e() {
        }

        /* renamed from: g */
        public boolean mo15542g(Throwable th) {
            return m15538b(th);
        }

        @Override // p244s6.InterfaceC10044a
        public void onComplete() {
            m15537a();
        }

        @Override // p244s6.InterfaceC10044a
        public final void onError(Throwable th) {
            if (mo15542g(th)) {
                return;
            }
            AbstractC8462a.m13801k(th);
        }

        @Override // ba.InterfaceC5219c
        public final void request(long j10) {
            if (SubscriptionHelper.m15574g(j10)) {
                AbstractC8368a.m13654a(this, j10);
                mo15540d();
            }
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }

    public static final class BufferAsyncEmitter<T> extends BaseEmitter<T> {

        /* renamed from: c */
        public final C5273a f17042c;

        /* renamed from: d */
        public Throwable f17043d;

        /* renamed from: e */
        public volatile boolean f17044e;

        /* renamed from: f */
        public final AtomicInteger f17045f;

        public BufferAsyncEmitter(InterfaceC5218b interfaceC5218b, int i10) {
            super(interfaceC5218b);
            this.f17042c = new C5273a(i10);
            this.f17045f = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        /* renamed from: d */
        public void mo15540d() {
            m15543h();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        /* renamed from: e */
        public void mo15541e() {
            if (this.f17045f.getAndIncrement() == 0) {
                this.f17042c.clear();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        /* renamed from: g */
        public boolean mo15542g(Throwable th) {
            if (this.f17044e || m15539c()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f17043d = th;
            this.f17044e = true;
            m15543h();
            return true;
        }

        /* renamed from: h */
        public void m15543h() {
            if (this.f17045f.getAndIncrement() != 0) {
                return;
            }
            InterfaceC5218b interfaceC5218b = this.f17040a;
            C5273a c5273a = this.f17042c;
            int iAddAndGet = 1;
            do {
                long j10 = get();
                long j11 = 0;
                while (j11 != j10) {
                    if (m15539c()) {
                        c5273a.clear();
                        return;
                    }
                    boolean z10 = this.f17044e;
                    Object objPoll = c5273a.poll();
                    boolean z11 = objPoll == null;
                    if (z10 && z11) {
                        Throwable th = this.f17043d;
                        if (th != null) {
                            m15538b(th);
                            return;
                        } else {
                            m15537a();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    interfaceC5218b.onNext(objPoll);
                    j11++;
                }
                if (j11 == j10) {
                    if (m15539c()) {
                        c5273a.clear();
                        return;
                    }
                    boolean z12 = this.f17044e;
                    boolean zIsEmpty = c5273a.isEmpty();
                    if (z12 && zIsEmpty) {
                        Throwable th2 = this.f17043d;
                        if (th2 != null) {
                            m15538b(th2);
                            return;
                        } else {
                            m15537a();
                            return;
                        }
                    }
                }
                if (j11 != 0) {
                    AbstractC8368a.m13656c(this, j11);
                }
                iAddAndGet = this.f17045f.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, p244s6.InterfaceC10044a
        public void onComplete() {
            this.f17044e = true;
            m15543h();
        }

        @Override // p244s6.InterfaceC10044a
        public void onNext(Object obj) {
            if (this.f17044e || m15539c()) {
                return;
            }
            if (obj == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f17042c.offer(obj);
                m15543h();
            }
        }
    }

    public static final class DropAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        public DropAsyncEmitter(InterfaceC5218b interfaceC5218b) {
            super(interfaceC5218b);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        /* renamed from: h */
        public void mo15544h() {
        }
    }

    public static final class ErrorAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        public ErrorAsyncEmitter(InterfaceC5218b interfaceC5218b) {
            super(interfaceC5218b);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        /* renamed from: h */
        public void mo15544h() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    public static final class LatestAsyncEmitter<T> extends BaseEmitter<T> {

        /* renamed from: c */
        public final AtomicReference f17046c;

        /* renamed from: d */
        public Throwable f17047d;

        /* renamed from: e */
        public volatile boolean f17048e;

        /* renamed from: f */
        public final AtomicInteger f17049f;

        public LatestAsyncEmitter(InterfaceC5218b interfaceC5218b) {
            super(interfaceC5218b);
            this.f17046c = new AtomicReference();
            this.f17049f = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        /* renamed from: d */
        public void mo15540d() {
            m15545h();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        /* renamed from: e */
        public void mo15541e() {
            if (this.f17049f.getAndIncrement() == 0) {
                this.f17046c.lazySet(null);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        /* renamed from: g */
        public boolean mo15542g(Throwable th) {
            if (this.f17048e || m15539c()) {
                return false;
            }
            if (th == null) {
                onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.f17047d = th;
            this.f17048e = true;
            m15545h();
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
        
            if (r9 != r5) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
        
            if (m15539c() == false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
        
            r2.lazySet(null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
        
            r5 = r17.f17048e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
        
            if (r2.get() != null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
        
            r12 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
        
            if (r5 == false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0067, code lost:
        
            if (r12 == false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0069, code lost:
        
            r1 = r17.f17047d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x006b, code lost:
        
            if (r1 == null) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x006d, code lost:
        
            m15538b(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0070, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
        
            m15537a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0074, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0077, code lost:
        
            if (r9 == 0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0079, code lost:
        
            p088e7.AbstractC8368a.m13656c(r17, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x007c, code lost:
        
            r4 = r17.f17049f.addAndGet(-r4);
         */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void m15545h() {
            /*
                r17 = this;
                r0 = r17
                java.util.concurrent.atomic.AtomicInteger r1 = r0.f17049f
                int r1 = r1.getAndIncrement()
                if (r1 == 0) goto Lc
                goto L85
            Lc:
                ba.b r1 = r0.f17040a
                java.util.concurrent.atomic.AtomicReference r2 = r0.f17046c
                r3 = 1
                r4 = r3
            L12:
                long r5 = r0.get()
                r7 = 0
                r9 = r7
            L19:
                int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                r12 = 0
                r13 = 0
                if (r11 == 0) goto L50
                boolean r14 = r0.m15539c()
                if (r14 == 0) goto L29
                r2.lazySet(r13)
                return
            L29:
                boolean r14 = r0.f17048e
                java.lang.Object r15 = r2.getAndSet(r13)
                if (r15 != 0) goto L34
                r16 = r3
                goto L36
            L34:
                r16 = r12
            L36:
                if (r14 == 0) goto L46
                if (r16 == 0) goto L46
                java.lang.Throwable r1 = r0.f17047d
                if (r1 == 0) goto L42
                r0.m15538b(r1)
                return
            L42:
                r0.m15537a()
                return
            L46:
                if (r16 == 0) goto L49
                goto L50
            L49:
                r1.onNext(r15)
                r11 = 1
                long r9 = r9 + r11
                goto L19
            L50:
                if (r11 != 0) goto L75
                boolean r5 = r0.m15539c()
                if (r5 == 0) goto L5c
                r2.lazySet(r13)
                return
            L5c:
                boolean r5 = r0.f17048e
                java.lang.Object r6 = r2.get()
                if (r6 != 0) goto L65
                r12 = r3
            L65:
                if (r5 == 0) goto L75
                if (r12 == 0) goto L75
                java.lang.Throwable r1 = r0.f17047d
                if (r1 == 0) goto L71
                r0.m15538b(r1)
                return
            L71:
                r0.m15537a()
                return
            L75:
                int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r5 == 0) goto L7c
                p088e7.AbstractC8368a.m13656c(r0, r9)
            L7c:
                java.util.concurrent.atomic.AtomicInteger r5 = r0.f17049f
                int r4 = -r4
                int r4 = r5.addAndGet(r4)
                if (r4 != 0) goto L12
            L85:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableCreate.LatestAsyncEmitter.m15545h():void");
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, p244s6.InterfaceC10044a
        public void onComplete() {
            this.f17048e = true;
            m15545h();
        }

        @Override // p244s6.InterfaceC10044a
        public void onNext(Object obj) {
            if (this.f17048e || m15539c()) {
                return;
            }
            if (obj == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f17046c.set(obj);
                m15545h();
            }
        }
    }

    public static final class MissingEmitter<T> extends BaseEmitter<T> {
        public MissingEmitter(InterfaceC5218b interfaceC5218b) {
            super(interfaceC5218b);
        }

        @Override // p244s6.InterfaceC10044a
        public void onNext(Object obj) {
            long j10;
            if (m15539c()) {
                return;
            }
            if (obj == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            this.f17040a.onNext(obj);
            do {
                j10 = get();
                if (j10 == 0) {
                    return;
                }
            } while (!compareAndSet(j10, j10 - 1));
        }
    }

    public static abstract class NoOverflowBaseAsyncEmitter<T> extends BaseEmitter<T> {
        public NoOverflowBaseAsyncEmitter(InterfaceC5218b interfaceC5218b) {
            super(interfaceC5218b);
        }

        /* renamed from: h */
        public abstract void mo15544h();

        @Override // p244s6.InterfaceC10044a
        public final void onNext(Object obj) {
            if (m15539c()) {
                return;
            }
            if (obj == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (get() == 0) {
                mo15544h();
            } else {
                this.f17040a.onNext(obj);
                AbstractC8368a.m13656c(this, 1L);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$a */
    public static /* synthetic */ class C8969a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17050a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            f17050a = iArr;
            try {
                iArr[BackpressureStrategy.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17050a[BackpressureStrategy.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17050a[BackpressureStrategy.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17050a[BackpressureStrategy.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FlowableCreate(InterfaceC10047d interfaceC10047d, BackpressureStrategy backpressureStrategy) {
        this.f17038b = interfaceC10047d;
        this.f17039c = backpressureStrategy;
    }

    @Override // p244s6.AbstractC10045b
    /* renamed from: k */
    public void mo15536k(InterfaceC5218b interfaceC5218b) {
        int i10 = C8969a.f17050a[this.f17039c.ordinal()];
        BaseEmitter bufferAsyncEmitter = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new BufferAsyncEmitter(interfaceC5218b, AbstractC10045b.m18740b()) : new LatestAsyncEmitter(interfaceC5218b) : new DropAsyncEmitter(interfaceC5218b) : new ErrorAsyncEmitter(interfaceC5218b) : new MissingEmitter(interfaceC5218b);
        interfaceC5218b.onSubscribe(bufferAsyncEmitter);
        try {
            this.f17038b.subscribe(bufferAsyncEmitter);
        } catch (Throwable th) {
            AbstractC10359a.m19297b(th);
            bufferAsyncEmitter.onError(th);
        }
    }
}
