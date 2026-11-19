package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;
import p181x0.InterfaceC7824b;

/* renamed from: com.bumptech.glide.request.b */
/* loaded from: classes3.dex */
public class C4743b implements RequestCoordinator, InterfaceC7824b {

    /* renamed from: a */
    public final RequestCoordinator f2657a;

    /* renamed from: b */
    public final Object f2658b;

    /* renamed from: c */
    public volatile InterfaceC7824b f2659c;

    /* renamed from: d */
    public volatile InterfaceC7824b f2660d;

    /* renamed from: e */
    public RequestCoordinator.RequestState f2661e;

    /* renamed from: f */
    public RequestCoordinator.RequestState f2662f;

    /* renamed from: g */
    public boolean f2663g;

    public C4743b(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f2661e = requestState;
        this.f2662f = requestState;
        this.f2658b = obj;
        this.f2657a = requestCoordinator;
    }

    /* renamed from: j */
    private boolean m2926j() {
        RequestCoordinator requestCoordinator = this.f2657a;
        return requestCoordinator == null || requestCoordinator.mo2888c(this);
    }

    /* renamed from: k */
    private boolean m2927k() {
        RequestCoordinator requestCoordinator = this.f2657a;
        return requestCoordinator == null || requestCoordinator.mo2887b(this);
    }

    /* renamed from: l */
    private boolean m2928l() {
        RequestCoordinator requestCoordinator = this.f2657a;
        return requestCoordinator == null || requestCoordinator.mo2890f(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, p181x0.InterfaceC7824b
    /* renamed from: a */
    public boolean mo2886a() {
        boolean z6;
        synchronized (this.f2658b) {
            try {
                z6 = this.f2660d.mo2886a() || this.f2659c.mo2886a();
            } finally {
            }
        }
        return z6;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: b */
    public boolean mo2887b(InterfaceC7824b interfaceC7824b) {
        boolean z6;
        synchronized (this.f2658b) {
            try {
                z6 = m2927k() && interfaceC7824b.equals(this.f2659c) && !mo2886a();
            } finally {
            }
        }
        return z6;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: c */
    public boolean mo2888c(InterfaceC7824b interfaceC7824b) {
        boolean z6;
        synchronized (this.f2658b) {
            try {
                z6 = m2926j() && interfaceC7824b.equals(this.f2659c) && this.f2661e != RequestCoordinator.RequestState.PAUSED;
            } finally {
            }
        }
        return z6;
    }

    @Override // p181x0.InterfaceC7824b
    public void clear() {
        synchronized (this.f2658b) {
            this.f2663g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f2661e = requestState;
            this.f2662f = requestState;
            this.f2660d.clear();
            this.f2659c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: d */
    public void mo2889d(InterfaceC7824b interfaceC7824b) {
        synchronized (this.f2658b) {
            try {
                if (interfaceC7824b.equals(this.f2660d)) {
                    this.f2662f = RequestCoordinator.RequestState.SUCCESS;
                    return;
                }
                this.f2661e = RequestCoordinator.RequestState.SUCCESS;
                RequestCoordinator requestCoordinator = this.f2657a;
                if (requestCoordinator != null) {
                    requestCoordinator.mo2889d(this);
                }
                if (!this.f2662f.m2893b()) {
                    this.f2660d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p181x0.InterfaceC7824b
    /* renamed from: e */
    public boolean mo2900e() {
        boolean z6;
        synchronized (this.f2658b) {
            z6 = this.f2661e == RequestCoordinator.RequestState.CLEARED;
        }
        return z6;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: f */
    public boolean mo2890f(InterfaceC7824b interfaceC7824b) {
        boolean z6;
        synchronized (this.f2658b) {
            try {
                z6 = m2928l() && (interfaceC7824b.equals(this.f2659c) || this.f2661e != RequestCoordinator.RequestState.SUCCESS);
            } finally {
            }
        }
        return z6;
    }

    @Override // p181x0.InterfaceC7824b
    /* renamed from: g */
    public boolean mo2902g(InterfaceC7824b interfaceC7824b) {
        if (interfaceC7824b instanceof C4743b) {
            C4743b c4743b = (C4743b) interfaceC7824b;
            if (this.f2659c != null ? this.f2659c.mo2902g(c4743b.f2659c) : c4743b.f2659c == null) {
                if (this.f2660d == null) {
                    if (c4743b.f2660d == null) {
                        return true;
                    }
                } else if (this.f2660d.mo2902g(c4743b.f2660d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f2658b) {
            try {
                RequestCoordinator requestCoordinator = this.f2657a;
                root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: h */
    public void mo2891h(InterfaceC7824b interfaceC7824b) {
        synchronized (this.f2658b) {
            try {
                if (!interfaceC7824b.equals(this.f2659c)) {
                    this.f2662f = RequestCoordinator.RequestState.FAILED;
                    return;
                }
                this.f2661e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f2657a;
                if (requestCoordinator != null) {
                    requestCoordinator.mo2891h(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p181x0.InterfaceC7824b
    /* renamed from: i */
    public void mo2904i() {
        synchronized (this.f2658b) {
            try {
                this.f2663g = true;
                try {
                    if (this.f2661e != RequestCoordinator.RequestState.SUCCESS) {
                        RequestCoordinator.RequestState requestState = this.f2662f;
                        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState != requestState2) {
                            this.f2662f = requestState2;
                            this.f2660d.mo2904i();
                        }
                    }
                    if (this.f2663g) {
                        RequestCoordinator.RequestState requestState3 = this.f2661e;
                        RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState3 != requestState4) {
                            this.f2661e = requestState4;
                            this.f2659c.mo2904i();
                        }
                    }
                    this.f2663g = false;
                } catch (Throwable th) {
                    this.f2663g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p181x0.InterfaceC7824b
    public boolean isComplete() {
        boolean z6;
        synchronized (this.f2658b) {
            z6 = this.f2661e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z6;
    }

    @Override // p181x0.InterfaceC7824b
    public boolean isRunning() {
        boolean z6;
        synchronized (this.f2658b) {
            z6 = this.f2661e == RequestCoordinator.RequestState.RUNNING;
        }
        return z6;
    }

    /* renamed from: m */
    public void m2929m(InterfaceC7824b interfaceC7824b, InterfaceC7824b interfaceC7824b2) {
        this.f2659c = interfaceC7824b;
        this.f2660d = interfaceC7824b2;
    }

    @Override // p181x0.InterfaceC7824b
    public void pause() {
        synchronized (this.f2658b) {
            try {
                if (!this.f2662f.m2893b()) {
                    this.f2662f = RequestCoordinator.RequestState.PAUSED;
                    this.f2660d.pause();
                }
                if (!this.f2661e.m2893b()) {
                    this.f2661e = RequestCoordinator.RequestState.PAUSED;
                    this.f2659c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
