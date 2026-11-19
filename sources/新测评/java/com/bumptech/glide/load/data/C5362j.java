package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.InterfaceC5356d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p117i1.AbstractC7647f;
import p117i1.C7643b;
import p228s0.C9106h;

/* renamed from: com.bumptech.glide.load.data.j */
/* loaded from: classes3.dex */
public class C5362j implements InterfaceC5356d {

    /* renamed from: g */
    public static final b f3510g = new a();

    /* renamed from: a */
    public final C9106h f3511a;

    /* renamed from: b */
    public final int f3512b;

    /* renamed from: c */
    public final b f3513c;

    /* renamed from: d */
    public HttpURLConnection f3514d;

    /* renamed from: e */
    public InputStream f3515e;

    /* renamed from: f */
    public volatile boolean f3516f;

    /* renamed from: com.bumptech.glide.load.data.j$a */
    public static class a implements b {
        @Override // com.bumptech.glide.load.data.C5362j.b
        /* renamed from: a */
        public HttpURLConnection mo3426a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: com.bumptech.glide.load.data.j$b */
    public interface b {
        /* renamed from: a */
        HttpURLConnection mo3426a(URL url);
    }

    public C5362j(C9106h c9106h, int i10) {
        this(c9106h, i10, f3510g);
    }

    /* renamed from: f */
    public static int m3420f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            Log.isLoggable("HttpUrlFetcher", 3);
            return -1;
        }
    }

    /* renamed from: h */
    public static boolean m3421h(int i10) {
        return i10 / 100 == 2;
    }

    /* renamed from: i */
    public static boolean m3422i(int i10) {
        return i10 / 100 == 3;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5356d
    /* renamed from: a */
    public Class mo3399a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5356d
    /* renamed from: b */
    public void mo3404b() throws IOException {
        InputStream inputStream = this.f3515e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f3514d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f3514d = null;
    }

    /* renamed from: c */
    public final HttpURLConnection m3423c(URL url, Map map) throws HttpException {
        try {
            HttpURLConnection httpURLConnectionMo3426a = this.f3513c.mo3426a(url);
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnectionMo3426a.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnectionMo3426a.setConnectTimeout(this.f3512b);
            httpURLConnectionMo3426a.setReadTimeout(this.f3512b);
            httpURLConnectionMo3426a.setUseCaches(false);
            httpURLConnectionMo3426a.setDoInput(true);
            httpURLConnectionMo3426a.setInstanceFollowRedirects(false);
            return httpURLConnectionMo3426a;
        } catch (IOException e10) {
            throw new HttpException("URL.openConnection threw", 0, e10);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5356d
    public void cancel() {
        this.f3516f = true;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5356d
    /* renamed from: d */
    public DataSource mo3406d() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5356d
    /* renamed from: e */
    public void mo3407e(Priority priority, InterfaceC5356d.a aVar) {
        long jM12667b = AbstractC7647f.m12667b();
        try {
            try {
                aVar.mo3413f(m3425j(this.f3511a.m15401h(), 0, null, this.f3511a.m15398e()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    AbstractC7647f.m12666a(jM12667b);
                }
            } catch (IOException e10) {
                Log.isLoggable("HttpUrlFetcher", 3);
                aVar.mo3412c(e10);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    AbstractC7647f.m12666a(jM12667b);
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                AbstractC7647f.m12666a(jM12667b);
            }
            throw th;
        }
    }

    /* renamed from: g */
    public final InputStream m3424g(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f3515e = C7643b.m12657f(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    httpURLConnection.getContentEncoding();
                }
                this.f3515e = httpURLConnection.getInputStream();
            }
            return this.f3515e;
        } catch (IOException e10) {
            throw new HttpException("Failed to obtain InputStream", m3420f(httpURLConnection), e10);
        }
    }

    /* renamed from: j */
    public final InputStream m3425j(URL url, int i10, URL url2, Map map) throws IOException {
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
        HttpURLConnection httpURLConnectionM3423c = m3423c(url, map);
        this.f3514d = httpURLConnectionM3423c;
        try {
            httpURLConnectionM3423c.connect();
            this.f3515e = this.f3514d.getInputStream();
            if (this.f3516f) {
                return null;
            }
            int iM3420f = m3420f(this.f3514d);
            if (m3421h(iM3420f)) {
                return m3424g(this.f3514d);
            }
            if (!m3422i(iM3420f)) {
                if (iM3420f == -1) {
                    throw new HttpException(iM3420f);
                }
                try {
                    throw new HttpException(this.f3514d.getResponseMessage(), iM3420f);
                } catch (IOException e10) {
                    throw new HttpException("Failed to get a response message", iM3420f, e10);
                }
            }
            String headerField = this.f3514d.getHeaderField(HttpHeaders.LOCATION);
            if (TextUtils.isEmpty(headerField)) {
                throw new HttpException("Received empty or null redirect url", iM3420f);
            }
            try {
                URL url3 = new URL(url, headerField);
                mo3404b();
                return m3425j(url3, i10 + 1, url, map);
            } catch (MalformedURLException e11) {
                throw new HttpException("Bad redirect url: " + headerField, iM3420f, e11);
            }
        } catch (IOException e12) {
            throw new HttpException("Failed to connect or obtain data", m3420f(this.f3514d), e12);
        }
    }

    public C5362j(C9106h c9106h, int i10, b bVar) {
        this.f3511a = c9106h;
        this.f3512b = i10;
        this.f3513c = bVar;
    }
}
