package p173h5;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.IQueryUrlCallBack;
import com.huawei.hms.framework.network.grs.IQueryUrlsCallBack;
import com.huawei.hms.framework.network.grs.local.model.CountryCodeBean;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p189i5.C9607a;
import p189i5.C9608b;
import p189i5.C9609c;
import p203j5.C9681b;
import p218k5.C9814d;
import p218k5.C9817g;
import p247m5.C10202c;

/* renamed from: h5.a */
/* loaded from: classes5.dex */
public class C9492a {

    /* renamed from: e */
    public static final String f21916e = "a";

    /* renamed from: a */
    public final GrsBaseInfo f21917a;

    /* renamed from: b */
    public C9607a f21918b;

    /* renamed from: c */
    public C9817g f21919c;

    /* renamed from: d */
    public C9609c f21920d;

    /* renamed from: h5.a$a */
    public static class a implements InterfaceC9493b {

        /* renamed from: a */
        public String f21921a;

        /* renamed from: b */
        public Map f21922b;

        /* renamed from: c */
        public IQueryUrlsCallBack f21923c;

        /* renamed from: d */
        public Context f21924d;

        /* renamed from: e */
        public GrsBaseInfo f21925e;

        /* renamed from: f */
        public C9607a f21926f;

        public a(String str, Map map, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, GrsBaseInfo grsBaseInfo, C9607a c9607a) {
            this.f21921a = str;
            this.f21922b = map;
            this.f21923c = iQueryUrlsCallBack;
            this.f21924d = context;
            this.f21925e = grsBaseInfo;
            this.f21926f = c9607a;
        }

        @Override // p173h5.InterfaceC9493b
        /* renamed from: a */
        public void mo18668a() {
            Map map = this.f21922b;
            if (map != null && !map.isEmpty()) {
                Logger.m8581i(C9492a.f21916e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f21921a, StringUtils.anonymizeMessage(new JSONObject(this.f21922b).toString()));
                this.f21923c.onCallBackSuccess(this.f21922b);
                return;
            }
            if (this.f21922b != null) {
                Logger.m8581i(C9492a.f21916e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", this.f21921a);
                this.f21923c.onCallBackFail(-3);
                return;
            }
            Logger.m8580i(C9492a.f21916e, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File");
            Map<String, String> mapM19162c = C9681b.m19160a(this.f21924d.getPackageName()).m19162c(this.f21924d, this.f21926f, this.f21925e, this.f21921a, true);
            if (mapM19162c == null || mapM19162c.isEmpty()) {
                Logger.m8575e(C9492a.f21916e, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", this.f21921a);
            }
            if (mapM19162c == null) {
                mapM19162c = new ConcurrentHashMap<>();
            }
            Logger.m8581i(C9492a.f21916e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f21921a, StringUtils.anonymizeMessage(new JSONObject(mapM19162c).toString()));
            this.f21923c.onCallBackSuccess(mapM19162c);
        }

        @Override // p173h5.InterfaceC9493b
        /* renamed from: a */
        public void mo18669a(C9814d c9814d) {
            String strM19873y = c9814d.m19873y();
            Map<String, String> mapM18660h = C9492a.m18660h(strM19873y, this.f21921a);
            if (!mapM18660h.isEmpty()) {
                Logger.m8581i(C9492a.f21916e, "GrsClientManager.ayncGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s", this.f21921a, StringUtils.anonymizeMessage(new JSONObject(mapM18660h).toString()));
                this.f21923c.onCallBackSuccess(mapM18660h);
                return;
            }
            Map map = this.f21922b;
            if (map != null && !map.isEmpty()) {
                Logger.m8581i(C9492a.f21916e, "GrsClientManager.ayncGetGrsUrls: Return [%s][%s] Url: %s", this.f21921a, StringUtils.anonymizeMessage(new JSONObject(this.f21922b).toString()));
                this.f21923c.onCallBackSuccess(this.f21922b);
                return;
            }
            if (this.f21922b != null) {
                Logger.m8581i(C9492a.f21916e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", this.f21921a);
                this.f21923c.onCallBackFail(-5);
                return;
            }
            if (!TextUtils.isEmpty(strM19873y)) {
                Logger.m8575e(C9492a.f21916e, "The serviceName[%s] is not configured on the GRS server.", this.f21921a);
            }
            Logger.m8580i(C9492a.f21916e, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File");
            Map<String, String> mapM19162c = C9681b.m19160a(this.f21924d.getPackageName()).m19162c(this.f21924d, this.f21926f, this.f21925e, this.f21921a, true);
            if (mapM19162c == null || mapM19162c.isEmpty()) {
                Logger.m8575e(C9492a.f21916e, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", this.f21921a);
            }
            if (mapM19162c == null) {
                mapM19162c = new ConcurrentHashMap<>();
            }
            Logger.m8581i(C9492a.f21916e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f21921a, StringUtils.anonymizeMessage(new JSONObject(mapM19162c).toString()));
            this.f21923c.onCallBackSuccess(mapM19162c);
        }
    }

    /* renamed from: h5.a$b */
    public static class b implements InterfaceC9493b {

        /* renamed from: a */
        public String f21927a;

        /* renamed from: b */
        public String f21928b;

        /* renamed from: c */
        public IQueryUrlCallBack f21929c;

        /* renamed from: d */
        public String f21930d;

        /* renamed from: e */
        public Context f21931e;

        /* renamed from: f */
        public GrsBaseInfo f21932f;

        /* renamed from: g */
        public C9607a f21933g;

        public b(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, String str3, Context context, GrsBaseInfo grsBaseInfo, C9607a c9607a) {
            this.f21927a = str;
            this.f21928b = str2;
            this.f21929c = iQueryUrlCallBack;
            this.f21930d = str3;
            this.f21931e = context;
            this.f21932f = grsBaseInfo;
            this.f21933g = c9607a;
        }

        @Override // p173h5.InterfaceC9493b
        /* renamed from: a */
        public void mo18668a() {
            if (!TextUtils.isEmpty(this.f21930d)) {
                Logger.m8581i(C9492a.f21916e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f21927a, this.f21928b, StringUtils.anonymizeMessage(this.f21930d));
                this.f21929c.onCallBackSuccess(this.f21930d);
                return;
            }
            if (!TextUtils.isEmpty(this.f21930d)) {
                Logger.m8581i(C9492a.f21916e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", this.f21927a, this.f21928b);
                this.f21929c.onCallBackFail(-3);
                return;
            }
            Logger.m8580i(C9492a.f21916e, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File");
            String strM19161b = C9681b.m19160a(this.f21931e.getPackageName()).m19161b(this.f21931e, this.f21933g, this.f21932f, this.f21927a, this.f21928b, true);
            if (strM19161b == null || strM19161b.isEmpty()) {
                Logger.m8575e(C9492a.f21916e, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", this.f21927a, this.f21928b);
            }
            Logger.m8581i(C9492a.f21916e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f21927a, this.f21928b, StringUtils.anonymizeMessage(strM19161b));
            this.f21929c.onCallBackSuccess(strM19161b);
        }

        @Override // p173h5.InterfaceC9493b
        /* renamed from: a */
        public void mo18669a(C9814d c9814d) {
            String strM19873y = c9814d.m19873y();
            Map mapM18660h = C9492a.m18660h(strM19873y, this.f21927a);
            if (mapM18660h.containsKey(this.f21928b)) {
                String str = C9492a.f21916e;
                String str2 = this.f21927a;
                String str3 = this.f21928b;
                Logger.m8581i(str, "GrsClientManager.ayncGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s", str2, str3, StringUtils.anonymizeMessage((String) mapM18660h.get(str3)));
                this.f21929c.onCallBackSuccess((String) mapM18660h.get(this.f21928b));
                return;
            }
            if (!TextUtils.isEmpty(this.f21930d)) {
                String str4 = C9492a.f21916e;
                String str5 = this.f21927a;
                String str6 = this.f21928b;
                Logger.m8581i(str4, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", str5, str6, StringUtils.anonymizeMessage((String) mapM18660h.get(str6)));
                this.f21929c.onCallBackSuccess(this.f21930d);
                return;
            }
            if (!TextUtils.isEmpty(this.f21930d)) {
                Logger.m8581i(C9492a.f21916e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", this.f21927a, this.f21928b);
                this.f21929c.onCallBackFail(-5);
                return;
            }
            if (!TextUtils.isEmpty(strM19873y)) {
                Logger.m8575e(C9492a.f21916e, "The serviceName[%s][%s] is not configured on the GRS server.", this.f21927a, this.f21928b);
            }
            Logger.m8580i(C9492a.f21916e, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File");
            String strM19161b = C9681b.m19160a(this.f21931e.getPackageName()).m19161b(this.f21931e, this.f21933g, this.f21932f, this.f21927a, this.f21928b, true);
            if (strM19161b == null || strM19161b.isEmpty()) {
                Logger.m8575e(C9492a.f21916e, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", this.f21927a, this.f21928b);
            }
            Logger.m8581i(C9492a.f21916e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f21927a, this.f21928b, StringUtils.anonymizeMessage(strM19161b));
            this.f21929c.onCallBackSuccess(strM19161b);
        }
    }

    public C9492a(GrsBaseInfo grsBaseInfo, C9607a c9607a, C9817g c9817g, C9609c c9609c) {
        this.f21917a = grsBaseInfo;
        this.f21918b = c9607a;
        this.f21919c = c9817g;
        this.f21920d = c9609c;
    }

    /* renamed from: a */
    public static CountryCodeBean m18657a(Context context, boolean z10) {
        return new CountryCodeBean(context, z10);
    }

    /* renamed from: e */
    public static Map m18659e(String str) throws JSONException {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        if (TextUtils.isEmpty(str)) {
            Logger.m8586v(f21916e, "isSpExpire jsonValue is null.");
            return concurrentHashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (!TextUtils.isEmpty(next)) {
                    concurrentHashMap.put(next, m18661i(jSONObject2));
                }
            }
            return concurrentHashMap;
        } catch (JSONException e10) {
            Logger.m8590w(f21916e, "getServicesUrlsMap occur a JSONException: %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return concurrentHashMap;
        }
    }

    /* renamed from: h */
    public static Map m18660h(String str, String str2) {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str)) {
            Logger.m8588w(f21916e, "isSpExpire jsonValue from server is null.");
            return map;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.has(str2) ? jSONObject.getJSONObject(str2) : null;
            if (jSONObject2 == null) {
                Logger.m8590w(f21916e, "getServiceNameUrls: paser null from server json data by {%s}.", str2);
                return map;
            }
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject2.get(next).toString());
            }
            return map;
        } catch (JSONException e10) {
            Logger.m8590w(f21916e, "Method{getServiceNameUrls} query url from SP occur an JSONException: %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return map;
        }
    }

    /* renamed from: i */
    public static Map m18661i(JSONObject jSONObject) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.get(next).toString();
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string)) {
                    concurrentHashMap.put(next, string);
                }
            }
            return concurrentHashMap;
        } catch (JSONException e10) {
            Logger.m8590w(f21916e, "getServiceUrls occur a JSONException: %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return concurrentHashMap;
        }
    }

    /* renamed from: c */
    public String m18662c(Context context, String str, int i10) {
        C9814d c9814dM19882c = this.f21919c.m19882c(new C10202c(this.f21917a, context), str, this.f21920d, i10);
        return c9814dM19882c == null ? "" : c9814dM19882c.m19842B() ? this.f21918b.m18826a().m18837a(this.f21917a.getGrsParasKey(true, true, context), "") : c9814dM19882c.m19873y();
    }

    /* renamed from: d */
    public String m18663d(String str, String str2, Context context, int i10) {
        String str3;
        String str4;
        C9608b c9608b = new C9608b();
        String strM19161b = (String) m18665g(str, c9608b, context).get(str2);
        if (c9608b.m18836b() && !TextUtils.isEmpty(strM19161b)) {
            Logger.m8581i(f21916e, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(strM19161b));
            return strM19161b;
        }
        String strM18662c = m18662c(context, str, i10);
        String str5 = (String) m18660h(strM18662c, str).get(str2);
        if (!TextUtils.isEmpty(str5)) {
            Logger.m8581i(f21916e, "GrsClientManager.synGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str5));
            return str5;
        }
        if (TextUtils.isEmpty(strM19161b)) {
            if (!TextUtils.isEmpty(strM18662c)) {
                Logger.m8575e(f21916e, "The serviceName[%s][%s] is not configured on the GRS server.", str, str2);
            }
            String str6 = f21916e;
            Logger.m8580i(str6, "GrsClientManager.synGetGrsUrl: Get URL from Local JSON File.");
            str3 = str;
            str4 = str2;
            strM19161b = C9681b.m19160a(context.getPackageName()).m19161b(context, this.f21918b, this.f21917a, str3, str4, true);
            if (strM19161b == null || strM19161b.isEmpty()) {
                Logger.m8575e(str6, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", str3, str4);
            }
        } else {
            str3 = str;
            str4 = str2;
        }
        Logger.m8581i(f21916e, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s", str3, str4, StringUtils.anonymizeMessage(strM19161b));
        return strM19161b;
    }

    /* renamed from: f */
    public Map m18664f(String str, Context context, int i10) {
        String str2;
        C9608b c9608b = new C9608b();
        Map mapM18665g = m18665g(str, c9608b, context);
        if (c9608b.m18836b() && !mapM18665g.isEmpty()) {
            Logger.m8581i(f21916e, "Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(mapM18665g).toString()));
            return mapM18665g;
        }
        String strM18662c = m18662c(context, str, i10);
        Map mapM18660h = m18660h(strM18662c, str);
        if (!mapM18660h.isEmpty()) {
            Logger.m8581i(f21916e, "GrsClientManager.synGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(mapM18660h).toString()));
            return mapM18660h;
        }
        if (mapM18665g.isEmpty()) {
            if (!TextUtils.isEmpty(strM18662c)) {
                Logger.m8575e(f21916e, "The serviceName[%s] is not configured on the GRS server.", str);
            }
            String str3 = f21916e;
            Logger.m8580i(str3, "GrsClientManager.synGetGrsUrls: Get URL from Local JSON File.");
            str2 = str;
            mapM18665g = C9681b.m19160a(context.getPackageName()).m19162c(context, this.f21918b, this.f21917a, str2, true);
            if (mapM18665g == null || mapM18665g.isEmpty()) {
                Logger.m8575e(str3, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", str2);
            }
        } else {
            str2 = str;
        }
        Logger.m8581i(f21916e, "GrsClientManager.synGetGrsUrls: Return [%s] Urls: %s", str2, StringUtils.anonymizeMessage(mapM18665g != null ? new JSONObject(mapM18665g).toString() : ""));
        return mapM18665g;
    }

    /* renamed from: g */
    public final Map m18665g(String str, C9608b c9608b, Context context) {
        Map mapM18827b = this.f21918b.m18827b(this.f21917a, str, c9608b, context);
        if (mapM18827b != null && !mapM18827b.isEmpty()) {
            Logger.m8580i(f21916e, "GrsClientManager.getUrlsLocal: Get URL from GRS Server Cache");
            return mapM18827b;
        }
        Map mapM19162c = C9681b.m19160a(context.getPackageName()).m19162c(context, this.f21918b, this.f21917a, str, false);
        Logger.m8580i(f21916e, "GrsClientManager.getUrlsLocal: Get URL from Local JSON File");
        return mapM19162c != null ? mapM19162c : new HashMap();
    }

    /* renamed from: j */
    public void m18666j(String str, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, int i10) {
        C9608b c9608b = new C9608b();
        Map<String, String> mapM18665g = m18665g(str, c9608b, context);
        if (!c9608b.m18836b()) {
            this.f21919c.m19886h(new C10202c(this.f21917a, context), new a(str, mapM18665g, iQueryUrlsCallBack, context, this.f21917a, this.f21918b), str, this.f21920d, i10);
        } else if (mapM18665g.isEmpty()) {
            Logger.m8581i(f21916e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", str);
            iQueryUrlsCallBack.onCallBackFail(-5);
        } else {
            String str2 = f21916e;
            Logger.m8581i(str2, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(mapM18665g).toString()));
            Logger.m8581i(str2, "ayncGetGrsUrls: %s", StringUtils.anonymizeMessage(new JSONObject(mapM18665g).toString()));
            iQueryUrlsCallBack.onCallBackSuccess(mapM18665g);
        }
    }

    /* renamed from: k */
    public void m18667k(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, Context context, int i10) {
        C9608b c9608b = new C9608b();
        String str3 = (String) m18665g(str, c9608b, context).get(str2);
        if (!c9608b.m18836b()) {
            this.f21919c.m19886h(new C10202c(this.f21917a, context), new b(str, str2, iQueryUrlCallBack, str3, context, this.f21917a, this.f21918b), str, this.f21920d, i10);
        } else if (TextUtils.isEmpty(str3)) {
            Logger.m8581i(f21916e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", str, str2);
            iQueryUrlCallBack.onCallBackFail(-5);
        } else {
            Logger.m8581i(f21916e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str3));
            iQueryUrlCallBack.onCallBackSuccess(str3);
        }
    }
}
