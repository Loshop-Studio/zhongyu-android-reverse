package org.android.agoo.control;

import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.MsgDO;
import org.android.agoo.message.MessageService;

/* renamed from: org.android.agoo.control.f */
/* loaded from: classes.dex */
class RunnableC2962f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f11442a;

    /* renamed from: b */
    final /* synthetic */ String f11443b;

    /* renamed from: c */
    final /* synthetic */ AgooFactory f11444c;

    RunnableC2962f(AgooFactory agooFactory, String str, String str2) {
        this.f11444c = agooFactory;
        this.f11442a = str;
        this.f11443b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        MsgDO msgDO = null;
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.m6093i("AgooFactory", "clickMessage", "msgid", this.f11442a, AgooConstants.MESSAGE_EXT, this.f11443b);
            }
            if (TextUtils.isEmpty(this.f11442a)) {
                ALog.m6090d("AgooFactory", "messageId == null", new Object[0]);
                return;
            }
            MsgDO msgDO2 = new MsgDO();
            try {
                String str = this.f11442a;
                msgDO2.msgIds = str;
                msgDO2.extData = this.f11443b;
                msgDO2.messageSource = "accs";
                msgDO2.msgStatus = MessageService.MSG_ACCS_NOTIFY_CLICK;
                this.f11444c.updateMsgStatus(str, MessageService.MSG_ACCS_NOTIFY_CLICK);
                this.f11444c.notifyManager.reportNotifyMessage(msgDO2);
            } catch (Throwable th) {
                th = th;
                msgDO = msgDO2;
                try {
                    ALog.m6092e("AgooFactory", "clickMessage,error=" + th, new Object[0]);
                } finally {
                    if (msgDO != null) {
                        this.f11444c.notifyManager.reportNotifyMessage(msgDO);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
