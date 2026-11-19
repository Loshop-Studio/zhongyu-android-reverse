package p092l3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p080j3.C3814e0;
import p080j3.InterfaceC3821i;

/* renamed from: l3.k */
/* loaded from: classes2.dex */
public final class C4351k extends InterfaceC3821i.a {
    /* renamed from: f */
    public static C4351k m5362f() {
        return new C4351k();
    }

    @Override // p080j3.InterfaceC3821i.a
    /* renamed from: c */
    public InterfaceC3821i mo4965c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C3814e0 c3814e0) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return C4341a.f4849a;
        }
        return null;
    }

    @Override // p080j3.InterfaceC3821i.a
    /* renamed from: d */
    public InterfaceC3821i mo4966d(Type type, Annotation[] annotationArr, C3814e0 c3814e0) {
        if (type == String.class) {
            return C4350j.f4859a;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return C4342b.f4851a;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return C4343c.f4852a;
        }
        if (type == Character.class || type == Character.TYPE) {
            return C4344d.f4853a;
        }
        if (type == Double.class || type == Double.TYPE) {
            return C4345e.f4854a;
        }
        if (type == Float.class || type == Float.TYPE) {
            return C4346f.f4855a;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return C4347g.f4856a;
        }
        if (type == Long.class || type == Long.TYPE) {
            return C4348h.f4857a;
        }
        if (type == Short.class || type == Short.TYPE) {
            return C4349i.f4858a;
        }
        return null;
    }
}
