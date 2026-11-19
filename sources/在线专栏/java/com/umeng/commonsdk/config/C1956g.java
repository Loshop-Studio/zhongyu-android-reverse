package com.umeng.commonsdk.config;

import com.umeng.commonsdk.debug.UMRTLog;
import org.android.agoo.common.Config;

/* renamed from: com.umeng.commonsdk.config.g */
/* loaded from: classes.dex */
public class C1956g implements InterfaceC1954e {
    @Override // com.umeng.commonsdk.config.InterfaceC1954e
    /* renamed from: a */
    public void mo7345a(String str, Object obj, String[] strArr) {
        if (str == null || str.length() <= 0) {
            return;
        }
        try {
            long j4 = Long.parseLong(str);
            if (j4 == -1) {
                UMRTLog.m7355e(Config.TAG, "--->>> SensitiveFieldHandler: handleConfigItem: invalid config value.");
                return;
            }
            UMRTLog.m7356i(Config.TAG, "--->>> CollectFieldJudgment: handleConfigItem: item : " + str);
            if (obj == null || !(obj instanceof C1951b)) {
                return;
            }
            for (int i4 = 0; i4 < strArr.length; i4++) {
                try {
                    String str2 = strArr[i4];
                    if (C1953d.m7346a(str2)) {
                        ((C1951b) obj).mo7343a(str2, Boolean.valueOf(C1950a.m7335a(j4, i4)));
                    }
                } catch (Throwable unused) {
                    return;
                }
            }
        } catch (Throwable unused2) {
            UMRTLog.m7355e(Config.TAG, "--->>> SensitiveFieldHandler: handleConfigItem: parseLong exception.");
        }
    }
}
