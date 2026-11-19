package p325rc;

import id.InterfaceC9624a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* renamed from: rc.l0 */
/* loaded from: classes6.dex */
public final class C10957l0 implements Iterable, InterfaceC9624a {

    /* renamed from: c */
    public final InterfaceC9529a f26460c;

    public C10957l0(InterfaceC9529a iteratorFactory) {
        AbstractC9979u.m20294g(iteratorFactory, "iteratorFactory");
        this.f26460c = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C10959m0((Iterator) this.f26460c.invoke());
    }
}
