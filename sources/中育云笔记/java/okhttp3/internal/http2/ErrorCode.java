package okhttp3.internal.http2;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes6.dex */
public enum ErrorCode {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* renamed from: d */
    public static final C10499a f25137d = new C10499a(null);

    /* renamed from: c */
    public final int f25153c;

    /* renamed from: okhttp3.internal.http2.ErrorCode$a */
    public static final class C10499a {
        public /* synthetic */ C10499a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final ErrorCode m22021a(int i10) {
            for (ErrorCode errorCode : ErrorCode.values()) {
                if (errorCode.m22020c() == i10) {
                    return errorCode;
                }
            }
            return null;
        }

        public C10499a() {
        }
    }

    ErrorCode(int i10) {
        this.f25153c = i10;
    }

    /* renamed from: c */
    public final int m22020c() {
        return this.f25153c;
    }
}
