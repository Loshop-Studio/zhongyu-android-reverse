package kotlinx.coroutines.sync;

import ae.C0113i;
import ae.InterfaceC0112h;
import ae.InterfaceC0115k;
import ae.InterfaceC0116l;
import androidx.concurrent.futures.AbstractC3223a;
import be.AbstractC5194f;
import be.InterfaceC5189a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.C9997c;
import kotlinx.coroutines.sync.MutexImpl;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import p410xd.AbstractC11875z;
import sd.AbstractC11106e0;
import sd.AbstractC11126j0;
import sd.AbstractC11137m;
import sd.InterfaceC11125j;
import sd.InterfaceC11144n2;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public class MutexImpl extends SemaphoreAndMutexImpl implements InterfaceC5189a {

    /* renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24039k = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner$volatile");

    /* renamed from: j */
    public final InterfaceC9545q f24040j;
    private volatile /* synthetic */ Object owner$volatile;

    /* renamed from: kotlinx.coroutines.sync.MutexImpl$a */
    public final class C10052a implements InterfaceC11125j, InterfaceC11144n2 {

        /* renamed from: c */
        public final C9997c f24041c;

        /* renamed from: d */
        public final Object f24042d;

        public C10052a(C9997c c9997c, Object obj) {
            this.f24041c = c9997c;
            this.f24042d = obj;
        }

        /* renamed from: g */
        public static final C10786q m21011g(MutexImpl mutexImpl, C10052a c10052a, Throwable th) {
            mutexImpl.unlock(c10052a.f24042d);
            return C10786q.f26013a;
        }

        /* renamed from: j */
        public static final C10786q m21012j(MutexImpl mutexImpl, C10052a c10052a, Throwable th, C10786q c10786q, InterfaceC9945d interfaceC9945d) {
            MutexImpl.m21002w().set(mutexImpl, c10052a.f24042d);
            mutexImpl.unlock(c10052a.f24042d);
            return C10786q.f26013a;
        }

        @Override // sd.InterfaceC11125j
        /* renamed from: D */
        public void mo20502D(Object obj) {
            this.f24041c.mo20502D(obj);
        }

        @Override // sd.InterfaceC11125j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo20520c(C10786q c10786q, InterfaceC9540l interfaceC9540l) {
            this.f24041c.mo20520c(c10786q, interfaceC9540l);
        }

        @Override // sd.InterfaceC11125j
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo20526k(C10786q c10786q, InterfaceC9545q interfaceC9545q) {
            MutexImpl.m21002w().set(MutexImpl.this, this.f24042d);
            C9997c c9997c = this.f24041c;
            final MutexImpl mutexImpl = MutexImpl.this;
            c9997c.mo20520c(c10786q, new InterfaceC9540l() { // from class: be.e
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return MutexImpl.C10052a.m21011g(mutexImpl, this, (Throwable) obj);
                }
            });
        }

        @Override // sd.InterfaceC11144n2
        /* renamed from: f */
        public void mo20523f(AbstractC11875z abstractC11875z, int i10) {
            this.f24041c.mo20523f(abstractC11875z, i10);
        }

        @Override // vc.InterfaceC11588c
        public InterfaceC9945d getContext() {
            return this.f24041c.getContext();
        }

        @Override // sd.InterfaceC11125j
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo20501C(AbstractC11106e0 abstractC11106e0, C10786q c10786q) {
            this.f24041c.mo20501C(abstractC11106e0, c10786q);
        }

        @Override // sd.InterfaceC11125j
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object mo20533r(C10786q c10786q, Object obj, InterfaceC9545q interfaceC9545q) {
            final MutexImpl mutexImpl = MutexImpl.this;
            Object objMo20533r = this.f24041c.mo20533r(c10786q, obj, new InterfaceC9545q() { // from class: be.d
                @Override // p181hd.InterfaceC9545q
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return MutexImpl.C10052a.m21012j(mutexImpl, this, (Throwable) obj2, (C10786q) obj3, (InterfaceC9945d) obj4);
                }
            });
            if (objMo20533r != null) {
                MutexImpl.m21002w().set(MutexImpl.this, this.f24042d);
            }
            return objMo20533r;
        }

        @Override // sd.InterfaceC11125j
        public boolean isActive() {
            return this.f24041c.isActive();
        }

        @Override // sd.InterfaceC11125j
        /* renamed from: o */
        public boolean mo20530o(Throwable th) {
            return this.f24041c.mo20530o(th);
        }

        @Override // vc.InterfaceC11588c
        public void resumeWith(Object obj) {
            this.f24041c.resumeWith(obj);
        }

        @Override // sd.InterfaceC11125j
        /* renamed from: u */
        public void mo20536u(InterfaceC9540l interfaceC9540l) {
            this.f24041c.mo20536u(interfaceC9540l);
        }
    }

    /* renamed from: kotlinx.coroutines.sync.MutexImpl$b */
    public final class C10053b implements InterfaceC0116l {

        /* renamed from: c */
        public final InterfaceC0116l f24044c;

        /* renamed from: d */
        public final Object f24045d;

        public C10053b(InterfaceC0116l interfaceC0116l, Object obj) {
            this.f24044c = interfaceC0116l;
            this.f24045d = obj;
        }

        @Override // ae.InterfaceC0115k
        /* renamed from: b */
        public void mo286b(Object obj) {
            MutexImpl.m21002w().set(MutexImpl.this, this.f24045d);
            this.f24044c.mo286b(obj);
        }

        @Override // ae.InterfaceC0115k
        /* renamed from: d */
        public boolean mo287d(Object obj, Object obj2) {
            boolean zMo287d = this.f24044c.mo287d(obj, obj2);
            MutexImpl mutexImpl = MutexImpl.this;
            if (zMo287d) {
                MutexImpl.m21002w().set(mutexImpl, this.f24045d);
            }
            return zMo287d;
        }

        @Override // sd.InterfaceC11144n2
        /* renamed from: f */
        public void mo20523f(AbstractC11875z abstractC11875z, int i10) {
            this.f24044c.mo20523f(abstractC11875z, i10);
        }

        @Override // ae.InterfaceC0115k
        public InterfaceC9945d getContext() {
            return this.f24044c.getContext();
        }
    }

    public MutexImpl(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : AbstractC5194f.f3061a;
        this.f24040j = new InterfaceC9545q() { // from class: be.b
            @Override // p181hd.InterfaceC9545q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MutexImpl.m20997C(this.f3054c, (InterfaceC0115k) obj, obj2, obj3);
            }
        };
    }

    /* renamed from: C */
    public static final InterfaceC9545q m20997C(final MutexImpl mutexImpl, InterfaceC0115k interfaceC0115k, final Object obj, Object obj2) {
        return new InterfaceC9545q() { // from class: be.c
            @Override // p181hd.InterfaceC9545q
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return MutexImpl.m20998D(this.f3055c, obj, (Throwable) obj3, obj4, (InterfaceC9945d) obj5);
            }
        };
    }

    /* renamed from: D */
    public static final C10786q m20998D(MutexImpl mutexImpl, Object obj, Throwable th, Object obj2, InterfaceC9945d interfaceC9945d) {
        mutexImpl.unlock(obj);
        return C10786q.f26013a;
    }

    /* renamed from: w */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m21002w() {
        return f24039k;
    }

    /* renamed from: y */
    public static /* synthetic */ Object m21003y(MutexImpl mutexImpl, Object obj, InterfaceC11588c interfaceC11588c) {
        if (mutexImpl.tryLock(obj)) {
            return C10786q.f26013a;
        }
        Object objM21008z = mutexImpl.m21008z(obj, interfaceC11588c);
        return objM21008z == AbstractC11725a.m25952f() ? objM21008z : C10786q.f26013a;
    }

    /* renamed from: A */
    public Object m21004A(Object obj, Object obj2) {
        if (!AbstractC9979u.m20289b(obj2, AbstractC5194f.f3062b)) {
            return this;
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    /* renamed from: B */
    public void m21005B(InterfaceC0115k interfaceC0115k, Object obj) {
        if (obj != null && holdsLock(obj)) {
            interfaceC0115k.mo286b(AbstractC5194f.f3062b);
        } else {
            AbstractC9979u.m20292e(interfaceC0115k, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
            m21034o(new C10053b((InterfaceC0116l) interfaceC0115k, obj), obj);
        }
    }

    /* renamed from: E */
    public final int m21006E(Object obj) {
        while (!m21035q()) {
            if (obj == null) {
                return 1;
            }
            int iM21007x = m21007x(obj);
            if (iM21007x == 1) {
                return 2;
            }
            if (iM21007x == 2) {
                return 1;
            }
        }
        f24039k.set(this, obj);
        return 0;
    }

    @Override // be.InterfaceC5189a
    public InterfaceC0112h getOnLock() {
        MutexImpl$onLock$1 mutexImpl$onLock$1 = MutexImpl$onLock$1.f24047c;
        AbstractC9979u.m20292e(mutexImpl$onLock$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        InterfaceC9545q interfaceC9545q = (InterfaceC9545q) AbstractC9962d0.m20254e(mutexImpl$onLock$1, 3);
        MutexImpl$onLock$2 mutexImpl$onLock$2 = MutexImpl$onLock$2.f24048c;
        AbstractC9979u.m20292e(mutexImpl$onLock$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new C0113i(this, interfaceC9545q, (InterfaceC9545q) AbstractC9962d0.m20254e(mutexImpl$onLock$2, 3), this.f24040j);
    }

    @Override // be.InterfaceC5189a
    public boolean holdsLock(Object obj) {
        return m21007x(obj) == 1;
    }

    @Override // be.InterfaceC5189a
    public boolean isLocked() {
        return m21027a() == 0;
    }

    @Override // be.InterfaceC5189a
    public Object lock(Object obj, InterfaceC11588c interfaceC11588c) {
        return m21003y(this, obj, interfaceC11588c);
    }

    public String toString() {
        return "Mutex@" + AbstractC11126j0.m24739b(this) + "[isLocked=" + isLocked() + ",owner=" + f24039k.get(this) + ']';
    }

    @Override // be.InterfaceC5189a
    public boolean tryLock(Object obj) {
        int iM21006E = m21006E(obj);
        if (iM21006E == 0) {
            return true;
        }
        if (iM21006E == 1) {
            return false;
        }
        if (iM21006E != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // be.InterfaceC5189a
    public void unlock(Object obj) {
        while (isLocked()) {
            Object obj2 = f24039k.get(this);
            if (obj2 != AbstractC5194f.f3061a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (AbstractC3223a.m1395a(f24039k, this, obj2, AbstractC5194f.f3061a)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    /* renamed from: x */
    public final int m21007x(Object obj) {
        while (isLocked()) {
            Object obj2 = f24039k.get(this);
            if (obj2 != AbstractC5194f.f3061a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    /* renamed from: z */
    public final Object m21008z(Object obj, InterfaceC11588c interfaceC11588c) {
        C9997c c9997cM24757b = AbstractC11137m.m24757b(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c));
        try {
            m21029e(new C10052a(c9997cM24757b, obj));
            Object objM20538x = c9997cM24757b.m20538x();
            if (objM20538x == AbstractC11725a.m25952f()) {
                AbstractC11831f.m26221c(interfaceC11588c);
            }
            return objM20538x == AbstractC11725a.m25952f() ? objM20538x : C10786q.f26013a;
        } catch (Throwable th) {
            c9997cM24757b.m20511O();
            throw th;
        }
    }
}
