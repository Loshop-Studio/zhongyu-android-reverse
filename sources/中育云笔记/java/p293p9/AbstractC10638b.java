package p293p9;

import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: p9.b */
/* loaded from: classes5.dex */
public abstract class AbstractC10638b {

    /* renamed from: a */
    public static Properties f25658a = new Properties();

    /* renamed from: b */
    public static Boolean f25659b;

    /* renamed from: a */
    public static int m22506a(int i10) {
        return (int) TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics());
    }

    /* renamed from: b */
    public static boolean m22507b() throws Throwable {
        FileInputStream fileInputStream;
        Boolean bool = f25659b;
        if (bool != null) {
            return bool.booleanValue();
        }
        FileInputStream fileInputStream2 = null;
        try {
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                f25659b = Boolean.valueOf(!TextUtils.isEmpty((String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, "ro.miui.ui.version.name")));
            } catch (Exception unused) {
                f25659b = Boolean.FALSE;
            }
            return f25659b.booleanValue();
        }
        try {
            try {
                fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            f25658a.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e12) {
            e = e12;
            fileInputStream2 = fileInputStream;
            e.printStackTrace();
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            f25659b = Boolean.valueOf(f25658a.containsKey("ro.miui.ui.version.name"));
            return f25659b.booleanValue();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            }
            throw th;
        }
        f25659b = Boolean.valueOf(f25658a.containsKey("ro.miui.ui.version.name"));
        return f25659b.booleanValue();
    }

    /* renamed from: c */
    public static int m22508c(int i10) {
        return (int) TypedValue.applyDimension(2, i10, Resources.getSystem().getDisplayMetrics());
    }
}
