package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class StreamResetException extends IOException {

    /* renamed from: c */
    public final ErrorCode f25154c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        AbstractC9979u.m20294g(errorCode, "errorCode");
        this.f25154c = errorCode;
    }
}
