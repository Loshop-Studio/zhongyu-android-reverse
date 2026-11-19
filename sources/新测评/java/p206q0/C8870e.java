package p206q0;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import p138k0.C7852b;
import p162m0.InterfaceC8537b;
import p206q0.InterfaceC8866a;

/* renamed from: q0.e */
/* loaded from: classes3.dex */
public class C8870e implements InterfaceC8866a {

    /* renamed from: b */
    public final File f15079b;

    /* renamed from: c */
    public final long f15080c;

    /* renamed from: e */
    public C7852b f15082e;

    /* renamed from: d */
    public final C8868c f15081d = new C8868c();

    /* renamed from: a */
    public final C8875j f15078a = new C8875j();

    public C8870e(File file, long j10) {
        this.f15079b = file;
        this.f15080c = j10;
    }

    /* renamed from: c */
    public static InterfaceC8866a m14875c(File file, long j10) {
        return new C8870e(file, j10);
    }

    @Override // p206q0.InterfaceC8866a
    /* renamed from: a */
    public File mo14868a(InterfaceC8537b interfaceC8537b) {
        String strM14894b = this.f15078a.m14894b(interfaceC8537b);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(interfaceC8537b);
        }
        try {
            C7852b.e eVarM13345u = m14876d().m13345u(strM14894b);
            if (eVarM13345u != null) {
                return eVarM13345u.m13371a(0);
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

    @Override // p206q0.InterfaceC8866a
    /* renamed from: b */
    public void mo14869b(InterfaceC8537b interfaceC8537b, InterfaceC8866a.b bVar) {
        String strM14894b = this.f15078a.m14894b(interfaceC8537b);
        this.f15081d.m14870a(strM14894b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(interfaceC8537b);
            }
            try {
                C7852b c7852bM14876d = m14876d();
                if (c7852bM14876d.m13345u(strM14894b) == null) {
                    C7852b.c cVarM13343r = c7852bM14876d.m13343r(strM14894b);
                    if (cVarM13343r == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strM14894b);
                    }
                    try {
                        if (bVar.mo14280a(cVarM13343r.m13356f(0))) {
                            cVarM13343r.m13355e();
                        }
                        cVarM13343r.m13354b();
                    } catch (Throwable th) {
                        cVarM13343r.m13354b();
                        throw th;
                    }
                }
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
        } finally {
            this.f15081d.m14871b(strM14894b);
        }
    }

    /* renamed from: d */
    public final synchronized C7852b m14876d() {
        try {
            if (this.f15082e == null) {
                this.f15082e = C7852b.m13336w(this.f15079b, 1, 1, this.f15080c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f15082e;
    }
}
