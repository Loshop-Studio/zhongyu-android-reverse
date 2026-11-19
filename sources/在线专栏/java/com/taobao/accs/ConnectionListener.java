package com.taobao.accs;

/* loaded from: classes.dex */
public interface ConnectionListener {
    void onConnect();

    void onDisconnect(int i4, String str);
}
