package org.android.agoo.control;

import com.taobao.accs.utl.ALog;
import java.util.ArrayList;
import org.android.agoo.common.MsgDO;

/* renamed from: org.android.agoo.control.c */
/* loaded from: classes6.dex */
class RunnableC10559c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AgooFactory f25317a;

    public RunnableC10559c(AgooFactory agooFactory) {
        this.f25317a = agooFactory;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList<MsgDO> arrayListM22253a = this.f25317a.messageService.m22253a();
        if (arrayListM22253a == null || arrayListM22253a.size() <= 0) {
            return;
        }
        ALog.m10118e("AgooFactory", "reportCacheMsg", "size", Integer.valueOf(arrayListM22253a.size()));
        int size = arrayListM22253a.size();
        int i10 = 0;
        while (i10 < size) {
            MsgDO msgDO = arrayListM22253a.get(i10);
            i10++;
            MsgDO msgDO2 = msgDO;
            if (msgDO2 != null) {
                msgDO2.isFromCache = true;
                this.f25317a.notifyManager.report(msgDO2, null);
            }
        }
    }
}
