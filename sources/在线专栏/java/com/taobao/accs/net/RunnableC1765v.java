package com.taobao.accs.net;

import android.content.Intent;
import com.taobao.accs.common.Constants;
import com.taobao.accs.dispatch.IntentDispatch;
import com.taobao.accs.utl.AdapterUtilityImpl;

/* renamed from: com.taobao.accs.net.v */
/* loaded from: classes.dex */
class RunnableC1765v implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1764u f7728a;

    RunnableC1765v(C1764u c1764u) {
        this.f7728a = c1764u;
    }

    @Override // java.lang.Runnable
    public void run() {
        String packageName = this.f7728a.f7679a.getPackageName();
        Intent intent = new Intent();
        intent.setPackage(packageName);
        intent.setAction(Constants.ACTION_COMMAND);
        intent.putExtra("command", 201);
        String str = AdapterUtilityImpl.channelService;
        intent.setClassName(packageName, str);
        IntentDispatch.dispatchIntent(this.f7728a.f7679a.getApplicationContext(), intent, str);
    }
}
