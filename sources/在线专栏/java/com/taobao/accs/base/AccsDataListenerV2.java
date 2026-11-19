package com.taobao.accs.base;

import com.taobao.accs.base.TaoBaseService;

/* loaded from: classes.dex */
public interface AccsDataListenerV2 extends AccsDataListener {
    void onBind(String str, int i4, String str2, TaoBaseService.ExtraInfo extraInfo);

    void onResponse(String str, String str2, int i4, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo);

    void onSendData(String str, String str2, int i4, String str3, TaoBaseService.ExtraInfo extraInfo);

    void onUnbind(String str, int i4, String str2, TaoBaseService.ExtraInfo extraInfo);
}
