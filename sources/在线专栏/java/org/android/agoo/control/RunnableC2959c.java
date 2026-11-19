package org.android.agoo.control;

import com.taobao.accs.utl.ALog;
import java.util.ArrayList;
import java.util.Iterator;
import org.android.agoo.common.MsgDO;

/* renamed from: org.android.agoo.control.c */
/* loaded from: classes.dex */
class RunnableC2959c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AgooFactory f11435a;

    RunnableC2959c(AgooFactory agooFactory) {
        this.f11435a = agooFactory;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList<MsgDO> arrayListM10035a = this.f11435a.messageService.m10035a();
        if (arrayListM10035a == null || arrayListM10035a.size() <= 0) {
            return;
        }
        ALog.m6092e("AgooFactory", "reportCacheMsg", "size", Integer.valueOf(arrayListM10035a.size()));
        Iterator<MsgDO> it = arrayListM10035a.iterator();
        while (it.hasNext()) {
            MsgDO next = it.next();
            if (next != null) {
                next.isFromCache = true;
                this.f11435a.notifyManager.report(next, null);
            }
        }
    }
}
