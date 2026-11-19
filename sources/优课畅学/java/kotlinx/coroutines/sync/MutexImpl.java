package kotlinx.coroutines.sync;

import androidx.concurrent.futures.AbstractC3193a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9116d0;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.C9155c;
import kotlinx.coroutines.CoroutineDispatcher;
import p123h7.C8736p;
import p135i8.AbstractC8825c0;
import p135i8.AbstractC8851l;
import p135i8.InterfaceC8845j;
import p135i8.InterfaceC8849k0;
import p135i8.InterfaceC8895z1;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p191n8.AbstractC9436a0;
import p201o7.AbstractC9541f;
import p224q8.C9852h;
import p224q8.InterfaceC9851g;
import p224q8.InterfaceC9854j;
import p224q8.InterfaceC9855k;
import p235r8.AbstractC9943b;
import p235r8.InterfaceC9942a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

/* loaded from: classes5.dex */
public class MutexImpl extends SemaphoreImpl implements InterfaceC9942a {

    /* renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18166i = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner$volatile");

    /* renamed from: h */
    public final InterfaceC10575q f18167h;
    private volatile /* synthetic */ Object owner$volatile;

    public final class CancellableContinuationWithOwner implements InterfaceC8845j, InterfaceC8895z1 {

        /* renamed from: a */
        public final C9155c f18168a;

        /* renamed from: b */
        public final Object f18169b;

        public CancellableContinuationWithOwner(C9155c c9155c, Object obj) {
            this.f18168a = c9155c;
            this.f18169b = obj;
        }

        @Override // p135i8.InterfaceC8845j
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo14870g(C8736p c8736p, InterfaceC10570l interfaceC10570l) {
            MutexImpl.m16874t().set(MutexImpl.this, this.f18169b);
            C9155c c9155c = this.f18168a;
            final MutexImpl mutexImpl = MutexImpl.this;
            c9155c.mo14870g(c8736p, new InterfaceC10570l() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$resume$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C8736p.f16368a;
                }

                public final void invoke(Throwable th) {
                    mutexImpl.unlock(this.f18169b);
                }
            });
        }

        @Override // p135i8.InterfaceC8845j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo14872q(CoroutineDispatcher coroutineDispatcher, C8736p c8736p) {
            this.f18168a.mo14872q(coroutineDispatcher, c8736p);
        }

        @Override // p135i8.InterfaceC8895z1
        /* renamed from: c */
        public void mo14938c(AbstractC9436a0 abstractC9436a0, int i10) {
            this.f18168a.mo14938c(abstractC9436a0, i10);
        }

        @Override // p135i8.InterfaceC8845j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object mo14874t(C8736p c8736p, Object obj, InterfaceC10570l interfaceC10570l) {
            final MutexImpl mutexImpl = MutexImpl.this;
            Object objMo14874t = this.f18168a.mo14874t(c8736p, obj, new InterfaceC10570l() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$tryResume$token$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Throwable) obj2);
                    return C8736p.f16368a;
                }

                public final void invoke(Throwable th) {
                    MutexImpl.m16874t().set(mutexImpl, this.f18169b);
                    mutexImpl.unlock(this.f18169b);
                }
            });
            if (objMo14874t != null) {
                MutexImpl.m16874t().set(MutexImpl.this, this.f18169b);
            }
            return objMo14874t;
        }

        @Override // p179m7.InterfaceC9324c
        public InterfaceC9100d getContext() {
            return this.f18168a.getContext();
        }

        @Override // p135i8.InterfaceC8845j
        /* renamed from: i */
        public boolean mo14871i(Throwable th) {
            return this.f18168a.mo14871i(th);
        }

        @Override // p135i8.InterfaceC8845j
        public boolean isActive() {
            return this.f18168a.isActive();
        }

        @Override // p135i8.InterfaceC8845j
        /* renamed from: r */
        public void mo14873r(InterfaceC10570l interfaceC10570l) {
            this.f18168a.mo14873r(interfaceC10570l);
        }

        @Override // p179m7.InterfaceC9324c
        public void resumeWith(Object obj) {
            this.f18168a.resumeWith(obj);
        }

        @Override // p135i8.InterfaceC8845j
        /* renamed from: w */
        public void mo14875w(Object obj) {
            this.f18168a.mo14875w(obj);
        }
    }

    /* renamed from: kotlinx.coroutines.sync.MutexImpl$a */
    public final class C9221a implements InterfaceC9855k {

        /* renamed from: a */
        public final InterfaceC9855k f18175a;

        /* renamed from: b */
        public final Object f18176b;

        public C9221a(InterfaceC9855k interfaceC9855k, Object obj) {
            this.f18175a = interfaceC9855k;
            this.f18176b = obj;
        }

        @Override // p135i8.InterfaceC8895z1
        /* renamed from: c */
        public void mo14938c(AbstractC9436a0 abstractC9436a0, int i10) {
            this.f18175a.mo14938c(abstractC9436a0, i10);
        }

        @Override // p224q8.InterfaceC9854j
        /* renamed from: e */
        public void mo16842e(Object obj) {
            MutexImpl.m16874t().set(MutexImpl.this, this.f18176b);
            this.f18175a.mo16842e(obj);
        }

        @Override // p224q8.InterfaceC9854j
        /* renamed from: f */
        public boolean mo16843f(Object obj, Object obj2) {
            boolean zMo16843f = this.f18175a.mo16843f(obj, obj2);
            MutexImpl mutexImpl = MutexImpl.this;
            if (zMo16843f) {
                MutexImpl.m16874t().set(mutexImpl, this.f18176b);
            }
            return zMo16843f;
        }

        @Override // p224q8.InterfaceC9854j
        /* renamed from: g */
        public void mo16844g(InterfaceC8849k0 interfaceC8849k0) {
            this.f18175a.mo16844g(interfaceC8849k0);
        }

        @Override // p224q8.InterfaceC9854j
        public InterfaceC9100d getContext() {
            return this.f18175a.getContext();
        }
    }

    public MutexImpl(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : AbstractC9943b.f19914a;
        this.f18167h = new InterfaceC10575q() { // from class: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1
            {
                super(3);
            }

            @Override // p300x7.InterfaceC10575q
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC10570l invoke(InterfaceC9854j interfaceC9854j, final Object obj, Object obj2) {
                final MutexImpl mutexImpl = this.f18180a;
                return new InterfaceC10570l() { // from class: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                        invoke((Throwable) obj3);
                        return C8736p.f16368a;
                    }

                    public final void invoke(Throwable th) {
                        mutexImpl.unlock(obj);
                    }
                };
            }
        };
    }

    /* renamed from: t */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m16874t() {
        return f18166i;
    }

    /* renamed from: v */
    public static /* synthetic */ Object m16875v(MutexImpl mutexImpl, Object obj, InterfaceC9324c interfaceC9324c) {
        if (mutexImpl.tryLock(obj)) {
            return C8736p.f16368a;
        }
        Object objM16877w = mutexImpl.m16877w(obj, interfaceC9324c);
        return objM16877w == AbstractC9434a.m17291f() ? objM16877w : C8736p.f16368a;
    }

    @Override // p235r8.InterfaceC9942a
    public InterfaceC9851g getOnLock() {
        MutexImpl$onLock$1 mutexImpl$onLock$1 = MutexImpl$onLock$1.f18178a;
        AbstractC9133u.m16131e(mutexImpl$onLock$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        InterfaceC10575q interfaceC10575q = (InterfaceC10575q) AbstractC9116d0.m16096e(mutexImpl$onLock$1, 3);
        MutexImpl$onLock$2 mutexImpl$onLock$2 = MutexImpl$onLock$2.f18179a;
        AbstractC9133u.m16131e(mutexImpl$onLock$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new C9852h(this, interfaceC10575q, (InterfaceC10575q) AbstractC9116d0.m16096e(mutexImpl$onLock$2, 3), this.f18167h);
    }

    @Override // p235r8.InterfaceC9942a
    public boolean holdsLock(Object obj) {
        return m16876u(obj) == 1;
    }

    @Override // p235r8.InterfaceC9942a
    public boolean isLocked() {
        return mo16894a() == 0;
    }

    @Override // p235r8.InterfaceC9942a
    public Object lock(Object obj, InterfaceC9324c interfaceC9324c) {
        return m16875v(this, obj, interfaceC9324c);
    }

    public String toString() {
        return "Mutex@" + AbstractC8825c0.m14821b(this) + "[isLocked=" + isLocked() + ",owner=" + f18166i.get(this) + ']';
    }

    @Override // p235r8.InterfaceC9942a
    public boolean tryLock(Object obj) {
        int iM16880z = m16880z(obj);
        if (iM16880z == 0) {
            return true;
        }
        if (iM16880z == 1) {
            return false;
        }
        if (iM16880z != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    /* renamed from: u */
    public final int m16876u(Object obj) {
        while (isLocked()) {
            Object obj2 = f18166i.get(this);
            if (obj2 != AbstractC9943b.f19914a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    @Override // p235r8.InterfaceC9942a
    public void unlock(Object obj) {
        while (isLocked()) {
            Object obj2 = f18166i.get(this);
            if (obj2 != AbstractC9943b.f19914a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (AbstractC3193a.m1318a(f18166i, this, obj2, AbstractC9943b.f19914a)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    /* renamed from: w */
    public final Object m16877w(Object obj, InterfaceC9324c interfaceC9324c) {
        C9155c c9155cM14879b = AbstractC8851l.m14879b(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c));
        try {
            m16896d(new CancellableContinuationWithOwner(c9155cM14879b, obj));
            Object objM16372x = c9155cM14879b.m16372x();
            if (objM16372x == AbstractC9434a.m17291f()) {
                AbstractC9541f.m17811c(interfaceC9324c);
            }
            return objM16372x == AbstractC9434a.m17291f() ? objM16372x : C8736p.f16368a;
        } catch (Throwable th) {
            c9155cM14879b.m16351M();
            throw th;
        }
    }

    /* renamed from: x */
    public Object m16878x(Object obj, Object obj2) {
        if (!AbstractC9133u.m16128b(obj2, AbstractC9943b.f19915b)) {
            return this;
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    /* renamed from: y */
    public void m16879y(InterfaceC9854j interfaceC9854j, Object obj) {
        if (obj != null && holdsLock(obj)) {
            interfaceC9854j.mo16842e(AbstractC9943b.f19915b);
        } else {
            AbstractC9133u.m16131e(interfaceC9854j, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
            m16901o(new C9221a((InterfaceC9855k) interfaceC9854j, obj), obj);
        }
    }

    /* renamed from: z */
    public final int m16880z(Object obj) {
        while (!m16902p()) {
            if (obj == null) {
                return 1;
            }
            int iM16876u = m16876u(obj);
            if (iM16876u == 1) {
                return 2;
            }
            if (iM16876u == 2) {
                return 1;
            }
        }
        f18166i.set(this, obj);
        return 0;
    }
}
