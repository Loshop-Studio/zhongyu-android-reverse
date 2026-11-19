package ca;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: ca.h */
/* loaded from: classes5.dex */
public interface InterfaceC5290h {

    /* renamed from: ca.h$a */
    public static abstract class a {
        /* renamed from: a */
        public static Type m2278a(int i10, ParameterizedType parameterizedType) {
            return AbstractC5291h0.m2287g(i10, parameterizedType);
        }

        /* renamed from: b */
        public static Class m2279b(Type type) {
            return AbstractC5291h0.m2288h(type);
        }

        /* renamed from: c */
        public InterfaceC5290h mo2219c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C5283d0 c5283d0) {
            return null;
        }

        /* renamed from: d */
        public abstract InterfaceC5290h mo2220d(Type type, Annotation[] annotationArr, C5283d0 c5283d0);

        /* renamed from: e */
        public InterfaceC5290h m2280e(Type type, Annotation[] annotationArr, C5283d0 c5283d0) {
            return null;
        }
    }

    Object convert(Object obj);
}
