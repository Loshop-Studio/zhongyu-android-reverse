package p224q6;

import android.content.res.Resources;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContentKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CheckboxDefaults;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.InteractiveComponentSizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p012ui.Alignment;
import androidx.compose.p012ui.ComposedModifierKt;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.draw.ClipKt;
import androidx.compose.p012ui.graphics.Color;
import androidx.compose.p012ui.graphics.ColorKt;
import androidx.compose.p012ui.layout.MeasurePolicy;
import androidx.compose.p012ui.node.ComposeUiNode;
import androidx.compose.p012ui.text.AnnotatedString;
import androidx.compose.p012ui.text.Placeholder;
import androidx.compose.p012ui.text.PlaceholderVerticalAlign;
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
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p138i6.AbstractC8136b;

/* renamed from: q6.m */
/* loaded from: classes5.dex */
public abstract class AbstractC9374m {
    /* renamed from: g */
    public static final void m15349g(final Function1 onConfirm, Composer composer, final int i9) {
        int i10;
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Composer composerStartRestartGroup = composer.startRestartGroup(631445871);
        if ((i9 & 6) == 0) {
            i10 = (composerStartRestartGroup.changedInstance(onConfirm) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(631445871, i10, -1, "com.zykj.student.dialogue.ui.dialog.UnderstandDialogContent (UnderstandDialogContent.kt:54)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            float f10 = 600;
            float f11 = 8 / f10;
            SurfaceKt.m19713SurfaceT9BRK9s(AnimationModifierKt.animateContentSize$default(SizeKt.wrapContentHeight$default(SizeKt.m18166width3ABfNKs(Modifier.INSTANCE, C3115Dp.m23994constructorimpl((ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), null, false, 3, null), null, null, 3, null), RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f11)), Color.INSTANCE.m21446getWhite0d7_KjU(), 0L, 0.0f, C3115Dp.m23994constructorimpl(f11 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), null, ComposableLambdaKt.rememberComposableLambda(379270324, true, new Function2() { // from class: q6.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC9374m.m15351i(onConfirm, mutableState, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 12779904, 88);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: q6.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC9374m.m15356n(onConfirm, i9, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static final boolean m15350h(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: i */
    public static final Unit m15351i(final Function1 function1, MutableState mutableState, Composer composer, int i9) {
        final MutableState mutableState2;
        if (composer.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(379270324, i9, -1, "com.zykj.student.dialogue.ui.dialog.UnderstandDialogContent.<anonymous> (UnderstandDialogContent.kt:67)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 600;
            Modifier modifierM18115paddingVpY3zN4 = PaddingKt.m18115paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C3115Dp.m23994constructorimpl((20 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), C3115Dp.m23994constructorimpl((15 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM18115paddingVpY3zN4);
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
            Composer composerM20851constructorimpl = Updater.m20851constructorimpl(composer);
            Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m19863Text4IGK_g("提示信息", (Modifier) null, ColorKt.Color(4281479730L), AbstractC8136b.m13036d(10), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200070, 0, 131026);
            float f11 = 10 / f10;
            SpacerKt.Spacer(SizeKt.m18147height3ABfNKs(companion, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f11)), composer, 6);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append("标记“懂了”后，该问答仍接收新消息，但不再有新消息角标 ");
            InlineTextContentKt.appendInlineContent(builder, "new_badge_icon", "[icon]");
            AnnotatedString annotatedString = builder.toAnnotatedString();
            Placeholder placeholder = new Placeholder(AbstractC8136b.m13036d(8), AbstractC8136b.m13036d(12), PlaceholderVerticalAlign.INSTANCE.m23373getCenterJ6kI3mc(), null);
            C9364c c9364c = C9364c.f16278a;
            Map mapMapOf = MapsKt.mapOf(new Pair("new_badge_icon", new InlineTextContent(placeholder, c9364c.m15341c())));
            TextKt.m19864TextIbK3jfQ(annotatedString, null, ColorKt.Color(4281479730L), AbstractC8136b.m13036d(10), null, null, null, 0L, null, TextAlign.m23871boximpl(TextAlign.INSTANCE.m23878getCentere0LSkKk()), AbstractC8136b.m13036d(14), 0, false, 0, 0, mapMapOf, null, null, composer, 3456, 6, 227826);
            SpacerKt.Spacer(SizeKt.m18147height3ABfNKs(companion, C3115Dp.m23994constructorimpl((18 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composer, 6);
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableState2 = mutableState;
                objRememberedValue = new Function0() { // from class: q6.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC9374m.m15354l(function1, mutableState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            } else {
                mutableState2 = mutableState;
            }
            ButtonKt.Button((Function0) objRememberedValue, SizeKt.m18147height3ABfNKs(SizeKt.m18166width3ABfNKs(companion, C3115Dp.m23994constructorimpl((94 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), C3115Dp.m23994constructorimpl((25 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), false, RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl((12 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), ButtonDefaults.INSTANCE.m18978buttonColorsro_MJ88(ColorKt.Color(4282882035L), Color.INSTANCE.m21446getWhite0d7_KjU(), 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 54, 12), null, null, null, null, c9364c.m15342d(), composer, 805306416, 484);
            SpacerKt.Spacer(SizeKt.m18147height3ABfNKs(companion, C3115Dp.m23994constructorimpl(f11 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composer, 6);
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
            float f12 = 4;
            Modifier modifierClip = ClipKt.clip(companion, RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl(f12)));
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: q6.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC9374m.m15355m(mutableState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierM18115paddingVpY3zN42 = PaddingKt.m18115paddingVpY3zN4(ClickableKt.m17657clickableXHw0xAI$default(modifierClip, false, null, null, (Function0) objRememberedValue2, 7, null), C3115Dp.m23994constructorimpl(8), C3115Dp.m23994constructorimpl(f12));
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM18115paddingVpY3zN42);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM20851constructorimpl2 = Updater.m20851constructorimpl(composer);
            Updater.m20858setimpl(composerM20851constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM20851constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20851constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20851constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20858setimpl(composerM20851constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize().provides(C3115Dp.m23992boximpl(C3115Dp.INSTANCE.m24014getUnspecifiedD9Ej5fM())), ComposableLambdaKt.rememberComposableLambda(1038504654, true, new Function2() { // from class: q6.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC9374m.m15352j(mutableState2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, ProvidedValue.$stable | 48);
            SpacerKt.Spacer(SizeKt.m18166width3ABfNKs(companion, C3115Dp.m23994constructorimpl(6)), composer, 6);
            TextKt.m19863Text4IGK_g("不再提醒", (Modifier) null, ColorKt.Color(4288256409L), AbstractC8136b.m13036d(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3462, 0, 131058);
            composer.endNode();
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
    public static final Unit m15352j(final MutableState mutableState, Composer composer, int i9) {
        if (composer.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1038504654, i9, -1, "com.zykj.student.dialogue.ui.dialog.UnderstandDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UnderstandDialogContent.kt:148)");
            }
            boolean zM15350h = m15350h(mutableState);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: q6.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC9374m.m15353k(mutableState, ((Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            CheckboxKt.Checkbox(zM15350h, (Function1) objRememberedValue, null, false, CheckboxDefaults.INSTANCE.m19018colors5tl4gsc(ColorKt.Color(4282944511L), ColorKt.Color(4291611852L), 0L, 0L, 0L, 0L, composer, (CheckboxDefaults.$stable << 18) | 54, 60), null, composer, 48, 44);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final Unit m15353k(MutableState mutableState, boolean z9) {
        m15357o(mutableState, z9);
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final Unit m15354l(Function1 function1, MutableState mutableState) {
        function1.invoke(Boolean.valueOf(m15350h(mutableState)));
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final Unit m15355m(MutableState mutableState) {
        m15357o(mutableState, !m15350h(mutableState));
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final Unit m15356n(Function1 function1, int i9, Composer composer, int i10) {
        m15349g(function1, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: o */
    public static final void m15357o(MutableState mutableState, boolean z9) {
        mutableState.setValue(Boolean.valueOf(z9));
    }
}
