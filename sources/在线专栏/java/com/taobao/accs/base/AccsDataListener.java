package com.taobao.accs.base;

import com.taobao.accs.base.TaoBaseService;

/* loaded from: classes.dex */
public interface AccsDataListener {
    @Deprecated
    void onAntiBrush(boolean z3, TaoBaseService.ExtraInfo extraInfo);

    void onBind(String str, int i4, TaoBaseService.ExtraInfo extraInfo);

    @Deprecated
    void onConnected(TaoBaseService.ConnectInfo connectInfo);

    void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo);

    @Deprecated
    void onDisconnected(TaoBaseService.ConnectInfo connectInfo);

    void onResponse(String str, String str2, int i4, byte[] bArr, TaoBaseService.ExtraInfo extraInfo);

    void onSendData(String str, String str2, int i4, TaoBaseService.ExtraInfo extraInfo);

    void onUnbind(String str, int i4, TaoBaseService.ExtraInfo extraInfo);
}
