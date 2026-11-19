package p229l0;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import p139f0.C9146b;
import p168h0.InterfaceC9435b;
import p229l0.InterfaceC10094a;

/* renamed from: l0.e */
/* loaded from: classes3.dex */
public class C10098e implements InterfaceC10094a {

    /* renamed from: b */
    public final File f24123b;

    /* renamed from: c */
    public final long f24124c;

    /* renamed from: e */
    public C9146b f24126e;

    /* renamed from: d */
    public final C10096c f24125d = new C10096c();

    /* renamed from: a */
    public final C10103j f24122a = new C10103j();

    public C10098e(File file, long j10) {
        this.f24123b = file;
        this.f24124c = j10;
    }

    /* renamed from: c */
    public static InterfaceC10094a m21113c(File file, long j10) {
        return new C10098e(file, j10);
    }

    @Override // p229l0.InterfaceC10094a
    /* renamed from: a */
    public void mo21106a(InterfaceC9435b interfaceC9435b, InterfaceC10094a.b bVar) {
        String strM21132b = this.f24122a.m21132b(interfaceC9435b);
        this.f24125d.m21108a(strM21132b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(interfaceC9435b);
            }
            try {
                C9146b c9146bM21114d = m21114d();
                if (c9146bM21114d.m18012u(strM21132b) == null) {
                    C9146b.c cVarM18010r = c9146bM21114d.m18010r(strM21132b);
                    if (cVarM18010r == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strM21132b);
                    }
                    try {
                        if (bVar.mo19044a(cVarM18010r.m18023f(0))) {
                            cVarM18010r.m18022e();
                        }
                        cVarM18010r.m18021b();
                    } catch (Throwable th) {
                        cVarM18010r.m18021b();
                        throw th;
                    }
                }
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
        } finally {
            this.f24125d.m21109b(strM21132b);
        }
    }

    @Override // p229l0.InterfaceC10094a
    /* renamed from: b */
    public File mo21107b(InterfaceC9435b interfaceC9435b) {
        String strM21132b = this.f24122a.m21132b(interfaceC9435b);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(interfaceC9435b);
        }
        try {
            C9146b.e eVarM18012u = m21114d().m18012u(strM21132b);
            if (eVarM18012u != null) {
                return eVarM18012u.m18038a(0);
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
    public final synchronized C9146b m21114d() {
        try {
            if (this.f24126e == null) {
                this.f24126e = C9146b.m18003w(this.f24123b, 1, 1, this.f24124c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f24126e;
    }
}
