package p102o;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p066h.C3759b;
import p076j.InterfaceC3792b;
import p102o.InterfaceC4410a;

/* renamed from: o.e */
/* loaded from: classes2.dex */
public class C4414e implements InterfaceC4410a {

    /* renamed from: b */
    public final File f4955b;

    /* renamed from: c */
    public final long f4956c;

    /* renamed from: e */
    public C3759b f4958e;

    /* renamed from: d */
    public final C4412c f4957d = new C4412c();

    /* renamed from: a */
    public final C4419j f4954a = new C4419j();

    public C4414e(File file, long j4) {
        this.f4955b = file;
        this.f4956c = j4;
    }

    /* renamed from: c */
    public static InterfaceC4410a m5504c(File file, long j4) {
        return new C4414e(file, j4);
    }

    @Override // p102o.InterfaceC4410a
    /* renamed from: a */
    public void mo5497a(InterfaceC3792b interfaceC3792b, InterfaceC4410a.b bVar) {
        C3759b c3759bM5505d;
        String strM5523b = this.f4954a.m5523b(interfaceC3792b);
        this.f4957d.m5499a(strM5523b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Put: Obtained: ");
                sb.append(strM5523b);
                sb.append(" for for Key: ");
                sb.append(interfaceC3792b);
            }
            try {
                c3759bM5505d = m5505d();
            } catch (IOException e4) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e4);
                }
            }
            if (c3759bM5505d.m4814q(strM5523b) != null) {
                return;
            }
            C3759b.c cVarM4812n = c3759bM5505d.m4812n(strM5523b);
            if (cVarM4812n == null) {
                throw new IllegalStateException("Had two simultaneous puts for: " + strM5523b);
            }
            try {
                if (bVar.mo5363a(cVarM4812n.m4828f(0))) {
                    cVarM4812n.m4827e();
                }
                cVarM4812n.m4826b();
            } catch (Throwable th) {
                cVarM4812n.m4826b();
                throw th;
            }
        } finally {
            this.f4957d.m5500b(strM5523b);
        }
    }

    @Override // p102o.InterfaceC4410a
    /* renamed from: b */
    public File mo5498b(InterfaceC3792b interfaceC3792b) {
        String strM5523b = this.f4954a.m5523b(interfaceC3792b);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Get: Obtained: ");
            sb.append(strM5523b);
            sb.append(" for for Key: ");
            sb.append(interfaceC3792b);
        }
        try {
            C3759b.e eVarM4814q = m5505d().m4814q(strM5523b);
            if (eVarM4814q != null) {
                return eVarM4814q.m4843a(0);
            }
            return null;
        } catch (IOException e4) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e4);
            return null;
        }
    }

    /* renamed from: d */
    public final synchronized C3759b m5505d() {
        if (this.f4958e == null) {
            this.f4958e = C3759b.m4807s(this.f4955b, 1, 1, this.f4956c);
        }
        return this.f4958e;
    }
}
