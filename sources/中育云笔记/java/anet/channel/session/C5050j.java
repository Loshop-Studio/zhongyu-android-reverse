package anet.channel.session;

import anet.channel.security.ISecurity;
import anet.channel.util.ALog;
import org.android.spdy.AccsSSLCallback;
import org.android.spdy.SpdyProtocol;

/* renamed from: anet.channel.session.j */
/* loaded from: classes3.dex */
class C5050j implements AccsSSLCallback {

    /* renamed from: a */
    final /* synthetic */ TnetSpdySession f2582a;

    public C5050j(TnetSpdySession tnetSpdySession) {
        this.f2582a = tnetSpdySession;
    }

    @Override // org.android.spdy.AccsSSLCallback
    public byte[] getSSLPublicKey(int i10, byte[] bArr) {
        byte[] bArrDecrypt;
        try {
            TnetSpdySession tnetSpdySession = this.f2582a;
            bArrDecrypt = tnetSpdySession.f2554G.decrypt(tnetSpdySession.f2268a, ISecurity.CIPHER_ALGORITHM_AES128, SpdyProtocol.TNET_PUBKEY_SG_KEY, bArr);
            if (bArrDecrypt != null) {
                try {
                    if (ALog.isPrintLog(2)) {
                        ALog.m2530i("getSSLPublicKey", null, "decrypt", new String(bArrDecrypt));
                        return bArrDecrypt;
                    }
                } catch (Throwable th) {
                    th = th;
                    ALog.m2528e("awcn.TnetSpdySession", "getSSLPublicKey", null, th, new Object[0]);
                    return bArrDecrypt;
                }
            }
            return bArrDecrypt;
        } catch (Throwable th2) {
            th = th2;
            bArrDecrypt = null;
        }
    }
}
