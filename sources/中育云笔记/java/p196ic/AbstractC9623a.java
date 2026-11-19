package p196ic;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import androidx.core.view.InputDeviceCompat;
import com.blankj.utilcode.constant.CacheConstants;

/* renamed from: ic.a */
/* loaded from: classes6.dex */
public abstract class AbstractC9623a {
    /* renamed from: a */
    public static ViewGroup m18876a(Activity activity) {
        if (activity == null) {
            return null;
        }
        return (ViewGroup) activity.getWindow().getDecorView();
    }

    /* renamed from: b */
    public static int m18877b(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        m18881f(context).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: c */
    public static int m18878c(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: d */
    public static int m18879d(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: e */
    public static void m18880e(Activity activity, ViewGroup viewGroup) {
        viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() | InputDeviceCompat.SOURCE_TOUCHSCREEN);
        activity.getWindow().setFlags(1024, 1024);
    }

    /* renamed from: f */
    public static Activity m18881f(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m18881f(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: g */
    public static String m18882g(int i10, int i11) {
        String str;
        String str2;
        long j10 = i10 / CacheConstants.HOUR;
        long j11 = (i10 % CacheConstants.HOUR) / 60;
        long j12 = i10 % 60;
        String str3 = "00";
        if (j10 <= 0) {
            str = "00";
        } else if (j10 < 10) {
            str = "0" + j10;
        } else {
            str = j10 + "";
        }
        if (j11 <= 0) {
            str2 = "00";
        } else if (j11 < 10) {
            str2 = "0" + j11;
        } else {
            str2 = j11 + "";
        }
        if (j12 > 0) {
            if (j12 < 10) {
                str3 = "0" + j12;
            } else {
                str3 = j12 + "";
            }
        }
        if (i11 < 3600) {
            return str2 + ":" + str3;
        }
        return str + ":" + str2 + ":" + str3;
    }

    /* renamed from: h */
    public static ViewGroup m18883h(Context context, boolean z10) {
        Activity activityM18881f = m18881f(context);
        ViewGroup viewGroupM18876a = m18876a(activityM18881f);
        if (viewGroupM18876a == null) {
            return null;
        }
        if (z10) {
            m18880e(activityM18881f, viewGroupM18876a);
            activityM18881f.setRequestedOrientation(0);
            return viewGroupM18876a;
        }
        m18884i(activityM18881f, viewGroupM18876a);
        activityM18881f.setRequestedOrientation(1);
        return viewGroupM18876a;
    }

    /* renamed from: i */
    public static void m18884i(Activity activity, ViewGroup viewGroup) {
        viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() & (-4099));
        activity.getWindow().clearFlags(1024);
    }
}
