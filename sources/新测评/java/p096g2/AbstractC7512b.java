package p096g2;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: g2.b */
/* loaded from: classes4.dex */
public abstract class AbstractC7512b {
    /* renamed from: a */
    public static int m12222a(Context context, String str, String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOp(str, str2);
    }

    /* renamed from: b */
    public static String m12223b(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
