package com.alibaba.sdk.android.oss.network;

import android.support.v4.media.session.PlaybackStateCompat;
import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import java.io.InputStream;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;
import p058f5.AbstractC6360c0;
import p058f5.C6386y;

/* loaded from: classes3.dex */
public class ProgressTouchableRequestBody<T extends OSSRequest> extends AbstractC6360c0 {
    private static final int SEGMENT_SIZE = 2048;
    private OSSProgressCallback callback;
    private long contentLength;
    private String contentType;
    private InputStream inputStream;
    private T request;

    public ProgressTouchableRequestBody(InputStream inputStream, long j6, String str, ExecutionContext executionContext) {
        this.inputStream = inputStream;
        this.contentType = str;
        this.contentLength = j6;
        this.callback = executionContext.getProgressCallback();
        this.request = (T) executionContext.getRequest();
    }

    @Override // p058f5.AbstractC6360c0
    public long contentLength() {
        return this.contentLength;
    }

    @Override // p058f5.AbstractC6360c0
    /* renamed from: contentType */
    public C6386y getContentType() {
        return C6386y.m6877g(this.contentType);
    }

    @Override // p058f5.AbstractC6360c0
    public void writeTo(BufferedSink bufferedSink) {
        Source source = Okio.source(this.inputStream);
        long j6 = 0;
        while (true) {
            long j7 = this.contentLength;
            if (j6 >= j7) {
                break;
            }
            long j8 = source.read(bufferedSink.getBufferField(), Math.min(j7 - j6, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH));
            if (j8 == -1) {
                break;
            }
            long j9 = j6 + j8;
            bufferedSink.flush();
            OSSProgressCallback oSSProgressCallback = this.callback;
            if (oSSProgressCallback != null && j9 != 0) {
                oSSProgressCallback.onProgress(this.request, j9, this.contentLength);
            }
            j6 = j9;
        }
        if (source != null) {
            source.close();
        }
    }
}
