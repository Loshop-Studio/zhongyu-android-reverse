package okhttp3.internal.http2;

import kotlin.enums.AbstractC9108a;
import kotlin.jvm.internal.AbstractC9126n;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ErrorCode {

    /* renamed from: b */
    public static final C9562a f19100b;

    /* renamed from: c */
    public static final ErrorCode f19101c = new ErrorCode("NO_ERROR", 0, 0);

    /* renamed from: d */
    public static final ErrorCode f19102d = new ErrorCode("PROTOCOL_ERROR", 1, 1);

    /* renamed from: e */
    public static final ErrorCode f19103e = new ErrorCode("INTERNAL_ERROR", 2, 2);

    /* renamed from: f */
    public static final ErrorCode f19104f = new ErrorCode("FLOW_CONTROL_ERROR", 3, 3);

    /* renamed from: g */
    public static final ErrorCode f19105g = new ErrorCode("SETTINGS_TIMEOUT", 4, 4);

    /* renamed from: h */
    public static final ErrorCode f19106h = new ErrorCode("STREAM_CLOSED", 5, 5);

    /* renamed from: i */
    public static final ErrorCode f19107i = new ErrorCode("FRAME_SIZE_ERROR", 6, 6);

    /* renamed from: j */
    public static final ErrorCode f19108j = new ErrorCode("REFUSED_STREAM", 7, 7);

    /* renamed from: k */
    public static final ErrorCode f19109k = new ErrorCode("CANCEL", 8, 8);

    /* renamed from: l */
    public static final ErrorCode f19110l = new ErrorCode("COMPRESSION_ERROR", 9, 9);

    /* renamed from: m */
    public static final ErrorCode f19111m = new ErrorCode("CONNECT_ERROR", 10, 10);

    /* renamed from: n */
    public static final ErrorCode f19112n = new ErrorCode("ENHANCE_YOUR_CALM", 11, 11);

    /* renamed from: o */
    public static final ErrorCode f19113o = new ErrorCode("INADEQUATE_SECURITY", 12, 12);

    /* renamed from: p */
    public static final ErrorCode f19114p = new ErrorCode("HTTP_1_1_REQUIRED", 13, 13);

    /* renamed from: q */
    public static final /* synthetic */ ErrorCode[] f19115q;

    /* renamed from: r */
    public static final /* synthetic */ InterfaceC9760a f19116r;

    /* renamed from: a */
    public final int f19117a;

    /* renamed from: okhttp3.internal.http2.ErrorCode$a */
    public static final class C9562a {
        public /* synthetic */ C9562a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final ErrorCode m17909a(int i10) {
            for (ErrorCode errorCode : ErrorCode.values()) {
                if (errorCode.m17908b() == i10) {
                    return errorCode;
                }
            }
            return null;
        }

        public C9562a() {
        }
    }

    static {
        ErrorCode[] errorCodeArrM17907a = m17907a();
        f19115q = errorCodeArrM17907a;
        f19116r = AbstractC9108a.m16085a(errorCodeArrM17907a);
        f19100b = new C9562a(null);
    }

    public ErrorCode(String str, int i10, int i11) {
        this.f19117a = i11;
    }

    /* renamed from: a */
    public static final /* synthetic */ ErrorCode[] m17907a() {
        return new ErrorCode[]{f19101c, f19102d, f19103e, f19104f, f19105g, f19106h, f19107i, f19108j, f19109k, f19110l, f19111m, f19112n, f19113o, f19114p};
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) f19115q.clone();
    }

    /* renamed from: b */
    public final int m17908b() {
        return this.f19117a;
    }
}
