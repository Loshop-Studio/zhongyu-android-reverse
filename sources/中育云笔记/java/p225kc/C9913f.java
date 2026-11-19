package p225kc;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: kc.f */
/* loaded from: classes6.dex */
public class C9913f {

    /* renamed from: b */
    public static final C9913f f23236b = new C9913f();

    /* renamed from: a */
    public final Map f23237a = new HashMap();

    /* renamed from: b */
    public static C9913f m19986b() {
        return f23236b;
    }

    /* renamed from: a */
    public synchronized Field m19987a(Class cls, String str) {
        Field declaredField;
        try {
            Map map = (Map) this.f23237a.get(cls);
            if (map == null) {
                map = new HashMap();
                this.f23237a.put(cls, map);
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
