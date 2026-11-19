package com.alibaba.sdk.android.oss.network;

import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import je.AbstractC9746z;
import je.C9740t;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

/* loaded from: classes3.dex */
public class ProgressTouchableResponseBody<T extends OSSRequest> extends AbstractC9746z {
    private BufferedSource mBufferedSource;
    private OSSProgressCallback mProgressListener;
    private final AbstractC9746z mResponseBody;
    private T request;

    public ProgressTouchableResponseBody(AbstractC9746z abstractC9746z, ExecutionContext executionContext) {
        this.mResponseBody = abstractC9746z;
        this.mProgressListener = executionContext.getProgressCallback();
        this.request = (T) executionContext.getRequest();
    }

    @Override // je.AbstractC9746z
    public long contentLength() {
        return this.mResponseBody.contentLength();
    }

    @Override // je.AbstractC9746z
    public C9740t contentType() {
        return this.mResponseBody.contentType();
    }

    @Override // je.AbstractC9746z
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
