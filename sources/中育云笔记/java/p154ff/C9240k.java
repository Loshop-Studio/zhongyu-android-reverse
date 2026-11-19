package p154ff;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p122df.C9033d0;
import p122df.InterfaceC9040h;

/* renamed from: ff.k */
/* loaded from: classes6.dex */
public final class C9240k extends InterfaceC9040h.a {
    /* renamed from: a */
    public static C9240k m18163a() {
        return new C9240k();
    }

    @Override // p122df.InterfaceC9040h.a
    public InterfaceC9040h requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C9033d0 c9033d0) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return C9230a.f21466a;
        }
        return null;
    }

    @Override // p122df.InterfaceC9040h.a
    public InterfaceC9040h responseBodyConverter(Type type, Annotation[] annotationArr, C9033d0 c9033d0) {
        if (type == String.class) {
            return C9239j.f21476a;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return C9231b.f21468a;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return C9232c.f21469a;
        }
        if (type == Character.class || type == Character.TYPE) {
            return C9233d.f21470a;
        }
        if (type == Double.class || type == Double.TYPE) {
            return C9234e.f21471a;
        }
        if (type == Float.class || type == Float.TYPE) {
            return C9235f.f21472a;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return C9236g.f21473a;
        }
        if (type == Long.class || type == Long.TYPE) {
            return C9237h.f21474a;
        }
        if (type == Short.class || type == Short.TYPE) {
            return C9238i.f21475a;
        }
        return null;
    }
}
