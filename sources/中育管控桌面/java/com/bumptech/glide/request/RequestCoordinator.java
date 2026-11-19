package com.bumptech.glide.request;

import p181x0.InterfaceC7824b;

/* loaded from: classes3.dex */
public interface RequestCoordinator {

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* renamed from: a */
        public final boolean f2612a;

        RequestState(boolean z6) {
            this.f2612a = z6;
        }

        /* renamed from: b */
        public boolean m2893b() {
            return this.f2612a;
        }
    }

    /* renamed from: a */
    boolean mo2886a();

    /* renamed from: b */
    boolean mo2887b(InterfaceC7824b interfaceC7824b);

    /* renamed from: c */
    boolean mo2888c(InterfaceC7824b interfaceC7824b);

    /* renamed from: d */
    void mo2889d(InterfaceC7824b interfaceC7824b);

    /* renamed from: f */
    boolean mo2890f(InterfaceC7824b interfaceC7824b);

    RequestCoordinator getRoot();

    /* renamed from: h */
    void mo2891h(InterfaceC7824b interfaceC7824b);
}
