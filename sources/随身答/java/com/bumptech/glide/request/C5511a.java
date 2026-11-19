package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;
import p002a1.InterfaceC0010b;

/* renamed from: com.bumptech.glide.request.a */
/* loaded from: classes3.dex */
public final class C5511a implements RequestCoordinator, InterfaceC0010b {

    /* renamed from: a */
    public final Object f3648a;

    /* renamed from: b */
    public final RequestCoordinator f3649b;

    /* renamed from: c */
    public volatile InterfaceC0010b f3650c;

    /* renamed from: d */
    public volatile InterfaceC0010b f3651d;

    /* renamed from: e */
    public RequestCoordinator.RequestState f3652e;

    /* renamed from: f */
    public RequestCoordinator.RequestState f3653f;

    public C5511a(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f3652e = requestState;
        this.f3653f = requestState;
        this.f3648a = obj;
        this.f3649b = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: a */
    public boolean mo3343a(InterfaceC0010b interfaceC0010b) {
        boolean z9;
        synchronized (this.f3648a) {
            try {
                z9 = m3368k() && m3367j(interfaceC0010b);
            } finally {
            }
        }
        return z9;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, p002a1.InterfaceC0010b
    /* renamed from: b */
    public boolean mo71b() {
        boolean z9;
        synchronized (this.f3648a) {
            try {
                z9 = this.f3650c.mo71b() || this.f3651d.mo71b();
            } finally {
            }
        }
        return z9;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: c */
    public boolean mo3344c(InterfaceC0010b interfaceC0010b) {
        boolean z9;
        synchronized (this.f3648a) {
            try {
                z9 = m3369l() && m3367j(interfaceC0010b);
            } finally {
            }
        }
        return z9;
    }

    @Override // p002a1.InterfaceC0010b
    public void clear() {
        synchronized (this.f3648a) {
            try {
                RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
                this.f3652e = requestState;
                this.f3650c.clear();
                if (this.f3653f != requestState) {
                    this.f3653f = requestState;
                    this.f3651d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: d */
    public void mo3345d(InterfaceC0010b interfaceC0010b) {
        synchronized (this.f3648a) {
            try {
                if (interfaceC0010b.equals(this.f3651d)) {
                    this.f3653f = RequestCoordinator.RequestState.FAILED;
                    RequestCoordinator requestCoordinator = this.f3649b;
                    if (requestCoordinator != null) {
                        requestCoordinator.mo3345d(this);
                    }
                    return;
                }
                this.f3652e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator.RequestState requestState = this.f3653f;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f3653f = requestState2;
                    this.f3651d.mo74i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p002a1.InterfaceC0010b
    /* renamed from: e */
    public boolean mo72e() {
        boolean z9;
        synchronized (this.f3648a) {
            try {
                RequestCoordinator.RequestState requestState = this.f3652e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
                z9 = requestState == requestState2 && this.f3653f == requestState2;
            } finally {
            }
        }
        return z9;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: f */
    public void mo3346f(InterfaceC0010b interfaceC0010b) {
        synchronized (this.f3648a) {
            try {
                if (interfaceC0010b.equals(this.f3650c)) {
                    this.f3652e = RequestCoordinator.RequestState.SUCCESS;
                } else if (interfaceC0010b.equals(this.f3651d)) {
                    this.f3653f = RequestCoordinator.RequestState.SUCCESS;
                }
                RequestCoordinator requestCoordinator = this.f3649b;
                if (requestCoordinator != null) {
                    requestCoordinator.mo3346f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p002a1.InterfaceC0010b
    /* renamed from: g */
    public boolean mo73g(InterfaceC0010b interfaceC0010b) {
        if (interfaceC0010b instanceof C5511a) {
            C5511a c5511a = (C5511a) interfaceC0010b;
            if (this.f3650c.mo73g(c5511a.f3650c) && this.f3651d.mo73g(c5511a.f3651d)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f3648a) {
            try {
                RequestCoordinator requestCoordinator = this.f3649b;
                root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: h */
    public boolean mo3347h(InterfaceC0010b interfaceC0010b) {
        boolean z9;
        synchronized (this.f3648a) {
            try {
                z9 = m3370m() && m3367j(interfaceC0010b);
            } finally {
            }
        }
        return z9;
    }

    @Override // p002a1.InterfaceC0010b
    /* renamed from: i */
    public void mo74i() {
        synchronized (this.f3648a) {
            try {
                RequestCoordinator.RequestState requestState = this.f3652e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f3652e = requestState2;
                    this.f3650c.mo74i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p002a1.InterfaceC0010b
    public boolean isComplete() {
        boolean z9;
        synchronized (this.f3648a) {
            try {
                RequestCoordinator.RequestState requestState = this.f3652e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
                z9 = requestState == requestState2 || this.f3653f == requestState2;
            } finally {
            }
        }
        return z9;
    }

    @Override // p002a1.InterfaceC0010b
    public boolean isRunning() {
        boolean z9;
        synchronized (this.f3648a) {
            try {
                RequestCoordinator.RequestState requestState = this.f3652e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                z9 = requestState == requestState2 || this.f3653f == requestState2;
            } finally {
            }
        }
        return z9;
    }

    /* renamed from: j */
    public final boolean m3367j(InterfaceC0010b interfaceC0010b) {
        if (interfaceC0010b.equals(this.f3650c)) {
            return true;
        }
        return this.f3652e == RequestCoordinator.RequestState.FAILED && interfaceC0010b.equals(this.f3651d);
    }

    /* renamed from: k */
    public final boolean m3368k() {
        RequestCoordinator requestCoordinator = this.f3649b;
        return requestCoordinator == null || requestCoordinator.mo3343a(this);
    }

    /* renamed from: l */
    public final boolean m3369l() {
        RequestCoordinator requestCoordinator = this.f3649b;
        return requestCoordinator == null || requestCoordinator.mo3344c(this);
    }

    /* renamed from: m */
    public final boolean m3370m() {
        RequestCoordinator requestCoordinator = this.f3649b;
        return requestCoordinator == null || requestCoordinator.mo3347h(this);
    }

    /* renamed from: n */
    public void m3371n(InterfaceC0010b interfaceC0010b, InterfaceC0010b interfaceC0010b2) {
        this.f3650c = interfaceC0010b;
        this.f3651d = interfaceC0010b2;
    }

    @Override // p002a1.InterfaceC0010b
    public void pause() {
        synchronized (this.f3648a) {
            try {
                RequestCoordinator.RequestState requestState = this.f3652e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState == requestState2) {
                    this.f3652e = RequestCoordinator.RequestState.PAUSED;
                    this.f3650c.pause();
                }
                if (this.f3653f == requestState2) {
                    this.f3653f = RequestCoordinator.RequestState.PAUSED;
                    this.f3651d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
