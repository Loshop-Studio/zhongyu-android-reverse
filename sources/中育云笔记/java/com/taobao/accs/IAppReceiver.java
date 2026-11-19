package com.taobao.accs;

import java.util.Map;

/* loaded from: classes5.dex */
public interface IAppReceiver {
    Map<String, String> getAllServices();

    String getService(String str);

    void onBindApp(int i10);

    void onBindUser(String str, int i10);

    void onData(String str, String str2, byte[] bArr);

    void onSendData(String str, int i10);

    void onUnbindApp(int i10);

    void onUnbindUser(int i10);
}
