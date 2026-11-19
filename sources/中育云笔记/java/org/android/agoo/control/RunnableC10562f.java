package org.android.agoo.control;

import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.MsgDO;

/* renamed from: org.android.agoo.control.f */
/* loaded from: classes6.dex */
class RunnableC10562f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f25324a;

    /* renamed from: b */
    final /* synthetic */ String f25325b;

    /* renamed from: c */
    final /* synthetic */ AgooFactory f25326c;

    public RunnableC10562f(AgooFactory agooFactory, String str, String str2) {
        this.f25326c = agooFactory;
        this.f25324a = str;
        this.f25325b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        MsgDO msgDO = null;
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.m10119i("AgooFactory", "clickMessage", "msgid", this.f25324a, AgooConstants.MESSAGE_EXT, this.f25325b);
            }
            if (TextUtils.isEmpty(this.f25324a)) {
                ALog.m10116d("AgooFactory", "messageId == null", new Object[0]);
                return;
            }
            MsgDO msgDO2 = new MsgDO();
            try {
                String str = this.f25324a;
                msgDO2.msgIds = str;
                msgDO2.extData = this.f25325b;
                msgDO2.messageSource = "accs";
                msgDO2.msgStatus = "8";
                this.f25326c.updateMsgStatus(str, "8");
                this.f25326c.notifyManager.reportNotifyMessage(msgDO2);
            } catch (Throwable th) {
                th = th;
                msgDO = msgDO2;
                try {
                    ALog.m10118e("AgooFactory", "clickMessage,error=" + th, new Object[0]);
                } finally {
                    if (msgDO != null) {
                        this.f25326c.notifyManager.reportNotifyMessage(msgDO);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
