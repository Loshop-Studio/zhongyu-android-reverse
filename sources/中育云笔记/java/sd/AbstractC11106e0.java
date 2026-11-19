package sd;

import kotlin.coroutines.AbstractC9942a;
import kotlin.coroutines.AbstractC9943b;
import kotlin.coroutines.InterfaceC9944c;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10770a;
import p410xd.AbstractC11850i;
import p410xd.AbstractC11856l;
import p410xd.C11848h;
import p410xd.C11854k;
import sd.AbstractC11106e0;
import vc.InterfaceC11588c;

/* renamed from: sd.e0 */
/* loaded from: classes6.dex */
public abstract class AbstractC11106e0 extends AbstractC9942a implements InterfaceC9944c {
    public static final a Key = new a(null);

    /* renamed from: sd.e0$a */
    public static final class a extends AbstractC9943b {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: d */
        public static final AbstractC11106e0 m24696d(InterfaceC9945d.b bVar) {
            if (bVar instanceof AbstractC11106e0) {
                return (AbstractC11106e0) bVar;
            }
            return null;
        }

        public a() {
            super(InterfaceC9944c.f23354a0, new InterfaceC9540l() { // from class: sd.d0
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return AbstractC11106e0.a.m24696d((InterfaceC9945d.b) obj);
                }
            });
        }
    }

    public AbstractC11106e0() {
        super(InterfaceC9944c.f23354a0);
    }

    public static /* synthetic */ AbstractC11106e0 limitedParallelism$default(AbstractC11106e0 abstractC11106e0, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return abstractC11106e0.limitedParallelism(i10, str);
    }

    public abstract void dispatch(InterfaceC9945d interfaceC9945d, Runnable runnable);

    public void dispatchYield(InterfaceC9945d interfaceC9945d, Runnable runnable) {
        AbstractC11850i.m26279c(this, interfaceC9945d, runnable);
    }

    @Override // kotlin.coroutines.AbstractC9942a, kotlin.coroutines.InterfaceC9945d.b, kotlin.coroutines.InterfaceC9945d
    public <E extends InterfaceC9945d.b> E get(InterfaceC9945d.c cVar) {
        return (E) InterfaceC9944c.a.m20211a(this, cVar);
    }

    @Override // kotlin.coroutines.InterfaceC9944c
    public final <T> InterfaceC11588c<T> interceptContinuation(InterfaceC11588c<? super T> interfaceC11588c) {
        return new C11848h(this, interfaceC11588c);
    }

    public boolean isDispatchNeeded(InterfaceC9945d interfaceC9945d) {
        return true;
    }

    public AbstractC11106e0 limitedParallelism(int i10, String str) {
        AbstractC11856l.m26301a(i10);
        return new C11854k(this, i10, str);
    }

    @Override // kotlin.coroutines.AbstractC9942a, kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d minusKey(InterfaceC9945d.c cVar) {
        return InterfaceC9944c.a.m20212b(this, cVar);
    }

    @Override // kotlin.coroutines.InterfaceC9944c
    public final void releaseInterceptedContinuation(InterfaceC11588c<?> interfaceC11588c) {
        AbstractC9979u.m20292e(interfaceC11588c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C11848h) interfaceC11588c).m26275s();
    }

    public String toString() {
        return AbstractC11126j0.m24738a(this) + '@' + AbstractC11126j0.m24739b(this);
    }

    @InterfaceC10770a
    public /* synthetic */ AbstractC11106e0 limitedParallelism(int i10) {
        return limitedParallelism(i10, null);
    }

    @InterfaceC10770a
    public final AbstractC11106e0 plus(AbstractC11106e0 abstractC11106e0) {
        return abstractC11106e0;
    }
}
