package p183n;

import coil3.util.AbstractC5348c;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import p183n.InterfaceC9073r;

/* renamed from: n.u */
/* loaded from: classes3.dex */
public final class C9076u implements InterfaceC9073r {

    /* renamed from: a */
    public final FileSystem f15267a;

    /* renamed from: b */
    public final InterfaceC9073r.a f15268b;

    /* renamed from: c */
    public final Object f15269c = new Object();

    /* renamed from: d */
    public boolean f15270d;

    /* renamed from: e */
    public BufferedSource f15271e;

    /* renamed from: f */
    public Path f15272f;

    public C9076u(BufferedSource bufferedSource, FileSystem fileSystem, InterfaceC9073r.a aVar) {
        this.f15267a = fileSystem;
        this.f15268b = aVar;
        this.f15271e = bufferedSource;
    }

    /* renamed from: a */
    private final void m14558a() {
        if (this.f15270d) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f15269c) {
            try {
                this.f15270d = true;
                BufferedSource bufferedSource = this.f15271e;
                if (bufferedSource != null) {
                    AbstractC5348c.m2931h(bufferedSource);
                }
                Path path = this.f15272f;
                if (path != null) {
                    getFileSystem().delete(path);
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
        Path path;
        synchronized (this.f15269c) {
            m14558a();
            path = this.f15272f;
        }
        return path;
    }

    @Override // p183n.InterfaceC9073r
    public FileSystem getFileSystem() {
        return this.f15267a;
    }

    @Override // p183n.InterfaceC9073r
    public InterfaceC9073r.a getMetadata() {
        return this.f15268b;
    }

    @Override // p183n.InterfaceC9073r
    public BufferedSource source() {
        synchronized (this.f15269c) {
            m14558a();
            BufferedSource bufferedSource = this.f15271e;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            FileSystem fileSystem = getFileSystem();
            Path path = this.f15272f;
            Intrinsics.checkNotNull(path);
            BufferedSource bufferedSourceBuffer = Okio.buffer(fileSystem.source(path));
            this.f15271e = bufferedSourceBuffer;
            return bufferedSourceBuffer;
        }
    }
}
