package p080e8;

import p181n8.InterfaceC8670a;
import p181n8.InterfaceC8671b;

/* renamed from: e8.a */
/* loaded from: classes5.dex */
public abstract class AbstractC7415a {
    /* renamed from: a */
    public static Object m11910a(Object obj, Class cls) {
        if (obj instanceof InterfaceC8670a) {
            return cls.cast(obj);
        }
        if (obj instanceof InterfaceC8671b) {
            return m11910a(((InterfaceC8671b) obj).generatedComponent(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), InterfaceC8670a.class, InterfaceC8671b.class));
    }
}
