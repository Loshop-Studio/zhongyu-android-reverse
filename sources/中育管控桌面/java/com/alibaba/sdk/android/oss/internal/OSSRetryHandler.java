package com.alibaba.sdk.android.oss.internal;

import androidx.work.PeriodicWorkRequest;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.utils.DateUtil;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.text.ParseException;

/* loaded from: classes3.dex */
public class OSSRetryHandler {
    private int maxRetryCount = 2;

    /* renamed from: com.alibaba.sdk.android.oss.internal.OSSRetryHandler$1 */
    public static /* synthetic */ class C46141 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$sdk$android$oss$internal$OSSRetryType;

        static {
            int[] iArr = new int[OSSRetryType.values().length];
            $SwitchMap$com$alibaba$sdk$android$oss$internal$OSSRetryType = iArr;
            try {
                iArr[OSSRetryType.OSSRetryTypeShouldRetry.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public OSSRetryHandler(int i6) {
        setMaxRetryCount(i6);
    }

    public void setMaxRetryCount(int i6) {
        this.maxRetryCount = i6;
    }

    public OSSRetryType shouldRetry(Exception exc, int i6) {
        if (i6 >= this.maxRetryCount) {
            return OSSRetryType.OSSRetryTypeShouldNotRetry;
        }
        if (exc instanceof ClientException) {
            if (((ClientException) exc).isCanceledException().booleanValue()) {
                return OSSRetryType.OSSRetryTypeShouldNotRetry;
            }
            Exception exc2 = (Exception) exc.getCause();
            if ((exc2 instanceof InterruptedIOException) && !(exc2 instanceof SocketTimeoutException)) {
                OSSLog.logError("[shouldRetry] - is interrupted!");
                return OSSRetryType.OSSRetryTypeShouldNotRetry;
            }
            if (exc2 instanceof IllegalArgumentException) {
                return OSSRetryType.OSSRetryTypeShouldNotRetry;
            }
            OSSLog.logDebug("shouldRetry - " + exc.toString());
            exc.getCause().printStackTrace();
            return OSSRetryType.OSSRetryTypeShouldRetry;
        }
        if (!(exc instanceof ServiceException)) {
            return OSSRetryType.OSSRetryTypeShouldNotRetry;
        }
        ServiceException serviceException = (ServiceException) exc;
        if (serviceException.getErrorCode() != null && serviceException.getErrorCode().equalsIgnoreCase("RequestTimeTooSkewed")) {
            return OSSRetryType.OSSRetryTypeShouldFixedTimeSkewedAndRetry;
        }
        if (serviceException.getErrorCode() == null || serviceException.getMessage() == null || !serviceException.getErrorCode().equalsIgnoreCase("InvalidArgument") || !serviceException.getMessage().equalsIgnoreCase("Invalid signing date in Authorization header.")) {
            return serviceException.getStatusCode() >= 500 ? OSSRetryType.OSSRetryTypeShouldRetry : OSSRetryType.OSSRetryTypeShouldNotRetry;
        }
        try {
            String date = serviceException.getDate();
            if (date == null) {
                return OSSRetryType.OSSRetryTypeShouldNotRetry;
            }
            long fixedSkewedTimeMillis = DateUtil.getFixedSkewedTimeMillis() - DateUtil.parseRfc822Date(date).getTime();
            if (fixedSkewedTimeMillis <= PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS && fixedSkewedTimeMillis >= -900000) {
                return OSSRetryType.OSSRetryTypeShouldNotRetry;
            }
            return OSSRetryType.OSSRetryTypeShouldFixedTimeSkewedAndRetry;
        } catch (ParseException e6) {
            OSSLog.logThrowable2Local(e6);
            return OSSRetryType.OSSRetryTypeShouldNotRetry;
        }
    }

    public long timeInterval(int i6, OSSRetryType oSSRetryType) {
        if (C46141.$SwitchMap$com$alibaba$sdk$android$oss$internal$OSSRetryType[oSSRetryType.ordinal()] != 1) {
            return 0L;
        }
        return ((long) Math.pow(2.0d, i6)) * 200;
    }
}
