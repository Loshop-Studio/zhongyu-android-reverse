package p008a7;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import anet.channel.strategy.dispatch.DispatchConstants;
import p290p6.AbstractC10634c;

/* renamed from: a7.e */
/* loaded from: classes5.dex */
public abstract class AbstractC0072e {
    /* renamed from: a */
    public static int m161a(Context context, float f10) {
        return (int) ((f10 * context.getApplicationContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static int m162b(Context context, String str) throws Resources.NotFoundException {
        try {
            int identifier = Resources.getSystem().getIdentifier(str, "dimen", DispatchConstants.ANDROID);
            if (identifier > 0) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
                int dimensionPixelSize2 = Resources.getSystem().getDimensionPixelSize(identifier);
                if (dimensionPixelSize2 >= dimensionPixelSize) {
                    return dimensionPixelSize2;
                }
                float f10 = (dimensionPixelSize * Resources.getSystem().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().density;
                return (int) (f10 >= 0.0f ? f10 + 0.5f : f10 - 0.5f);
            }
        } catch (Resources.NotFoundException unused) {
        }
        return 0;
    }

    /* renamed from: c */
    public static int m163c(Context context) {
        boolean z10 = context.getResources().getConfiguration().orientation == 1;
        if (m170j(context)) {
            return m162b(context, z10 ? "navigation_bar_height" : "navigation_bar_height_landscape");
        }
        return 0;
    }

    /* renamed from: d */
    public static int m164d(Context context) {
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    /* renamed from: e */
    public static int m165e(Context context) {
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    /* renamed from: f */
    public static String m166f(Context context, int i10) {
        try {
            return context.getResources().getResourceEntryName(i10);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: g */
    public static int m167g(Context context) {
        return m164d(context) - m169i(context);
    }

    /* renamed from: h */
    public static int m168h(Context context) {
        int identifier = Resources.getSystem().getIdentifier("status_bar_height", "dimen", DispatchConstants.ANDROID);
        int dimensionPixelSize = identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
        return dimensionPixelSize == 0 ? m161a(context, 26.0f) : dimensionPixelSize;
    }

    /* renamed from: i */
    public static int m169i(Context context) {
        return m170j(context) ? m168h(context) + m163c(context) : m168h(context);
    }

    /* renamed from: j */
    public static boolean m170j(Context context) {
        boolean z10;
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        int childCount = viewGroup.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                z10 = false;
                break;
            }
            View childAt = viewGroup.getChildAt(i10);
            int id2 = childAt.getId();
            if (id2 != -1 && "navigationBarBackground".equals(m166f(activity, id2)) && childAt.getVisibility() == 0) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (!z10) {
            return z10;
        }
        if (AbstractC10634c.m22500k() && Build.VERSION.SDK_INT < 29) {
            try {
                return Settings.Global.getInt(activity.getContentResolver(), "navigationbar_hide_bar_enabled") == 0;
            } catch (Exception unused) {
            }
        }
        return (viewGroup.getSystemUiVisibility() & 2) == 0;
    }
}
