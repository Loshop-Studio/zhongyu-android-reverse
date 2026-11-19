package androidx.compose.p014ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.p014ui.hapticfeedback.HapticFeedback;
import androidx.compose.p014ui.platform.AndroidComposeView;
import androidx.compose.p014ui.res.ImageVectorCache;
import androidx.compose.p014ui.res.ResourceIdCache;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.KotlinNothingValueException;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class AndroidCompositionLocals_androidKt {
    private static final ProvidableCompositionLocal<Configuration> LocalConfiguration = CompositionLocalKt.compositionLocalOf$default(null, new InterfaceC9529a() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalConfiguration$1
        @Override // p181hd.InterfaceC9529a
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalConfiguration");
            throw new KotlinNothingValueException();
        }
    }, 1, null);
    private static final ProvidableCompositionLocal<Context> LocalContext = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC9529a() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalContext$1
        @Override // p181hd.InterfaceC9529a
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalContext");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal<ImageVectorCache> LocalImageVectorCache = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC9529a() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalImageVectorCache$1
        @Override // p181hd.InterfaceC9529a
        public final ImageVectorCache invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalImageVectorCache");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal<ResourceIdCache> LocalResourceIdCache = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC9529a() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalResourceIdCache$1
        @Override // p181hd.InterfaceC9529a
        public final ResourceIdCache invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalResourceIdCache");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal<SavedStateRegistryOwner> LocalSavedStateRegistryOwner = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC9529a() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalSavedStateRegistryOwner$1
        @Override // p181hd.InterfaceC9529a
        public final SavedStateRegistryOwner invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalSavedStateRegistryOwner");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal<View> LocalView = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC9529a() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalView$1
        @Override // p181hd.InterfaceC9529a
        public final View invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalView");
            throw new KotlinNothingValueException();
        }
    });

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ProvideAndroidCompositionLocals(final AndroidComposeView androidComposeView, final InterfaceC9544p interfaceC9544p, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1396852028);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(androidComposeView) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1396852028, i11, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:76)");
            }
            Context context = androidComposeView.getContext();
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Configuration(context.getResources().getConfiguration()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new InterfaceC9540l() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Configuration) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(Configuration configuration) {
                        mutableState.setValue(new Configuration(configuration));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            androidComposeView.setConfigurationChangeObserver((InterfaceC9540l) objRememberedValue2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new AndroidUriHandler(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final AndroidUriHandler androidUriHandler = (AndroidUriHandler) objRememberedValue3;
            AndroidComposeView.ViewTreeOwners viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry(androidComposeView, viewTreeOwners.getSavedStateRegistryOwner());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final DisposableSaveableStateRegistry disposableSaveableStateRegistry = (DisposableSaveableStateRegistry) objRememberedValue4;
            C10786q c10786q = C10786q.f26013a;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(disposableSaveableStateRegistry);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new InterfaceC9540l() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        final DisposableSaveableStateRegistry disposableSaveableStateRegistry2 = disposableSaveableStateRegistry;
                        return new DisposableEffectResult() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                disposableSaveableStateRegistry2.dispose();
                            }
                        };
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.DisposableEffect(c10786q, (InterfaceC9540l) objRememberedValue5, composerStartRestartGroup, 6);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = HapticDefaults.INSTANCE.isPremiumVibratorEnabled(context) ? new DefaultHapticFeedback(androidComposeView.getView()) : new NoHapticFeedback();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalConfiguration.provides(ProvideAndroidCompositionLocals$lambda$1(mutableState)), LocalContext.provides(context), LocalLifecycleOwnerKt.getLocalLifecycleOwner().provides(viewTreeOwners.getLifecycleOwner()), LocalSavedStateRegistryOwner.provides(viewTreeOwners.getSavedStateRegistryOwner()), SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(disposableSaveableStateRegistry), LocalView.provides(androidComposeView.getView()), LocalImageVectorCache.provides(obtainImageVectorCache(context, ProvideAndroidCompositionLocals$lambda$1(mutableState), composerStartRestartGroup, 0)), LocalResourceIdCache.provides(obtainResourceIdCache(context, composerStartRestartGroup, 0)), CompositionLocalsKt.getLocalProvidableScrollCaptureInProgress().provides(Boolean.valueOf(((Boolean) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release())), CompositionLocalsKt.getLocalHapticFeedback().provides((HapticFeedback) objRememberedValue6)}, ComposableLambdaKt.rememberComposableLambda(1471621628, true, new InterfaceC9544p() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                @Composable
                public final void invoke(Composer composer2, int i12) {
                    if (!composer2.shouldExecute((i12 & 3) != 2, i12 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1471621628, i12, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:121)");
                    }
                    CompositionLocalsKt.ProvideCommonCompositionLocals(androidComposeView, androidUriHandler, interfaceC9544p, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i12) {
                    AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(androidComposeView, interfaceC9544p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    private static final Configuration ProvideAndroidCompositionLocals$lambda$1(MutableState<Configuration> mutableState) {
        return mutableState.getValue();
    }

    public static final ProvidableCompositionLocal<Configuration> getLocalConfiguration() {
        return LocalConfiguration;
    }

    public static final ProvidableCompositionLocal<Context> getLocalContext() {
        return LocalContext;
    }

    public static final ProvidableCompositionLocal<ImageVectorCache> getLocalImageVectorCache() {
        return LocalImageVectorCache;
    }

    public static final ProvidableCompositionLocal<LifecycleOwner> getLocalLifecycleOwner() {
        return LocalLifecycleOwnerKt.getLocalLifecycleOwner();
    }

    @InterfaceC10770a
    public static /* synthetic */ void getLocalLifecycleOwner$annotations() {
    }

    public static final ProvidableCompositionLocal<ResourceIdCache> getLocalResourceIdCache() {
        return LocalResourceIdCache;
    }

    public static final ProvidableCompositionLocal<SavedStateRegistryOwner> getLocalSavedStateRegistryOwner() {
        return LocalSavedStateRegistryOwner;
    }

    public static final ProvidableCompositionLocal<View> getLocalView() {
        return LocalView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @Stable
    @Composable
    private static final ImageVectorCache obtainImageVectorCache(final Context context, Configuration configuration, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-485908294, i10, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:157)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new ImageVectorCache();
            composer.updateRememberedValue(objRememberedValue);
        }
        final ImageVectorCache imageVectorCache = (ImageVectorCache) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        Object obj = objRememberedValue2;
        if (objRememberedValue2 == companion.getEmpty()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            composer.updateRememberedValue(configuration2);
            obj = configuration2;
        }
        final Configuration configuration3 = (Configuration) obj;
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new ComponentCallbacks2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration4) {
                    imageVectorCache.prune(configuration3.updateFrom(configuration4));
                    configuration3.setTo(configuration4);
                }

                @Override // android.content.ComponentCallbacks
                @InterfaceC10770a
                public void onLowMemory() {
                    imageVectorCache.clear();
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int i11) {
                    imageVectorCache.clear();
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        final ComponentCallbacks2C2978x477bcb35 componentCallbacks2C2978x477bcb35 = (ComponentCallbacks2C2978x477bcb35) objRememberedValue3;
        boolean zChangedInstance = composer.changedInstance(context);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new InterfaceC9540l() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    context.getApplicationContext().registerComponentCallbacks(componentCallbacks2C2978x477bcb35);
                    final Context context2 = context;
                    final ComponentCallbacks2C2978x477bcb35 componentCallbacks2C2978x477bcb352 = componentCallbacks2C2978x477bcb35;
                    return new DisposableEffectResult() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            context2.getApplicationContext().unregisterComponentCallbacks(componentCallbacks2C2978x477bcb352);
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        EffectsKt.DisposableEffect(imageVectorCache, (InterfaceC9540l) objRememberedValue4, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imageVectorCache;
    }

    @Stable
    @Composable
    private static final ResourceIdCache obtainResourceIdCache(final Context context, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1348507246, i10, -1, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:127)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new ResourceIdCache();
            composer.updateRememberedValue(objRememberedValue);
        }
        final ResourceIdCache resourceIdCache = (ResourceIdCache) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new ComponentCallbacks2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                    resourceIdCache.clear();
                }

                @Override // android.content.ComponentCallbacks
                @InterfaceC10770a
                public void onLowMemory() {
                    resourceIdCache.clear();
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int i11) {
                    resourceIdCache.clear();
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        final ComponentCallbacks2C2979xb1117f50 componentCallbacks2C2979xb1117f50 = (ComponentCallbacks2C2979xb1117f50) objRememberedValue2;
        boolean zChangedInstance = composer.changedInstance(context);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new InterfaceC9540l() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    context.getApplicationContext().registerComponentCallbacks(componentCallbacks2C2979xb1117f50);
                    final Context context2 = context;
                    final ComponentCallbacks2C2979xb1117f50 componentCallbacks2C2979xb1117f502 = componentCallbacks2C2979xb1117f50;
                    return new DisposableEffectResult() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            context2.getApplicationContext().unregisterComponentCallbacks(componentCallbacks2C2979xb1117f502);
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        EffectsKt.DisposableEffect(resourceIdCache, (InterfaceC9540l) objRememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return resourceIdCache;
    }
}
