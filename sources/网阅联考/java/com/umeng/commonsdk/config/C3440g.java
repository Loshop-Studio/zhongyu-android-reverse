package com.umeng.commonsdk.config;

import com.umeng.commonsdk.debug.UMRTLog;

/* renamed from: com.umeng.commonsdk.config.g */
/* loaded from: classes2.dex */
public class C3440g implements InterfaceC3438e {
    @Override // com.umeng.commonsdk.config.InterfaceC3438e
    /* renamed from: a */
    public void mo3422a(String str, Object obj, String[] strArr) {
        if (str == null || str.length() <= 0) {
            return;
        }
        try {
            long j4 = Long.parseLong(str);
            if (j4 == -1) {
                UMRTLog.m3432e("Config", "--->>> SensitiveFieldHandler: handleConfigItem: invalid config value.");
                return;
            }
            UMRTLog.m3433i("Config", "--->>> CollectFieldJudgment: handleConfigItem: item : " + str);
            if (obj == null || !(obj instanceof C3435b)) {
                return;
            }
            for (int i4 = 0; i4 < strArr.length; i4++) {
                try {
                    String str2 = strArr[i4];
                    if (C3437d.m3423a(str2)) {
                        ((C3435b) obj).mo3420a(str2, Boolean.valueOf(C3434a.m3412a(j4, i4)));
                    }
                } catch (Throwable unused) {
                    return;
                }
            }
        } catch (Throwable unused2) {
            UMRTLog.m3432e("Config", "--->>> SensitiveFieldHandler: handleConfigItem: parseLong exception.");
        }
    }
}
