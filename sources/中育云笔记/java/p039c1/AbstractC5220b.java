package p039c1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p168h0.InterfaceC9435b;

/* renamed from: c1.b */
/* loaded from: classes3.dex */
public abstract class AbstractC5220b {

    /* renamed from: a */
    public static final ConcurrentMap f3111a = new ConcurrentHashMap();

    /* renamed from: a */
    public static PackageInfo m2798a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e10);
            return null;
        }
    }

    /* renamed from: b */
    public static String m2799b(PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    /* renamed from: c */
    public static InterfaceC9435b m2800c(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap concurrentMap = f3111a;
        InterfaceC9435b interfaceC9435b = (InterfaceC9435b) concurrentMap.get(packageName);
        if (interfaceC9435b != null) {
            return interfaceC9435b;
        }
        InterfaceC9435b interfaceC9435bM2801d = m2801d(context);
        InterfaceC9435b interfaceC9435b2 = (InterfaceC9435b) concurrentMap.putIfAbsent(packageName, interfaceC9435bM2801d);
        return interfaceC9435b2 == null ? interfaceC9435bM2801d : interfaceC9435b2;
    }

    /* renamed from: d */
    public static InterfaceC9435b m2801d(Context context) {
        return new C5222d(m2799b(m2798a(context)));
    }
}
