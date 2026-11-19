package com.tencent.smtt.sdk;

import com.tencent.tbs.video.interfaces.IUserStateChangedListener;

/* renamed from: com.tencent.smtt.sdk.bb */
/* loaded from: classes4.dex */
class C6803bb implements IUserStateChangedListener {

    /* renamed from: a */
    final /* synthetic */ C6802ba f6847a;

    public C6803bb(C6802ba c6802ba) {
        this.f6847a = c6802ba;
    }

    @Override // com.tencent.tbs.video.interfaces.IUserStateChangedListener
    public void onUserStateChanged() {
        this.f6847a.f6843a.m6141c();
    }
}
