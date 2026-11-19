package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;
import p069d0.InterfaceC8270b;

/* renamed from: com.bumptech.glide.request.a */
/* loaded from: classes3.dex */
public final class C5455a implements RequestCoordinator, InterfaceC8270b {

    /* renamed from: a */
    public final Object f3293a;

    /* renamed from: b */
    public final RequestCoordinator f3294b;

    /* renamed from: c */
    public volatile InterfaceC8270b f3295c;

    /* renamed from: d */
    public volatile InterfaceC8270b f3296d;

    /* renamed from: e */
    public RequestCoordinator.RequestState f3297e;

    /* renamed from: f */
    public RequestCoordinator.RequestState f3298f;

    public C5455a(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f3297e = requestState;
        this.f3298f = requestState;
        this.f3293a = obj;
        this.f3294b = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, p069d0.InterfaceC8270b
    /* renamed from: a */
    public boolean mo3150a() {
        boolean z10;
        synchronized (this.f3293a) {
            try {
                z10 = this.f3295c.mo3150a() || this.f3296d.mo3150a();
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: b */
    public boolean mo3151b(InterfaceC8270b interfaceC8270b) {
        boolean zM3188m;
        synchronized (this.f3293a) {
            zM3188m = m3188m();
        }
        return zM3188m;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: c */
    public boolean mo3152c(InterfaceC8270b interfaceC8270b) {
        boolean z10;
        synchronized (this.f3293a) {
            try {
                z10 = m3186k() && interfaceC8270b.equals(this.f3295c);
            } finally {
            }
        }
        return z10;
    }

    @Override // p069d0.InterfaceC8270b
    public void clear() {
        synchronized (this.f3293a) {
            try {
                RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
                this.f3297e = requestState;
                this.f3295c.clear();
                if (this.f3298f != requestState) {
                    this.f3298f = requestState;
                    this.f3296d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: d */
    public void mo3153d(InterfaceC8270b interfaceC8270b) {
        synchronized (this.f3293a) {
            try {
                if (interfaceC8270b.equals(this.f3296d)) {
                    this.f3298f = RequestCoordinator.RequestState.FAILED;
                    RequestCoordinator requestCoordinator = this.f3294b;
                    if (requestCoordinator != null) {
                        requestCoordinator.mo3153d(this);
                    }
                    return;
                }
                this.f3297e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator.RequestState requestState = this.f3298f;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f3298f = requestState2;
                    this.f3296d.mo3168i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p069d0.InterfaceC8270b
    /* renamed from: e */
    public boolean mo3164e() {
        boolean z10;
        synchronized (this.f3293a) {
            try {
                RequestCoordinator.RequestState requestState = this.f3297e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
                z10 = requestState == requestState2 && this.f3298f == requestState2;
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: f */
    public void mo3154f(InterfaceC8270b interfaceC8270b) {
        synchronized (this.f3293a) {
            try {
                if (interfaceC8270b.equals(this.f3295c)) {
                    this.f3297e = RequestCoordinator.RequestState.SUCCESS;
                } else if (interfaceC8270b.equals(this.f3296d)) {
                    this.f3298f = RequestCoordinator.RequestState.SUCCESS;
                }
                RequestCoordinator requestCoordinator = this.f3294b;
                if (requestCoordinator != null) {
                    requestCoordinator.mo3154f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p069d0.InterfaceC8270b
    /* renamed from: g */
    public boolean mo3166g(InterfaceC8270b interfaceC8270b) {
        if (interfaceC8270b instanceof C5455a) {
            C5455a c5455a = (C5455a) interfaceC8270b;
            if (this.f3295c.mo3166g(c5455a.f3295c) && this.f3296d.mo3166g(c5455a.f3296d)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f3293a) {
            try {
                RequestCoordinator requestCoordinator = this.f3294b;
                root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: h */
    public boolean mo3155h(InterfaceC8270b interfaceC8270b) {
        boolean z10;
        synchronized (this.f3293a) {
            try {
                z10 = m3187l() && m3185j(interfaceC8270b);
            } finally {
            }
        }
        return z10;
    }

    @Override // p069d0.InterfaceC8270b
    /* renamed from: i */
    public void mo3168i() {
        synchronized (this.f3293a) {
            try {
                RequestCoordinator.RequestState requestState = this.f3297e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f3297e = requestState2;
                    this.f3295c.mo3168i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p069d0.InterfaceC8270b
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f3293a) {
            try {
                RequestCoordinator.RequestState requestState = this.f3297e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
                z10 = requestState == requestState2 || this.f3298f == requestState2;
            } finally {
            }
        }
        return z10;
    }

    @Override // p069d0.InterfaceC8270b
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f3293a) {
            try {
                RequestCoordinator.RequestState requestState = this.f3297e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                z10 = requestState == requestState2 || this.f3298f == requestState2;
            } finally {
            }
        }
        return z10;
    }

    /* renamed from: j */
    public final boolean m3185j(InterfaceC8270b interfaceC8270b) {
        RequestCoordinator.RequestState requestState = this.f3297e;
        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.FAILED;
        if (requestState != requestState2) {
            return interfaceC8270b.equals(this.f3295c);
        }
        if (!interfaceC8270b.equals(this.f3296d)) {
            return false;
        }
        RequestCoordinator.RequestState requestState3 = this.f3298f;
        return requestState3 == RequestCoordinator.RequestState.SUCCESS || requestState3 == requestState2;
    }

    /* renamed from: k */
    public final boolean m3186k() {
        RequestCoordinator requestCoordinator = this.f3294b;
        return requestCoordinator == null || requestCoordinator.mo3152c(this);
    }

    /* renamed from: l */
    public final boolean m3187l() {
        RequestCoordinator requestCoordinator = this.f3294b;
        return requestCoordinator == null || requestCoordinator.mo3155h(this);
    }

    /* renamed from: m */
    public final boolean m3188m() {
        RequestCoordinator requestCoordinator = this.f3294b;
        return requestCoordinator == null || requestCoordinator.mo3151b(this);
    }

    /* renamed from: n */
    public void m3189n(InterfaceC8270b interfaceC8270b, InterfaceC8270b interfaceC8270b2) {
        this.f3295c = interfaceC8270b;
        this.f3296d = interfaceC8270b2;
    }

    @Override // p069d0.InterfaceC8270b
    public void pause() {
        synchronized (this.f3293a) {
            try {
                RequestCoordinator.RequestState requestState = this.f3297e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState == requestState2) {
                    this.f3297e = RequestCoordinator.RequestState.PAUSED;
                    this.f3295c.pause();
                }
                if (this.f3298f == requestState2) {
                    this.f3298f = RequestCoordinator.RequestState.PAUSED;
                    this.f3296d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
