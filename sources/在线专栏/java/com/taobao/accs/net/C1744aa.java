package com.taobao.accs.net;

import com.taobao.accs.utl.UtilityImpl;
import org.android.spdy.AccsSSLCallback;

/* renamed from: com.taobao.accs.net.aa */
/* loaded from: classes.dex */
class C1744aa implements AccsSSLCallback {

    /* renamed from: a */
    final /* synthetic */ C1766w f7653a;

    C1744aa(C1766w c1766w) {
        this.f7653a = c1766w;
    }

    @Override // org.android.spdy.AccsSSLCallback
    public byte[] getSSLPublicKey(int i4, byte[] bArr) {
        return UtilityImpl.m6111a();
    }
}
