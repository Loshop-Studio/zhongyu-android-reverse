package p167t4;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import com.zykj.mistake.feature.ask.AbstractC4514c;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p152r6.InterfaceC6475g;

/* renamed from: t4.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6588a implements InterfaceC6475g {
    @Override // p152r6.InterfaceC6475g
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AnimatedContentScope composable = (AnimatedContentScope) obj;
        NavBackStackEntry entry = (NavBackStackEntry) obj2;
        Composer composer = (Composer) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        AbstractC5830k.m5330g(composable, "$this$composable");
        AbstractC5830k.m5330g(entry, "entry");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1698036126, iIntValue, -1, "com.zykj.mistake.navigation.ComposableSingletons$MainNavHostKt.lambda$-1698036126.<anonymous> (MainNavHost.kt:128)");
        }
        AbstractC4514c.m4001a(entry, composer, (iIntValue >> 3) & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return C5443s.f8405a;
    }
}
