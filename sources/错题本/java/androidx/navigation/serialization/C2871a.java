package androidx.navigation.serialization;

import p084i7.InterfaceC5686b;
import p152r6.InterfaceC6469a;

/* renamed from: androidx.navigation.serialization.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2871a implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f1344a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC5686b f1345b;

    public /* synthetic */ C2871a(InterfaceC5686b interfaceC5686b, int i) {
        this.f1344a = i;
        this.f1345b = interfaceC5686b;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        switch (this.f1344a) {
            case 0:
                return RouteSerializerKt.generateRoutePattern$lambda$0(this.f1345b);
            default:
                return RouteSerializerKt.generateNavArguments$lambda$2(this.f1345b);
        }
    }
}
