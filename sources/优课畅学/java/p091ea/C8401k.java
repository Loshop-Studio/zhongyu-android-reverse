package p091ea;

import ca.C5283d0;
import ca.InterfaceC5290h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: ea.k */
/* loaded from: classes5.dex */
public final class C8401k extends InterfaceC5290h.a {
    /* renamed from: f */
    public static C8401k m13696f() {
        return new C8401k();
    }

    @Override // ca.InterfaceC5290h.a
    /* renamed from: c */
    public InterfaceC5290h mo2219c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C5283d0 c5283d0) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return C8391a.f15914a;
        }
        return null;
    }

    @Override // ca.InterfaceC5290h.a
    /* renamed from: d */
    public InterfaceC5290h mo2220d(Type type, Annotation[] annotationArr, C5283d0 c5283d0) {
        if (type == String.class) {
            return C8400j.f15924a;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return C8392b.f15916a;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return C8393c.f15917a;
        }
        if (type == Character.class || type == Character.TYPE) {
            return C8394d.f15918a;
        }
        if (type == Double.class || type == Double.TYPE) {
            return C8395e.f15919a;
        }
        if (type == Float.class || type == Float.TYPE) {
            return C8396f.f15920a;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return C8397g.f15921a;
        }
        if (type == Long.class || type == Long.TYPE) {
            return C8398h.f15922a;
        }
        if (type == Short.class || type == Short.TYPE) {
            return C8399i.f15923a;
        }
        return null;
    }
}
