package kotlin.coroutines;

import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* renamed from: kotlin.coroutines.b */
/* loaded from: classes6.dex */
public abstract class AbstractC9943b implements InterfaceC9945d.c {

    /* renamed from: c */
    public final InterfaceC9540l f23352c;

    /* renamed from: d */
    public final InterfaceC9945d.c f23353d;

    public AbstractC9943b(InterfaceC9945d.c baseKey, InterfaceC9540l safeCast) {
        AbstractC9979u.m20294g(baseKey, "baseKey");
        AbstractC9979u.m20294g(safeCast, "safeCast");
        this.f23352c = safeCast;
        this.f23353d = baseKey instanceof AbstractC9943b ? ((AbstractC9943b) baseKey).f23353d : baseKey;
    }

    /* renamed from: a */
    public final boolean m20209a(InterfaceC9945d.c key) {
        AbstractC9979u.m20294g(key, "key");
        return key == this || this.f23353d == key;
    }

    /* renamed from: b */
    public final InterfaceC9945d.b m20210b(InterfaceC9945d.b element) {
        AbstractC9979u.m20294g(element, "element");
        return (InterfaceC9945d.b) this.f23352c.invoke(element);
    }
}
