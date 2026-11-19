package p203j5;

import android.content.Context;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p303q5.C10737a;
import p303q5.C10738b;

/* renamed from: j5.d */
/* loaded from: classes5.dex */
public class C9683d extends AbstractC9680a {
    public C9683d(Context context, String str, boolean z10) {
        this.f22481d = z10;
        if (m19139a(TextUtils.isEmpty(str) ? "grs_app_global_route_config.json" : str, context) == 0) {
            this.f22480c = true;
        }
    }

    @Override // p203j5.AbstractC9680a
    /* renamed from: i */
    public int mo19147i(String str) throws JSONException {
        this.f22478a = new C10737a();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONArray("applications").getJSONObject(0);
            this.f22478a.m22803f(jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME));
            JSONArray jSONArray = jSONObject.getJSONArray("services");
            if (jSONArray != null && jSONArray.length() != 0) {
                if (jSONObject.has("customservices")) {
                    m19150l(jSONObject.getJSONArray("customservices"));
                }
                return 0;
            }
            return -1;
        } catch (JSONException e10) {
            Logger.m8590w("LocalManagerV2", "parse appbean failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return -1;
        }
    }

    @Override // p203j5.AbstractC9680a
    /* renamed from: m */
    public int mo19151m(String str) throws JSONException {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        this.f22479b = new ArrayList(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("countryOrAreaGroups")) {
                jSONArray = jSONObject.getJSONArray("countryOrAreaGroups");
            } else if (jSONObject.has("countryGroups")) {
                jSONArray = jSONObject.getJSONArray("countryGroups");
            } else {
                Logger.m8573e("LocalManagerV2", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
                jSONArray = null;
            }
            if (jSONArray == null) {
                return -1;
            }
            if (jSONArray.length() != 0) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    C10738b c10738b = new C10738b();
                    c10738b.m22808e(jSONObject2.getString(AgooConstants.MESSAGE_ID));
                    c10738b.m22810g(jSONObject2.getString(HintConstants.AUTOFILL_HINT_NAME));
                    c10738b.m22805b(jSONObject2.getString("description"));
                    if (jSONObject2.has("countriesOrAreas")) {
                        jSONArray2 = jSONObject2.getJSONArray("countriesOrAreas");
                    } else if (jSONObject2.has("countries")) {
                        jSONArray2 = jSONObject2.getJSONArray("countries");
                    } else {
                        Logger.m8588w("LocalManagerV2", "current country or area group has not config countries or areas.");
                        jSONArray2 = null;
                    }
                    HashSet hashSet = new HashSet(16);
                    if (jSONArray2 != null && jSONArray2.length() != 0) {
                        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                            hashSet.add((String) jSONArray2.get(i11));
                        }
                        c10738b.m22806c(hashSet);
                        this.f22479b.add(c10738b);
                    }
                    return -1;
                }
            }
            return 0;
        } catch (JSONException e10) {
            Logger.m8590w("LocalManagerV2", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return -1;
        }
    }

    @Override // p203j5.AbstractC9680a
    /* renamed from: s */
    public int mo19157s(String str) {
        return m19156r(str);
    }

    public C9683d(boolean z10, boolean z11) {
        this.f22481d = z11;
        this.f22480c = z10;
    }
}
