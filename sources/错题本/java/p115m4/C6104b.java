package p115m4;

import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.Regex;
import okhttp3.C6286b;
import okhttp3.C6301i0;
import okhttp3.InterfaceC6332t;

/* renamed from: m4.b */
/* loaded from: classes3.dex */
public final class C6104b implements InterfaceC6332t {

    /* renamed from: a */
    public final /* synthetic */ int f9745a;

    /* renamed from: b */
    public final Object f9746b;

    public /* synthetic */ C6104b(Object obj, int i) {
        this.f9745a = i;
        this.f9746b = obj;
    }

    /* renamed from: c */
    public static int m5802c(C6301i0 c6301i0, int i) throws NumberFormatException {
        String strM5898a = C6301i0.m5898a("Retry-After", c6301i0);
        if (strM5898a == null) {
            return i;
        }
        if (!new Regex("\\d+").matches(strM5898a)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM5898a);
        AbstractC5830k.m5329f(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.C6289c0 m5803a(okhttp3.C6301i0 r12, okhttp3.internal.connection.C6305d r13) throws java.net.ProtocolException {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p115m4.C6104b.m5803a(okhttp3.i0, okhttp3.internal.connection.d):okhttp3.c0");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008f  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m5804b(java.io.IOException r4, okhttp3.internal.connection.C6310i r5, okhttp3.C6289c0 r6, boolean r7) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f9746b
            okhttp3.z r0 = (okhttp3.C6338z) r0
            boolean r0 = r0.f10329f
            r1 = 0
            if (r0 != 0) goto Lb
            goto La7
        Lb:
            if (r7 == 0) goto L1c
            okhttp3.g0 r6 = r6.f10078d
            if (r6 == 0) goto L17
            boolean r6 = r6.isOneShot()
            if (r6 != 0) goto La7
        L17:
            boolean r6 = r4 instanceof java.io.FileNotFoundException
            if (r6 == 0) goto L1c
            return r1
        L1c:
            boolean r6 = r4 instanceof java.net.ProtocolException
            if (r6 == 0) goto L21
            return r1
        L21:
            boolean r6 = r4 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L2c
            boolean r4 = r4 instanceof java.net.SocketTimeoutException
            if (r4 == 0) goto La7
            if (r7 != 0) goto La7
            goto L3f
        L2c:
            boolean r6 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r6 == 0) goto L3a
            java.lang.Throwable r6 = r4.getCause()
            boolean r6 = r6 instanceof java.security.cert.CertificateException
            if (r6 == 0) goto L3a
            goto La7
        L3a:
            boolean r4 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L3f
            return r1
        L3f:
            okhttp3.internal.connection.e r4 = r5.f10155g
            kotlin.jvm.internal.AbstractC5830k.m5327d(r4)
            int r5 = r4.f10140f
            r6 = 1
            if (r5 != 0) goto L53
            int r7 = r4.f10141g
            if (r7 != 0) goto L53
            int r7 = r4.f10142h
            if (r7 != 0) goto L53
            r4 = r1
            goto La5
        L53:
            okhttp3.n0 r7 = r4.f10143i
            if (r7 == 0) goto L58
            goto La0
        L58:
            r7 = 0
            if (r5 > r6) goto L8b
            int r5 = r4.f10141g
            if (r5 > r6) goto L8b
            int r5 = r4.f10142h
            if (r5 <= 0) goto L64
            goto L8b
        L64:
            okhttp3.internal.connection.i r5 = r4.f10137c
            okhttp3.internal.connection.k r5 = r5.f10156h
            if (r5 != 0) goto L6b
            goto L8b
        L6b:
            monitor-enter(r5)
            int r0 = r5.f10176l     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L72
            monitor-exit(r5)
            goto L8b
        L72:
            okhttp3.n0 r0 = r5.f10166b     // Catch: java.lang.Throwable -> L88
            okhttp3.a r0 = r0.f10256a     // Catch: java.lang.Throwable -> L88
            okhttp3.r r0 = r0.f10050i     // Catch: java.lang.Throwable -> L88
            okhttp3.a r2 = r4.f10136b     // Catch: java.lang.Throwable -> L88
            okhttp3.r r2 = r2.f10050i     // Catch: java.lang.Throwable -> L88
            boolean r0 = p139p7.AbstractC6396c.m6041a(r0, r2)     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L84
            monitor-exit(r5)
            goto L8b
        L84:
            okhttp3.n0 r7 = r5.f10166b     // Catch: java.lang.Throwable -> L88
            monitor-exit(r5)
            goto L8b
        L88:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L8b:
            if (r7 == 0) goto L91
            r4.f10143i = r7
        L8f:
            r4 = r6
            goto La5
        L91:
            d2.c r5 = r4.f10138d
            if (r5 == 0) goto L9c
            boolean r5 = r5.m4804e()
            if (r5 != r6) goto L9c
            goto La0
        L9c:
            okhttp3.internal.connection.n r4 = r4.f10139e
            if (r4 != 0) goto La1
        La0:
            goto L8f
        La1:
            boolean r4 = r4.m5935a()
        La5:
            if (r4 != 0) goto La8
        La7:
            return r1
        La8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p115m4.C6104b.m5804b(java.io.IOException, okhttp3.internal.connection.i, okhttp3.c0, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
    
        r3.m5915i(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e9, code lost:
    
        return r9;
     */
    @Override // okhttp3.InterfaceC6332t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.C6301i0 intercept(okhttp3.InterfaceC6331s r26) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p115m4.C6104b.intercept(okhttp3.s):okhttp3.i0");
    }

    public C6104b(C6286b cookieJar) {
        this.f9745a = 1;
        AbstractC5830k.m5330g(cookieJar, "cookieJar");
        this.f9746b = cookieJar;
    }
}
