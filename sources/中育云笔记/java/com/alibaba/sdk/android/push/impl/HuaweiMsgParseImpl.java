package com.alibaba.sdk.android.push.impl;

import android.content.Intent;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.BaseNotifyClickActivity;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes3.dex */
public class HuaweiMsgParseImpl implements BaseNotifyClickActivity.INotifyListener {
    private static final String TAG = "MPS:HuaweiMsgParseImpl";

    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String getMsgSource() {
        return AgooConstants.MESSAGE_SYSTEM_SOURCE_HUAWEI;
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String parseMsgFromIntent(Intent intent) {
        if (intent == null) {
            ALog.m10118e(TAG, "parseMsgFromIntent null", new Object[0]);
            return null;
        }
        try {
            return intent.getStringExtra("extras");
        } catch (Throwable th) {
            ALog.m10117e(TAG, "parseMsgFromIntent", th, new Object[0]);
            return null;
        }
    }
}
