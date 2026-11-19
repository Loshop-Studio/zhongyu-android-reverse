package io.reactivex.internal.schedulers;

import android.support.v4.media.AbstractC0037f;
import com.blankj.utilcode.util.C3394n;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    final boolean nonBlocking;
    final String prefix;
    final int priority;

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.prefix + '-' + incrementAndGet();
        Thread c3394n = this.nonBlocking ? new C3394n(runnable, str, 1) : new Thread(runnable, str);
        c3394n.setPriority(this.priority);
        c3394n.setDaemon(true);
        return c3394n;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return AbstractC0037f.m91p(new StringBuilder("RxThreadFactory["), this.prefix, "]");
    }

    public RxThreadFactory(String str, int i) {
        this(str, i, false);
    }

    public RxThreadFactory(String str, int i, boolean z8) {
        this.prefix = str;
        this.priority = i;
        this.nonBlocking = z8;
    }
}
