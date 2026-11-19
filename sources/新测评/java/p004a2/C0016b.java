package p004a2;

import android.util.SparseArray;
import com.liulishuo.okdownload.C6327a;
import com.liulishuo.okdownload.core.cause.EndCause;
import p004a2.C0015a;
import p004a2.C0017c;
import p207q1.C8881f;
import p229s1.C9124a;
import p229s1.C9126c;

/* renamed from: a2.b */
/* loaded from: classes4.dex */
public class C0016b implements C0015a.a, C0017c.b {

    /* renamed from: a */
    public a f27a;

    /* renamed from: a2.b$a */
    public interface a {
        /* renamed from: a */
        void mo42a(C6327a c6327a, int i10, long j10, C8881f c8881f);

        /* renamed from: c */
        void mo43c(C6327a c6327a, long j10, C8881f c8881f);

        /* renamed from: i */
        void mo44i(C6327a c6327a, int i10, C9124a c9124a, C8881f c8881f);

        /* renamed from: j */
        void mo45j(C6327a c6327a, EndCause endCause, Exception exc, C8881f c8881f);

        /* renamed from: l */
        void mo46l(C6327a c6327a, C9126c c9126c, boolean z9, b bVar);
    }

    /* renamed from: a2.b$b */
    public static class b extends C0015a.c {

        /* renamed from: e */
        public C8881f f28e;

        /* renamed from: f */
        public SparseArray f29f;

        public b(int i10) {
            super(i10);
        }

        @Override // p004a2.C0015a.c, p004a2.C0017c.a
        /* renamed from: a */
        public void mo38a(C9126c c9126c) {
            super.mo38a(c9126c);
            this.f28e = new C8881f();
            this.f29f = new SparseArray();
            int iM15469d = c9126c.m15469d();
            for (int i10 = 0; i10 < iM15469d; i10++) {
                this.f29f.put(i10, new C8881f());
            }
        }

        /* renamed from: b */
        public C8881f m47b(int i10) {
            return (C8881f) this.f29f.get(i10);
        }
    }

    @Override // p004a2.C0015a.a
    /* renamed from: a */
    public boolean mo29a(C6327a c6327a, int i10, C0015a.c cVar) {
        b bVar = (b) cVar;
        ((C8881f) bVar.f29f.get(i10)).m14920b();
        a aVar = this.f27a;
        if (aVar == null) {
            return true;
        }
        aVar.mo44i(c6327a, i10, cVar.f24b.m15468c(i10), bVar.m47b(i10));
        return true;
    }

    @Override // p004a2.C0015a.a
    /* renamed from: c */
    public boolean mo30c(C6327a c6327a, EndCause endCause, Exception exc, C0015a.c cVar) {
        C8881f c8881f = ((b) cVar).f28e;
        if (c8881f != null) {
            c8881f.m14920b();
        } else {
            c8881f = new C8881f();
        }
        a aVar = this.f27a;
        if (aVar == null) {
            return true;
        }
        aVar.mo45j(c6327a, endCause, exc, c8881f);
        return true;
    }

    @Override // p004a2.C0015a.a
    /* renamed from: d */
    public boolean mo31d(C6327a c6327a, int i10, long j10, C0015a.c cVar) {
        b bVar = (b) cVar;
        ((C8881f) bVar.f29f.get(i10)).m14919a(j10);
        bVar.f28e.m14919a(j10);
        a aVar = this.f27a;
        if (aVar == null) {
            return true;
        }
        aVar.mo42a(c6327a, i10, ((Long) cVar.f26d.get(i10)).longValue(), bVar.m47b(i10));
        this.f27a.mo43c(c6327a, cVar.f25c, bVar.f28e);
        return true;
    }

    @Override // p004a2.C0015a.a
    /* renamed from: e */
    public boolean mo32e(C6327a c6327a, C9126c c9126c, boolean z9, C0015a.c cVar) {
        a aVar = this.f27a;
        if (aVar == null) {
            return true;
        }
        aVar.mo46l(c6327a, c9126c, z9, (b) cVar);
        return true;
    }

    @Override // p004a2.C0017c.b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b mo39b(int i10) {
        return new b(i10);
    }

    /* renamed from: g */
    public void m41g(a aVar) {
        this.f27a = aVar;
    }
}
