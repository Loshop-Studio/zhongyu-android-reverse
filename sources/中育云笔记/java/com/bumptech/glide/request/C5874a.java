package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;
import p428z0.InterfaceC11953b;

/* renamed from: com.bumptech.glide.request.a */
/* loaded from: classes3.dex */
public final class C5874a implements RequestCoordinator, InterfaceC11953b {

    /* renamed from: a */
    public final Object f5063a;

    /* renamed from: b */
    public final RequestCoordinator f5064b;

    /* renamed from: c */
    public volatile InterfaceC11953b f5065c;

    /* renamed from: d */
    public volatile InterfaceC11953b f5066d;

    /* renamed from: e */
    public RequestCoordinator.RequestState f5067e;

    /* renamed from: f */
    public RequestCoordinator.RequestState f5068f;

    public C5874a(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f5067e = requestState;
        this.f5068f = requestState;
        this.f5063a = obj;
        this.f5064b = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, p428z0.InterfaceC11953b
    /* renamed from: a */
    public boolean mo4353a() {
        boolean z10;
        synchronized (this.f5063a) {
            try {
                z10 = this.f5065c.mo4353a() || this.f5066d.mo4353a();
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: b */
    public void mo4354b(InterfaceC11953b interfaceC11953b) {
        synchronized (this.f5063a) {
            try {
                if (interfaceC11953b.equals(this.f5066d)) {
                    this.f5068f = RequestCoordinator.RequestState.FAILED;
                    RequestCoordinator requestCoordinator = this.f5064b;
                    if (requestCoordinator != null) {
                        requestCoordinator.mo4354b(this);
                    }
                    return;
                }
                this.f5067e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator.RequestState requestState = this.f5068f;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f5068f = requestState2;
                    this.f5066d.mo4369h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: c */
    public void mo4355c(InterfaceC11953b interfaceC11953b) {
        synchronized (this.f5063a) {
            try {
                if (interfaceC11953b.equals(this.f5065c)) {
                    this.f5067e = RequestCoordinator.RequestState.SUCCESS;
                } else if (interfaceC11953b.equals(this.f5066d)) {
                    this.f5068f = RequestCoordinator.RequestState.SUCCESS;
                }
                RequestCoordinator requestCoordinator = this.f5064b;
                if (requestCoordinator != null) {
                    requestCoordinator.mo4355c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p428z0.InterfaceC11953b
    public void clear() {
        synchronized (this.f5063a) {
            try {
                RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
                this.f5067e = requestState;
                this.f5065c.clear();
                if (this.f5068f != requestState) {
                    this.f5068f = requestState;
                    this.f5066d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: d */
    public boolean mo4356d(InterfaceC11953b interfaceC11953b) {
        boolean zM4390m;
        synchronized (this.f5063a) {
            zM4390m = m4390m();
        }
        return zM4390m;
    }

    @Override // p428z0.InterfaceC11953b
    /* renamed from: e */
    public boolean mo4366e() {
        boolean z10;
        synchronized (this.f5063a) {
            try {
                RequestCoordinator.RequestState requestState = this.f5067e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
                z10 = requestState == requestState2 && this.f5068f == requestState2;
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: f */
    public boolean mo4357f(InterfaceC11953b interfaceC11953b) {
        boolean z10;
        synchronized (this.f5063a) {
            try {
                z10 = m4388k() && interfaceC11953b.equals(this.f5065c);
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: g */
    public boolean mo4358g(InterfaceC11953b interfaceC11953b) {
        boolean z10;
        synchronized (this.f5063a) {
            try {
                z10 = m4389l() && m4387j(interfaceC11953b);
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f5063a) {
            try {
                RequestCoordinator requestCoordinator = this.f5064b;
                root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // p428z0.InterfaceC11953b
    /* renamed from: h */
    public void mo4369h() {
        synchronized (this.f5063a) {
            try {
                RequestCoordinator.RequestState requestState = this.f5067e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f5067e = requestState2;
                    this.f5065c.mo4369h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p428z0.InterfaceC11953b
    /* renamed from: i */
    public boolean mo4370i(InterfaceC11953b interfaceC11953b) {
        if (interfaceC11953b instanceof C5874a) {
            C5874a c5874a = (C5874a) interfaceC11953b;
            if (this.f5065c.mo4370i(c5874a.f5065c) && this.f5066d.mo4370i(c5874a.f5066d)) {
                return true;
            }
        }
        return false;
    }

    @Override // p428z0.InterfaceC11953b
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f5063a) {
            try {
                RequestCoordinator.RequestState requestState = this.f5067e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
                z10 = requestState == requestState2 || this.f5068f == requestState2;
            } finally {
            }
        }
        return z10;
    }

    @Override // p428z0.InterfaceC11953b
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f5063a) {
            try {
                RequestCoordinator.RequestState requestState = this.f5067e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                z10 = requestState == requestState2 || this.f5068f == requestState2;
            } finally {
            }
        }
        return z10;
    }

    /* renamed from: j */
    public final boolean m4387j(InterfaceC11953b interfaceC11953b) {
        RequestCoordinator.RequestState requestState = this.f5067e;
        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.FAILED;
        if (requestState != requestState2) {
            return interfaceC11953b.equals(this.f5065c);
        }
        if (!interfaceC11953b.equals(this.f5066d)) {
            return false;
        }
        RequestCoordinator.RequestState requestState3 = this.f5068f;
        return requestState3 == RequestCoordinator.RequestState.SUCCESS || requestState3 == requestState2;
    }

    /* renamed from: k */
    public final boolean m4388k() {
        RequestCoordinator requestCoordinator = this.f5064b;
        return requestCoordinator == null || requestCoordinator.mo4357f(this);
    }

    /* renamed from: l */
    public final boolean m4389l() {
        RequestCoordinator requestCoordinator = this.f5064b;
        return requestCoordinator == null || requestCoordinator.mo4358g(this);
    }

    /* renamed from: m */
    public final boolean m4390m() {
        RequestCoordinator requestCoordinator = this.f5064b;
        return requestCoordinator == null || requestCoordinator.mo4356d(this);
    }

    /* renamed from: n */
    public void m4391n(InterfaceC11953b interfaceC11953b, InterfaceC11953b interfaceC11953b2) {
        this.f5065c = interfaceC11953b;
        this.f5066d = interfaceC11953b2;
    }

    @Override // p428z0.InterfaceC11953b
    public void pause() {
        synchronized (this.f5063a) {
            try {
                RequestCoordinator.RequestState requestState = this.f5067e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState == requestState2) {
                    this.f5067e = RequestCoordinator.RequestState.PAUSED;
                    this.f5065c.pause();
                }
                if (this.f5068f == requestState2) {
                    this.f5068f = RequestCoordinator.RequestState.PAUSED;
                    this.f5066d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
