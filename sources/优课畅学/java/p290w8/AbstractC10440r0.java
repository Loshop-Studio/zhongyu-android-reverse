package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10052b;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;
import p290w8.InterfaceC10416l0;

/* renamed from: w8.r0 */
/* loaded from: classes5.dex */
public abstract class AbstractC10440r0 {

    /* renamed from: w8.r0$a */
    public static final class a implements InterfaceC10416l0 {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10052b f20762a;

        public a(InterfaceC10052b interfaceC10052b) {
            this.f20762a = interfaceC10052b;
        }

        @Override // p290w8.InterfaceC10416l0
        public InterfaceC10052b[] childSerializers() {
            return new InterfaceC10052b[]{this.f20762a};
        }

        @Override // p246s8.InterfaceC10051a
        public Object deserialize(InterfaceC10256e decoder) {
            AbstractC9133u.m16133g(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
        public InterfaceC10210f getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        @Override // p246s8.InterfaceC10059i
        public void serialize(InterfaceC10257f encoder, Object obj) {
            AbstractC9133u.m16133g(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // p290w8.InterfaceC10416l0
        public InterfaceC10052b[] typeParametersSerializers() {
            return InterfaceC10416l0.a.m19460a(this);
        }
    }

    /* renamed from: a */
    public static final InterfaceC10210f m19505a(String name, InterfaceC10052b primitiveSerializer) {
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(primitiveSerializer, "primitiveSerializer");
        return new C10436q0(name, new a(primitiveSerializer));
    }
}
