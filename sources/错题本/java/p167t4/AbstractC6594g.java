package p167t4;

import android.view.compose.C2756g;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.core.view.PointerIconCompat;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavHostKt;
import com.zykj.mistake.feature.collection.component.C4564j;
import com.zykj.mistake.main.C5045f;
import com.zykj.mistake.main.MainShellViewModel;
import kotlin.jvm.internal.AbstractC5830k;
import p125n7.C6237l;
import p152r6.InterfaceC6471c;

/* renamed from: t4.g */
/* loaded from: classes3.dex */
public abstract class AbstractC6594g {

    /* renamed from: a */
    public static final TweenSpec f11006a = AnimationSpecKt.tween$default(500, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* renamed from: b */
    public static final TweenSpec f11007b = AnimationSpecKt.tween$default(400, 0, EasingKt.getFastOutLinearInEasing(), 2, null);

    /* renamed from: c */
    public static final TweenSpec f11008c = AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), 2, null);

    /* renamed from: d */
    public static final TweenSpec f11009d = AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null);

    /* renamed from: a */
    public static final void m6225a(NavHostController navController, MainShellViewModel shellViewModel, Modifier modifier, Composer composer, int i) {
        int i8;
        Modifier modifier2;
        AbstractC5830k.m5330g(navController, "navController");
        AbstractC5830k.m5330g(shellViewModel, "shellViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1731057086);
        if ((i & 6) == 0) {
            i8 = i | (composerStartRestartGroup.changedInstance(navController) ? 4 : 2);
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(shellViewModel) ? 32 : 16;
        }
        int i9 = i8 | 384;
        if (composerStartRestartGroup.shouldExecute((i9 & 147) != 146, i9 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1731057086, i9, -1, "com.zykj.mistake.navigation.MainNavHost (MainNavHost.kt:69)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(shellViewModel);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C5045f(shellViewModel, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            NavHostKt.NavHost(navController, "home", modifierFillMaxSize$default, null, null, null, null, null, null, null, (InterfaceC6471c) objRememberedValue, composerStartRestartGroup, (i9 & 14) | 48, 0, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2756g(i, 18, navController, shellViewModel, modifier2));
        }
    }

    /* renamed from: b */
    public static final ExitTransition m6226b() {
        return EnterExitTransitionKt.slideOutHorizontally(f11007b, new C4564j(1));
    }

    /* renamed from: c */
    public static final EnterTransition m6227c() {
        return EnterExitTransitionKt.slideInHorizontally(f11009d, new C6237l(17));
    }

    /* renamed from: d */
    public static final ExitTransition m6228d() {
        return EnterExitTransitionKt.slideOutHorizontally(f11008c, new C6237l(17));
    }
}
