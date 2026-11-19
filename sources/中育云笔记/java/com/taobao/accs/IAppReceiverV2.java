package com.taobao.accs;

/* loaded from: classes5.dex */
public abstract class IAppReceiverV2 extends IAppReceiverV1 {
    @Override // com.taobao.accs.IAppReceiverV1
    @Deprecated
    public void onBindApp(int i10, String str) {
        onBindApp(i10, "", str);
    }

    public abstract void onBindApp(int i10, String str, String str2);

    @Override // com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public void onBindUser(String str, int i10) {
    }

    @Override // com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public void onUnbindApp(int i10) {
    }

    @Override // com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public void onUnbindUser(int i10) {
    }

    public void onBindUser(String str, int i10, String str2) {
        onBindUser(str, i10);
    }

    public void onUnbindApp(int i10, String str) {
        onUnbindApp(i10);
    }

    public void onUnbindUser(int i10, String str) {
        onUnbindUser(i10);
    }
}
