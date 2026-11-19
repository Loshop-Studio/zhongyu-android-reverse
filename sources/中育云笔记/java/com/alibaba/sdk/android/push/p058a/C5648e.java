package com.alibaba.sdk.android.push.p058a;

import com.alibaba.sdk.android.push.PushControlService;
import com.alibaba.sdk.android.push.p064e.C5666a;

/* renamed from: com.alibaba.sdk.android.push.a.e */
/* loaded from: classes3.dex */
public class C5648e implements PushControlService {

    /* renamed from: com.alibaba.sdk.android.push.a.e$a */
    public static class a {

        /* renamed from: a */
        private static final C5648e f4211a = new C5648e();
    }

    private C5648e() {
    }

    /* renamed from: a */
    public static C5648e m3604a() {
        return a.f4211a;
    }

    @Override // com.alibaba.sdk.android.push.PushControlService
    public void disconnect() {
        C5666a.m3645a().m3660f();
    }

    @Override // com.alibaba.sdk.android.push.PushControlService
    public boolean isConnected() {
        return C5666a.m3645a().m3657c();
    }

    @Override // com.alibaba.sdk.android.push.PushControlService
    public void reconnect() {
        C5666a.m3645a().m3658d();
    }

    @Override // com.alibaba.sdk.android.push.PushControlService
    public void reset() {
        C5666a.m3645a().m3659e();
    }

    @Override // com.alibaba.sdk.android.push.PushControlService
    public void setConnectionChangeListener(PushControlService.ConnectionChangeListener connectionChangeListener) {
        C5666a.m3645a().m3654a(connectionChangeListener);
    }
}
