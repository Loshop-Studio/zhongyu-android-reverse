package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.InterfaceC5405d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p116h0.AbstractC8702f;
import p116h0.C8698b;
import p226r.C9882h;

/* renamed from: com.bumptech.glide.load.data.j */
/* loaded from: classes3.dex */
public class C5411j implements InterfaceC5405d {

    /* renamed from: g */
    public static final b f2943g = new a();

    /* renamed from: a */
    public final C9882h f2944a;

    /* renamed from: b */
    public final int f2945b;

    /* renamed from: c */
    public final b f2946c;

    /* renamed from: d */
    public HttpURLConnection f2947d;

    /* renamed from: e */
    public InputStream f2948e;

    /* renamed from: f */
    public volatile boolean f2949f;

    /* renamed from: com.bumptech.glide.load.data.j$a */
    public static class a implements b {
        @Override // com.bumptech.glide.load.data.C5411j.b
        /* renamed from: a */
        public HttpURLConnection mo2872a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: com.bumptech.glide.load.data.j$b */
    public interface b {
        /* renamed from: a */
        HttpURLConnection mo2872a(URL url);
    }

    public C5411j(C9882h c9882h, int i10) {
        this(c9882h, i10, f2943g);
    }

    /* renamed from: e */
    public static int m2866e(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            Log.isLoggable("HttpUrlFetcher", 3);
            return -1;
        }
    }

    /* renamed from: g */
    public static boolean m2867g(int i10) {
        return i10 / 100 == 2;
    }

    /* renamed from: h */
    public static boolean m2868h(int i10) {
        return i10 / 100 == 3;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5405d
    /* renamed from: a */
    public Class mo2846a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5405d
    /* renamed from: b */
    public void mo2851b() throws IOException {
        InputStream inputStream = this.f2948e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f2947d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f2947d = null;
    }

    /* renamed from: c */
    public final HttpURLConnection m2869c(URL url, Map map) throws HttpException {
        try {
            HttpURLConnection httpURLConnectionMo2872a = this.f2946c.mo2872a(url);
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnectionMo2872a.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnectionMo2872a.setConnectTimeout(this.f2945b);
            httpURLConnectionMo2872a.setReadTimeout(this.f2945b);
            httpURLConnectionMo2872a.setUseCaches(false);
            httpURLConnectionMo2872a.setDoInput(true);
            httpURLConnectionMo2872a.setInstanceFollowRedirects(false);
            return httpURLConnectionMo2872a;
        } catch (IOException e10) {
            throw new HttpException("URL.openConnection threw", 0, e10);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5405d
    public void cancel() {
        this.f2949f = true;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5405d
    /* renamed from: d */
    public void mo2853d(Priority priority, InterfaceC5405d.a aVar) {
        long jM14165b = AbstractC8702f.m14165b();
        try {
            try {
                aVar.mo2859e(m2871i(this.f2944a.m18492h(), 0, null, this.f2944a.m18489e()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    AbstractC8702f.m14164a(jM14165b);
                }
            } catch (IOException e10) {
                Log.isLoggable("HttpUrlFetcher", 3);
                aVar.mo2858c(e10);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    AbstractC8702f.m14164a(jM14165b);
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                AbstractC8702f.m14164a(jM14165b);
            }
            throw th;
        }
    }

    /* renamed from: f */
    public final InputStream m2870f(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f2948e = C8698b.m14155b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    httpURLConnection.getContentEncoding();
                }
                this.f2948e = httpURLConnection.getInputStream();
            }
            return this.f2948e;
        } catch (IOException e10) {
            throw new HttpException("Failed to obtain InputStream", m2866e(httpURLConnection), e10);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5405d
    public DataSource getDataSource() {
        return DataSource.REMOTE;
    }

    /* renamed from: i */
    public final InputStream m2871i(URL url, int i10, URL url2, Map map) throws IOException {
        if (i10 >= 5) {
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
        HttpURLConnection httpURLConnectionM2869c = m2869c(url, map);
        this.f2947d = httpURLConnectionM2869c;
        try {
            httpURLConnectionM2869c.connect();
            this.f2948e = this.f2947d.getInputStream();
            if (this.f2949f) {
                return null;
            }
            int iM2866e = m2866e(this.f2947d);
            if (m2867g(iM2866e)) {
                return m2870f(this.f2947d);
            }
            if (!m2868h(iM2866e)) {
                if (iM2866e == -1) {
                    throw new HttpException(iM2866e);
                }
                try {
                    throw new HttpException(this.f2947d.getResponseMessage(), iM2866e);
                } catch (IOException e10) {
                    throw new HttpException("Failed to get a response message", iM2866e, e10);
                }
            }
            String headerField = this.f2947d.getHeaderField(HttpHeaders.LOCATION);
            if (TextUtils.isEmpty(headerField)) {
                throw new HttpException("Received empty or null redirect url", iM2866e);
            }
            try {
                URL url3 = new URL(url, headerField);
                mo2851b();
                return m2871i(url3, i10 + 1, url, map);
            } catch (MalformedURLException e11) {
                throw new HttpException("Bad redirect url: " + headerField, iM2866e, e11);
            }
        } catch (IOException e12) {
            throw new HttpException("Failed to connect or obtain data", m2866e(this.f2947d), e12);
        }
    }

    public C5411j(C9882h c9882h, int i10, b bVar) {
        this.f2944a = c9882h;
        this.f2945b = i10;
        this.f2946c = bVar;
    }
}
