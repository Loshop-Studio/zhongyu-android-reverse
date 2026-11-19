package okhttp3;

import kotlin.jvm.internal.C5834o;
import okhttp3.internal.connection.C6305d;

/* renamed from: okhttp3.h0 */
/* loaded from: classes4.dex */
public final class C6299h0 {

    /* renamed from: a */
    public C6289c0 f10091a;

    /* renamed from: b */
    public Protocol f10092b;

    /* renamed from: d */
    public String f10094d;

    /* renamed from: e */
    public C6328p f10095e;

    /* renamed from: g */
    public AbstractC6323m0 f10097g;

    /* renamed from: h */
    public C6301i0 f10098h;

    /* renamed from: i */
    public C6301i0 f10099i;

    /* renamed from: j */
    public C6301i0 f10100j;

    /* renamed from: k */
    public long f10101k;

    /* renamed from: l */
    public long f10102l;

    /* renamed from: m */
    public C6305d f10103m;

    /* renamed from: c */
    public int f10093c = -1;

    /* renamed from: f */
    public C5834o f10096f = new C5834o(2, false);

    /* renamed from: b */
    public static void m5896b(String str, C6301i0 c6301i0) {
        if (c6301i0 != null) {
            if (c6301i0.f10110g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (c6301i0.f10111h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (c6301i0.f10112i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (c6301i0.f10113j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    /* renamed from: a */
    public final C6301i0 m5897a() {
        int i = this.f10093c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f10093c).toString());
        }
        C6289c0 c6289c0 = this.f10091a;
        if (c6289c0 == null) {
            throw new IllegalStateException("request == null");
        }
        Protocol protocol = this.f10092b;
        if (protocol == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f10094d;
        if (str != null) {
            return new C6301i0(c6289c0, protocol, str, i, this.f10095e, this.f10096f.m5348f(), this.f10097g, this.f10098h, this.f10099i, this.f10100j, this.f10101k, this.f10102l, this.f10103m);
        }
        throw new IllegalStateException("message == null");
    }
}
