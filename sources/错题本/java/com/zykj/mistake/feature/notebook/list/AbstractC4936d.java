package com.zykj.mistake.feature.notebook.list;

import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.SemanticsModifierKt;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.navigation.compose.C2839a;
import androidx.navigation.internal.C2865d;
import com.zykj.mistake.feature.collection.component.C4564j;
import com.zykj.mistake.feature.collection.detail.C4580b1;
import kotlin.collections.AbstractC5805t;
import kotlin.text.AbstractC5855p;
import p137p4.C6383b;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.mistake.feature.notebook.list.d */
/* loaded from: classes3.dex */
public abstract class AbstractC4936d {

    /* renamed from: a */
    public static final float f7492a = C2331Dp.m13305constructorimpl(96);

    /* renamed from: a */
    public static final void m4300a(C6383b c6383b, boolean z8, Modifier modifier, Composer composer, int i) {
        int i8;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(16193383);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c6383b) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(z8) ? 32 : 16;
        }
        int i9 = i8 | 384;
        if (composerStartRestartGroup.shouldExecute((i9 & 147) != 146, i9 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(16193383, i9, -1, "com.zykj.mistake.feature.notebook.list.MistakeCardMetadata (MistakeCardMetadata.kt:98)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            boolean zChanged = composerStartRestartGroup.changed(density.getDensity()) | composerStartRestartGroup.changed(density.getFontScale());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                C4939e c4939e = new C4939e(density.mo6902toPxR2X_6o(TextUnitKt.getSp(12)), density.mo6902toPxR2X_6o(TextUnitKt.getSp(11)), density.mo6902toPxR2X_6o(TextUnitKt.getSp(10)));
                composerStartRestartGroup.updateRememberedValue(c4939e);
                objRememberedValue = c4939e;
            }
            C4939e c4939e2 = (C4939e) objRememberedValue;
            int i10 = i9 & 112;
            boolean zChanged2 = composerStartRestartGroup.changed(c6383b) | (i10 == 32);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(c6383b.f10451f);
                sb.append(' ');
                sb.append(c6383b.f10452g);
                sb.append(' ');
                String strM5234n0 = AbstractC5805t.m5234n0(c6383b.f10461p, " ", null, null, new C4564j(25), 30);
                if (AbstractC5855p.m5382P(strM5234n0)) {
                    strM5234n0 = "暂无标签";
                }
                sb.append(strM5234n0);
                sb.append(" 正确 ");
                sb.append(c6383b.f10462q);
                sb.append(" 错误 ");
                sb.append(c6383b.f10463r);
                if (!z8) {
                    sb.append(' ');
                    sb.append(c6383b.f10464s);
                }
                objRememberedValue2 = sb.toString();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            String str = (String) objRememberedValue2;
            Modifier modifierM7295height3ABfNKs = SizeKt.m7295height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), f7492a);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(c4939e2) | composerStartRestartGroup.changedInstance(c6383b) | (i10 == 32);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new C2839a(c4939e2, c6383b, z8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierDrawWithCache = DrawModifierKt.drawWithCache(modifierM7295height3ABfNKs, (InterfaceC6471c) objRememberedValue3);
            boolean zChanged3 = composerStartRestartGroup.changed(str);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new C2865d(str, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            SpacerKt.Spacer(SemanticsModifierKt.clearAndSetSemantics(modifierDrawWithCache, (InterfaceC6471c) objRememberedValue4), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4580b1(c6383b, z8, modifier2, i));
        }
    }

    /* renamed from: b */
    public static final float m4301b(Paint paint, float f) {
        return f - ((paint.descent() + paint.ascent()) / 2.0f);
    }

    /* renamed from: c */
    public static final Paint m4302c(boolean z8, float f, long j7) {
        Paint paint = new Paint(129);
        paint.setTextSize(f);
        paint.setColor(ColorKt.m10736toArgb8_81llA(j7));
        paint.setTypeface(z8 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        return paint;
    }
}
