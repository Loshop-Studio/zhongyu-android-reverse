package p021b6;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p200z5.C7959d0;
import p200z5.InterfaceC7966h;

/* renamed from: b6.k */
/* loaded from: classes4.dex */
public final class C4453k extends InterfaceC7966h.a {
    /* renamed from: f */
    public static C4453k m1517f() {
        return new C4453k();
    }

    @Override // p200z5.InterfaceC7966h.a
    /* renamed from: c */
    public InterfaceC7966h mo28c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C7959d0 c7959d0) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return C4443a.f1320a;
        }
        return null;
    }

    @Override // p200z5.InterfaceC7966h.a
    /* renamed from: d */
    public InterfaceC7966h mo29d(Type type, Annotation[] annotationArr, C7959d0 c7959d0) {
        if (type == String.class) {
            return C4452j.f1330a;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return C4444b.f1322a;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return C4445c.f1323a;
        }
        if (type == Character.class || type == Character.TYPE) {
            return C4446d.f1324a;
        }
        if (type == Double.class || type == Double.TYPE) {
            return C4447e.f1325a;
        }
        if (type == Float.class || type == Float.TYPE) {
            return C4448f.f1326a;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return C4449g.f1327a;
        }
        if (type == Long.class || type == Long.TYPE) {
            return C4450h.f1328a;
        }
        if (type == Short.class || type == Short.TYPE) {
            return C4451i.f1329a;
        }
        return null;
    }
}
