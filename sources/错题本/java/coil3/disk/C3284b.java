package coil3.disk;

import java.io.File;
import kotlin.jvm.internal.AbstractC5830k;
import okio.Path;
import p185v7.AbstractC6683l;
import p186w.C6688c;
import p186w.C6689d;

/* renamed from: coil3.disk.b */
/* loaded from: classes2.dex */
public final class C3284b {

    /* renamed from: a */
    public final boolean[] f1933a;

    /* renamed from: b */
    public boolean f1934b;

    /* renamed from: c */
    public final Object f1935c;

    /* renamed from: d */
    public final /* synthetic */ AutoCloseable f1936d;

    public C3284b(C3288f c3288f, C3285c c3285c) {
        this.f1936d = c3288f;
        this.f1935c = c3285c;
        this.f1933a = new boolean[2];
    }

    /* renamed from: a */
    public void m2209a() {
        C6689d.m6382a((C6689d) this.f1936d, this, false);
    }

    /* renamed from: b */
    public void m2210b(boolean z8) {
        C3288f c3288f = (C3288f) this.f1936d;
        synchronized (c3288f.f1957h) {
            try {
                if (this.f1934b) {
                    throw new IllegalStateException("editor is closed");
                }
                if (AbstractC5830k.m5325b(((C3285c) this.f1935c).f1943g, this)) {
                    C3288f.m2214a(c3288f, this, z8);
                }
                this.f1934b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public Path m2211c(int i) {
        Path path;
        C3288f c3288f = (C3288f) this.f1936d;
        synchronized (c3288f.f1957h) {
            if (this.f1934b) {
                throw new IllegalStateException("editor is closed");
            }
            this.f1933a[i] = true;
            Object obj = ((C3285c) this.f1935c).f1940d.get(i);
            AbstractC6683l.m6366f(c3288f.f1966q, (Path) obj);
            path = (Path) obj;
        }
        return path;
    }

    /* renamed from: d */
    public File m2212d() {
        File file;
        synchronized (((C6689d) this.f1936d)) {
            try {
                C6688c c6688c = (C6688c) this.f1935c;
                if (c6688c.f11284f != this) {
                    throw new IllegalStateException();
                }
                if (!c6688c.f11283e) {
                    this.f1933a[0] = true;
                }
                file = c6688c.f11282d[0];
                if (!((C6689d) this.f1936d).f11286a.exists()) {
                    ((C6689d) this.f1936d).f11286a.mkdirs();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public C3284b(C6689d c6689d, C6688c c6688c) {
        this.f1936d = c6689d;
        this.f1935c = c6688c;
        this.f1933a = c6688c.f11283e ? null : new boolean[c6689d.f11292g];
    }
}
