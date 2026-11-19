package p174m0;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import p101f0.C7906b;
import p122h0.InterfaceC8082b;
import p174m0.InterfaceC8939a;

/* renamed from: m0.e */
/* loaded from: classes3.dex */
public class C8943e implements InterfaceC8939a {

    /* renamed from: b */
    public final File f14983b;

    /* renamed from: c */
    public final long f14984c;

    /* renamed from: e */
    public C7906b f14986e;

    /* renamed from: d */
    public final C8941c f14985d = new C8941c();

    /* renamed from: a */
    public final C8948j f14982a = new C8948j();

    public C8943e(File file, long j9) {
        this.f14983b = file;
        this.f14984c = j9;
    }

    /* renamed from: c */
    public static InterfaceC8939a m14257c(File file, long j9) {
        return new C8943e(file, j9);
    }

    @Override // p174m0.InterfaceC8939a
    /* renamed from: a */
    public void mo14250a(InterfaceC8082b interfaceC8082b, InterfaceC8939a.b bVar) {
        String strM14276b = this.f14982a.m14276b(interfaceC8082b);
        this.f14985d.m14252a(strM14276b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(interfaceC8082b);
            }
            try {
                C7906b c7906bM14258d = m14258d();
                if (c7906bM14258d.m12402u(strM14276b) == null) {
                    C7906b.c cVarM12400r = c7906bM14258d.m12400r(strM14276b);
                    if (cVarM12400r == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strM14276b);
                    }
                    try {
                        if (bVar.mo13291a(cVarM12400r.m12413f(0))) {
                            cVarM12400r.m12412e();
                        }
                        cVarM12400r.m12411b();
                    } catch (Throwable th) {
                        cVarM12400r.m12411b();
                        throw th;
                    }
                }
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
        } finally {
            this.f14985d.m14253b(strM14276b);
        }
    }

    @Override // p174m0.InterfaceC8939a
    /* renamed from: b */
    public File mo14251b(InterfaceC8082b interfaceC8082b) {
        String strM14276b = this.f14982a.m14276b(interfaceC8082b);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(interfaceC8082b);
        }
        try {
            C7906b.e eVarM12402u = m14258d().m12402u(strM14276b);
            if (eVarM12402u != null) {
                return eVarM12402u.m12428a(0);
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }

    /* renamed from: d */
    public final synchronized C7906b m14258d() {
        try {
            if (this.f14986e == null) {
                this.f14986e = C7906b.m12393w(this.f14983b, 1, 1, this.f14984c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f14986e;
    }
}
