package p099e9;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p038c9.C5299y;
import p038c9.InterfaceC5280f;

/* renamed from: e9.k */
/* loaded from: classes5.dex */
public final class C7903k extends InterfaceC5280f.a {
    /* renamed from: f */
    public static C7903k m12378f() {
        return new C7903k();
    }

    @Override // p038c9.InterfaceC5280f.a
    /* renamed from: c */
    public InterfaceC5280f mo2414c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C5299y c5299y) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return C7893a.f13270a;
        }
        return null;
    }

    @Override // p038c9.InterfaceC5280f.a
    /* renamed from: d */
    public InterfaceC5280f mo2415d(Type type, Annotation[] annotationArr, C5299y c5299y) {
        if (type == String.class) {
            return C7902j.f13280a;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return C7894b.f13272a;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return C7895c.f13273a;
        }
        if (type == Character.class || type == Character.TYPE) {
            return C7896d.f13274a;
        }
        if (type == Double.class || type == Double.TYPE) {
            return C7897e.f13275a;
        }
        if (type == Float.class || type == Float.TYPE) {
            return C7898f.f13276a;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return C7899g.f13277a;
        }
        if (type == Long.class || type == Long.TYPE) {
            return C7900h.f13278a;
        }
        if (type == Short.class || type == Short.TYPE) {
            return C7901i.f13279a;
        }
        return null;
    }
}
