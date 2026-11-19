package p203j5;

import android.content.Context;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.p071f.AbstractC7315e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p189i5.C9607a;
import p259n5.AbstractC10319c;
import p303q5.C10737a;
import p303q5.C10738b;
import p303q5.C10739c;
import p303q5.C10740d;

/* renamed from: j5.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9680a {

    /* renamed from: a */
    public C10737a f22478a;

    /* renamed from: b */
    public List f22479b;

    /* renamed from: c */
    public boolean f22480c = false;

    /* renamed from: d */
    public boolean f22481d = false;

    /* renamed from: e */
    public Set f22482e = new HashSet(16);

    /* renamed from: a */
    public int m19139a(String str, Context context) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(GrsApp.getInstance().getBrand(MqttTopic.TOPIC_LEVEL_SEPARATOR));
        sb2.append(str);
        return m19148j(sb2.toString(), context) != 0 ? -1 : 0;
    }

    /* renamed from: b */
    public String m19140b(Context context, C9607a c9607a, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z10) {
        Map mapM19143e = m19143e(context, c9607a, grsBaseInfo, str, z10);
        if (mapM19143e != null) {
            return (String) mapM19143e.get(str2);
        }
        Logger.m8590w("AbstractLocalManager", "addresses not found by routeby in local config{%s}", str);
        return null;
    }

    /* renamed from: c */
    public String m19141c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if ("no_route_country".equals(str)) {
            return "no-country";
        }
        List list = this.f22479b;
        if (list != null && !list.isEmpty()) {
            for (C10738b c10738b : this.f22479b) {
                if (c10738b.m22804a().contains(str)) {
                    return c10738b.m22807d();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045 A[PHI: r6
      0x0045: PHI (r6v10 java.lang.String) = (r6v6 java.lang.String), (r6v7 java.lang.String) binds: [B:10:0x0043, B:13:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List m19142d(org.json.JSONArray r10) throws org.json.JSONException {
        /*
            r9 = this;
            if (r10 == 0) goto L8c
            int r0 = r10.length()
            if (r0 != 0) goto La
            goto L8c
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 16
            r0.<init>(r1)
            r2 = 0
            r3 = r2
        L13:
            int r4 = r10.length()
            if (r3 >= r4) goto L8b
            org.json.JSONObject r4 = r10.getJSONObject(r3)
            q5.b r5 = new q5.b
            r5.<init>()
            java.lang.String r6 = "id"
            java.lang.String r6 = r4.getString(r6)
            r5.m22808e(r6)
            java.lang.String r6 = "name"
            java.lang.String r6 = r4.getString(r6)
            r5.m22810g(r6)
            java.lang.String r6 = "description"
            java.lang.String r6 = r4.getString(r6)
            r5.m22805b(r6)
            java.lang.String r6 = "countriesOrAreas"
            boolean r7 = r4.has(r6)
            if (r7 == 0) goto L4a
        L45:
            org.json.JSONArray r4 = r4.getJSONArray(r6)
            goto L5b
        L4a:
            java.lang.String r6 = "countries"
            boolean r7 = r4.has(r6)
            if (r7 == 0) goto L53
            goto L45
        L53:
            java.lang.String r4 = "AbstractLocalManager"
            java.lang.String r6 = "current country or area group has not config countries or areas."
            com.huawei.hms.framework.common.Logger.m8588w(r4, r6)
            r4 = 0
        L5b:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>(r1)
            if (r4 == 0) goto L85
            int r7 = r4.length()
            if (r7 != 0) goto L69
            goto L85
        L69:
            r7 = r2
        L6a:
            int r8 = r4.length()
            if (r7 >= r8) goto L7c
            java.lang.Object r8 = r4.get(r7)
            java.lang.String r8 = (java.lang.String) r8
            r6.add(r8)
            int r7 = r7 + 1
            goto L6a
        L7c:
            r5.m22806c(r6)
            r0.add(r5)
            int r3 = r3 + 1
            goto L13
        L85:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            return r10
        L8b:
            return r0
        L8c:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p203j5.AbstractC9680a.m19142d(org.json.JSONArray):java.util.List");
    }

    /* renamed from: e */
    public Map m19143e(Context context, C9607a c9607a, GrsBaseInfo grsBaseInfo, String str, boolean z10) {
        C10737a c10737a = this.f22478a;
        if (c10737a == null) {
            Logger.m8588w("AbstractLocalManager", "application data is null.");
            return null;
        }
        C10739c c10739cM22799b = c10737a.m22799b(str);
        if (c10739cM22799b == null) {
            Logger.m8590w("AbstractLocalManager", "service not found in local config{%s}", str);
            return null;
        }
        String strM8633b = AbstractC7315e.m8633b(context, c9607a, c10739cM22799b.m22815e(), grsBaseInfo, z10);
        if (strM8633b == null) {
            Logger.m8590w("AbstractLocalManager", "country not found by routeby in local config{%s}", c10739cM22799b.m22815e());
            return null;
        }
        List listM22811a = c10739cM22799b.m22811a();
        C10740d c10740dM22812b = c10739cM22799b.m22812b((listM22811a == null || listM22811a.size() == 0) ? m19141c(strM8633b) : (String) m19144f(listM22811a, grsBaseInfo, strM8633b).get(strM8633b));
        if (c10740dM22812b == null) {
            return null;
        }
        return c10740dM22812b.m22819a();
    }

    /* renamed from: f */
    public final Map m19144f(List list, GrsBaseInfo grsBaseInfo, String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        concurrentHashMap.put("no_route_country", "no-country");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10738b c10738b = (C10738b) it.next();
            if (c10738b.m22804a().contains(grsBaseInfo.getIssueCountry())) {
                concurrentHashMap.put(grsBaseInfo.getIssueCountry(), c10738b.m22807d());
            }
            if (c10738b.m22804a().contains(grsBaseInfo.getRegCountry())) {
                concurrentHashMap.put(grsBaseInfo.getRegCountry(), c10738b.m22807d());
            }
            if (c10738b.m22804a().contains(grsBaseInfo.getSerCountry())) {
                concurrentHashMap.put(grsBaseInfo.getSerCountry(), c10738b.m22807d());
            }
            if (c10738b.m22804a().contains(str)) {
                Logger.m8586v("AbstractLocalManager", "get countryGroupID from geoIp");
                concurrentHashMap.put(str, c10738b.m22807d());
            }
        }
        return concurrentHashMap;
    }

    /* renamed from: g */
    public JSONObject m19145g() throws JSONException {
        JSONObject jSONObjectM22802e = this.f22478a.m22802e();
        if (this.f22479b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f22479b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C10738b) it.next()).m22809f());
            }
            jSONObjectM22802e.put("countryGroups", jSONArray);
        }
        return jSONObjectM22802e;
    }

    /* renamed from: h */
    public void m19146h(Context context, List list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Logger.m8571d("AbstractLocalManager", "getBatchLoadSdkSuccessFlag file:" + str);
            if (TextUtils.isEmpty(str) || !Pattern.matches("^grs_sdk_global_route_config_[a-zA-Z]+\\.json$", str)) {
                Logger.m8572d("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, skipped.", str);
            } else {
                Object[] objArr = {str};
                if (m19159u(AbstractC10319c.m21529a(GrsApp.getInstance().getBrand(MqttTopic.TOPIC_LEVEL_SEPARATOR) + str, context)) == 0) {
                    Logger.m8572d("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, sucess.", objArr);
                } else {
                    Logger.m8590w("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, failure.", objArr);
                }
            }
        }
    }

    /* renamed from: i */
    public abstract int mo19147i(String str);

    /* renamed from: j */
    public final int m19148j(String str, Context context) {
        if (m19158t(AbstractC10319c.m21529a(str, context)) != 0) {
            return -1;
        }
        Logger.m8581i("AbstractLocalManager", "load APP_CONFIG_FILE success{%s}.", str);
        return 0;
    }

    /* renamed from: k */
    public C10737a m19149k() {
        return this.f22478a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[PHI: r10
      0x0060: PHI (r10v5 java.lang.String) = (r10v0 java.lang.String), (r10v1 java.lang.String) binds: [B:17:0x005e, B:20:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6 A[PHI: r5
      0x00c6: PHI (r5v10 java.lang.String) = (r5v8 java.lang.String), (r5v9 java.lang.String) binds: [B:33:0x00c4, B:36:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m19150l(org.json.JSONArray r15) throws org.json.JSONException {
        /*
            r14 = this;
            if (r15 == 0) goto Lf5
            int r0 = r15.length()
            if (r0 != 0) goto La
            goto Lf5
        La:
            r0 = 0
            r1 = r0
        Lc:
            int r2 = r15.length()
            if (r1 >= r2) goto Lf5
            org.json.JSONObject r2 = r15.getJSONObject(r1)
            q5.c r3 = new q5.c
            r3.<init>()
            java.lang.String r4 = "name"
            java.lang.String r4 = r2.getString(r4)
            r3.m22816f(r4)
            java.util.Set r5 = r14.f22482e
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto Lf1
            java.util.Set r5 = r14.f22482e
            r5.add(r4)
            boolean r5 = r14.f22481d
            if (r5 == 0) goto Lf1
            java.lang.String r5 = "routeBy"
            java.lang.String r5 = r2.getString(r5)
            r3.m22818h(r5)
            java.lang.String r5 = "servings"
            org.json.JSONArray r5 = r2.getJSONArray(r5)
            r6 = r0
        L45:
            int r7 = r5.length()
            java.lang.String r8 = "AbstractLocalManager"
            if (r6 >= r7) goto Lbe
            java.lang.Object r7 = r5.get(r6)
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            q5.d r9 = new q5.d
            r9.<init>()
            java.lang.String r10 = "countryOrAreaGroup"
            boolean r11 = r7.has(r10)
            if (r11 == 0) goto L65
        L60:
            java.lang.String r8 = r7.getString(r10)
            goto L79
        L65:
            java.lang.String r10 = "countryGroup"
            boolean r11 = r7.has(r10)
            if (r11 == 0) goto L6e
            goto L60
        L6e:
            java.lang.Object[] r10 = new java.lang.Object[]{r4}
            java.lang.String r11 = "maybe this service{%s} routeBy is unconditional."
            com.huawei.hms.framework.common.Logger.m8587v(r8, r11, r10)
            java.lang.String r8 = "no-country"
        L79:
            r9.m22820b(r8)
            java.lang.String r8 = "addresses"
            org.json.JSONObject r7 = r7.getJSONObject(r8)
            java.util.concurrent.ConcurrentHashMap r8 = new java.util.concurrent.ConcurrentHashMap
            r10 = 16
            r8.<init>(r10)
            java.util.Iterator r10 = r7.keys()
        L8d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lb1
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = r7.getString(r11)
            boolean r13 = android.text.TextUtils.isEmpty(r11)
            if (r13 != 0) goto L8d
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L8d
            java.lang.String r12 = r7.getString(r11)
            r8.put(r11, r12)
            goto L8d
        Lb1:
            r9.m22821c(r8)
            java.lang.String r7 = r9.m22822d()
            r3.m22813c(r7, r9)
            int r6 = r6 + 1
            goto L45
        Lbe:
            java.lang.String r5 = "countryOrAreaGroups"
            boolean r6 = r2.has(r5)
            if (r6 == 0) goto Lcf
        Lc6:
            org.json.JSONArray r2 = r2.getJSONArray(r5)
            java.util.List r2 = r14.m19142d(r2)
            goto Lde
        Lcf:
            java.lang.String r5 = "countryGroups"
            boolean r6 = r2.has(r5)
            if (r6 == 0) goto Ld8
            goto Lc6
        Ld8:
            java.lang.String r2 = "service use default countryOrAreaGroup"
            com.huawei.hms.framework.common.Logger.m8580i(r8, r2)
            r2 = 0
        Lde:
            r3.m22814d(r2)
            q5.a r2 = r14.f22478a
            if (r2 != 0) goto Lec
            q5.a r2 = new q5.a
            r2.<init>()
            r14.f22478a = r2
        Lec:
            q5.a r2 = r14.f22478a
            r2.m22801d(r4, r3)
        Lf1:
            int r1 = r1 + 1
            goto Lc
        Lf5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p203j5.AbstractC9680a.m19150l(org.json.JSONArray):void");
    }

    /* renamed from: m */
    public abstract int mo19151m(String str);

    /* renamed from: n */
    public Set m19152n() {
        return this.f22482e;
    }

    /* renamed from: o */
    public boolean m19153o() {
        return this.f22480c;
    }

    /* renamed from: p */
    public boolean m19154p(String str) {
        String str2;
        try {
            this.f22478a = new C10737a();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(HintConstants.AUTOFILL_HINT_NAME)) {
                this.f22478a.m22803f(jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME));
            }
            if (jSONObject.has("cacheControl")) {
                this.f22478a.m22800c(jSONObject.getLong("cacheControl"));
            }
            if (jSONObject.has("services")) {
                m19150l(jSONObject.getJSONArray("services"));
            }
            if (jSONObject.has("countryGroups")) {
                JSONArray jSONArray = jSONObject.getJSONArray("countryGroups");
                ArrayList arrayList = new ArrayList(16);
                this.f22479b = arrayList;
                arrayList.addAll(m19142d(jSONArray));
            }
            Logger.m8581i("AbstractLocalManager", "parse from sp services size : %d, countryGroups size: %d:", Integer.valueOf(this.f22482e.size()), Integer.valueOf(this.f22479b.size()));
            return true;
        } catch (JSONException unused) {
            str2 = "Parse local config from sp failed, JSONException";
            Logger.m8588w("AbstractLocalManager", str2);
            return false;
        } catch (Throwable th) {
            str2 = "Parse local config from sp failed, Throwable:" + StringUtils.anonymizeMessage(th.getMessage());
            Logger.m8588w("AbstractLocalManager", str2);
            return false;
        }
    }

    /* renamed from: q */
    public int m19155q(String str) throws JSONException {
        JSONArray jSONArray;
        this.f22479b = new ArrayList(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("countryOrAreaGroups")) {
                jSONArray = jSONObject.getJSONArray("countryOrAreaGroups");
            } else if (jSONObject.has("countryGroups")) {
                jSONArray = jSONObject.getJSONArray("countryGroups");
            } else {
                Logger.m8573e("AbstractLocalManager", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
                jSONArray = null;
            }
            if (jSONArray == null) {
                return -1;
            }
            this.f22479b.addAll(m19142d(jSONArray));
            return 0;
        } catch (JSONException e10) {
            Logger.m8590w("AbstractLocalManager", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return -1;
        }
    }

    /* renamed from: r */
    public int m19156r(String str) {
        try {
            m19150l(new JSONObject(str).getJSONArray("services"));
            return 0;
        } catch (JSONException e10) {
            Logger.m8590w("AbstractLocalManager", "parse 2.0 services failed maybe because of json style.please check! %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return -1;
        }
    }

    /* renamed from: s */
    public abstract int mo19157s(String str);

    /* renamed from: t */
    public final int m19158t(String str) {
        int iMo19151m;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (this.f22481d && (iMo19151m = mo19151m(str)) != 0) {
            return iMo19151m;
        }
        int iMo19147i = mo19147i(str);
        return iMo19147i != 0 ? iMo19147i : mo19157s(str);
    }

    /* renamed from: u */
    public final int m19159u(String str) {
        List list;
        int iM19155q;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return (!this.f22481d || !((list = this.f22479b) == null || list.isEmpty()) || (iM19155q = m19155q(str)) == 0) ? m19156r(str) : iM19155q;
    }
}
