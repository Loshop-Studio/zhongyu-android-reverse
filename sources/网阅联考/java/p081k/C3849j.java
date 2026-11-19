package p081k;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p062g0.AbstractC3745e;
import p062g0.C3742b;
import p081k.InterfaceC3843d;
import p110q.C4458g;

/* renamed from: k.j */
/* loaded from: classes2.dex */
public class C3849j implements InterfaceC3843d {

    /* renamed from: g */
    public static final b f4749g = new a();

    /* renamed from: a */
    public final C4458g f4750a;

    /* renamed from: b */
    public final int f4751b;

    /* renamed from: c */
    public final b f4752c;

    /* renamed from: d */
    public HttpURLConnection f4753d;

    /* renamed from: e */
    public InputStream f4754e;

    /* renamed from: f */
    public volatile boolean f4755f;

    /* renamed from: k.j$a */
    public static class a implements b {
        @Override // p081k.C3849j.b
        /* renamed from: a */
        public HttpURLConnection mo5141a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: k.j$b */
    public interface b {
        /* renamed from: a */
        HttpURLConnection mo5141a(URL url);
    }

    public C3849j(C4458g c4458g, int i4) {
        this(c4458g, i4, f4749g);
    }

    /* renamed from: e */
    public static boolean m5137e(int i4) {
        return i4 / 100 == 2;
    }

    /* renamed from: g */
    public static boolean m5138g(int i4) {
        return i4 / 100 == 3;
    }

    @Override // p081k.InterfaceC3843d
    /* renamed from: a */
    public Class mo5114a() {
        return InputStream.class;
    }

    @Override // p081k.InterfaceC3843d
    /* renamed from: b */
    public void mo5119b() throws IOException {
        InputStream inputStream = this.f4754e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f4753d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f4753d = null;
    }

    /* renamed from: c */
    public final InputStream m5139c(HttpURLConnection httpURLConnection) {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f4754e = C3742b.m4743b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Got non empty content encoding: ");
                sb.append(httpURLConnection.getContentEncoding());
            }
            this.f4754e = httpURLConnection.getInputStream();
        }
        return this.f4754e;
    }

    @Override // p081k.InterfaceC3843d
    public void cancel() {
        this.f4755f = true;
    }

    @Override // p081k.InterfaceC3843d
    /* renamed from: d */
    public DataSource mo5121d() {
        return DataSource.REMOTE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p081k.InterfaceC3843d
    /* renamed from: f */
    public void mo5123f(Priority priority, InterfaceC3843d.a aVar) {
        StringBuilder sb;
        String str = "HttpUrlFetcher";
        long jM4752b = AbstractC3745e.m4752b();
        try {
            try {
                aVar.mo1830e(m5140h(this.f4750a.m5704h(), 0, null, this.f4750a.m5701e()));
                str = str;
            } catch (IOException e4) {
                Log.isLoggable("HttpUrlFetcher", 3);
                aVar.mo1829c(e4);
                str = str;
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    sb = new StringBuilder();
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                double dM4751a = AbstractC3745e.m4751a(jM4752b);
                sb.append(dM4751a);
                str = dM4751a;
            }
        } catch (Throwable th) {
            if (Log.isLoggable(str, 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(AbstractC3745e.m4751a(jM4752b));
            }
            throw th;
        }
    }

    /* renamed from: h */
    public final InputStream m5140h(URL url, int i4, URL url2, Map map) throws IOException {
        if (i4 >= 5) {
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
        this.f4753d = this.f4752c.mo5141a(url);
        for (Map.Entry entry : map.entrySet()) {
            this.f4753d.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        this.f4753d.setConnectTimeout(this.f4751b);
        this.f4753d.setReadTimeout(this.f4751b);
        this.f4753d.setUseCaches(false);
        this.f4753d.setDoInput(true);
        this.f4753d.setInstanceFollowRedirects(false);
        this.f4753d.connect();
        this.f4754e = this.f4753d.getInputStream();
        if (this.f4755f) {
            return null;
        }
        int responseCode = this.f4753d.getResponseCode();
        if (m5137e(responseCode)) {
            return m5139c(this.f4753d);
        }
        if (!m5138g(responseCode)) {
            if (responseCode == -1) {
                throw new HttpException(responseCode);
            }
            throw new HttpException(this.f4753d.getResponseMessage(), responseCode);
        }
        String headerField = this.f4753d.getHeaderField("Location");
        if (TextUtils.isEmpty(headerField)) {
            throw new HttpException("Received empty or null redirect url");
        }
        URL url3 = new URL(url, headerField);
        mo5119b();
        return m5140h(url3, i4 + 1, url, map);
    }

    public C3849j(C4458g c4458g, int i4, b bVar) {
        this.f4750a = c4458g;
        this.f4751b = i4;
        this.f4752c = bVar;
    }
}
