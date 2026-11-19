package com.bumptech.glide.request;

import p016c0.InterfaceC2751b;

/* loaded from: classes2.dex */
public interface RequestCoordinator {

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* renamed from: a */
        public final boolean f956a;

        RequestState(boolean z3) {
            this.f956a = z3;
        }

        /* renamed from: a */
        public boolean m2026a() {
            return this.f956a;
        }
    }

    /* renamed from: a */
    void mo2021a(InterfaceC2751b interfaceC2751b);

    /* renamed from: b */
    boolean mo2022b(InterfaceC2751b interfaceC2751b);

    /* renamed from: c */
    boolean mo1614c();

    /* renamed from: e */
    void mo2023e(InterfaceC2751b interfaceC2751b);

    /* renamed from: g */
    boolean mo2024g(InterfaceC2751b interfaceC2751b);

    RequestCoordinator getRoot();

    /* renamed from: i */
    boolean mo2025i(InterfaceC2751b interfaceC2751b);
}
