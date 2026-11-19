package anet.channel.session;

import anet.channel.security.ISecurity;
import anet.channel.util.ALog;
import org.android.spdy.AccsSSLCallback;
import org.android.spdy.SpdyProtocol;

/* renamed from: anet.channel.session.j */
/* loaded from: classes.dex */
class C0927j implements AccsSSLCallback {

    /* renamed from: a */
    final /* synthetic */ TnetSpdySession f5304a;

    C0927j(TnetSpdySession tnetSpdySession) {
        this.f5304a = tnetSpdySession;
    }

    @Override // org.android.spdy.AccsSSLCallback
    public byte[] getSSLPublicKey(int i4, byte[] bArr) {
        byte[] bArrDecrypt;
        try {
            TnetSpdySession tnetSpdySession = this.f5304a;
            bArrDecrypt = tnetSpdySession.f5276G.decrypt(tnetSpdySession.f4990a, ISecurity.CIPHER_ALGORITHM_AES128, SpdyProtocol.TNET_PUBKEY_SG_KEY, bArr);
            if (bArrDecrypt != null) {
                try {
                    if (ALog.isPrintLog(2)) {
                        ALog.m4639i("getSSLPublicKey", null, "decrypt", new String(bArrDecrypt));
                    }
                } catch (Throwable th) {
                    th = th;
                    ALog.m4637e("awcn.TnetSpdySession", "getSSLPublicKey", null, th, new Object[0]);
                    return bArrDecrypt;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bArrDecrypt = null;
        }
        return bArrDecrypt;
    }
}
