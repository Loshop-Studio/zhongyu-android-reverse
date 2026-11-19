package p190n6;

import android.content.res.Resources;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.graphics.ColorKt;
import androidx.compose.p012ui.res.PainterResources_androidKt;
import androidx.compose.p012ui.unit.C3115Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.zykj.student.dialogue.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p274v6.AbstractC9768a;

/* renamed from: n6.o */
/* loaded from: classes5.dex */
public abstract class AbstractC9114o {
    /* renamed from: b */
    public static final void m14652b(final boolean z9, Composer composer, final int i9) {
        int i10;
        Composer composerStartRestartGroup = composer.startRestartGroup(477015503);
        if ((i9 & 6) == 0) {
            i10 = (composerStartRestartGroup.changed(z9) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(477015503, i10, -1, "com.zykj.student.dialogue.ui.collect.FilterArrowDown (CollectTitle.kt:152)");
            }
            IconKt.m19319Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.icon_filter_arrow_down, composerStartRestartGroup, 0), (String) null, SizeKt.m18161size3ABfNKs(Modifier.INSTANCE, C3115Dp.m23994constructorimpl((11 / 600) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), z9 ? AbstractC9768a.m16549k() : ColorKt.Color(4284900966L), composerStartRestartGroup, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: n6.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC9114o.m14653c(z9, i9, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: c */
    public static final Unit m14653c(boolean z9, int i9, Composer composer, int i10) {
        m14652b(z9, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
        return Unit.INSTANCE;
    }
}
