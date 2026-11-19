package p392wb;

import p151fc.InterfaceC9218a;
import p151fc.InterfaceC9219b;

/* renamed from: wb.a */
/* loaded from: classes6.dex */
public abstract class AbstractC11724a {
    /* renamed from: a */
    public static Object m25951a(Object obj, Class cls) {
        if (obj instanceof InterfaceC9218a) {
            return cls.cast(obj);
        }
        if (obj instanceof InterfaceC9219b) {
            return m25951a(((InterfaceC9219b) obj).generatedComponent(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), InterfaceC9218a.class, InterfaceC9219b.class));
    }
}
