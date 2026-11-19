package com.bumptech.glide.request;

import p073e1.InterfaceC7325b;

/* loaded from: classes3.dex */
public interface RequestCoordinator {

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* renamed from: a */
        public final boolean f3821a;

        RequestState(boolean z9) {
            this.f3821a = z9;
        }

        /* renamed from: f */
        public boolean m3713f() {
            return this.f3821a;
        }
    }

    /* renamed from: b */
    boolean mo3706b();

    /* renamed from: c */
    boolean mo3707c(InterfaceC7325b interfaceC7325b);

    /* renamed from: d */
    boolean mo3708d(InterfaceC7325b interfaceC7325b);

    /* renamed from: g */
    void mo3709g(InterfaceC7325b interfaceC7325b);

    RequestCoordinator getRoot();

    /* renamed from: h */
    boolean mo3710h(InterfaceC7325b interfaceC7325b);

    /* renamed from: i */
    void mo3711i(InterfaceC7325b interfaceC7325b);
}
