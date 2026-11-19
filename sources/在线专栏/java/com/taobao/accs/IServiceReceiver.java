package com.taobao.accs;

/* loaded from: classes.dex */
public interface IServiceReceiver {
    void onBind(String str, int i4);

    void onData(String str, String str2, String str3, byte[] bArr);

    void onResponse(String str, String str2, int i4, byte[] bArr);

    void onSendData(String str, String str2, int i4);

    void onUnbind(String str, int i4);
}
