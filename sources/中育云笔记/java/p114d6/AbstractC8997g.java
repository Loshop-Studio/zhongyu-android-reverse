package p114d6;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: d6.g */
/* loaded from: classes5.dex */
public abstract class AbstractC8997g {

    /* renamed from: a */
    public static final String f20961a = "f";

    /* renamed from: a */
    public static String m17566a(String str) {
        Context contextM17549a = AbstractC8992b.m17549a();
        if (contextM17549a == null) {
            return "";
        }
        try {
            return contextM17549a.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            AbstractC8996f.m17563d(f20961a, "getVersion NameNotFoundException : " + e10.getMessage());
            return "";
        } catch (Exception e11) {
            AbstractC8996f.m17563d(f20961a, "getVersion: " + e11.getMessage());
            return "";
        } catch (Throwable unused) {
            AbstractC8996f.m17563d(f20961a, "throwable");
            return "";
        }
    }
}
