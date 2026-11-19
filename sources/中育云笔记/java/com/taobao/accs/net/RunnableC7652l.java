package com.taobao.accs.net;

import android.content.Context;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.common.Constants;
import com.taobao.accs.data.Message;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.taobao.accs.net.l */
/* loaded from: classes5.dex */
class RunnableC7652l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7650j f13104a;

    public RunnableC7652l(C7650j c7650j) {
        this.f13104a = c7650j;
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        this.f13104a.f13093t.mo3538i("sendAccsHeartbeatMessage");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dataType", "pingreq");
            jSONObject.put("timeInterval", this.f13104a.f13088o);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, null, jSONObject.toString().getBytes(), UUID.randomUUID().toString());
        accsRequest.setTarget("accs-iot");
        accsRequest.setTargetServiceName("sal");
        C7650j c7650j = this.f13104a;
        Context context = c7650j.f13055d;
        String packageName = context.getPackageName();
        this.f13104a.f13060i.getAppKey();
        this.f13104a.mo10018a(Message.m9880a(c7650j, context, packageName, Constants.TARGET_SERVICE, accsRequest, true), true);
    }
}
