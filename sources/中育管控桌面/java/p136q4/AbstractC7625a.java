package p136q4;

import p199z4.InterfaceC7947a;
import p199z4.InterfaceC7948b;

/* renamed from: q4.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7625a {
    /* renamed from: a */
    public static Object m9065a(Object obj, Class cls) {
        if (obj instanceof InterfaceC7947a) {
            return cls.cast(obj);
        }
        if (obj instanceof InterfaceC7948b) {
            return m9065a(((InterfaceC7948b) obj).generatedComponent(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), InterfaceC7947a.class, InterfaceC7948b.class));
    }
}
