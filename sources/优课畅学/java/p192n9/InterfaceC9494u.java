package p192n9;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.C8791m;
import p136i9.C8896a;
import p136i9.C8925w;

/* renamed from: n9.u */
/* loaded from: classes5.dex */
public interface InterfaceC9494u {

    /* renamed from: n9.u$b */
    public interface b {
        /* renamed from: a */
        C9488o mo17443a();

        /* renamed from: c */
        a mo17445c();

        void cancel();

        /* renamed from: e */
        a mo17447e();

        boolean isReady();

        b retry();
    }

    /* renamed from: f */
    static /* synthetic */ boolean m17593f(InterfaceC9494u interfaceC9494u, C9488o c9488o, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hasNext");
        }
        if ((i10 & 1) != 0) {
            c9488o = null;
        }
        return interfaceC9494u.mo17507e(c9488o);
    }

    /* renamed from: a */
    C8896a mo17503a();

    /* renamed from: b */
    boolean mo17504b(C8925w c8925w);

    /* renamed from: c */
    C8791m mo17505c();

    /* renamed from: d */
    b mo17506d();

    /* renamed from: e */
    boolean mo17507e(C9488o c9488o);

    boolean isCanceled();

    /* renamed from: n9.u$a */
    public static final class a {

        /* renamed from: a */
        public final b f18833a;

        /* renamed from: b */
        public final b f18834b;

        /* renamed from: c */
        public final Throwable f18835c;

        public a(b plan, b bVar, Throwable th) {
            AbstractC9133u.m16133g(plan, "plan");
            this.f18833a = plan;
            this.f18834b = bVar;
            this.f18835c = th;
        }

        /* renamed from: a */
        public final b m17594a() {
            return this.f18834b;
        }

        /* renamed from: b */
        public final Throwable m17595b() {
            return this.f18835c;
        }

        /* renamed from: c */
        public final b m17596c() {
            return this.f18834b;
        }

        /* renamed from: d */
        public final b m17597d() {
            return this.f18833a;
        }

        /* renamed from: e */
        public final Throwable m17598e() {
            return this.f18835c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC9133u.m16128b(this.f18833a, aVar.f18833a) && AbstractC9133u.m16128b(this.f18834b, aVar.f18834b) && AbstractC9133u.m16128b(this.f18835c, aVar.f18835c);
        }

        /* renamed from: f */
        public final boolean m17599f() {
            return this.f18834b == null && this.f18835c == null;
        }

        public int hashCode() {
            int iHashCode = this.f18833a.hashCode() * 31;
            b bVar = this.f18834b;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Throwable th = this.f18835c;
            return iHashCode2 + (th != null ? th.hashCode() : 0);
        }

        public String toString() {
            return "ConnectResult(plan=" + this.f18833a + ", nextPlan=" + this.f18834b + ", throwable=" + this.f18835c + ')';
        }

        public /* synthetic */ a(b bVar, b bVar2, Throwable th, int i10, AbstractC9126n abstractC9126n) {
            this(bVar, (i10 & 2) != 0 ? null : bVar2, (i10 & 4) != 0 ? null : th);
        }
    }
}
