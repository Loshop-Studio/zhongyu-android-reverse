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
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10481o;
import p325rc.AbstractC10980x;

/* renamed from: ge.u */
/* loaded from: classes6.dex */
public final class C9384u implements InterfaceC9390v1 {

    /* renamed from: a */
    public final InterfaceC9544p f21808a;

    /* renamed from: b */
    public final C9388v f21809b;

    /* renamed from: ge.u$a */
    public static final class a implements InterfaceC9529a {
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return new C9386u1();
        }
    }

    public C9384u(InterfaceC9544p compute) {
        AbstractC9979u.m20294g(compute, "compute");
        this.f21808a = compute;
        this.f21809b = new C9388v();
    }

    @Override // ge.InterfaceC9390v1
    /* renamed from: a */
    public Object mo18554a(InterfaceC10469c key, List types) {
        Object objM20054c;
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(types, "types");
        Object obj = this.f21809b.get(AbstractC9293a.m18324a(key));
        AbstractC9979u.m20293f(obj, "get(...)");
        C9341j1 c9341j1 = (C9341j1) obj;
        Object objM18469a = c9341j1.f21748a.get();
        if (objM18469a == null) {
            objM18469a = c9341j1.m18469a(new a());
        }
        C9386u1 c9386u1 = (C9386u1) objM18469a;
        List list = types;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C9389v0((InterfaceC10481o) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = c9386u1.f21812a;
        Object obj2 = concurrentHashMap.get(arrayList);
        if (obj2 == null) {
            try {
                Result.C9921a c9921a = Result.f23263d;
                objM20054c = Result.m20054c((InterfaceC5432b) this.f21808a.invoke(key, types));
            } catch (Throwable th) {
                Result.C9921a c9921a2 = Result.f23263d;
                objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
            }
            Result resultM20053a = Result.m20053a(objM20054c);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, resultM20053a);
            obj2 = objPutIfAbsent == null ? resultM20053a : objPutIfAbsent;
        }
        AbstractC9979u.m20293f(obj2, "getOrPut(...)");
        return ((Result) obj2).m20061n();
    }
}
