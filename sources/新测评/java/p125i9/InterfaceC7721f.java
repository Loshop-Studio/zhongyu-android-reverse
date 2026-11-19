package p125i9;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import okio.BufferedSource;

/* renamed from: i9.f */
/* loaded from: classes5.dex */
public interface InterfaceC7721f {

    /* renamed from: a */
    public static final a f13148a = a.f13150a;

    /* renamed from: b */
    public static final InterfaceC7721f f13149b = new a.C10146a();

    /* renamed from: i9.f$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f13150a = new a();

        /* renamed from: i9.f$a$a, reason: collision with other inner class name */
        public static final class C10146a implements InterfaceC7721f {
            @Override // p125i9.InterfaceC7721f
            /* renamed from: a */
            public void mo12948a(int i10, ErrorCode errorCode) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            }

            @Override // p125i9.InterfaceC7721f
            /* renamed from: b */
            public boolean mo12949b(int i10, List requestHeaders) {
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // p125i9.InterfaceC7721f
            /* renamed from: c */
            public boolean mo12950c(int i10, List responseHeaders, boolean z9) {
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // p125i9.InterfaceC7721f
            /* renamed from: d */
            public boolean mo12951d(int i10, BufferedSource source, int i11, boolean z9) throws IOException {
                Intrinsics.checkNotNullParameter(source, "source");
                source.skip(i11);
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo12948a(int i10, ErrorCode errorCode);

    /* renamed from: b */
    boolean mo12949b(int i10, List list);

    /* renamed from: c */
    boolean mo12950c(int i10, List list, boolean z9);

    /* renamed from: d */
    boolean mo12951d(int i10, BufferedSource bufferedSource, int i11, boolean z9);
}
