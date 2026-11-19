package com.taobao.sophix.p065d.p066a;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* renamed from: com.taobao.sophix.d.a.b */
/* loaded from: classes4.dex */
public class C6630b implements InterfaceC6631c {

    /* renamed from: a */
    private HttpURLConnection f5528a;

    @Override // com.taobao.sophix.p065d.p066a.InterfaceC6631c
    /* renamed from: a */
    public void mo4842a(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f5528a = httpURLConnection;
        httpURLConnection.setConnectTimeout(5000);
        this.f5528a.setReadTimeout(5000);
        this.f5528a.setUseCaches(false);
        this.f5528a.setDoInput(true);
        this.f5528a.setInstanceFollowRedirects(false);
    }

    @Override // com.taobao.sophix.p065d.p066a.InterfaceC6631c
    /* renamed from: b */
    public int mo4844b() {
        return this.f5528a.getResponseCode();
    }

    @Override // com.taobao.sophix.p065d.p066a.InterfaceC6631c
    /* renamed from: c */
    public Map<String, List<String>> mo4845c() {
        return this.f5528a.getHeaderFields();
    }

    @Override // com.taobao.sophix.p065d.p066a.InterfaceC6631c
    /* renamed from: d */
    public InputStream mo4846d() {
        return this.f5528a.getInputStream();
    }

    @Override // com.taobao.sophix.p065d.p066a.InterfaceC6631c
    /* renamed from: e */
    public void mo4847e() {
        HttpURLConnection httpURLConnection = this.f5528a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // com.taobao.sophix.p065d.p066a.InterfaceC6631c
    /* renamed from: a */
    public void mo4843a(String str, String str2) {
        HttpURLConnection httpURLConnection = this.f5528a;
        if (httpURLConnection != null) {
            httpURLConnection.addRequestProperty(str, str2);
        }
    }

    @Override // com.taobao.sophix.p065d.p066a.InterfaceC6631c
    /* renamed from: a */
    public void mo4841a() throws IOException {
        this.f5528a.connect();
    }
}
