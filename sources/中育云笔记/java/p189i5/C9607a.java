package p189i5;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.PeriodicWorkRequest;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p173h5.C9492a;
import p218k5.C9814d;
import p218k5.C9817g;
import p247m5.C10202c;
import p259n5.AbstractC10321e;

/* renamed from: i5.a */
/* loaded from: classes5.dex */
public class C9607a {

    /* renamed from: e */
    public static final String f22124e = "a";

    /* renamed from: f */
    public static final Map f22125f = new ConcurrentHashMap(16);

    /* renamed from: a */
    public final Map f22126a = new ConcurrentHashMap(16);

    /* renamed from: b */
    public final C9609c f22127b;

    /* renamed from: c */
    public final C9609c f22128c;

    /* renamed from: d */
    public final C9817g f22129d;

    public C9607a(C9609c c9609c, C9609c c9609c2, C9817g c9817g) {
        this.f22128c = c9609c2;
        this.f22127b = c9609c;
        this.f22129d = c9817g;
        c9817g.m19883d(this);
    }

    /* renamed from: a */
    public C9609c m18826a() {
        return this.f22127b;
    }

    /* renamed from: b */
    public Map m18827b(GrsBaseInfo grsBaseInfo, String str, C9608b c9608b, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        Map map = f22125f;
        Map map2 = (Map) map.get(grsParasKey);
        if (map2 != null && !map2.isEmpty()) {
            m18829d(grsBaseInfo, c9608b, context, str);
            return (Map) map2.get(str);
        }
        Logger.m8571d(f22124e, "Cache size is: " + map.size());
        return new HashMap();
    }

    /* renamed from: c */
    public void m18828c(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        this.f22127b.m18842f(grsParasKey + "time", "0");
        this.f22126a.remove(grsParasKey + "time");
        Map map = f22125f;
        map.remove(grsParasKey);
        Logger.m8571d(f22124e, "Cache size is: " + map.size());
        this.f22129d.m19884e(grsParasKey);
    }

    /* renamed from: d */
    public final void m18829d(GrsBaseInfo grsBaseInfo, C9608b c9608b, Context context, String str) {
        Long l10 = (Long) this.f22126a.get(grsBaseInfo.getGrsParasKey(true, true, context));
        if (AbstractC10321e.m21533a(l10)) {
            c9608b.m18835a(2);
            return;
        }
        if (AbstractC10321e.m21534b(l10, PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS)) {
            this.f22129d.m19886h(new C10202c(grsBaseInfo, context), null, str, this.f22128c, -1);
        }
        c9608b.m18835a(1);
    }

    /* renamed from: e */
    public final void m18830e(GrsBaseInfo grsBaseInfo, String str, Context context) {
        if (AbstractC10321e.m21534b((Long) this.f22126a.get(str), PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS)) {
            this.f22129d.m19886h(new C10202c(grsBaseInfo, context), null, null, this.f22128c, -1);
        }
    }

    /* renamed from: f */
    public void m18831f(GrsBaseInfo grsBaseInfo, C9814d c9814d, Context context, C10202c c10202c) {
        if (c9814d.m19868t() == 2) {
            Logger.m8588w(f22124e, "update cache from server failed");
            return;
        }
        if (c10202c.m21311e().size() == 0) {
            String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
            if (c9814d.m19842B()) {
                f22125f.put(grsParasKey, C9492a.m18659e(this.f22127b.m18837a(grsParasKey, "")));
            } else {
                this.f22127b.m18842f(grsParasKey, c9814d.m19873y());
                f22125f.put(grsParasKey, C9492a.m18659e(c9814d.m19873y()));
            }
            if (!TextUtils.isEmpty(c9814d.m19866r())) {
                this.f22127b.m18842f(grsParasKey + HttpHeaders.ETAG, c9814d.m19866r());
            }
            this.f22127b.m18842f(grsParasKey + "time", c9814d.m19849a());
            this.f22126a.put(grsParasKey, Long.valueOf(Long.parseLong(c9814d.m19849a())));
        } else {
            this.f22127b.m18842f("geoipCountryCode", c9814d.m19873y());
            this.f22127b.m18842f("geoipCountryCodetime", c9814d.m19849a());
        }
        Logger.m8571d(f22124e, "Cache size is: " + f22125f.size());
    }

    /* renamed from: g */
    public C9817g m18832g() {
        return this.f22129d;
    }

    /* renamed from: h */
    public void m18833h(GrsBaseInfo grsBaseInfo, Context context) throws NumberFormatException {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        String strM18837a = this.f22127b.m18837a(grsParasKey, "");
        String strM18837a2 = this.f22127b.m18837a(grsParasKey + "time", "0");
        long j10 = 0;
        if (!TextUtils.isEmpty(strM18837a2) && strM18837a2.matches("\\d+")) {
            try {
                j10 = Long.parseLong(strM18837a2);
            } catch (NumberFormatException e10) {
                Logger.m8589w(f22124e, "convert urlParamKey from String to Long catch NumberFormatException.", e10);
            }
        }
        Map map = f22125f;
        map.put(grsParasKey, C9492a.m18659e(strM18837a));
        Logger.m8571d(f22124e, "Cache size is: " + map.size());
        this.f22126a.put(grsParasKey, Long.valueOf(j10));
        m18830e(grsBaseInfo, grsParasKey, context);
    }

    /* renamed from: i */
    public C9609c m18834i() {
        return this.f22128c;
    }
}
