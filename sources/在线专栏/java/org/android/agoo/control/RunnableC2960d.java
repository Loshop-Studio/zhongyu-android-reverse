package org.android.agoo.control;

import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AppMonitorAdapter;
import com.taobao.accs.utl.BaseMonitor;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.android.agoo.message.MessageService;
import org.json.JSONObject;

/* renamed from: org.android.agoo.control.d */
/* loaded from: classes.dex */
class RunnableC2960d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ byte[] f11436a;

    /* renamed from: b */
    final /* synthetic */ boolean f11437b;

    /* renamed from: c */
    final /* synthetic */ AgooFactory f11438c;

    RunnableC2960d(AgooFactory agooFactory, byte[] bArr, boolean z3) {
        this.f11438c = agooFactory;
        this.f11436a = bArr;
        this.f11437b = z3;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            String str = new String(this.f11436a, "utf-8");
            if (TextUtils.isEmpty(str)) {
                AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, "msg==null", 0.0d);
                return;
            }
            ALog.m6093i("AgooFactory", "message = " + str, new Object[0]);
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("api");
            String string2 = jSONObject.getString("id");
            String string3 = TextUtils.equals(string, "agooReport") ? jSONObject.getString("status") : null;
            if (TextUtils.equals(string, AgooConstants.AGOO_SERVICE_AGOOACK)) {
                AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_SUCCESS_ACK, "handlerACKMessage", 0.0d);
            }
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.m6093i("AgooFactory", "updateMsg data begin,api=" + string + ",id=" + string2 + ",status=" + string3 + ",reportTimes=" + Config.m10023g(AgooFactory.sContext), new Object[0]);
                }
                if (TextUtils.equals(string, "agooReport")) {
                    if (TextUtils.equals(string3, MessageService.MSG_ACCS_READY_REPORT) && this.f11437b) {
                        this.f11438c.messageService.m10037a(string2, "1");
                    } else if ((TextUtils.equals(string3, MessageService.MSG_ACCS_NOTIFY_CLICK) || TextUtils.equals(string3, MessageService.MSG_ACCS_NOTIFY_DISMISS)) && this.f11437b) {
                        this.f11438c.messageService.m10037a(string2, MessageService.MSG_DB_COMPLETE);
                    }
                    AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_SUCCESS_ACK, string3, 0.0d);
                    return;
                }
                return;
            }
            AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, "json key null", 0.0d);
        } catch (Throwable th) {
            ALog.m6092e("AgooFactory", "updateMsg get data error,e=" + th, new Object[0]);
            AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, "json exception", 0.0d);
        }
    }
}
