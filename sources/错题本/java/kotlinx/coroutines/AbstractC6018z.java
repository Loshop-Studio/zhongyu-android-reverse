package kotlinx.coroutines;

import p046d7.C5447d;
import p054e7.AbstractC5479k;
import p054e7.AbstractC5487s;
import p068g7.C5609e;

/* renamed from: kotlinx.coroutines.z */
/* loaded from: classes4.dex */
public abstract class AbstractC6018z {

    /* renamed from: a */
    public static final InterfaceC5870c0 f9531a;

    static {
        String property;
        InterfaceC5870c0 interfaceC5870c0;
        int i = AbstractC5487s.f8482a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C5609e c5609e = AbstractC5896f0.f9343a;
            C5447d c5447d = AbstractC5479k.f8471a;
            C5447d c5447d2 = c5447d.f8411d;
            interfaceC5870c0 = c5447d;
            if (c5447d == null) {
                interfaceC5870c0 = RunnableC6016y.f9528h;
            }
        } else {
            interfaceC5870c0 = RunnableC6016y.f9528h;
        }
        f9531a = interfaceC5870c0;
    }
}
