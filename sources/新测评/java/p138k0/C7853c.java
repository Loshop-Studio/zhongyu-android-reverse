package p138k0;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: k0.c */
/* loaded from: classes3.dex */
public class C7853c implements Closeable {

    /* renamed from: a */
    public final InputStream f13615a;

    /* renamed from: b */
    public final Charset f13616b;

    /* renamed from: c */
    public byte[] f13617c;

    /* renamed from: d */
    public int f13618d;

    /* renamed from: e */
    public int f13619e;

    /* renamed from: k0.c$a */
    public class a extends ByteArrayOutputStream {
        public a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, C7853c.this.f13616b.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public C7853c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f13615a) {
            try {
                if (this.f13617c != null) {
                    this.f13617c = null;
                    this.f13615a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public final void m13373f() throws IOException {
        InputStream inputStream = this.f13615a;
        byte[] bArr = this.f13617c;
        int i10 = inputStream.read(bArr, 0, bArr.length);
        if (i10 == -1) {
            throw new EOFException();
        }
        this.f13618d = 0;
        this.f13619e = i10;
    }

    /* renamed from: g */
    public boolean m13374g() {
        return this.f13619e == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m13375h() {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.f13615a
            monitor-enter(r0)
            byte[] r1 = r7.f13617c     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L83
            int r1 = r7.f13618d     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f13619e     // Catch: java.lang.Throwable -> L11
            if (r1 < r2) goto L14
            r7.m13373f()     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r1 = move-exception
            goto L8b
        L14:
            int r1 = r7.f13618d     // Catch: java.lang.Throwable -> L11
        L16:
            int r2 = r7.f13619e     // Catch: java.lang.Throwable -> L11
            r3 = 10
            if (r1 == r2) goto L45
            byte[] r2 = r7.f13617c     // Catch: java.lang.Throwable -> L11
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L11
            if (r4 != r3) goto L42
            int r3 = r7.f13618d     // Catch: java.lang.Throwable -> L11
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
            java.nio.charset.Charset r6 = r7.f13616b     // Catch: java.lang.Throwable -> L11
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L11
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L11
            int r1 = r1 + 1
            r7.f13618d = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r5
        L42:
            int r1 = r1 + 1
            goto L16
        L45:
            k0.c$a r1 = new k0.c$a     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f13619e     // Catch: java.lang.Throwable -> L11
            int r4 = r7.f13618d     // Catch: java.lang.Throwable -> L11
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
        L51:
            byte[] r2 = r7.f13617c     // Catch: java.lang.Throwable -> L11
            int r4 = r7.f13618d     // Catch: java.lang.Throwable -> L11
            int r5 = r7.f13619e     // Catch: java.lang.Throwable -> L11
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L11
            r2 = -1
            r7.f13619e = r2     // Catch: java.lang.Throwable -> L11
            r7.m13373f()     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f13618d     // Catch: java.lang.Throwable -> L11
        L63:
            int r4 = r7.f13619e     // Catch: java.lang.Throwable -> L11
            if (r2 == r4) goto L51
            byte[] r4 = r7.f13617c     // Catch: java.lang.Throwable -> L11
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L11
            if (r5 != r3) goto L80
            int r3 = r7.f13618d     // Catch: java.lang.Throwable -> L11
            if (r2 == r3) goto L76
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L11
        L76:
            int r2 = r2 + 1
            r7.f13618d = r2     // Catch: java.lang.Throwable -> L11
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
        throw new UnsupportedOperationException("Method not decompiled: p138k0.C7853c.m13375h():java.lang.String");
    }

    public C7853c(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(AbstractC7854d.f13621a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f13615a = inputStream;
        this.f13616b = charset;
        this.f13617c = new byte[i10];
    }
}
