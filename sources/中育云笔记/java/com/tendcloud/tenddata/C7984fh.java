package com.tendcloud.tenddata;

import androidx.autofill.HintConstants;
import anet.channel.strategy.dispatch.DispatchConstants;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.fh */
/* loaded from: classes5.dex */
public class C7984fh extends AbstractC7987fk {
    public C7984fh(String str, String str2) {
        m11979a(DispatchConstants.DOMAIN, str);
        m11979a(HintConstants.AUTOFILL_HINT_NAME, str2);
    }

    public void setData(Map<String, Object> map) {
        if (map != null) {
            m11979a("data", (Object) new JSONObject(map));
        }
    }
}
