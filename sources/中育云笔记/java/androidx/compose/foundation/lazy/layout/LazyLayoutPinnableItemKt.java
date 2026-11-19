package androidx.compose.foundation.lazy.layout;

import androidx.compose.p014ui.layout.PinnableContainer;
import androidx.compose.p014ui.layout.PinnableContainerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class LazyLayoutPinnableItemKt {
    @Composable
    public static final void LazyLayoutPinnableItem(final Object obj, final int i10, final LazyLayoutPinnedItemList lazyLayoutPinnedItemList, final InterfaceC9544p interfaceC9544p, Composer composer, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2079116560);
        if ((i11 & 6) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(lazyLayoutPinnedItemList) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2079116560, i12, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:50)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj) | composerStartRestartGroup.changed(lazyLayoutPinnedItemList);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new LazyLayoutPinnableItem(obj, lazyLayoutPinnedItemList);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final LazyLayoutPinnableItem lazyLayoutPinnableItem = (LazyLayoutPinnableItem) objRememberedValue;
            lazyLayoutPinnableItem.setIndex(i10);
            lazyLayoutPinnableItem.setParentPinnableContainer((PinnableContainer) composerStartRestartGroup.consume(PinnableContainerKt.getLocalPinnableContainer()));
            boolean zChanged2 = composerStartRestartGroup.changed(lazyLayoutPinnableItem);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        final LazyLayoutPinnableItem lazyLayoutPinnableItem2 = lazyLayoutPinnableItem;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lazyLayoutPinnableItem2.onDisposed();
                            }
                        };
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.DisposableEffect(lazyLayoutPinnableItem, (InterfaceC9540l) objRememberedValue2, composerStartRestartGroup, 0);
            CompositionLocalKt.CompositionLocalProvider(PinnableContainerKt.getLocalPinnableContainer().provides(lazyLayoutPinnableItem), interfaceC9544p, composerStartRestartGroup, ((i12 >> 6) & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt.LazyLayoutPinnableItem.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i13) {
                    LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(obj, i10, lazyLayoutPinnedItemList, interfaceC9544p, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }
}
