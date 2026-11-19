package p333s5;

import android.content.Context;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;

/* renamed from: s5.f */
/* loaded from: classes5.dex */
public abstract class AbstractC11066f {
    /* renamed from: a */
    public static String m24532a(Context context, String str) {
        return HiAnalyticsClient.reportEntry(context, str, 61300300);
    }

    /* renamed from: b */
    public static void m24533b(Context context, String str, ResponseErrorCode responseErrorCode) {
        HiAnalyticsClient.reportExit(context, str, responseErrorCode.getTransactionId(), responseErrorCode.getStatusCode(), responseErrorCode.getErrorCode(), 61300300);
    }

    /* renamed from: c */
    public static void m24534c(Context context, String str, String str2, int i10) {
        HiAnalyticsClient.reportExit(context, str, str2, Status.SUCCESS.getStatusCode(), i10, 61300300);
    }

    /* renamed from: d */
    public static void m24535d(Context context, String str, String str2, ErrorEnum errorEnum) {
        HiAnalyticsClient.reportExit(context, str, str2, Status.SUCCESS.getStatusCode(), errorEnum.m8225c(), 61300300);
    }
}
