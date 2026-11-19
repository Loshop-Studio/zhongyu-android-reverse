package p208z;

import android.os.SystemClock;
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
import p055f0.C5501f;
import p180v0.AbstractC6659f;
import p180v0.C6655b;

/* renamed from: z.k */
/* loaded from: classes2.dex */
public final class C6806k implements InterfaceC6800e {

    /* renamed from: a */
    public final C5501f f11481a;

    /* renamed from: b */
    public final int f11482b;

    /* renamed from: c */
    public HttpURLConnection f11483c;

    /* renamed from: d */
    public InputStream f11484d;

    /* renamed from: e */
    public volatile boolean f11485e;

    public C6806k(C5501f c5501f, int i) {
        this.f11481a = c5501f;
        this.f11482b = i;
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: a */
    public final void mo21a() throws IOException {
        InputStream inputStream = this.f11484d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f11483c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f11483c = null;
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: b */
    public final Class mo22b() {
        return InputStream.class;
    }

    /* renamed from: c */
    public final InputStream m6470c(URL url, int i, URL url2, Map map) throws IOException {
        if (i >= 5) {
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
        this.f11483c = (HttpURLConnection) url.openConnection();
        for (Map.Entry entry : map.entrySet()) {
            this.f11483c.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        this.f11483c.setConnectTimeout(this.f11482b);
        this.f11483c.setReadTimeout(this.f11482b);
        this.f11483c.setUseCaches(false);
        this.f11483c.setDoInput(true);
        this.f11483c.setInstanceFollowRedirects(false);
        this.f11483c.connect();
        this.f11484d = this.f11483c.getInputStream();
        if (this.f11485e) {
            return null;
        }
        int responseCode = this.f11483c.getResponseCode();
        int i8 = responseCode / 100;
        if (i8 == 2) {
            HttpURLConnection httpURLConnection = this.f11483c;
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f11484d = new C6655b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f11484d = httpURLConnection.getInputStream();
            }
            return this.f11484d;
        }
        if (i8 != 3) {
            if (responseCode == -1) {
                throw new HttpException(responseCode);
            }
            throw new HttpException(this.f11483c.getResponseMessage(), responseCode);
        }
        String headerField = this.f11483c.getHeaderField(HttpHeaders.LOCATION);
        if (TextUtils.isEmpty(headerField)) {
            throw new HttpException("Received empty or null redirect url");
        }
        URL url3 = new URL(url, headerField);
        mo21a();
        return m6470c(url3, i + 1, url, map);
    }

    @Override // p208z.InterfaceC6800e
    public final void cancel() {
        this.f11485e = true;
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: d */
    public final DataSource mo23d() {
        return DataSource.REMOTE;
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: e */
    public final void mo24e(Priority priority, InterfaceC6799d interfaceC6799d) {
        C5501f c5501f = this.f11481a;
        int i = AbstractC6659f.f11234b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                interfaceC6799d.mo121o(m6470c(c5501f.m4880d(), 0, null, c5501f.f8509b.mo4881a()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC6659f.m6315a(jElapsedRealtimeNanos));
                }
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                interfaceC6799d.mo109c(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC6659f.m6315a(jElapsedRealtimeNanos));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC6659f.m6315a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
