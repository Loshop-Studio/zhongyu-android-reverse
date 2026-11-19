package com.alibaba.sdk.android.oss.network;

import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import java.io.InputStream;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;
import p136i9.AbstractC8901c0;
import p136i9.C8927y;

/* loaded from: classes3.dex */
public class ProgressTouchableRequestBody<T extends OSSRequest> extends AbstractC8901c0 {
    private static final int SEGMENT_SIZE = 2048;
    private OSSProgressCallback callback;
    private long contentLength;
    private String contentType;
    private InputStream inputStream;
    private T request;

    public ProgressTouchableRequestBody(InputStream inputStream, long j10, String str, ExecutionContext executionContext) {
        this.inputStream = inputStream;
        this.contentType = str;
        this.contentLength = j10;
        this.callback = executionContext.getProgressCallback();
        this.request = (T) executionContext.getRequest();
    }

    @Override // p136i9.AbstractC8901c0
    public long contentLength() {
        return this.contentLength;
    }

    @Override // p136i9.AbstractC8901c0
    public C8927y contentType() {
        return C8927y.m15338g(this.contentType);
    }

    @Override // p136i9.AbstractC8901c0
    public void writeTo(BufferedSink bufferedSink) {
        Source source = Okio.source(this.inputStream);
        long j10 = 0;
        while (true) {
            long j11 = this.contentLength;
            if (j10 >= j11) {
                break;
            }
            long j12 = source.read(bufferedSink.buffer(), Math.min(j11 - j10, 2048L));
            if (j12 == -1) {
                break;
            }
            long j13 = j10 + j12;
            bufferedSink.flush();
            OSSProgressCallback oSSProgressCallback = this.callback;
            if (oSSProgressCallback != null && j13 != 0) {
                oSSProgressCallback.onProgress(this.request, j13, this.contentLength);
            }
            j10 = j13;
        }
        if (source != null) {
            source.close();
        }
    }
}
