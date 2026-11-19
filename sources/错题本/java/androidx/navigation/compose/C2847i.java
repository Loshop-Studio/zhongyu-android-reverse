package androidx.navigation.compose;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.animation.AnimatedContentTransitionScope;
import p152r6.InterfaceC6471c;

/* renamed from: androidx.navigation.compose.i */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2847i implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f1220a;

    /* renamed from: b */
    public final /* synthetic */ Object f1221b;

    public /* synthetic */ C2847i(Object obj, int i) {
        this.f1220a = i;
        this.f1221b = obj;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f1220a) {
            case 0:
                return NavHostControllerKt__NavHostController_androidKt.m1885x9e1410ad((Context) this.f1221b, (Bundle) obj);
            default:
                return NavHostKt.NavHost$lambda$65$lambda$64((InterfaceC6471c) this.f1221b, (AnimatedContentTransitionScope) obj);
        }
    }
}
