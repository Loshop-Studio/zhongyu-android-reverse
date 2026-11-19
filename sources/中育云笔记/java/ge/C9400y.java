package ge;

import gd.AbstractC9293a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10469c;

/* renamed from: ge.y */
/* loaded from: classes6.dex */
public final class C9400y implements InterfaceC9363o2 {

    /* renamed from: a */
    public final InterfaceC9540l f21826a;

    /* renamed from: b */
    public final ConcurrentHashMap f21827b;

    public C9400y(InterfaceC9540l compute) {
        AbstractC9979u.m20294g(compute, "compute");
        this.f21826a = compute;
        this.f21827b = new ConcurrentHashMap();
    }

    @Override // ge.InterfaceC9363o2
    /* renamed from: a */
    public InterfaceC5432b mo18508a(InterfaceC10469c key) {
        Object objPutIfAbsent;
        AbstractC9979u.m20294g(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f21827b;
        Class clsM18324a = AbstractC9293a.m18324a(key);
        Object c9352m = concurrentHashMap.get(clsM18324a);
        if (c9352m == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsM18324a, (c9352m = new C9352m((InterfaceC5432b) this.f21826a.invoke(key))))) != null) {
            c9352m = objPutIfAbsent;
        }
        return ((C9352m) c9352m).f21763a;
    }
}
