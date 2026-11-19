package kotlinx.coroutines.flow;

import p169l8.C9279p;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9280q;

/* renamed from: kotlinx.coroutines.flow.a */
/* loaded from: classes5.dex */
public interface InterfaceC9198a {

    /* renamed from: a */
    public static final a f17984a = a.f17985a;

    /* renamed from: kotlinx.coroutines.flow.a$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f17985a = new a();

        /* renamed from: b */
        public static final InterfaceC9198a f17986b = new C9279p();

        /* renamed from: c */
        public static final InterfaceC9198a f17987c = new StartedLazily();

        /* renamed from: b */
        public static /* synthetic */ InterfaceC9198a m16691b(a aVar, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = 0;
            }
            if ((i10 & 2) != 0) {
                j11 = Long.MAX_VALUE;
            }
            return aVar.m16692a(j10, j11);
        }

        /* renamed from: a */
        public final InterfaceC9198a m16692a(long j10, long j11) {
            return new StartedWhileSubscribed(j10, j11);
        }

        /* renamed from: c */
        public final InterfaceC9198a m16693c() {
            return f17986b;
        }

        /* renamed from: d */
        public final InterfaceC9198a m16694d() {
            return f17987c;
        }
    }

    /* renamed from: a */
    InterfaceC9266c mo16679a(InterfaceC9280q interfaceC9280q);
}
