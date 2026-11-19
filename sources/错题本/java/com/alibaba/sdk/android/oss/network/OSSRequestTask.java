package com.alibaba.sdk.android.oss.network;

import com.alibaba.sdk.android.oss.common.HttpMethod;
import com.alibaba.sdk.android.oss.internal.OSSRetryHandler;
import com.alibaba.sdk.android.oss.internal.RequestMessage;
import com.alibaba.sdk.android.oss.internal.ResponseMessage;
import com.alibaba.sdk.android.oss.internal.ResponseParser;
import com.alibaba.sdk.android.oss.model.OSSResult;
import java.util.HashMap;
import java.util.concurrent.Callable;
import okhttp3.AbstractC6323m0;
import okhttp3.C6301i0;
import okhttp3.C6329q;
import okhttp3.C6338z;

/* loaded from: classes2.dex */
public class OSSRequestTask<T extends OSSResult> implements Callable<T> {
    private C6338z client;
    private ExecutionContext context;
    private int currentRetryCount = 0;
    private RequestMessage message;
    private ResponseParser<T> responseParser;
    private OSSRetryHandler retryHandler;

    /* renamed from: com.alibaba.sdk.android.oss.network.OSSRequestTask$1 */
    public static /* synthetic */ class C33751 {
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

    public OSSRequestTask(RequestMessage requestMessage, ResponseParser responseParser, ExecutionContext executionContext, int i) {
        this.responseParser = responseParser;
        this.message = requestMessage;
        this.context = executionContext;
        this.client = executionContext.getClient();
        this.retryHandler = new OSSRetryHandler(i);
    }

    private ResponseMessage buildResponseMessage(RequestMessage requestMessage, C6301i0 c6301i0) {
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setRequest(requestMessage);
        responseMessage.setResponse(c6301i0);
        HashMap map = new HashMap();
        C6329q c6329q = c6301i0.f10109f;
        AbstractC6323m0 abstractC6323m0 = c6301i0.f10110g;
        for (int i = 0; i < c6329q.size(); i++) {
            map.put(c6329q.m5963b(i), c6329q.m5966e(i));
        }
        responseMessage.setHeaders(map);
        responseMessage.setStatusCode(c6301i0.f10107d);
        responseMessage.setContentLength(abstractC6323m0.contentLength());
        responseMessage.setContent(abstractC6323m0.byteStream());
        return responseMessage;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0320 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a5 A[Catch: Exception -> 0x001c, TryCatch #2 {Exception -> 0x001c, blocks: (B:3:0x0006, B:5:0x000e, B:8:0x0021, B:10:0x0048, B:12:0x0051, B:14:0x005e, B:15:0x006f, B:17:0x0075, B:18:0x008b, B:72:0x0209, B:29:0x00d3, B:30:0x00dc, B:31:0x00e1, B:35:0x00ed, B:37:0x00fa, B:65:0x01a5, B:67:0x01ad, B:68:0x01b8, B:70:0x01d8, B:71:0x01f6, B:40:0x0111, B:42:0x011b, B:45:0x0137, B:46:0x013f, B:47:0x0140, B:49:0x0148, B:52:0x0176, B:58:0x0180, B:59:0x0183, B:60:0x0184, B:62:0x018c, B:63:0x019a, B:13:0x0058, B:90:0x02d1, B:91:0x02d8), top: B:153:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d6  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T call() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.oss.network.OSSRequestTask.call():com.alibaba.sdk.android.oss.model.OSSResult");
    }
}
