package p294x6;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TextKt;
import androidx.compose.p012ui.Alignment;
import androidx.compose.p012ui.ComposedModifierKt;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.focus.FocusManager;
import androidx.compose.p012ui.layout.MeasurePolicy;
import androidx.compose.p012ui.node.ComposeUiNode;
import androidx.compose.p012ui.platform.SoftwareKeyboardController;
import androidx.compose.p012ui.text.TextLayoutResult;
import androidx.compose.p012ui.text.TextStyle;
import androidx.compose.p012ui.text.font.FontFamily;
import androidx.compose.p012ui.text.font.FontStyle;
import androidx.compose.p012ui.text.font.FontWeight;
import androidx.compose.p012ui.text.style.TextAlign;
import androidx.compose.p012ui.text.style.TextDecoration;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x6.b0 */
/* loaded from: classes5.dex */
public abstract class AbstractC9887b0 {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0121  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m16938h(androidx.compose.p012ui.Modifier r49, java.lang.String r50, kotlin.jvm.functions.Function1 r51, kotlin.jvm.functions.Function2 r52, kotlin.jvm.functions.Function0 r53, androidx.compose.foundation.text.KeyboardOptions r54, kotlin.jvm.functions.Function1 r55, final androidx.compose.p012ui.text.TextStyle r56, final androidx.compose.p012ui.text.TextStyle r57, boolean r58, final java.lang.String r59, int r60, boolean r61, androidx.compose.runtime.Composer r62, final int r63, final int r64, final int r65) {
        /*
            Method dump skipped, instructions count: 1382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p294x6.AbstractC9887b0.m16938h(androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, androidx.compose.foundation.text.KeyboardOptions, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, boolean, java.lang.String, int, boolean, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: i */
    public static final Unit m16939i(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final Unit m16940j(Function1 function1, FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController, Function0 function0) {
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

    /* renamed from: k */
    public static final Unit m16941k(FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController, Function1 function1, String str, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        focusManager.clearFocus(true);
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final Unit m16942l(int i9, Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() <= i9) {
            function1.invoke(it);
        } else {
            String strSubstring = it.substring(0, i9);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            function1.invoke(strSubstring);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final Unit m16943m(String str, String str2, TextStyle textStyle, Function2 innerTextField, Composer composer, int i9) {
        int i10;
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        if ((i9 & 6) == 0) {
            i10 = i9 | (composer.changedInstance(innerTextField) ? 4 : 2);
        } else {
            i10 = i9;
        }
        if (composer.shouldExecute((i10 & 19) != 18, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2080198203, i10, -1, "com.zykj.student.dialogue.ui.widget.SearchContent.<anonymous>.<anonymous> (SearchContent.kt:65)");
            }
            if (str.length() == 0) {
                composer.startReplaceGroup(-1910677361);
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
                Composer composerM20851constructorimpl = Updater.m20851constructorimpl(composer);
                Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                innerTextField.invoke(composer, Integer.valueOf(i10 & 14));
                TextKt.m19863Text4IGK_g(str2 == null ? "" : str2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer, 48, 0, 65532);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1910661963);
                innerTextField.invoke(composer, Integer.valueOf(i10 & 14));
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

    /* renamed from: n */
    public static final Unit m16944n(Modifier modifier, String str, Function1 function1, Function2 function2, Function0 function0, KeyboardOptions keyboardOptions, Function1 function12, TextStyle textStyle, TextStyle textStyle2, boolean z9, String str2, int i9, boolean z10, int i10, int i11, int i12, Composer composer, int i13) {
        m16938h(modifier, str, function1, function2, function0, keyboardOptions, function12, textStyle, textStyle2, z9, str2, i9, z10, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), RecomposeScopeImplKt.updateChangedFlags(i11), i12);
        return Unit.INSTANCE;
    }

    /* renamed from: o */
    public static final Unit m16945o(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Unit.INSTANCE;
    }
}
