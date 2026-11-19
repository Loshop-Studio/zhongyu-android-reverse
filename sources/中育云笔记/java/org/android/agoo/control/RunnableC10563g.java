package org.android.agoo.control;

import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.MsgDO;

/* renamed from: org.android.agoo.control.g */
/* loaded from: classes6.dex */
class RunnableC10563g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f25327a;

    /* renamed from: b */
    final /* synthetic */ String f25328b;

    /* renamed from: c */
    final /* synthetic */ AgooFactory f25329c;

    public RunnableC10563g(AgooFactory agooFactory, String str, String str2) {
        this.f25329c = agooFactory;
        this.f25327a = str;
        this.f25328b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        MsgDO msgDO = null;
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.m10119i("AgooFactory", "dismissMessage", "msgid", this.f25327a, AgooConstants.MESSAGE_EXT, this.f25328b);
            }
            if (TextUtils.isEmpty(this.f25327a)) {
                ALog.m10116d("AgooFactory", "messageId == null", new Object[0]);
                return;
            }
            MsgDO msgDO2 = new MsgDO();
            try {
                String str = this.f25327a;
                msgDO2.msgIds = str;
                msgDO2.extData = this.f25328b;
                msgDO2.messageSource = "accs";
                msgDO2.msgStatus = "9";
                this.f25329c.updateMsgStatus(str, "9");
                this.f25329c.notifyManager.reportNotifyMessage(msgDO2);
            } catch (Throwable th) {
                th = th;
                msgDO = msgDO2;
                try {
                    ALog.m10118e("AgooFactory", "clickMessage,error=" + th, new Object[0]);
                } finally {
                    if (msgDO != null) {
                        this.f25329c.notifyManager.reportNotifyMessage(msgDO);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
