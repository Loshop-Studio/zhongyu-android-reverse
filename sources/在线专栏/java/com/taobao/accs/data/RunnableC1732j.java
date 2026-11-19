package com.taobao.accs.data;

import android.content.Intent;
import android.text.TextUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.data.j */
/* loaded from: classes.dex */
class RunnableC1732j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f7608a;

    /* renamed from: b */
    final /* synthetic */ MsgDistributeService f7609b;

    RunnableC1732j(MsgDistributeService msgDistributeService, Intent intent) {
        this.f7609b = msgDistributeService;
        this.f7608a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        ALog.m6093i("MsgDistributeService", "onStartCommand send message", new Object[0]);
        ACCSManager.AccsRequest accsRequest = (ACCSManager.AccsRequest) this.f7608a.getSerializableExtra(Constants.KEY_SEND_REQDATA);
        String stringExtra = this.f7608a.getStringExtra(Constants.KEY_PACKAGE_NAME);
        String stringExtra2 = this.f7608a.getStringExtra(Constants.KEY_APP_KEY);
        String stringExtra3 = this.f7608a.getStringExtra(Constants.KEY_CONFIG_TAG);
        if (TextUtils.isEmpty(stringExtra3)) {
            stringExtra3 = stringExtra2;
        }
        ACCSManager.getAccsInstance(this.f7609b.getApplicationContext(), stringExtra2, stringExtra3).sendRequest(this.f7609b.getApplicationContext(), accsRequest, stringExtra, true);
    }
}
