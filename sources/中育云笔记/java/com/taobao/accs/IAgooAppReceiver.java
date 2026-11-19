package com.taobao.accs;

import java.util.Map;

/* loaded from: classes5.dex */
public abstract class IAgooAppReceiver extends IAppReceiverV2 {
    @Override // com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public Map<String, String> getAllServices() {
        return null;
    }

    public abstract String getAppkey();

    @Override // com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public String getService(String str) {
        return null;
    }

    @Override // com.taobao.accs.IAppReceiverV2, com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public void onBindUser(String str, int i10) {
    }

    @Override // com.taobao.accs.IAppReceiverV2, com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public void onUnbindApp(int i10) {
    }

    @Override // com.taobao.accs.IAppReceiverV2, com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public void onUnbindUser(int i10) {
    }
}
