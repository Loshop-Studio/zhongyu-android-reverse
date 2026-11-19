package com.taobao.accs;

/* loaded from: classes.dex */
public abstract class IAppReceiverV2 extends IAppReceiverV1 {
    @Override // com.taobao.accs.IAppReceiverV1
    @Deprecated
    public void onBindApp(int i4, String str) {
        onBindApp(i4, "", str);
    }

    public abstract void onBindApp(int i4, String str, String str2);

    @Override // com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public void onBindUser(String str, int i4) {
    }

    public void onBindUser(String str, int i4, String str2) {
        onBindUser(str, i4);
    }

    @Override // com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public void onUnbindApp(int i4) {
    }

    public void onUnbindApp(int i4, String str) {
        onUnbindApp(i4);
    }

    @Override // com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public void onUnbindUser(int i4) {
    }

    public void onUnbindUser(int i4, String str) {
        onUnbindUser(i4);
    }
}
