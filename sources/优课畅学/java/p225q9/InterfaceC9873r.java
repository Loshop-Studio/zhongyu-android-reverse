package p225q9;

import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.internal.http2.ErrorCode;
import okio.BufferedSource;

/* renamed from: q9.r */
/* loaded from: classes5.dex */
public interface InterfaceC9873r {

    /* renamed from: a */
    public static final a f19753a = a.f19755a;

    /* renamed from: b */
    public static final InterfaceC9873r f19754b = new a.C10812a();

    /* renamed from: q9.r$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f19755a = new a();

        /* renamed from: q9.r$a$a, reason: collision with other inner class name */
        public static final class C10812a implements InterfaceC9873r {
            @Override // p225q9.InterfaceC9873r
            /* renamed from: a */
            public void mo18432a(int i10, ErrorCode errorCode) {
                AbstractC9133u.m16133g(errorCode, "errorCode");
            }

            @Override // p225q9.InterfaceC9873r
            /* renamed from: b */
            public boolean mo18433b(int i10, List requestHeaders) {
                AbstractC9133u.m16133g(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // p225q9.InterfaceC9873r
            /* renamed from: c */
            public boolean mo18434c(int i10, List responseHeaders, boolean z10) {
                AbstractC9133u.m16133g(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // p225q9.InterfaceC9873r
            /* renamed from: d */
            public boolean mo18435d(int i10, BufferedSource source, int i11, boolean z10) {
                AbstractC9133u.m16133g(source, "source");
                source.skip(i11);
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo18432a(int i10, ErrorCode errorCode);

    /* renamed from: b */
    boolean mo18433b(int i10, List list);

    /* renamed from: c */
    boolean mo18434c(int i10, List list, boolean z10);

    /* renamed from: d */
    boolean mo18435d(int i10, BufferedSource bufferedSource, int i11, boolean z10);
}
