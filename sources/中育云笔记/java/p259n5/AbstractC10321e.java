package p259n5;

import com.huawei.hms.framework.common.Logger;

/* renamed from: n5.e */
/* loaded from: classes5.dex */
public abstract class AbstractC10321e {

    /* renamed from: a */
    public static final String f24599a = "e";

    /* renamed from: a */
    public static boolean m21533a(Long l10) {
        if (l10 == null) {
            Logger.m8586v(f24599a, "Method isTimeExpire input param expireTime is null.");
            return true;
        }
        try {
        } catch (NumberFormatException unused) {
            Logger.m8586v(f24599a, "isSpExpire spValue NumberFormatException.");
        }
        if (l10.longValue() - System.currentTimeMillis() >= 0) {
            Logger.m8580i(f24599a, "isSpExpire false.");
            return false;
        }
        Logger.m8580i(f24599a, "isSpExpire true.");
        return true;
    }

    /* renamed from: b */
    public static boolean m21534b(Long l10, long j10) {
        if (l10 == null) {
            Logger.m8586v(f24599a, "Method isTimeWillExpire input param expireTime is null.");
            return true;
        }
        try {
            if (l10.longValue() - (System.currentTimeMillis() + j10) >= 0) {
                Logger.m8586v(f24599a, "isSpExpire false.");
                return false;
            }
        } catch (NumberFormatException unused) {
            Logger.m8586v(f24599a, "isSpExpire spValue NumberFormatException.");
        }
        return true;
    }
}
