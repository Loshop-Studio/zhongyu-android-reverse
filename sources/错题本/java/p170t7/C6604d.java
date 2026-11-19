package p170t7;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.C6330r;
import p139p7.AbstractC6396c;

/* renamed from: t7.d */
/* loaded from: classes4.dex */
public final class C6604d extends AbstractC6602b {

    /* renamed from: d */
    public final C6330r f11025d;

    /* renamed from: e */
    public long f11026e;

    /* renamed from: f */
    public boolean f11027f;

    /* renamed from: g */
    public final /* synthetic */ C6607g f11028g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6604d(C6607g c6607g, C6330r url) {
        super(c6607g);
        AbstractC5830k.m5330g(url, "url");
        this.f11028g = c6607g;
        this.f11025d = url;
        this.f11026e = -1L;
        this.f11027f = true;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM6059s;
        if (this.f11020b) {
            return;
        }
        if (this.f11027f) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = AbstractC6396c.f10486a;
            AbstractC5830k.m5330g(timeUnit, "timeUnit");
            try {
                zM6059s = AbstractC6396c.m6059s(this, 100);
            } catch (IOException unused) {
                zM6059s = false;
            }
            if (!zM6059s) {
                this.f11028g.f11033b.m5930k();
                m6250a();
            }
        }
        this.f11020b = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (r11.f11027f == false) goto L30;
     */
    @Override // p170t7.AbstractC6602b, okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(okio.Buffer r12, long r13) throws java.io.IOException {
        /*
            r11 = this;
            t7.g r0 = r11.f11028g
            okio.BufferedSource r1 = r0.f11034c
            java.lang.String r2 = "sink"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r12, r2)
            r2 = 0
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 < 0) goto Ld2
            boolean r4 = r11.f11020b
            if (r4 != 0) goto Lca
            boolean r4 = r11.f11027f
            r5 = -1
            if (r4 != 0) goto L1a
            goto L7f
        L1a:
            long r7 = r11.f11026e
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 == 0) goto L24
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 != 0) goto L80
        L24:
            java.lang.String r4 = "expected chunk size and optional extensions but was \""
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L2d
            r1.readUtf8LineStrict()
        L2d:
            long r7 = r1.readHexadecimalUnsignedLong()     // Catch: java.lang.NumberFormatException -> L55
            r11.f11026e = r7     // Catch: java.lang.NumberFormatException -> L55
            java.lang.String r1 = r1.readUtf8LineStrict()     // Catch: java.lang.NumberFormatException -> L55
            java.lang.CharSequence r1 = kotlin.text.AbstractC5855p.m5403k0(r1)     // Catch: java.lang.NumberFormatException -> L55
            java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> L55
            long r7 = r11.f11026e     // Catch: java.lang.NumberFormatException -> L55
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto La4
            int r7 = r1.length()     // Catch: java.lang.NumberFormatException -> L55
            r8 = 0
            if (r7 <= 0) goto L57
            java.lang.String r7 = ";"
            boolean r7 = kotlin.text.AbstractC5862w.m5409C(r1, r7, r8)     // Catch: java.lang.NumberFormatException -> L55
            if (r7 == 0) goto La4
            goto L57
        L55:
            r12 = move-exception
            goto Lc0
        L57:
            long r9 = r11.f11026e
            int r1 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r1 != 0) goto L7b
            r11.f11027f = r8
            t7.a r1 = r0.f11037f
            okhttp3.q r1 = r1.m6249a()
            r0.f11038g = r1
            okhttp3.z r1 = r0.f11032a
            kotlin.jvm.internal.AbstractC5830k.m5327d(r1)
            okhttp3.b r1 = r1.f10333j
            okhttp3.q r2 = r0.f11038g
            kotlin.jvm.internal.AbstractC5830k.m5327d(r2)
            okhttp3.r r3 = r11.f11025d
            p161s7.AbstractC6569d.m6212b(r1, r3, r2)
            r11.m6250a()
        L7b:
            boolean r1 = r11.f11027f
            if (r1 != 0) goto L80
        L7f:
            return r5
        L80:
            long r1 = r11.f11026e
            long r13 = java.lang.Math.min(r13, r1)
            long r12 = super.read(r12, r13)
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L94
            long r0 = r11.f11026e
            long r0 = r0 - r12
            r11.f11026e = r0
            return r12
        L94:
            okhttp3.internal.connection.k r12 = r0.f11033b
            r12.m5930k()
            java.net.ProtocolException r12 = new java.net.ProtocolException
            java.lang.String r13 = "unexpected end of stream"
            r12.<init>(r13)
            r11.m6250a()
            throw r12
        La4:
            java.net.ProtocolException r12 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> L55
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L55
            r13.<init>(r4)     // Catch: java.lang.NumberFormatException -> L55
            long r2 = r11.f11026e     // Catch: java.lang.NumberFormatException -> L55
            r13.append(r2)     // Catch: java.lang.NumberFormatException -> L55
            r13.append(r1)     // Catch: java.lang.NumberFormatException -> L55
            r14 = 34
            r13.append(r14)     // Catch: java.lang.NumberFormatException -> L55
            java.lang.String r13 = r13.toString()     // Catch: java.lang.NumberFormatException -> L55
            r12.<init>(r13)     // Catch: java.lang.NumberFormatException -> L55
            throw r12     // Catch: java.lang.NumberFormatException -> L55
        Lc0:
            java.net.ProtocolException r13 = new java.net.ProtocolException
            java.lang.String r12 = r12.getMessage()
            r13.<init>(r12)
            throw r13
        Lca:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "closed"
            r12.<init>(r13)
            throw r12
        Ld2:
            java.lang.String r12 = "byteCount < 0: "
            java.lang.String r12 = androidx.collection.AbstractC0584a.m913n(r13, r12)
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p170t7.C6604d.read(okio.Buffer, long):long");
    }
}
