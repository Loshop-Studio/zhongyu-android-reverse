package p079e7;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardActionsKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TextKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.focus.FocusManager;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.layout.ContentScale;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.platform.SoftwareKeyboardController;
import androidx.compose.p013ui.res.PainterResources_androidKt;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.input.VisualTransformation;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blankj.utilcode.util.ToastUtils;
import com.zykj.evaluation.R;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import p068d7.AbstractC7305a;
import p101g7.C7585a;

/* renamed from: e7.k0 */
/* loaded from: classes4.dex */
public abstract class AbstractC7391k0 {
    /* JADX WARN: Removed duplicated region for block: B:108:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:236:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013e  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m11854i(final java.lang.String r39, androidx.compose.p013ui.Modifier r40, boolean r41, long r42, androidx.compose.p013ui.graphics.Shape r44, androidx.compose.foundation.BorderStroke r45, java.lang.String r46, kotlin.jvm.functions.Function1 r47, kotlin.jvm.functions.Function2 r48, kotlin.jvm.functions.Function0 r49, androidx.compose.foundation.text.KeyboardOptions r50, kotlin.jvm.functions.Function1 r51, final androidx.compose.p013ui.text.TextStyle r52, final androidx.compose.p013ui.text.TextStyle r53, boolean r54, int r55, androidx.compose.runtime.Composer r56, final int r57, final int r58, final int r59) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p079e7.AbstractC7391k0.m11854i(java.lang.String, androidx.compose.ui.Modifier, boolean, long, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, androidx.compose.foundation.text.KeyboardOptions, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, boolean, int, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: j */
    public static final Unit m11855j(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final Unit m11856k(Function2 function2, final FocusManager focusManager, final SoftwareKeyboardController softwareKeyboardController, final String str, final Function1 function1, final int i10, final Function1 function12, boolean z9, TextStyle textStyle, KeyboardOptions keyboardOptions, boolean z10, final Function0 function0, final String str2, final TextStyle textStyle2, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(458332152, i11, -1, "com.zykj.evaluation.ui.widget.SearchContent.<anonymous> (SearchContent.kt:63)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17683paddingVpY3zN4$default = PaddingKt.m17683paddingVpY3zN4$default(companion, C3127Dp.m23561constructorimpl((5 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM17683paddingVpY3zN4$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (function2 == null) {
                composer.startReplaceGroup(-1380787299);
            } else {
                composer.startReplaceGroup(1895121124);
                function2.invoke(composer, 0);
            }
            composer.endReplaceGroup();
            SolidColor solidColor = new SolidColor(AbstractC7305a.m11585i(), null);
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17683paddingVpY3zN4$default2 = PaddingKt.m17683paddingVpY3zN4$default(modifierWeight$default, C3127Dp.m23561constructorimpl((3 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 2, null);
            boolean zChangedInstance = composer.changedInstance(focusManager) | composer.changed(softwareKeyboardController) | composer.changed(str) | composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: e7.g0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC7391k0.m11859n(focusManager, softwareKeyboardController, str, function1, (KeyboardActionScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            KeyboardActions KeyboardActions = KeyboardActionsKt.KeyboardActions((Function1) objRememberedValue);
            boolean zChanged = composer.changed(i10) | composer.changed(function12);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: e7.h0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC7391k0.m11860o(i10, function12, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            BasicTextFieldKt.BasicTextField(str, (Function1<? super String, Unit>) objRememberedValue2, modifierM17683paddingVpY3zN4$default2, z9, false, textStyle, keyboardOptions, KeyboardActions, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-343468007, true, new Function3() { // from class: e7.i0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbstractC7391k0.m11857l(str, str2, textStyle2, (Function2) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 100663296, 221184, 15888);
            if (!z10 || str.length() <= 0) {
                composer.startReplaceGroup(-1383334010);
            } else {
                composer.startReplaceGroup(-1378633914);
                DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17728size3ABfNKs = SizeKt.m17728size3ABfNKs(companion, C3127Dp.m23561constructorimpl((11 / f10) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
                boolean zChanged2 = composer.changed(function12) | composer.changedInstance(focusManager) | composer.changed(softwareKeyboardController) | composer.changed(function0);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: e7.j0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC7391k0.m11858m(function12, focusManager, softwareKeyboardController, function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.icon_search_clear, composer, 6), (String) null, ClickableKt.m17224clickableXHw0xAI$default(modifierM17728size3ABfNKs, false, null, null, (Function0) objRememberedValue3, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final Unit m11857l(String str, String str2, TextStyle textStyle, Function2 innerTextField, Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        if ((i10 & 6) == 0) {
            i11 = i10 | (composer.changedInstance(innerTextField) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if (composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-343468007, i11, -1, "com.zykj.evaluation.ui.widget.SearchContent.<anonymous>.<anonymous>.<anonymous> (SearchContent.kt:87)");
            }
            if (str.length() == 0) {
                composer.startReplaceGroup(639730451);
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenterStart(), false);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxHeight$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                innerTextField.invoke(composer, Integer.valueOf(i11 & 14));
                TextKt.m19430Text4IGK_g(str2 == null ? "" : str2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer, 48, 0, 65532);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(639747337);
                innerTextField.invoke(composer, Integer.valueOf(i11 & 14));
                composer.endReplaceGroup();
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
    public static final Unit m11858m(Function1 function1, FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController, Function0 function0) {
        function1.invoke("");
        focusManager.clearFocus(true);
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final Unit m11859n(FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController, String str, Function1 function1, KeyboardActionScope KeyboardActions) {
        Integer intOrNull;
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        focusManager.clearFocus(true);
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{"::"}, false, 0, 6, (Object) null);
        if (listSplit$default.size() != 2) {
            function1.invoke(str);
        } else if (Intrinsics.areEqual((String) CollectionsKt.first(listSplit$default), "compress") && (intOrNull = StringsKt.toIntOrNull((String) CollectionsKt.last(listSplit$default))) != null) {
            int iIntValue = intOrNull.intValue();
            C7585a.f12711a.m12449k(iIntValue);
            ToastUtils.showShort("图片压缩率已改为" + iIntValue, new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: o */
    public static final Unit m11860o(int i10, Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() <= i10) {
            function1.invoke(it);
        } else {
            String strSubstring = it.substring(0, i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            function1.invoke(strSubstring);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: p */
    public static final Unit m11861p(String str, Modifier modifier, boolean z9, long j10, Shape shape, BorderStroke borderStroke, String str2, Function1 function1, Function2 function2, Function0 function0, KeyboardOptions keyboardOptions, Function1 function12, TextStyle textStyle, TextStyle textStyle2, boolean z10, int i10, int i11, int i12, int i13, Composer composer, int i14) {
        m11854i(str, modifier, z9, j10, shape, borderStroke, str2, function1, function2, function0, keyboardOptions, function12, textStyle, textStyle2, z10, i10, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), RecomposeScopeImplKt.updateChangedFlags(i12), i13);
        return Unit.INSTANCE;
    }

    /* renamed from: q */
    public static final Unit m11862q(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Unit.INSTANCE;
    }
}
