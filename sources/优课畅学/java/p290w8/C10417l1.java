package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import p268u8.InterfaceC10210f;
import p279v8.AbstractC10253b;
import p301x8.AbstractC10583a;
import p301x8.AbstractC10584b;

/* renamed from: w8.l1 */
/* loaded from: classes5.dex */
public final class C10417l1 extends AbstractC10253b {

    /* renamed from: a */
    public static final C10417l1 f20732a = new C10417l1();

    /* renamed from: b */
    public static final AbstractC10583a f20733b = AbstractC10584b.m19742a();

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public void encodeEnum(InterfaceC10210f enumDescriptor, int i10) {
        AbstractC9133u.m16133g(enumDescriptor, "enumDescriptor");
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public void encodeString(String value) {
        AbstractC9133u.m16133g(value, "value");
    }

    @Override // p279v8.AbstractC10253b
    public void encodeValue(Object value) {
        AbstractC9133u.m16133g(value, "value");
    }

    @Override // p279v8.InterfaceC10257f
    public AbstractC10583a getSerializersModule() {
        return f20733b;
    }

    @Override // p279v8.InterfaceC10257f
    public void encodeNull() {
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public void encodeBoolean(boolean z10) {
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public void encodeByte(byte b10) {
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public void encodeChar(char c10) {
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public void encodeDouble(double d10) {
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public void encodeFloat(float f10) {
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public void encodeInt(int i10) {
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public void encodeLong(long j10) {
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public void encodeShort(short s10) {
    }
}
