package p312r;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9972n;
import p212k.InterfaceC9756j;
import p312r.InterfaceC10825d;
import p325rc.AbstractC10947g0;

/* renamed from: r.h */
/* loaded from: classes3.dex */
public final class C10829h implements InterfaceC10831j {

    /* renamed from: c */
    public static final a f26137c = new a(null);

    /* renamed from: a */
    public final LinkedHashMap f26138a = new LinkedHashMap();

    /* renamed from: b */
    public int f26139b;

    /* renamed from: r.h$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: r.h$b */
    public static final class b {

        /* renamed from: a */
        public final WeakReference f26140a;

        /* renamed from: b */
        public final Map f26141b;

        /* renamed from: c */
        public final long f26142c;

        public b(WeakReference weakReference, Map map, long j10) {
            this.f26140a = weakReference;
            this.f26141b = map;
            this.f26142c = j10;
        }

        /* renamed from: a */
        public final Map m23314a() {
            return this.f26141b;
        }

        /* renamed from: b */
        public final WeakReference m23315b() {
            return this.f26140a;
        }

        /* renamed from: c */
        public final long m23316c() {
            return this.f26142c;
        }
    }

    @Override // p312r.InterfaceC10831j
    /* renamed from: a */
    public InterfaceC10825d.c mo23280a(InterfaceC10825d.b bVar) {
        ArrayList arrayList = (ArrayList) this.f26138a.get(bVar);
        InterfaceC10825d.c cVar = null;
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
            InterfaceC9756j interfaceC9756j = (InterfaceC9756j) bVar2.m23315b().get();
            InterfaceC10825d.c cVar2 = interfaceC9756j != null ? new InterfaceC10825d.c(interfaceC9756j, bVar2.m23314a()) : null;
            if (cVar2 != null) {
                cVar = cVar2;
                break;
            }
            i10++;
        }
        m23313c();
        return cVar;
    }

    /* renamed from: b */
    public final void m23312b() {
        WeakReference weakReferenceM23315b;
        this.f26139b = 0;
        Iterator it = this.f26138a.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                b bVar = (b) AbstractC10947g0.m23946o0(arrayList);
                if (((bVar == null || (weakReferenceM23315b = bVar.m23315b()) == null) ? null : (InterfaceC9756j) weakReferenceM23315b.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = i11 - i10;
                    if (((b) arrayList.get(i12)).m23315b().get() == null) {
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

    /* renamed from: c */
    public final void m23313c() {
        int i10 = this.f26139b;
        this.f26139b = i10 + 1;
        if (i10 >= 10) {
            m23312b();
        }
    }

    @Override // p312r.InterfaceC10831j
    public void clear() {
        this.f26139b = 0;
        this.f26138a.clear();
    }

    @Override // p312r.InterfaceC10831j
    /* renamed from: d */
    public void mo23281d(InterfaceC10825d.b bVar, InterfaceC9756j interfaceC9756j, Map map, long j10) {
        LinkedHashMap linkedHashMap = this.f26138a;
        Object arrayList = linkedHashMap.get(bVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(bVar, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        b bVar2 = new b(new WeakReference(interfaceC9756j), map, j10);
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                b bVar3 = (b) arrayList2.get(i10);
                if (j10 < bVar3.m23316c()) {
                    i10++;
                } else if (bVar3.m23315b().get() == interfaceC9756j) {
                    arrayList2.set(i10, bVar2);
                } else {
                    arrayList2.add(i10, bVar2);
                }
            }
        } else {
            arrayList2.add(bVar2);
        }
        m23313c();
    }

    @Override // p312r.InterfaceC10831j
    /* renamed from: f */
    public boolean mo23282f(InterfaceC10825d.b bVar) {
        return this.f26138a.remove(bVar) != null;
    }
}
