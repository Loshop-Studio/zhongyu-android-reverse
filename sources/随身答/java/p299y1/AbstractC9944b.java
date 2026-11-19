package p299y1;

import com.liulishuo.okdownload.C6593a;
import com.liulishuo.okdownload.core.cause.EndCause;
import p229r1.C9417a;
import p229r1.C9419c;
import p309z1.C9987a;
import p309z1.C9988b;
import p309z1.C9989c;

/* renamed from: y1.b */
/* loaded from: classes4.dex */
public abstract class AbstractC9944b extends AbstractC9943a implements C9988b.a {

    /* renamed from: y1.b$b */
    public static class b implements C9989c.b {
        public b() {
        }

        @Override // p309z1.C9989c.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9988b.b mo17136c(int i9) {
            return new C9988b.b(i9);
        }
    }

    public AbstractC9944b(C9988b c9988b) {
        super(new C9987a(new b()));
        c9988b.m17303g(this);
        m17129v(c9988b);
    }

    public AbstractC9944b() {
        this(new C9988b());
    }

    @Override // p309z1.C9987a.b
    /* renamed from: n */
    public final void mo17132n(C6593a c6593a, long j9) {
    }

    @Override // p309z1.C9987a.b
    /* renamed from: k */
    public final void mo17131k(C6593a c6593a, int i9, long j9) {
    }

    @Override // p309z1.C9987a.b
    /* renamed from: r */
    public final void mo17133r(C6593a c6593a, int i9, C9417a c9417a) {
    }

    @Override // p309z1.C9987a.b
    /* renamed from: e */
    public final void mo17130e(C6593a c6593a, C9419c c9419c, boolean z9, C9987a.c cVar) {
    }

    @Override // p309z1.C9987a.b
    /* renamed from: s */
    public final void mo17134s(C6593a c6593a, EndCause endCause, Exception exc, C9987a.c cVar) {
    }
}
