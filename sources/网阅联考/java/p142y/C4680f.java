package p142y;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: y.f */
/* loaded from: classes2.dex */
public class C4680f {

    /* renamed from: a */
    public final List f5994a = new ArrayList();

    /* renamed from: y.f$a */
    public static final class a {

        /* renamed from: a */
        public final Class f5995a;

        /* renamed from: b */
        public final Class f5996b;

        /* renamed from: c */
        public final InterfaceC4679e f5997c;

        public a(Class cls, Class cls2, InterfaceC4679e interfaceC4679e) {
            this.f5995a = cls;
            this.f5996b = cls2;
            this.f5997c = interfaceC4679e;
        }

        /* renamed from: a */
        public boolean m6610a(Class cls, Class cls2) {
            return this.f5995a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f5996b);
        }
    }

    /* renamed from: a */
    public synchronized InterfaceC4679e m6607a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C4681g.m6611b();
        }
        for (a aVar : this.f5994a) {
            if (aVar.m6610a(cls, cls2)) {
                return aVar.f5997c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: b */
    public synchronized List m6608b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f5994a.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).m6610a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized void m6609c(Class cls, Class cls2, InterfaceC4679e interfaceC4679e) {
        this.f5994a.add(new a(cls, cls2, interfaceC4679e));
    }
}
