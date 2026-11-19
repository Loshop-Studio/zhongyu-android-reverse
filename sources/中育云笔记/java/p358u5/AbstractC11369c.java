package p358u5;

import android.content.Context;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;

/* renamed from: u5.c */
/* loaded from: classes5.dex */
public abstract class AbstractC11369c {
    /* renamed from: a */
    public static void m25292a(Context context, String str, String str2, int i10) {
        HiAnalyticsClient.reportExit(context, str, str2, Status.SUCCESS.getStatusCode(), i10, 61300300);
    }
}
