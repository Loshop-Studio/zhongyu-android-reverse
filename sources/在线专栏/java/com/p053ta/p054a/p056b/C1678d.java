package com.p053ta.p054a.p056b;

import android.text.TextUtils;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* renamed from: com.ta.a.b.d */
/* loaded from: classes.dex */
class C1678d implements HostnameVerifier {

    /* renamed from: b */
    public String f7437b;

    public C1678d(String str) {
        this.f7437b = str;
    }

    public boolean equals(Object obj) {
        if (TextUtils.isEmpty(this.f7437b) || !(obj instanceof C1678d)) {
            return false;
        }
        String str = ((C1678d) obj).f7437b;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f7437b.equals(str);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        return HttpsURLConnection.getDefaultHostnameVerifier().verify(this.f7437b, sSLSession);
    }
}
