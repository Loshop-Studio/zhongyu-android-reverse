package p133o7;

import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;
import p084i7.InterfaceC5686b;
import p152r6.InterfaceC6471c;

/* renamed from: o7.b */
/* loaded from: classes4.dex */
public final class C6278b extends AbstractC6279c {

    /* renamed from: a */
    public final InterfaceC6471c f10032a;

    public C6278b(InterfaceC6471c interfaceC6471c) {
        this.f10032a = interfaceC6471c;
    }

    @Override // p133o7.AbstractC6279c
    /* renamed from: a */
    public final InterfaceC5686b mo5872a(List typeArgumentsSerializers) {
        AbstractC5830k.m5330g(typeArgumentsSerializers, "typeArgumentsSerializers");
        return (InterfaceC5686b) this.f10032a.invoke(typeArgumentsSerializers);
    }
}
