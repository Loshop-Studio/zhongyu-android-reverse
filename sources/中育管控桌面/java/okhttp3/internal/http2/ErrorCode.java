package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m7879d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, m7880d2 = {"Lokhttp3/internal/http2/ErrorCode;", "", "", "httpCode", "<init>", "(Ljava/lang/String;II)V", "a", "I", "b", "()I", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "okhttp"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class ErrorCode {

    /* renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: c */
    public static final ErrorCode f9879c = new ErrorCode("NO_ERROR", 0, 0);

    /* renamed from: d */
    public static final ErrorCode f9880d = new ErrorCode("PROTOCOL_ERROR", 1, 1);

    /* renamed from: e */
    public static final ErrorCode f9881e = new ErrorCode("INTERNAL_ERROR", 2, 2);

    /* renamed from: f */
    public static final ErrorCode f9882f = new ErrorCode("FLOW_CONTROL_ERROR", 3, 3);

    /* renamed from: g */
    public static final ErrorCode f9883g = new ErrorCode("SETTINGS_TIMEOUT", 4, 4);

    /* renamed from: h */
    public static final ErrorCode f9884h = new ErrorCode("STREAM_CLOSED", 5, 5);

    /* renamed from: i */
    public static final ErrorCode f9885i = new ErrorCode("FRAME_SIZE_ERROR", 6, 6);

    /* renamed from: j */
    public static final ErrorCode f9886j = new ErrorCode("REFUSED_STREAM", 7, 7);

    /* renamed from: k */
    public static final ErrorCode f9887k = new ErrorCode("CANCEL", 8, 8);

    /* renamed from: l */
    public static final ErrorCode f9888l = new ErrorCode("COMPRESSION_ERROR", 9, 9);

    /* renamed from: m */
    public static final ErrorCode f9889m = new ErrorCode("CONNECT_ERROR", 10, 10);

    /* renamed from: n */
    public static final ErrorCode f9890n = new ErrorCode("ENHANCE_YOUR_CALM", 11, 11);

    /* renamed from: o */
    public static final ErrorCode f9891o = new ErrorCode("INADEQUATE_SECURITY", 12, 12);

    /* renamed from: p */
    public static final ErrorCode f9892p = new ErrorCode("HTTP_1_1_REQUIRED", 13, 13);

    /* renamed from: q */
    public static final /* synthetic */ ErrorCode[] f9893q;

    /* renamed from: r */
    public static final /* synthetic */ EnumEntries f9894r;

    /* renamed from: a, reason: from kotlin metadata */
    public final int httpCode;

    /* renamed from: okhttp3.internal.http2.ErrorCode$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ErrorCode m8728a(int i6) {
            for (ErrorCode errorCode : ErrorCode.values()) {
                if (errorCode.getHttpCode() == i6) {
                    return errorCode;
                }
            }
            return null;
        }

        public Companion() {
        }
    }

    static {
        ErrorCode[] errorCodeArrM8726a = m8726a();
        f9893q = errorCodeArrM8726a;
        f9894r = EnumEntriesKt.enumEntries(errorCodeArrM8726a);
        INSTANCE = new Companion(null);
    }

    public ErrorCode(String str, int i6, int i7) {
        this.httpCode = i7;
    }

    /* renamed from: a */
    public static final /* synthetic */ ErrorCode[] m8726a() {
        return new ErrorCode[]{f9879c, f9880d, f9881e, f9882f, f9883g, f9884h, f9885i, f9886j, f9887k, f9888l, f9889m, f9890n, f9891o, f9892p};
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) f9893q.clone();
    }

    /* renamed from: b, reason: from getter */
    public final int getHttpCode() {
        return this.httpCode;
    }
}
