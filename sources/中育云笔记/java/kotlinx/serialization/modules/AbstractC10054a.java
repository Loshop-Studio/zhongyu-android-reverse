package kotlinx.serialization.modules;

import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p181hd.InterfaceC9540l;

/* renamed from: kotlinx.serialization.modules.a */
/* loaded from: classes6.dex */
public abstract class AbstractC10054a {

    /* renamed from: kotlinx.serialization.modules.a$a */
    public static final class a extends AbstractC10054a {

        /* renamed from: a */
        public final InterfaceC5432b f24059a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5432b serializer) {
            super(null);
            AbstractC9979u.m20294g(serializer, "serializer");
            this.f24059a = serializer;
        }

        @Override // kotlinx.serialization.modules.AbstractC10054a
        /* renamed from: a */
        public InterfaceC5432b mo21040a(List typeArgumentsSerializers) {
            AbstractC9979u.m20294g(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f24059a;
        }

        /* renamed from: b */
        public final InterfaceC5432b m21041b() {
            return this.f24059a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && AbstractC9979u.m20289b(((a) obj).f24059a, this.f24059a);
        }

        public int hashCode() {
            return this.f24059a.hashCode();
        }
    }

    /* renamed from: kotlinx.serialization.modules.a$b */
    public static final class b extends AbstractC10054a {

        /* renamed from: a */
        public final InterfaceC9540l f24060a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC9540l provider) {
            super(null);
            AbstractC9979u.m20294g(provider, "provider");
            this.f24060a = provider;
        }

        @Override // kotlinx.serialization.modules.AbstractC10054a
        /* renamed from: a */
        public InterfaceC5432b mo21040a(List typeArgumentsSerializers) {
            AbstractC9979u.m20294g(typeArgumentsSerializers, "typeArgumentsSerializers");
            return (InterfaceC5432b) this.f24060a.invoke(typeArgumentsSerializers);
        }

        /* renamed from: b */
        public final InterfaceC9540l m21042b() {
            return this.f24060a;
        }
    }

    public /* synthetic */ AbstractC10054a(AbstractC9972n abstractC9972n) {
        this();
    }

    /* renamed from: a */
    public abstract InterfaceC5432b mo21040a(List list);

    public AbstractC10054a() {
    }
}
