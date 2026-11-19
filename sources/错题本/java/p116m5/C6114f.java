package p116m5;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: m5.f */
/* loaded from: classes3.dex */
public final class C6114f {

    /* renamed from: b */
    public static final C6114f f9760b = new C6114f();

    /* renamed from: a */
    public final HashMap f9761a = new HashMap();

    /* renamed from: a */
    public final synchronized Field m5808a(Class cls, String str) {
        Field declaredField;
        try {
            Map map = (Map) this.f9761a.get(cls);
            if (map == null) {
                map = new HashMap();
                this.f9761a.put(cls, map);
            }
            declaredField = (Field) map.get(str);
            if (declaredField == null) {
                try {
                    declaredField = cls.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    map.put(str, declaredField);
                } catch (NoSuchFieldException e) {
                    throw new IllegalStateException(e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return declaredField;
    }
}
