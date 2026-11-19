package org.android.agoo.control;

import com.taobao.accs.client.AdapterGlobalClientInfo;

/* renamed from: org.android.agoo.control.k */
/* loaded from: classes6.dex */
class RunnableC10567k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BaseIntentService f25334a;

    public RunnableC10567k(BaseIntentService baseIntentService) {
        this.f25334a = baseIntentService;
    }

    @Override // java.lang.Runnable
    public void run() {
        AdapterGlobalClientInfo.mStartServiceTimes.incrementAndGet();
        BaseIntentService baseIntentService = this.f25334a;
        baseIntentService.agooFactory = AgooFactory.getInstance(baseIntentService.getApplicationContext());
        BaseIntentService baseIntentService2 = this.f25334a;
        baseIntentService2.notifyManager = baseIntentService2.agooFactory.getNotifyManager();
        BaseIntentService baseIntentService3 = this.f25334a;
        baseIntentService3.messageService = baseIntentService3.agooFactory.getMessageService();
    }
}
