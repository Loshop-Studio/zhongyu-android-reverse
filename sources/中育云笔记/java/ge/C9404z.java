package ge;

import gd.AbstractC9293a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p181hd.InterfaceC9544p;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10481o;
import p325rc.AbstractC10980x;

/* renamed from: ge.z */
/* loaded from: classes6.dex */
public final class C9404z implements InterfaceC9390v1 {

    /* renamed from: a */
    public final InterfaceC9544p f21831a;

    /* renamed from: b */
    public final ConcurrentHashMap f21832b;

    public C9404z(InterfaceC9544p compute) {
        AbstractC9979u.m20294g(compute, "compute");
        this.f21831a = compute;
        this.f21832b = new ConcurrentHashMap();
    }

    @Override // ge.InterfaceC9390v1
    /* renamed from: a */
    public Object mo18554a(InterfaceC10469c key, List types) {
        Object objM20054c;
        Object objPutIfAbsent;
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(types, "types");
        ConcurrentHashMap concurrentHashMap = this.f21832b;
        Class clsM18324a = AbstractC9293a.m18324a(key);
        Object c9386u1 = concurrentHashMap.get(clsM18324a);
        if (c9386u1 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsM18324a, (c9386u1 = new C9386u1()))) != null) {
            c9386u1 = objPutIfAbsent;
        }
        C9386u1 c9386u12 = (C9386u1) c9386u1;
        List list = types;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C9389v0((InterfaceC10481o) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = c9386u12.f21812a;
        Object obj = concurrentHashMap2.get(arrayList);
        if (obj == null) {
            try {
                Result.C9921a c9921a = Result.f23263d;
                objM20054c = Result.m20054c((InterfaceC5432b) this.f21831a.invoke(key, types));
            } catch (Throwable th) {
                Result.C9921a c9921a2 = Result.f23263d;
                objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
            }
            Result resultM20053a = Result.m20053a(objM20054c);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList, resultM20053a);
            obj = objPutIfAbsent2 == null ? resultM20053a : objPutIfAbsent2;
        }
        AbstractC9979u.m20293f(obj, "getOrPut(...)");
        return ((Result) obj).m20061n();
    }
}
