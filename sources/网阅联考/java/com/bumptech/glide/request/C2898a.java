package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;
import p016c0.InterfaceC2751b;

/* renamed from: com.bumptech.glide.request.a */
/* loaded from: classes2.dex */
public final class C2898a implements RequestCoordinator, InterfaceC2751b {

    /* renamed from: a */
    public final Object f994a;

    /* renamed from: b */
    public final RequestCoordinator f995b;

    /* renamed from: c */
    public volatile InterfaceC2751b f996c;

    /* renamed from: d */
    public volatile InterfaceC2751b f997d;

    /* renamed from: e */
    public RequestCoordinator.RequestState f998e;

    /* renamed from: f */
    public RequestCoordinator.RequestState f999f;

    public C2898a(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f998e = requestState;
        this.f999f = requestState;
        this.f994a = obj;
        this.f995b = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: a */
    public void mo2021a(InterfaceC2751b interfaceC2751b) {
        synchronized (this.f994a) {
            if (interfaceC2751b.equals(this.f996c)) {
                this.f998e = RequestCoordinator.RequestState.SUCCESS;
            } else if (interfaceC2751b.equals(this.f997d)) {
                this.f999f = RequestCoordinator.RequestState.SUCCESS;
            }
            RequestCoordinator requestCoordinator = this.f995b;
            if (requestCoordinator != null) {
                requestCoordinator.mo2021a(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: b */
    public boolean mo2022b(InterfaceC2751b interfaceC2751b) {
        boolean z3;
        synchronized (this.f994a) {
            z3 = m2049n() && m2046k(interfaceC2751b);
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, p016c0.InterfaceC2751b
    /* renamed from: c */
    public boolean mo1614c() {
        boolean z3;
        synchronized (this.f994a) {
            z3 = this.f996c.mo1614c() || this.f997d.mo1614c();
        }
        return z3;
    }

    @Override // p016c0.InterfaceC2751b
    public void clear() {
        synchronized (this.f994a) {
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f998e = requestState;
            this.f996c.clear();
            if (this.f999f != requestState) {
                this.f999f = requestState;
                this.f997d.clear();
            }
        }
    }

    @Override // p016c0.InterfaceC2751b
    /* renamed from: d */
    public boolean mo1615d(InterfaceC2751b interfaceC2751b) {
        if (!(interfaceC2751b instanceof C2898a)) {
            return false;
        }
        C2898a c2898a = (C2898a) interfaceC2751b;
        return this.f996c.mo1615d(c2898a.f996c) && this.f997d.mo1615d(c2898a.f997d);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: e */
    public void mo2023e(InterfaceC2751b interfaceC2751b) {
        synchronized (this.f994a) {
            if (interfaceC2751b.equals(this.f997d)) {
                this.f999f = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f995b;
                if (requestCoordinator != null) {
                    requestCoordinator.mo2023e(this);
                }
                return;
            }
            this.f998e = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator.RequestState requestState = this.f999f;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.f999f = requestState2;
                this.f997d.mo1617h();
            }
        }
    }

    @Override // p016c0.InterfaceC2751b
    /* renamed from: f */
    public boolean mo1616f() {
        boolean z3;
        synchronized (this.f994a) {
            RequestCoordinator.RequestState requestState = this.f998e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
            z3 = requestState == requestState2 && this.f999f == requestState2;
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: g */
    public boolean mo2024g(InterfaceC2751b interfaceC2751b) {
        boolean z3;
        synchronized (this.f994a) {
            z3 = m2047l() && m2046k(interfaceC2751b);
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f994a) {
            RequestCoordinator requestCoordinator = this.f995b;
            root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
        }
        return root;
    }

    @Override // p016c0.InterfaceC2751b
    /* renamed from: h */
    public void mo1617h() {
        synchronized (this.f994a) {
            RequestCoordinator.RequestState requestState = this.f998e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.f998e = requestState2;
                this.f996c.mo1617h();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: i */
    public boolean mo2025i(InterfaceC2751b interfaceC2751b) {
        boolean z3;
        synchronized (this.f994a) {
            z3 = m2048m() && m2046k(interfaceC2751b);
        }
        return z3;
    }

    @Override // p016c0.InterfaceC2751b
    public boolean isRunning() {
        boolean z3;
        synchronized (this.f994a) {
            RequestCoordinator.RequestState requestState = this.f998e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            z3 = requestState == requestState2 || this.f999f == requestState2;
        }
        return z3;
    }

    @Override // p016c0.InterfaceC2751b
    /* renamed from: j */
    public boolean mo1618j() {
        boolean z3;
        synchronized (this.f994a) {
            RequestCoordinator.RequestState requestState = this.f998e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
            z3 = requestState == requestState2 || this.f999f == requestState2;
        }
        return z3;
    }

    /* renamed from: k */
    public final boolean m2046k(InterfaceC2751b interfaceC2751b) {
        return interfaceC2751b.equals(this.f996c) || (this.f998e == RequestCoordinator.RequestState.FAILED && interfaceC2751b.equals(this.f997d));
    }

    /* renamed from: l */
    public final boolean m2047l() {
        RequestCoordinator requestCoordinator = this.f995b;
        return requestCoordinator == null || requestCoordinator.mo2024g(this);
    }

    /* renamed from: m */
    public final boolean m2048m() {
        RequestCoordinator requestCoordinator = this.f995b;
        return requestCoordinator == null || requestCoordinator.mo2025i(this);
    }

    /* renamed from: n */
    public final boolean m2049n() {
        RequestCoordinator requestCoordinator = this.f995b;
        return requestCoordinator == null || requestCoordinator.mo2022b(this);
    }

    /* renamed from: o */
    public void m2050o(InterfaceC2751b interfaceC2751b, InterfaceC2751b interfaceC2751b2) {
        this.f996c = interfaceC2751b;
        this.f997d = interfaceC2751b2;
    }

    @Override // p016c0.InterfaceC2751b
    public void pause() {
        synchronized (this.f994a) {
            RequestCoordinator.RequestState requestState = this.f998e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState == requestState2) {
                this.f998e = RequestCoordinator.RequestState.PAUSED;
                this.f996c.pause();
            }
            if (this.f999f == requestState2) {
                this.f999f = RequestCoordinator.RequestState.PAUSED;
                this.f997d.pause();
            }
        }
    }
}
