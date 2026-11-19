package p239s1;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import p209p1.AbstractC9316e;
import p209p1.InterfaceC9314c;
import p219q1.AbstractC9353c;
import p239s1.InterfaceC9465a;

/* renamed from: s1.c */
/* loaded from: classes4.dex */
public class C9467c implements InterfaceC9465a, InterfaceC9465a.a {

    /* renamed from: a */
    public URLConnection f16502a;

    /* renamed from: b */
    public URL f16503b;

    /* renamed from: c */
    public InterfaceC9314c f16504c;

    /* renamed from: s1.c$a */
    public static class a {
    }

    /* renamed from: s1.c$b */
    public static class b implements InterfaceC9465a.b {
        public b() {
            this(null);
        }

        @Override // p239s1.InterfaceC9465a.b
        /* renamed from: a */
        public InterfaceC9465a mo15643a(String str) {
            return new C9467c(str, (a) null);
        }

        public b(a aVar) {
        }
    }

    /* renamed from: s1.c$c */
    public static final class c implements InterfaceC9314c {

        /* renamed from: a */
        public String f16505a;

        @Override // p209p1.InterfaceC9314c
        /* renamed from: a */
        public String mo15180a() {
            return this.f16505a;
        }

        @Override // p209p1.InterfaceC9314c
        /* renamed from: b */
        public void mo15181b(InterfaceC9465a interfaceC9465a, InterfaceC9465a.a aVar, Map map) throws IOException {
            C9467c c9467c = (C9467c) interfaceC9465a;
            int i9 = 0;
            for (int iMo15642h = aVar.mo15642h(); AbstractC9316e.m15195b(iMo15642h); iMo15642h = c9467c.mo15642h()) {
                c9467c.release();
                i9++;
                if (i9 > 10) {
                    throw new ProtocolException("Too many redirect requests: " + i9);
                }
                this.f16505a = AbstractC9316e.m15194a(aVar, iMo15642h);
                c9467c.f16503b = new URL(this.f16505a);
                c9467c.m15645j();
                AbstractC9353c.m15299b(map, c9467c);
                c9467c.f16502a.connect();
            }
        }
    }

    public C9467c(String str, a aVar) {
        this(new URL(str), aVar);
    }

    @Override // p239s1.InterfaceC9465a.a
    /* renamed from: a */
    public String mo15638a() {
        return this.f16504c.mo15180a();
    }

    @Override // p239s1.InterfaceC9465a
    /* renamed from: b */
    public void mo15635b(String str, String str2) {
        this.f16502a.addRequestProperty(str, str2);
    }

    @Override // p239s1.InterfaceC9465a.a
    /* renamed from: c */
    public String mo15639c(String str) {
        return this.f16502a.getHeaderField(str);
    }

    @Override // p239s1.InterfaceC9465a
    /* renamed from: d */
    public boolean mo15636d(String str) throws ProtocolException {
        URLConnection uRLConnection = this.f16502a;
        if (!(uRLConnection instanceof HttpURLConnection)) {
            return false;
        }
        ((HttpURLConnection) uRLConnection).setRequestMethod(str);
        return true;
    }

    @Override // p239s1.InterfaceC9465a.a
    /* renamed from: e */
    public InputStream mo15640e() {
        return this.f16502a.getInputStream();
    }

    @Override // p239s1.InterfaceC9465a
    public InterfaceC9465a.a execute() throws IOException {
        Map mapMo15637f = mo15637f();
        this.f16502a.connect();
        this.f16504c.mo15181b(this, this, mapMo15637f);
        return this;
    }

    @Override // p239s1.InterfaceC9465a
    /* renamed from: f */
    public Map mo15637f() {
        return this.f16502a.getRequestProperties();
    }

    @Override // p239s1.InterfaceC9465a.a
    /* renamed from: g */
    public Map mo15641g() {
        return this.f16502a.getHeaderFields();
    }

    @Override // p239s1.InterfaceC9465a.a
    /* renamed from: h */
    public int mo15642h() {
        URLConnection uRLConnection = this.f16502a;
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return 0;
    }

    /* renamed from: j */
    public void m15645j() throws IOException {
        AbstractC9353c.m15306i("DownloadUrlConnection", "config connection for " + this.f16503b);
        URLConnection uRLConnectionOpenConnection = this.f16503b.openConnection();
        this.f16502a = uRLConnectionOpenConnection;
        if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnectionOpenConnection).setInstanceFollowRedirects(false);
        }
    }

    @Override // p239s1.InterfaceC9465a
    public void release() throws IOException {
        try {
            InputStream inputStream = this.f16502a.getInputStream();
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
    }

    public C9467c(URL url, a aVar) {
        this(url, aVar, new c());
    }

    public C9467c(URL url, a aVar, InterfaceC9314c interfaceC9314c) throws IOException {
        this.f16503b = url;
        this.f16504c = interfaceC9314c;
        m15645j();
    }
}
