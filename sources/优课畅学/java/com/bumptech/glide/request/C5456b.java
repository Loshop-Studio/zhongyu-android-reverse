package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;
import p069d0.InterfaceC8270b;

/* renamed from: com.bumptech.glide.request.b */
/* loaded from: classes3.dex */
public class C5456b implements RequestCoordinator, InterfaceC8270b {

    /* renamed from: a */
    public final RequestCoordinator f3299a;

    /* renamed from: b */
    public final Object f3300b;

    /* renamed from: c */
    public volatile InterfaceC8270b f3301c;

    /* renamed from: d */
    public volatile InterfaceC8270b f3302d;

    /* renamed from: e */
    public RequestCoordinator.RequestState f3303e;

    /* renamed from: f */
    public RequestCoordinator.RequestState f3304f;

    /* renamed from: g */
    public boolean f3305g;

    public C5456b(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f3303e = requestState;
        this.f3304f = requestState;
        this.f3300b = obj;
        this.f3299a = requestCoordinator;
    }

    /* renamed from: j */
    private boolean m3190j() {
        RequestCoordinator requestCoordinator = this.f3299a;
        return requestCoordinator == null || requestCoordinator.mo3152c(this);
    }

    /* renamed from: k */
    private boolean m3191k() {
        RequestCoordinator requestCoordinator = this.f3299a;
        return requestCoordinator == null || requestCoordinator.mo3155h(this);
    }

    /* renamed from: l */
    private boolean m3192l() {
        RequestCoordinator requestCoordinator = this.f3299a;
        return requestCoordinator == null || requestCoordinator.mo3151b(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, p069d0.InterfaceC8270b
    /* renamed from: a */
    public boolean mo3150a() {
        boolean z10;
        synchronized (this.f3300b) {
            try {
                z10 = this.f3302d.mo3150a() || this.f3301c.mo3150a();
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: b */
    public boolean mo3151b(InterfaceC8270b interfaceC8270b) {
        boolean z10;
        synchronized (this.f3300b) {
            try {
                z10 = m3192l() && (interfaceC8270b.equals(this.f3301c) || this.f3303e != RequestCoordinator.RequestState.SUCCESS);
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: c */
    public boolean mo3152c(InterfaceC8270b interfaceC8270b) {
        boolean z10;
        synchronized (this.f3300b) {
            try {
                z10 = m3190j() && interfaceC8270b.equals(this.f3301c) && this.f3303e != RequestCoordinator.RequestState.PAUSED;
            } finally {
            }
        }
        return z10;
    }

    @Override // p069d0.InterfaceC8270b
    public void clear() {
        synchronized (this.f3300b) {
            this.f3305g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f3303e = requestState;
            this.f3304f = requestState;
            this.f3302d.clear();
            this.f3301c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: d */
    public void mo3153d(InterfaceC8270b interfaceC8270b) {
        synchronized (this.f3300b) {
            try {
                if (!interfaceC8270b.equals(this.f3301c)) {
                    this.f3304f = RequestCoordinator.RequestState.FAILED;
                    return;
                }
                this.f3303e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f3299a;
                if (requestCoordinator != null) {
                    requestCoordinator.mo3153d(this);
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
        synchronized (this.f3300b) {
            z10 = this.f3303e == RequestCoordinator.RequestState.CLEARED;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: f */
    public void mo3154f(InterfaceC8270b interfaceC8270b) {
        synchronized (this.f3300b) {
            try {
                if (interfaceC8270b.equals(this.f3302d)) {
                    this.f3304f = RequestCoordinator.RequestState.SUCCESS;
                    return;
                }
                this.f3303e = RequestCoordinator.RequestState.SUCCESS;
                RequestCoordinator requestCoordinator = this.f3299a;
                if (requestCoordinator != null) {
                    requestCoordinator.mo3154f(this);
                }
                if (!this.f3304f.m3157b()) {
                    this.f3302d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p069d0.InterfaceC8270b
    /* renamed from: g */
    public boolean mo3166g(InterfaceC8270b interfaceC8270b) {
        if (interfaceC8270b instanceof C5456b) {
            C5456b c5456b = (C5456b) interfaceC8270b;
            if (this.f3301c != null ? this.f3301c.mo3166g(c5456b.f3301c) : c5456b.f3301c == null) {
                if (this.f3302d == null) {
                    if (c5456b.f3302d == null) {
                        return true;
                    }
                } else if (this.f3302d.mo3166g(c5456b.f3302d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f3300b) {
            try {
                RequestCoordinator requestCoordinator = this.f3299a;
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
        synchronized (this.f3300b) {
            try {
                z10 = m3191k() && interfaceC8270b.equals(this.f3301c) && !mo3150a();
            } finally {
            }
        }
        return z10;
    }

    @Override // p069d0.InterfaceC8270b
    /* renamed from: i */
    public void mo3168i() {
        synchronized (this.f3300b) {
            try {
                this.f3305g = true;
                try {
                    if (this.f3303e != RequestCoordinator.RequestState.SUCCESS) {
                        RequestCoordinator.RequestState requestState = this.f3304f;
                        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState != requestState2) {
                            this.f3304f = requestState2;
                            this.f3302d.mo3168i();
                        }
                    }
                    if (this.f3305g) {
                        RequestCoordinator.RequestState requestState3 = this.f3303e;
                        RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState3 != requestState4) {
                            this.f3303e = requestState4;
                            this.f3301c.mo3168i();
                        }
                    }
                    this.f3305g = false;
                } catch (Throwable th) {
                    this.f3305g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p069d0.InterfaceC8270b
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f3300b) {
            z10 = this.f3303e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z10;
    }

    @Override // p069d0.InterfaceC8270b
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f3300b) {
            z10 = this.f3303e == RequestCoordinator.RequestState.RUNNING;
        }
        return z10;
    }

    /* renamed from: m */
    public void m3193m(InterfaceC8270b interfaceC8270b, InterfaceC8270b interfaceC8270b2) {
        this.f3301c = interfaceC8270b;
        this.f3302d = interfaceC8270b2;
    }

    @Override // p069d0.InterfaceC8270b
    public void pause() {
        synchronized (this.f3300b) {
            try {
                if (!this.f3304f.m3157b()) {
                    this.f3304f = RequestCoordinator.RequestState.PAUSED;
                    this.f3302d.pause();
                }
                if (!this.f3303e.m3157b()) {
                    this.f3303e = RequestCoordinator.RequestState.PAUSED;
                    this.f3301c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
