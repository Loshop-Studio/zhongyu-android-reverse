package com.taobao.accs;

import java.util.Map;

/* loaded from: classes.dex */
public abstract class IAppReceiverV1 implements IAppReceiver {
    @Override // com.taobao.accs.IAppReceiver
    public abstract Map<String, String> getAllServices();

    @Override // com.taobao.accs.IAppReceiver
    public abstract String getService(String str);

    @Override // com.taobao.accs.IAppReceiver
    @Deprecated
    public void onBindApp(int i4) {
        onBindApp(i4, "");
    }

    public abstract void onBindApp(int i4, String str);

    @Override // com.taobao.accs.IAppReceiver
    public abstract void onBindUser(String str, int i4);

    @Override // com.taobao.accs.IAppReceiver
    public void onData(String str, String str2, byte[] bArr) {
    }

    @Override // com.taobao.accs.IAppReceiver
    public void onSendData(String str, int i4) {
    }

    @Override // com.taobao.accs.IAppReceiver
    public abstract void onUnbindApp(int i4);

    @Override // com.taobao.accs.IAppReceiver
    public abstract void onUnbindUser(int i4);
}
