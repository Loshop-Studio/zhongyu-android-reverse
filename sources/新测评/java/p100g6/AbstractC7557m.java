package p100g6;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.painter.Painter;
import androidx.compose.p013ui.layout.ContentScale;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.res.PainterResources_androidKt;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.zykj.evaluation.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p089f6.AbstractC7451f;
import p189o5.AbstractC8709e;
import p276w5.AbstractC9755a;
import p276w5.C9758b;

/* renamed from: g6.m */
/* loaded from: classes4.dex */
public abstract class AbstractC7557m {
    /* renamed from: g */
    public static final void m12365g(Modifier modifier, final String option, final long j10, final long j11, final boolean z9, final Function0 onClickItem, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(onClickItem, "onClickItem");
        Composer composerStartRestartGroup = composer.startRestartGroup(649307082);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 6) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(option) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(j10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changed(j11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changed(z9) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickItem) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i12) != 74898, i12 & 1)) {
            Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(649307082, i12, -1, "com.zykj.evaluation.ui.detail.widget.question.ChoiceQuestionItem (ChoiceQuestionView.kt:62)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl = C3127Dp.m23561constructorimpl((41 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierAlign = boxScopeInstance.align(SizeKt.m17730sizeVpY3zN4(companion3, fM23561constructorimpl, C3127Dp.m23561constructorimpl((19 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), companion.getBottomStart());
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            Modifier modifier5 = modifier4;
            ButtonColors buttonColorsM18545buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m18545buttonColorsro_MJ88(j10, 0L, 0L, 0L, composerStartRestartGroup, ((i12 >> 6) & 14) | (ButtonDefaults.$stable << 12), 14);
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            ButtonKt.Button(onClickItem, modifierAlign, false, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((2 / f10) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), buttonColorsM18545buttonColorsro_MJ88, null, null, PaddingKt.m17674PaddingValues0680j_4(C3127Dp.m23561constructorimpl((0 / f10) * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), null, ComposableLambdaKt.rememberComposableLambda(-1285798252, true, new Function3() { // from class: g6.k
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbstractC7557m.m12366h(option, j11, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i12 >> 15) & 14) | 817889280, 356);
            composerStartRestartGroup = composerStartRestartGroup;
            if (z9) {
                composerStartRestartGroup.startReplaceGroup(-178291534);
                Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.icon_option_selected, composerStartRestartGroup, 6);
                DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
                ImageKt.Image(painterPainterResource, (String) null, boxScopeInstance.align(SizeKt.m17728size3ABfNKs(companion3, C3127Dp.m23561constructorimpl((9 / f10) * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), companion.getTopEnd()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
            } else {
                composerStartRestartGroup.startReplaceGroup(-181145890);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: g6.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7557m.m12367i(modifier3, option, j10, j11, z9, onClickItem, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: h */
    public static final Unit m12366h(String str, long j10, RowScope Button, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1285798252, i10, -1, "com.zykj.evaluation.ui.detail.widget.question.ChoiceQuestionItem.<anonymous>.<anonymous> (ChoiceQuestionView.kt:73)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composer);
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            TextKt.m19430Text4IGK_g(str, BoxScopeInstance.INSTANCE.align(companion, companion2.getCenter()), j10, AbstractC8709e.m14344k(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 131056);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: i */
    public static final Unit m12367i(Modifier modifier, String str, long j10, long j11, boolean z9, Function0 function0, int i10, int i11, Composer composer, int i12) {
        m12365g(modifier, str, j10, j11, z9, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final void m12368j(String number, final List options, final Function2 onClickItem, Composer composer, final int i10) {
        int i11;
        final String str;
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(onClickItem, "onClickItem");
        Composer composerStartRestartGroup = composer.startRestartGroup(1065128167);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(number) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(options) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onClickItem) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 147) != 146, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1065128167, i11, -1, "com.zykj.evaluation.ui.detail.widget.question.ChoiceQuestionView (ChoiceQuestionView.kt:26)");
            }
            str = number;
            AbstractC7451f.m12035j(null, str, ComposableLambdaKt.rememberComposableLambda(1485044626, true, new Function3() { // from class: g6.g
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbstractC7557m.m12369k(options, onClickItem, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i11 << 3) & 112) | 384, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            str = number;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: g6.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7557m.m12372n(str, options, onClickItem, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: k */
    public static final Unit m12369k(final List list, final Function2 function2, RowScope NumberWithContent, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(NumberWithContent, "$this$NumberWithContent");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1485044626, i10, -1, "com.zykj.evaluation.ui.detail.widget.question.ChoiceQuestionView.<anonymous> (ChoiceQuestionView.kt:30)");
            }
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            final float fM23561constructorimpl = C3127Dp.m23561constructorimpl((43 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl((3 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            float f11 = 6;
            Modifier modifierM17735widthInVpY3zN4$default = SizeKt.m17735widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, C3127Dp.m23561constructorimpl(C3127Dp.m23561constructorimpl(fM23561constructorimpl * f11) + C3127Dp.m23561constructorimpl(f11 * fM23561constructorimpl2)), 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM17562spacedBy0680j_4 = arrangement.m17562spacedBy0680j_4(fM23561constructorimpl2);
            float f12 = 1 / f10;
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            FlowLayoutKt.FlowRow(modifierM17735widthInVpY3zN4$default, horizontalOrVerticalM17562spacedBy0680j_4, arrangement.m17562spacedBy0680j_4(C3127Dp.m23561constructorimpl(f12 * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(296743501, true, new Function3() { // from class: g6.i
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbstractC7557m.m12370l(list, fM23561constructorimpl, function2, (FlowRowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 1573302, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final Unit m12370l(List list, float f10, final Function2 function2, FlowRowScope FlowRow, Composer composer, int i10) {
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if (composer2.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(296743501, i10, -1, "com.zykj.evaluation.ui.detail.widget.question.ChoiceQuestionView.<anonymous>.<anonymous> (ChoiceQuestionView.kt:37)");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final C9758b c9758b = (C9758b) it.next();
                final boolean z9 = c9758b.m16355c() instanceof AbstractC9755a.a;
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17730sizeVpY3zN4 = SizeKt.m17730sizeVpY3zN4(Modifier.INSTANCE, f10, C3127Dp.m23561constructorimpl((24 / 600) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
                String strM16356d = c9758b.m16356d();
                long jM16351a = c9758b.m16355c().m16351a();
                long jM16352b = c9758b.m16355c().m16352b();
                boolean zM16357e = c9758b.m16357e();
                boolean zChanged = composer2.changed(function2) | composer2.changed(c9758b) | composer2.changed(z9);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: g6.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC7557m.m12371m(function2, c9758b, z9);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                m12365g(modifierM17730sizeVpY3zN4, strM16356d, jM16351a, jM16352b, zM16357e, (Function0) objRememberedValue, composer2, 6, 0);
                composer2 = composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final Unit m12371m(Function2 function2, C9758b c9758b, boolean z9) {
        function2.invoke(c9758b.m16356d(), Boolean.valueOf(z9));
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final Unit m12372n(String str, List list, Function2 function2, int i10, Composer composer, int i11) {
        m12368j(str, list, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }
}
