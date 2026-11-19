package anetwork.channel.unified;

import anetwork.channel.Response;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: anetwork.channel.unified.d */
/* loaded from: classes.dex */
class FutureC1003d implements Future<Response> {

    /* renamed from: a */
    private C1010k f5647a;

    /* renamed from: b */
    private boolean f5648b;

    public FutureC1003d(C1010k c1010k) {
        this.f5647a = c1010k;
    }

    @Override // java.util.concurrent.Future
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Response get() throws ExecutionException, InterruptedException {
        throw new RuntimeException("NOT SUPPORT!");
    }

    /* renamed from: b */
    public Response m4745b() throws ExecutionException, InterruptedException, TimeoutException {
        throw new RuntimeException("NOT SUPPORT!");
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z3) {
        if (!this.f5648b) {
            this.f5647a.m4762b();
            this.f5648b = true;
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f5648b;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        throw new RuntimeException("NOT SUPPORT!");
    }

    @Override // java.util.concurrent.Future
    public /* synthetic */ Response get(long j4, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return m4745b();
    }
}
