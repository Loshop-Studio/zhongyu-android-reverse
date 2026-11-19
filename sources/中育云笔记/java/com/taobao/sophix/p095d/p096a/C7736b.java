package com.taobao.sophix.p095d.p096a;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions;

/* renamed from: com.taobao.sophix.d.a.b */
/* loaded from: classes5.dex */
public class C7736b implements InterfaceC7737c {

    /* renamed from: a */
    private HttpURLConnection f13393a;

    @Override // com.taobao.sophix.p095d.p096a.InterfaceC7737c
    /* renamed from: a */
    public void mo10354a(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f13393a = httpURLConnection;
        httpURLConnection.setConnectTimeout(DisconnectedBufferOptions.DISCONNECTED_BUFFER_SIZE_DEFAULT);
        this.f13393a.setReadTimeout(DisconnectedBufferOptions.DISCONNECTED_BUFFER_SIZE_DEFAULT);
        this.f13393a.setUseCaches(false);
        this.f13393a.setDoInput(true);
        this.f13393a.setInstanceFollowRedirects(false);
    }

    @Override // com.taobao.sophix.p095d.p096a.InterfaceC7737c
    /* renamed from: b */
    public int mo10356b() {
        return this.f13393a.getResponseCode();
    }

    @Override // com.taobao.sophix.p095d.p096a.InterfaceC7737c
    /* renamed from: c */
    public Map<String, List<String>> mo10357c() {
        return this.f13393a.getHeaderFields();
    }

    @Override // com.taobao.sophix.p095d.p096a.InterfaceC7737c
    /* renamed from: d */
    public InputStream mo10358d() {
        return this.f13393a.getInputStream();
    }

    @Override // com.taobao.sophix.p095d.p096a.InterfaceC7737c
    /* renamed from: e */
    public void mo10359e() {
        HttpURLConnection httpURLConnection = this.f13393a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // com.taobao.sophix.p095d.p096a.InterfaceC7737c
    /* renamed from: a */
    public void mo10355a(String str, String str2) {
        HttpURLConnection httpURLConnection = this.f13393a;
        if (httpURLConnection != null) {
            httpURLConnection.addRequestProperty(str, str2);
        }
    }

    @Override // com.taobao.sophix.p095d.p096a.InterfaceC7737c
    /* renamed from: a */
    public void mo10353a() throws IOException {
        this.f13393a.connect();
    }
}
