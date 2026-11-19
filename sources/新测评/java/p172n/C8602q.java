package p172n;

import coil3.util.AbstractC5213c;
import kotlin.Unit;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import p172n.InterfaceC8603r;

/* renamed from: n.q */
/* loaded from: classes3.dex */
public final class C8602q implements InterfaceC8603r {

    /* renamed from: a */
    public final Path f14240a;

    /* renamed from: b */
    public final FileSystem f14241b;

    /* renamed from: c */
    public final String f14242c;

    /* renamed from: d */
    public final AutoCloseable f14243d;

    /* renamed from: e */
    public final InterfaceC8603r.a f14244e;

    /* renamed from: f */
    public final Object f14245f = new Object();

    /* renamed from: g */
    public boolean f14246g;

    /* renamed from: h */
    public BufferedSource f14247h;

    public C8602q(Path path, FileSystem fileSystem, String str, AutoCloseable autoCloseable, InterfaceC8603r.a aVar) {
        this.f14240a = path;
        this.f14241b = fileSystem;
        this.f14242c = str;
        this.f14243d = autoCloseable;
        this.f14244e = aVar;
    }

    /* renamed from: a */
    public final void m14157a() {
        if (this.f14246g) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f14245f) {
            try {
                this.f14246g = true;
                BufferedSource bufferedSource = this.f14247h;
                if (bufferedSource != null) {
                    AbstractC5213c.m3214h(bufferedSource);
                }
                AutoCloseable autoCloseable = this.f14243d;
                if (autoCloseable != null) {
                    AbstractC5213c.m3215i(autoCloseable);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p172n.InterfaceC8603r
    /* renamed from: e */
    public Path mo14158e() {
        return m14159f();
    }

    /* renamed from: f */
    public Path m14159f() {
        Path path;
        synchronized (this.f14245f) {
            m14157a();
            path = this.f14240a;
        }
        return path;
    }

    /* renamed from: g */
    public final String m14160g() {
        return this.f14242c;
    }

    @Override // p172n.InterfaceC8603r
    public FileSystem getFileSystem() {
        return this.f14241b;
    }

    @Override // p172n.InterfaceC8603r
    public InterfaceC8603r.a getMetadata() {
        return this.f14244e;
    }

    @Override // p172n.InterfaceC8603r
    public BufferedSource source() {
        synchronized (this.f14245f) {
            m14157a();
            BufferedSource bufferedSource = this.f14247h;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            BufferedSource bufferedSourceBuffer = Okio.buffer(getFileSystem().source(this.f14240a));
            this.f14247h = bufferedSourceBuffer;
            return bufferedSourceBuffer;
        }
    }
}
