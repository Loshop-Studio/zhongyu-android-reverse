package com.bumptech.glide.request;

import p428z0.InterfaceC11953b;

/* loaded from: classes3.dex */
public interface RequestCoordinator {

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* renamed from: c */
        public final boolean f5024c;

        RequestState(boolean z10) {
            this.f5024c = z10;
        }

        /* renamed from: c */
        public boolean m4360c() {
            return this.f5024c;
        }
    }

    /* renamed from: a */
    boolean mo4353a();

    /* renamed from: b */
    void mo4354b(InterfaceC11953b interfaceC11953b);

    /* renamed from: c */
    void mo4355c(InterfaceC11953b interfaceC11953b);

    /* renamed from: d */
    boolean mo4356d(InterfaceC11953b interfaceC11953b);

    /* renamed from: f */
    boolean mo4357f(InterfaceC11953b interfaceC11953b);

    /* renamed from: g */
    boolean mo4358g(InterfaceC11953b interfaceC11953b);

    RequestCoordinator getRoot();
}
