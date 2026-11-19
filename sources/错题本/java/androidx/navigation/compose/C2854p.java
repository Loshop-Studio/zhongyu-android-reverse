package androidx.navigation.compose;

import android.os.Bundle;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.runtime.MutableState;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.internal.NavControllerImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import p152r6.InterfaceC6471c;

/* renamed from: androidx.navigation.compose.p */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2854p implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f1293a;

    /* renamed from: b */
    public final /* synthetic */ Object f1294b;

    /* renamed from: c */
    public final /* synthetic */ Object f1295c;

    /* renamed from: d */
    public final /* synthetic */ Object f1296d;

    /* renamed from: e */
    public final /* synthetic */ Object f1297e;

    public /* synthetic */ C2854p(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f1293a = i;
        this.f1294b = obj;
        this.f1295c = obj2;
        this.f1296d = obj3;
        this.f1297e = obj4;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f1293a) {
            case 0:
                return NavHostKt.NavHost$lambda$58$lambda$57((ComposeNavigator) this.f1294b, (InterfaceC6471c) this.f1295c, (InterfaceC6471c) this.f1296d, (MutableState) this.f1297e, (AnimatedContentTransitionScope) obj);
            case 1:
                return NavHostKt.NavHost$lambda$62$lambda$61((ComposeNavigator) this.f1294b, (InterfaceC6471c) this.f1295c, (InterfaceC6471c) this.f1296d, (MutableState) this.f1297e, (AnimatedContentTransitionScope) obj);
            default:
                return NavControllerImpl.navigate$lambda$44((Ref$BooleanRef) this.f1294b, (NavControllerImpl) this.f1295c, (NavDestination) this.f1296d, (Bundle) this.f1297e, (NavBackStackEntry) obj);
        }
    }
}
