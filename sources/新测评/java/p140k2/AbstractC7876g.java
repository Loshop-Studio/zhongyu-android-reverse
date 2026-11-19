package p140k2;

import p129j2.AbstractC7788h;

/* renamed from: k2.g */
/* loaded from: classes4.dex */
public abstract class AbstractC7876g {
    /* renamed from: a */
    public static String m13412a(String str, String str2) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e10) {
            AbstractC7788h.m13180f("", e10, new Object[0]);
            return str2;
        }
    }
}
