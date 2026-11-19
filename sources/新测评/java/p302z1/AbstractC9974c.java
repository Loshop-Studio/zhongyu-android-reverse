package p302z1;

import com.liulishuo.okdownload.C6327a;
import com.liulishuo.okdownload.core.cause.EndCause;
import p004a2.C0015a;
import p004a2.C0016b;
import p004a2.C0017c;
import p229s1.C9124a;
import p229s1.C9126c;

/* renamed from: z1.c */
/* loaded from: classes4.dex */
public abstract class AbstractC9974c extends AbstractC9973b implements C0016b.a {

    /* renamed from: z1.c$b */
    public static class b implements C0017c.b {
        public b() {
        }

        @Override // p004a2.C0017c.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0016b.b mo39b(int i10) {
            return new C0016b.b(i10);
        }
    }

    public AbstractC9974c(C0016b c0016b) {
        super(new C0015a(new b()));
        c0016b.m41g(this);
        m16797v(c0016b);
    }

    public AbstractC9974c() {
        this(new C0016b());
    }

    @Override // p004a2.C0015a.b
    /* renamed from: q */
    public final void mo36q(C6327a c6327a, long j10) {
    }

    @Override // p004a2.C0015a.b
    /* renamed from: n */
    public final void mo35n(C6327a c6327a, int i10, long j10) {
    }

    @Override // p004a2.C0015a.b
    /* renamed from: t */
    public final void mo37t(C6327a c6327a, int i10, C9124a c9124a) {
    }

    @Override // p004a2.C0015a.b
    /* renamed from: b */
    public final void mo33b(C6327a c6327a, EndCause endCause, Exception exc, C0015a.c cVar) {
    }

    @Override // p004a2.C0015a.b
    /* renamed from: f */
    public final void mo34f(C6327a c6327a, C9126c c9126c, boolean z9, C0015a.c cVar) {
    }
}
