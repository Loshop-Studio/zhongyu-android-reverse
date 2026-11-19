package kotlinx.coroutines;

import kotlin.coroutines.AbstractC9097a;
import kotlin.coroutines.AbstractC9098b;
import kotlin.coroutines.InterfaceC9099c;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;
import p135i8.AbstractC8825c0;
import p179m7.InterfaceC9324c;
import p191n8.AbstractC9461n;
import p191n8.C9453j;
import p191n8.C9459m;
import p300x7.InterfaceC10570l;

/* loaded from: classes5.dex */
public abstract class CoroutineDispatcher extends AbstractC9097a implements InterfaceC9099c {
    public static final Key Key = new Key(null);

    public static final class Key extends AbstractC9098b {
        public /* synthetic */ Key(AbstractC9126n abstractC9126n) {
            this();
        }

        public Key() {
            super(InterfaceC9099c.f17441b0, new InterfaceC10570l() { // from class: kotlinx.coroutines.CoroutineDispatcher.Key.1
                @Override // p300x7.InterfaceC10570l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CoroutineDispatcher invoke(InterfaceC9100d.b bVar) {
                    if (bVar instanceof CoroutineDispatcher) {
                        return (CoroutineDispatcher) bVar;
                    }
                    return null;
                }
            });
        }
    }

    public CoroutineDispatcher() {
        super(InterfaceC9099c.f17441b0);
    }

    public abstract void dispatch(InterfaceC9100d interfaceC9100d, Runnable runnable);

    public void dispatchYield(InterfaceC9100d interfaceC9100d, Runnable runnable) {
        dispatch(interfaceC9100d, runnable);
    }

    @Override // kotlin.coroutines.AbstractC9097a, kotlin.coroutines.InterfaceC9100d.b, kotlin.coroutines.InterfaceC9100d
    public <E extends InterfaceC9100d.b> E get(InterfaceC9100d.c cVar) {
        return (E) InterfaceC9099c.a.m16066a(this, cVar);
    }

    @Override // kotlin.coroutines.InterfaceC9099c
    public final <T> InterfaceC9324c<T> interceptContinuation(InterfaceC9324c<? super T> interfaceC9324c) {
        return new C9453j(this, interfaceC9324c);
    }

    public boolean isDispatchNeeded(InterfaceC9100d interfaceC9100d) {
        return true;
    }

    public CoroutineDispatcher limitedParallelism(int i10) {
        AbstractC9461n.m17380a(i10);
        return new C9459m(this, i10);
    }

    @Override // kotlin.coroutines.AbstractC9097a, kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d minusKey(InterfaceC9100d.c cVar) {
        return InterfaceC9099c.a.m16067b(this, cVar);
    }

    @InterfaceC8721a
    public final CoroutineDispatcher plus(CoroutineDispatcher coroutineDispatcher) {
        return coroutineDispatcher;
    }

    @Override // kotlin.coroutines.InterfaceC9099c
    public final void releaseInterceptedContinuation(InterfaceC9324c<?> interfaceC9324c) {
        AbstractC9133u.m16131e(interfaceC9324c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C9453j) interfaceC9324c).m17349s();
    }

    public String toString() {
        return AbstractC8825c0.m14820a(this) + '@' + AbstractC8825c0.m14821b(this);
    }
}
