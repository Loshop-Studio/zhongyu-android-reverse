package p309z1;

import android.util.SparseArray;
import com.liulishuo.okdownload.C6593a;
import p229r1.C9419c;

/* renamed from: z1.c */
/* loaded from: classes4.dex */
public class C9989c {

    /* renamed from: a */
    public volatile a f17984a;

    /* renamed from: b */
    public final SparseArray f17985b = new SparseArray();

    /* renamed from: c */
    public Boolean f17986c;

    /* renamed from: d */
    public final b f17987d;

    /* renamed from: z1.c$a */
    public interface a {
        /* renamed from: a */
        void mo17301a(C9419c c9419c);

        int getId();
    }

    /* renamed from: z1.c$b */
    public interface b {
        /* renamed from: c */
        a mo17136c(int i9);
    }

    public C9989c(b bVar) {
        this.f17987d = bVar;
    }

    /* renamed from: a */
    public a m17305a(C6593a c6593a, C9419c c9419c) {
        a aVarMo17136c = this.f17987d.mo17136c(c6593a.mo4589c());
        synchronized (this) {
            try {
                if (this.f17984a == null) {
                    this.f17984a = aVarMo17136c;
                } else {
                    this.f17985b.put(c6593a.mo4589c(), aVarMo17136c);
                }
                if (c9419c != null) {
                    aVarMo17136c.mo17301a(c9419c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVarMo17136c;
    }

    /* renamed from: b */
    public a m17306b(C6593a c6593a, C9419c c9419c) {
        a aVar;
        int iMo4589c = c6593a.mo4589c();
        synchronized (this) {
            try {
                aVar = (this.f17984a == null || this.f17984a.getId() != iMo4589c) ? null : this.f17984a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar == null) {
            aVar = (a) this.f17985b.get(iMo4589c);
        }
        return (aVar == null && m17307c()) ? m17305a(c6593a, c9419c) : aVar;
    }

    /* renamed from: c */
    public boolean m17307c() {
        Boolean bool = this.f17986c;
        return bool != null && bool.booleanValue();
    }

    /* renamed from: d */
    public a m17308d(C6593a c6593a, C9419c c9419c) {
        a aVar;
        int iMo4589c = c6593a.mo4589c();
        synchronized (this) {
            try {
                if (this.f17984a == null || this.f17984a.getId() != iMo4589c) {
                    aVar = (a) this.f17985b.get(iMo4589c);
                    this.f17985b.remove(iMo4589c);
                } else {
                    aVar = this.f17984a;
                    this.f17984a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            return aVar;
        }
        a aVarMo17136c = this.f17987d.mo17136c(iMo4589c);
        if (c9419c != null) {
            aVarMo17136c.mo17301a(c9419c);
        }
        return aVarMo17136c;
    }
}
