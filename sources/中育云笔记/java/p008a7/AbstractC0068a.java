package p008a7;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;

/* renamed from: a7.a */
/* loaded from: classes5.dex */
public abstract class AbstractC0068a {
    /* renamed from: a */
    public static boolean m140a(Context context) {
        boolean zM142c;
        if (!(context instanceof Activity)) {
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext() instanceof Activity) {
                    zM142c = m142c((Activity) contextWrapper.getBaseContext());
                }
            }
            return true;
        }
        zM142c = m142c((Activity) context);
        return !zM142c;
    }

    /* renamed from: b */
    public static boolean m141b(FragmentActivity fragmentActivity, String str) {
        return !m142c(fragmentActivity) && fragmentActivity.getSupportFragmentManager().findFragmentByTag(str) == null;
    }

    /* renamed from: c */
    public static boolean m142c(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }
}
