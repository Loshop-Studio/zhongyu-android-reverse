package p152t;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p087k.InterfaceC6611j;
import p152t.InterfaceC7708d;

/* renamed from: t.h */
/* loaded from: classes3.dex */
public final class C7712h implements InterfaceC7714j {

    /* renamed from: c */
    public static final a f10188c = new a(null);

    /* renamed from: a */
    public final LinkedHashMap f10189a = new LinkedHashMap();

    /* renamed from: b */
    public int f10190b;

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
        public final WeakReference f10191a;

        /* renamed from: b */
        public final Map f10192b;

        /* renamed from: c */
        public final long f10193c;

        public b(WeakReference weakReference, Map map, long j6) {
            this.f10191a = weakReference;
            this.f10192b = map;
            this.f10193c = j6;
        }

        /* renamed from: a */
        public final Map m9200a() {
            return this.f10192b;
        }

        /* renamed from: b */
        public final WeakReference m9201b() {
            return this.f10191a;
        }

        /* renamed from: c */
        public final long m9202c() {
            return this.f10193c;
        }
    }

    @Override // p152t.InterfaceC7714j
    /* renamed from: a */
    public InterfaceC7708d.c mo9166a(InterfaceC7708d.b bVar) {
        ArrayList arrayList = (ArrayList) this.f10189a.get(bVar);
        InterfaceC7708d.c cVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                break;
            }
            b bVar2 = (b) arrayList.get(i6);
            InterfaceC6611j interfaceC6611j = (InterfaceC6611j) bVar2.m9201b().get();
            InterfaceC7708d.c cVar2 = interfaceC6611j != null ? new InterfaceC7708d.c(interfaceC6611j, bVar2.m9200a()) : null;
            if (cVar2 != null) {
                cVar = cVar2;
                break;
            }
            i6++;
        }
        m9199d();
        return cVar;
    }

    /* renamed from: b */
    public final void m9198b() {
        WeakReference weakReferenceM9201b;
        this.f10190b = 0;
        Iterator it = this.f10189a.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                b bVar = (b) CollectionsKt.firstOrNull((List) arrayList);
                if (((bVar == null || (weakReferenceM9201b = bVar.m9201b()) == null) ? null : (InterfaceC6611j) weakReferenceM9201b.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i6 = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    int i8 = i7 - i6;
                    if (((b) arrayList.get(i8)).m9201b().get() == null) {
                        arrayList.remove(i8);
                        i6++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    @Override // p152t.InterfaceC7714j
    /* renamed from: c */
    public boolean mo9167c(InterfaceC7708d.b bVar) {
        return this.f10189a.remove(bVar) != null;
    }

    @Override // p152t.InterfaceC7714j
    public void clear() {
        this.f10190b = 0;
        this.f10189a.clear();
    }

    /* renamed from: d */
    public final void m9199d() {
        int i6 = this.f10190b;
        this.f10190b = i6 + 1;
        if (i6 >= 10) {
            m9198b();
        }
    }

    @Override // p152t.InterfaceC7714j
    /* renamed from: e */
    public void mo9168e(InterfaceC7708d.b bVar, InterfaceC6611j interfaceC6611j, Map map, long j6) {
        LinkedHashMap linkedHashMap = this.f10189a;
        Object arrayList = linkedHashMap.get(bVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(bVar, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        b bVar2 = new b(new WeakReference(interfaceC6611j), map, j6);
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    break;
                }
                b bVar3 = (b) arrayList2.get(i6);
                if (j6 < bVar3.m9202c()) {
                    i6++;
                } else if (bVar3.m9201b().get() == interfaceC6611j) {
                    arrayList2.set(i6, bVar2);
                } else {
                    arrayList2.add(i6, bVar2);
                }
            }
        } else {
            arrayList2.add(bVar2);
        }
        m9199d();
    }
}
