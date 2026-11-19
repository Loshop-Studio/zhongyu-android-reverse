package p203j5;

import android.content.Context;
import androidx.autofill.HintConstants;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p303q5.C10737a;
import p303q5.C10738b;

/* renamed from: j5.c */
/* loaded from: classes5.dex */
public class C9682c extends AbstractC9680a {
    public C9682c(Context context, boolean z10) {
        this.f22481d = z10;
        if (m19139a("grs_sdk_global_route_config.json", context) == 0) {
            this.f22480c = true;
        }
    }

    @Override // p203j5.AbstractC9680a
    /* renamed from: i */
    public int mo19147i(String str) throws JSONException {
        this.f22478a = new C10737a();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("application");
            String string = jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME);
            long j10 = jSONObject.getLong("cacheControl");
            JSONArray jSONArray = jSONObject.getJSONArray("services");
            this.f22478a.m22803f(string);
            this.f22478a.m22800c(j10);
            if (jSONArray != null) {
                if (jSONArray.length() != 0) {
                    return 0;
                }
            }
            return -1;
        } catch (JSONException e10) {
            Logger.m8590w("LocalManagerV1", "parse appbean failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return -1;
        }
    }

    @Override // p203j5.AbstractC9680a
    /* renamed from: m */
    public int mo19151m(String str) throws JSONException {
        JSONObject jSONObject;
        this.f22479b = new ArrayList(16);
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (jSONObject2.has("countryOrAreaGroups")) {
                jSONObject = jSONObject2.getJSONObject("countryOrAreaGroups");
            } else if (jSONObject2.has("countryGroups")) {
                jSONObject = jSONObject2.getJSONObject("countryGroups");
            } else {
                Logger.m8573e("LocalManagerV1", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
                jSONObject = null;
            }
            if (jSONObject == null) {
                return -1;
            }
            if (jSONObject.length() == 0) {
                return 0;
            }
            this.f22479b.addAll(m19169w(jSONObject));
            return 0;
        } catch (JSONException e10) {
            Logger.m8590w("LocalManagerV1", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010d A[Catch: JSONException -> 0x0072, TryCatch #0 {JSONException -> 0x0072, blocks: (B:3:0x000c, B:4:0x001d, B:6:0x0024, B:8:0x003a, B:10:0x0043, B:11:0x0056, B:13:0x005c, B:15:0x006d, B:23:0x0087, B:24:0x009d, B:26:0x00a3, B:28:0x00b7, B:30:0x00bd, B:32:0x00ce, B:18:0x0075, B:20:0x007b, B:21:0x0080, B:33:0x00e2, B:35:0x00ed, B:39:0x00fc, B:41:0x0106, B:43:0x010d, B:44:0x0114, B:36:0x00f2, B:38:0x00f8, B:40:0x0101), top: B:49:0x000c }] */
    @Override // p203j5.AbstractC9680a
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo19157s(java.lang.String r20) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p203j5.C9682c.mo19157s(java.lang.String):int");
    }

    /* renamed from: v */
    public List m19168v(JSONArray jSONArray, JSONObject jSONObject) {
        return (jSONObject == null || jSONObject.length() == 0) ? new ArrayList() : m19169w(jSONObject);
    }

    /* renamed from: w */
    public final List m19169w(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray;
        try {
            ArrayList arrayList = new ArrayList(16);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                C10738b c10738b = new C10738b();
                c10738b.m22808e(next);
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                c10738b.m22810g(jSONObject2.getString(HintConstants.AUTOFILL_HINT_NAME));
                c10738b.m22805b(jSONObject2.getString("description"));
                if (jSONObject2.has("countriesOrAreas")) {
                    jSONArray = jSONObject2.getJSONArray("countriesOrAreas");
                } else if (jSONObject2.has("countries")) {
                    jSONArray = jSONObject2.getJSONArray("countries");
                } else {
                    Logger.m8588w("LocalManagerV1", "current country or area group has not config countries or areas.");
                    jSONArray = null;
                }
                HashSet hashSet = new HashSet(16);
                if (jSONArray != null && jSONArray.length() != 0) {
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        hashSet.add((String) jSONArray.get(i10));
                    }
                    c10738b.m22806c(hashSet);
                    arrayList.add(c10738b);
                }
                return new ArrayList();
            }
            return arrayList;
        } catch (JSONException e10) {
            Logger.m8590w("LocalManagerV1", "parse countryGroups failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return new ArrayList();
        }
    }
}
