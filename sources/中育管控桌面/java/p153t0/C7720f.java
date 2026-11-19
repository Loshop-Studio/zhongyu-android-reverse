package p153t0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: t0.f */
/* loaded from: classes3.dex */
public class C7720f {

    /* renamed from: a */
    public final List f10200a = new ArrayList();

    /* renamed from: t0.f$a */
    public static final class a {

        /* renamed from: a */
        public final Class f10201a;

        /* renamed from: b */
        public final Class f10202b;

        /* renamed from: c */
        public final InterfaceC7719e f10203c;

        public a(Class cls, Class cls2, InterfaceC7719e interfaceC7719e) {
            this.f10201a = cls;
            this.f10202b = cls2;
            this.f10203c = interfaceC7719e;
        }

        /* renamed from: a */
        public boolean m9207a(Class cls, Class cls2) {
            return this.f10201a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f10202b);
        }
    }

    /* renamed from: a */
    public synchronized InterfaceC7719e m9204a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C7721g.m9208b();
        }
        for (a aVar : this.f10200a) {
            if (aVar.m9207a(cls, cls2)) {
                return aVar.f10203c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: b */
    public synchronized List m9205b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f10200a) {
            if (aVar.m9207a(cls, cls2) && !arrayList.contains(aVar.f10202b)) {
                arrayList.add(aVar.f10202b);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized void m9206c(Class cls, Class cls2, InterfaceC7719e interfaceC7719e) {
        this.f10200a.add(new a(cls, cls2, interfaceC7719e));
    }
}
