package p309z1;

import android.util.SparseArray;
import com.liulishuo.okdownload.C6593a;
import com.liulishuo.okdownload.core.cause.EndCause;
import p209p1.C9317f;
import p229r1.C9417a;
import p229r1.C9419c;
import p309z1.C9987a;
import p309z1.C9989c;

/* renamed from: z1.b */
/* loaded from: classes4.dex */
public class C9988b implements C9987a.a, C9989c.b {

    /* renamed from: a */
    public a f17981a;

    /* renamed from: z1.b$a */
    public interface a {
        /* renamed from: a */
        void mo10263a(C6593a c6593a, C9419c c9419c, boolean z9, b bVar);

        /* renamed from: b */
        void mo10264b(C6593a c6593a, EndCause endCause, Exception exc, C9317f c9317f);

        /* renamed from: h */
        void mo10266h(C6593a c6593a, int i9, C9417a c9417a, C9317f c9317f);

        /* renamed from: j */
        void mo10267j(C6593a c6593a, int i9, long j9, C9317f c9317f);

        /* renamed from: l */
        void mo10268l(C6593a c6593a, long j9, C9317f c9317f);
    }

    /* renamed from: z1.b$b */
    public static class b extends C9987a.c {

        /* renamed from: e */
        public C9317f f17982e;

        /* renamed from: f */
        public SparseArray f17983f;

        public b(int i9) {
            super(i9);
        }

        @Override // p309z1.C9987a.c, p309z1.C9989c.a
        /* renamed from: a */
        public void mo17301a(C9419c c9419c) {
            super.mo17301a(c9419c);
            this.f17982e = new C9317f();
            this.f17983f = new SparseArray();
            int iM15523d = c9419c.m15523d();
            for (int i9 = 0; i9 < iM15523d; i9++) {
                this.f17983f.put(i9, new C9317f());
            }
        }

        /* renamed from: b */
        public C9317f m17304b(int i9) {
            return (C9317f) this.f17983f.get(i9);
        }
    }

    @Override // p309z1.C9987a.a
    /* renamed from: a */
    public boolean mo17297a(C6593a c6593a, EndCause endCause, Exception exc, C9987a.c cVar) {
        C9317f c9317f = ((b) cVar).f17982e;
        if (c9317f != null) {
            c9317f.m15197b();
        } else {
            c9317f = new C9317f();
        }
        a aVar = this.f17981a;
        if (aVar == null) {
            return true;
        }
        aVar.mo10264b(c6593a, endCause, exc, c9317f);
        return true;
    }

    @Override // p309z1.C9987a.a
    /* renamed from: b */
    public boolean mo17298b(C6593a c6593a, int i9, long j9, C9987a.c cVar) {
        b bVar = (b) cVar;
        ((C9317f) bVar.f17983f.get(i9)).m15196a(j9);
        bVar.f17982e.m15196a(j9);
        a aVar = this.f17981a;
        if (aVar == null) {
            return true;
        }
        aVar.mo10267j(c6593a, i9, ((Long) cVar.f17980d.get(i9)).longValue(), bVar.m17304b(i9));
        this.f17981a.mo10268l(c6593a, cVar.f17979c, bVar.f17982e);
        return true;
    }

    @Override // p309z1.C9987a.a
    /* renamed from: d */
    public boolean mo17299d(C6593a c6593a, int i9, C9987a.c cVar) {
        b bVar = (b) cVar;
        ((C9317f) bVar.f17983f.get(i9)).m15197b();
        a aVar = this.f17981a;
        if (aVar == null) {
            return true;
        }
        aVar.mo10266h(c6593a, i9, cVar.f17978b.m15522c(i9), bVar.m17304b(i9));
        return true;
    }

    @Override // p309z1.C9987a.a
    /* renamed from: e */
    public boolean mo17300e(C6593a c6593a, C9419c c9419c, boolean z9, C9987a.c cVar) {
        a aVar = this.f17981a;
        if (aVar == null) {
            return true;
        }
        aVar.mo10263a(c6593a, c9419c, z9, (b) cVar);
        return true;
    }

    @Override // p309z1.C9989c.b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b mo17136c(int i9) {
        return new b(i9);
    }

    /* renamed from: g */
    public void m17303g(a aVar) {
        this.f17981a = aVar;
    }
}
