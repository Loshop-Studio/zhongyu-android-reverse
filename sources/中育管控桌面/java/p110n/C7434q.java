package p110n;

import coil3.util.AbstractC4594c;
import kotlin.Unit;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import p110n.InterfaceC7435r;

/* renamed from: n.q */
/* loaded from: classes3.dex */
public final class C7434q implements InterfaceC7435r {

    /* renamed from: a */
    public final Path f9493a;

    /* renamed from: b */
    public final FileSystem f9494b;

    /* renamed from: c */
    public final String f9495c;

    /* renamed from: d */
    public final AutoCloseable f9496d;

    /* renamed from: e */
    public final InterfaceC7435r.a f9497e;

    /* renamed from: f */
    public final Object f9498f = new Object();

    /* renamed from: g */
    public boolean f9499g;

    /* renamed from: h */
    public BufferedSource f9500h;

    public C7434q(Path path, FileSystem fileSystem, String str, AutoCloseable autoCloseable, InterfaceC7435r.a aVar) {
        this.f9493a = path;
        this.f9494b = fileSystem;
        this.f9495c = str;
        this.f9496d = autoCloseable;
        this.f9497e = aVar;
    }

    /* renamed from: a */
    public final void m8478a() {
        if (this.f9499g) {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: c */
    public Path m8479c() {
        Path path;
        synchronized (this.f9498f) {
            m8478a();
            path = this.f9493a;
        }
        return path;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f9498f) {
            try {
                this.f9499g = true;
                BufferedSource bufferedSource = this.f9500h;
                if (bufferedSource != null) {
                    AbstractC4594c.m2040h(bufferedSource);
                }
                AutoCloseable autoCloseable = this.f9496d;
                if (autoCloseable != null) {
                    AbstractC4594c.m2041i(autoCloseable);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p110n.InterfaceC7435r
    /* renamed from: f */
    public Path mo8480f() {
        return m8479c();
    }

    /* renamed from: g */
    public final String m8481g() {
        return this.f9495c;
    }

    @Override // p110n.InterfaceC7435r
    public FileSystem getFileSystem() {
        return this.f9494b;
    }

    @Override // p110n.InterfaceC7435r
    public InterfaceC7435r.a getMetadata() {
        return this.f9497e;
    }

    @Override // p110n.InterfaceC7435r
    public BufferedSource source() {
        synchronized (this.f9498f) {
            m8478a();
            BufferedSource bufferedSource = this.f9500h;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            BufferedSource bufferedSourceBuffer = Okio.buffer(getFileSystem().source(this.f9493a));
            this.f9500h = bufferedSourceBuffer;
            return bufferedSourceBuffer;
        }
    }
}
