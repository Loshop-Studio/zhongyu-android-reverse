package p021b3;

import android.text.TextUtils;
import android.util.Log;
import com.p071uc.crashsdk.export.CrashApi;
import com.p071uc.crashsdk.export.CustomLogInfo;
import java.util.ArrayList;

/* renamed from: b3.a */
/* loaded from: classes4.dex */
public abstract class AbstractC5107a {

    /* renamed from: a */
    public static final String f2214a = "a";

    /* renamed from: b */
    public static Object f2215b = new Object();

    /* renamed from: c */
    public static ArrayList f2216c = new ArrayList(10);

    /* renamed from: d */
    public static boolean f2217d = false;

    /* renamed from: a */
    public static void m2165a(Throwable th, String str) {
        if (th == null || TextUtils.isEmpty(str)) {
            Log.e(f2214a, "generate custom log failed ! e is null or type is empty");
            return;
        }
        try {
            CustomLogInfo customLogInfoM2166a = new C5109c(str).m2168c(th).m2166a();
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("um_umid");
            arrayList.add("um_action_log");
            customLogInfoM2166a.mCallbacks = arrayList;
            CrashApi crashApi = CrashApi.getInstance();
            if (crashApi == null) {
                Log.e(f2214a, "CrashApi is null, not init .");
            } else {
                crashApi.generateCustomLog(customLogInfoM2166a);
            }
        } catch (Throwable unused) {
        }
    }
}
