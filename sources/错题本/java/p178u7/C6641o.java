package p178u7;

import com.zykj.mistake.feature.collection.component.C4568n;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$IntRef;
import okhttp3.internal.http2.ErrorCode;
import okio.BufferedSink;
import okio.BufferedSource;
import p139p7.AbstractC6396c;
import p153r7.C6480b;
import p153r7.C6481c;
import retrofit2.C6513p0;

/* renamed from: u7.o */
/* loaded from: classes4.dex */
public final class C6641o implements Closeable {

    /* renamed from: z */
    public static final C6628b0 f11143z;

    /* renamed from: a */
    public final AbstractC6634h f11144a;

    /* renamed from: b */
    public final LinkedHashMap f11145b = new LinkedHashMap();

    /* renamed from: c */
    public final String f11146c;

    /* renamed from: d */
    public int f11147d;

    /* renamed from: e */
    public int f11148e;

    /* renamed from: f */
    public boolean f11149f;

    /* renamed from: g */
    public final C6481c f11150g;

    /* renamed from: h */
    public final C6480b f11151h;

    /* renamed from: i */
    public final C6480b f11152i;

    /* renamed from: j */
    public final C6480b f11153j;

    /* renamed from: k */
    public final C6626a0 f11154k;

    /* renamed from: l */
    public long f11155l;

    /* renamed from: m */
    public long f11156m;

    /* renamed from: n */
    public long f11157n;

    /* renamed from: o */
    public long f11158o;

    /* renamed from: p */
    public final C6628b0 f11159p;

    /* renamed from: q */
    public C6628b0 f11160q;

    /* renamed from: r */
    public long f11161r;

    /* renamed from: s */
    public long f11162s;

    /* renamed from: t */
    public long f11163t;

    /* renamed from: u */
    public long f11164u;

    /* renamed from: v */
    public final Socket f11165v;

    /* renamed from: w */
    public final C6650x f11166w;

    /* renamed from: x */
    public final C4568n f11167x;

    /* renamed from: y */
    public final LinkedHashSet f11168y;

    static {
        C6628b0 c6628b0 = new C6628b0();
        c6628b0.m6264c(7, 65535);
        c6628b0.m6264c(5, 16384);
        f11143z = c6628b0;
    }

    public C6641o(C6513p0 c6513p0) {
        this.f11144a = (AbstractC6634h) c6513p0.f10775f;
        String str = (String) c6513p0.f10772c;
        if (str == null) {
            AbstractC5830k.m5339p("connectionName");
            throw null;
        }
        this.f11146c = str;
        this.f11148e = 3;
        C6481c c6481c = (C6481c) c6513p0.f10770a;
        this.f11150g = c6481c;
        this.f11151h = c6481c.m6136e();
        this.f11152i = c6481c.m6136e();
        this.f11153j = c6481c.m6136e();
        this.f11154k = C6626a0.f11090a;
        C6628b0 c6628b0 = new C6628b0();
        c6628b0.m6264c(7, 16777216);
        this.f11159p = c6628b0;
        this.f11160q = f11143z;
        this.f11164u = r0.m6262a();
        Socket socket = (Socket) c6513p0.f10771b;
        if (socket == null) {
            AbstractC5830k.m5339p("socket");
            throw null;
        }
        this.f11165v = socket;
        BufferedSink bufferedSink = (BufferedSink) c6513p0.f10774e;
        if (bufferedSink == null) {
            AbstractC5830k.m5339p("sink");
            throw null;
        }
        this.f11166w = new C6650x(bufferedSink);
        BufferedSource bufferedSource = (BufferedSource) c6513p0.f10773d;
        if (bufferedSource == null) {
            AbstractC5830k.m5339p("source");
            throw null;
        }
        this.f11167x = new C4568n(this, new C6645s(bufferedSource));
        this.f11168y = new LinkedHashSet();
    }

    /* renamed from: a */
    public final void m6277a(ErrorCode connectionCode, ErrorCode streamCode, IOException iOException) throws IOException {
        int i;
        Object[] array;
        AbstractC5830k.m5330g(connectionCode, "connectionCode");
        AbstractC5830k.m5330g(streamCode, "streamCode");
        byte[] bArr = AbstractC6396c.f10486a;
        try {
            m6281e(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f11145b.isEmpty()) {
                array = null;
            } else {
                array = this.f11145b.values().toArray(new C6649w[0]);
                this.f11145b.clear();
            }
        }
        C6649w[] c6649wArr = (C6649w[]) array;
        if (c6649wArr != null) {
            for (C6649w c6649w : c6649wArr) {
                try {
                    c6649w.m6296c(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f11166w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f11165v.close();
        } catch (IOException unused4) {
        }
        this.f11151h.m6131d();
        this.f11152i.m6131d();
        this.f11153j.m6131d();
    }

    /* renamed from: b */
    public final void m6278b(IOException iOException) throws IOException {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        m6277a(errorCode, errorCode, iOException);
    }

    /* renamed from: c */
    public final synchronized C6649w m6279c(int i) {
        return (C6649w) this.f11145b.get(Integer.valueOf(i));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        m6277a(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    /* renamed from: d */
    public final synchronized C6649w m6280d(int i) {
        C6649w c6649w;
        c6649w = (C6649w) this.f11145b.remove(Integer.valueOf(i));
        notifyAll();
        return c6649w;
    }

    /* renamed from: e */
    public final void m6281e(ErrorCode statusCode) {
        AbstractC5830k.m5330g(statusCode, "statusCode");
        synchronized (this.f11166w) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            synchronized (this) {
                if (this.f11149f) {
                    return;
                }
                this.f11149f = true;
                int i = this.f11147d;
                ref$IntRef.element = i;
                this.f11166w.m6307d(i, statusCode, AbstractC6396c.f10486a);
            }
        }
    }

    /* renamed from: f */
    public final synchronized void m6282f(long j7) {
        long j8 = this.f11161r + j7;
        this.f11161r = j8;
        long j9 = j8 - this.f11162s;
        if (j9 >= this.f11159p.m6262a() / 2) {
            m6285k(0, j9);
            this.f11162s += j9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f11166w.f11215c);
        r6 = r2;
        r8.f11163t += r6;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6283g(int r9, boolean r10, okio.Buffer r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            u7.x r12 = r8.f11166w
            r12.m6305b(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.f11163t     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.f11164u     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f11145b     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            u7.x r4 = r8.f11166w     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f11215c     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f11163t     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f11163t = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            u7.x r4 = r8.f11166w
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.m6305b(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p178u7.C6641o.m6283g(int, boolean, okio.Buffer, long):void");
    }

    /* renamed from: h */
    public final void m6284h(int i, ErrorCode errorCode) {
        AbstractC5830k.m5330g(errorCode, "errorCode");
        this.f11151h.m6129b(new C6638l(this.f11146c + '[' + i + "] writeSynReset", this, i, errorCode, 2), 0L);
    }

    /* renamed from: k */
    public final void m6285k(int i, long j7) {
        this.f11151h.m6129b(new C6640n(this.f11146c + '[' + i + "] windowUpdate", this, i, j7), 0L);
    }
}
