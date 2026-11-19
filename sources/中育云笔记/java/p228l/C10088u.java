package p228l;

import coil3.util.AbstractC5490c;
import kotlin.jvm.internal.AbstractC9979u;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import p228l.InterfaceC10085r;
import p309qc.C10786q;

/* renamed from: l.u */
/* loaded from: classes3.dex */
public final class C10088u implements InterfaceC10085r {

    /* renamed from: c */
    public final FileSystem f24109c;

    /* renamed from: d */
    public final InterfaceC10085r.a f24110d;

    /* renamed from: e */
    public final Object f24111e = new Object();

    /* renamed from: f */
    public boolean f24112f;

    /* renamed from: g */
    public BufferedSource f24113g;

    /* renamed from: h */
    public Path f24114h;

    public C10088u(BufferedSource bufferedSource, FileSystem fileSystem, InterfaceC10085r.a aVar) {
        this.f24109c = fileSystem;
        this.f24110d = aVar;
        this.f24113g = bufferedSource;
    }

    /* renamed from: e */
    private final void m21100e() {
        if (this.f24112f) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f24111e) {
            try {
                this.f24112f = true;
                BufferedSource bufferedSource = this.f24113g;
                if (bufferedSource != null) {
                    AbstractC5490c.m3308h(bufferedSource);
                }
                Path path = this.f24114h;
                if (path != null) {
                    getFileSystem().delete(path);
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p228l.InterfaceC10085r
    public FileSystem getFileSystem() {
        return this.f24109c;
    }

    @Override // p228l.InterfaceC10085r
    public InterfaceC10085r.a getMetadata() {
        return this.f24110d;
    }

    @Override // p228l.InterfaceC10085r
    /* renamed from: q */
    public Path mo21093q() {
        Path path;
        synchronized (this.f24111e) {
            m21100e();
            path = this.f24114h;
        }
        return path;
    }

    @Override // p228l.InterfaceC10085r
    public BufferedSource source() {
        synchronized (this.f24111e) {
            m21100e();
            BufferedSource bufferedSource = this.f24113g;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            FileSystem fileSystem = getFileSystem();
            Path path = this.f24114h;
            AbstractC9979u.m20291d(path);
            BufferedSource bufferedSourceBuffer = Okio.buffer(fileSystem.source(path));
            this.f24113g = bufferedSourceBuffer;
            return bufferedSourceBuffer;
        }
    }
}
