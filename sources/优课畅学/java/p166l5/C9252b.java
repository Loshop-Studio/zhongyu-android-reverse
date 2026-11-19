package p166l5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.tencent.liteav.basic.log.TXCLog;
import org.json.JSONException;
import org.json.JSONObject;
import p166l5.C9251a;

/* renamed from: l5.b */
/* loaded from: classes5.dex */
public class C9252b {

    /* renamed from: a */
    public String f18252a;

    /* renamed from: b */
    public String f18253b;

    /* renamed from: l5.b$b */
    public static class b {

        /* renamed from: a */
        public static C9252b f18255a = new C9252b(null);
    }

    public /* synthetic */ C9252b(a aVar) {
        this();
    }

    /* renamed from: a */
    public static C9252b m16956a() {
        return b.f18255a;
    }

    /* renamed from: b */
    public void m16957b(Context context) {
        if (context == null) {
            return;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i10 = applicationInfo.labelRes;
        this.f18252a = i10 == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i10);
    }

    /* renamed from: c */
    public void m16958c(Context context) {
        if (context == null) {
            return;
        }
        try {
            this.f18253b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: d */
    public void m16959d(String str, long j10, int i10) throws JSONException {
        String string = "";
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", str);
            jSONObject.put("fileid", i10);
            jSONObject.put("type", "log");
            jSONObject.put("bussiness", "superplayer");
            jSONObject.put("usedtime", j10);
            jSONObject.put("platform", "android");
            String str2 = this.f18252a;
            if (str2 != null) {
                jSONObject.put("appname", str2);
            }
            String str3 = this.f18253b;
            if (str3 != null) {
                jSONObject.put("appidentifier", str3);
            }
            string = jSONObject.toString();
            TXCLog.m4989d("TCLogReport", string);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        C9251a.m16951b().m16953c("https://ilivelog.qcloud.com", string, new a());
    }

    public C9252b() {
    }

    /* renamed from: l5.b$a */
    public class a implements C9251a.d {
        public a() {
        }

        @Override // p166l5.C9251a.d
        /* renamed from: a */
        public void mo16954a() {
        }

        @Override // p166l5.C9251a.d
        /* renamed from: b */
        public void mo16955b(String str) {
        }
    }
}
