package p238t;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p137k.InterfaceC7838j;
import p238t.InterfaceC9363d;

/* renamed from: t.h */
/* loaded from: classes3.dex */
public final class C9367h implements InterfaceC9369j {

    /* renamed from: c */
    public static final a f16250c = new a(null);

    /* renamed from: a */
    public final LinkedHashMap f16251a = new LinkedHashMap();

    /* renamed from: b */
    public int f16252b;

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
        public final WeakReference f16253a;

        /* renamed from: b */
        public final Map f16254b;

        /* renamed from: c */
        public final long f16255c;

        public b(WeakReference weakReference, Map map, long j10) {
            this.f16253a = weakReference;
            this.f16254b = map;
            this.f16255c = j10;
        }

        /* renamed from: a */
        public final Map m15651a() {
            return this.f16254b;
        }

        /* renamed from: b */
        public final WeakReference m15652b() {
            return this.f16253a;
        }

        /* renamed from: c */
        public final long m15653c() {
            return this.f16255c;
        }
    }

    @Override // p238t.InterfaceC9369j
    /* renamed from: a */
    public InterfaceC9363d.c mo15617a(InterfaceC9363d.b bVar) {
        ArrayList arrayList = (ArrayList) this.f16251a.get(bVar);
        InterfaceC9363d.c cVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            b bVar2 = (b) arrayList.get(i10);
            InterfaceC7838j interfaceC7838j = (InterfaceC7838j) bVar2.m15652b().get();
            InterfaceC9363d.c cVar2 = interfaceC7838j != null ? new InterfaceC9363d.c(interfaceC7838j, bVar2.m15651a()) : null;
            if (cVar2 != null) {
                cVar = cVar2;
                break;
            }
            i10++;
        }
        m15650d();
        return cVar;
    }

    /* renamed from: b */
    public final void m15649b() {
        WeakReference weakReferenceM15652b;
        this.f16252b = 0;
        Iterator it = this.f16251a.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                b bVar = (b) CollectionsKt.firstOrNull((List) arrayList);
                if (((bVar == null || (weakReferenceM15652b = bVar.m15652b()) == null) ? null : (InterfaceC7838j) weakReferenceM15652b.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = i11 - i10;
                    if (((b) arrayList.get(i12)).m15652b().get() == null) {
                        arrayList.remove(i12);
                        i10++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    @Override // p238t.InterfaceC9369j
    /* renamed from: c */
    public boolean mo15618c(InterfaceC9363d.b bVar) {
        return this.f16251a.remove(bVar) != null;
    }

    @Override // p238t.InterfaceC9369j
    public void clear() {
        this.f16252b = 0;
        this.f16251a.clear();
    }

    /* renamed from: d */
    public final void m15650d() {
        int i10 = this.f16252b;
        this.f16252b = i10 + 1;
        if (i10 >= 10) {
            m15649b();
        }
    }

    @Override // p238t.InterfaceC9369j
    /* renamed from: e */
    public void mo15619e(InterfaceC9363d.b bVar, InterfaceC7838j interfaceC7838j, Map map, long j10) {
        LinkedHashMap linkedHashMap = this.f16251a;
        Object arrayList = linkedHashMap.get(bVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(bVar, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        b bVar2 = new b(new WeakReference(interfaceC7838j), map, j10);
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                b bVar3 = (b) arrayList2.get(i10);
                if (j10 < bVar3.m15653c()) {
                    i10++;
                } else if (bVar3.m15652b().get() == interfaceC7838j) {
                    arrayList2.set(i10, bVar2);
                } else {
                    arrayList2.add(i10, bVar2);
                }
            }
        } else {
            arrayList2.add(bVar2);
        }
        m15650d();
    }
}
