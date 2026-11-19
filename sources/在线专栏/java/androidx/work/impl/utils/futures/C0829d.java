package androidx.work.impl.utils.futures;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: androidx.work.impl.utils.futures.d */
/* loaded from: classes.dex */
public final class C0829d<V> extends AbstractC0826a<V> {
    private C0829d() {
    }

    /* renamed from: s */
    public static <V> C0829d<V> m4279s() {
        return new C0829d<>();
    }

    @Override // androidx.work.impl.utils.futures.AbstractC0826a
    /* renamed from: o */
    public boolean mo4268o(V v3) {
        return super.mo4268o(v3);
    }

    @Override // androidx.work.impl.utils.futures.AbstractC0826a
    /* renamed from: p */
    public boolean mo4269p(Throwable th) {
        return super.mo4269p(th);
    }

    @Override // androidx.work.impl.utils.futures.AbstractC0826a
    /* renamed from: q */
    public boolean mo4270q(ListenableFuture<? extends V> listenableFuture) {
        return super.mo4270q(listenableFuture);
    }
}
