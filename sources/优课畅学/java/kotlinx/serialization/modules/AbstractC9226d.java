package kotlinx.serialization.modules;

import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.serialization.modules.AbstractC9223a;
import p089e8.InterfaceC8375c;
import p246s8.InterfaceC10052b;
import p300x7.InterfaceC10570l;
import p301x8.AbstractC10583a;
import p301x8.InterfaceC10585c;

/* renamed from: kotlinx.serialization.modules.d */
/* loaded from: classes5.dex */
public abstract class AbstractC9226d {

    /* renamed from: a */
    public static final AbstractC10583a f18208a = new C9224b(AbstractC9080a.m15943h(), AbstractC9080a.m15943h(), AbstractC9080a.m15943h(), AbstractC9080a.m15943h(), AbstractC9080a.m15943h(), false);

    /* renamed from: kotlinx.serialization.modules.d$a */
    public static final class a implements InterfaceC10585c {

        /* renamed from: a */
        public final /* synthetic */ C9225c f18209a;

        public a(C9225c c9225c) {
            this.f18209a = c9225c;
        }

        @Override // p301x8.InterfaceC10585c
        /* renamed from: a */
        public void mo16917a(InterfaceC8375c kClass, InterfaceC10052b serializer) {
            AbstractC9133u.m16133g(kClass, "kClass");
            AbstractC9133u.m16133g(serializer, "serializer");
            this.f18209a.m16927l(kClass, new AbstractC9223a.a(serializer), true);
        }

        @Override // p301x8.InterfaceC10585c
        /* renamed from: b */
        public void mo16918b(InterfaceC8375c baseClass, InterfaceC10570l defaultSerializerProvider) {
            AbstractC9133u.m16133g(baseClass, "baseClass");
            AbstractC9133u.m16133g(defaultSerializerProvider, "defaultSerializerProvider");
            this.f18209a.m16925i(baseClass, defaultSerializerProvider, true);
        }

        @Override // p301x8.InterfaceC10585c
        /* renamed from: c */
        public void mo16919c(InterfaceC8375c kClass, InterfaceC10570l provider) {
            AbstractC9133u.m16133g(kClass, "kClass");
            AbstractC9133u.m16133g(provider, "provider");
            this.f18209a.m16927l(kClass, new AbstractC9223a.b(provider), true);
        }

        @Override // p301x8.InterfaceC10585c
        /* renamed from: d */
        public void mo16920d(InterfaceC8375c baseClass, InterfaceC10570l defaultDeserializerProvider) {
            AbstractC9133u.m16133g(baseClass, "baseClass");
            AbstractC9133u.m16133g(defaultDeserializerProvider, "defaultDeserializerProvider");
            this.f18209a.m16924h(baseClass, defaultDeserializerProvider, true);
        }

        @Override // p301x8.InterfaceC10585c
        /* renamed from: e */
        public void mo16921e(InterfaceC8375c baseClass, InterfaceC8375c actualClass, InterfaceC10052b actualSerializer) {
            AbstractC9133u.m16133g(baseClass, "baseClass");
            AbstractC9133u.m16133g(actualClass, "actualClass");
            AbstractC9133u.m16133g(actualSerializer, "actualSerializer");
            this.f18209a.m16926j(baseClass, actualClass, actualSerializer, true);
        }
    }

    /* renamed from: a */
    public static final AbstractC10583a m16928a() {
        return f18208a;
    }

    /* renamed from: b */
    public static final AbstractC10583a m16929b(AbstractC10583a abstractC10583a, AbstractC10583a other) {
        AbstractC9133u.m16133g(abstractC10583a, "<this>");
        AbstractC9133u.m16133g(other, "other");
        C9225c c9225c = new C9225c();
        c9225c.m16923g(abstractC10583a);
        other.mo16910a(new a(c9225c));
        return c9225c.m16922f();
    }

    /* renamed from: c */
    public static final AbstractC10583a m16930c(AbstractC10583a abstractC10583a, AbstractC10583a other) {
        AbstractC9133u.m16133g(abstractC10583a, "<this>");
        AbstractC9133u.m16133g(other, "other");
        C9225c c9225c = new C9225c();
        c9225c.m16923g(abstractC10583a);
        c9225c.m16923g(other);
        return c9225c.m16922f();
    }
}
