package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;
import p016c0.InterfaceC2751b;

/* renamed from: com.bumptech.glide.request.b */
/* loaded from: classes2.dex */
public class C2899b implements RequestCoordinator, InterfaceC2751b {

    /* renamed from: a */
    public final RequestCoordinator f1000a;

    /* renamed from: b */
    public final Object f1001b;

    /* renamed from: c */
    public volatile InterfaceC2751b f1002c;

    /* renamed from: d */
    public volatile InterfaceC2751b f1003d;

    /* renamed from: e */
    public RequestCoordinator.RequestState f1004e;

    /* renamed from: f */
    public RequestCoordinator.RequestState f1005f;

    /* renamed from: g */
    public boolean f1006g;

    public C2899b(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f1004e = requestState;
        this.f1005f = requestState;
        this.f1001b = obj;
        this.f1000a = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: a */
    public void mo2021a(InterfaceC2751b interfaceC2751b) {
        synchronized (this.f1001b) {
            if (interfaceC2751b.equals(this.f1003d)) {
                this.f1005f = RequestCoordinator.RequestState.SUCCESS;
                return;
            }
            this.f1004e = RequestCoordinator.RequestState.SUCCESS;
            RequestCoordinator requestCoordinator = this.f1000a;
            if (requestCoordinator != null) {
                requestCoordinator.mo2021a(this);
            }
            if (!this.f1005f.m2026a()) {
                this.f1003d.clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: b */
    public boolean mo2022b(InterfaceC2751b interfaceC2751b) {
        boolean z3;
        synchronized (this.f1001b) {
            z3 = m2053m() && (interfaceC2751b.equals(this.f1002c) || this.f1004e != RequestCoordinator.RequestState.SUCCESS);
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, p016c0.InterfaceC2751b
    /* renamed from: c */
    public boolean mo1614c() {
        boolean z3;
        synchronized (this.f1001b) {
            z3 = this.f1003d.mo1614c() || this.f1002c.mo1614c();
        }
        return z3;
    }

    @Override // p016c0.InterfaceC2751b
    public void clear() {
        synchronized (this.f1001b) {
            this.f1006g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f1004e = requestState;
            this.f1005f = requestState;
            this.f1003d.clear();
            this.f1002c.clear();
        }
    }

    @Override // p016c0.InterfaceC2751b
    /* renamed from: d */
    public boolean mo1615d(InterfaceC2751b interfaceC2751b) {
        if (!(interfaceC2751b instanceof C2899b)) {
            return false;
        }
        C2899b c2899b = (C2899b) interfaceC2751b;
        if (this.f1002c == null) {
            if (c2899b.f1002c != null) {
                return false;
            }
        } else if (!this.f1002c.mo1615d(c2899b.f1002c)) {
            return false;
        }
        if (this.f1003d == null) {
            if (c2899b.f1003d != null) {
                return false;
            }
        } else if (!this.f1003d.mo1615d(c2899b.f1003d)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: e */
    public void mo2023e(InterfaceC2751b interfaceC2751b) {
        synchronized (this.f1001b) {
            if (!interfaceC2751b.equals(this.f1002c)) {
                this.f1005f = RequestCoordinator.RequestState.FAILED;
                return;
            }
            this.f1004e = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator requestCoordinator = this.f1000a;
            if (requestCoordinator != null) {
                requestCoordinator.mo2023e(this);
            }
        }
    }

    @Override // p016c0.InterfaceC2751b
    /* renamed from: f */
    public boolean mo1616f() {
        boolean z3;
        synchronized (this.f1001b) {
            z3 = this.f1004e == RequestCoordinator.RequestState.CLEARED;
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: g */
    public boolean mo2024g(InterfaceC2751b interfaceC2751b) {
        boolean z3;
        synchronized (this.f1001b) {
            z3 = m2051k() && interfaceC2751b.equals(this.f1002c) && this.f1004e != RequestCoordinator.RequestState.PAUSED;
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f1001b) {
            RequestCoordinator requestCoordinator = this.f1000a;
            root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
        }
        return root;
    }

    @Override // p016c0.InterfaceC2751b
    /* renamed from: h */
    public void mo1617h() {
        synchronized (this.f1001b) {
            this.f1006g = true;
            try {
                if (this.f1004e != RequestCoordinator.RequestState.SUCCESS) {
                    RequestCoordinator.RequestState requestState = this.f1005f;
                    RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState != requestState2) {
                        this.f1005f = requestState2;
                        this.f1003d.mo1617h();
                    }
                }
                if (this.f1006g) {
                    RequestCoordinator.RequestState requestState3 = this.f1004e;
                    RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState3 != requestState4) {
                        this.f1004e = requestState4;
                        this.f1002c.mo1617h();
                    }
                }
            } finally {
                this.f1006g = false;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: i */
    public boolean mo2025i(InterfaceC2751b interfaceC2751b) {
        boolean z3;
        synchronized (this.f1001b) {
            z3 = m2052l() && interfaceC2751b.equals(this.f1002c) && !mo1614c();
        }
        return z3;
    }

    @Override // p016c0.InterfaceC2751b
    public boolean isRunning() {
        boolean z3;
        synchronized (this.f1001b) {
            z3 = this.f1004e == RequestCoordinator.RequestState.RUNNING;
        }
        return z3;
    }

    @Override // p016c0.InterfaceC2751b
    /* renamed from: j */
    public boolean mo1618j() {
        boolean z3;
        synchronized (this.f1001b) {
            z3 = this.f1004e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z3;
    }

    /* renamed from: k */
    public final boolean m2051k() {
        RequestCoordinator requestCoordinator = this.f1000a;
        return requestCoordinator == null || requestCoordinator.mo2024g(this);
    }

    /* renamed from: l */
    public final boolean m2052l() {
        RequestCoordinator requestCoordinator = this.f1000a;
        return requestCoordinator == null || requestCoordinator.mo2025i(this);
    }

    /* renamed from: m */
    public final boolean m2053m() {
        RequestCoordinator requestCoordinator = this.f1000a;
        return requestCoordinator == null || requestCoordinator.mo2022b(this);
    }

    /* renamed from: n */
    public void m2054n(InterfaceC2751b interfaceC2751b, InterfaceC2751b interfaceC2751b2) {
        this.f1002c = interfaceC2751b;
        this.f1003d = interfaceC2751b2;
    }

    @Override // p016c0.InterfaceC2751b
    public void pause() {
        synchronized (this.f1001b) {
            if (!this.f1005f.m2026a()) {
                this.f1005f = RequestCoordinator.RequestState.PAUSED;
                this.f1003d.pause();
            }
            if (!this.f1004e.m2026a()) {
                this.f1004e = RequestCoordinator.RequestState.PAUSED;
                this.f1002c.pause();
            }
        }
    }
}
