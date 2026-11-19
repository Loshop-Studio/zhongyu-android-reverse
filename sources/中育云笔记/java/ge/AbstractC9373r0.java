package ge;

import ee.InterfaceC9129f;
import ge.InterfaceC9349l0;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;

/* renamed from: ge.r0 */
/* loaded from: classes6.dex */
public abstract class AbstractC9373r0 {

    /* renamed from: ge.r0$a */
    public static final class a implements InterfaceC9349l0 {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC5432b f21789a;

        public a(InterfaceC5432b interfaceC5432b) {
            this.f21789a = interfaceC5432b;
        }

        @Override // ge.InterfaceC9349l0
        public InterfaceC5432b[] childSerializers() {
            return new InterfaceC5432b[]{this.f21789a};
        }

        @Override // p049ce.InterfaceC5431a
        public Object deserialize(InterfaceC9228e decoder) {
            AbstractC9979u.m20294g(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
        public InterfaceC9129f getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        @Override // p049ce.InterfaceC5439i
        public void serialize(InterfaceC9229f encoder, Object obj) {
            AbstractC9979u.m20294g(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // ge.InterfaceC9349l0
        public InterfaceC5432b[] typeParametersSerializers() {
            return InterfaceC9349l0.a.m18486a(this);
        }
    }

    /* renamed from: a */
    public static final InterfaceC9129f m18531a(String name, InterfaceC5432b primitiveSerializer) {
        AbstractC9979u.m20294g(name, "name");
        AbstractC9979u.m20294g(primitiveSerializer, "primitiveSerializer");
        return new C9369q0(name, new a(primitiveSerializer));
    }
}
