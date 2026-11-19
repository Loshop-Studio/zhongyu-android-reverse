package androidx.navigation.compose;

import android.view.viewmodel.CreationExtras;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.navigation.NavBackStackEntry;
import p152r6.InterfaceC6471c;

/* renamed from: androidx.navigation.compose.f */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2844f implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f1217a;

    public /* synthetic */ C2844f(int i) {
        this.f1217a = i;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f1217a) {
            case 0:
                return NavBackStackEntryProviderKt.SaveableStateProvider$lambda$2$lambda$1((CreationExtras) obj);
            case 1:
                return NavHostKt.NavHost$lambda$33$lambda$32((AnimatedContentTransitionScope) obj);
            case 2:
                return NavHostKt.NavHost$lambda$3$lambda$2((AnimatedContentTransitionScope) obj);
            case 3:
                return NavHostKt.NavHost$lambda$5$lambda$4((AnimatedContentTransitionScope) obj);
            case 4:
                return NavHostKt.NavHost$lambda$21$lambda$20((AnimatedContentTransitionScope) obj);
            case 5:
                return NavHostKt.NavHost$lambda$23$lambda$22((AnimatedContentTransitionScope) obj);
            case 6:
                return NavHostKt.NavHost$lambda$28$lambda$27((AnimatedContentTransitionScope) obj);
            case 7:
                return ((NavBackStackEntry) obj).getId();
            case 8:
                return NavHostKt.NavHost$lambda$30$lambda$29((AnimatedContentTransitionScope) obj);
            case 9:
                return NavHostKt.NavHost$lambda$9$lambda$8((AnimatedContentTransitionScope) obj);
            case 10:
                return NavHostKt.NavHost$lambda$11$lambda$10((AnimatedContentTransitionScope) obj);
            case 11:
                return NavHostKt.NavHost$lambda$15$lambda$14((AnimatedContentTransitionScope) obj);
            case 12:
                return NavHostKt.NavHost$lambda$17$lambda$16((AnimatedContentTransitionScope) obj);
            default:
                return NavHostKt.NavHost$lambda$35$lambda$34((AnimatedContentTransitionScope) obj);
        }
    }
}
