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
import je.C9737q;
import je.C9745y;

/* loaded from: classes3.dex */
public abstract class AbstractResponseParser<T extends OSSResult> implements ResponseParser {
    private CaseInsensitiveHashMap<String, String> parseResponseHeader(C9745y c9745y) {
        CaseInsensitiveHashMap<String, String> caseInsensitiveHashMap = new CaseInsensitiveHashMap<>();
        C9737q c9737qM19637r = c9745y.m19637r();
        for (int i10 = 0; i10 < c9737qM19637r.size(); i10++) {
            caseInsensitiveHashMap.put(c9737qM19637r.m19390b(i10), c9737qM19637r.m19393f(i10));
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
    public T parse(ResponseMessage responseMessage) {
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

    public abstract T parseData(ResponseMessage responseMessage, T t10);

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
