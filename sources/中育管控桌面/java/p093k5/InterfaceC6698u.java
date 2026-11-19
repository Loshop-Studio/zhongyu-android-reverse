package p093k5;

import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p058f5.C6355a;
import p058f5.C6384w;

/* renamed from: k5.u */
/* loaded from: classes4.dex */
public interface InterfaceC6698u {

    /* renamed from: k5.u$b */
    public interface b {
        /* renamed from: a */
        C6692o mo7710a();

        /* renamed from: c */
        a mo7712c();

        void cancel();

        /* renamed from: f */
        a mo7715f();

        boolean isReady();

        b retry();
    }

    /* renamed from: d */
    static /* synthetic */ boolean m7860d(InterfaceC6698u interfaceC6698u, C6692o c6692o, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hasNext");
        }
        if ((i6 & 1) != 0) {
            c6692o = null;
        }
        return interfaceC6698u.mo7774f(c6692o);
    }

    /* renamed from: a */
    C6355a mo7770a();

    /* renamed from: b */
    ArrayDeque mo7771b();

    /* renamed from: c */
    b mo7772c();

    /* renamed from: e */
    boolean mo7773e(C6384w c6384w);

    /* renamed from: f */
    boolean mo7774f(C6692o c6692o);

    boolean isCanceled();

    /* renamed from: k5.u$a */
    public static final class a {

        /* renamed from: a */
        public final b f8963a;

        /* renamed from: b */
        public final b f8964b;

        /* renamed from: c */
        public final Throwable f8965c;

        public a(b plan, b bVar, Throwable th) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            this.f8963a = plan;
            this.f8964b = bVar;
            this.f8965c = th;
        }

        /* renamed from: a */
        public final b m7861a() {
            return this.f8964b;
        }

        /* renamed from: b */
        public final Throwable m7862b() {
            return this.f8965c;
        }

        /* renamed from: c */
        public final b m7863c() {
            return this.f8964b;
        }

        /* renamed from: d */
        public final b m7864d() {
            return this.f8963a;
        }

        /* renamed from: e */
        public final Throwable m7865e() {
            return this.f8965c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f8963a, aVar.f8963a) && Intrinsics.areEqual(this.f8964b, aVar.f8964b) && Intrinsics.areEqual(this.f8965c, aVar.f8965c);
        }

        /* renamed from: f */
        public final boolean m7866f() {
            return this.f8964b == null && this.f8965c == null;
        }

        public int hashCode() {
            int iHashCode = this.f8963a.hashCode() * 31;
            b bVar = this.f8964b;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Throwable th = this.f8965c;
            return iHashCode2 + (th != null ? th.hashCode() : 0);
        }

        public String toString() {
            return "ConnectResult(plan=" + this.f8963a + ", nextPlan=" + this.f8964b + ", throwable=" + this.f8965c + ')';
        }

        public /* synthetic */ a(b bVar, b bVar2, Throwable th, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, (i6 & 2) != 0 ? null : bVar2, (i6 & 4) != 0 ? null : th);
        }
    }
}
