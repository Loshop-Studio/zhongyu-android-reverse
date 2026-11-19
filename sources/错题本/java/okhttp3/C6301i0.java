package okhttp3;

import java.io.Closeable;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.internal.connection.C6305d;

/* renamed from: okhttp3.i0 */
/* loaded from: classes4.dex */
public final class C6301i0 implements Closeable {

    /* renamed from: a */
    public final C6289c0 f10104a;

    /* renamed from: b */
    public final Protocol f10105b;

    /* renamed from: c */
    public final String f10106c;

    /* renamed from: d */
    public final int f10107d;

    /* renamed from: e */
    public final C6328p f10108e;

    /* renamed from: f */
    public final C6329q f10109f;

    /* renamed from: g */
    public final AbstractC6323m0 f10110g;

    /* renamed from: h */
    public final C6301i0 f10111h;

    /* renamed from: i */
    public final C6301i0 f10112i;

    /* renamed from: j */
    public final C6301i0 f10113j;

    /* renamed from: k */
    public final long f10114k;

    /* renamed from: l */
    public final long f10115l;

    /* renamed from: m */
    public final C6305d f10116m;

    public C6301i0(C6289c0 request, Protocol protocol, String message, int i, C6328p c6328p, C6329q c6329q, AbstractC6323m0 abstractC6323m0, C6301i0 c6301i0, C6301i0 c6301i02, C6301i0 c6301i03, long j7, long j8, C6305d c6305d) {
        AbstractC5830k.m5330g(request, "request");
        AbstractC5830k.m5330g(protocol, "protocol");
        AbstractC5830k.m5330g(message, "message");
        this.f10104a = request;
        this.f10105b = protocol;
        this.f10106c = message;
        this.f10107d = i;
        this.f10108e = c6328p;
        this.f10109f = c6329q;
        this.f10110g = abstractC6323m0;
        this.f10111h = c6301i0;
        this.f10112i = c6301i02;
        this.f10113j = c6301i03;
        this.f10114k = j7;
        this.f10115l = j8;
        this.f10116m = c6305d;
    }

    /* renamed from: a */
    public static String m5898a(String str, C6301i0 c6301i0) {
        c6301i0.getClass();
        String strM5962a = c6301i0.f10109f.m5962a(str);
        if (strM5962a == null) {
            return null;
        }
        return strM5962a;
    }

    /* renamed from: b */
    public final boolean m5899b() {
        int i = this.f10107d;
        return 200 <= i && i < 300;
    }

    /* renamed from: c */
    public final C6299h0 m5900c() {
        C6299h0 c6299h0 = new C6299h0();
        c6299h0.f10091a = this.f10104a;
        c6299h0.f10092b = this.f10105b;
        c6299h0.f10093c = this.f10107d;
        c6299h0.f10094d = this.f10106c;
        c6299h0.f10095e = this.f10108e;
        c6299h0.f10096f = this.f10109f.m5964c();
        c6299h0.f10097g = this.f10110g;
        c6299h0.f10098h = this.f10111h;
        c6299h0.f10099i = this.f10112i;
        c6299h0.f10100j = this.f10113j;
        c6299h0.f10101k = this.f10114k;
        c6299h0.f10102l = this.f10115l;
        c6299h0.f10103m = this.f10116m;
        return c6299h0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC6323m0 abstractC6323m0 = this.f10110g;
        if (abstractC6323m0 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC6323m0.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f10105b + ", code=" + this.f10107d + ", message=" + this.f10106c + ", url=" + this.f10104a.f10075a + '}';
    }
}
