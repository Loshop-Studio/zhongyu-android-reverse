package p203j5;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.AssetsUtil;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.json.JSONException;
import p189i5.C9607a;
import p189i5.C9609c;
import p259n5.AbstractC10319c;
import p303q5.C10737a;

/* renamed from: j5.b */
/* loaded from: classes5.dex */
public class C9681b {

    /* renamed from: b */
    public static final Map f22483b = new ConcurrentHashMap(16);

    /* renamed from: c */
    public static final Object f22484c = new Object();

    /* renamed from: a */
    public AbstractC9680a f22485a;

    public C9681b() {
        this.f22485a = new C9683d(true, true);
    }

    /* renamed from: a */
    public static C9681b m19160a(String str) {
        return (C9681b) f22483b.get(str);
    }

    /* renamed from: b */
    public String m19161b(Context context, C9607a c9607a, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z10) {
        String strM19140b;
        synchronized (f22484c) {
            strM19140b = this.f22485a.m19140b(context, c9607a, grsBaseInfo, str, str2, z10);
        }
        return strM19140b;
    }

    /* renamed from: c */
    public Map m19162c(Context context, C9607a c9607a, GrsBaseInfo grsBaseInfo, String str, boolean z10) {
        Map mapM19143e;
        synchronized (f22484c) {
            mapM19143e = this.f22485a.m19143e(context, c9607a, grsBaseInfo, str, z10);
        }
        return mapM19143e;
    }

    /* renamed from: d */
    public C10737a m19163d() {
        return this.f22485a.m19149k();
    }

    /* renamed from: e */
    public final void m19164e(Context context, boolean z10) throws IOException {
        String[] strArrSplit;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM21529a = AbstractC10319c.m21529a("grs_route_config_files_list.txt", context);
        Logger.m8581i("LocalManagerProxy", "initLocalManager configFileListContent TimeCost:%d  Content:%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), strM21529a);
        if (TextUtils.isEmpty(strM21529a)) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            strArrSplit = AssetsUtil.list(context, GrsApp.getInstance().getBrand(""));
            Logger.m8580i("LocalManagerProxy", "list by AssetsManager, timeCost:" + (System.currentTimeMillis() - jCurrentTimeMillis2));
        } else {
            strArrSplit = strM21529a.split(MqttTopic.MULTI_LEVEL_WILDCARD);
        }
        List arrayList = strArrSplit == null ? new ArrayList() : Arrays.asList(strArrSplit);
        String appConfigName = GrsApp.getInstance().getAppConfigName();
        Logger.m8580i("LocalManagerProxy", "appConfigName is: " + appConfigName);
        this.f22485a = new C9683d(false, z10);
        if (arrayList.contains("grs_app_global_route_config.json") || !TextUtils.isEmpty(appConfigName)) {
            this.f22485a = new C9683d(context, appConfigName, z10);
        }
        if (!this.f22485a.m19153o() && arrayList.contains("grs_sdk_global_route_config.json")) {
            this.f22485a = new C9682c(context, z10);
        }
        this.f22485a.m19146h(context, arrayList);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("on initLocalManager finish, check appGrs: ");
        sb2.append(this.f22485a.f22478a == null);
        Logger.m8580i("LocalManagerProxy", sb2.toString());
    }

    /* renamed from: f */
    public void m19165f(String str, C9609c c9609c) {
        String str2;
        try {
            c9609c.m18842f(str + "#localConfig", this.f22485a.m19145g().toString());
        } catch (JSONException unused) {
            str2 = "save local config encounter JSONException.";
            Logger.m8588w("LocalManagerProxy", str2);
        } catch (Throwable th) {
            str2 = "save local config encounter Throwable:" + StringUtils.anonymizeMessage(th.getMessage());
            Logger.m8588w("LocalManagerProxy", str2);
        }
    }

    /* renamed from: g */
    public boolean m19166g(Context context, String str) {
        boolean zM19154p = this.f22485a.m19154p(str);
        f22483b.put(context.getPackageName(), this);
        return zM19154p;
    }

    /* renamed from: h */
    public Set m19167h() {
        return this.f22485a.m19152n();
    }

    public C9681b(Context context, boolean z10) throws IOException {
        m19164e(context, z10);
        f22483b.put(context.getPackageName(), this);
    }
}
