package p205y4;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.zykj.mistake.feature.collection.filter.C4684w0;

/* renamed from: y4.g */
/* loaded from: classes3.dex */
public abstract class AbstractC6775g {
    /* renamed from: a */
    public static final void m6461a(Modifier modifier, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(893251859);
        int i8 = i | 6;
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(893251859, i8, -1, "com.zykj.mistake.platform.compose.TopBarDivider (TopBarDivider.kt:12)");
            }
            BoxKt.Box(BackgroundKt.m6754backgroundbw27NRU$default(SizeKt.m7295height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), C2331Dp.m13305constructorimpl((float) 0.5d)), ColorKt.Color(4293651952L), null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4684w0(modifier, i, 3));
        }
    }
}
