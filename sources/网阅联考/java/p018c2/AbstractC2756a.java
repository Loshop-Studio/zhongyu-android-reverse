package p018c2;

import p079j2.InterfaceC3801a;
import p079j2.InterfaceC3802b;

/* renamed from: c2.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2756a {
    /* renamed from: a */
    public static Object m1625a(Object obj, Class cls) {
        if (obj instanceof InterfaceC3801a) {
            return cls.cast(obj);
        }
        if (obj instanceof InterfaceC3802b) {
            return m1625a(((InterfaceC3802b) obj).mo4607a(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), InterfaceC3801a.class, InterfaceC3802b.class));
    }
}
