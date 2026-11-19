package com.huawei.hms.framework.common;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class ExecutorsEnhance {

    public static class DelegatedExecutorService extends AbstractExecutorService {

        /* renamed from: c */
        public final ExecutorService f11632c;

        public DelegatedExecutorService(ExecutorService executorService) {
            this.f11632c = executorService;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j10, TimeUnit timeUnit) {
            return this.f11632c.awaitTermination(j10, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f11632c.execute(runnable);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
            return this.f11632c.invokeAll(collection, j10, timeUnit);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
            return (T) this.f11632c.invokeAny(collection, j10, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.f11632c.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.f11632c.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            this.f11632c.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            return this.f11632c.shutdownNow();
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t10) {
            return this.f11632c.submit(runnable, t10);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
            return this.f11632c.invokeAll(collection);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
            return (T) this.f11632c.invokeAny(collection);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            return this.f11632c.submit(callable);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable runnable) {
            return this.f11632c.submit(runnable);
        }
    }

    public static class FinalizableDelegatedExecutorService extends DelegatedExecutorService {
        public FinalizableDelegatedExecutorService(ExecutorService executorService) {
            super(executorService);
        }

        public void finalize() {
            super.shutdown();
        }
    }

    public static ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory) {
        ThreadPoolExcutorEnhance threadPoolExcutorEnhance = new ThreadPoolExcutorEnhance(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExcutorEnhance.allowCoreThreadTimeOut(true);
        return new FinalizableDelegatedExecutorService(threadPoolExcutorEnhance);
    }
}
