package com.alibaba.sdk.android.oss.network;

import android.support.v4.media.session.PlaybackStateCompat;
import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import java.io.IOException;
import java.io.InputStream;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;
import p011a9.AbstractC0061x;
import p011a9.C0057t;

/* loaded from: classes3.dex */
public class ProgressTouchableRequestBody<T extends OSSRequest> extends AbstractC0061x {
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

    @Override // p011a9.AbstractC0061x
    public long contentLength() throws IOException {
        return this.contentLength;
    }

    @Override // p011a9.AbstractC0061x
    /* renamed from: contentType */
    public C0057t getContentType() {
        return C0057t.m274g(this.contentType);
    }

    @Override // p011a9.AbstractC0061x
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        Source source = Okio.source(this.inputStream);
        long j10 = 0;
        while (true) {
            long j11 = this.contentLength;
            if (j10 >= j11) {
                break;
            }
            long j12 = source.read(bufferedSink.getBufferField(), Math.min(j11 - j10, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH));
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
