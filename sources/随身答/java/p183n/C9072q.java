package p183n;

import coil3.util.AbstractC5348c;
import kotlin.Unit;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import p183n.InterfaceC9073r;

/* renamed from: n.q */
/* loaded from: classes3.dex */
public final class C9072q implements InterfaceC9073r {

    /* renamed from: a */
    public final Path f15256a;

    /* renamed from: b */
    public final FileSystem f15257b;

    /* renamed from: c */
    public final String f15258c;

    /* renamed from: d */
    public final AutoCloseable f15259d;

    /* renamed from: e */
    public final InterfaceC9073r.a f15260e;

    /* renamed from: f */
    public final Object f15261f = new Object();

    /* renamed from: g */
    public boolean f15262g;

    /* renamed from: h */
    public BufferedSource f15263h;

    public C9072q(Path path, FileSystem fileSystem, String str, AutoCloseable autoCloseable, InterfaceC9073r.a aVar) {
        this.f15256a = path;
        this.f15257b = fileSystem;
        this.f15258c = str;
        this.f15259d = autoCloseable;
        this.f15260e = aVar;
    }

    /* renamed from: a */
    public final void m14548a() {
        if (this.f15262g) {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: c */
    public Path m14549c() {
        Path path;
        synchronized (this.f15261f) {
            m14548a();
            path = this.f15256a;
        }
        return path;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f15261f) {
            try {
                this.f15262g = true;
                BufferedSource bufferedSource = this.f15263h;
                if (bufferedSource != null) {
                    AbstractC5348c.m2931h(bufferedSource);
                }
                AutoCloseable autoCloseable = this.f15259d;
                if (autoCloseable != null) {
                    AbstractC5348c.m2932i(autoCloseable);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p183n.InterfaceC9073r
    /* renamed from: f */
    public Path mo14550f() {
        return m14549c();
    }

    /* renamed from: g */
    public final String m14551g() {
        return this.f15258c;
    }

    @Override // p183n.InterfaceC9073r
    public FileSystem getFileSystem() {
        return this.f15257b;
    }

    @Override // p183n.InterfaceC9073r
    public InterfaceC9073r.a getMetadata() {
        return this.f15260e;
    }

    @Override // p183n.InterfaceC9073r
    public BufferedSource source() {
        synchronized (this.f15261f) {
            m14548a();
            BufferedSource bufferedSource = this.f15263h;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            BufferedSource bufferedSourceBuffer = Okio.buffer(getFileSystem().source(this.f15256a));
            this.f15263h = bufferedSourceBuffer;
            return bufferedSourceBuffer;
        }
    }
}
