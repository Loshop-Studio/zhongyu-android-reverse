package p309z1;

import android.util.SparseArray;
import com.liulishuo.okdownload.C6593a;
import com.liulishuo.okdownload.core.cause.EndCause;
import p229r1.C9417a;
import p229r1.C9419c;
import p309z1.C9989c;

/* renamed from: z1.a */
/* loaded from: classes4.dex */
public class C9987a {

    /* renamed from: a */
    public b f17974a;

    /* renamed from: b */
    public a f17975b;

    /* renamed from: c */
    public final C9989c f17976c;

    /* renamed from: z1.a$a */
    public interface a {
        /* renamed from: a */
        boolean mo17297a(C6593a c6593a, EndCause endCause, Exception exc, c cVar);

        /* renamed from: b */
        boolean mo17298b(C6593a c6593a, int i9, long j9, c cVar);

        /* renamed from: d */
        boolean mo17299d(C6593a c6593a, int i9, c cVar);

        /* renamed from: e */
        boolean mo17300e(C6593a c6593a, C9419c c9419c, boolean z9, c cVar);
    }

    /* renamed from: z1.a$b */
    public interface b {
        /* renamed from: e */
        void mo17130e(C6593a c6593a, C9419c c9419c, boolean z9, c cVar);

        /* renamed from: k */
        void mo17131k(C6593a c6593a, int i9, long j9);

        /* renamed from: n */
        void mo17132n(C6593a c6593a, long j9);

        /* renamed from: r */
        void mo17133r(C6593a c6593a, int i9, C9417a c9417a);

        /* renamed from: s */
        void mo17134s(C6593a c6593a, EndCause endCause, Exception exc, c cVar);
    }

    /* renamed from: z1.a$c */
    public static class c implements C9989c.a {

        /* renamed from: a */
        public final int f17977a;

        /* renamed from: b */
        public C9419c f17978b;

        /* renamed from: c */
        public long f17979c;

        /* renamed from: d */
        public SparseArray f17980d;

        public c(int i9) {
            this.f17977a = i9;
        }

        @Override // p309z1.C9989c.a
        /* renamed from: a */
        public void mo17301a(C9419c c9419c) {
            this.f17978b = c9419c;
            this.f17979c = c9419c.m15530k();
            SparseArray sparseArray = new SparseArray();
            int iM15523d = c9419c.m15523d();
            for (int i9 = 0; i9 < iM15523d; i9++) {
                sparseArray.put(i9, Long.valueOf(c9419c.m15522c(i9).m15512c()));
            }
            this.f17980d = sparseArray;
        }

        @Override // p309z1.C9989c.a
        public int getId() {
            return this.f17977a;
        }
    }

    public C9987a(C9989c.b bVar) {
        this.f17976c = new C9989c(bVar);
    }

    /* renamed from: a */
    public void m17291a(C6593a c6593a, int i9) {
        b bVar;
        c cVar = (c) this.f17976c.m17306b(c6593a, c6593a.m4600p());
        if (cVar == null) {
            return;
        }
        a aVar = this.f17975b;
        if ((aVar == null || !aVar.mo17299d(c6593a, i9, cVar)) && (bVar = this.f17974a) != null) {
            bVar.mo17133r(c6593a, i9, cVar.f17978b.m15522c(i9));
        }
    }

    /* renamed from: b */
    public void m17292b(C6593a c6593a, int i9, long j9) {
        b bVar;
        c cVar = (c) this.f17976c.m17306b(c6593a, c6593a.m4600p());
        if (cVar == null) {
            return;
        }
        long jLongValue = ((Long) cVar.f17980d.get(i9)).longValue() + j9;
        cVar.f17980d.put(i9, Long.valueOf(jLongValue));
        cVar.f17979c += j9;
        a aVar = this.f17975b;
        if ((aVar == null || !aVar.mo17298b(c6593a, i9, j9, cVar)) && (bVar = this.f17974a) != null) {
            bVar.mo17131k(c6593a, i9, jLongValue);
            this.f17974a.mo17132n(c6593a, cVar.f17979c);
        }
    }

    /* renamed from: c */
    public void m17293c(C6593a c6593a, C9419c c9419c, boolean z9) {
        b bVar;
        c cVar = (c) this.f17976c.m17305a(c6593a, c9419c);
        a aVar = this.f17975b;
        if ((aVar == null || !aVar.mo17300e(c6593a, c9419c, z9, cVar)) && (bVar = this.f17974a) != null) {
            bVar.mo17130e(c6593a, c9419c, z9, cVar);
        }
    }

    /* renamed from: d */
    public void m17294d(a aVar) {
        this.f17975b = aVar;
    }

    /* renamed from: e */
    public void m17295e(b bVar) {
        this.f17974a = bVar;
    }

    /* renamed from: f */
    public synchronized void m17296f(C6593a c6593a, EndCause endCause, Exception exc) {
        c cVar = (c) this.f17976c.m17308d(c6593a, c6593a.m4600p());
        a aVar = this.f17975b;
        if (aVar == null || !aVar.mo17297a(c6593a, endCause, exc, cVar)) {
            b bVar = this.f17974a;
            if (bVar != null) {
                bVar.mo17134s(c6593a, endCause, exc, cVar);
            }
        }
    }
}
