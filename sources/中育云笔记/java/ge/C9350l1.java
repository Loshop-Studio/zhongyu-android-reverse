package ge;

import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import p153fe.AbstractC9225b;
import p182he.AbstractC9553a;
import p182he.AbstractC9554b;

/* renamed from: ge.l1 */
/* loaded from: classes6.dex */
public final class C9350l1 extends AbstractC9225b {

    /* renamed from: a */
    public static final C9350l1 f21759a = new C9350l1();

    /* renamed from: b */
    public static final AbstractC9553a f21760b = AbstractC9554b.m18782a();

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public void encodeEnum(InterfaceC9129f enumDescriptor, int i10) {
        AbstractC9979u.m20294g(enumDescriptor, "enumDescriptor");
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public void encodeString(String value) {
        AbstractC9979u.m20294g(value, "value");
    }

    @Override // p153fe.AbstractC9225b
    public void encodeValue(Object value) {
        AbstractC9979u.m20294g(value, "value");
    }

    @Override // p153fe.InterfaceC9229f
    public AbstractC9553a getSerializersModule() {
        return f21760b;
    }

    @Override // p153fe.InterfaceC9229f
    public void encodeNull() {
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public void encodeBoolean(boolean z10) {
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public void encodeByte(byte b10) {
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public void encodeChar(char c10) {
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public void encodeDouble(double d10) {
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public void encodeFloat(float f10) {
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public void encodeInt(int i10) {
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public void encodeLong(long j10) {
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public void encodeShort(short s10) {
    }
}
