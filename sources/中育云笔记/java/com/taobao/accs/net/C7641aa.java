package com.taobao.accs.net;

import com.taobao.accs.utl.UtilityImpl;
import org.android.spdy.AccsSSLCallback;

/* renamed from: com.taobao.accs.net.aa */
/* loaded from: classes5.dex */
class C7641aa implements AccsSSLCallback {

    /* renamed from: a */
    final /* synthetic */ C7663w f13051a;

    public C7641aa(C7663w c7663w) {
        this.f13051a = c7663w;
    }

    @Override // org.android.spdy.AccsSSLCallback
    public byte[] getSSLPublicKey(int i10, byte[] bArr) {
        return UtilityImpl.m10137a();
    }
}
