package okhttp3.internal.http2;

import kotlin.jvm.internal.AbstractC9133u;
import p236r9.C9947a;

/* renamed from: okhttp3.internal.http2.a */
/* loaded from: classes5.dex */
public interface InterfaceC9563a {

    /* renamed from: okhttp3.internal.http2.a$a */
    public static final class a implements InterfaceC9563a {

        /* renamed from: a */
        public static final a f19119a = new a();

        @Override // okhttp3.internal.http2.InterfaceC9563a
        /* renamed from: a */
        public void mo17910a(C9947a windowCounter) {
            AbstractC9133u.m16133g(windowCounter, "windowCounter");
        }

        @Override // okhttp3.internal.http2.InterfaceC9563a
        /* renamed from: b */
        public void mo17911b(int i10, C9947a windowCounter, long j10) {
            AbstractC9133u.m16133g(windowCounter, "windowCounter");
        }
    }

    /* renamed from: a */
    void mo17910a(C9947a c9947a);

    /* renamed from: b */
    void mo17911b(int i10, C9947a c9947a, long j10);
}
