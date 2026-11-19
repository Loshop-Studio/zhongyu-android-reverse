package kotlinx.serialization.modules;

import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.serialization.modules.AbstractC10054a;
import p049ce.InterfaceC5432b;
import p181hd.InterfaceC9540l;
import p182he.AbstractC9553a;
import p182he.InterfaceC9555c;
import p280od.InterfaceC10469c;

/* renamed from: kotlinx.serialization.modules.d */
/* loaded from: classes6.dex */
public abstract class AbstractC10057d {

    /* renamed from: a */
    public static final AbstractC9553a f24073a = new C10055b(AbstractC9925a.m20088h(), AbstractC9925a.m20088h(), AbstractC9925a.m20088h(), AbstractC9925a.m20088h(), AbstractC9925a.m20088h(), false);

    /* renamed from: kotlinx.serialization.modules.d$a */
    public static final class a implements InterfaceC9555c {

        /* renamed from: a */
        public final /* synthetic */ C10056c f24074a;

        public a(C10056c c10056c) {
            this.f24074a = c10056c;
        }

        @Override // p182he.InterfaceC9555c
        /* renamed from: a */
        public void mo18783a(InterfaceC10469c baseClass, InterfaceC10469c actualClass, InterfaceC5432b actualSerializer) {
            AbstractC9979u.m20294g(baseClass, "baseClass");
            AbstractC9979u.m20294g(actualClass, "actualClass");
            AbstractC9979u.m20294g(actualSerializer, "actualSerializer");
            this.f24074a.m21049j(baseClass, actualClass, actualSerializer, true);
        }

        @Override // p182he.InterfaceC9555c
        /* renamed from: b */
        public void mo18784b(InterfaceC10469c baseClass, InterfaceC9540l defaultSerializerProvider) {
            AbstractC9979u.m20294g(baseClass, "baseClass");
            AbstractC9979u.m20294g(defaultSerializerProvider, "defaultSerializerProvider");
            this.f24074a.m21048i(baseClass, defaultSerializerProvider, true);
        }

        @Override // p182he.InterfaceC9555c
        /* renamed from: c */
        public void mo18785c(InterfaceC10469c baseClass, InterfaceC9540l defaultDeserializerProvider) {
            AbstractC9979u.m20294g(baseClass, "baseClass");
            AbstractC9979u.m20294g(defaultDeserializerProvider, "defaultDeserializerProvider");
            this.f24074a.m21047h(baseClass, defaultDeserializerProvider, true);
        }

        @Override // p182he.InterfaceC9555c
        /* renamed from: d */
        public void mo18786d(InterfaceC10469c kClass, InterfaceC5432b serializer) {
            AbstractC9979u.m20294g(kClass, "kClass");
            AbstractC9979u.m20294g(serializer, "serializer");
            this.f24074a.m21050l(kClass, new AbstractC10054a.a(serializer), true);
        }

        @Override // p182he.InterfaceC9555c
        /* renamed from: e */
        public void mo18787e(InterfaceC10469c kClass, InterfaceC9540l provider) {
            AbstractC9979u.m20294g(kClass, "kClass");
            AbstractC9979u.m20294g(provider, "provider");
            this.f24074a.m21050l(kClass, new AbstractC10054a.b(provider), true);
        }
    }

    /* renamed from: a */
    public static final AbstractC9553a m21051a() {
        return f24073a;
    }

    /* renamed from: b */
    public static final AbstractC9553a m21052b(AbstractC9553a abstractC9553a, AbstractC9553a other) {
        AbstractC9979u.m20294g(abstractC9553a, "<this>");
        AbstractC9979u.m20294g(other, "other");
        C10056c c10056c = new C10056c();
        c10056c.m21046g(abstractC9553a);
        other.mo18777a(new a(c10056c));
        return c10056c.m21045f();
    }

    /* renamed from: c */
    public static final AbstractC9553a m21053c(AbstractC9553a abstractC9553a, AbstractC9553a other) {
        AbstractC9979u.m20294g(abstractC9553a, "<this>");
        AbstractC9979u.m20294g(other, "other");
        C10056c c10056c = new C10056c();
        c10056c.m21046g(abstractC9553a);
        c10056c.m21046g(other);
        return c10056c.m21045f();
    }
}
