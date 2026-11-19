package p078i4;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.blankj.utilcode.util.AbstractC4657l0;
import com.zykj.huiwei.launcher.app.App;
import com.zykj.huiwei.launcher.receiver.LogoutReceiver;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i4.g */
/* loaded from: classes4.dex */
public abstract class AbstractC6537g {

    /* renamed from: a */
    public static final a f8372a = new a(null);

    /* renamed from: b */
    public static final boolean f8373b;

    /* renamed from: i4.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: i */
        public static /* synthetic */ void m7309i(a aVar, boolean z6, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                z6 = true;
            }
            aVar.m7317h(z6);
        }

        /* renamed from: a */
        public final String m7310a() throws PackageManager.NameNotFoundException {
            String str = "";
            try {
                PackageInfo packageInfo = AbstractC4657l0.m2250a().getPackageManager().getPackageInfo(App.INSTANCE.m5206a().getPackageName(), 0);
                if (packageInfo != null) {
                    str = packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException e6) {
                e6.printStackTrace();
            }
            return String.valueOf(str);
        }

        /* renamed from: b */
        public final String m7311b() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            String serial;
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 28) {
                serial = Build.getSerial();
            } else if (i6 > 24) {
                serial = Build.SERIAL;
            } else {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                Method method = cls.getMethod("get", String.class);
                Intrinsics.checkNotNullExpressionValue(method, "getMethod(...)");
                Object objInvoke = method.invoke(cls, "ro.serialno");
                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.String");
                serial = (String) objInvoke;
            }
            return (serial == null || serial.length() == 0 || Intrinsics.areEqual(serial, "unknow") || Intrinsics.areEqual(serial, "no.such.thing")) ? "" : serial;
        }

        /* renamed from: c */
        public final int m7312c(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }

        /* renamed from: d */
        public final void m7313d(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus != null) {
                Object systemService = activity.getSystemService("input_method");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                if (inputMethodManager.isActive()) {
                    inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
                }
            }
        }

        /* renamed from: e */
        public final void m7314e(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intent intent = new Intent();
            intent.setPackage("com.android.launcher3");
            intent.setAction("com.linspirer.edu.homeaction");
            activity.sendBroadcast(intent);
        }

        /* renamed from: f */
        public final boolean m7315f(String pkgName) {
            Intrinsics.checkNotNullParameter(pkgName, "pkgName");
            try {
                return AbstractC4657l0.m2250a().getPackageManager().getApplicationInfo(pkgName, 0).enabled;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }

        /* renamed from: g */
        public final boolean m7316g() {
            return AbstractC6537g.f8373b;
        }

        /* renamed from: h */
        public final void m7317h(boolean z6) {
            Intent intent = new Intent();
            intent.setAction("com.zykj.action.zykj.LOGOUT");
            intent.setComponent(new ComponentName(App.INSTANCE.m5206a().getPackageName(), LogoutReceiver.class.getName()));
            intent.putExtra("exitActivity", z6);
            AbstractC4657l0.m2250a().sendBroadcast(intent);
        }

        public a() {
        }
    }

    static {
        PackageManager packageManager = AbstractC4657l0.m2250a().getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        boolean z6 = false;
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
        if (listQueryIntentActivities == null || !listQueryIntentActivities.isEmpty()) {
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                if (Intrinsics.areEqual(resolveInfo.activityInfo.packageName, "com.android.launcher3") && (Intrinsics.areEqual(resolveInfo.activityInfo.loadLabel(AbstractC4657l0.m2250a().getPackageManager()).toString(), "领创平板管理") || Intrinsics.areEqual(resolveInfo.activityInfo.loadLabel(AbstractC4657l0.m2250a().getPackageManager()).toString(), "Linspirer MDM"))) {
                    z6 = true;
                    break;
                }
            }
        }
        f8373b = z6;
    }
}
