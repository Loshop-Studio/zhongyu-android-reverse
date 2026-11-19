package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.internal.NavDestinationImpl;
import p152r6.InterfaceC6471c;

/* renamed from: androidx.navigation.h */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2860h implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f1312a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f1313b;

    public /* synthetic */ C2860h(int i, Bundle bundle) {
        this.f1312a = i;
        this.f1313b = bundle;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        boolean matchingArguments$lambda$13;
        switch (this.f1312a) {
            case 0:
                matchingArguments$lambda$13 = NavDeepLink.getMatchingArguments$lambda$13(this.f1313b, (String) obj);
                break;
            default:
                matchingArguments$lambda$13 = NavDestinationImpl.hasRequiredArguments$lambda$7(this.f1313b, (String) obj);
                break;
        }
        return Boolean.valueOf(matchingArguments$lambda$13);
    }
}
