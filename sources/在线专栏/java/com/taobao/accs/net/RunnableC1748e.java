package com.taobao.accs.net;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.client.AdapterGlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.dispatch.IntentDispatch;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.accs.utl.UtilityImpl;

/* renamed from: com.taobao.accs.net.e */
/* loaded from: classes.dex */
class RunnableC1748e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f7675a;

    /* renamed from: b */
    final /* synthetic */ AbstractC1745b f7676b;

    RunnableC1748e(AbstractC1745b abstractC1745b, Context context) {
        this.f7676b = abstractC1745b;
        this.f7675a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (UtilityImpl.m6135l(this.f7675a)) {
            ALog.m6090d(this.f7676b.mo6005d(), "startChannelService", new Object[0]);
            Intent intent = new Intent(Constants.ACTION_START_SERVICE);
            intent.putExtra(Constants.KEY_APP_KEY, this.f7676b.m6010i());
            intent.putExtra(Constants.KEY_TTID, this.f7676b.f7654a);
            intent.putExtra(Constants.KEY_PACKAGE_NAME, this.f7675a.getPackageName());
            intent.putExtra("app_sercet", this.f7676b.f7662i.getAppSecret());
            intent.putExtra(Constants.KEY_MODE, AccsClientConfig.mEnv);
            intent.putExtra(Constants.KEY_CONFIG_TAG, this.f7676b.f7666m);
            String packageName = this.f7675a.getPackageName();
            String str = AdapterUtilityImpl.channelService;
            intent.setClassName(packageName, str);
            IntentDispatch.dispatchIntent(this.f7675a, intent, str);
            Intent intent2 = new Intent();
            intent2.setAction("org.agoo.android.intent.action.REPORT");
            intent2.setPackage(this.f7675a.getPackageName());
            String agooCustomServiceName = AdapterGlobalClientInfo.getAgooCustomServiceName(this.f7675a);
            if (TextUtils.isEmpty(agooCustomServiceName)) {
                return;
            }
            intent2.setClassName(this.f7675a.getPackageName(), agooCustomServiceName);
            IntentDispatch.dispatchIntent(this.f7675a, intent2, agooCustomServiceName);
        }
    }
}
