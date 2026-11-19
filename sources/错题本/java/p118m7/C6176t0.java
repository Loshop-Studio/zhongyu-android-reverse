package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import p101k7.InterfaceC5765g;
import p109l7.AbstractC6068b;
import p133o7.AbstractC6281e;
import p133o7.AbstractC6283g;
import p133o7.C6280d;

/* renamed from: m7.t0 */
/* loaded from: classes4.dex */
public final class C6176t0 extends AbstractC6068b {

    /* renamed from: a */
    public static final C6176t0 f9865a = new C6176t0();

    /* renamed from: b */
    public static final C6280d f9866b = AbstractC6283g.f10039a;

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    public final void encodeEnum(InterfaceC5765g enumDescriptor, int i) {
        AbstractC5830k.m5330g(enumDescriptor, "enumDescriptor");
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    public final void encodeString(String value) {
        AbstractC5830k.m5330g(value, "value");
    }

    @Override // p109l7.AbstractC6068b
    public final void encodeValue(Object value) {
        AbstractC5830k.m5330g(value, "value");
    }

    @Override // p109l7.InterfaceC6072f
    public final AbstractC6281e getSerializersModule() {
        return f9866b;
    }

    @Override // p109l7.InterfaceC6072f
    public final void encodeNull() {
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    public final void encodeBoolean(boolean z8) {
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    public final void encodeByte(byte b6) {
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    public final void encodeChar(char c) {
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    public final void encodeDouble(double d9) {
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    public final void encodeFloat(float f) {
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    public final void encodeInt(int i) {
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    public final void encodeLong(long j7) {
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    public final void encodeShort(short s8) {
    }
}
