package com.alibaba.sdk.android.oss.network;

import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;
import p136i9.AbstractC8905e0;
import p136i9.C8927y;

/* loaded from: classes3.dex */
public class ProgressTouchableResponseBody<T extends OSSRequest> extends AbstractC8905e0 {
    private BufferedSource mBufferedSource;
    private OSSProgressCallback mProgressListener;
    private final AbstractC8905e0 mResponseBody;
    private T request;

    public ProgressTouchableResponseBody(AbstractC8905e0 abstractC8905e0, ExecutionContext executionContext) {
        this.mResponseBody = abstractC8905e0;
        this.mProgressListener = executionContext.getProgressCallback();
        this.request = (T) executionContext.getRequest();
    }

    @Override // p136i9.AbstractC8905e0
    public long contentLength() {
        return this.mResponseBody.contentLength();
    }

    @Override // p136i9.AbstractC8905e0
    public C8927y contentType() {
        return this.mResponseBody.contentType();
    }

    @Override // p136i9.AbstractC8905e0
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
            public long read(Buffer buffer, long j10) {
                long j11 = super.read(buffer, j10);
                this.totalBytesRead += j11 != -1 ? j11 : 0L;
                if (ProgressTouchableResponseBody.this.mProgressListener != null && j11 != -1 && this.totalBytesRead != 0) {
                    ProgressTouchableResponseBody.this.mProgressListener.onProgress(ProgressTouchableResponseBody.this.request, this.totalBytesRead, ProgressTouchableResponseBody.this.mResponseBody.contentLength());
                }
                return j11;
            }
        };
    }
}
