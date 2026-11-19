package com.alibaba.sdk.android.tbrest.request;

import anetwork.channel.util.RequestConstant;
import com.alibaba.sdk.android.tbrest.SendService;

/* loaded from: classes3.dex */
public class UrlWrapper {
    private static final int MAX_CONNECTION_TIME_OUT = 10000;
    private static final int MAX_READ_CONNECTION_STREAM_TIME_OUT = 60000;
    public static int mErrorCode;
    private static C5700a mRestSslSocketFactory;

    static {
        System.setProperty("http.keepAlive", RequestConstant.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01c2 A[EXC_TOP_SPLITTER, PHI: r1
      0x01c2: PHI (r1v15 java.io.DataOutputStream) = (r1v14 java.io.DataOutputStream), (r1v16 java.io.DataOutputStream) binds: [B:92:0x01c0, B:98:0x01dd] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alibaba.sdk.android.tbrest.request.BizResponse sendRequest(com.alibaba.sdk.android.tbrest.SendService r7, java.lang.String r8, java.lang.String r9, byte[] r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.tbrest.request.UrlWrapper.sendRequest(com.alibaba.sdk.android.tbrest.SendService, java.lang.String, java.lang.String, byte[]):com.alibaba.sdk.android.tbrest.request.BizResponse");
    }

    public static BizResponse sendRequestByUrl(SendService sendService, String str, byte[] bArr) {
        return sendRequest(sendService, sendService.appKey, str, bArr);
    }

    public static BizResponse sendRequest(SendService sendService, String str, byte[] bArr) {
        String str2;
        String str3 = sendService.appKey;
        if (sendService.openHttp.booleanValue()) {
            str2 = "http://" + str + "/upload";
        } else {
            str2 = "https://" + str + "/upload";
        }
        return sendRequest(sendService, str3, str2, bArr);
    }
}
