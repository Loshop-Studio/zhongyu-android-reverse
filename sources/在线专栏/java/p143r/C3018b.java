package p143r;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.content.C0332a;
import java.util.Iterator;

/* renamed from: r.b */
/* loaded from: classes.dex */
public class C3018b {

    /* renamed from: r.b$a */
    class a extends BroadcastReceiver {

        /* renamed from: a */
        final /* synthetic */ IntentSender f11700a;

        a(IntentSender intentSender) {
            this.f11700a = intentSender;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) throws IntentSender.SendIntentException {
            try {
                this.f11700a.sendIntent(context, 0, null, null, null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    /* renamed from: a */
    public static Intent m10133a(Context context, C3017a c3017a) {
        Intent intentCreateShortcutResultIntent = Build.VERSION.SDK_INT >= 26 ? ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(c3017a.m10127c()) : null;
        if (intentCreateShortcutResultIntent == null) {
            intentCreateShortcutResultIntent = new Intent();
        }
        return c3017a.m10126a(intentCreateShortcutResultIntent);
    }

    /* renamed from: b */
    public static boolean m10134b(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
        }
        if (C0332a.m1803a(context, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0) {
            return false;
        }
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.permission;
            if (TextUtils.isEmpty(str) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m10135c(Context context, C3017a c3017a, IntentSender intentSender) throws PackageManager.NameNotFoundException {
        if (Build.VERSION.SDK_INT >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(c3017a.m10127c(), intentSender);
        }
        if (!m10134b(context)) {
            return false;
        }
        Intent intentM10126a = c3017a.m10126a(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"));
        if (intentSender == null) {
            context.sendBroadcast(intentM10126a);
            return true;
        }
        context.sendOrderedBroadcast(intentM10126a, null, new a(intentSender), null, -1, null, null);
        return true;
    }
}
