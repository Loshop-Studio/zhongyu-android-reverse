package io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {

    /* renamed from: a */
    public final String f17102a;

    /* renamed from: b */
    public final int f17103b;

    /* renamed from: c */
    public final boolean f17104c;

    /* renamed from: io.reactivex.internal.schedulers.RxThreadFactory$a */
    public static final class C8971a extends Thread {
        public C8971a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f17102a + '-' + incrementAndGet();
        Thread c8971a = this.f17104c ? new C8971a(runnable, str) : new Thread(runnable, str);
        c8971a.setPriority(this.f17103b);
        c8971a.setDaemon(true);
        return c8971a;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f17102a + "]";
    }

    public RxThreadFactory(String str, int i10) {
        this(str, i10, false);
    }

    public RxThreadFactory(String str, int i10, boolean z10) {
        this.f17102a = str;
        this.f17103b = i10;
        this.f17104c = z10;
    }
}
