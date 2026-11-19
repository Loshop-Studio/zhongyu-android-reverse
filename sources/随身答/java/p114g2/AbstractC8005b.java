package p114g2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* renamed from: g2.b */
/* loaded from: classes4.dex */
public abstract class AbstractC8005b {
    /* renamed from: a */
    public static InterfaceC8040s0 m12561a(Context context) {
        String str = Build.BRAND;
        AbstractC8019i.m12599b("Device", "Brand", str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("huawei") || str.equalsIgnoreCase("honor") || str.equalsIgnoreCase("华为")) {
            return new C8007c();
        }
        if (str.equalsIgnoreCase("xiaomi") || str.equalsIgnoreCase("redmi") || str.equalsIgnoreCase("meitu") || str.equalsIgnoreCase("小米")) {
            return new C8017h();
        }
        if (str.equalsIgnoreCase("vivo")) {
            return new C8015g();
        }
        if (str.equalsIgnoreCase("oppo") || str.equalsIgnoreCase("oneplus")) {
            return new C8011e();
        }
        if (str.equalsIgnoreCase("lenovo") || str.equalsIgnoreCase("zuk")) {
            return new C8009d();
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("SAMSUNG")) {
            return new C8013f();
        }
        return null;
    }
}
