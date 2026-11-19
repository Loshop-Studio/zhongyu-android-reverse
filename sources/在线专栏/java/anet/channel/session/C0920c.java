package anet.channel.session;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* renamed from: anet.channel.session.c */
/* loaded from: classes.dex */
final class C0920c implements HostnameVerifier {

    /* renamed from: a */
    final /* synthetic */ String f5293a;

    C0920c(String str) {
        this.f5293a = str;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        return HttpsURLConnection.getDefaultHostnameVerifier().verify(this.f5293a, sSLSession);
    }
}
