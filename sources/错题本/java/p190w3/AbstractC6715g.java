package p190w3;

import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: w3.g */
/* loaded from: classes3.dex */
public abstract class AbstractC6715g {

    /* renamed from: a */
    public static final Properties f11331a = new Properties();

    /* renamed from: b */
    public static Boolean f11332b;

    /* renamed from: a */
    public static int m6407a(int i) {
        return (int) TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }

    /* renamed from: b */
    public static boolean m6408b() throws Throwable {
        FileInputStream fileInputStream;
        Properties properties = f11331a;
        Boolean bool = f11332b;
        if (bool != null) {
            return bool.booleanValue();
        }
        FileInputStream fileInputStream2 = null;
        try {
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                f11332b = Boolean.valueOf(!TextUtils.isEmpty((String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, "ro.miui.ui.version.name")));
            } catch (Exception unused) {
                f11332b = Boolean.FALSE;
            }
            return f11332b.booleanValue();
        }
        try {
            try {
                fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e8) {
            e = e8;
            fileInputStream2 = fileInputStream;
            e.printStackTrace();
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            f11332b = Boolean.valueOf(properties.containsKey("ro.miui.ui.version.name"));
            return f11332b.booleanValue();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
            }
            throw th;
        }
        f11332b = Boolean.valueOf(properties.containsKey("ro.miui.ui.version.name"));
        return f11332b.booleanValue();
    }
}
