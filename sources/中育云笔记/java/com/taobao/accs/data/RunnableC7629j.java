package com.taobao.accs.data;

import android.content.Intent;
import android.text.TextUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.data.j */
/* loaded from: classes5.dex */
class RunnableC7629j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f13006a;

    /* renamed from: b */
    final /* synthetic */ MsgDistributeService f13007b;

    public RunnableC7629j(MsgDistributeService msgDistributeService, Intent intent) {
        this.f13007b = msgDistributeService;
        this.f13006a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        ALog.m10119i("MsgDistributeService", "onStartCommand send message", new Object[0]);
        ACCSManager.AccsRequest accsRequest = (ACCSManager.AccsRequest) this.f13006a.getSerializableExtra(Constants.KEY_SEND_REQDATA);
        String stringExtra = this.f13006a.getStringExtra(Constants.KEY_PACKAGE_NAME);
        String stringExtra2 = this.f13006a.getStringExtra(Constants.KEY_APP_KEY);
        String stringExtra3 = this.f13006a.getStringExtra(Constants.KEY_CONFIG_TAG);
        if (TextUtils.isEmpty(stringExtra3)) {
            stringExtra3 = stringExtra2;
        }
        ACCSManager.getAccsInstance(this.f13007b.getApplicationContext(), stringExtra2, stringExtra3).sendRequest(this.f13007b.getApplicationContext(), accsRequest, stringExtra, true);
    }
}
