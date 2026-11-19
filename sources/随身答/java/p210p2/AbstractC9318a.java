package p210p2;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.AbstractC6782a;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import p176m2.AbstractC8959h;
import p186n2.AbstractC9089c;
import p196o2.C9160b;
import p250t2.AbstractC9612d;
import p260u2.AbstractC9668c;

/* renamed from: p2.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9318a {

    /* renamed from: a */
    public static boolean f16160a = false;

    /* renamed from: b */
    public static Object f16161b = new Object();

    /* renamed from: a */
    public static void m15199a(Context context, Object obj) {
        AbstractC8959h.m14292b("MobclickRT", "--->>> UMCrashManager.buildEnvelope enter.");
        try {
            synchronized (f16161b) {
                try {
                    if (context == null || obj == null) {
                        return;
                    }
                    String str = (String) obj;
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = context.getFilesDir() + File.separator + ".emitter";
                        File file = new File(str2);
                        if (!file.isDirectory()) {
                            file.mkdir();
                        }
                        AbstractC9612d.m15895d(context, str2, "c", 10);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("c_sdk_v", "2.0");
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("content", str);
                            jSONObject2.put("ts", System.currentTimeMillis());
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("crash", jSONObject2);
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("tp", jSONObject3);
                            AbstractC6782a.m6269c(context, jSONObject, jSONObject4, AbstractC9668c.f17082i, "c", "2.0");
                        } catch (JSONException unused) {
                        }
                    }
                } finally {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: b */
    public static void m15200b(Context context, Throwable th) {
        synchronized (f16161b) {
            try {
                if (!f16160a) {
                    f16160a = true;
                    AbstractC9089c.m14596m(context, 32786, C9160b.m14737a(context).m14738b(), AbstractC9319b.m15201a(th));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
