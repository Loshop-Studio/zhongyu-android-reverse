package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.InterfaceC4692d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p016b1.AbstractC4404f;
import p016b1.C4400b;
import p097l0.C7274h;

/* renamed from: com.bumptech.glide.load.data.j */
/* loaded from: classes3.dex */
public class C4698j implements InterfaceC4692d {

    /* renamed from: g */
    public static final b f2301g = new a();

    /* renamed from: a */
    public final C7274h f2302a;

    /* renamed from: b */
    public final int f2303b;

    /* renamed from: c */
    public final b f2304c;

    /* renamed from: d */
    public HttpURLConnection f2305d;

    /* renamed from: e */
    public InputStream f2306e;

    /* renamed from: f */
    public volatile boolean f2307f;

    /* renamed from: com.bumptech.glide.load.data.j$a */
    public static class a implements b {
        @Override // com.bumptech.glide.load.data.C4698j.b
        /* renamed from: a */
        public HttpURLConnection mo2607a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: com.bumptech.glide.load.data.j$b */
    public interface b {
        /* renamed from: a */
        HttpURLConnection mo2607a(URL url);
    }

    public C4698j(C7274h c7274h, int i6) {
        this(c7274h, i6, f2301g);
    }

    /* renamed from: f */
    public static int m2601f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            Log.isLoggable("HttpUrlFetcher", 3);
            return -1;
        }
    }

    /* renamed from: h */
    public static boolean m2602h(int i6) {
        return i6 / 100 == 2;
    }

    /* renamed from: i */
    public static boolean m2603i(int i6) {
        return i6 / 100 == 3;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4692d
    /* renamed from: a */
    public Class mo2580a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4692d
    /* renamed from: b */
    public void mo2585b() throws IOException {
        InputStream inputStream = this.f2306e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f2305d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f2305d = null;
    }

    /* renamed from: c */
    public final HttpURLConnection m2604c(URL url, Map map) throws HttpException {
        try {
            HttpURLConnection httpURLConnectionMo2607a = this.f2304c.mo2607a(url);
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnectionMo2607a.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnectionMo2607a.setConnectTimeout(this.f2303b);
            httpURLConnectionMo2607a.setReadTimeout(this.f2303b);
            httpURLConnectionMo2607a.setUseCaches(false);
            httpURLConnectionMo2607a.setDoInput(true);
            httpURLConnectionMo2607a.setInstanceFollowRedirects(false);
            return httpURLConnectionMo2607a;
        } catch (IOException e6) {
            throw new HttpException("URL.openConnection threw", 0, e6);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4692d
    public void cancel() {
        this.f2307f = true;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4692d
    /* renamed from: d */
    public DataSource mo2587d() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4692d
    /* renamed from: e */
    public void mo2588e(Priority priority, InterfaceC4692d.a aVar) {
        long jM1422b = AbstractC4404f.m1422b();
        try {
            try {
                aVar.mo2594f(m2606j(this.f2302a.m8237h(), 0, null, this.f2302a.m8234e()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    AbstractC4404f.m1421a(jM1422b);
                }
            } catch (IOException e6) {
                Log.isLoggable("HttpUrlFetcher", 3);
                aVar.mo2593c(e6);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    AbstractC4404f.m1421a(jM1422b);
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                AbstractC4404f.m1421a(jM1422b);
            }
            throw th;
        }
    }

    /* renamed from: g */
    public final InputStream m2605g(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f2306e = C4400b.m1412c(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    httpURLConnection.getContentEncoding();
                }
                this.f2306e = httpURLConnection.getInputStream();
            }
            return this.f2306e;
        } catch (IOException e6) {
            throw new HttpException("Failed to obtain InputStream", m2601f(httpURLConnection), e6);
        }
    }

    /* renamed from: j */
    public final InputStream m2606j(URL url, int i6, URL url2, Map map) throws IOException {
        if (i6 >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionM2604c = m2604c(url, map);
        this.f2305d = httpURLConnectionM2604c;
        try {
            httpURLConnectionM2604c.connect();
            this.f2306e = this.f2305d.getInputStream();
            if (this.f2307f) {
                return null;
            }
            int iM2601f = m2601f(this.f2305d);
            if (m2602h(iM2601f)) {
                return m2605g(this.f2305d);
            }
            if (!m2603i(iM2601f)) {
                if (iM2601f == -1) {
                    throw new HttpException(iM2601f);
                }
                try {
                    throw new HttpException(this.f2305d.getResponseMessage(), iM2601f);
                } catch (IOException e6) {
                    throw new HttpException("Failed to get a response message", iM2601f, e6);
                }
            }
            String headerField = this.f2305d.getHeaderField(HttpHeaders.LOCATION);
            if (TextUtils.isEmpty(headerField)) {
                throw new HttpException("Received empty or null redirect url", iM2601f);
            }
            try {
                URL url3 = new URL(url, headerField);
                mo2585b();
                return m2606j(url3, i6 + 1, url, map);
            } catch (MalformedURLException e7) {
                throw new HttpException("Bad redirect url: " + headerField, iM2601f, e7);
            }
        } catch (IOException e8) {
            throw new HttpException("Failed to connect or obtain data", m2601f(this.f2305d), e8);
        }
    }

    public C4698j(C7274h c7274h, int i6, b bVar) {
        this.f2302a = c7274h;
        this.f2303b = i6;
        this.f2304c = bVar;
    }
}
