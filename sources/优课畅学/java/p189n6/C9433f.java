package p189n6;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: n6.f */
/* loaded from: classes5.dex */
public class C9433f {

    /* renamed from: b */
    public static final C9433f f18637b = new C9433f();

    /* renamed from: a */
    public final Map f18638a = new HashMap();

    /* renamed from: b */
    public static C9433f m17289b() {
        return f18637b;
    }

    /* renamed from: a */
    public synchronized Field m17290a(Class cls, String str) {
        Field declaredField;
        try {
            Map map = (Map) this.f18638a.get(cls);
            if (map == null) {
                map = new HashMap();
                this.f18638a.put(cls, map);
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
