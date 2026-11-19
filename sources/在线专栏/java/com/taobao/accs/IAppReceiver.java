package com.taobao.accs;

import java.util.Map;

/* loaded from: classes.dex */
public interface IAppReceiver {
    Map<String, String> getAllServices();

    String getService(String str);

    void onBindApp(int i4);

    void onBindUser(String str, int i4);

    void onData(String str, String str2, byte[] bArr);

    void onSendData(String str, int i4);

    void onUnbindApp(int i4);

    void onUnbindUser(int i4);
}
