package p122df;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: df.h */
/* loaded from: classes6.dex */
public interface InterfaceC9040h {

    /* renamed from: df.h$a */
    public static abstract class a {
        public static Type getParameterUpperBound(int i10, ParameterizedType parameterizedType) {
            return AbstractC9041h0.m17745g(i10, parameterizedType);
        }

        public static Class<?> getRawType(Type type) {
            return AbstractC9041h0.m17746h(type);
        }

        public InterfaceC9040h requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C9033d0 c9033d0) {
            return null;
        }

        public abstract InterfaceC9040h responseBodyConverter(Type type, Annotation[] annotationArr, C9033d0 c9033d0);

        public InterfaceC9040h stringConverter(Type type, Annotation[] annotationArr, C9033d0 c9033d0) {
            return null;
        }
    }

    Object convert(Object obj);
}
