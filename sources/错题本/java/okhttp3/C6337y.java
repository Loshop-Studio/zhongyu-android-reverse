package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC5830k;
import p024c0.C3210g;
import p129o2.C6268a;
import p139p7.AbstractC6396c;
import p139p7.C6394a;
import p204y1.AbstractC6768a;
import p215z7.C6841c;

/* renamed from: okhttp3.y */
/* loaded from: classes4.dex */
public final class C6337y {

    /* renamed from: A */
    public C6268a f10294A;

    /* renamed from: a */
    public C3210g f10295a = new C3210g();

    /* renamed from: b */
    public C6268a f10296b = new C6268a(27);

    /* renamed from: c */
    public final ArrayList f10297c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f10298d = new ArrayList();

    /* renamed from: e */
    public C6394a f10299e = new C6394a();

    /* renamed from: f */
    public boolean f10300f = true;

    /* renamed from: g */
    public C6286b f10301g;

    /* renamed from: h */
    public boolean f10302h;

    /* renamed from: i */
    public boolean f10303i;

    /* renamed from: j */
    public C6286b f10304j;

    /* renamed from: k */
    public C6286b f10305k;

    /* renamed from: l */
    public Proxy f10306l;

    /* renamed from: m */
    public ProxySelector f10307m;

    /* renamed from: n */
    public C6286b f10308n;

    /* renamed from: o */
    public SocketFactory f10309o;

    /* renamed from: p */
    public SSLSocketFactory f10310p;

    /* renamed from: q */
    public X509TrustManager f10311q;

    /* renamed from: r */
    public List f10312r;

    /* renamed from: s */
    public List f10313s;

    /* renamed from: t */
    public HostnameVerifier f10314t;

    /* renamed from: u */
    public C6298h f10315u;

    /* renamed from: v */
    public AbstractC6768a f10316v;

    /* renamed from: w */
    public int f10317w;

    /* renamed from: x */
    public int f10318x;

    /* renamed from: y */
    public int f10319y;

    /* renamed from: z */
    public long f10320z;

    public C6337y() {
        C6286b c6286b = C6286b.f10053a;
        this.f10301g = c6286b;
        this.f10302h = true;
        this.f10303i = true;
        this.f10304j = C6286b.f10054b;
        this.f10305k = C6286b.f10055c;
        this.f10308n = c6286b;
        SocketFactory socketFactory = SocketFactory.getDefault();
        AbstractC5830k.m5329f(socketFactory, "getDefault()");
        this.f10309o = socketFactory;
        this.f10312r = C6338z.f10322C;
        this.f10313s = C6338z.f10321B;
        this.f10314t = C6841c.f11594a;
        this.f10315u = C6298h.f10088c;
        this.f10317w = 10000;
        this.f10318x = 10000;
        this.f10319y = 10000;
        this.f10320z = 1024L;
    }

    /* renamed from: a */
    public final void m5980a(long j7, TimeUnit unit) {
        AbstractC5830k.m5330g(unit, "unit");
        this.f10317w = AbstractC6396c.m6042b(j7, unit);
    }

    /* renamed from: b */
    public final void m5981b(long j7, TimeUnit unit) {
        AbstractC5830k.m5330g(unit, "unit");
        this.f10318x = AbstractC6396c.m6042b(j7, unit);
    }

    /* renamed from: c */
    public final void m5982c(long j7, TimeUnit unit) {
        AbstractC5830k.m5330g(unit, "unit");
        this.f10319y = AbstractC6396c.m6042b(j7, unit);
    }
}
