package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;
import p073e1.InterfaceC7325b;

/* renamed from: com.bumptech.glide.request.a */
/* loaded from: classes3.dex */
public final class C5406a implements RequestCoordinator, InterfaceC7325b {

    /* renamed from: a */
    public final Object f3860a;

    /* renamed from: b */
    public final RequestCoordinator f3861b;

    /* renamed from: c */
    public volatile InterfaceC7325b f3862c;

    /* renamed from: d */
    public volatile InterfaceC7325b f3863d;

    /* renamed from: e */
    public RequestCoordinator.RequestState f3864e;

    /* renamed from: f */
    public RequestCoordinator.RequestState f3865f;

    public C5406a(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f3864e = requestState;
        this.f3865f = requestState;
        this.f3860a = obj;
        this.f3861b = requestCoordinator;
    }

    /* renamed from: a */
    public final boolean m3741a(InterfaceC7325b interfaceC7325b) {
        RequestCoordinator.RequestState requestState = this.f3864e;
        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.FAILED;
        if (requestState != requestState2) {
            return interfaceC7325b.equals(this.f3862c);
        }
        if (!interfaceC7325b.equals(this.f3863d)) {
            return false;
        }
        RequestCoordinator.RequestState requestState3 = this.f3865f;
        return requestState3 == RequestCoordinator.RequestState.SUCCESS || requestState3 == requestState2;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, p073e1.InterfaceC7325b
    /* renamed from: b */
    public boolean mo3706b() {
        boolean z9;
        synchronized (this.f3860a) {
            try {
                z9 = this.f3862c.mo3706b() || this.f3863d.mo3706b();
            } finally {
            }
        }
        return z9;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: c */
    public boolean mo3707c(InterfaceC7325b interfaceC7325b) {
        boolean zM3744m;
        synchronized (this.f3860a) {
            zM3744m = m3744m();
        }
        return zM3744m;
    }

    @Override // p073e1.InterfaceC7325b
    public void clear() {
        synchronized (this.f3860a) {
            try {
                RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
                this.f3864e = requestState;
                this.f3862c.clear();
                if (this.f3865f != requestState) {
                    this.f3865f = requestState;
                    this.f3863d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: d */
    public boolean mo3708d(InterfaceC7325b interfaceC7325b) {
        boolean z9;
        synchronized (this.f3860a) {
            try {
                z9 = m3742k() && interfaceC7325b.equals(this.f3862c);
            } finally {
            }
        }
        return z9;
    }

    @Override // p073e1.InterfaceC7325b
    /* renamed from: e */
    public boolean mo3720e(InterfaceC7325b interfaceC7325b) {
        if (interfaceC7325b instanceof C5406a) {
            C5406a c5406a = (C5406a) interfaceC7325b;
            if (this.f3862c.mo3720e(c5406a.f3862c) && this.f3863d.mo3720e(c5406a.f3863d)) {
                return true;
            }
        }
        return false;
    }

    @Override // p073e1.InterfaceC7325b
    /* renamed from: f */
    public boolean mo3721f() {
        boolean z9;
        synchronized (this.f3860a) {
            try {
                RequestCoordinator.RequestState requestState = this.f3864e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
                z9 = requestState == requestState2 && this.f3865f == requestState2;
            } finally {
            }
        }
        return z9;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: g */
    public void mo3709g(InterfaceC7325b interfaceC7325b) {
        synchronized (this.f3860a) {
            try {
                if (interfaceC7325b.equals(this.f3863d)) {
                    this.f3865f = RequestCoordinator.RequestState.FAILED;
                    RequestCoordinator requestCoordinator = this.f3861b;
                    if (requestCoordinator != null) {
                        requestCoordinator.mo3709g(this);
                    }
                    return;
                }
                this.f3864e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator.RequestState requestState = this.f3865f;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f3865f = requestState2;
                    this.f3863d.mo3725j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f3860a) {
            try {
                RequestCoordinator requestCoordinator = this.f3861b;
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
        synchronized (this.f3860a) {
            try {
                z9 = m3743l() && m3741a(interfaceC7325b);
            } finally {
            }
        }
        return z9;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: i */
    public void mo3711i(InterfaceC7325b interfaceC7325b) {
        synchronized (this.f3860a) {
            try {
                if (interfaceC7325b.equals(this.f3862c)) {
                    this.f3864e = RequestCoordinator.RequestState.SUCCESS;
                } else if (interfaceC7325b.equals(this.f3863d)) {
                    this.f3865f = RequestCoordinator.RequestState.SUCCESS;
                }
                RequestCoordinator requestCoordinator = this.f3861b;
                if (requestCoordinator != null) {
                    requestCoordinator.mo3711i(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p073e1.InterfaceC7325b
    public boolean isComplete() {
        boolean z9;
        synchronized (this.f3860a) {
            try {
                RequestCoordinator.RequestState requestState = this.f3864e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
                z9 = requestState == requestState2 || this.f3865f == requestState2;
            } finally {
            }
        }
        return z9;
    }

    @Override // p073e1.InterfaceC7325b
    public boolean isRunning() {
        boolean z9;
        synchronized (this.f3860a) {
            try {
                RequestCoordinator.RequestState requestState = this.f3864e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                z9 = requestState == requestState2 || this.f3865f == requestState2;
            } finally {
            }
        }
        return z9;
    }

    @Override // p073e1.InterfaceC7325b
    /* renamed from: j */
    public void mo3725j() {
        synchronized (this.f3860a) {
            try {
                RequestCoordinator.RequestState requestState = this.f3864e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f3864e = requestState2;
                    this.f3862c.mo3725j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: k */
    public final boolean m3742k() {
        RequestCoordinator requestCoordinator = this.f3861b;
        return requestCoordinator == null || requestCoordinator.mo3708d(this);
    }

    /* renamed from: l */
    public final boolean m3743l() {
        RequestCoordinator requestCoordinator = this.f3861b;
        return requestCoordinator == null || requestCoordinator.mo3710h(this);
    }

    /* renamed from: m */
    public final boolean m3744m() {
        RequestCoordinator requestCoordinator = this.f3861b;
        return requestCoordinator == null || requestCoordinator.mo3707c(this);
    }

    /* renamed from: n */
    public void m3745n(InterfaceC7325b interfaceC7325b, InterfaceC7325b interfaceC7325b2) {
        this.f3862c = interfaceC7325b;
        this.f3863d = interfaceC7325b2;
    }

    @Override // p073e1.InterfaceC7325b
    public void pause() {
        synchronized (this.f3860a) {
            try {
                RequestCoordinator.RequestState requestState = this.f3864e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState == requestState2) {
                    this.f3864e = RequestCoordinator.RequestState.PAUSED;
                    this.f3862c.pause();
                }
                if (this.f3865f == requestState2) {
                    this.f3865f = RequestCoordinator.RequestState.PAUSED;
                    this.f3863d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
