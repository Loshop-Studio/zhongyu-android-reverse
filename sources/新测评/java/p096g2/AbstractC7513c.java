package p096g2;

import android.content.Context;
import android.os.Process;

/* renamed from: g2.c */
/* loaded from: classes4.dex */
public abstract class AbstractC7513c {
    /* renamed from: a */
    public static int m12224a(Context context, String str) {
        return m12225b(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    /* renamed from: b */
    public static int m12225b(Context context, String str, int i10, int i11, String str2) {
        if (context.checkPermission(str, i10, i11) == -1) {
            return -1;
        }
        String strM12219b = AbstractC7511a.m12219b(str);
        if (strM12219b == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return AbstractC7511a.m12218a(context, strM12219b, str2) != 0 ? -2 : 0;
    }
}
