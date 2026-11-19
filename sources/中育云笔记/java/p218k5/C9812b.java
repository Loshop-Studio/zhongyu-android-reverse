package p218k5;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import org.json.JSONException;
import p173h5.C9492a;
import p189i5.C9607a;
import p189i5.C9609c;
import p247m5.C10202c;
import p259n5.AbstractC10321e;

/* renamed from: k5.b */
/* loaded from: classes5.dex */
public class C9812b {

    /* renamed from: a */
    public final Context f23015a;

    /* renamed from: b */
    public final GrsBaseInfo f23016b;

    /* renamed from: c */
    public final C9607a f23017c;

    public C9812b(Context context, C9607a c9607a, GrsBaseInfo grsBaseInfo) {
        this.f23015a = context;
        this.f23016b = grsBaseInfo;
        this.f23017c = c9607a;
    }

    /* renamed from: a */
    public String m19830a(boolean z10) {
        String strM19888a;
        String str = (String) C9492a.m18660h(this.f23017c.m18826a().m18837a("geoipCountryCode", ""), "geoip.countrycode").get("ROOT");
        Logger.m8580i("GeoipCountry", "geoIpCountry is: " + str);
        String strM18837a = this.f23017c.m18826a().m18837a("geoipCountryCodetime", "0");
        long j10 = 0;
        if (!TextUtils.isEmpty(strM18837a) && strM18837a.matches("\\d+")) {
            try {
                j10 = Long.parseLong(strM18837a);
            } catch (NumberFormatException e10) {
                Logger.m8589w("GeoipCountry", "convert urlParamKey from String to Long catch NumberFormatException.", e10);
            }
        }
        if (TextUtils.isEmpty(str) || AbstractC10321e.m21533a(Long.valueOf(j10))) {
            C10202c c10202c = new C10202c(this.f23016b, this.f23015a);
            c10202c.m21308b("geoip.countrycode");
            C9609c c9609cM18834i = this.f23017c.m18834i();
            if (c9609cM18834i != null) {
                try {
                    strM19888a = AbstractC9818h.m19888a(c9609cM18834i.m18837a("services", ""), c10202c.m21310d());
                } catch (JSONException e11) {
                    Logger.m8590w("GeoipCountry", "getGeoipCountry merge services occure jsonException. %s", StringUtils.anonymizeMessage(e11.getMessage()));
                    strM19888a = null;
                }
                if (!TextUtils.isEmpty(strM19888a)) {
                    c9609cM18834i.m18842f("services", strM19888a);
                }
            }
            if (z10) {
                C9814d c9814dM19882c = this.f23017c.m18832g().m19882c(c10202c, "geoip.countrycode", c9609cM18834i, -1);
                if (c9814dM19882c != null) {
                    str = (String) C9492a.m18660h(c9814dM19882c.m19873y(), "geoip.countrycode").get("ROOT");
                }
                Logger.m8580i("GeoipCountry", "sync request to query geoip.countrycode is:" + str);
            } else {
                Logger.m8580i("GeoipCountry", "async request to query geoip.countrycode");
                this.f23017c.m18832g().m19886h(c10202c, null, "geoip.countrycode", c9609cM18834i, -1);
            }
        }
        return str;
    }
}
