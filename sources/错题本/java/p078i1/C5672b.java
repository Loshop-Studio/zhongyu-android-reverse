package p078i1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p185v7.AbstractC6675d;

/* renamed from: i1.b */
/* loaded from: classes2.dex */
public final class C5672b extends AbstractC6675d {

    /* renamed from: a */
    public final Method f8838a = Class.class.getMethod("isRecord", null);

    /* renamed from: b */
    public final Method f8839b = Class.class.getMethod("getRecordComponents", null);

    /* renamed from: c */
    public final Method f8840c;

    /* renamed from: d */
    public final Method f8841d;

    public C5672b() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f8840c = cls.getMethod("getName", null);
        this.f8841d = cls.getMethod("getType", null);
    }

    @Override // p185v7.AbstractC6675d
    /* renamed from: k */
    public final Method mo5001k(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // p185v7.AbstractC6675d
    /* renamed from: l */
    public final Constructor mo5002l(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f8839b.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.f8841d.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // p185v7.AbstractC6675d
    /* renamed from: o */
    public final String[] mo5003o(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f8839b.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f8840c.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // p185v7.AbstractC6675d
    /* renamed from: p */
    public final boolean mo5004p(Class cls) {
        try {
            return ((Boolean) this.f8838a.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }
}
