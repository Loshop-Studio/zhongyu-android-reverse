package p134i7;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;
import p311y7.InterfaceC10668a;

/* renamed from: i7.k0 */
/* loaded from: classes5.dex */
public final class C8788k0 implements Iterable, InterfaceC10668a {

    /* renamed from: a */
    public final InterfaceC10559a f16464a;

    public C8788k0(InterfaceC10559a iteratorFactory) {
        AbstractC9133u.m16133g(iteratorFactory, "iteratorFactory");
        this.f16464a = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C8790l0((Iterator) this.f16464a.invoke());
    }
}
