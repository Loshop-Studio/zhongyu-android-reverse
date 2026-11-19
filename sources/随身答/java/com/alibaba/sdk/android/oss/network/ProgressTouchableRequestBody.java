package com.alibaba.sdk.android.oss.network;

import android.support.v4.media.session.PlaybackStateCompat;
import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import java.io.IOException;
import java.io.InputStream;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;
import p172l8.AbstractC8925x;
import p172l8.C8921t;

/* loaded from: classes3.dex */
public class ProgressTouchableRequestBody<T extends OSSRequest> extends AbstractC8925x {
    private static final int SEGMENT_SIZE = 2048;
    private OSSProgressCallback callback;
    private long contentLength;
    private String contentType;
    private InputStream inputStream;
    private T request;

    public ProgressTouchableRequestBody(InputStream inputStream, long j9, String str, ExecutionContext executionContext) {
        this.inputStream = inputStream;
        this.contentType = str;
        this.contentLength = j9;
        this.callback = executionContext.getProgressCallback();
        this.request = (T) executionContext.getRequest();
    }

    @Override // p172l8.AbstractC8925x
    public long contentLength() throws IOException {
        return this.contentLength;
    }

    @Override // p172l8.AbstractC8925x
    /* renamed from: contentType */
    public C8921t getContentType() {
        return C8921t.m14030g(this.contentType);
    }

    @Override // p172l8.AbstractC8925x
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        Source source = Okio.source(this.inputStream);
        long j9 = 0;
        while (true) {
            long j10 = this.contentLength;
            if (j9 >= j10) {
                break;
            }
            long j11 = source.read(bufferedSink.getBufferField(), Math.min(j10 - j9, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH));
            if (j11 == -1) {
                break;
            }
            long j12 = j9 + j11;
            bufferedSink.flush();
            OSSProgressCallback oSSProgressCallback = this.callback;
            if (oSSProgressCallback != null && j12 != 0) {
                oSSProgressCallback.onProgress(this.request, j12, this.contentLength);
            }
            j9 = j12;
        }
        if (source != null) {
            source.close();
        }
    }
}
