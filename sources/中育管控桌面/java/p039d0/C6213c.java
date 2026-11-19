package p039d0;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: d0.c */
/* loaded from: classes3.dex */
public class C6213c implements Closeable {

    /* renamed from: a */
    public final InputStream f7495a;

    /* renamed from: b */
    public final Charset f7496b;

    /* renamed from: c */
    public byte[] f7497c;

    /* renamed from: d */
    public int f7498d;

    /* renamed from: e */
    public int f7499e;

    /* renamed from: d0.c$a */
    public class a extends ByteArrayOutputStream {
        public a(int i6) {
            super(i6);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i6 = ((ByteArrayOutputStream) this).count;
            if (i6 > 0 && ((ByteArrayOutputStream) this).buf[i6 - 1] == 13) {
                i6--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i6, C6213c.this.f7496b.name());
            } catch (UnsupportedEncodingException e6) {
                throw new AssertionError(e6);
            }
        }
    }

    public C6213c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: c */
    public final void m6314c() throws IOException {
        InputStream inputStream = this.f7495a;
        byte[] bArr = this.f7497c;
        int i6 = inputStream.read(bArr, 0, bArr.length);
        if (i6 == -1) {
            throw new EOFException();
        }
        this.f7498d = 0;
        this.f7499e = i6;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f7495a) {
            try {
                if (this.f7497c != null) {
                    this.f7497c = null;
                    this.f7495a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public boolean m6315g() {
        return this.f7499e == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m6316h() {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.f7495a
            monitor-enter(r0)
            byte[] r1 = r7.f7497c     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L83
            int r1 = r7.f7498d     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f7499e     // Catch: java.lang.Throwable -> L11
            if (r1 < r2) goto L14
            r7.m6314c()     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r1 = move-exception
            goto L8b
        L14:
            int r1 = r7.f7498d     // Catch: java.lang.Throwable -> L11
        L16:
            int r2 = r7.f7499e     // Catch: java.lang.Throwable -> L11
            r3 = 10
            if (r1 == r2) goto L45
            byte[] r2 = r7.f7497c     // Catch: java.lang.Throwable -> L11
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L11
            if (r4 != r3) goto L42
            int r3 = r7.f7498d     // Catch: java.lang.Throwable -> L11
            if (r1 == r3) goto L2f
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L11
            r6 = 13
            if (r5 != r6) goto L2f
            goto L30
        L2f:
            r4 = r1
        L30:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L11
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r7.f7496b     // Catch: java.lang.Throwable -> L11
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L11
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L11
            int r1 = r1 + 1
            r7.f7498d = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r5
        L42:
            int r1 = r1 + 1
            goto L16
        L45:
            d0.c$a r1 = new d0.c$a     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f7499e     // Catch: java.lang.Throwable -> L11
            int r4 = r7.f7498d     // Catch: java.lang.Throwable -> L11
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
        L51:
            byte[] r2 = r7.f7497c     // Catch: java.lang.Throwable -> L11
            int r4 = r7.f7498d     // Catch: java.lang.Throwable -> L11
            int r5 = r7.f7499e     // Catch: java.lang.Throwable -> L11
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L11
            r2 = -1
            r7.f7499e = r2     // Catch: java.lang.Throwable -> L11
            r7.m6314c()     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f7498d     // Catch: java.lang.Throwable -> L11
        L63:
            int r4 = r7.f7499e     // Catch: java.lang.Throwable -> L11
            if (r2 == r4) goto L51
            byte[] r4 = r7.f7497c     // Catch: java.lang.Throwable -> L11
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L11
            if (r5 != r3) goto L80
            int r3 = r7.f7498d     // Catch: java.lang.Throwable -> L11
            if (r2 == r3) goto L76
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L11
        L76:
            int r2 = r2 + 1
            r7.f7498d = r2     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L80:
            int r2 = r2 + 1
            goto L63
        L83:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
            throw r1     // Catch: java.lang.Throwable -> L11
        L8b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p039d0.C6213c.m6316h():java.lang.String");
    }

    public C6213c(InputStream inputStream, int i6, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(AbstractC6214d.f7501a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f7495a = inputStream;
        this.f7496b = charset;
        this.f7497c = new byte[i6];
    }
}
