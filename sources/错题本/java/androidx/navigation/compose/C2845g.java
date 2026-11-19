package androidx.navigation.compose;

import android.content.Context;
import androidx.compose.runtime.State;
import p152r6.InterfaceC6469a;

/* renamed from: androidx.navigation.compose.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2845g implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f1218a;

    /* renamed from: b */
    public final /* synthetic */ Object f1219b;

    public /* synthetic */ C2845g(Object obj, int i) {
        this.f1218a = i;
        this.f1219b = obj;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        switch (this.f1218a) {
            case 0:
                return NavHostControllerKt__NavHostController_androidKt.m1889x191ea551((Context) this.f1219b);
            default:
                return NavHostKt.NavHost$lambda$52$lambda$51((State) this.f1219b);
        }
    }
}
