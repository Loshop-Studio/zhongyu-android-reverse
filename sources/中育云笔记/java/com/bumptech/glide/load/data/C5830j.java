package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.InterfaceC5824d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p109d1.AbstractC8905f;
import p109d1.C8901b;
import p254n0.C10294h;

/* renamed from: com.bumptech.glide.load.data.j */
/* loaded from: classes3.dex */
public class C5830j implements InterfaceC5824d {

    /* renamed from: i */
    public static final b f4713i = new a();

    /* renamed from: c */
    public final C10294h f4714c;

    /* renamed from: d */
    public final int f4715d;

    /* renamed from: e */
    public final b f4716e;

    /* renamed from: f */
    public HttpURLConnection f4717f;

    /* renamed from: g */
    public InputStream f4718g;

    /* renamed from: h */
    public volatile boolean f4719h;

    /* renamed from: com.bumptech.glide.load.data.j$a */
    public static class a implements b {
        @Override // com.bumptech.glide.load.data.C5830j.b
        /* renamed from: a */
        public HttpURLConnection mo4076a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: com.bumptech.glide.load.data.j$b */
    public interface b {
        /* renamed from: a */
        HttpURLConnection mo4076a(URL url);
    }

    public C5830j(C10294h c10294h, int i10) {
        this(c10294h, i10, f4713i);
    }

    /* renamed from: d */
    public static int m4070d(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            Log.isLoggable("HttpUrlFetcher", 3);
            return -1;
        }
    }

    /* renamed from: f */
    public static boolean m4071f(int i10) {
        return i10 / 100 == 2;
    }

    /* renamed from: g */
    public static boolean m4072g(int i10) {
        return i10 / 100 == 3;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5824d
    /* renamed from: a */
    public Class mo4051a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public final HttpURLConnection m4073b(URL url, Map map) throws HttpException {
        try {
            HttpURLConnection httpURLConnectionMo4076a = this.f4716e.mo4076a(url);
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnectionMo4076a.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnectionMo4076a.setConnectTimeout(this.f4715d);
            httpURLConnectionMo4076a.setReadTimeout(this.f4715d);
            httpURLConnectionMo4076a.setUseCaches(false);
            httpURLConnectionMo4076a.setDoInput(true);
            httpURLConnectionMo4076a.setInstanceFollowRedirects(false);
            return httpURLConnectionMo4076a;
        } catch (IOException e10) {
            throw new HttpException("URL.openConnection threw", 0, e10);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5824d
    /* renamed from: c */
    public void mo4057c(Priority priority, InterfaceC5824d.a aVar) {
        long jM17452b = AbstractC8905f.m17452b();
        try {
            try {
                aVar.mo4063d(m4075h(this.f4714c.m21464h(), 0, null, this.f4714c.m21461e()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    AbstractC8905f.m17451a(jM17452b);
                }
            } catch (IOException e10) {
                Log.isLoggable("HttpUrlFetcher", 3);
                aVar.mo4062b(e10);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    AbstractC8905f.m17451a(jM17452b);
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                AbstractC8905f.m17451a(jM17452b);
            }
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5824d
    public void cancel() {
        this.f4719h = true;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5824d
    public void cleanup() throws IOException {
        InputStream inputStream = this.f4718g;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f4717f;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f4717f = null;
    }

    /* renamed from: e */
    public final InputStream m4074e(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f4718g = C8901b.m17442c(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    httpURLConnection.getContentEncoding();
                }
                this.f4718g = httpURLConnection.getInputStream();
            }
            return this.f4718g;
        } catch (IOException e10) {
            throw new HttpException("Failed to obtain InputStream", m4070d(httpURLConnection), e10);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5824d
    public DataSource getDataSource() {
        return DataSource.REMOTE;
    }

    /* renamed from: h */
    public final InputStream m4075h(URL url, int i10, URL url2, Map map) throws IOException {
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
        HttpURLConnection httpURLConnectionM4073b = m4073b(url, map);
        this.f4717f = httpURLConnectionM4073b;
        try {
            httpURLConnectionM4073b.connect();
            this.f4718g = this.f4717f.getInputStream();
            if (this.f4719h) {
                return null;
            }
            int iM4070d = m4070d(this.f4717f);
            if (m4071f(iM4070d)) {
                return m4074e(this.f4717f);
            }
            if (!m4072g(iM4070d)) {
                if (iM4070d == -1) {
                    throw new HttpException(iM4070d);
                }
                try {
                    throw new HttpException(this.f4717f.getResponseMessage(), iM4070d);
                } catch (IOException e10) {
                    throw new HttpException("Failed to get a response message", iM4070d, e10);
                }
            }
            String headerField = this.f4717f.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new HttpException("Received empty or null redirect url", iM4070d);
            }
            try {
                URL url3 = new URL(url, headerField);
                cleanup();
                return m4075h(url3, i10 + 1, url, map);
            } catch (MalformedURLException e11) {
                throw new HttpException("Bad redirect url: " + headerField, iM4070d, e11);
            }
        } catch (IOException e12) {
            throw new HttpException("Failed to connect or obtain data", m4070d(this.f4717f), e12);
        }
    }

    public C5830j(C10294h c10294h, int i10, b bVar) {
        this.f4714c = c10294h;
        this.f4715d = i10;
        this.f4716e = bVar;
    }
}
