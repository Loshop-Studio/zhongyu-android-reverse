package p225r8;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: r8.f */
/* loaded from: classes5.dex */
public class C9051f {

    /* renamed from: b */
    public static final C9051f f15516b = new C9051f();

    /* renamed from: a */
    public final Map f15517a = new HashMap();

    /* renamed from: b */
    public static C9051f m15203b() {
        return f15516b;
    }

    /* renamed from: a */
    public synchronized Field m15204a(Class cls, String str) {
        Field declaredField;
        try {
            Map map = (Map) this.f15517a.get(cls);
            if (map == null) {
                map = new HashMap();
                this.f15517a.put(cls, map);
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
