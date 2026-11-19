package p308z0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p122h0.InterfaceC8085e;

/* renamed from: z0.e */
/* loaded from: classes3.dex */
public class C9985e {

    /* renamed from: a */
    public final List f17966a = new ArrayList();

    /* renamed from: b */
    public final Map f17967b = new HashMap();

    /* renamed from: z0.e$a */
    public static class a {

        /* renamed from: a */
        public final Class f17968a;

        /* renamed from: b */
        public final Class f17969b;

        /* renamed from: c */
        public final InterfaceC8085e f17970c;

        public a(Class cls, Class cls2, InterfaceC8085e interfaceC8085e) {
            this.f17968a = cls;
            this.f17969b = cls2;
            this.f17970c = interfaceC8085e;
        }

        /* renamed from: a */
        public boolean m17287a(Class cls, Class cls2) {
            return this.f17968a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f17969b);
        }
    }

    /* renamed from: a */
    public synchronized void m17282a(String str, InterfaceC8085e interfaceC8085e, Class cls, Class cls2) {
        m17284c(str).add(new a(cls, cls2, interfaceC8085e));
    }

    /* renamed from: b */
    public synchronized List m17283b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f17966a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f17967b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.m17287a(cls, cls2)) {
                        arrayList.add(aVar.f17970c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final synchronized List m17284c(String str) {
        List arrayList;
        try {
            if (!this.f17966a.contains(str)) {
                this.f17966a.add(str);
            }
            arrayList = (List) this.f17967b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f17967b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized List m17285d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f17966a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f17967b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.m17287a(cls, cls2) && !arrayList.contains(aVar.f17969b)) {
                        arrayList.add(aVar.f17969b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void m17286e(List list) {
        try {
            ArrayList arrayList = new ArrayList(this.f17966a);
            this.f17966a.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f17966a.add((String) it.next());
            }
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                String str = (String) obj;
                if (!list.contains(str)) {
                    this.f17966a.add(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
