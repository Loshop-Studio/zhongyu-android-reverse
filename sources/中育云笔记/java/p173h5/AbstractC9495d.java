package p173h5;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: h5.d */
/* loaded from: classes5.dex */
public abstract class AbstractC9495d {

    /* renamed from: a */
    public static final Map f21951a = new ConcurrentHashMap(16);

    /* renamed from: b */
    public static final Object f21952b = new Object();

    /* renamed from: a */
    public static C9494c m18697a(GrsBaseInfo grsBaseInfo, Context context) {
        C9494c c9494c;
        synchronized (f21952b) {
            try {
                int iUniqueCode = grsBaseInfo.uniqueCode();
                Map map = f21951a;
                c9494c = (C9494c) map.get(context.getPackageName() + iUniqueCode);
                if (c9494c == null) {
                    Logger.m8580i("GrsClientManager", "grsClientImpl == null, and new GrsClientImpl");
                    c9494c = new C9494c(context, grsBaseInfo);
                    map.put(context.getPackageName() + iUniqueCode, c9494c);
                } else if (!c9494c.m18692o(new C9494c(grsBaseInfo))) {
                    Logger.m8580i("GrsClientManager", "The app_name, ser_country, reg_country and issue_country is equal, but other not.");
                    c9494c = new C9494c(context, grsBaseInfo);
                    map.put(context.getPackageName() + iUniqueCode, c9494c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c9494c;
    }
}
