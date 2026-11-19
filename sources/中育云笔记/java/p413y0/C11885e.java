package p413y0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p168h0.InterfaceC9439f;

/* renamed from: y0.e */
/* loaded from: classes3.dex */
public class C11885e {

    /* renamed from: a */
    public final List f28195a = new ArrayList();

    /* renamed from: b */
    public final Map f28196b = new HashMap();

    /* renamed from: y0.e$a */
    public static class a {

        /* renamed from: a */
        public final Class f28197a;

        /* renamed from: b */
        public final Class f28198b;

        /* renamed from: c */
        public final InterfaceC9439f f28199c;

        public a(Class cls, Class cls2, InterfaceC9439f interfaceC9439f) {
            this.f28197a = cls;
            this.f28198b = cls2;
            this.f28199c = interfaceC9439f;
        }

        /* renamed from: a */
        public boolean m26433a(Class cls, Class cls2) {
            return this.f28197a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f28198b);
        }
    }

    /* renamed from: a */
    public synchronized void m26428a(String str, InterfaceC9439f interfaceC9439f, Class cls, Class cls2) {
        m26430c(str).add(new a(cls, cls2, interfaceC9439f));
    }

    /* renamed from: b */
    public synchronized List m26429b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f28195a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f28196b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.m26433a(cls, cls2)) {
                        arrayList.add(aVar.f28199c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final synchronized List m26430c(String str) {
        List arrayList;
        try {
            if (!this.f28195a.contains(str)) {
                this.f28195a.add(str);
            }
            arrayList = (List) this.f28196b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f28196b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized List m26431d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f28195a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f28196b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.m26433a(cls, cls2) && !arrayList.contains(aVar.f28198b)) {
                        arrayList.add(aVar.f28198b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void m26432e(List list) {
        try {
            ArrayList arrayList = new ArrayList(this.f28195a);
            this.f28195a.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f28195a.add((String) it.next());
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                String str = (String) obj;
                if (!list.contains(str)) {
                    this.f28195a.add(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
