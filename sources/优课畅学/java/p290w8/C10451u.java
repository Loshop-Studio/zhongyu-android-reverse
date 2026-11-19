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
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

/* renamed from: w8.u */
/* loaded from: classes5.dex */
public final class C10451u implements InterfaceC10457v1 {

    /* renamed from: a */
    public final InterfaceC10574p f20781a;

    /* renamed from: b */
    public final C10455v f20782b;

    /* renamed from: w8.u$a */
    public static final class a implements InterfaceC10559a {
        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            return new C10453u1();
        }
    }

    public C10451u(InterfaceC10574p compute) {
        AbstractC9133u.m16133g(compute, "compute");
        this.f20781a = compute;
        this.f20782b = new C10455v();
    }

    @Override // p290w8.InterfaceC10457v1
    /* renamed from: a */
    public Object mo19528a(InterfaceC8375c key, List types) {
        Object objM15909b;
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(types, "types");
        Object obj = this.f20782b.get(AbstractC10360a.m19298a(key));
        AbstractC9133u.m16132f(obj, "get(...)");
        C10408j1 c10408j1 = (C10408j1) obj;
        Object objM19443a = c10408j1.f20721a.get();
        if (objM19443a == null) {
            objM19443a = c10408j1.m19443a(new a());
        }
        C10453u1 c10453u1 = (C10453u1) objM19443a;
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(types, 10));
        Iterator it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(new C10456v0((InterfaceC8387o) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = c10453u1.f20785a;
        Object obj2 = concurrentHashMap.get(arrayList);
        if (obj2 == null) {
            try {
                Result.C9076a c9076a = Result.f17350b;
                objM15909b = Result.m15909b((InterfaceC10052b) this.f20781a.invoke(key, types));
            } catch (Throwable th) {
                Result.C9076a c9076a2 = Result.f17350b;
                objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
            }
            Result resultM15908a = Result.m15908a(objM15909b);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, resultM15908a);
            obj2 = objPutIfAbsent == null ? resultM15908a : objPutIfAbsent;
        }
        AbstractC9133u.m16132f(obj2, "getOrPut(...)");
        return ((Result) obj2).m15916j();
    }
}
