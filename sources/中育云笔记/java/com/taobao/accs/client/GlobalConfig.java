package com.taobao.accs.client;

import android.content.Context;
import com.taobao.accs.ChannelService;
import com.taobao.accs.IProcessName;
import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.OrangeAdapter;

/* loaded from: classes5.dex */
public class GlobalConfig {
    public static boolean enableCookie = true;

    public static void setChannelProcessName(String str) {
        AdapterGlobalClientInfo.mChannelProcessName = str;
    }

    public static void setControlFrameMaxRetry(int i10) {
        Message.f12918a = i10;
    }

    public static void setCurrProcessNameImpl(IProcessName iProcessName) {
        AdapterGlobalClientInfo.mProcessNameImpl = iProcessName;
    }

    public static void setEnableForeground(Context context, boolean z10) {
        ALog.m10119i("GlobalConfig", "setEnableForeground", "enable", Boolean.valueOf(z10));
        OrangeAdapter.saveConfigToSP(context, ChannelService.SUPPORT_FOREGROUND_VERSION_KEY, !z10 ? 0 : 24);
    }

    public static void setMainProcessName(String str) {
        AdapterGlobalClientInfo.mMainProcessName = str;
    }
}
