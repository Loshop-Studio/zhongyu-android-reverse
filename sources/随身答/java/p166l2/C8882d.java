package p166l2;

import com.umeng.commonsdk.config.AbstractC6781d;
import p176m2.AbstractC8959h;

/* renamed from: l2.d */
/* loaded from: classes4.dex */
public class C8882d implements InterfaceC8881c {
    @Override // p166l2.InterfaceC8881c
    /* renamed from: a */
    public void mo13797a(String str, Object obj, String[] strArr) {
        if (str == null || str.length() <= 0) {
            return;
        }
        try {
            long j9 = Long.parseLong(str);
            if (j9 == -1) {
                AbstractC8959h.m14292b("Config", "--->>> SensitiveFieldHandler: handleConfigItem: invalid config value.");
                return;
            }
            AbstractC8959h.m14293c("Config", "--->>> CollectFieldJudgment: handleConfigItem: item : " + str);
            if (obj == null || !(obj instanceof C8880b)) {
                return;
            }
            for (int i9 = 0; i9 < strArr.length; i9++) {
                try {
                    String str2 = strArr[i9];
                    if (AbstractC6781d.m6265a(str2)) {
                        ((C8880b) obj).m13795b(str2, Boolean.valueOf(AbstractC8879a.m13791a(j9, i9)));
                    }
                } catch (Throwable unused) {
                    return;
                }
            }
        } catch (Throwable unused2) {
            AbstractC8959h.m14292b("Config", "--->>> SensitiveFieldHandler: handleConfigItem: parseLong exception.");
        }
    }
}
