package com.alibaba.sdk.android.push.p028a;

import com.alibaba.sdk.android.push.PushControlService;
import com.alibaba.sdk.android.push.p034e.C1175a;

/* renamed from: com.alibaba.sdk.android.push.a.e */
/* loaded from: classes.dex */
public class C1157e implements PushControlService {

    /* renamed from: com.alibaba.sdk.android.push.a.e$a */
    private static class a {

        /* renamed from: a */
        private static final C1157e f6687a = new C1157e();
    }

    private C1157e() {
    }

    /* renamed from: a */
    public static C1157e m5153a() {
        return a.f6687a;
    }

    @Override // com.alibaba.sdk.android.push.PushControlService
    public void disconnect() {
        C1175a.m5194a().m5209f();
    }

    @Override // com.alibaba.sdk.android.push.PushControlService
    public boolean isConnected() {
        return C1175a.m5194a().m5206c();
    }

    @Override // com.alibaba.sdk.android.push.PushControlService
    public void reconnect() {
        C1175a.m5194a().m5207d();
    }

    @Override // com.alibaba.sdk.android.push.PushControlService
    public void reset() {
        C1175a.m5194a().m5208e();
    }

    @Override // com.alibaba.sdk.android.push.PushControlService
    public void setConnectionChangeListener(PushControlService.ConnectionChangeListener connectionChangeListener) {
        C1175a.m5194a().m5203a(connectionChangeListener);
    }
}
