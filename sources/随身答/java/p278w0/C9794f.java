package p278w0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: w0.f */
/* loaded from: classes3.dex */
public class C9794f {

    /* renamed from: a */
    public final List f17419a = new ArrayList();

    /* renamed from: w0.f$a */
    public static final class a {

        /* renamed from: a */
        public final Class f17420a;

        /* renamed from: b */
        public final Class f17421b;

        /* renamed from: c */
        public final InterfaceC9793e f17422c;

        public a(Class cls, Class cls2, InterfaceC9793e interfaceC9793e) {
            this.f17420a = cls;
            this.f17421b = cls2;
            this.f17422c = interfaceC9793e;
        }

        /* renamed from: a */
        public boolean m16598a(Class cls, Class cls2) {
            return this.f17420a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f17421b);
        }
    }

    /* renamed from: a */
    public synchronized InterfaceC9793e m16595a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C9795g.m16599b();
        }
        for (a aVar : this.f17419a) {
            if (aVar.m16598a(cls, cls2)) {
                return aVar.f17422c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: b */
    public synchronized List m16596b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f17419a.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).m16598a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized void m16597c(Class cls, Class cls2, InterfaceC9793e interfaceC9793e) {
        this.f17419a.add(new a(cls, cls2, interfaceC9793e));
    }
}
