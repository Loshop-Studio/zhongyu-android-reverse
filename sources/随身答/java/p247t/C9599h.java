package p247t;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p151k.InterfaceC8239j;
import p247t.InterfaceC9595d;

/* renamed from: t.h */
/* loaded from: classes3.dex */
public final class C9599h implements InterfaceC9601j {

    /* renamed from: c */
    public static final a f16816c = new a(null);

    /* renamed from: a */
    public final LinkedHashMap f16817a = new LinkedHashMap();

    /* renamed from: b */
    public int f16818b;

    /* renamed from: t.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: t.h$b */
    public static final class b {

        /* renamed from: a */
        public final WeakReference f16819a;

        /* renamed from: b */
        public final Map f16820b;

        /* renamed from: c */
        public final long f16821c;

        public b(WeakReference weakReference, Map map, long j9) {
            this.f16819a = weakReference;
            this.f16820b = map;
            this.f16821c = j9;
        }

        /* renamed from: a */
        public final Map m15823a() {
            return this.f16820b;
        }

        /* renamed from: b */
        public final WeakReference m15824b() {
            return this.f16819a;
        }

        /* renamed from: c */
        public final long m15825c() {
            return this.f16821c;
        }
    }

    @Override // p247t.InterfaceC9601j
    /* renamed from: a */
    public InterfaceC9595d.c mo15791a(InterfaceC9595d.b bVar) {
        ArrayList arrayList = (ArrayList) this.f16817a.get(bVar);
        InterfaceC9595d.c cVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                break;
            }
            b bVar2 = (b) arrayList.get(i9);
            InterfaceC8239j interfaceC8239j = (InterfaceC8239j) bVar2.m15824b().get();
            InterfaceC9595d.c cVar2 = interfaceC8239j != null ? new InterfaceC9595d.c(interfaceC8239j, bVar2.m15823a()) : null;
            if (cVar2 != null) {
                cVar = cVar2;
                break;
            }
            i9++;
        }
        m15822e();
        return cVar;
    }

    @Override // p247t.InterfaceC9601j
    /* renamed from: b */
    public boolean mo15792b(InterfaceC9595d.b bVar) {
        return this.f16817a.remove(bVar) != null;
    }

    @Override // p247t.InterfaceC9601j
    /* renamed from: c */
    public void mo15793c(InterfaceC9595d.b bVar, InterfaceC8239j interfaceC8239j, Map map, long j9) {
        LinkedHashMap linkedHashMap = this.f16817a;
        Object arrayList = linkedHashMap.get(bVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(bVar, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        b bVar2 = new b(new WeakReference(interfaceC8239j), map, j9);
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    break;
                }
                b bVar3 = (b) arrayList2.get(i9);
                if (j9 < bVar3.m15825c()) {
                    i9++;
                } else if (bVar3.m15824b().get() == interfaceC8239j) {
                    arrayList2.set(i9, bVar2);
                } else {
                    arrayList2.add(i9, bVar2);
                }
            }
        } else {
            arrayList2.add(bVar2);
        }
        m15822e();
    }

    @Override // p247t.InterfaceC9601j
    public void clear() {
        this.f16818b = 0;
        this.f16817a.clear();
    }

    /* renamed from: d */
    public final void m15821d() {
        WeakReference weakReferenceM15824b;
        this.f16818b = 0;
        Iterator it = this.f16817a.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                b bVar = (b) CollectionsKt.firstOrNull((List) arrayList);
                if (((bVar == null || (weakReferenceM15824b = bVar.m15824b()) == null) ? null : (InterfaceC8239j) weakReferenceM15824b.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i9 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    int i11 = i10 - i9;
                    if (((b) arrayList.get(i11)).m15824b().get() == null) {
                        arrayList.remove(i11);
                        i9++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: e */
    public final void m15822e() {
        int i9 = this.f16818b;
        this.f16818b = i9 + 1;
        if (i9 >= 10) {
            m15821d();
        }
    }
}
