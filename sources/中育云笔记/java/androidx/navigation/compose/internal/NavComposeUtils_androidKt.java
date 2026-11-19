package androidx.navigation.compose.internal;

import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.navigation.compose.internal.NavComposeUtils_androidKt;
import com.alibaba.fastjson.asm.Opcodes;
import java.util.UUID;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class NavComposeUtils_androidKt {
    @Composable
    public static final void PredictiveBackHandler(final boolean z10, final InterfaceC9544p interfaceC9544p, Composer composer, final int i10, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1818896922);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                z10 = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1818896922, i12, -1, "androidx.navigation.compose.internal.PredictiveBackHandler (NavComposeUtils.android.kt:30)");
            }
            PredictiveBackHandlerKt.PredictiveBackHandler(z10, interfaceC9544p, composerStartRestartGroup, i12 & Opcodes.IAND, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: i.a
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return NavComposeUtils_androidKt.PredictiveBackHandler$lambda$0(z10, interfaceC9544p, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q PredictiveBackHandler$lambda$0(boolean z10, InterfaceC9544p interfaceC9544p, int i10, int i11, Composer composer, int i12) {
        PredictiveBackHandler(z10, interfaceC9544p, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C10786q.f26013a;
    }

    public static final String randomUUID() {
        return UUID.randomUUID().toString();
    }
}
