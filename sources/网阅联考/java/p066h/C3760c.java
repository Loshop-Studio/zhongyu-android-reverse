package p066h;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: h.c */
/* loaded from: classes2.dex */
public class C3760c implements Closeable {

    /* renamed from: a */
    public final InputStream f4439a;

    /* renamed from: b */
    public final Charset f4440b;

    /* renamed from: c */
    public byte[] f4441c;

    /* renamed from: d */
    public int f4442d;

    /* renamed from: e */
    public int f4443e;

    /* renamed from: h.c$a */
    public class a extends ByteArrayOutputStream {
        public a(int i4) {
            super(i4);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i4 = ((ByteArrayOutputStream) this).count;
            if (i4 > 0 && ((ByteArrayOutputStream) this).buf[i4 - 1] == 13) {
                i4--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i4, C3760c.this.f4440b.name());
            } catch (UnsupportedEncodingException e4) {
                throw new AssertionError(e4);
            }
        }
    }

    public C3760c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: b */
    public final void m4845b() throws IOException {
        InputStream inputStream = this.f4439a;
        byte[] bArr = this.f4441c;
        int i4 = inputStream.read(bArr, 0, bArr.length);
        if (i4 == -1) {
            throw new EOFException();
        }
        this.f4442d = 0;
        this.f4443e = i4;
    }

    /* renamed from: c */
    public boolean m4846c() {
        return this.f4443e == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f4439a) {
            if (this.f4441c != null) {
                this.f4441c = null;
                this.f4439a.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m4847d() {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.f4439a
            monitor-enter(r0)
            byte[] r1 = r7.f4441c     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto L7f
            int r1 = r7.f4442d     // Catch: java.lang.Throwable -> L87
            int r2 = r7.f4443e     // Catch: java.lang.Throwable -> L87
            if (r1 < r2) goto L10
            r7.m4845b()     // Catch: java.lang.Throwable -> L87
        L10:
            int r1 = r7.f4442d     // Catch: java.lang.Throwable -> L87
        L12:
            int r2 = r7.f4443e     // Catch: java.lang.Throwable -> L87
            r3 = 10
            if (r1 == r2) goto L41
            byte[] r2 = r7.f4441c     // Catch: java.lang.Throwable -> L87
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L87
            if (r4 != r3) goto L3e
            int r3 = r7.f4442d     // Catch: java.lang.Throwable -> L87
            if (r1 == r3) goto L2b
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L87
            r6 = 13
            if (r5 != r6) goto L2b
            goto L2c
        L2b:
            r4 = r1
        L2c:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L87
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r7.f4440b     // Catch: java.lang.Throwable -> L87
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L87
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L87
            int r1 = r1 + 1
            r7.f4442d = r1     // Catch: java.lang.Throwable -> L87
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            return r5
        L3e:
            int r1 = r1 + 1
            goto L12
        L41:
            h.c$a r1 = new h.c$a     // Catch: java.lang.Throwable -> L87
            int r2 = r7.f4443e     // Catch: java.lang.Throwable -> L87
            int r4 = r7.f4442d     // Catch: java.lang.Throwable -> L87
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L87
        L4d:
            byte[] r2 = r7.f4441c     // Catch: java.lang.Throwable -> L87
            int r4 = r7.f4442d     // Catch: java.lang.Throwable -> L87
            int r5 = r7.f4443e     // Catch: java.lang.Throwable -> L87
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L87
            r2 = -1
            r7.f4443e = r2     // Catch: java.lang.Throwable -> L87
            r7.m4845b()     // Catch: java.lang.Throwable -> L87
            int r2 = r7.f4442d     // Catch: java.lang.Throwable -> L87
        L5f:
            int r4 = r7.f4443e     // Catch: java.lang.Throwable -> L87
            if (r2 == r4) goto L4d
            byte[] r4 = r7.f4441c     // Catch: java.lang.Throwable -> L87
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L87
            if (r5 != r3) goto L7c
            int r3 = r7.f4442d     // Catch: java.lang.Throwable -> L87
            if (r2 == r3) goto L72
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L87
        L72:
            int r2 = r2 + 1
            r7.f4442d = r2     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L87
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            return r1
        L7c:
            int r2 = r2 + 1
            goto L5f
        L7f:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L87
            throw r1     // Catch: java.lang.Throwable -> L87
        L87:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p066h.C3760c.m4847d():java.lang.String");
    }

    public C3760c(InputStream inputStream, int i4, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(AbstractC3761d.f4445a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f4439a = inputStream;
        this.f4440b = charset;
        this.f4441c = new byte[i4];
    }
}
