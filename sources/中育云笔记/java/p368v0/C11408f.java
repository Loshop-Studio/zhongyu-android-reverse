package p368v0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: v0.f */
/* loaded from: classes3.dex */
public class C11408f {

    /* renamed from: a */
    public final List f27229a = new ArrayList();

    /* renamed from: v0.f$a */
    public static final class a {

        /* renamed from: a */
        public final Class f27230a;

        /* renamed from: b */
        public final Class f27231b;

        /* renamed from: c */
        public final InterfaceC11407e f27232c;

        public a(Class cls, Class cls2, InterfaceC11407e interfaceC11407e) {
            this.f27230a = cls;
            this.f27231b = cls2;
            this.f27232c = interfaceC11407e;
        }

        /* renamed from: a */
        public boolean m25365a(Class cls, Class cls2) {
            return this.f27230a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f27231b);
        }
    }

    /* renamed from: a */
    public synchronized InterfaceC11407e m25362a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C11409g.m25366b();
        }
        for (a aVar : this.f27229a) {
            if (aVar.m25365a(cls, cls2)) {
                return aVar.f27232c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: b */
    public synchronized List m25363b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f27229a) {
            if (aVar.m25365a(cls, cls2) && !arrayList.contains(aVar.f27231b)) {
                arrayList.add(aVar.f27231b);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized void m25364c(Class cls, Class cls2, InterfaceC11407e interfaceC11407e) {
        this.f27229a.add(new a(cls, cls2, interfaceC11407e));
    }
}
