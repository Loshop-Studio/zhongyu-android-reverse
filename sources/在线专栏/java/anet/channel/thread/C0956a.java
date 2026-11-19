package anet.channel.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: anet.channel.thread.a */
/* loaded from: classes.dex */
class C0956a extends ThreadPoolExecutor {
    public C0956a(int i4, int i5, long j4, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i4, i5, j4, timeUnit, blockingQueue, threadFactory);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t3) {
        return new a(runnable, t3);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new a(callable);
    }

    /* renamed from: anet.channel.thread.a$a */
    class a<V> extends FutureTask<V> implements Comparable<a<V>> {

        /* renamed from: b */
        private Object f5463b;

        public a(Callable<V> callable) {
            super(callable);
            this.f5463b = callable;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a<V> aVar) {
            if (this == aVar) {
                return 0;
            }
            if (aVar == null) {
                return -1;
            }
            Object obj = this.f5463b;
            if (obj != null && aVar.f5463b != null && obj.getClass().equals(aVar.f5463b.getClass())) {
                Object obj2 = this.f5463b;
                if (obj2 instanceof Comparable) {
                    return ((Comparable) obj2).compareTo(aVar.f5463b);
                }
            }
            return 0;
        }

        public a(Runnable runnable, V v3) {
            super(runnable, v3);
            this.f5463b = runnable;
        }
    }
}
