package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.C0323d;

/* renamed from: androidx.core.content.c */
/* loaded from: classes.dex */
public final class C0334c {
    /* renamed from: a */
    public static int m1829a(Context context, String str, int i4, int i5, String str2) {
        if (context.checkPermission(str, i4, i5) == -1) {
            return -1;
        }
        String strM1776b = C0323d.m1776b(str);
        if (strM1776b == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i5);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return C0323d.m1775a(context, strM1776b, str2) != 0 ? -2 : 0;
    }

    /* renamed from: b */
    public static int m1830b(Context context, String str) {
        return m1829a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
