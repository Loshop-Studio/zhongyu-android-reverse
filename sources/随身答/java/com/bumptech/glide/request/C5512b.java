package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;
import p002a1.InterfaceC0010b;

/* renamed from: com.bumptech.glide.request.b */
/* loaded from: classes3.dex */
public class C5512b implements RequestCoordinator, InterfaceC0010b {

    /* renamed from: a */
    public final RequestCoordinator f3654a;

    /* renamed from: b */
    public final Object f3655b;

    /* renamed from: c */
    public volatile InterfaceC0010b f3656c;

    /* renamed from: d */
    public volatile InterfaceC0010b f3657d;

    /* renamed from: e */
    public RequestCoordinator.RequestState f3658e;

    /* renamed from: f */
    public RequestCoordinator.RequestState f3659f;

    /* renamed from: g */
    public boolean f3660g;

    public C5512b(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f3658e = requestState;
        this.f3659f = requestState;
        this.f3655b = obj;
        this.f3654a = requestCoordinator;
    }

    /* renamed from: j */
    private boolean m3372j() {
        RequestCoordinator requestCoordinator = this.f3654a;
        return requestCoordinator == null || requestCoordinator.mo3343a(this);
    }

    /* renamed from: k */
    private boolean m3373k() {
        RequestCoordinator requestCoordinator = this.f3654a;
        return requestCoordinator == null || requestCoordinator.mo3344c(this);
    }

    /* renamed from: l */
    private boolean m3374l() {
        RequestCoordinator requestCoordinator = this.f3654a;
        return requestCoordinator == null || requestCoordinator.mo3347h(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: a */
    public boolean mo3343a(InterfaceC0010b interfaceC0010b) {
        boolean z9;
        synchronized (this.f3655b) {
            try {
                z9 = m3372j() && interfaceC0010b.equals(this.f3656c) && this.f3658e != RequestCoordinator.RequestState.PAUSED;
            } finally {
            }
        }
        return z9;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, p002a1.InterfaceC0010b
    /* renamed from: b */
    public boolean mo71b() {
        boolean z9;
        synchronized (this.f3655b) {
            try {
                z9 = this.f3657d.mo71b() || this.f3656c.mo71b();
            } finally {
            }
        }
        return z9;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: c */
    public boolean mo3344c(InterfaceC0010b interfaceC0010b) {
        boolean z9;
        synchronized (this.f3655b) {
            try {
                z9 = m3373k() && interfaceC0010b.equals(this.f3656c) && !mo71b();
            } finally {
            }
        }
        return z9;
    }

    @Override // p002a1.InterfaceC0010b
    public void clear() {
        synchronized (this.f3655b) {
            this.f3660g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f3658e = requestState;
            this.f3659f = requestState;
            this.f3657d.clear();
            this.f3656c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: d */
    public void mo3345d(InterfaceC0010b interfaceC0010b) {
        synchronized (this.f3655b) {
            try {
                if (!interfaceC0010b.equals(this.f3656c)) {
                    this.f3659f = RequestCoordinator.RequestState.FAILED;
                    return;
                }
                this.f3658e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f3654a;
                if (requestCoordinator != null) {
                    requestCoordinator.mo3345d(this);
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
        synchronized (this.f3655b) {
            z9 = this.f3658e == RequestCoordinator.RequestState.CLEARED;
        }
        return z9;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: f */
    public void mo3346f(InterfaceC0010b interfaceC0010b) {
        synchronized (this.f3655b) {
            try {
                if (interfaceC0010b.equals(this.f3657d)) {
                    this.f3659f = RequestCoordinator.RequestState.SUCCESS;
                    return;
                }
                this.f3658e = RequestCoordinator.RequestState.SUCCESS;
                RequestCoordinator requestCoordinator = this.f3654a;
                if (requestCoordinator != null) {
                    requestCoordinator.mo3346f(this);
                }
                if (!this.f3659f.m3348a()) {
                    this.f3657d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p002a1.InterfaceC0010b
    /* renamed from: g */
    public boolean mo73g(InterfaceC0010b interfaceC0010b) {
        if (interfaceC0010b instanceof C5512b) {
            C5512b c5512b = (C5512b) interfaceC0010b;
            if (this.f3656c != null ? this.f3656c.mo73g(c5512b.f3656c) : c5512b.f3656c == null) {
                if (this.f3657d == null) {
                    if (c5512b.f3657d == null) {
                        return true;
                    }
                } else if (this.f3657d.mo73g(c5512b.f3657d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f3655b) {
            try {
                RequestCoordinator requestCoordinator = this.f3654a;
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
        synchronized (this.f3655b) {
            try {
                z9 = m3374l() && (interfaceC0010b.equals(this.f3656c) || this.f3658e != RequestCoordinator.RequestState.SUCCESS);
            } finally {
            }
        }
        return z9;
    }

    @Override // p002a1.InterfaceC0010b
    /* renamed from: i */
    public void mo74i() {
        synchronized (this.f3655b) {
            try {
                this.f3660g = true;
                try {
                    if (this.f3658e != RequestCoordinator.RequestState.SUCCESS) {
                        RequestCoordinator.RequestState requestState = this.f3659f;
                        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState != requestState2) {
                            this.f3659f = requestState2;
                            this.f3657d.mo74i();
                        }
                    }
                    if (this.f3660g) {
                        RequestCoordinator.RequestState requestState3 = this.f3658e;
                        RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState3 != requestState4) {
                            this.f3658e = requestState4;
                            this.f3656c.mo74i();
                        }
                    }
                    this.f3660g = false;
                } catch (Throwable th) {
                    this.f3660g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p002a1.InterfaceC0010b
    public boolean isComplete() {
        boolean z9;
        synchronized (this.f3655b) {
            z9 = this.f3658e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z9;
    }

    @Override // p002a1.InterfaceC0010b
    public boolean isRunning() {
        boolean z9;
        synchronized (this.f3655b) {
            z9 = this.f3658e == RequestCoordinator.RequestState.RUNNING;
        }
        return z9;
    }

    /* renamed from: m */
    public void m3375m(InterfaceC0010b interfaceC0010b, InterfaceC0010b interfaceC0010b2) {
        this.f3656c = interfaceC0010b;
        this.f3657d = interfaceC0010b2;
    }

    @Override // p002a1.InterfaceC0010b
    public void pause() {
        synchronized (this.f3655b) {
            try {
                if (!this.f3659f.m3348a()) {
                    this.f3659f = RequestCoordinator.RequestState.PAUSED;
                    this.f3657d.pause();
                }
                if (!this.f3658e.m3348a()) {
                    this.f3658e = RequestCoordinator.RequestState.PAUSED;
                    this.f3656c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
