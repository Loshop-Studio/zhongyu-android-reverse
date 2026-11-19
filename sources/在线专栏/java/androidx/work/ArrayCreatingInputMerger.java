package androidx.work;

import androidx.work.C0810a;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p169x0.AbstractC3443l;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends AbstractC3443l {
    /* renamed from: c */
    private Object m4117c(Object obj, Object obj2) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        int length = Array.getLength(obj);
        Object objNewInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        Array.set(objNewInstance, length, obj2);
        return objNewInstance;
    }

    /* renamed from: d */
    private Object m4118d(Object obj, Object obj2) throws NegativeArraySizeException {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        System.arraycopy(obj2, 0, objNewInstance, length, length2);
        return objNewInstance;
    }

    /* renamed from: e */
    private Object m4119e(Object obj, Object obj2) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object objNewInstance = Array.newInstance(obj.getClass(), 2);
        Array.set(objNewInstance, 0, obj);
        Array.set(objNewInstance, 1, obj2);
        return objNewInstance;
    }

    /* renamed from: f */
    private Object m4120f(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object objNewInstance = Array.newInstance(obj.getClass(), 1);
        Array.set(objNewInstance, 0, obj);
        return objNewInstance;
    }

    @Override // p169x0.AbstractC3443l
    /* renamed from: b */
    public C0810a mo4121b(List<C0810a> list) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        C0810a.a aVar = new C0810a.a();
        HashMap map = new HashMap();
        Iterator<C0810a> it = list.iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, Object> entry : it.next().m4151i().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value.getClass();
                Object obj = map.get(key);
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        value = cls2.isArray() ? m4118d(obj, value) : m4119e(obj, value);
                    } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                        value = m4117c(obj, value);
                    } else {
                        if (!cls.isArray() || !cls.getComponentType().equals(cls2)) {
                            throw new IllegalArgumentException();
                        }
                        value = m4117c(value, obj);
                    }
                } else if (!cls.isArray()) {
                    value = m4120f(value);
                }
                map.put(key, value);
            }
        }
        aVar.m4158d(map);
        return aVar.m4155a();
    }
}
