package okhttp3.internal.http2;

import kotlin.jvm.internal.Intrinsics;
import p123o5.C7522a;

/* renamed from: okhttp3.internal.http2.a */
/* loaded from: classes4.dex */
public interface InterfaceC7529a {

    /* renamed from: okhttp3.internal.http2.a$a */
    public static final class a implements InterfaceC7529a {

        /* renamed from: a */
        public static final a f9897a = new a();

        @Override // okhttp3.internal.http2.InterfaceC7529a
        /* renamed from: a */
        public void mo8729a(int i6, C7522a windowCounter, long j6) {
            Intrinsics.checkNotNullParameter(windowCounter, "windowCounter");
        }

        @Override // okhttp3.internal.http2.InterfaceC7529a
        /* renamed from: b */
        public void mo8730b(C7522a windowCounter) {
            Intrinsics.checkNotNullParameter(windowCounter, "windowCounter");
        }
    }

    /* renamed from: a */
    void mo8729a(int i6, C7522a c7522a, long j6);

    /* renamed from: b */
    void mo8730b(C7522a c7522a);
}
