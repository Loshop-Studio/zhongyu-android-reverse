package p178u7;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.collections.AbstractC5810y;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.C5834o;
import kotlin.text.AbstractC5855p;
import kotlinx.serialization.json.internal.C6031l;
import okhttp3.C6289c0;
import okhttp3.C6299h0;
import okhttp3.C6301i0;
import okhttp3.C6329q;
import okhttp3.C6330r;
import okhttp3.C6338z;
import okhttp3.Protocol;
import okhttp3.internal.connection.C6312k;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okio.ByteString;
import okio.Sink;
import okio.Source;
import p073h4.AbstractC5625a;
import p139p7.AbstractC6396c;
import p161s7.AbstractC6569d;
import p161s7.C6570e;
import p161s7.InterfaceC6568c;

/* renamed from: u7.p */
/* loaded from: classes4.dex */
public final class C6642p implements InterfaceC6568c {

    /* renamed from: g */
    public static final List f11169g = AbstractC6396c.m6050j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h */
    public static final List f11170h = AbstractC6396c.m6050j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    public final C6312k f11171a;

    /* renamed from: b */
    public final C6570e f11172b;

    /* renamed from: c */
    public final C6641o f11173c;

    /* renamed from: d */
    public volatile C6649w f11174d;

    /* renamed from: e */
    public final Protocol f11175e;

    /* renamed from: f */
    public volatile boolean f11176f;

    public C6642p(C6338z c6338z, C6312k c6312k, C6570e c6570e, C6641o http2Connection) {
        AbstractC5830k.m5330g(http2Connection, "http2Connection");
        this.f11171a = c6312k;
        this.f11172b = c6570e;
        this.f11173c = http2Connection;
        List list = c6338z.f10342s;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f11175e = list.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // p161s7.InterfaceC6568c
    /* renamed from: a */
    public final void mo6203a() {
        C6649w c6649w = this.f11174d;
        AbstractC5830k.m5327d(c6649w);
        c6649w.m6299f().close();
    }

    @Override // p161s7.InterfaceC6568c
    /* renamed from: b */
    public final Source mo6204b(C6301i0 c6301i0) {
        C6649w c6649w = this.f11174d;
        AbstractC5830k.m5327d(c6649w);
        return c6649w.f11206i;
    }

    @Override // p161s7.InterfaceC6568c
    /* renamed from: c */
    public final C6312k mo6205c() {
        return this.f11171a;
    }

    @Override // p161s7.InterfaceC6568c
    public final void cancel() {
        this.f11176f = true;
        C6649w c6649w = this.f11174d;
        if (c6649w != null) {
            c6649w.m6298e(ErrorCode.CANCEL);
        }
    }

    @Override // p161s7.InterfaceC6568c
    /* renamed from: d */
    public final long mo6206d(C6301i0 c6301i0) {
        if (AbstractC6569d.m6211a(c6301i0)) {
            return AbstractC6396c.m6049i(c6301i0);
        }
        return 0L;
    }

    @Override // p161s7.InterfaceC6568c
    /* renamed from: e */
    public final Sink mo6207e(C6289c0 request, long j7) {
        AbstractC5830k.m5330g(request, "request");
        C6649w c6649w = this.f11174d;
        AbstractC5830k.m5327d(c6649w);
        return c6649w.m6299f();
    }

    @Override // p161s7.InterfaceC6568c
    /* renamed from: f */
    public final void mo6208f(C6289c0 request) throws IOException {
        int i;
        C6649w c6649w;
        boolean z8;
        AbstractC5830k.m5330g(request, "request");
        if (this.f11174d != null) {
            return;
        }
        boolean z9 = request.f10078d != null;
        C6329q c6329q = request.f10077c;
        ArrayList arrayList = new ArrayList(c6329q.size() + 4);
        arrayList.add(new C6627b(request.f10076b, C6627b.f11093f));
        ByteString byteString = C6627b.f11094g;
        C6330r url = request.f10075a;
        AbstractC5830k.m5330g(url, "url");
        String strM5968b = url.m5968b();
        String strM5970d = url.m5970d();
        if (strM5970d != null) {
            strM5968b = strM5968b + '?' + strM5970d;
        }
        arrayList.add(new C6627b(strM5968b, byteString));
        String strM5962a = request.f10077c.m5962a(HttpHeaders.HOST);
        if (strM5962a != null) {
            arrayList.add(new C6627b(strM5962a, C6627b.f11096i));
        }
        arrayList.add(new C6627b(url.f10265a, C6627b.f11095h));
        int size = c6329q.size();
        for (int i8 = 0; i8 < size; i8++) {
            String strM5963b = c6329q.m5963b(i8);
            Locale US = Locale.US;
            AbstractC5830k.m5329f(US, "US");
            String lowerCase = strM5963b.toLowerCase(US);
            AbstractC5830k.m5329f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f11169g.contains(lowerCase) || (lowerCase.equals("te") && AbstractC5830k.m5325b(c6329q.m5966e(i8), "trailers"))) {
                arrayList.add(new C6627b(lowerCase, c6329q.m5966e(i8)));
            }
        }
        C6641o c6641o = this.f11173c;
        c6641o.getClass();
        boolean z10 = !z9;
        synchronized (c6641o.f11166w) {
            synchronized (c6641o) {
                try {
                    if (c6641o.f11148e > 1073741823) {
                        c6641o.m6281e(ErrorCode.REFUSED_STREAM);
                    }
                    if (c6641o.f11149f) {
                        throw new ConnectionShutdownException();
                    }
                    i = c6641o.f11148e;
                    c6641o.f11148e = i + 2;
                    c6649w = new C6649w(i, c6641o, z10, false, null);
                    z8 = !z9 || c6641o.f11163t >= c6641o.f11164u || c6649w.f11202e >= c6649w.f11203f;
                    if (c6649w.m6301h()) {
                        c6641o.f11145b.put(Integer.valueOf(i), c6649w);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c6641o.f11166w.m6308e(arrayList, i, z10);
        }
        if (z8) {
            c6641o.f11166w.flush();
        }
        this.f11174d = c6649w;
        if (this.f11176f) {
            C6649w c6649w2 = this.f11174d;
            AbstractC5830k.m5327d(c6649w2);
            c6649w2.m6298e(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        C6649w c6649w3 = this.f11174d;
        AbstractC5830k.m5327d(c6649w3);
        C6648v c6648v = c6649w3.f11208k;
        long j7 = this.f11172b.f10971g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c6648v.timeout(j7, timeUnit);
        C6649w c6649w4 = this.f11174d;
        AbstractC5830k.m5327d(c6649w4);
        c6649w4.f11209l.timeout(this.f11172b.f10972h, timeUnit);
    }

    @Override // p161s7.InterfaceC6568c
    /* renamed from: g */
    public final C6299h0 mo6209g(boolean z8) throws NumberFormatException, IOException {
        C6329q c6329q;
        C6649w c6649w = this.f11174d;
        if (c6649w == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (c6649w) {
            c6649w.f11208k.enter();
            while (c6649w.f11204g.isEmpty() && c6649w.f11210m == null) {
                try {
                    try {
                        c6649w.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    c6649w.f11208k.m6293a();
                    throw th;
                }
            }
            c6649w.f11208k.m6293a();
            if (c6649w.f11204g.isEmpty()) {
                IOException iOException = c6649w.f11211n;
                if (iOException != null) {
                    throw iOException;
                }
                ErrorCode errorCode = c6649w.f11210m;
                AbstractC5830k.m5327d(errorCode);
                throw new StreamResetException(errorCode);
            }
            Object objRemoveFirst = c6649w.f11204g.removeFirst();
            AbstractC5830k.m5329f(objRemoveFirst, "headersQueue.removeFirst()");
            c6329q = (C6329q) objRemoveFirst;
        }
        Protocol protocol = this.f11175e;
        AbstractC5830k.m5330g(protocol, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = c6329q.size();
        C6031l c6031lM4952l = null;
        for (int i = 0; i < size; i++) {
            String name = c6329q.m5963b(i);
            String value = c6329q.m5966e(i);
            if (AbstractC5830k.m5325b(name, ":status")) {
                c6031lM4952l = AbstractC5625a.m4952l("HTTP/1.1 " + value);
            } else if (!f11170h.contains(name)) {
                AbstractC5830k.m5330g(name, "name");
                AbstractC5830k.m5330g(value, "value");
                arrayList.add(name);
                arrayList.add(AbstractC5855p.m5403k0(value).toString());
            }
        }
        if (c6031lM4952l == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C6299h0 c6299h0 = new C6299h0();
        c6299h0.f10092b = protocol;
        c6299h0.f10093c = c6031lM4952l.f9559b;
        c6299h0.f10094d = (String) c6031lM4952l.f9561d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        C5834o c5834o = new C5834o(2, false);
        AbstractC5810y.m5292T(c5834o.f9224a, strArr);
        c6299h0.f10096f = c5834o;
        if (z8 && c6299h0.f10093c == 100) {
            return null;
        }
        return c6299h0;
    }

    @Override // p161s7.InterfaceC6568c
    /* renamed from: h */
    public final void mo6210h() {
        this.f11173c.f11166w.flush();
    }
}
