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
/* loaded from: classes5.dex */
class RunnableC7645e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f13073a;

    /* renamed from: b */
    final /* synthetic */ AbstractC7642b f13074b;

    public RunnableC7645e(AbstractC7642b abstractC7642b, Context context) {
        this.f13074b = abstractC7642b;
        this.f13073a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (UtilityImpl.m10161l(this.f13073a)) {
            ALog.m10116d(this.f13074b.mo10031d(), "startChannelService", new Object[0]);
            Intent intent = new Intent(Constants.ACTION_START_SERVICE);
            intent.putExtra(Constants.KEY_APP_KEY, this.f13074b.m10036i());
            intent.putExtra(Constants.KEY_TTID, this.f13074b.f13052a);
            intent.putExtra(Constants.KEY_PACKAGE_NAME, this.f13073a.getPackageName());
            intent.putExtra("app_sercet", this.f13074b.f13060i.getAppSecret());
            intent.putExtra(Constants.KEY_MODE, AccsClientConfig.mEnv);
            intent.putExtra(Constants.KEY_CONFIG_TAG, this.f13074b.f13064m);
            String packageName = this.f13073a.getPackageName();
            String str = AdapterUtilityImpl.channelService;
            intent.setClassName(packageName, str);
            IntentDispatch.dispatchIntent(this.f13073a, intent, str);
            Intent intent2 = new Intent();
            intent2.setAction("org.agoo.android.intent.action.REPORT");
            intent2.setPackage(this.f13073a.getPackageName());
            String agooCustomServiceName = AdapterGlobalClientInfo.getAgooCustomServiceName(this.f13073a);
            if (TextUtils.isEmpty(agooCustomServiceName)) {
                return;
            }
            intent2.setClassName(this.f13073a.getPackageName(), agooCustomServiceName);
            IntentDispatch.dispatchIntent(this.f13073a, intent2, agooCustomServiceName);
        }
    }
}
