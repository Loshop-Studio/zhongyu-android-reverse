package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p246s8.InterfaceC10052b;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* renamed from: w8.i3 */
/* loaded from: classes5.dex */
public final class C10405i3 implements InterfaceC10052b {

    /* renamed from: b */
    public static final C10405i3 f20716b = new C10405i3();

    /* renamed from: a */
    public final /* synthetic */ C10441r1 f20717a = new C10441r1("kotlin.Unit", C8736p.f16368a);

    /* renamed from: a */
    public void m19434a(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        this.f20717a.deserialize(decoder);
    }

    @Override // p246s8.InterfaceC10059i
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC10257f encoder, C8736p value) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(value, "value");
        this.f20717a.serialize(encoder, value);
    }

    @Override // p246s8.InterfaceC10051a
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC10256e interfaceC10256e) {
        m19434a(interfaceC10256e);
        return C8736p.f16368a;
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return this.f20717a.getDescriptor();
    }
}
