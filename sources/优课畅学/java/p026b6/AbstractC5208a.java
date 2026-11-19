package p026b6;

import p155k6.InterfaceC9059a;
import p155k6.InterfaceC9060b;

/* renamed from: b6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC5208a {
    /* renamed from: a */
    public static Object m2103a(Object obj, Class cls) {
        if (obj instanceof InterfaceC9059a) {
            return cls.cast(obj);
        }
        if (obj instanceof InterfaceC9060b) {
            return m2103a(((InterfaceC9060b) obj).generatedComponent(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), InterfaceC9059a.class, InterfaceC9060b.class));
    }
}
