package kotlinx.serialization.modules;

import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10052b;
import p300x7.InterfaceC10570l;

/* renamed from: kotlinx.serialization.modules.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9223a {

    /* renamed from: kotlinx.serialization.modules.a$a */
    public static final class a extends AbstractC9223a {

        /* renamed from: a */
        public final InterfaceC10052b f18194a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC10052b serializer) {
            super(null);
            AbstractC9133u.m16133g(serializer, "serializer");
            this.f18194a = serializer;
        }

        @Override // kotlinx.serialization.modules.AbstractC9223a
        /* renamed from: a */
        public InterfaceC10052b mo16907a(List typeArgumentsSerializers) {
            AbstractC9133u.m16133g(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f18194a;
        }

        /* renamed from: b */
        public final InterfaceC10052b m16908b() {
            return this.f18194a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && AbstractC9133u.m16128b(((a) obj).f18194a, this.f18194a);
        }

        public int hashCode() {
            return this.f18194a.hashCode();
        }
    }

    /* renamed from: kotlinx.serialization.modules.a$b */
    public static final class b extends AbstractC9223a {

        /* renamed from: a */
        public final InterfaceC10570l f18195a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC10570l provider) {
            super(null);
            AbstractC9133u.m16133g(provider, "provider");
            this.f18195a = provider;
        }

        @Override // kotlinx.serialization.modules.AbstractC9223a
        /* renamed from: a */
        public InterfaceC10052b mo16907a(List typeArgumentsSerializers) {
            AbstractC9133u.m16133g(typeArgumentsSerializers, "typeArgumentsSerializers");
            return (InterfaceC10052b) this.f18195a.invoke(typeArgumentsSerializers);
        }

        /* renamed from: b */
        public final InterfaceC10570l m16909b() {
            return this.f18195a;
        }
    }

    public /* synthetic */ AbstractC9223a(AbstractC9126n abstractC9126n) {
        this();
    }

    /* renamed from: a */
    public abstract InterfaceC10052b mo16907a(List list);

    public AbstractC9223a() {
    }
}
