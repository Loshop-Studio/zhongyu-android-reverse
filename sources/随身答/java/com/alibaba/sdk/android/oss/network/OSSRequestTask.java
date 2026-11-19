package com.alibaba.sdk.android.oss.network;

import com.alibaba.sdk.android.oss.common.HttpMethod;
import com.alibaba.sdk.android.oss.internal.OSSRetryHandler;
import com.alibaba.sdk.android.oss.internal.RequestMessage;
import com.alibaba.sdk.android.oss.internal.ResponseMessage;
import com.alibaba.sdk.android.oss.internal.ResponseParser;
import com.alibaba.sdk.android.oss.model.OSSResult;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p172l8.C8918q;
import p172l8.C8923v;
import p172l8.C8926y;

/* loaded from: classes3.dex */
public class OSSRequestTask<T extends OSSResult> implements Callable<T> {
    private C8923v client;
    private ExecutionContext context;
    private int currentRetryCount = 0;
    private RequestMessage message;
    private ResponseParser<T> responseParser;
    private OSSRetryHandler retryHandler;

    /* renamed from: com.alibaba.sdk.android.oss.network.OSSRequestTask$1 */
    public static /* synthetic */ class C53691 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod = iArr;
            try {
                iArr[HttpMethod.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod[HttpMethod.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod[HttpMethod.GET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod[HttpMethod.HEAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod[HttpMethod.DELETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public OSSRequestTask(RequestMessage requestMessage, ResponseParser responseParser, ExecutionContext executionContext, int i9) {
        this.responseParser = responseParser;
        this.message = requestMessage;
        this.context = executionContext;
        this.client = executionContext.getClient();
        this.retryHandler = new OSSRetryHandler(i9);
    }

    private ResponseMessage buildResponseMessage(RequestMessage requestMessage, C8926y c8926y) {
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setRequest(requestMessage);
        responseMessage.setResponse(c8926y);
        HashMap map = new HashMap();
        C8918q c8918qM14179o = c8926y.m14179o();
        for (int i9 = 0; i9 < c8918qM14179o.size(); i9++) {
            map.put(c8918qM14179o.m13937b(i9), c8918qM14179o.m13940f(i9));
        }
        responseMessage.setHeaders(map);
        responseMessage.setStatusCode(c8926y.m14174i());
        responseMessage.setContentLength(c8926y.m14170a().contentLength());
        responseMessage.setContent(c8926y.m14170a().byteStream());
        return responseMessage;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0311 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018b A[Catch: Exception -> 0x001a, TryCatch #1 {Exception -> 0x001a, blocks: (B:3:0x0004, B:5:0x000c, B:8:0x001f, B:10:0x0040, B:12:0x0049, B:14:0x0056, B:15:0x0068, B:17:0x006e, B:18:0x0085, B:61:0x01f0, B:29:0x00cc, B:30:0x00d2, B:31:0x00d8, B:35:0x00e3, B:37:0x00f0, B:54:0x018b, B:56:0x0193, B:57:0x019e, B:59:0x01bf, B:60:0x01dc, B:39:0x0107, B:41:0x0111, B:44:0x012c, B:45:0x0133, B:46:0x0134, B:48:0x013c, B:49:0x016b, B:51:0x0173, B:52:0x0180, B:13:0x0050, B:79:0x02bb, B:80:0x02c2), top: B:140:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x030f  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T call() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1087
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.oss.network.OSSRequestTask.call():com.alibaba.sdk.android.oss.model.OSSResult");
    }
}
