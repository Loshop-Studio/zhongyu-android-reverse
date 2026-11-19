package com.bumptech.glide.request;

import p069d0.InterfaceC8270b;

/* loaded from: classes3.dex */
public interface RequestCoordinator {

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* renamed from: a */
        public final boolean f3254a;

        RequestState(boolean z10) {
            this.f3254a = z10;
        }

        /* renamed from: b */
        public boolean m3157b() {
            return this.f3254a;
        }
    }

    /* renamed from: a */
    boolean mo3150a();

    /* renamed from: b */
    boolean mo3151b(InterfaceC8270b interfaceC8270b);

    /* renamed from: c */
    boolean mo3152c(InterfaceC8270b interfaceC8270b);

    /* renamed from: d */
    void mo3153d(InterfaceC8270b interfaceC8270b);

    /* renamed from: f */
    void mo3154f(InterfaceC8270b interfaceC8270b);

    RequestCoordinator getRoot();

    /* renamed from: h */
    boolean mo3155h(InterfaceC8270b interfaceC8270b);
}
