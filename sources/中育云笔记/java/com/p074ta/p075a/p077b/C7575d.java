package com.p074ta.p075a.p077b;

import android.text.TextUtils;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* renamed from: com.ta.a.b.d */
/* loaded from: classes5.dex */
class C7575d implements HostnameVerifier {

    /* renamed from: b */
    public String f12835b;

    public C7575d(String str) {
        this.f12835b = str;
    }

    public boolean equals(Object obj) {
        if (TextUtils.isEmpty(this.f12835b) || !(obj instanceof C7575d)) {
            return false;
        }
        String str = ((C7575d) obj).f12835b;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f12835b.equals(str);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        return HttpsURLConnection.getDefaultHostnameVerifier().verify(this.f12835b, sSLSession);
    }
}
