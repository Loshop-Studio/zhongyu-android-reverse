package anetwork.channel.unified;

import anetwork.channel.Response;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: anetwork.channel.unified.d */
/* loaded from: classes3.dex */
class FutureC5126d implements Future<Response> {

    /* renamed from: a */
    private C5133k f2925a;

    /* renamed from: b */
    private boolean f2926b;

    public FutureC5126d(C5133k c5133k) {
        this.f2925a = c5133k;
    }

    @Override // java.util.concurrent.Future
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Response get() {
        throw new RuntimeException("NOT SUPPORT!");
    }

    /* renamed from: b */
    public Response m2636b() {
        throw new RuntimeException("NOT SUPPORT!");
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        if (!this.f2926b) {
            this.f2925a.m2653b();
            this.f2926b = true;
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f2926b;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        throw new RuntimeException("NOT SUPPORT!");
    }

    @Override // java.util.concurrent.Future
    public /* synthetic */ Response get(long j10, TimeUnit timeUnit) {
        return m2636b();
    }
}
