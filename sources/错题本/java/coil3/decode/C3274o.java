package coil3.decode;

import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import p000a.AbstractC0000a;

/* renamed from: coil3.decode.o */
/* loaded from: classes2.dex */
public final class C3274o implements InterfaceC3275p {

    /* renamed from: a */
    public final Path f1912a;

    /* renamed from: b */
    public final FileSystem f1913b;

    /* renamed from: c */
    public final String f1914c;

    /* renamed from: d */
    public final AutoCloseable f1915d;

    /* renamed from: e */
    public final Object f1916e = new Object();

    /* renamed from: f */
    public boolean f1917f;

    /* renamed from: g */
    public BufferedSource f1918g;

    public C3274o(Path path, FileSystem fileSystem, String str, AutoCloseable autoCloseable) {
        this.f1912a = path;
        this.f1913b = fileSystem;
        this.f1914c = str;
        this.f1915d = autoCloseable;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f1916e
            monitor-enter(r0)
            r1 = 1
            r2.f1917f = r1     // Catch: java.lang.Throwable -> L1c
            okio.BufferedSource r1 = r2.f1918g     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L10
            r1.close()     // Catch: java.lang.RuntimeException -> Le java.lang.Exception -> L10 java.lang.Throwable -> L1c
            goto L10
        Le:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L1c
        L10:
            java.lang.AutoCloseable r1 = r2.f1915d     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1a
            androidx.compose.material3.AbstractC1923c.m1056t(r1)     // Catch: java.lang.RuntimeException -> L18 java.lang.Exception -> L1a java.lang.Throwable -> L1c
            goto L1a
        L18:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L1c
        L1a:
            monitor-exit(r0)
            return
        L1c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.decode.C3274o.close():void");
    }

    @Override // coil3.decode.InterfaceC3275p
    public final FileSystem getFileSystem() {
        return this.f1913b;
    }

    @Override // coil3.decode.InterfaceC3275p
    /* renamed from: i */
    public final AbstractC0000a mo2192i() {
        return null;
    }

    @Override // coil3.decode.InterfaceC3275p
    /* renamed from: j */
    public final Path mo2193j() {
        Path path;
        synchronized (this.f1916e) {
            if (this.f1917f) {
                throw new IllegalStateException("closed");
            }
            path = this.f1912a;
        }
        return path;
    }

    @Override // coil3.decode.InterfaceC3275p
    public final BufferedSource source() {
        synchronized (this.f1916e) {
            if (this.f1917f) {
                throw new IllegalStateException("closed");
            }
            BufferedSource bufferedSource = this.f1918g;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            BufferedSource bufferedSourceBuffer = Okio.buffer(this.f1913b.source(this.f1912a));
            this.f1918g = bufferedSourceBuffer;
            return bufferedSourceBuffer;
        }
    }
}
