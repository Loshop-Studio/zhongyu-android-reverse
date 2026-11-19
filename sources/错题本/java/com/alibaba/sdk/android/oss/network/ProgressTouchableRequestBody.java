package com.alibaba.sdk.android.oss.network;

import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;
import okhttp3.AbstractC6297g0;
import okhttp3.AbstractC6326o;
import okhttp3.C6333u;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;

/* loaded from: classes2.dex */
public class ProgressTouchableRequestBody<T extends OSSRequest> extends AbstractC6297g0 {
    private static final int SEGMENT_SIZE = 2048;
    private OSSProgressCallback callback;
    private long contentLength;
    private String contentType;
    private InputStream inputStream;
    private T request;

    public ProgressTouchableRequestBody(InputStream inputStream, long j7, String str, ExecutionContext executionContext) {
        this.inputStream = inputStream;
        this.contentType = str;
        this.contentLength = j7;
        this.callback = executionContext.getProgressCallback();
        this.request = (T) executionContext.getRequest();
    }

    @Override // okhttp3.AbstractC6297g0
    public long contentLength() throws IOException {
        return this.contentLength;
    }

    @Override // okhttp3.AbstractC6297g0
    public C6333u contentType() {
        String str = this.contentType;
        Pattern pattern = C6333u.f10275d;
        return AbstractC6326o.m5958h(str);
    }

    @Override // okhttp3.AbstractC6297g0
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        Source source = Okio.source(this.inputStream);
        long j7 = 0;
        while (true) {
            long j8 = this.contentLength;
            if (j7 >= j8) {
                break;
            }
            long j9 = source.read(bufferedSink.getBufferField(), Math.min(j8 - j7, 2048L));
            if (j9 == -1) {
                break;
            }
            long j10 = j7 + j9;
            bufferedSink.flush();
            OSSProgressCallback oSSProgressCallback = this.callback;
            if (oSSProgressCallback != null && j10 != 0) {
                oSSProgressCallback.onProgress(this.request, j10, this.contentLength);
            }
            j7 = j10;
        }
        if (source != null) {
            source.close();
        }
    }
}
