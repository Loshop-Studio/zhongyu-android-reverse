package anet.channel.session;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* renamed from: anet.channel.session.c */
/* loaded from: classes3.dex */
final class C5043c implements HostnameVerifier {

    /* renamed from: a */
    final /* synthetic */ String f2571a;

    public C5043c(String str) {
        this.f2571a = str;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        return HttpsURLConnection.getDefaultHostnameVerifier().verify(this.f2571a, sSLSession);
    }
}
