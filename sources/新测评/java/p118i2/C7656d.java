package p118i2;

import android.text.TextUtils;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* renamed from: i2.d */
/* loaded from: classes4.dex */
public class C7656d implements HostnameVerifier {

    /* renamed from: a */
    public String f12913a;

    public C7656d(String str) {
        this.f12913a = str;
    }

    public boolean equals(Object obj) {
        if (TextUtils.isEmpty(this.f12913a) || !(obj instanceof C7656d)) {
            return false;
        }
        String str = ((C7656d) obj).f12913a;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f12913a.equals(str);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        return HttpsURLConnection.getDefaultHostnameVerifier().verify(this.f12913a, sSLSession);
    }
}
