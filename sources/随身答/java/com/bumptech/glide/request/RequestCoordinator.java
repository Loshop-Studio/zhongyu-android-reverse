package com.bumptech.glide.request;

import p002a1.InterfaceC0010b;

/* loaded from: classes3.dex */
public interface RequestCoordinator {

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* renamed from: a */
        public final boolean f3610a;

        RequestState(boolean z9) {
            this.f3610a = z9;
        }

        /* renamed from: a */
        public boolean m3348a() {
            return this.f3610a;
        }
    }

    /* renamed from: a */
    boolean mo3343a(InterfaceC0010b interfaceC0010b);

    /* renamed from: b */
    boolean mo71b();

    /* renamed from: c */
    boolean mo3344c(InterfaceC0010b interfaceC0010b);

    /* renamed from: d */
    void mo3345d(InterfaceC0010b interfaceC0010b);

    /* renamed from: f */
    void mo3346f(InterfaceC0010b interfaceC0010b);

    RequestCoordinator getRoot();

    /* renamed from: h */
    boolean mo3347h(InterfaceC0010b interfaceC0010b);
}
