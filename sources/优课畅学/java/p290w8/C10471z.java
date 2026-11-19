package p290w8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p089e8.InterfaceC8387o;
import p134i7.AbstractC8811w;
import p246s8.InterfaceC10052b;
import p289w7.AbstractC10360a;
import p300x7.InterfaceC10574p;

/* renamed from: w8.z */
/* loaded from: classes5.dex */
public final class C10471z implements InterfaceC10457v1 {

    /* renamed from: a */
    public final InterfaceC10574p f20804a;

    /* renamed from: b */
    public final ConcurrentHashMap f20805b;

    public C10471z(InterfaceC10574p compute) {
        AbstractC9133u.m16133g(compute, "compute");
        this.f20804a = compute;
        this.f20805b = new ConcurrentHashMap();
    }

    @Override // p290w8.InterfaceC10457v1
    /* renamed from: a */
    public Object mo19528a(InterfaceC8375c key, List types) {
        Object objM15909b;
        Object objPutIfAbsent;
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(types, "types");
        ConcurrentHashMap concurrentHashMap = this.f20805b;
        Class clsM19298a = AbstractC10360a.m19298a(key);
        Object c10453u1 = concurrentHashMap.get(clsM19298a);
        if (c10453u1 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsM19298a, (c10453u1 = new C10453u1()))) != null) {
            c10453u1 = objPutIfAbsent;
        }
        C10453u1 c10453u12 = (C10453u1) c10453u1;
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(types, 10));
        Iterator it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(new C10456v0((InterfaceC8387o) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = c10453u12.f20785a;
        Object obj = concurrentHashMap2.get(arrayList);
        if (obj == null) {
            try {
                Result.C9076a c9076a = Result.f17350b;
                objM15909b = Result.m15909b((InterfaceC10052b) this.f20804a.invoke(key, types));
            } catch (Throwable th) {
                Result.C9076a c9076a2 = Result.f17350b;
                objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
            }
            Result resultM15908a = Result.m15908a(objM15909b);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList, resultM15908a);
            obj = objPutIfAbsent2 == null ? resultM15908a : objPutIfAbsent2;
        }
        AbstractC9133u.m16132f(obj, "getOrPut(...)");
        return ((Result) obj).m15916j();
    }
}
