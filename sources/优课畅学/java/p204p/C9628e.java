package p204p;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import p137j.C8976b;
import p160l.InterfaceC9228b;
import p204p.InterfaceC9624a;

/* renamed from: p.e */
/* loaded from: classes3.dex */
public class C9628e implements InterfaceC9624a {

    /* renamed from: b */
    public final File f19252b;

    /* renamed from: c */
    public final long f19253c;

    /* renamed from: e */
    public C8976b f19255e;

    /* renamed from: d */
    public final C9626c f19254d = new C9626c();

    /* renamed from: a */
    public final C9633j f19251a = new C9633j();

    public C9628e(File file, long j10) {
        this.f19252b = file;
        this.f19253c = j10;
    }

    /* renamed from: c */
    public static InterfaceC9624a m18177c(File file, long j10) {
        return new C9628e(file, j10);
    }

    @Override // p204p.InterfaceC9624a
    /* renamed from: a */
    public File mo18170a(InterfaceC9228b interfaceC9228b) {
        String strM18195b = this.f19251a.m18195b(interfaceC9228b);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(interfaceC9228b);
        }
        try {
            C8976b.e eVarM15600q = m18178d().m15600q(strM18195b);
            if (eVarM15600q != null) {
                return eVarM15600q.m15629a(0);
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

    @Override // p204p.InterfaceC9624a
    /* renamed from: b */
    public void mo18171b(InterfaceC9228b interfaceC9228b, InterfaceC9624a.b bVar) {
        String strM18195b = this.f19251a.m18195b(interfaceC9228b);
        this.f19254d.m18172a(strM18195b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(interfaceC9228b);
            }
            try {
                C8976b c8976bM18178d = m18178d();
                if (c8976bM18178d.m15600q(strM18195b) == null) {
                    C8976b.c cVarM15598n = c8976bM18178d.m15598n(strM18195b);
                    if (cVarM15598n == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strM18195b);
                    }
                    try {
                        if (bVar.mo17226a(cVarM15598n.m15614f(0))) {
                            cVarM15598n.m15613e();
                        }
                        cVarM15598n.m15612b();
                    } catch (Throwable th) {
                        cVarM15598n.m15612b();
                        throw th;
                    }
                }
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
        } finally {
            this.f19254d.m18173b(strM18195b);
        }
    }

    /* renamed from: d */
    public final synchronized C8976b m18178d() {
        try {
            if (this.f19255e == null) {
                this.f19255e = C8976b.m15593s(this.f19252b, 1, 1, this.f19253c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f19255e;
    }
}
