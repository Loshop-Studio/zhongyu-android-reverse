package p004a2;

import android.util.SparseArray;
import com.liulishuo.okdownload.C6327a;
import p229s1.C9126c;

/* renamed from: a2.c */
/* loaded from: classes4.dex */
public class C0017c {

    /* renamed from: a */
    public volatile a f30a;

    /* renamed from: b */
    public final SparseArray f31b = new SparseArray();

    /* renamed from: c */
    public Boolean f32c;

    /* renamed from: d */
    public final b f33d;

    /* renamed from: a2.c$a */
    public interface a {
        /* renamed from: a */
        void mo38a(C9126c c9126c);

        int getId();
    }

    /* renamed from: a2.c$b */
    public interface b {
        /* renamed from: b */
        a mo39b(int i10);
    }

    public C0017c(b bVar) {
        this.f33d = bVar;
    }

    /* renamed from: a */
    public a m48a(C6327a c6327a, C9126c c9126c) {
        a aVarMo39b = this.f33d.mo39b(c6327a.mo4385c());
        synchronized (this) {
            try {
                if (this.f30a == null) {
                    this.f30a = aVarMo39b;
                } else {
                    this.f31b.put(c6327a.mo4385c(), aVarMo39b);
                }
                if (c9126c != null) {
                    aVarMo39b.mo38a(c9126c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVarMo39b;
    }

    /* renamed from: b */
    public a m49b(C6327a c6327a, C9126c c9126c) {
        a aVar;
        int iMo4385c = c6327a.mo4385c();
        synchronized (this) {
            try {
                aVar = (this.f30a == null || this.f30a.getId() != iMo4385c) ? null : this.f30a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar == null) {
            aVar = (a) this.f31b.get(iMo4385c);
        }
        return (aVar == null && m50c()) ? m48a(c6327a, c9126c) : aVar;
    }

    /* renamed from: c */
    public boolean m50c() {
        Boolean bool = this.f32c;
        return bool != null && bool.booleanValue();
    }

    /* renamed from: d */
    public a m51d(C6327a c6327a, C9126c c9126c) {
        a aVar;
        int iMo4385c = c6327a.mo4385c();
        synchronized (this) {
            try {
                if (this.f30a == null || this.f30a.getId() != iMo4385c) {
                    aVar = (a) this.f31b.get(iMo4385c);
                    this.f31b.remove(iMo4385c);
                } else {
                    aVar = this.f30a;
                    this.f30a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            return aVar;
        }
        a aVarMo39b = this.f33d.mo39b(iMo4385c);
        if (c9126c != null) {
            aVarMo39b.mo38a(c9126c);
        }
        return aVarMo39b;
    }
}
