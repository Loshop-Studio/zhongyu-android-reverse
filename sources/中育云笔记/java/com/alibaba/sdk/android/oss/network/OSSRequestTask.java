package com.alibaba.sdk.android.oss.network;

import com.alibaba.sdk.android.oss.common.HttpMethod;
import com.alibaba.sdk.android.oss.internal.OSSRetryHandler;
import com.alibaba.sdk.android.oss.internal.RequestMessage;
import com.alibaba.sdk.android.oss.internal.ResponseMessage;
import com.alibaba.sdk.android.oss.internal.ResponseParser;
import com.alibaba.sdk.android.oss.model.OSSResult;
import java.util.HashMap;
import java.util.concurrent.Callable;
import je.C9737q;
import je.C9742v;
import je.C9745y;

/* loaded from: classes3.dex */
public class OSSRequestTask<T extends OSSResult> implements Callable<T> {
    private C9742v client;
    private ExecutionContext context;
    private int currentRetryCount = 0;
    private RequestMessage message;
    private ResponseParser<T> responseParser;
    private OSSRetryHandler retryHandler;

    /* renamed from: com.alibaba.sdk.android.oss.network.OSSRequestTask$1 */
    public static /* synthetic */ class C56391 {
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

    public OSSRequestTask(RequestMessage requestMessage, ResponseParser responseParser, ExecutionContext executionContext, int i10) {
        this.responseParser = responseParser;
        this.message = requestMessage;
        this.context = executionContext;
        this.client = executionContext.getClient();
        this.retryHandler = new OSSRetryHandler(i10);
    }

    private ResponseMessage buildResponseMessage(RequestMessage requestMessage, C9745y c9745y) {
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setRequest(requestMessage);
        responseMessage.setResponse(c9745y);
        HashMap map = new HashMap();
        C9737q c9737qM19637r = c9745y.m19637r();
        for (int i10 = 0; i10 < c9737qM19637r.size(); i10++) {
            map.put(c9737qM19637r.m19390b(i10), c9737qM19637r.m19393f(i10));
        }
        responseMessage.setHeaders(map);
        responseMessage.setStatusCode(c9745y.m19632j());
        responseMessage.setContentLength(c9745y.m19628e().contentLength());
        responseMessage.setContent(c9745y.m19628e().byteStream());
        return responseMessage;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0326 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a0 A[Catch: Exception -> 0x001a, TryCatch #5 {Exception -> 0x001a, blocks: (B:3:0x0004, B:5:0x000c, B:8:0x001f, B:10:0x0046, B:12:0x004f, B:14:0x005c, B:15:0x006e, B:17:0x0074, B:18:0x008b, B:72:0x0205, B:29:0x00d2, B:30:0x00d8, B:31:0x00de, B:35:0x00e9, B:37:0x00f6, B:65:0x01a0, B:67:0x01a8, B:68:0x01b3, B:70:0x01d4, B:71:0x01f1, B:40:0x010d, B:42:0x0117, B:45:0x0133, B:46:0x013a, B:47:0x013b, B:49:0x0143, B:52:0x0171, B:58:0x017b, B:59:0x017e, B:60:0x017f, B:62:0x0187, B:63:0x0195, B:13:0x0056, B:90:0x02d0, B:91:0x02d7), top: B:159:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d2  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T call() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.oss.network.OSSRequestTask.call():com.alibaba.sdk.android.oss.model.OSSResult");
    }
}
