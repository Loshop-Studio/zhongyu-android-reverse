package p244s6;

import android.content.res.Resources;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p012ui.Alignment;
import androidx.compose.p012ui.ComposedModifierKt;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.graphics.ColorKt;
import androidx.compose.p012ui.layout.MeasurePolicy;
import androidx.compose.p012ui.node.ComposeUiNode;
import androidx.compose.p012ui.res.PainterResources_androidKt;
import androidx.compose.p012ui.text.TextLayoutResult;
import androidx.compose.p012ui.text.TextStyle;
import androidx.compose.p012ui.text.font.FontFamily;
import androidx.compose.p012ui.text.font.FontStyle;
import androidx.compose.p012ui.text.font.FontWeight;
import androidx.compose.p012ui.text.style.TextAlign;
import androidx.compose.p012ui.text.style.TextDecoration;
import androidx.compose.p012ui.unit.C3115Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.taobao.sophix.PatchStatus;
import com.zykj.student.dialogue.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p138i6.AbstractC8136b;
import p274v6.AbstractC9768a;

/* renamed from: s6.j0 */
/* loaded from: classes5.dex */
public abstract class AbstractC9522j0 {
    /* renamed from: e */
    public static final void m15709e(final boolean z9, Composer composer, final int i9) {
        int i10;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1867636433);
        if ((i9 & 6) == 0) {
            i10 = (composerStartRestartGroup.changed(z9) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1867636433, i10, -1, "com.zykj.student.dialogue.ui.home.FilterArrowDown (FilterCommonButton.kt:69)");
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: s6.i0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC9522j0.m15710f(z9, i9, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: f */
    public static final Unit m15710f(boolean z9, int i9, Composer composer, int i10) {
        m15709e(z9, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m15711g(final java.lang.String r17, final kotlin.jvm.functions.Function0 r18, androidx.compose.p012ui.Modifier r19, boolean r20, java.lang.Integer r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p244s6.AbstractC9522j0.m15711g(java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, java.lang.Integer, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: h */
    public static final Unit m15712h(boolean z9, String str, final Integer num, RowScope TextButton, Composer composer, int i9) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        if (composer.shouldExecute((i9 & 17) != 16, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-690438195, i9, -1, "com.zykj.student.dialogue.ui.home.FilterCommonButton.<anonymous> (FilterCommonButton.kt:37)");
            }
            TextKt.m19863Text4IGK_g(str, (Modifier) null, z9 ? AbstractC9768a.m16549k() : AbstractC9768a.m16540b(), AbstractC8136b.m13036d(8), (FontStyle) null, FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199680, 0, 131026);
            if (num == null || num.intValue() <= 0) {
                composer.startReplaceGroup(-245018730);
                SpacerKt.Spacer(SizeKt.m18166width3ABfNKs(Modifier.INSTANCE, C3115Dp.m23994constructorimpl((2 / 600) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composer, 6);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-245633026);
                SpacerKt.Spacer(SizeKt.m18166width3ABfNKs(Modifier.INSTANCE, C3115Dp.m23994constructorimpl((1 / 600) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composer, 6);
                SurfaceKt.m19713SurfaceT9BRK9s(null, RoundedCornerShapeKt.RoundedCornerShape(50), ColorKt.Color(1293252351), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(206919555, true, new Function2() { // from class: s6.h0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC9522j0.m15713i(num, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, 12583296, PatchStatus.CODE_LOAD_RES_INJECT_PATH);
                composer.endReplaceGroup();
            }
            m15709e(z9, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: i */
    public static final Unit m15713i(Integer num, Composer composer, int i9) {
        if (composer.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(206919555, i9, -1, "com.zykj.student.dialogue.ui.home.FilterCommonButton.<anonymous>.<anonymous> (FilterCommonButton.kt:49)");
            }
            Alignment center = Alignment.INSTANCE.getCenter();
            Modifier modifierM18161size3ABfNKs = SizeKt.m18161size3ABfNKs(Modifier.INSTANCE, C3115Dp.m23994constructorimpl((8 / 600) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM18161size3ABfNKs);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM20851constructorimpl = Updater.m20851constructorimpl(composer);
            Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m19863Text4IGK_g(num.toString(), (Modifier) null, ColorKt.Color(4279596799L), AbstractC8136b.m13036d(5), (FontStyle) null, FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200064, 0, 131026);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final Unit m15714j(String str, Function0 function0, Modifier modifier, boolean z9, Integer num, int i9, int i10, Composer composer, int i11) {
        m15711g(str, function0, modifier, z9, num, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1), i10);
        return Unit.INSTANCE;
    }
}
