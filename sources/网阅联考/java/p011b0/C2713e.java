package p011b0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p076j.InterfaceC3795e;

/* renamed from: b0.e */
/* loaded from: classes2.dex */
public class C2713e {

    /* renamed from: a */
    public final List f453a = new ArrayList();

    /* renamed from: b */
    public final Map f454b = new HashMap();

    /* renamed from: b0.e$a */
    public static class a {

        /* renamed from: a */
        public final Class f455a;

        /* renamed from: b */
        public final Class f456b;

        /* renamed from: c */
        public final InterfaceC3795e f457c;

        public a(Class cls, Class cls2, InterfaceC3795e interfaceC3795e) {
            this.f455a = cls;
            this.f456b = cls2;
            this.f457c = interfaceC3795e;
        }

        /* renamed from: a */
        public boolean m1500a(Class cls, Class cls2) {
            return this.f455a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f456b);
        }
    }

    /* renamed from: a */
    public synchronized void m1495a(String str, InterfaceC3795e interfaceC3795e, Class cls, Class cls2) {
        m1497c(str).add(new a(cls, cls2, interfaceC3795e));
    }

    /* renamed from: b */
    public synchronized List m1496b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f453a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f454b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.m1500a(cls, cls2)) {
                        arrayList.add(aVar.f457c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final synchronized List m1497c(String str) {
        List arrayList;
        if (!this.f453a.contains(str)) {
            this.f453a.add(str);
        }
        arrayList = (List) this.f454b.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f454b.put(str, arrayList);
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized List m1498d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f453a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f454b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.m1500a(cls, cls2) && !arrayList.contains(aVar.f456b)) {
                        arrayList.add(aVar.f456b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void m1499e(List list) {
        ArrayList<String> arrayList = new ArrayList(this.f453a);
        this.f453a.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f453a.add((String) it.next());
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f453a.add(str);
            }
        }
    }
}
