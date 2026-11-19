package re;

import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import okhttp3.internal.http2.ErrorCode;
import okio.BufferedSource;

/* renamed from: re.f */
/* loaded from: classes6.dex */
public interface InterfaceC10999f {

    /* renamed from: a */
    public static final a f26560a = a.f26562a;

    /* renamed from: b */
    public static final InterfaceC10999f f26561b = new a.C12149a();

    /* renamed from: re.f$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f26562a = new a();

        /* renamed from: re.f$a$a, reason: collision with other inner class name */
        public static final class C12149a implements InterfaceC10999f {
            @Override // re.InterfaceC10999f
            /* renamed from: a */
            public void mo24302a(int i10, ErrorCode errorCode) {
                AbstractC9979u.m20294g(errorCode, "errorCode");
            }

            @Override // re.InterfaceC10999f
            /* renamed from: b */
            public boolean mo24303b(int i10, List requestHeaders) {
                AbstractC9979u.m20294g(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // re.InterfaceC10999f
            /* renamed from: c */
            public boolean mo24304c(int i10, List responseHeaders, boolean z10) {
                AbstractC9979u.m20294g(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // re.InterfaceC10999f
            /* renamed from: d */
            public boolean mo24305d(int i10, BufferedSource source, int i11, boolean z10) {
                AbstractC9979u.m20294g(source, "source");
                source.skip(i11);
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo24302a(int i10, ErrorCode errorCode);

    /* renamed from: b */
    boolean mo24303b(int i10, List list);

    /* renamed from: c */
    boolean mo24304c(int i10, List list, boolean z10);

    /* renamed from: d */
    boolean mo24305d(int i10, BufferedSource bufferedSource, int i11, boolean z10);
}
