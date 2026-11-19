package p314z;

import java.util.ArrayList;
import java.util.List;

/* renamed from: z.f */
/* loaded from: classes3.dex */
public class C10689f {

    /* renamed from: a */
    public final List f21219a = new ArrayList();

    /* renamed from: z.f$a */
    public static final class a {

        /* renamed from: a */
        public final Class f21220a;

        /* renamed from: b */
        public final Class f21221b;

        /* renamed from: c */
        public final InterfaceC10688e f21222c;

        public a(Class cls, Class cls2, InterfaceC10688e interfaceC10688e) {
            this.f21220a = cls;
            this.f21221b = cls2;
            this.f21222c = interfaceC10688e;
        }

        /* renamed from: a */
        public boolean m19984a(Class cls, Class cls2) {
            return this.f21220a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f21221b);
        }
    }

    /* renamed from: a */
    public synchronized InterfaceC10688e m19981a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C10690g.m19985b();
        }
        for (a aVar : this.f21219a) {
            if (aVar.m19984a(cls, cls2)) {
                return aVar.f21222c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: b */
    public synchronized List m19982b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f21219a) {
            if (aVar.m19984a(cls, cls2) && !arrayList.contains(aVar.f21221b)) {
                arrayList.add(aVar.f21221b);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized void m19983c(Class cls, Class cls2, InterfaceC10688e interfaceC10688e) {
        this.f21219a.add(new a(cls, cls2, interfaceC10688e));
    }
}
