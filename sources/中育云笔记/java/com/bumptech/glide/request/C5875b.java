package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;
import p428z0.InterfaceC11953b;

/* renamed from: com.bumptech.glide.request.b */
/* loaded from: classes3.dex */
public class C5875b implements RequestCoordinator, InterfaceC11953b {

    /* renamed from: a */
    public final RequestCoordinator f5069a;

    /* renamed from: b */
    public final Object f5070b;

    /* renamed from: c */
    public volatile InterfaceC11953b f5071c;

    /* renamed from: d */
    public volatile InterfaceC11953b f5072d;

    /* renamed from: e */
    public RequestCoordinator.RequestState f5073e;

    /* renamed from: f */
    public RequestCoordinator.RequestState f5074f;

    /* renamed from: g */
    public boolean f5075g;

    public C5875b(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f5073e = requestState;
        this.f5074f = requestState;
        this.f5070b = obj;
        this.f5069a = requestCoordinator;
    }

    /* renamed from: j */
    private boolean m4392j() {
        RequestCoordinator requestCoordinator = this.f5069a;
        return requestCoordinator == null || requestCoordinator.mo4357f(this);
    }

    /* renamed from: k */
    private boolean m4393k() {
        RequestCoordinator requestCoordinator = this.f5069a;
        return requestCoordinator == null || requestCoordinator.mo4358g(this);
    }

    /* renamed from: l */
    private boolean m4394l() {
        RequestCoordinator requestCoordinator = this.f5069a;
        return requestCoordinator == null || requestCoordinator.mo4356d(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, p428z0.InterfaceC11953b
    /* renamed from: a */
    public boolean mo4353a() {
        boolean z10;
        synchronized (this.f5070b) {
            try {
                z10 = this.f5072d.mo4353a() || this.f5071c.mo4353a();
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: b */
    public void mo4354b(InterfaceC11953b interfaceC11953b) {
        synchronized (this.f5070b) {
            try {
                if (!interfaceC11953b.equals(this.f5071c)) {
                    this.f5074f = RequestCoordinator.RequestState.FAILED;
                    return;
                }
                this.f5073e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f5069a;
                if (requestCoordinator != null) {
                    requestCoordinator.mo4354b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: c */
    public void mo4355c(InterfaceC11953b interfaceC11953b) {
        synchronized (this.f5070b) {
            try {
                if (interfaceC11953b.equals(this.f5072d)) {
                    this.f5074f = RequestCoordinator.RequestState.SUCCESS;
                    return;
                }
                this.f5073e = RequestCoordinator.RequestState.SUCCESS;
                RequestCoordinator requestCoordinator = this.f5069a;
                if (requestCoordinator != null) {
                    requestCoordinator.mo4355c(this);
                }
                if (!this.f5074f.m4360c()) {
                    this.f5072d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p428z0.InterfaceC11953b
    public void clear() {
        synchronized (this.f5070b) {
            this.f5075g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f5073e = requestState;
            this.f5074f = requestState;
            this.f5072d.clear();
            this.f5071c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: d */
    public boolean mo4356d(InterfaceC11953b interfaceC11953b) {
        boolean z10;
        synchronized (this.f5070b) {
            try {
                z10 = m4394l() && (interfaceC11953b.equals(this.f5071c) || this.f5073e != RequestCoordinator.RequestState.SUCCESS);
            } finally {
            }
        }
        return z10;
    }

    @Override // p428z0.InterfaceC11953b
    /* renamed from: e */
    public boolean mo4366e() {
        boolean z10;
        synchronized (this.f5070b) {
            z10 = this.f5073e == RequestCoordinator.RequestState.CLEARED;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: f */
    public boolean mo4357f(InterfaceC11953b interfaceC11953b) {
        boolean z10;
        synchronized (this.f5070b) {
            try {
                z10 = m4392j() && interfaceC11953b.equals(this.f5071c) && this.f5073e != RequestCoordinator.RequestState.PAUSED;
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: g */
    public boolean mo4358g(InterfaceC11953b interfaceC11953b) {
        boolean z10;
        synchronized (this.f5070b) {
            try {
                z10 = m4393k() && interfaceC11953b.equals(this.f5071c) && !mo4353a();
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f5070b) {
            try {
                RequestCoordinator requestCoordinator = this.f5069a;
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
        synchronized (this.f5070b) {
            try {
                this.f5075g = true;
                try {
                    if (this.f5073e != RequestCoordinator.RequestState.SUCCESS) {
                        RequestCoordinator.RequestState requestState = this.f5074f;
                        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState != requestState2) {
                            this.f5074f = requestState2;
                            this.f5072d.mo4369h();
                        }
                    }
                    if (this.f5075g) {
                        RequestCoordinator.RequestState requestState3 = this.f5073e;
                        RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState3 != requestState4) {
                            this.f5073e = requestState4;
                            this.f5071c.mo4369h();
                        }
                    }
                    this.f5075g = false;
                } catch (Throwable th) {
                    this.f5075g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p428z0.InterfaceC11953b
    /* renamed from: i */
    public boolean mo4370i(InterfaceC11953b interfaceC11953b) {
        if (interfaceC11953b instanceof C5875b) {
            C5875b c5875b = (C5875b) interfaceC11953b;
            if (this.f5071c != null ? this.f5071c.mo4370i(c5875b.f5071c) : c5875b.f5071c == null) {
                if (this.f5072d == null) {
                    if (c5875b.f5072d == null) {
                        return true;
                    }
                } else if (this.f5072d.mo4370i(c5875b.f5072d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p428z0.InterfaceC11953b
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f5070b) {
            z10 = this.f5073e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z10;
    }

    @Override // p428z0.InterfaceC11953b
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f5070b) {
            z10 = this.f5073e == RequestCoordinator.RequestState.RUNNING;
        }
        return z10;
    }

    /* renamed from: m */
    public void m4395m(InterfaceC11953b interfaceC11953b, InterfaceC11953b interfaceC11953b2) {
        this.f5071c = interfaceC11953b;
        this.f5072d = interfaceC11953b2;
    }

    @Override // p428z0.InterfaceC11953b
    public void pause() {
        synchronized (this.f5070b) {
            try {
                if (!this.f5074f.m4360c()) {
                    this.f5074f = RequestCoordinator.RequestState.PAUSED;
                    this.f5072d.pause();
                }
                if (!this.f5073e.m4360c()) {
                    this.f5073e = RequestCoordinator.RequestState.PAUSED;
                    this.f5071c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
