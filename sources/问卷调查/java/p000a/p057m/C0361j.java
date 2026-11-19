package p000a.p057m;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: a.m.j */
/* loaded from: classes.dex */
public class C0361j {

    /* renamed from: a */
    public static Map<Class<?>, Integer> f2180a = new HashMap();

    /* renamed from: b */
    public static Map<Class<?>, List<Constructor<? extends InterfaceC0354c>>> f2181b = new HashMap();

    /* renamed from: a */
    public static InterfaceC0354c m1287a(Constructor<? extends InterfaceC0354c> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: b */
    public static String m1288b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117 A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m1289c(java.lang.Class<?> r11) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p057m.C0361j.m1289c(java.lang.Class):int");
    }
}
