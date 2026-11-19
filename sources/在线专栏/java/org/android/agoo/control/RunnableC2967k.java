package org.android.agoo.control;

import com.taobao.accs.client.AdapterGlobalClientInfo;

/* renamed from: org.android.agoo.control.k */
/* loaded from: classes.dex */
class RunnableC2967k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BaseIntentService f11452a;

    RunnableC2967k(BaseIntentService baseIntentService) {
        this.f11452a = baseIntentService;
    }

    @Override // java.lang.Runnable
    public void run() {
        AdapterGlobalClientInfo.mStartServiceTimes.incrementAndGet();
        BaseIntentService baseIntentService = this.f11452a;
        baseIntentService.agooFactory = AgooFactory.getInstance(baseIntentService.getApplicationContext());
        BaseIntentService baseIntentService2 = this.f11452a;
        baseIntentService2.notifyManager = baseIntentService2.agooFactory.getNotifyManager();
        BaseIntentService baseIntentService3 = this.f11452a;
        baseIntentService3.messageService = baseIntentService3.agooFactory.getMessageService();
    }
}
