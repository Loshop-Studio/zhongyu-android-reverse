package p228l;

import coil3.util.AbstractC5490c;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import p228l.InterfaceC10085r;
import p309qc.C10786q;

/* renamed from: l.q */
/* loaded from: classes3.dex */
public final class C10084q implements InterfaceC10085r {

    /* renamed from: c */
    public final Path f24098c;

    /* renamed from: d */
    public final FileSystem f24099d;

    /* renamed from: e */
    public final String f24100e;

    /* renamed from: f */
    public final AutoCloseable f24101f;

    /* renamed from: g */
    public final InterfaceC10085r.a f24102g;

    /* renamed from: h */
    public final Object f24103h = new Object();

    /* renamed from: i */
    public boolean f24104i;

    /* renamed from: j */
    public BufferedSource f24105j;

    public C10084q(Path path, FileSystem fileSystem, String str, AutoCloseable autoCloseable, InterfaceC10085r.a aVar) {
        this.f24098c = path;
        this.f24099d = fileSystem;
        this.f24100e = str;
        this.f24101f = autoCloseable;
        this.f24102g = aVar;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f24103h) {
            try {
                this.f24104i = true;
                BufferedSource bufferedSource = this.f24105j;
                if (bufferedSource != null) {
                    AbstractC5490c.m3308h(bufferedSource);
                }
                AutoCloseable autoCloseable = this.f24101f;
                if (autoCloseable != null) {
                    AbstractC5490c.m3309i(autoCloseable);
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public final void m21090e() {
        if (this.f24104i) {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: f */
    public Path m21091f() {
        Path path;
        synchronized (this.f24103h) {
            m21090e();
            path = this.f24098c;
        }
        return path;
    }

    /* renamed from: g */
    public final String m21092g() {
        return this.f24100e;
    }

    @Override // p228l.InterfaceC10085r
    public FileSystem getFileSystem() {
        return this.f24099d;
    }

    @Override // p228l.InterfaceC10085r
    public InterfaceC10085r.a getMetadata() {
        return this.f24102g;
    }

    @Override // p228l.InterfaceC10085r
    /* renamed from: q */
    public Path mo21093q() {
        return m21091f();
    }

    @Override // p228l.InterfaceC10085r
    public BufferedSource source() {
        synchronized (this.f24103h) {
            m21090e();
            BufferedSource bufferedSource = this.f24105j;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            BufferedSource bufferedSourceBuffer = Okio.buffer(getFileSystem().source(this.f24098c));
            this.f24105j = bufferedSourceBuffer;
            return bufferedSourceBuffer;
        }
    }
}
