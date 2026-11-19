package p086e5;

import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: e5.a */
/* loaded from: classes5.dex */
public final class C8352a {

    /* renamed from: a */
    public static final C8352a f15871a = new C8352a();

    /* renamed from: a */
    public final boolean m13596a(Context context, String str) {
        AbstractC9133u.m16133g(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            AbstractC9133u.m16130d(str);
            return packageManager.getApplicationInfo(str, 0).enabled;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public final boolean m13597b(Context context) {
        AbstractC9133u.m16133g(context, "context");
        return m13596a(context, "cn.com.techvision.appstore");
    }
}
