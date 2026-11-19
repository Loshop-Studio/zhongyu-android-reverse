package com.zykj.mistake.feature.collection.filter;

import android.view.compose.C2756g;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.navigation.compose.C2840b;
import com.zykj.mistake.main.MainShellViewModel;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6473e;
import p167t4.AbstractC6591d;
import p167t4.C6592e;
import p191w4.AbstractC6719d;
import p191w4.InterfaceC6718c;
import p212z4.C6816c;

/* renamed from: com.zykj.mistake.feature.collection.filter.a */
/* loaded from: classes3.dex */
public abstract class AbstractC4639a {
    /* renamed from: a */
    public static final void m4072a(MistakeCollectionFilterResultViewModel mistakeCollectionFilterResultViewModel, C6816c environment, MainShellViewModel shellViewModel, Composer composer, int i) {
        int i8;
        MistakeCollectionFilterResultViewModel mistakeCollectionFilterResultViewModel2;
        C6816c c6816c;
        MainShellViewModel mainShellViewModel;
        AbstractC5830k.m5330g(environment, "environment");
        AbstractC5830k.m5330g(shellViewModel, "shellViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(594636603);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(mistakeCollectionFilterResultViewModel) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(environment) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(shellViewModel) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(594636603, i8, -1, "com.zykj.mistake.feature.collection.filter.CollectionFilterResultEffectHandler (CollectionFilterResultEffectHandler.kt:17)");
            }
            InterfaceC6718c interfaceC6718c = (InterfaceC6718c) composerStartRestartGroup.consume(AbstractC6719d.f11339a);
            C6592e c6592e = (C6592e) composerStartRestartGroup.consume(AbstractC6591d.f11002a);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(mistakeCollectionFilterResultViewModel) | composerStartRestartGroup.changedInstance(c6592e) | composerStartRestartGroup.changedInstance(interfaceC6718c) | composerStartRestartGroup.changedInstance(shellViewModel) | composerStartRestartGroup.changedInstance(environment);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                mistakeCollectionFilterResultViewModel2 = mistakeCollectionFilterResultViewModel;
                c6816c = environment;
                mainShellViewModel = shellViewModel;
                objRememberedValue = new C4633xe94a128b(mistakeCollectionFilterResultViewModel2, c6592e, interfaceC6718c, mainShellViewModel, c6816c, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                mistakeCollectionFilterResultViewModel2 = mistakeCollectionFilterResultViewModel;
                c6816c = environment;
                mainShellViewModel = shellViewModel;
            }
            EffectsKt.LaunchedEffect(mistakeCollectionFilterResultViewModel2, (InterfaceC6473e) objRememberedValue, composerStartRestartGroup, i8 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            mistakeCollectionFilterResultViewModel2 = mistakeCollectionFilterResultViewModel;
            c6816c = environment;
            mainShellViewModel = shellViewModel;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2756g(i, 6, mistakeCollectionFilterResultViewModel2, c6816c, mainShellViewModel));
        }
    }

    /* renamed from: b */
    public static final void m4073b(MainShellViewModel shellViewModel, MistakeCollectionFilterResultViewModel mistakeCollectionFilterResultViewModel, Composer composer, int i) {
        int i8;
        AbstractC5830k.m5330g(shellViewModel, "shellViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(504069413);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(shellViewModel) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(mistakeCollectionFilterResultViewModel) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(504069413, i8, -1, "com.zykj.mistake.feature.collection.filter.CollectionFilterResultShellEffectHandler (CollectionFilterResultShellEffectHandler.kt:12)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(shellViewModel) | composerStartRestartGroup.changedInstance(mistakeCollectionFilterResultViewModel);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C4634xba46fb95(shellViewModel, mistakeCollectionFilterResultViewModel, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(shellViewModel, mistakeCollectionFilterResultViewModel, (InterfaceC6473e) objRememberedValue, composerStartRestartGroup, i8 & 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2840b(i, 4, shellViewModel, mistakeCollectionFilterResultViewModel));
        }
    }
}
