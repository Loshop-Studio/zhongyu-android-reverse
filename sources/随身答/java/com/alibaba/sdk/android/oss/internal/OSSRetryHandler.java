package com.alibaba.sdk.android.oss.internal;

import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.common.OSSLog;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public class OSSRetryHandler {
    private int maxRetryCount = 2;

    /* renamed from: com.alibaba.sdk.android.oss.internal.OSSRetryHandler$1 */
    public static /* synthetic */ class C53661 {
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

    public OSSRetryHandler(int i9) {
        setMaxRetryCount(i9);
    }

    public void setMaxRetryCount(int i9) {
        this.maxRetryCount = i9;
    }

    public OSSRetryType shouldRetry(Exception exc, int i9) {
        if (i9 >= this.maxRetryCount) {
            return OSSRetryType.OSSRetryTypeShouldNotRetry;
        }
        if (!(exc instanceof ClientException)) {
            if (!(exc instanceof ServiceException)) {
                return OSSRetryType.OSSRetryTypeShouldNotRetry;
            }
            ServiceException serviceException = (ServiceException) exc;
            return (serviceException.getErrorCode() == null || !serviceException.getErrorCode().equalsIgnoreCase("RequestTimeTooSkewed")) ? serviceException.getStatusCode() >= 500 ? OSSRetryType.OSSRetryTypeShouldRetry : OSSRetryType.OSSRetryTypeShouldNotRetry : OSSRetryType.OSSRetryTypeShouldFixedTimeSkewedAndRetry;
        }
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

    public long timeInterval(int i9, OSSRetryType oSSRetryType) {
        if (C53661.$SwitchMap$com$alibaba$sdk$android$oss$internal$OSSRetryType[oSSRetryType.ordinal()] != 1) {
            return 0L;
        }
        return ((long) Math.pow(2.0d, i9)) * 200;
    }
}
