package p132i0;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p091e1.AbstractC7833e;
import p091e1.C7830b;
import p132i0.InterfaceC8115d;
import p194o0.C9140g;

/* renamed from: i0.j */
/* loaded from: classes3.dex */
public class C8121j implements InterfaceC8115d {

    /* renamed from: g */
    public static final b f13881g = new a();

    /* renamed from: a */
    public final C9140g f13882a;

    /* renamed from: b */
    public final int f13883b;

    /* renamed from: c */
    public final b f13884c;

    /* renamed from: d */
    public HttpURLConnection f13885d;

    /* renamed from: e */
    public InputStream f13886e;

    /* renamed from: f */
    public volatile boolean f13887f;

    /* renamed from: i0.j$a */
    public static class a implements b {
        @Override // p132i0.C8121j.b
        /* renamed from: a */
        public HttpURLConnection mo13005a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: i0.j$b */
    public interface b {
        /* renamed from: a */
        HttpURLConnection mo13005a(URL url);
    }

    public C8121j(C9140g c9140g, int i9) {
        this(c9140g, i9, f13881g);
    }

    /* renamed from: f */
    public static boolean m13001f(int i9) {
        return i9 / 100 == 2;
    }

    /* renamed from: g */
    public static boolean m13002g(int i9) {
        return i9 / 100 == 3;
    }

    @Override // p132i0.InterfaceC8115d
    /* renamed from: a */
    public Class mo12978a() {
        return InputStream.class;
    }

    @Override // p132i0.InterfaceC8115d
    /* renamed from: b */
    public void mo12983b() throws IOException {
        InputStream inputStream = this.f13886e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f13885d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f13885d = null;
    }

    /* renamed from: c */
    public final InputStream m13003c(HttpURLConnection httpURLConnection) {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f13886e = C7830b.m12231c(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                httpURLConnection.getContentEncoding();
            }
            this.f13886e = httpURLConnection.getInputStream();
        }
        return this.f13886e;
    }

    @Override // p132i0.InterfaceC8115d
    public void cancel() {
        this.f13887f = true;
    }

    @Override // p132i0.InterfaceC8115d
    /* renamed from: d */
    public void mo12985d(Priority priority, InterfaceC8115d.a aVar) {
        long jM12240b = AbstractC7833e.m12240b();
        try {
            try {
                aVar.mo3155f(m13004h(this.f13882a.m14688h(), 0, null, this.f13882a.m14685e()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    AbstractC7833e.m12239a(jM12240b);
                }
            } catch (IOException e10) {
                Log.isLoggable("HttpUrlFetcher", 3);
                aVar.mo3154c(e10);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    AbstractC7833e.m12239a(jM12240b);
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                AbstractC7833e.m12239a(jM12240b);
            }
            throw th;
        }
    }

    @Override // p132i0.InterfaceC8115d
    /* renamed from: e */
    public DataSource mo12986e() {
        return DataSource.REMOTE;
    }

    /* renamed from: h */
    public final InputStream m13004h(URL url, int i9, URL url2, Map map) throws IOException {
        if (i9 >= 5) {
            throw new HttpException("Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        this.f13885d = this.f13884c.mo13005a(url);
        for (Map.Entry entry : map.entrySet()) {
            this.f13885d.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        this.f13885d.setConnectTimeout(this.f13883b);
        this.f13885d.setReadTimeout(this.f13883b);
        this.f13885d.setUseCaches(false);
        this.f13885d.setDoInput(true);
        this.f13885d.setInstanceFollowRedirects(false);
        this.f13885d.connect();
        this.f13886e = this.f13885d.getInputStream();
        if (this.f13887f) {
            return null;
        }
        int responseCode = this.f13885d.getResponseCode();
        if (m13001f(responseCode)) {
            return m13003c(this.f13885d);
        }
        if (!m13002g(responseCode)) {
            if (responseCode == -1) {
                throw new HttpException(responseCode);
            }
            throw new HttpException(this.f13885d.getResponseMessage(), responseCode);
        }
        String headerField = this.f13885d.getHeaderField(HttpHeaders.LOCATION);
        if (TextUtils.isEmpty(headerField)) {
            throw new HttpException("Received empty or null redirect url");
        }
        URL url3 = new URL(url, headerField);
        mo12983b();
        return m13004h(url3, i9 + 1, url, map);
    }

    public C8121j(C9140g c9140g, int i9, b bVar) {
        this.f13882a = c9140g;
        this.f13883b = i9;
        this.f13884c = bVar;
    }
}
