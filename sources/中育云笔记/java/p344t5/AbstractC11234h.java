package p344t5;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p129e5.C9105b;

/* renamed from: t5.h */
/* loaded from: classes5.dex */
public abstract class AbstractC11234h {
    /* renamed from: a */
    public static boolean m25007a(Context context) {
        if (new C9105b(context, "push_notify_flag").m17893d("notify_msg_enable")) {
            return false;
        }
        return AbstractC11231e.m25000g() ? ((NotificationManager) context.getSystemService("notification")).areNotificationsEnabled() : m25008b(context);
    }

    /* renamed from: b */
    public static boolean m25008b(Context context) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i10 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i10), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
