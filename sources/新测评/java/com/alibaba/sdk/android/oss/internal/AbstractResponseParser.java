package com.alibaba.sdk.android.oss.internal;

import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.utils.CaseInsensitiveHashMap;
import com.alibaba.sdk.android.oss.model.OSSResult;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.ParameterizedType;
import java.math.BigInteger;
import java.util.zip.CheckedInputStream;
import p011a9.C0054q;
import p011a9.C0062y;

/* loaded from: classes3.dex */
public abstract class AbstractResponseParser<T extends OSSResult> implements ResponseParser {
    private CaseInsensitiveHashMap<String, String> parseResponseHeader(C0062y c0062y) {
        CaseInsensitiveHashMap<String, String> caseInsensitiveHashMap = new CaseInsensitiveHashMap<>();
        C0054q c0054qM423o = c0062y.m423o();
        for (int i10 = 0; i10 < c0054qM423o.size(); i10++) {
            caseInsensitiveHashMap.put(c0054qM423o.m181b(i10), c0054qM423o.m184f(i10));
        }
        return caseInsensitiveHashMap;
    }

    public static void safeCloseResponse(ResponseMessage responseMessage) {
        try {
            responseMessage.close();
        } catch (Exception unused) {
        }
    }

    public boolean needCloseResponse() {
        return true;
    }

    @Override // com.alibaba.sdk.android.oss.internal.ResponseParser
    public T parse(ResponseMessage responseMessage) throws IOException {
        try {
            try {
                T t10 = (T) ((Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).newInstance();
                if (t10 != null) {
                    t10.setRequestId((String) responseMessage.getHeaders().get(OSSHeaders.OSS_HEADER_REQUEST_ID));
                    t10.setStatusCode(responseMessage.getStatusCode());
                    t10.setResponseHeader(parseResponseHeader(responseMessage.getResponse()));
                    setCRC(t10, responseMessage);
                    t10 = (T) parseData(responseMessage, t10);
                }
                return t10;
            } catch (Exception e10) {
                IOException iOException = new IOException(e10.getMessage(), e10);
                e10.printStackTrace();
                OSSLog.logThrowable2Local(e10);
                throw iOException;
            }
        } finally {
            if (needCloseResponse()) {
                safeCloseResponse(responseMessage);
            }
        }
    }

    public abstract T parseData(ResponseMessage responseMessage, T t10) throws Exception;

    public <Result extends OSSResult> void setCRC(Result result, ResponseMessage responseMessage) {
        InputStream content = responseMessage.getRequest().getContent();
        if (content != null && (content instanceof CheckedInputStream)) {
            result.setClientCRC(Long.valueOf(((CheckedInputStream) content).getChecksum().getValue()));
        }
        String str = (String) responseMessage.getHeaders().get(OSSHeaders.OSS_HASH_CRC64_ECMA);
        if (str != null) {
            result.setServerCRC(Long.valueOf(new BigInteger(str).longValue()));
        }
    }
}
