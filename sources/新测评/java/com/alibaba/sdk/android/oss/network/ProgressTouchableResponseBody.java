package com.alibaba.sdk.android.oss.network;

import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;
import p011a9.AbstractC0063z;
import p011a9.C0057t;

/* loaded from: classes3.dex */
public class ProgressTouchableResponseBody<T extends OSSRequest> extends AbstractC0063z {
    private BufferedSource mBufferedSource;
    private OSSProgressCallback mProgressListener;
    private final AbstractC0063z mResponseBody;
    private T request;

    public ProgressTouchableResponseBody(AbstractC0063z abstractC0063z, ExecutionContext executionContext) {
        this.mResponseBody = abstractC0063z;
        this.mProgressListener = executionContext.getProgressCallback();
        this.request = (T) executionContext.getRequest();
    }

    @Override // p011a9.AbstractC0063z
    public long contentLength() {
        return this.mResponseBody.contentLength();
    }

    @Override // p011a9.AbstractC0063z
    public C0057t contentType() {
        return this.mResponseBody.contentType();
    }

    @Override // p011a9.AbstractC0063z
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
            public long read(Buffer buffer, long j10) throws IOException {
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
