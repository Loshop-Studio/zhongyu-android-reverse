package p290p6;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: p6.b */
/* loaded from: classes5.dex */
public abstract class AbstractC10633b {
    /* renamed from: a */
    public static void m22485a(Activity activity, boolean z10, boolean z11) {
        if (z10 && z11) {
            activity.getWindow().getDecorView().setSystemUiVisibility(256);
            return;
        }
        if (!z10 && !z11) {
            activity.getWindow().getDecorView().setSystemUiVisibility(1280);
        } else {
            if (z10 || !z11) {
                return;
            }
            activity.getWindow().getDecorView().setSystemUiVisibility(1280);
        }
    }

    /* renamed from: b */
    public static void m22486b(Activity activity, boolean z10, boolean z11, boolean z12, boolean z13) {
        try {
            if (!z12) {
                View decorView = activity.getWindow().getDecorView();
                if (z13) {
                    decorView.setSystemUiVisibility(8192);
                    return;
                } else {
                    decorView.setSystemUiVisibility(0);
                    return;
                }
            }
            Window window = activity.getWindow();
            if (z10 && z11) {
                if (z13) {
                    window.getDecorView().setSystemUiVisibility(8448);
                    return;
                } else {
                    window.getDecorView().setSystemUiVisibility(256);
                    return;
                }
            }
            if (!z10 && !z11) {
                if (z13) {
                    window.getDecorView().setSystemUiVisibility(9472);
                    return;
                } else {
                    window.getDecorView().setSystemUiVisibility(1280);
                    return;
                }
            }
            if (z10 || !z11) {
                return;
            }
            if (z13) {
                window.getDecorView().setSystemUiVisibility(9472);
            } else {
                window.getDecorView().setSystemUiVisibility(1280);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public static boolean m22487c(Activity activity, boolean z10, boolean z11, boolean z12, boolean z13) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        boolean z14 = false;
        if (activity != null) {
            m22485a(activity, z10, z11);
            try {
                WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
                Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                int i10 = declaredField.getInt(null);
                int i11 = declaredField2.getInt(attributes);
                declaredField2.setInt(attributes, z13 ? i10 | i11 : (~i10) & i11);
                activity.getWindow().setAttributes(attributes);
            } catch (Exception unused) {
            }
            try {
                if (AbstractC10634c.m22491b() < 7) {
                    return true;
                }
                m22486b(activity, z10, z11, z12, z13);
                return true;
            } catch (Exception unused2) {
                z14 = true;
                m22486b(activity, z10, z11, z12, z13);
                return z14;
            }
        }
        return z14;
    }

    /* renamed from: d */
    public static void m22488d(Activity activity, boolean z10, boolean z11, boolean z12, boolean z13) throws IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        int iM22492c = AbstractC10634c.m22492c();
        if (iM22492c == 1) {
            if (AbstractC10634c.m22493d() >= 7) {
                m22486b(activity, z10, z11, z12, z13);
                return;
            } else {
                m22489e(activity, z10, z11, z12, z13);
                return;
            }
        }
        if (iM22492c == 2) {
            m22487c(activity, z10, z11, z12, z13);
        } else {
            if (iM22492c != 3) {
                return;
            }
            m22486b(activity, z10, z11, z12, z13);
        }
    }

    /* renamed from: e */
    public static boolean m22489e(Activity activity, boolean z10, boolean z11, boolean z12, boolean z13) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        m22485a(activity, z10, z11);
        Class<?> cls = activity.getWindow().getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i10 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Class cls3 = Integer.TYPE;
            cls.getMethod("setExtraFlags", cls3, cls3).invoke(activity.getWindow(), Integer.valueOf(z13 ? i10 : 0), Integer.valueOf(i10));
            return true;
        } catch (Exception unused) {
            m22486b(activity, z10, z11, z12, z13);
            return false;
        }
    }
}
