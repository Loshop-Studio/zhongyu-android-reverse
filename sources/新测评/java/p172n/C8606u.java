package p172n;

import coil3.util.AbstractC5213c;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import p172n.InterfaceC8603r;

/* renamed from: n.u */
/* loaded from: classes3.dex */
public final class C8606u implements InterfaceC8603r {

    /* renamed from: a */
    public final FileSystem f14251a;

    /* renamed from: b */
    public final InterfaceC8603r.a f14252b;

    /* renamed from: c */
    public final Object f14253c = new Object();

    /* renamed from: d */
    public boolean f14254d;

    /* renamed from: e */
    public BufferedSource f14255e;

    /* renamed from: f */
    public Path f14256f;

    public C8606u(BufferedSource bufferedSource, FileSystem fileSystem, InterfaceC8603r.a aVar) {
        this.f14251a = fileSystem;
        this.f14252b = aVar;
        this.f14255e = bufferedSource;
    }

    /* renamed from: a */
    private final void m14167a() {
        if (this.f14254d) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f14253c) {
            try {
                this.f14254d = true;
                BufferedSource bufferedSource = this.f14255e;
                if (bufferedSource != null) {
                    AbstractC5213c.m3214h(bufferedSource);
                }
                Path path = this.f14256f;
                if (path != null) {
                    getFileSystem().delete(path);
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
        Path path;
        synchronized (this.f14253c) {
            m14167a();
            path = this.f14256f;
        }
        return path;
    }

    @Override // p172n.InterfaceC8603r
    public FileSystem getFileSystem() {
        return this.f14251a;
    }

    @Override // p172n.InterfaceC8603r
    public InterfaceC8603r.a getMetadata() {
        return this.f14252b;
    }

    @Override // p172n.InterfaceC8603r
    public BufferedSource source() {
        synchronized (this.f14253c) {
            m14167a();
            BufferedSource bufferedSource = this.f14255e;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            FileSystem fileSystem = getFileSystem();
            Path path = this.f14256f;
            Intrinsics.checkNotNull(path);
            BufferedSource bufferedSourceBuffer = Okio.buffer(fileSystem.source(path));
            this.f14255e = bufferedSourceBuffer;
            return bufferedSourceBuffer;
        }
    }
}
