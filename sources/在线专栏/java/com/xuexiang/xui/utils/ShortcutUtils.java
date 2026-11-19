package com.xuexiang.xui.utils;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import org.android.agoo.common.AgooConstants;
import p143r.C3017a;
import p143r.C3018b;

/* loaded from: classes.dex */
public final class ShortcutUtils {
    private static final String ACTION_ADD_SHORTCUT = "com.android.launcher.action.INSTALL_SHORTCUT";

    private ShortcutUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean addPinShortcut(Context context, Class<?> cls, String str, int i4, CharSequence charSequence, Class<? extends BroadcastReceiver> cls2) {
        return Build.VERSION.SDK_INT >= 24 ? addPinShortcutAboveN(context, cls, str, IconCompat.m1832d(context, i4), charSequence, cls2) : addShortcutBelowAndroidN(context, cls, i4, charSequence);
    }

    public static boolean addPinShortcutAboveN(Context context, Class<?> cls, String str, IconCompat iconCompat, CharSequence charSequence, Class<? extends BroadcastReceiver> cls2) {
        if (!C3018b.m10134b(context)) {
            return false;
        }
        Intent intent = new Intent(context, cls);
        intent.setAction("android.intent.action.VIEW");
        C3017a c3017aM10128a = new C3017a.a(context, str).m10129b(iconCompat).m10132e(charSequence).m10130c(intent).m10128a();
        return C3018b.m10135c(context, c3017aM10128a, PendingIntent.getBroadcast(context, 0, cls2 != null ? new Intent(context, cls2) : C3018b.m10133a(context, c3017aM10128a), 134217728).getIntentSender());
    }

    public static boolean addShortcutBelowAndroidN(Context context, Class<?> cls, int i4, CharSequence charSequence) {
        try {
            Intent intent = new Intent(ACTION_ADD_SHORTCUT);
            intent.putExtra(AgooConstants.MESSAGE_DUPLICATE, false);
            intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context, i4));
            intent.putExtra("android.intent.extra.shortcut.NAME", charSequence);
            Intent intent2 = new Intent();
            intent2.setClass(context, cls);
            intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
            context.sendBroadcast(intent);
            return true;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }
}
