package p037c8;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c8.f */
/* loaded from: classes5.dex */
public class C5271f {

    /* renamed from: b */
    public static final C5271f f2514b = new C5271f();

    /* renamed from: a */
    public final Map f2515a = new HashMap();

    /* renamed from: b */
    public static C5271f m2412b() {
        return f2514b;
    }

    /* renamed from: a */
    public synchronized Field m2413a(Class cls, String str) {
        Field declaredField;
        try {
            Map map = (Map) this.f2515a.get(cls);
            if (map == null) {
                map = new HashMap();
                this.f2515a.put(cls, map);
            }
            declaredField = (Field) map.get(str);
            if (declaredField == null) {
                try {
                    declaredField = cls.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    map.put(str, declaredField);
                } catch (NoSuchFieldException e10) {
                    throw new IllegalStateException(e10);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return declaredField;
    }
}
