package p240t1;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import p207q1.AbstractC8880e;
import p207q1.InterfaceC8878c;
import p218r1.AbstractC8999c;
import p240t1.InterfaceC9377a;

/* renamed from: t1.c */
/* loaded from: classes4.dex */
public class C9379c implements InterfaceC9377a, InterfaceC9377a.a {

    /* renamed from: a */
    public URLConnection f16287a;

    /* renamed from: b */
    public URL f16288b;

    /* renamed from: c */
    public InterfaceC8878c f16289c;

    /* renamed from: t1.c$a */
    public static class a {
    }

    /* renamed from: t1.c$b */
    public static class b implements InterfaceC9377a.b {
        public b() {
            this(null);
        }

        @Override // p240t1.InterfaceC9377a.b
        /* renamed from: a */
        public InterfaceC9377a mo15679a(String str) {
            return new C9379c(str, (a) null);
        }

        public b(a aVar) {
        }
    }

    /* renamed from: t1.c$c */
    public static final class c implements InterfaceC8878c {

        /* renamed from: a */
        public String f16290a;

        @Override // p207q1.InterfaceC8878c
        /* renamed from: a */
        public String mo14903a() {
            return this.f16290a;
        }

        @Override // p207q1.InterfaceC8878c
        /* renamed from: b */
        public void mo14904b(InterfaceC9377a interfaceC9377a, InterfaceC9377a.a aVar, Map map) throws IOException {
            C9379c c9379c = (C9379c) interfaceC9377a;
            int i10 = 0;
            for (int iMo15678h = aVar.mo15678h(); AbstractC8880e.m14918b(iMo15678h); iMo15678h = c9379c.mo15678h()) {
                c9379c.release();
                i10++;
                if (i10 > 10) {
                    throw new ProtocolException("Too many redirect requests: " + i10);
                }
                this.f16290a = AbstractC8880e.m14917a(aVar, iMo15678h);
                c9379c.f16288b = new URL(this.f16290a);
                c9379c.m15681j();
                AbstractC8999c.m15118b(map, c9379c);
                c9379c.f16287a.connect();
            }
        }
    }

    public C9379c(String str, a aVar) {
        this(new URL(str), aVar);
    }

    @Override // p240t1.InterfaceC9377a.a
    /* renamed from: a */
    public String mo15674a() {
        return this.f16289c.mo14903a();
    }

    @Override // p240t1.InterfaceC9377a
    /* renamed from: b */
    public void mo15671b(String str, String str2) {
        this.f16287a.addRequestProperty(str, str2);
    }

    @Override // p240t1.InterfaceC9377a.a
    /* renamed from: c */
    public String mo15675c(String str) {
        return this.f16287a.getHeaderField(str);
    }

    @Override // p240t1.InterfaceC9377a
    /* renamed from: d */
    public boolean mo15672d(String str) throws ProtocolException {
        URLConnection uRLConnection = this.f16287a;
        if (!(uRLConnection instanceof HttpURLConnection)) {
            return false;
        }
        ((HttpURLConnection) uRLConnection).setRequestMethod(str);
        return true;
    }

    @Override // p240t1.InterfaceC9377a.a
    /* renamed from: e */
    public InputStream mo15676e() {
        return this.f16287a.getInputStream();
    }

    @Override // p240t1.InterfaceC9377a
    public InterfaceC9377a.a execute() throws IOException {
        Map mapMo15673f = mo15673f();
        this.f16287a.connect();
        this.f16289c.mo14904b(this, this, mapMo15673f);
        return this;
    }

    @Override // p240t1.InterfaceC9377a
    /* renamed from: f */
    public Map mo15673f() {
        return this.f16287a.getRequestProperties();
    }

    @Override // p240t1.InterfaceC9377a.a
    /* renamed from: g */
    public Map mo15677g() {
        return this.f16287a.getHeaderFields();
    }

    @Override // p240t1.InterfaceC9377a.a
    /* renamed from: h */
    public int mo15678h() {
        URLConnection uRLConnection = this.f16287a;
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return 0;
    }

    /* renamed from: j */
    public void m15681j() throws IOException {
        AbstractC8999c.m15125i("DownloadUrlConnection", "config connection for " + this.f16288b);
        URLConnection uRLConnectionOpenConnection = this.f16288b.openConnection();
        this.f16287a = uRLConnectionOpenConnection;
        if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnectionOpenConnection).setInstanceFollowRedirects(false);
        }
    }

    @Override // p240t1.InterfaceC9377a
    public void release() throws IOException {
        try {
            InputStream inputStream = this.f16287a.getInputStream();
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
    }

    public C9379c(URL url, a aVar) {
        this(url, aVar, new c());
    }

    public C9379c(URL url, a aVar, InterfaceC8878c interfaceC8878c) throws IOException {
        this.f16288b = url;
        this.f16289c = interfaceC8878c;
        m15681j();
    }
}
