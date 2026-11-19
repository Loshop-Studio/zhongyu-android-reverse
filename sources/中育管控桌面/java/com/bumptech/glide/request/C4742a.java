package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;
import p181x0.InterfaceC7824b;

/* renamed from: com.bumptech.glide.request.a */
/* loaded from: classes3.dex */
public final class C4742a implements RequestCoordinator, InterfaceC7824b {

    /* renamed from: a */
    public final Object f2651a;

    /* renamed from: b */
    public final RequestCoordinator f2652b;

    /* renamed from: c */
    public volatile InterfaceC7824b f2653c;

    /* renamed from: d */
    public volatile InterfaceC7824b f2654d;

    /* renamed from: e */
    public RequestCoordinator.RequestState f2655e;

    /* renamed from: f */
    public RequestCoordinator.RequestState f2656f;

    public C4742a(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f2655e = requestState;
        this.f2656f = requestState;
        this.f2651a = obj;
        this.f2652b = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, p181x0.InterfaceC7824b
    /* renamed from: a */
    public boolean mo2886a() {
        boolean z6;
        synchronized (this.f2651a) {
            try {
                z6 = this.f2653c.mo2886a() || this.f2654d.mo2886a();
            } finally {
            }
        }
        return z6;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: b */
    public boolean mo2887b(InterfaceC7824b interfaceC7824b) {
        boolean z6;
        synchronized (this.f2651a) {
            try {
                z6 = m2923l() && m2921j(interfaceC7824b);
            } finally {
            }
        }
        return z6;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: c */
    public boolean mo2888c(InterfaceC7824b interfaceC7824b) {
        boolean z6;
        synchronized (this.f2651a) {
            try {
                z6 = m2922k() && interfaceC7824b.equals(this.f2653c);
            } finally {
            }
        }
        return z6;
    }

    @Override // p181x0.InterfaceC7824b
    public void clear() {
        synchronized (this.f2651a) {
            try {
                RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
                this.f2655e = requestState;
                this.f2653c.clear();
                if (this.f2656f != requestState) {
                    this.f2656f = requestState;
                    this.f2654d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: d */
    public void mo2889d(InterfaceC7824b interfaceC7824b) {
        synchronized (this.f2651a) {
            try {
                if (interfaceC7824b.equals(this.f2653c)) {
                    this.f2655e = RequestCoordinator.RequestState.SUCCESS;
                } else if (interfaceC7824b.equals(this.f2654d)) {
                    this.f2656f = RequestCoordinator.RequestState.SUCCESS;
                }
                RequestCoordinator requestCoordinator = this.f2652b;
                if (requestCoordinator != null) {
                    requestCoordinator.mo2889d(this);
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
        synchronized (this.f2651a) {
            try {
                RequestCoordinator.RequestState requestState = this.f2655e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
                z6 = requestState == requestState2 && this.f2656f == requestState2;
            } finally {
            }
        }
        return z6;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: f */
    public boolean mo2890f(InterfaceC7824b interfaceC7824b) {
        boolean zM2924m;
        synchronized (this.f2651a) {
            zM2924m = m2924m();
        }
        return zM2924m;
    }

    @Override // p181x0.InterfaceC7824b
    /* renamed from: g */
    public boolean mo2902g(InterfaceC7824b interfaceC7824b) {
        if (interfaceC7824b instanceof C4742a) {
            C4742a c4742a = (C4742a) interfaceC7824b;
            if (this.f2653c.mo2902g(c4742a.f2653c) && this.f2654d.mo2902g(c4742a.f2654d)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f2651a) {
            try {
                RequestCoordinator requestCoordinator = this.f2652b;
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
        synchronized (this.f2651a) {
            try {
                if (interfaceC7824b.equals(this.f2654d)) {
                    this.f2656f = RequestCoordinator.RequestState.FAILED;
                    RequestCoordinator requestCoordinator = this.f2652b;
                    if (requestCoordinator != null) {
                        requestCoordinator.mo2891h(this);
                    }
                    return;
                }
                this.f2655e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator.RequestState requestState = this.f2656f;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f2656f = requestState2;
                    this.f2654d.mo2904i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p181x0.InterfaceC7824b
    /* renamed from: i */
    public void mo2904i() {
        synchronized (this.f2651a) {
            try {
                RequestCoordinator.RequestState requestState = this.f2655e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f2655e = requestState2;
                    this.f2653c.mo2904i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p181x0.InterfaceC7824b
    public boolean isComplete() {
        boolean z6;
        synchronized (this.f2651a) {
            try {
                RequestCoordinator.RequestState requestState = this.f2655e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
                z6 = requestState == requestState2 || this.f2656f == requestState2;
            } finally {
            }
        }
        return z6;
    }

    @Override // p181x0.InterfaceC7824b
    public boolean isRunning() {
        boolean z6;
        synchronized (this.f2651a) {
            try {
                RequestCoordinator.RequestState requestState = this.f2655e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                z6 = requestState == requestState2 || this.f2656f == requestState2;
            } finally {
            }
        }
        return z6;
    }

    /* renamed from: j */
    public final boolean m2921j(InterfaceC7824b interfaceC7824b) {
        RequestCoordinator.RequestState requestState = this.f2655e;
        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.FAILED;
        if (requestState != requestState2) {
            return interfaceC7824b.equals(this.f2653c);
        }
        if (!interfaceC7824b.equals(this.f2654d)) {
            return false;
        }
        RequestCoordinator.RequestState requestState3 = this.f2656f;
        return requestState3 == RequestCoordinator.RequestState.SUCCESS || requestState3 == requestState2;
    }

    /* renamed from: k */
    public final boolean m2922k() {
        RequestCoordinator requestCoordinator = this.f2652b;
        return requestCoordinator == null || requestCoordinator.mo2888c(this);
    }

    /* renamed from: l */
    public final boolean m2923l() {
        RequestCoordinator requestCoordinator = this.f2652b;
        return requestCoordinator == null || requestCoordinator.mo2887b(this);
    }

    /* renamed from: m */
    public final boolean m2924m() {
        RequestCoordinator requestCoordinator = this.f2652b;
        return requestCoordinator == null || requestCoordinator.mo2890f(this);
    }

    /* renamed from: n */
    public void m2925n(InterfaceC7824b interfaceC7824b, InterfaceC7824b interfaceC7824b2) {
        this.f2653c = interfaceC7824b;
        this.f2654d = interfaceC7824b2;
    }

    @Override // p181x0.InterfaceC7824b
    public void pause() {
        synchronized (this.f2651a) {
            try {
                RequestCoordinator.RequestState requestState = this.f2655e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState == requestState2) {
                    this.f2655e = RequestCoordinator.RequestState.PAUSED;
                    this.f2653c.pause();
                }
                if (this.f2656f == requestState2) {
                    this.f2656f = RequestCoordinator.RequestState.PAUSED;
                    this.f2654d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
