package com.taobao.accs.net;

import android.content.Intent;
import com.taobao.accs.common.Constants;
import com.taobao.accs.dispatch.IntentDispatch;
import com.taobao.accs.utl.AdapterUtilityImpl;

/* renamed from: com.taobao.accs.net.v */
/* loaded from: classes5.dex */
class RunnableC7662v implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7661u f13126a;

    public RunnableC7662v(C7661u c7661u) {
        this.f13126a = c7661u;
    }

    @Override // java.lang.Runnable
    public void run() {
        String packageName = this.f13126a.f13077a.getPackageName();
        Intent intent = new Intent();
        intent.setPackage(packageName);
        intent.setAction(Constants.ACTION_COMMAND);
        intent.putExtra("command", 201);
        String str = AdapterUtilityImpl.channelService;
        intent.setClassName(packageName, str);
        IntentDispatch.dispatchIntent(this.f13126a.f13077a.getApplicationContext(), intent, str);
    }
}
