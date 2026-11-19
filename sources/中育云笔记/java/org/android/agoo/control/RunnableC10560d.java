package org.android.agoo.control;

import android.text.TextUtils;
import androidx.camera.video.AudioStats;
import androidx.core.app.NotificationCompat;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AppMonitorAdapter;
import com.taobao.accs.utl.BaseMonitor;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.android.agoo.message.MessageService;
import org.json.JSONObject;

/* renamed from: org.android.agoo.control.d */
/* loaded from: classes6.dex */
class RunnableC10560d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ byte[] f25318a;

    /* renamed from: b */
    final /* synthetic */ boolean f25319b;

    /* renamed from: c */
    final /* synthetic */ AgooFactory f25320c;

    public RunnableC10560d(AgooFactory agooFactory, byte[] bArr, boolean z10) {
        this.f25320c = agooFactory;
        this.f25318a = bArr;
        this.f25319b = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            String str = new String(this.f25318a, "utf-8");
            if (TextUtils.isEmpty(str)) {
                AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, "msg==null", AudioStats.AUDIO_AMPLITUDE_NONE);
                return;
            }
            ALog.m10119i("AgooFactory", "message = " + str, new Object[0]);
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("api");
            String string2 = jSONObject.getString(AgooConstants.MESSAGE_ID);
            String string3 = TextUtils.equals(string, "agooReport") ? jSONObject.getString(NotificationCompat.CATEGORY_STATUS) : null;
            if (TextUtils.equals(string, AgooConstants.AGOO_SERVICE_AGOOACK)) {
                AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_SUCCESS_ACK, "handlerACKMessage", AudioStats.AUDIO_AMPLITUDE_NONE);
            }
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.m10119i("AgooFactory", "updateMsg data begin,api=" + string + ",id=" + string2 + ",status=" + string3 + ",reportTimes=" + Config.m22241g(AgooFactory.sContext), new Object[0]);
                }
                if (TextUtils.equals(string, "agooReport")) {
                    if (TextUtils.equals(string3, "4") && this.f25319b) {
                        this.f25320c.messageService.m22255a(string2, "1");
                    } else if ((TextUtils.equals(string3, "8") || TextUtils.equals(string3, "9")) && this.f25319b) {
                        this.f25320c.messageService.m22255a(string2, MessageService.MSG_DB_COMPLETE);
                    }
                    AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_SUCCESS_ACK, string3, AudioStats.AUDIO_AMPLITUDE_NONE);
                    return;
                }
                return;
            }
            AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, "json key null", AudioStats.AUDIO_AMPLITUDE_NONE);
        } catch (Throwable th) {
            ALog.m10118e("AgooFactory", "updateMsg get data error,e=" + th, new Object[0]);
            AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, "json exception", AudioStats.AUDIO_AMPLITUDE_NONE);
        }
    }
}
