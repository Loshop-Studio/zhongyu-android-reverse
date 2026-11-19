package p003a1;

import java.util.ArrayList;
import java.util.List;

/* renamed from: a1.f */
/* loaded from: classes3.dex */
public class C0013f {

    /* renamed from: a */
    public final List f15a = new ArrayList();

    /* renamed from: a1.f$a */
    public static final class a {

        /* renamed from: a */
        public final Class f16a;

        /* renamed from: b */
        public final Class f17b;

        /* renamed from: c */
        public final InterfaceC0012e f18c;

        public a(Class cls, Class cls2, InterfaceC0012e interfaceC0012e) {
            this.f16a = cls;
            this.f17b = cls2;
            this.f18c = interfaceC0012e;
        }

        /* renamed from: a */
        public boolean m21a(Class cls, Class cls2) {
            return this.f16a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f17b);
        }
    }

    /* renamed from: a */
    public synchronized InterfaceC0012e m18a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C0014g.m22b();
        }
        for (a aVar : this.f15a) {
            if (aVar.m21a(cls, cls2)) {
                return aVar.f18c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: b */
    public synchronized List m19b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f15a) {
            if (aVar.m21a(cls, cls2) && !arrayList.contains(aVar.f17b)) {
                arrayList.add(aVar.f17b);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized void m20c(Class cls, Class cls2, InterfaceC0012e interfaceC0012e) {
        this.f15a.add(new a(cls, cls2, interfaceC0012e));
    }
}
