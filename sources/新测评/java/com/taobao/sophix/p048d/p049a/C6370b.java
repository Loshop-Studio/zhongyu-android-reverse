package com.taobao.sophix.p048d.p049a;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* renamed from: com.taobao.sophix.d.a.b */
/* loaded from: classes4.dex */
public class C6370b implements InterfaceC6371c {

    /* renamed from: a */
    private HttpURLConnection f4951a;

    @Override // com.taobao.sophix.p048d.p049a.InterfaceC6371c
    /* renamed from: a */
    public void mo4663a(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f4951a = httpURLConnection;
        httpURLConnection.setConnectTimeout(5000);
        this.f4951a.setReadTimeout(5000);
        this.f4951a.setUseCaches(false);
        this.f4951a.setDoInput(true);
        this.f4951a.setInstanceFollowRedirects(false);
    }

    @Override // com.taobao.sophix.p048d.p049a.InterfaceC6371c
    /* renamed from: b */
    public int mo4665b() {
        return this.f4951a.getResponseCode();
    }

    @Override // com.taobao.sophix.p048d.p049a.InterfaceC6371c
    /* renamed from: c */
    public Map<String, List<String>> mo4666c() {
        return this.f4951a.getHeaderFields();
    }

    @Override // com.taobao.sophix.p048d.p049a.InterfaceC6371c
    /* renamed from: d */
    public InputStream mo4667d() {
        return this.f4951a.getInputStream();
    }

    @Override // com.taobao.sophix.p048d.p049a.InterfaceC6371c
    /* renamed from: e */
    public void mo4668e() {
        HttpURLConnection httpURLConnection = this.f4951a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // com.taobao.sophix.p048d.p049a.InterfaceC6371c
    /* renamed from: a */
    public void mo4664a(String str, String str2) {
        HttpURLConnection httpURLConnection = this.f4951a;
        if (httpURLConnection != null) {
            httpURLConnection.addRequestProperty(str, str2);
        }
    }

    @Override // com.taobao.sophix.p048d.p049a.InterfaceC6371c
    /* renamed from: a */
    public void mo4662a() throws IOException {
        this.f4951a.connect();
    }
}
