package p101f0;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: f0.c */
/* loaded from: classes3.dex */
public class C7907c implements Closeable {

    /* renamed from: a */
    public final InputStream f13313a;

    /* renamed from: b */
    public final Charset f13314b;

    /* renamed from: c */
    public byte[] f13315c;

    /* renamed from: d */
    public int f13316d;

    /* renamed from: e */
    public int f13317e;

    /* renamed from: f0.c$a */
    public class a extends ByteArrayOutputStream {
        public a(int i9) {
            super(i9);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i9 = ((ByteArrayOutputStream) this).count;
            if (i9 > 0 && ((ByteArrayOutputStream) this).buf[i9 - 1] == 13) {
                i9--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i9, C7907c.this.f13314b.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public C7907c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: c */
    public final void m12430c() throws IOException {
        InputStream inputStream = this.f13313a;
        byte[] bArr = this.f13315c;
        int i9 = inputStream.read(bArr, 0, bArr.length);
        if (i9 == -1) {
            throw new EOFException();
        }
        this.f13316d = 0;
        this.f13317e = i9;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f13313a) {
            try {
                if (this.f13315c != null) {
                    this.f13315c = null;
                    this.f13313a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public boolean m12431g() {
        return this.f13317e == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m12432h() {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.f13313a
            monitor-enter(r0)
            byte[] r1 = r7.f13315c     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L83
            int r1 = r7.f13316d     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f13317e     // Catch: java.lang.Throwable -> L11
            if (r1 < r2) goto L14
            r7.m12430c()     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r1 = move-exception
            goto L8b
        L14:
            int r1 = r7.f13316d     // Catch: java.lang.Throwable -> L11
        L16:
            int r2 = r7.f13317e     // Catch: java.lang.Throwable -> L11
            r3 = 10
            if (r1 == r2) goto L45
            byte[] r2 = r7.f13315c     // Catch: java.lang.Throwable -> L11
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L11
            if (r4 != r3) goto L42
            int r3 = r7.f13316d     // Catch: java.lang.Throwable -> L11
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
            java.nio.charset.Charset r6 = r7.f13314b     // Catch: java.lang.Throwable -> L11
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L11
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L11
            int r1 = r1 + 1
            r7.f13316d = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r5
        L42:
            int r1 = r1 + 1
            goto L16
        L45:
            f0.c$a r1 = new f0.c$a     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f13317e     // Catch: java.lang.Throwable -> L11
            int r4 = r7.f13316d     // Catch: java.lang.Throwable -> L11
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
        L51:
            byte[] r2 = r7.f13315c     // Catch: java.lang.Throwable -> L11
            int r4 = r7.f13316d     // Catch: java.lang.Throwable -> L11
            int r5 = r7.f13317e     // Catch: java.lang.Throwable -> L11
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L11
            r2 = -1
            r7.f13317e = r2     // Catch: java.lang.Throwable -> L11
            r7.m12430c()     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f13316d     // Catch: java.lang.Throwable -> L11
        L63:
            int r4 = r7.f13317e     // Catch: java.lang.Throwable -> L11
            if (r2 == r4) goto L51
            byte[] r4 = r7.f13315c     // Catch: java.lang.Throwable -> L11
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L11
            if (r5 != r3) goto L80
            int r3 = r7.f13316d     // Catch: java.lang.Throwable -> L11
            if (r2 == r3) goto L76
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L11
        L76:
            int r2 = r2 + 1
            r7.f13316d = r2     // Catch: java.lang.Throwable -> L11
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
        throw new UnsupportedOperationException("Method not decompiled: p101f0.C7907c.m12432h():java.lang.String");
    }

    public C7907c(InputStream inputStream, int i9, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i9 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(AbstractC7908d.f13319a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f13313a = inputStream;
        this.f13314b = charset;
        this.f13315c = new byte[i9];
    }
}
