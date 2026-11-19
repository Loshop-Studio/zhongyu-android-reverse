package com.alibaba.sdk.android.oss.network;

import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;
import p058f5.AbstractC6364e0;
import p058f5.C6386y;

/* loaded from: classes3.dex */
public class ProgressTouchableResponseBody<T extends OSSRequest> extends AbstractC6364e0 {
    private BufferedSource mBufferedSource;
    private OSSProgressCallback mProgressListener;
    private final AbstractC6364e0 mResponseBody;
    private T request;

    public ProgressTouchableResponseBody(AbstractC6364e0 abstractC6364e0, ExecutionContext executionContext) {
        this.mResponseBody = abstractC6364e0;
        this.mProgressListener = executionContext.getProgressCallback();
        this.request = (T) executionContext.getRequest();
    }

    @Override // p058f5.AbstractC6364e0
    public long contentLength() {
        return this.mResponseBody.contentLength();
    }

    @Override // p058f5.AbstractC6364e0
    public C6386y contentType() {
        return this.mResponseBody.contentType();
    }

    @Override // p058f5.AbstractC6364e0
    public BufferedSource source() {
        if (this.mBufferedSource == null) {
            this.mBufferedSource = Okio.buffer(source(this.mResponseBody.source()));
        }
        return this.mBufferedSource;
    }

    private Source source(Source source) {
        return new ForwardingSource(source) { // from class: com.alibaba.sdk.android.oss.network.ProgressTouchableResponseBody.1
            private long totalBytesRead = 0;

            @Override // okio.ForwardingSource, okio.Source
            public long read(Buffer buffer, long j6) {
                long j7 = super.read(buffer, j6);
                this.totalBytesRead += j7 != -1 ? j7 : 0L;
                if (ProgressTouchableResponseBody.this.mProgressListener != null && j7 != -1 && this.totalBytesRead != 0) {
                    ProgressTouchableResponseBody.this.mProgressListener.onProgress(ProgressTouchableResponseBody.this.request, this.totalBytesRead, ProgressTouchableResponseBody.this.mResponseBody.contentLength());
                }
                return j7;
            }
        };
    }
}
