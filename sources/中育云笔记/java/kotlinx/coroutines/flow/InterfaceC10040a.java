package kotlinx.coroutines.flow;

import p379vd.C11611t;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11612u;

/* renamed from: kotlinx.coroutines.flow.a */
/* loaded from: classes6.dex */
public interface InterfaceC10040a {

    /* renamed from: a */
    public static final a f23896a = a.f23897a;

    /* renamed from: kotlinx.coroutines.flow.a$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f23897a = new a();

        /* renamed from: b */
        public static final InterfaceC10040a f23898b = new C11611t();

        /* renamed from: c */
        public static final InterfaceC10040a f23899c = new StartedLazily();

        /* renamed from: b */
        public static /* synthetic */ InterfaceC10040a m20875b(a aVar, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = 0;
            }
            if ((i10 & 2) != 0) {
                j11 = Long.MAX_VALUE;
            }
            return aVar.m20876a(j10, j11);
        }

        /* renamed from: a */
        public final InterfaceC10040a m20876a(long j10, long j11) {
            return new StartedWhileSubscribed(j10, j11);
        }

        /* renamed from: c */
        public final InterfaceC10040a m20877c() {
            return f23898b;
        }

        /* renamed from: d */
        public final InterfaceC10040a m20878d() {
            return f23899c;
        }
    }

    /* renamed from: a */
    InterfaceC11594c mo20863a(InterfaceC11612u interfaceC11612u);
}
