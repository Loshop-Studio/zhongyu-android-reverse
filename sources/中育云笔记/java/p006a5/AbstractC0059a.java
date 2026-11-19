package p006a5;

import android.content.Context;
import android.content.pm.PackageManager;
import com.huawei.hms.support.log.HMSLog;
import p333s5.C11067g;

/* renamed from: a5.a */
/* loaded from: classes5.dex */
public abstract class AbstractC0059a {
    /* renamed from: a */
    public static void m108a(Context context) {
        try {
            if (m109b(context)) {
                HMSLog.m8727i("AutoInit", "Push init start");
                new Thread(new RunnableC0060b(context)).start();
            }
        } catch (Exception e10) {
            HMSLog.m8726e("AutoInit", "Push init failed", e10);
        }
    }

    /* renamed from: b */
    public static boolean m109b(Context context) {
        C11067g c11067gM24536k = C11067g.m24536k(context);
        if (c11067gM24536k.m17892c("push_kit_auto_init_enabled")) {
            return c11067gM24536k.m17893d("push_kit_auto_init_enabled");
        }
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("push_kit_auto_init_enabled");
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            return false;
        }
    }
}
