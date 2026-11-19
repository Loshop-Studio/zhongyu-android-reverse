package com.alibaba.sdk.android.oss.network;

import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;
import p172l8.AbstractC8927z;
import p172l8.C8921t;

/* loaded from: classes3.dex */
public class ProgressTouchableResponseBody<T extends OSSRequest> extends AbstractC8927z {
    private BufferedSource mBufferedSource;
    private OSSProgressCallback mProgressListener;
    private final AbstractC8927z mResponseBody;
    private T request;

    public ProgressTouchableResponseBody(AbstractC8927z abstractC8927z, ExecutionContext executionContext) {
        this.mResponseBody = abstractC8927z;
        this.mProgressListener = executionContext.getProgressCallback();
        this.request = (T) executionContext.getRequest();
    }

    @Override // p172l8.AbstractC8927z
    public long contentLength() {
        return this.mResponseBody.contentLength();
    }

    @Override // p172l8.AbstractC8927z
    public C8921t contentType() {
        return this.mResponseBody.contentType();
    }

    @Override // p172l8.AbstractC8927z
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
            public long read(Buffer buffer, long j9) throws IOException {
                long j10 = super.read(buffer, j9);
                this.totalBytesRead += j10 != -1 ? j10 : 0L;
                if (ProgressTouchableResponseBody.this.mProgressListener != null && j10 != -1 && this.totalBytesRead != 0) {
                    ProgressTouchableResponseBody.this.mProgressListener.onProgress(ProgressTouchableResponseBody.this.request, this.totalBytesRead, ProgressTouchableResponseBody.this.mResponseBody.contentLength());
                }
                return j10;
            }
        };
    }
}
