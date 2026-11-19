package org.android.agoo.control;

import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.MsgDO;
import org.android.agoo.message.MessageService;

/* renamed from: org.android.agoo.control.g */
/* loaded from: classes.dex */
class RunnableC2963g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f11445a;

    /* renamed from: b */
    final /* synthetic */ String f11446b;

    /* renamed from: c */
    final /* synthetic */ AgooFactory f11447c;

    RunnableC2963g(AgooFactory agooFactory, String str, String str2) {
        this.f11447c = agooFactory;
        this.f11445a = str;
        this.f11446b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        MsgDO msgDO = null;
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.m6093i("AgooFactory", "dismissMessage", "msgid", this.f11445a, AgooConstants.MESSAGE_EXT, this.f11446b);
            }
            if (TextUtils.isEmpty(this.f11445a)) {
                ALog.m6090d("AgooFactory", "messageId == null", new Object[0]);
                return;
            }
            MsgDO msgDO2 = new MsgDO();
            try {
                String str = this.f11445a;
                msgDO2.msgIds = str;
                msgDO2.extData = this.f11446b;
                msgDO2.messageSource = "accs";
                msgDO2.msgStatus = MessageService.MSG_ACCS_NOTIFY_DISMISS;
                this.f11447c.updateMsgStatus(str, MessageService.MSG_ACCS_NOTIFY_DISMISS);
                this.f11447c.notifyManager.reportNotifyMessage(msgDO2);
            } catch (Throwable th) {
                th = th;
                msgDO = msgDO2;
                try {
                    ALog.m6092e("AgooFactory", "clickMessage,error=" + th, new Object[0]);
                } finally {
                    if (msgDO != null) {
                        this.f11447c.notifyManager.reportNotifyMessage(msgDO);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
