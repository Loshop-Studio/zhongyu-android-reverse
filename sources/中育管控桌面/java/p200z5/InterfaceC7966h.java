package p200z5;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: z5.h */
/* loaded from: classes4.dex */
public interface InterfaceC7966h {

    /* renamed from: z5.h$a */
    public static abstract class a {
        /* renamed from: a */
        public static Type m9818a(int i6, ParameterizedType parameterizedType) {
            return AbstractC7967h0.m9827g(i6, parameterizedType);
        }

        /* renamed from: b */
        public static Class m9819b(Type type) {
            return AbstractC7967h0.m9828h(type);
        }

        /* renamed from: c */
        public InterfaceC7966h mo28c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C7959d0 c7959d0) {
            return null;
        }

        /* renamed from: d */
        public abstract InterfaceC7966h mo29d(Type type, Annotation[] annotationArr, C7959d0 c7959d0);

        /* renamed from: e */
        public InterfaceC7966h m9820e(Type type, Annotation[] annotationArr, C7959d0 c7959d0) {
            return null;
        }
    }

    Object convert(Object obj);
}
