package androidx.navigation.internal;

import androidx.navigation.NavDeepLink;
import p152r6.InterfaceC6471c;

/* renamed from: androidx.navigation.internal.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2868g implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f1337a;

    /* renamed from: b */
    public final /* synthetic */ NavDeepLink f1338b;

    public /* synthetic */ C2868g(NavDeepLink navDeepLink, int i) {
        this.f1337a = i;
        this.f1338b = navDeepLink;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        boolean zAddDeepLink$lambda$4;
        switch (this.f1337a) {
            case 0:
                zAddDeepLink$lambda$4 = NavDestinationImpl.addDeepLink$lambda$4(this.f1338b, (String) obj);
                break;
            default:
                zAddDeepLink$lambda$4 = NavDestinationImpl._set_route_$lambda$1(this.f1338b, (String) obj);
                break;
        }
        return Boolean.valueOf(zAddDeepLink$lambda$4);
    }
}
