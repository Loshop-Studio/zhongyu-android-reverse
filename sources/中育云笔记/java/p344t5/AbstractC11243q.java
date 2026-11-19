package p344t5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.huawei.hms.support.log.HMSLog;
import java.lang.reflect.Field;

/* renamed from: t5.q */
/* loaded from: classes5.dex */
public abstract class AbstractC11243q {
    /* renamed from: a */
    public static int m25075a(Context context, String str) throws PackageManager.NameNotFoundException {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return 0;
            }
            return bundle.getInt(str);
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            HMSLog.m8728w("ResourceLoader", "load meta data resource failed.");
            return 0;
        }
    }

    /* renamed from: b */
    public static int m25076b(Context context, String str, String str2) throws NoSuchFieldException, NumberFormatException {
        try {
            int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
            if (identifier != 0) {
                return identifier;
            }
            Field field = Class.forName(context.getPackageName() + ".R$" + str).getField(str2);
            int i10 = Integer.parseInt(field.get(field.getName()).toString());
            if (i10 != 0) {
                return i10;
            }
            HMSLog.m8727i("ResourceLoader", "Error-resourceType=" + str + "--resourceName=" + str2 + "--resourceId =" + i10);
            return i10;
        } catch (ClassNotFoundException e10) {
            HMSLog.m8726e("ResourceLoader", "!!!! ResourceLoader: ClassNotFoundException-resourceType=" + str + "--resourceName=" + str2, e10);
            return 0;
        } catch (IllegalAccessException e11) {
            HMSLog.m8726e("ResourceLoader", "!!!! ResourceLoader: IllegalAccessException-resourceType=" + str + "--resourceName=" + str2, e11);
            return 0;
        } catch (NoSuchFieldException e12) {
            HMSLog.m8726e("ResourceLoader", "!!!! ResourceLoader: NoSuchFieldException-resourceType=" + str + "--resourceName=" + str2, e12);
            return 0;
        } catch (NumberFormatException e13) {
            HMSLog.m8726e("ResourceLoader", "!!!! ResourceLoader: NumberFormatException-resourceType=" + str + "--resourceName=" + str2, e13);
            return 0;
        } catch (IllegalArgumentException e14) {
            HMSLog.m8726e("ResourceLoader", "!!!! ResourceLoader: IllegalArgumentException-resourceType=" + str + "--resourceName=" + str2, e14);
            return 0;
        }
    }
}
