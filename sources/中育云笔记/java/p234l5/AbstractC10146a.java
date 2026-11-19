package p234l5;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import java.util.ArrayList;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p247m5.C10203d;
import p259n5.AbstractC10319c;

/* renamed from: l5.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10146a {

    /* renamed from: a */
    public static final String f24209a = "a";

    /* renamed from: b */
    public static C10203d f24210b;

    /* renamed from: c */
    public static final Object f24211c = new Object();

    /* renamed from: a */
    public static C10203d m21162a(Context context) {
        synchronized (f24211c) {
            try {
                C10203d c10203d = f24210b;
                if (c10203d != null) {
                    return c10203d;
                }
                String strM21529a = AbstractC10319c.m21529a(GrsApp.getInstance().getBrand(MqttTopic.TOPIC_LEVEL_SEPARATOR) + "grs_sdk_server_config.json", context);
                ArrayList arrayList = null;
                if (TextUtils.isEmpty(strM21529a)) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(strM21529a).getJSONObject("grs_server");
                    JSONArray jSONArray = jSONObject.getJSONArray("grs_base_url");
                    if (jSONArray != null && jSONArray.length() > 0) {
                        arrayList = new ArrayList();
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            arrayList.add(jSONArray.get(i10).toString());
                        }
                    }
                    C10203d c10203d2 = new C10203d();
                    f24210b = c10203d2;
                    c10203d2.m21317d(arrayList);
                    f24210b.m21316c(jSONObject.getString("grs_query_endpoint_2.0"));
                    f24210b.m21315b(jSONObject.getInt("grs_query_timeout"));
                } catch (JSONException e10) {
                    Logger.m8590w(f24209a, "getGrsServerBean catch JSONException: %s", StringUtils.anonymizeMessage(e10.getMessage()));
                }
                return f24210b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
