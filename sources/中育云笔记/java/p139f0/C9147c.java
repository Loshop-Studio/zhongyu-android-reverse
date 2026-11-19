package p139f0;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: f0.c */
/* loaded from: classes3.dex */
public class C9147c implements Closeable {

    /* renamed from: c */
    public final InputStream f21381c;

    /* renamed from: d */
    public final Charset f21382d;

    /* renamed from: e */
    public byte[] f21383e;

    /* renamed from: f */
    public int f21384f;

    /* renamed from: g */
    public int f21385g;

    /* renamed from: f0.c$a */
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
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, C9147c.this.f21382d.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public C9147c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f21381c) {
            try {
                if (this.f21383e != null) {
                    this.f21383e = null;
                    this.f21381c.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public final void m18040e() throws IOException {
        InputStream inputStream = this.f21381c;
        byte[] bArr = this.f21383e;
        int i10 = inputStream.read(bArr, 0, bArr.length);
        if (i10 == -1) {
            throw new EOFException();
        }
        this.f21384f = 0;
        this.f21385g = i10;
    }

    /* renamed from: f */
    public boolean m18041f() {
        return this.f21385g == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m18042g() {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.f21381c
            monitor-enter(r0)
            byte[] r1 = r7.f21383e     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L83
            int r1 = r7.f21384f     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f21385g     // Catch: java.lang.Throwable -> L11
            if (r1 < r2) goto L14
            r7.m18040e()     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r1 = move-exception
            goto L8b
        L14:
            int r1 = r7.f21384f     // Catch: java.lang.Throwable -> L11
        L16:
            int r2 = r7.f21385g     // Catch: java.lang.Throwable -> L11
            r3 = 10
            if (r1 == r2) goto L45
            byte[] r2 = r7.f21383e     // Catch: java.lang.Throwable -> L11
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L11
            if (r4 != r3) goto L42
            int r3 = r7.f21384f     // Catch: java.lang.Throwable -> L11
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
            java.nio.charset.Charset r6 = r7.f21382d     // Catch: java.lang.Throwable -> L11
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L11
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L11
            int r1 = r1 + 1
            r7.f21384f = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r5
        L42:
            int r1 = r1 + 1
            goto L16
        L45:
            f0.c$a r1 = new f0.c$a     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f21385g     // Catch: java.lang.Throwable -> L11
            int r4 = r7.f21384f     // Catch: java.lang.Throwable -> L11
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
        L51:
            byte[] r2 = r7.f21383e     // Catch: java.lang.Throwable -> L11
            int r4 = r7.f21384f     // Catch: java.lang.Throwable -> L11
            int r5 = r7.f21385g     // Catch: java.lang.Throwable -> L11
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L11
            r2 = -1
            r7.f21385g = r2     // Catch: java.lang.Throwable -> L11
            r7.m18040e()     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f21384f     // Catch: java.lang.Throwable -> L11
        L63:
            int r4 = r7.f21385g     // Catch: java.lang.Throwable -> L11
            if (r2 == r4) goto L51
            byte[] r4 = r7.f21383e     // Catch: java.lang.Throwable -> L11
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L11
            if (r5 != r3) goto L80
            int r3 = r7.f21384f     // Catch: java.lang.Throwable -> L11
            if (r2 == r3) goto L76
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L11
        L76:
            int r2 = r2 + 1
            r7.f21384f = r2     // Catch: java.lang.Throwable -> L11
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
        throw new UnsupportedOperationException("Method not decompiled: p139f0.C9147c.m18042g():java.lang.String");
    }

    public C9147c(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(AbstractC9148d.f21387a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f21381c = inputStream;
        this.f21382d = charset;
        this.f21383e = new byte[i10];
    }
}
