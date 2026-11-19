package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes5.dex */
public final class StreamResetException extends IOException {

    /* renamed from: a */
    public final ErrorCode f19118a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        AbstractC9133u.m16133g(errorCode, "errorCode");
        this.f19118a = errorCode;
    }
}
