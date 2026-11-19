package p215p7;

import p305y7.InterfaceC9965a;
import p305y7.InterfaceC9966b;

/* renamed from: p7.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9337a {
    /* renamed from: a */
    public static Object m15247a(Object obj, Class cls) {
        if (obj instanceof InterfaceC9965a) {
            return cls.cast(obj);
        }
        if (obj instanceof InterfaceC9966b) {
            return m15247a(((InterfaceC9966b) obj).generatedComponent(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), InterfaceC9965a.class, InterfaceC9966b.class));
    }
}
