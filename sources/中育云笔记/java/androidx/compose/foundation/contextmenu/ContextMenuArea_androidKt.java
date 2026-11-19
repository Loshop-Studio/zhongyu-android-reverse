package androidx.compose.foundation.contextmenu;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.unit.IntOffsetKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class ContextMenuArea_androidKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @VisibleForTesting
    public static final void ContextMenu(final ContextMenuState contextMenuState, final InterfaceC9529a interfaceC9529a, Modifier modifier, final InterfaceC9540l interfaceC9540l, Composer composer, final int i10, final int i11) {
        int i12;
        Composer composer2;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(645832757);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(contextMenuState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9529a) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9540l) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.Companion;
            }
            modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(645832757, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenu (ContextMenuArea.android.kt:73)");
            }
            ContextMenuState.Status status = contextMenuState.getStatus();
            if (!(status instanceof ContextMenuState.Status.Open)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt.ContextMenu.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p181hd.InterfaceC9544p
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return C10786q.f26013a;
                        }

                        public final void invoke(Composer composer3, int i14) {
                            ContextMenuArea_androidKt.ContextMenu(contextMenuState, interfaceC9529a, modifier2, interfaceC9540l, composer3, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                        }
                    });
                    return;
                }
                return;
            }
            boolean zChanged = composerStartRestartGroup.changed(status);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new ContextMenuPopupPositionProvider(IntOffsetKt.m33646roundk4lQ0M(((ContextMenuState.Status.Open) status).m27081getOffsetF1C5BW0()), null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            ContextMenuUi_androidKt.ContextMenuPopup((ContextMenuPopupPositionProvider) objRememberedValue, interfaceC9529a, modifier2, interfaceC9540l, composer2, i12 & 8176, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt.ContextMenu.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer3, int i14) {
                    ContextMenuArea_androidKt.ContextMenu(contextMenuState, interfaceC9529a, modifier2, interfaceC9540l, composer3, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00de  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ContextMenuArea(final androidx.compose.foundation.contextmenu.ContextMenuState r18, final p181hd.InterfaceC9529a r19, final p181hd.InterfaceC9540l r20, androidx.compose.p014ui.Modifier r21, boolean r22, p181hd.InterfaceC9529a r23, final p181hd.InterfaceC9544p r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt.ContextMenuArea(androidx.compose.foundation.contextmenu.ContextMenuState, hd.a, hd.l, androidx.compose.ui.Modifier, boolean, hd.a, hd.p, androidx.compose.runtime.Composer, int, int):void");
    }
}
