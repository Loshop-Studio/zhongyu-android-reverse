package p081j0;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import p039d0.C6212b;
import p053f0.InterfaceC6283b;
import p081j0.InterfaceC6573a;

/* renamed from: j0.e */
/* loaded from: classes3.dex */
public class C6577e implements InterfaceC6573a {

    /* renamed from: b */
    public final File f8524b;

    /* renamed from: c */
    public final long f8525c;

    /* renamed from: e */
    public C6212b f8527e;

    /* renamed from: d */
    public final C6575c f8526d = new C6575c();

    /* renamed from: a */
    public final C6582j f8523a = new C6582j();

    public C6577e(File file, long j6) {
        this.f8524b = file;
        this.f8525c = j6;
    }

    /* renamed from: c */
    public static InterfaceC6573a m7446c(File file, long j6) {
        return new C6577e(file, j6);
    }

    @Override // p081j0.InterfaceC6573a
    /* renamed from: a */
    public void mo7439a(InterfaceC6283b interfaceC6283b, InterfaceC6573a.b bVar) {
        String strM7465b = this.f8523a.m7465b(interfaceC6283b);
        this.f8526d.m7441a(strM7465b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(interfaceC6283b);
            }
            try {
                C6212b c6212bM7447d = m7447d();
                if (c6212bM7447d.m6286u(strM7465b) == null) {
                    C6212b.c cVarM6284r = c6212bM7447d.m6284r(strM7465b);
                    if (cVarM6284r == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strM7465b);
                    }
                    try {
                        if (bVar.mo7039a(cVarM6284r.m6297f(0))) {
                            cVarM6284r.m6296e();
                        }
                        cVarM6284r.m6295b();
                    } catch (Throwable th) {
                        cVarM6284r.m6295b();
                        throw th;
                    }
                }
            } catch (IOException e6) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e6);
                }
            }
        } finally {
            this.f8526d.m7442b(strM7465b);
        }
    }

    @Override // p081j0.InterfaceC6573a
    /* renamed from: b */
    public File mo7440b(InterfaceC6283b interfaceC6283b) {
        String strM7465b = this.f8523a.m7465b(interfaceC6283b);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(interfaceC6283b);
        }
        try {
            C6212b.e eVarM6286u = m7447d().m6286u(strM7465b);
            if (eVarM6286u != null) {
                return eVarM6286u.m6312a(0);
            }
            return null;
        } catch (IOException e6) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e6);
            return null;
        }
    }

    /* renamed from: d */
    public final synchronized C6212b m7447d() {
        try {
            if (this.f8527e == null) {
                this.f8527e = C6212b.m6277w(this.f8524b, 1, 1, this.f8525c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8527e;
    }
}
