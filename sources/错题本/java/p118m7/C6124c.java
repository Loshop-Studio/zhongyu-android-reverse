package p118m7;

import p101k7.InterfaceC5765g;

/* renamed from: m7.c */
/* loaded from: classes4.dex */
public final class C6124c extends AbstractC6152l0 {

    /* renamed from: b */
    public final /* synthetic */ int f9781b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6124c(InterfaceC5765g interfaceC5765g, int i) {
        super(interfaceC5765g);
        this.f9781b = i;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: h */
    public final String mo5105h() {
        switch (this.f9781b) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
