package p178u7;

import okio.Buffer;
import okio.Source;
import okio.Timeout;
import p139p7.AbstractC6396c;

/* renamed from: u7.u */
/* loaded from: classes4.dex */
public final class C6647u implements Source {

    /* renamed from: a */
    public final long f11191a;

    /* renamed from: b */
    public boolean f11192b;

    /* renamed from: c */
    public final Buffer f11193c = new Buffer();

    /* renamed from: d */
    public final Buffer f11194d = new Buffer();

    /* renamed from: e */
    public boolean f11195e;

    /* renamed from: f */
    public final /* synthetic */ C6649w f11196f;

    public C6647u(C6649w c6649w, long j7, boolean z8) {
        this.f11196f = c6649w;
        this.f11191a = j7;
        this.f11192b = z8;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long size;
        C6649w c6649w = this.f11196f;
        synchronized (c6649w) {
            this.f11195e = true;
            size = this.f11194d.size();
            this.f11194d.clear();
            c6649w.notifyAll();
        }
        if (size > 0) {
            C6649w c6649w2 = this.f11196f;
            byte[] bArr = AbstractC6396c.f10486a;
            c6649w2.f11199b.m6282f(size);
        }
        this.f11196f.m6294a();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0 A[LOOP:0: B:4:0x0011->B:47:0x00a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a4 A[SYNTHETIC] */
    @Override // okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(okio.Buffer r17, long r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p178u7.C6647u.read(okio.Buffer, long):long");
    }

    @Override // okio.Source
    /* renamed from: timeout */
    public final Timeout getTimeout() {
        return this.f11196f.f11208k;
    }
}
