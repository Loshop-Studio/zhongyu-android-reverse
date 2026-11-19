package p248t9;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p226r9.C9059d0;
import p226r9.InterfaceC9066h;

/* renamed from: t9.k */
/* loaded from: classes5.dex */
public final class C9514k extends InterfaceC9066h.a {
    /* renamed from: f */
    public static C9514k m15876f() {
        return new C9514k();
    }

    @Override // p226r9.InterfaceC9066h.a
    /* renamed from: c */
    public InterfaceC9066h mo15218c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C9059d0 c9059d0) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return C9504a.f16603a;
        }
        return null;
    }

    @Override // p226r9.InterfaceC9066h.a
    /* renamed from: d */
    public InterfaceC9066h mo15219d(Type type, Annotation[] annotationArr, C9059d0 c9059d0) {
        if (type == String.class) {
            return C9513j.f16613a;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return C9505b.f16605a;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return C9506c.f16606a;
        }
        if (type == Character.class || type == Character.TYPE) {
            return C9507d.f16607a;
        }
        if (type == Double.class || type == Double.TYPE) {
            return C9508e.f16608a;
        }
        if (type == Float.class || type == Float.TYPE) {
            return C9509f.f16609a;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return C9510g.f16610a;
        }
        if (type == Long.class || type == Long.TYPE) {
            return C9511h.f16611a;
        }
        if (type == Short.class || type == Short.TYPE) {
            return C9512i.f16612a;
        }
        return null;
    }
}
