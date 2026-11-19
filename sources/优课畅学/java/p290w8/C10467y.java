package p290w8;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p246s8.InterfaceC10052b;
import p289w7.AbstractC10360a;
import p300x7.InterfaceC10570l;

/* renamed from: w8.y */
/* loaded from: classes5.dex */
public final class C10467y implements InterfaceC10430o2 {

    /* renamed from: a */
    public final InterfaceC10570l f20799a;

    /* renamed from: b */
    public final ConcurrentHashMap f20800b;

    public C10467y(InterfaceC10570l compute) {
        AbstractC9133u.m16133g(compute, "compute");
        this.f20799a = compute;
        this.f20800b = new ConcurrentHashMap();
    }

    @Override // p290w8.InterfaceC10430o2
    /* renamed from: a */
    public InterfaceC10052b mo19482a(InterfaceC8375c key) {
        Object objPutIfAbsent;
        AbstractC9133u.m16133g(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f20800b;
        Class clsM19298a = AbstractC10360a.m19298a(key);
        Object c10419m = concurrentHashMap.get(clsM19298a);
        if (c10419m == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsM19298a, (c10419m = new C10419m((InterfaceC10052b) this.f20799a.invoke(key))))) != null) {
            c10419m = objPutIfAbsent;
        }
        return ((C10419m) c10419m).f20736a;
    }
}
