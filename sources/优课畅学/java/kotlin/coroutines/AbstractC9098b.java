package kotlin.coroutines;

import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* renamed from: kotlin.coroutines.b */
/* loaded from: classes5.dex */
public abstract class AbstractC9098b implements InterfaceC9100d.c {

    /* renamed from: a */
    public final InterfaceC10570l f17439a;

    /* renamed from: b */
    public final InterfaceC9100d.c f17440b;

    public AbstractC9098b(InterfaceC9100d.c baseKey, InterfaceC10570l safeCast) {
        AbstractC9133u.m16133g(baseKey, "baseKey");
        AbstractC9133u.m16133g(safeCast, "safeCast");
        this.f17439a = safeCast;
        this.f17440b = baseKey instanceof AbstractC9098b ? ((AbstractC9098b) baseKey).f17440b : baseKey;
    }

    /* renamed from: a */
    public final boolean m16064a(InterfaceC9100d.c key) {
        AbstractC9133u.m16133g(key, "key");
        return key == this || this.f17440b == key;
    }

    /* renamed from: b */
    public final InterfaceC9100d.b m16065b(InterfaceC9100d.b element) {
        AbstractC9133u.m16133g(element, "element");
        return (InterfaceC9100d.b) this.f17439a.invoke(element);
    }
}
