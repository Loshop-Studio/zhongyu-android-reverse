package retrofit2;

import android.support.v4.media.AbstractC0037f;
import android.support.v4.media.C0039h;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.zykj.mistake.feature.notebook.detail.C4916z4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.C5834o;
import okhttp3.AbstractC6297g0;
import okhttp3.AbstractC6323m0;
import okhttp3.C6287b0;
import okhttp3.C6289c0;
import okhttp3.C6291d0;
import okhttp3.C6299h0;
import okhttp3.C6301i0;
import okhttp3.C6324n;
import okhttp3.C6330r;
import okhttp3.C6333u;
import okhttp3.C6334v;
import okhttp3.C6338z;
import okhttp3.InterfaceC6290d;
import okhttp3.InterfaceC6292e;
import okhttp3.internal.connection.C6310i;
import okio.Buffer;
import p115m4.C6108f;

/* renamed from: retrofit2.x */
/* loaded from: classes4.dex */
public final class C6524x implements InterfaceC6490e {

    /* renamed from: a */
    public final C6507m0 f10800a;

    /* renamed from: b */
    public final Object f10801b;

    /* renamed from: c */
    public final Object[] f10802c;

    /* renamed from: d */
    public final InterfaceC6290d f10803d;

    /* renamed from: e */
    public final InterfaceC6506m f10804e;

    /* renamed from: f */
    public volatile boolean f10805f;

    /* renamed from: g */
    public C6310i f10806g;

    /* renamed from: h */
    public Throwable f10807h;

    /* renamed from: i */
    public boolean f10808i;

    public C6524x(C6507m0 c6507m0, Object obj, Object[] objArr, InterfaceC6290d interfaceC6290d, InterfaceC6506m interfaceC6506m) {
        this.f10800a = c6507m0;
        this.f10801b = obj;
        this.f10802c = objArr;
        this.f10803d = interfaceC6290d;
        this.f10804e = interfaceC6506m;
    }

    @Override // retrofit2.InterfaceC6490e
    /* renamed from: a */
    public final synchronized C6289c0 mo6143a() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return ((C6310i) m6179e()).f10150b;
    }

    @Override // retrofit2.InterfaceC6490e
    /* renamed from: b */
    public final void mo6144b(InterfaceC6496h interfaceC6496h) {
        C6310i c6310i;
        Throwable th;
        synchronized (this) {
            try {
                if (this.f10808i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f10808i = true;
                c6310i = this.f10806g;
                th = this.f10807h;
                if (c6310i == null && th == null) {
                    try {
                        C6310i c6310iM6178c = m6178c();
                        this.f10806g = c6310iM6178c;
                        c6310i = c6310iM6178c;
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC6522v.m6176r(th);
                        this.f10807h = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC6496h.mo117k(this, th);
            return;
        }
        if (this.f10805f) {
            c6310i.cancel();
        }
        c6310i.m5913g(new C0039h(28, this, interfaceC6496h));
    }

    /* renamed from: c */
    public final C6310i m6178c() {
        C6330r c6330rM4285a;
        C6507m0 c6507m0 = this.f10800a;
        AbstractC6522v[] abstractC6522vArr = c6507m0.f10758k;
        Object[] objArr = this.f10802c;
        int length = objArr.length;
        if (length != abstractC6522vArr.length) {
            throw new IllegalArgumentException(AbstractC0037f.m90o(AbstractC0037f.m94s(length, "Argument count (", ") doesn't match expected count ("), ")", abstractC6522vArr.length));
        }
        C6503k0 c6503k0 = new C6503k0(c6507m0.f10751d, c6507m0.f10750c, c6507m0.f10752e, c6507m0.f10753f, c6507m0.f10754g, c6507m0.f10755h, c6507m0.f10756i, c6507m0.f10757j);
        if (c6507m0.f10759l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            abstractC6522vArr[i].mo6137a(c6503k0, objArr[i]);
        }
        C4916z4 c4916z4 = c6503k0.f10714d;
        if (c4916z4 != null) {
            c6330rM4285a = c4916z4.m4285a();
        } else {
            String link = c6503k0.f10713c;
            C6330r c6330r = c6503k0.f10712b;
            c6330r.getClass();
            AbstractC5830k.m5330g(link, "link");
            C4916z4 c4916z4M5972f = c6330r.m5972f(link);
            c6330rM4285a = c4916z4M5972f != null ? c4916z4M5972f.m4285a() : null;
            if (c6330rM4285a == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + c6330r + ", Relative: " + c6503k0.f10713c);
            }
        }
        AbstractC6297g0 c6291d0 = c6503k0.f10721k;
        if (c6291d0 == null) {
            C0039h c0039h = c6503k0.f10720j;
            if (c0039h != null) {
                c6291d0 = new C6324n((ArrayList) c0039h.f96b, (ArrayList) c0039h.f97c);
            } else {
                C6334v c6334v = c6503k0.f10719i;
                if (c6334v != null) {
                    c6291d0 = c6334v.m5977b();
                } else if (c6503k0.f10718h) {
                    c6291d0 = AbstractC6297g0.create((C6333u) null, new byte[0]);
                }
            }
        }
        C6333u c6333u = c6503k0.f10717g;
        C5834o c5834o = c6503k0.f10716f;
        if (c6333u != null) {
            if (c6291d0 != null) {
                c6291d0 = new C6291d0(c6291d0, c6333u);
            } else {
                c5834o.m5344b(HttpHeaders.CONTENT_TYPE, c6333u.f10277a);
            }
        }
        C6287b0 c6287b0 = c6503k0.f10715e;
        c6287b0.getClass();
        c6287b0.f10056a = c6330rM4285a;
        c6287b0.f10058c = c5834o.m5348f().m5964c();
        c6287b0.m5886d(c6503k0.f10711a, c6291d0);
        c6287b0.m5887e(C6518s.class, new C6518s(c6507m0.f10748a, this.f10801b, c6507m0.f10749b, arrayList));
        return ((C6338z) this.f10803d).m5983c(c6287b0.m5884b());
    }

    @Override // retrofit2.InterfaceC6490e
    public final void cancel() {
        C6310i c6310i;
        this.f10805f = true;
        synchronized (this) {
            c6310i = this.f10806g;
        }
        if (c6310i != null) {
            c6310i.cancel();
        }
    }

    public final Object clone() {
        return new C6524x(this.f10800a, this.f10801b, this.f10802c, this.f10803d, this.f10804e);
    }

    @Override // retrofit2.InterfaceC6490e
    /* renamed from: d */
    public final C6509n0 mo6145d() {
        InterfaceC6292e interfaceC6292eM6179e;
        synchronized (this) {
            if (this.f10808i) {
                throw new IllegalStateException("Already executed.");
            }
            this.f10808i = true;
            interfaceC6292eM6179e = m6179e();
        }
        if (this.f10805f) {
            ((C6310i) interfaceC6292eM6179e).cancel();
        }
        return m6180f(((C6310i) interfaceC6292eM6179e).m5914h());
    }

    /* renamed from: e */
    public final InterfaceC6292e m6179e() throws IOException {
        C6310i c6310i = this.f10806g;
        if (c6310i != null) {
            return c6310i;
        }
        Throwable th = this.f10807h;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            C6310i c6310iM6178c = m6178c();
            this.f10806g = c6310iM6178c;
            return c6310iM6178c;
        } catch (IOException | Error | RuntimeException e) {
            AbstractC6522v.m6176r(e);
            this.f10807h = e;
            throw e;
        }
    }

    /* renamed from: f */
    public final C6509n0 m6180f(C6301i0 c6301i0) throws IOException {
        AbstractC6323m0 abstractC6323m0 = c6301i0.f10110g;
        C6299h0 c6299h0M5900c = c6301i0.m5900c();
        c6299h0M5900c.f10097g = new C6523w(abstractC6323m0.contentType(), abstractC6323m0.contentLength());
        C6301i0 c6301i0M5897a = c6299h0M5900c.m5897a();
        int i = c6301i0M5897a.f10107d;
        if (i < 200 || i >= 300) {
            try {
                Buffer buffer = new Buffer();
                abstractC6323m0.source().readAll(buffer);
                Objects.requireNonNull(AbstractC6323m0.create(abstractC6323m0.contentType(), abstractC6323m0.contentLength(), buffer), "body == null");
                if (c6301i0M5897a.m5899b()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new C6509n0(c6301i0M5897a, null);
            } finally {
                abstractC6323m0.close();
            }
        }
        if (i == 204 || i == 205) {
            abstractC6323m0.close();
            if (c6301i0M5897a.m5899b()) {
                return new C6509n0(c6301i0M5897a, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        C6108f c6108f = new C6108f(abstractC6323m0);
        try {
            Object objConvert = this.f10804e.convert(c6108f);
            if (c6301i0M5897a.m5899b()) {
                return new C6509n0(c6301i0M5897a, objConvert);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = (IOException) c6108f.f9753d;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // retrofit2.InterfaceC6490e
    public final boolean isCanceled() {
        boolean z8 = true;
        if (this.f10805f) {
            return true;
        }
        synchronized (this) {
            try {
                C6310i c6310i = this.f10806g;
                if (c6310i == null || !c6310i.f10162n) {
                    z8 = false;
                }
            } finally {
            }
        }
        return z8;
    }

    @Override // retrofit2.InterfaceC6490e
    /* renamed from: clone */
    public final InterfaceC6490e mo13994clone() {
        return new C6524x(this.f10800a, this.f10801b, this.f10802c, this.f10803d, this.f10804e);
    }
}
