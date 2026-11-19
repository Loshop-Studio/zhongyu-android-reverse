package p116n5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import okio.BufferedSource;

/* renamed from: n5.r */
/* loaded from: classes4.dex */
public interface InterfaceC7484r {

    /* renamed from: a */
    public static final a f9659a = a.f9661a;

    /* renamed from: b */
    public static final InterfaceC7484r f9660b = new a.C8037a();

    /* renamed from: n5.r$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f9661a = new a();

        /* renamed from: n5.r$a$a, reason: collision with other inner class name */
        public static final class C8037a implements InterfaceC7484r {
            @Override // p116n5.InterfaceC7484r
            /* renamed from: a */
            public void mo8599a(int i6, ErrorCode errorCode) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            }

            @Override // p116n5.InterfaceC7484r
            /* renamed from: b */
            public boolean mo8600b(int i6, List requestHeaders) {
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // p116n5.InterfaceC7484r
            /* renamed from: c */
            public boolean mo8601c(int i6, List responseHeaders, boolean z6) {
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // p116n5.InterfaceC7484r
            /* renamed from: d */
            public boolean mo8602d(int i6, BufferedSource source, int i7, boolean z6) {
                Intrinsics.checkNotNullParameter(source, "source");
                source.skip(i7);
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo8599a(int i6, ErrorCode errorCode);

    /* renamed from: b */
    boolean mo8600b(int i6, List list);

    /* renamed from: c */
    boolean mo8601c(int i6, List list, boolean z6);

    /* renamed from: d */
    boolean mo8602d(int i6, BufferedSource bufferedSource, int i7, boolean z6);
}
