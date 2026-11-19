package com.taobao.accs.net;

import android.content.Context;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.common.Constants;
import com.taobao.accs.data.Message;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.taobao.accs.net.l */
/* loaded from: classes.dex */
class RunnableC1755l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1753j f7706a;

    RunnableC1755l(C1753j c1753j) {
        this.f7706a = c1753j;
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        this.f7706a.f7695t.mo5088i("sendAccsHeartbeatMessage");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dataType", "pingreq");
            jSONObject.put("timeInterval", this.f7706a.f7690o);
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, null, jSONObject.toString().getBytes(), UUID.randomUUID().toString());
        accsRequest.setTarget("accs-iot");
        accsRequest.setTargetServiceName("sal");
        C1753j c1753j = this.f7706a;
        Context context = c1753j.f7657d;
        String packageName = context.getPackageName();
        this.f7706a.f7662i.getAppKey();
        this.f7706a.mo5992a(Message.m5854a(c1753j, context, packageName, Constants.TARGET_SERVICE, accsRequest, true), true);
    }
}
