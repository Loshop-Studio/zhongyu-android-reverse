package com.zykj.evaluation.p057ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.zykj.evaluation.p057ui.MainFragmentKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public abstract class MainFragmentKt {
    /* renamed from: b */
    public static final void m9078b(final String fileName, final Function2 content, Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1698016723);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(fileName) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1698016723, i11, -1, "com.zykj.evaluation.ui.LogPage (MainFragment.kt:776)");
            }
            int i12 = i11 & 14;
            boolean z9 = i12 == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MainFragmentKt$LogPage$1$1(fileName, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(fileName, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i12);
            content.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: s5.o3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MainFragmentKt.m9079c(fileName, content, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: c */
    public static final Unit m9079c(String str, Function2 function2, int i10, Composer composer, int i11) {
        m9078b(str, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }
}
