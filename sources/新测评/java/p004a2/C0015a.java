package p004a2;

import android.util.SparseArray;
import com.liulishuo.okdownload.C6327a;
import com.liulishuo.okdownload.core.cause.EndCause;
import p004a2.C0017c;
import p229s1.C9124a;
import p229s1.C9126c;

/* renamed from: a2.a */
/* loaded from: classes4.dex */
public class C0015a {

    /* renamed from: a */
    public b f20a;

    /* renamed from: b */
    public a f21b;

    /* renamed from: c */
    public final C0017c f22c;

    /* renamed from: a2.a$a */
    public interface a {
        /* renamed from: a */
        boolean mo29a(C6327a c6327a, int i10, c cVar);

        /* renamed from: c */
        boolean mo30c(C6327a c6327a, EndCause endCause, Exception exc, c cVar);

        /* renamed from: d */
        boolean mo31d(C6327a c6327a, int i10, long j10, c cVar);

        /* renamed from: e */
        boolean mo32e(C6327a c6327a, C9126c c9126c, boolean z9, c cVar);
    }

    /* renamed from: a2.a$b */
    public interface b {
        /* renamed from: b */
        void mo33b(C6327a c6327a, EndCause endCause, Exception exc, c cVar);

        /* renamed from: f */
        void mo34f(C6327a c6327a, C9126c c9126c, boolean z9, c cVar);

        /* renamed from: n */
        void mo35n(C6327a c6327a, int i10, long j10);

        /* renamed from: q */
        void mo36q(C6327a c6327a, long j10);

        /* renamed from: t */
        void mo37t(C6327a c6327a, int i10, C9124a c9124a);
    }

    /* renamed from: a2.a$c */
    public static class c implements C0017c.a {

        /* renamed from: a */
        public final int f23a;

        /* renamed from: b */
        public C9126c f24b;

        /* renamed from: c */
        public long f25c;

        /* renamed from: d */
        public SparseArray f26d;

        public c(int i10) {
            this.f23a = i10;
        }

        @Override // p004a2.C0017c.a
        /* renamed from: a */
        public void mo38a(C9126c c9126c) {
            this.f24b = c9126c;
            this.f25c = c9126c.m15476k();
            SparseArray sparseArray = new SparseArray();
            int iM15469d = c9126c.m15469d();
            for (int i10 = 0; i10 < iM15469d; i10++) {
                sparseArray.put(i10, Long.valueOf(c9126c.m15468c(i10).m15458c()));
            }
            this.f26d = sparseArray;
        }

        @Override // p004a2.C0017c.a
        public int getId() {
            return this.f23a;
        }
    }

    public C0015a(C0017c.b bVar) {
        this.f22c = new C0017c(bVar);
    }

    /* renamed from: a */
    public void m23a(C6327a c6327a, int i10) {
        b bVar;
        c cVar = (c) this.f22c.m49b(c6327a, c6327a.m4396p());
        if (cVar == null) {
            return;
        }
        a aVar = this.f21b;
        if ((aVar == null || !aVar.mo29a(c6327a, i10, cVar)) && (bVar = this.f20a) != null) {
            bVar.mo37t(c6327a, i10, cVar.f24b.m15468c(i10));
        }
    }

    /* renamed from: b */
    public void m24b(C6327a c6327a, int i10, long j10) {
        b bVar;
        c cVar = (c) this.f22c.m49b(c6327a, c6327a.m4396p());
        if (cVar == null) {
            return;
        }
        long jLongValue = ((Long) cVar.f26d.get(i10)).longValue() + j10;
        cVar.f26d.put(i10, Long.valueOf(jLongValue));
        cVar.f25c += j10;
        a aVar = this.f21b;
        if ((aVar == null || !aVar.mo31d(c6327a, i10, j10, cVar)) && (bVar = this.f20a) != null) {
            bVar.mo35n(c6327a, i10, jLongValue);
            this.f20a.mo36q(c6327a, cVar.f25c);
        }
    }

    /* renamed from: c */
    public void m25c(C6327a c6327a, C9126c c9126c, boolean z9) {
        b bVar;
        c cVar = (c) this.f22c.m48a(c6327a, c9126c);
        a aVar = this.f21b;
        if ((aVar == null || !aVar.mo32e(c6327a, c9126c, z9, cVar)) && (bVar = this.f20a) != null) {
            bVar.mo34f(c6327a, c9126c, z9, cVar);
        }
    }

    /* renamed from: d */
    public void m26d(a aVar) {
        this.f21b = aVar;
    }

    /* renamed from: e */
    public void m27e(b bVar) {
        this.f20a = bVar;
    }

    /* renamed from: f */
    public synchronized void m28f(C6327a c6327a, EndCause endCause, Exception exc) {
        c cVar = (c) this.f22c.m51d(c6327a, c6327a.m4396p());
        a aVar = this.f21b;
        if (aVar == null || !aVar.mo30c(c6327a, endCause, exc, cVar)) {
            b bVar = this.f20a;
            if (bVar != null) {
                bVar.mo33b(c6327a, endCause, exc, cVar);
            }
        }
    }
}
