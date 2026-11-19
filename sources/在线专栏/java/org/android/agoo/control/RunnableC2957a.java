package org.android.agoo.control;

import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import com.umeng.analytics.pro.C1851ai;
import org.android.agoo.common.Config;
import org.android.agoo.message.MessageService;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: org.android.agoo.control.a */
/* loaded from: classes.dex */
class RunnableC2957a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ byte[] f11428a;

    /* renamed from: b */
    final /* synthetic */ String f11429b;

    /* renamed from: c */
    final /* synthetic */ AgooFactory f11430c;

    RunnableC2957a(AgooFactory agooFactory, byte[] bArr, String str) {
        this.f11430c = agooFactory;
        this.f11428a = bArr;
        this.f11429b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            String str = new String(this.f11428a, "utf-8");
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            if (length == 1) {
                String string = null;
                String string2 = null;
                for (int i4 = 0; i4 < length; i4++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i4);
                    if (jSONObject != null) {
                        string = jSONObject.getString(C1851ai.f8252aA);
                        string2 = jSONObject.getString(C1851ai.f8299av);
                    }
                }
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.m6093i("AgooFactory", "saveMsg msgId:" + string + ",message=" + str + ",currentPack=" + string2 + ",reportTimes=" + Config.m10023g(AgooFactory.sContext), new Object[0]);
                }
                if (TextUtils.isEmpty(string2) || !TextUtils.equals(string2, AgooFactory.sContext.getPackageName())) {
                    return;
                }
                if (TextUtils.isEmpty(this.f11429b)) {
                    this.f11430c.messageService.m10038a(string, str, MessageService.MSG_DB_READY_REPORT);
                } else {
                    this.f11430c.messageService.m10038a(string, str, this.f11429b);
                }
            }
        } catch (Throwable th) {
            ALog.m6092e("AgooFactory", "saveMsg fail:" + th.toString(), new Object[0]);
        }
    }
}
