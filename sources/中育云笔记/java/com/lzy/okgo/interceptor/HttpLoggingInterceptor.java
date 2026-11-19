package com.lzy.okgo.interceptor;

import anet.channel.request.Request;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import je.AbstractC9744x;
import je.AbstractC9746z;
import je.C9737q;
import je.C9740t;
import je.C9743w;
import je.C9745y;
import je.InterfaceC9728h;
import je.InterfaceC9739s;
import okhttp3.Protocol;
import okio.Buffer;
import p146f7.AbstractC9203b;
import p146f7.AbstractC9204c;
import pe.AbstractC10678e;

/* loaded from: classes5.dex */
public class HttpLoggingInterceptor implements InterfaceC9739s {

    /* renamed from: d */
    public static final Charset f12679d = Charset.forName(Request.DEFAULT_CHARSET);

    /* renamed from: a */
    public volatile Level f12680a = Level.NONE;

    /* renamed from: b */
    public java.util.logging.Level f12681b;

    /* renamed from: c */
    public Logger f12682c;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public HttpLoggingInterceptor(String str) {
        this.f12682c = Logger.getLogger(str);
    }

    /* renamed from: b */
    public static Charset m9654b(C9740t c9740t) {
        Charset charsetM19484c = c9740t != null ? c9740t.m19484c(f12679d) : f12679d;
        return charsetM19484c == null ? f12679d : charsetM19484c;
    }

    /* renamed from: c */
    public static boolean m9655c(C9740t c9740t) {
        if (c9740t == null) {
            return false;
        }
        if (c9740t.m19487i() != null && c9740t.m19487i().equals("text")) {
            return true;
        }
        String strM19486h = c9740t.m19486h();
        if (strM19486h != null) {
            String lowerCase = strM19486h.toLowerCase();
            if (lowerCase.contains("x-www-form-urlencoded") || lowerCase.contains("json") || lowerCase.contains("xml") || lowerCase.contains("html")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void m9656a(C9743w c9743w) {
        try {
            AbstractC9744x abstractC9744xM19583a = c9743w.m19590h().m19595b().m19583a();
            if (abstractC9744xM19583a == null) {
                return;
            }
            Buffer buffer = new Buffer();
            abstractC9744xM19583a.writeTo(buffer);
            m9657d("\tbody:" + buffer.readString(m9654b(abstractC9744xM19583a.contentType())));
        } catch (Exception e10) {
            AbstractC9204c.m18111a(e10);
        }
    }

    /* renamed from: d */
    public final void m9657d(String str) {
        this.f12682c.log(this.f12681b, str);
    }

    /* renamed from: e */
    public final void m9658e(C9743w c9743w, InterfaceC9728h interfaceC9728h) {
        StringBuilder sb2;
        Level level = this.f12680a;
        Level level2 = Level.BODY;
        boolean z10 = level == level2;
        boolean z11 = this.f12680a == level2 || this.f12680a == Level.HEADERS;
        AbstractC9744x abstractC9744xM19583a = c9743w.m19583a();
        boolean z12 = abstractC9744xM19583a != null;
        try {
            try {
                m9657d("--> " + c9743w.m19589g() + ' ' + c9743w.m19592j() + ' ' + (interfaceC9728h != null ? interfaceC9728h.mo19323a() : Protocol.HTTP_1_1));
                if (z11) {
                    if (z12) {
                        if (abstractC9744xM19583a.contentType() != null) {
                            m9657d("\tContent-Type: " + abstractC9744xM19583a.contentType());
                        }
                        if (abstractC9744xM19583a.contentLength() != -1) {
                            m9657d("\tContent-Length: " + abstractC9744xM19583a.contentLength());
                        }
                    }
                    C9737q c9737qM19587e = c9743w.m19587e();
                    int size = c9737qM19587e.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        String strM19390b = c9737qM19587e.m19390b(i10);
                        if (!"Content-Type".equalsIgnoreCase(strM19390b) && !"Content-Length".equalsIgnoreCase(strM19390b)) {
                            m9657d("\t" + strM19390b + ": " + c9737qM19587e.m19393f(i10));
                        }
                    }
                    m9657d(" ");
                    if (z10 && z12) {
                        if (m9655c(abstractC9744xM19583a.contentType())) {
                            m9656a(c9743w);
                        } else {
                            m9657d("\tbody: maybe [binary body], omitted!");
                        }
                    }
                }
                sb2 = new StringBuilder();
            } catch (Exception e10) {
                AbstractC9204c.m18111a(e10);
                sb2 = new StringBuilder();
            }
            sb2.append("--> END ");
            sb2.append(c9743w.m19589g());
            m9657d(sb2.toString());
        } catch (Throwable th) {
            m9657d("--> END " + c9743w.m19589g());
            throw th;
        }
    }

    /* renamed from: f */
    public final C9745y m9659f(C9745y c9745y, long j10) {
        C9745y c9745yM19648c = c9745y.m19641v().m19648c();
        AbstractC9746z abstractC9746zM19628e = c9745yM19648c.m19628e();
        Level level = this.f12680a;
        Level level2 = Level.BODY;
        boolean z10 = true;
        boolean z11 = level == level2;
        if (this.f12680a != level2 && this.f12680a != Level.HEADERS) {
            z10 = false;
        }
        try {
            try {
                m9657d("<-- " + c9745yM19648c.m19632j() + ' ' + c9745yM19648c.m19639t() + ' ' + c9745yM19648c.m19645z().m19592j() + " (" + j10 + "ms）");
                if (z10) {
                    C9737q c9737qM19637r = c9745yM19648c.m19637r();
                    int size = c9737qM19637r.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        m9657d("\t" + c9737qM19637r.m19390b(i10) + ": " + c9737qM19637r.m19393f(i10));
                    }
                    m9657d(" ");
                    if (z11 && AbstractC10678e.m22613a(c9745yM19648c)) {
                        if (abstractC9746zM19628e == null) {
                            m9657d("<-- END HTTP");
                            return c9745y;
                        }
                        if (m9655c(abstractC9746zM19628e.contentType())) {
                            byte[] bArrM18107f = AbstractC9203b.m18107f(abstractC9746zM19628e.byteStream());
                            m9657d("\tbody:" + new String(bArrM18107f, m9654b(abstractC9746zM19628e.contentType())));
                            C9745y c9745yM19648c2 = c9745y.m19641v().m19647b(AbstractC9746z.create(abstractC9746zM19628e.contentType(), bArrM18107f)).m19648c();
                            m9657d("<-- END HTTP");
                            return c9745yM19648c2;
                        }
                        m9657d("\tbody: maybe [binary body], omitted!");
                    }
                }
                m9657d("<-- END HTTP");
                return c9745y;
            } catch (Exception e10) {
                AbstractC9204c.m18111a(e10);
                m9657d("<-- END HTTP");
                return c9745y;
            }
        } catch (Throwable th) {
            m9657d("<-- END HTTP");
            throw th;
        }
    }

    /* renamed from: g */
    public void m9660g(java.util.logging.Level level) {
        this.f12681b = level;
    }

    /* renamed from: h */
    public void m9661h(Level level) {
        if (this.f12680a == null) {
            throw new NullPointerException("printLevel == null. Use Level.NONE instead.");
        }
        this.f12680a = level;
    }

    @Override // je.InterfaceC9739s
    public C9745y intercept(InterfaceC9739s.a aVar) throws Exception {
        C9743w c9743wRequest = aVar.request();
        if (this.f12680a == Level.NONE) {
            return aVar.mo19477a(c9743wRequest);
        }
        m9658e(c9743wRequest, aVar.mo19478b());
        try {
            return m9659f(aVar.mo19477a(c9743wRequest), TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - System.nanoTime()));
        } catch (Exception e10) {
            m9657d("<-- HTTP FAILED: " + e10);
            throw e10;
        }
    }
}
