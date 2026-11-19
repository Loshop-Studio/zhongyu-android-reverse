package p110n;

import coil3.util.AbstractC4594c;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import p110n.InterfaceC7435r;

/* renamed from: n.u */
/* loaded from: classes3.dex */
public final class C7438u implements InterfaceC7435r {

    /* renamed from: a */
    public final FileSystem f9504a;

    /* renamed from: b */
    public final InterfaceC7435r.a f9505b;

    /* renamed from: c */
    public final Object f9506c = new Object();

    /* renamed from: d */
    public boolean f9507d;

    /* renamed from: e */
    public BufferedSource f9508e;

    /* renamed from: f */
    public Path f9509f;

    public C7438u(BufferedSource bufferedSource, FileSystem fileSystem, InterfaceC7435r.a aVar) {
        this.f9504a = fileSystem;
        this.f9505b = aVar;
        this.f9508e = bufferedSource;
    }

    /* renamed from: a */
    private final void m8488a() {
        if (this.f9507d) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f9506c) {
            try {
                this.f9507d = true;
                BufferedSource bufferedSource = this.f9508e;
                if (bufferedSource != null) {
                    AbstractC4594c.m2040h(bufferedSource);
                }
                Path path = this.f9509f;
                if (path != null) {
                    getFileSystem().delete(path);
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
        Path path;
        synchronized (this.f9506c) {
            m8488a();
            path = this.f9509f;
        }
        return path;
    }

    @Override // p110n.InterfaceC7435r
    public FileSystem getFileSystem() {
        return this.f9504a;
    }

    @Override // p110n.InterfaceC7435r
    public InterfaceC7435r.a getMetadata() {
        return this.f9505b;
    }

    @Override // p110n.InterfaceC7435r
    public BufferedSource source() {
        synchronized (this.f9506c) {
            m8488a();
            BufferedSource bufferedSource = this.f9508e;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            FileSystem fileSystem = getFileSystem();
            Path path = this.f9509f;
            Intrinsics.checkNotNull(path);
            BufferedSource bufferedSourceBuffer = Okio.buffer(fileSystem.source(path));
            this.f9508e = bufferedSourceBuffer;
            return bufferedSourceBuffer;
        }
    }
}
