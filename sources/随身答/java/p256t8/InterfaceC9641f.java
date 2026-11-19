package p256t8;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import okio.BufferedSource;

/* renamed from: t8.f */
/* loaded from: classes5.dex */
public interface InterfaceC9641f {

    /* renamed from: a */
    public static final a f16978a = a.f16980a;

    /* renamed from: b */
    public static final InterfaceC9641f f16979b = new a.C10088a();

    /* renamed from: t8.f$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f16980a = new a();

        /* renamed from: t8.f$a$a, reason: collision with other inner class name */
        public static final class C10088a implements InterfaceC9641f {
            @Override // p256t8.InterfaceC9641f
            /* renamed from: a */
            public void mo15967a(int i9, ErrorCode errorCode) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            }

            @Override // p256t8.InterfaceC9641f
            /* renamed from: b */
            public boolean mo15968b(int i9, List requestHeaders) {
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // p256t8.InterfaceC9641f
            /* renamed from: c */
            public boolean mo15969c(int i9, List responseHeaders, boolean z9) {
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // p256t8.InterfaceC9641f
            /* renamed from: d */
            public boolean mo15970d(int i9, BufferedSource source, int i10, boolean z9) throws IOException {
                Intrinsics.checkNotNullParameter(source, "source");
                source.skip(i10);
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo15967a(int i9, ErrorCode errorCode);

    /* renamed from: b */
    boolean mo15968b(int i9, List list);

    /* renamed from: c */
    boolean mo15969c(int i9, List list, boolean z9);

    /* renamed from: d */
    boolean mo15970d(int i9, BufferedSource bufferedSource, int i10, boolean z9);
}
