package coil3.decode;

import kotlin.jvm.internal.AbstractC5830k;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import p000a.AbstractC0000a;

/* renamed from: coil3.decode.r */
/* loaded from: classes2.dex */
public final class C3277r implements InterfaceC3275p {

    /* renamed from: a */
    public final FileSystem f1921a;

    /* renamed from: b */
    public final AbstractC0000a f1922b;

    /* renamed from: c */
    public final Object f1923c = new Object();

    /* renamed from: d */
    public boolean f1924d;

    /* renamed from: e */
    public BufferedSource f1925e;

    public C3277r(BufferedSource bufferedSource, FileSystem fileSystem, AbstractC0000a abstractC0000a) {
        this.f1921a = fileSystem;
        this.f1922b = abstractC0000a;
        this.f1925e = bufferedSource;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f1923c) {
            this.f1924d = true;
            BufferedSource bufferedSource = this.f1925e;
            if (bufferedSource != null) {
                try {
                    bufferedSource.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // coil3.decode.InterfaceC3275p
    public final FileSystem getFileSystem() {
        return this.f1921a;
    }

    @Override // coil3.decode.InterfaceC3275p
    /* renamed from: i */
    public final AbstractC0000a mo2192i() {
        return this.f1922b;
    }

    @Override // coil3.decode.InterfaceC3275p
    /* renamed from: j */
    public final Path mo2193j() {
        synchronized (this.f1923c) {
            if (this.f1924d) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // coil3.decode.InterfaceC3275p
    public final BufferedSource source() {
        synchronized (this.f1923c) {
            if (this.f1924d) {
                throw new IllegalStateException("closed");
            }
            BufferedSource bufferedSource = this.f1925e;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            FileSystem fileSystem = this.f1921a;
            AbstractC5830k.m5327d(null);
            BufferedSource bufferedSourceBuffer = Okio.buffer(fileSystem.source(null));
            this.f1925e = bufferedSourceBuffer;
            return bufferedSourceBuffer;
        }
    }
}
