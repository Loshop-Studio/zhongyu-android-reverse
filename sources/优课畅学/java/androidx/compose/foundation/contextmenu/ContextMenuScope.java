package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ContextMenuScope {
    public static final int $stable = 0;
    private final SnapshotStateList<InterfaceC10575q> composables = SnapshotStateKt.mutableStateListOf();

    public static /* synthetic */ void item$default(ContextMenuScope contextMenuScope, InterfaceC10574p interfaceC10574p, Modifier modifier, boolean z10, InterfaceC10575q interfaceC10575q, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        Modifier modifier2 = modifier;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            interfaceC10575q = null;
        }
        contextMenuScope.item(interfaceC10574p, modifier2, z11, interfaceC10575q, interfaceC10559a);
    }

    @Composable
    public final void Content$foundation_release(final ContextMenuColors contextMenuColors, Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1320309496);
        int i11 = (i10 & 6) == 0 ? (composerStartRestartGroup.changed(contextMenuColors) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1320309496, i11, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.android.kt:240)");
            }
            SnapshotStateList<InterfaceC10575q> snapshotStateList = this.composables;
            int size = snapshotStateList.size();
            for (int i12 = 0; i12 < size; i12++) {
                snapshotStateList.get(i12).invoke(contextMenuColors, composerStartRestartGroup, Integer.valueOf(i11 & 14));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: androidx.compose.foundation.contextmenu.ContextMenuScope$Content$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C8736p.f16368a;
                }

                public final void invoke(Composer composer2, int i13) {
                    this.$tmp0_rcvr.Content$foundation_release(contextMenuColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    public final void clear$foundation_release() {
        this.composables.clear();
    }

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void item(final InterfaceC10574p interfaceC10574p, final Modifier modifier, final boolean z10, final InterfaceC10575q interfaceC10575q, final InterfaceC10559a interfaceC10559a) {
        this.composables.add(ComposableLambdaKt.composableLambdaInstance(262103052, true, new InterfaceC10575q() { // from class: androidx.compose.foundation.contextmenu.ContextMenuScope.item.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p300x7.InterfaceC10575q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((ContextMenuColors) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C8736p.f16368a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(ContextMenuColors contextMenuColors, Composer composer, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= composer.changed(contextMenuColors) ? 4 : 2;
                }
                if (!composer.shouldExecute((i10 & 19) != 18, i10 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(262103052, i10, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.item.<anonymous> (ContextMenuUi.android.kt:282)");
                }
                String str = (String) interfaceC10574p.invoke(composer, 0);
                if (AbstractC8661c0.m13993h0(str)) {
                    InlineClassHelperKt.throwIllegalStateException("Label must not be blank");
                }
                ContextMenuUi_androidKt.ContextMenuItem(str, z10, contextMenuColors, modifier, interfaceC10575q, interfaceC10559a, composer, (i10 << 6) & 896, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }
}
