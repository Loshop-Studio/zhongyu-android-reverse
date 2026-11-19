package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;
import p073e1.InterfaceC7325b;

/* renamed from: com.bumptech.glide.request.b */
/* loaded from: classes3.dex */
public class C5407b implements RequestCoordinator, InterfaceC7325b {

    /* renamed from: a */
    public final RequestCoordinator f3866a;

    /* renamed from: b */
    public final Object f3867b;

    /* renamed from: c */
    public volatile InterfaceC7325b f3868c;

    /* renamed from: d */
    public volatile InterfaceC7325b f3869d;

    /* renamed from: e */
    public RequestCoordinator.RequestState f3870e;

    /* renamed from: f */
    public RequestCoordinator.RequestState f3871f;

    /* renamed from: g */
    public boolean f3872g;

    public C5407b(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f3870e = requestState;
        this.f3871f = requestState;
        this.f3867b = obj;
        this.f3866a = requestCoordinator;
    }

    /* renamed from: a */
    private boolean m3746a() {
        RequestCoordinator requestCoordinator = this.f3866a;
        return requestCoordinator == null || requestCoordinator.mo3708d(this);
    }

    /* renamed from: k */
    private boolean m3747k() {
        RequestCoordinator requestCoordinator = this.f3866a;
        return requestCoordinator == null || requestCoordinator.mo3710h(this);
    }

    /* renamed from: l */
    private boolean m3748l() {
        RequestCoordinator requestCoordinator = this.f3866a;
        return requestCoordinator == null || requestCoordinator.mo3707c(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, p073e1.InterfaceC7325b
    /* renamed from: b */
    public boolean mo3706b() {
        boolean z9;
        synchronized (this.f3867b) {
            try {
                z9 = this.f3869d.mo3706b() || this.f3868c.mo3706b();
            } finally {
            }
        }
        return z9;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: c */
    public boolean mo3707c(InterfaceC7325b interfaceC7325b) {
        boolean z9;
        synchronized (this.f3867b) {
            try {
                z9 = m3748l() && (interfaceC7325b.equals(this.f3868c) || this.f3870e != RequestCoordinator.RequestState.SUCCESS);
            } finally {
            }
        }
        return z9;
    }

    @Override // p073e1.InterfaceC7325b
    public void clear() {
        synchronized (this.f3867b) {
            this.f3872g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f3870e = requestState;
            this.f3871f = requestState;
            this.f3869d.clear();
            this.f3868c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: d */
    public boolean mo3708d(InterfaceC7325b interfaceC7325b) {
        boolean z9;
        synchronized (this.f3867b) {
            try {
                z9 = m3746a() && interfaceC7325b.equals(this.f3868c) && this.f3870e != RequestCoordinator.RequestState.PAUSED;
            } finally {
            }
        }
        return z9;
    }

    @Override // p073e1.InterfaceC7325b
    /* renamed from: e */
    public boolean mo3720e(InterfaceC7325b interfaceC7325b) {
        if (interfaceC7325b instanceof C5407b) {
            C5407b c5407b = (C5407b) interfaceC7325b;
            if (this.f3868c != null ? this.f3868c.mo3720e(c5407b.f3868c) : c5407b.f3868c == null) {
                if (this.f3869d == null) {
                    if (c5407b.f3869d == null) {
                        return true;
                    }
                } else if (this.f3869d.mo3720e(c5407b.f3869d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p073e1.InterfaceC7325b
    /* renamed from: f */
    public boolean mo3721f() {
        boolean z9;
        synchronized (this.f3867b) {
            z9 = this.f3870e == RequestCoordinator.RequestState.CLEARED;
        }
        return z9;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: g */
    public void mo3709g(InterfaceC7325b interfaceC7325b) {
        synchronized (this.f3867b) {
            try {
                if (!interfaceC7325b.equals(this.f3868c)) {
                    this.f3871f = RequestCoordinator.RequestState.FAILED;
                    return;
                }
                this.f3870e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f3866a;
                if (requestCoordinator != null) {
                    requestCoordinator.mo3709g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f3867b) {
            try {
                RequestCoordinator requestCoordinator = this.f3866a;
                root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: h */
    public boolean mo3710h(InterfaceC7325b interfaceC7325b) {
        boolean z9;
        synchronized (this.f3867b) {
            try {
                z9 = m3747k() && interfaceC7325b.equals(this.f3868c) && !mo3706b();
            } finally {
            }
        }
        return z9;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: i */
    public void mo3711i(InterfaceC7325b interfaceC7325b) {
        synchronized (this.f3867b) {
            try {
                if (interfaceC7325b.equals(this.f3869d)) {
                    this.f3871f = RequestCoordinator.RequestState.SUCCESS;
                    return;
                }
                this.f3870e = RequestCoordinator.RequestState.SUCCESS;
                RequestCoordinator requestCoordinator = this.f3866a;
                if (requestCoordinator != null) {
                    requestCoordinator.mo3711i(this);
                }
                if (!this.f3871f.m3713f()) {
                    this.f3869d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p073e1.InterfaceC7325b
    public boolean isComplete() {
        boolean z9;
        synchronized (this.f3867b) {
            z9 = this.f3870e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z9;
    }

    @Override // p073e1.InterfaceC7325b
    public boolean isRunning() {
        boolean z9;
        synchronized (this.f3867b) {
            z9 = this.f3870e == RequestCoordinator.RequestState.RUNNING;
        }
        return z9;
    }

    @Override // p073e1.InterfaceC7325b
    /* renamed from: j */
    public void mo3725j() {
        synchronized (this.f3867b) {
            try {
                this.f3872g = true;
                try {
                    if (this.f3870e != RequestCoordinator.RequestState.SUCCESS) {
                        RequestCoordinator.RequestState requestState = this.f3871f;
                        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState != requestState2) {
                            this.f3871f = requestState2;
                            this.f3869d.mo3725j();
                        }
                    }
                    if (this.f3872g) {
                        RequestCoordinator.RequestState requestState3 = this.f3870e;
                        RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState3 != requestState4) {
                            this.f3870e = requestState4;
                            this.f3868c.mo3725j();
                        }
                    }
                    this.f3872g = false;
                } catch (Throwable th) {
                    this.f3872g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: m */
    public void m3749m(InterfaceC7325b interfaceC7325b, InterfaceC7325b interfaceC7325b2) {
        this.f3868c = interfaceC7325b;
        this.f3869d = interfaceC7325b2;
    }

    @Override // p073e1.InterfaceC7325b
    public void pause() {
        synchronized (this.f3867b) {
            try {
                if (!this.f3871f.m3713f()) {
                    this.f3871f = RequestCoordinator.RequestState.PAUSED;
                    this.f3869d.pause();
                }
                if (!this.f3870e.m3713f()) {
                    this.f3870e = RequestCoordinator.RequestState.PAUSED;
                    this.f3868c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
