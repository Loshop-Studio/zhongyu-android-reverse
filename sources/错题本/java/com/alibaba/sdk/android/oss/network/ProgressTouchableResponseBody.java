package com.alibaba.sdk.android.oss.network;

import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import java.io.IOException;
import okhttp3.AbstractC6323m0;
import okhttp3.C6333u;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

/* loaded from: classes2.dex */
public class ProgressTouchableResponseBody<T extends OSSRequest> extends AbstractC6323m0 {
    private BufferedSource mBufferedSource;
    private OSSProgressCallback mProgressListener;
    private final AbstractC6323m0 mResponseBody;
    private T request;

    public ProgressTouchableResponseBody(AbstractC6323m0 abstractC6323m0, ExecutionContext executionContext) {
        this.mResponseBody = abstractC6323m0;
        this.mProgressListener = executionContext.getProgressCallback();
        this.request = (T) executionContext.getRequest();
    }

    @Override // okhttp3.AbstractC6323m0
    public long contentLength() {
        return this.mResponseBody.contentLength();
    }

    @Override // okhttp3.AbstractC6323m0
    public C6333u contentType() {
        return this.mResponseBody.contentType();
    }

    @Override // okhttp3.AbstractC6323m0
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
            public long read(Buffer buffer, long j7) throws IOException {
                long j8 = super.read(buffer, j7);
                this.totalBytesRead += j8 != -1 ? j8 : 0L;
                if (ProgressTouchableResponseBody.this.mProgressListener != null && j8 != -1 && this.totalBytesRead != 0) {
                    ProgressTouchableResponseBody.this.mProgressListener.onProgress(ProgressTouchableResponseBody.this.request, this.totalBytesRead, ProgressTouchableResponseBody.this.mResponseBody.contentLength());
                }
                return j8;
            }
        };
    }
}
