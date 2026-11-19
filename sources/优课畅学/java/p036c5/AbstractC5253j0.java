package p036c5;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TextKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* renamed from: c5.j0 */
/* loaded from: classes5.dex */
public abstract class AbstractC5253j0 {
    /* JADX WARN: Removed duplicated region for block: B:172:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0101  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2162h(androidx.compose.p013ui.Modifier r43, java.lang.String r44, p300x7.InterfaceC10570l r45, p300x7.InterfaceC10574p r46, androidx.compose.foundation.text.KeyboardOptions r47, p300x7.InterfaceC10570l r48, final androidx.compose.p013ui.text.TextStyle r49, final androidx.compose.p013ui.text.TextStyle r50, androidx.compose.runtime.Composer r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 991
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p036c5.AbstractC5253j0.m2162h(androidx.compose.ui.Modifier, java.lang.String, x7.l, x7.p, androidx.compose.foundation.text.KeyboardOptions, x7.l, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: i */
    public static final C8736p m2163i(String str) {
        AbstractC9133u.m16133g(str, "<this>");
        return C8736p.f16368a;
    }

    /* renamed from: j */
    public static final C8736p m2164j(InterfaceC10570l interfaceC10570l, MutableState mutableState, String it) {
        AbstractC9133u.m16133g(it, "it");
        m2171q(mutableState, it);
        interfaceC10570l.invoke(m2170p(mutableState));
        return C8736p.f16368a;
    }

    /* renamed from: k */
    public static final C8736p m2165k(MutableState mutableState, String str, TextStyle textStyle, InterfaceC10574p innerTextField, Composer composer, int i10) {
        int i11;
        AbstractC9133u.m16133g(innerTextField, "innerTextField");
        if ((i10 & 6) == 0) {
            i11 = i10 | (composer.changedInstance(innerTextField) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if (composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(780352136, i11, -1, "com.zykj.study.ui.home.my.card.CustomTextField.<anonymous>.<anonymous> (CustomTextFiled.kt:52)");
            }
            if (m2170p(mutableState).length() == 0) {
                composer.startReplaceGroup(-1700871182);
                Modifier.Companion companion = Modifier.Companion;
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenterStart(), false);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxHeight$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                InterfaceC10559a constructor = companion2.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM23703constructorimpl = Updater.m23703constructorimpl(composer);
                Updater.m23710setimpl(composerM23703constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m23710setimpl(composerM23703constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                InterfaceC10574p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM23703constructorimpl.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM23703constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM23703constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m23710setimpl(composerM23703constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                innerTextField.invoke(composer, Integer.valueOf(i11 & 14));
                TextKt.m22699Text4IGK_g(str == null ? "" : str, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC10570l) null, textStyle, composer, 48, 0, 65532);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1700855784);
                innerTextField.invoke(composer, Integer.valueOf(i11 & 14));
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C8736p.f16368a;
    }

    /* renamed from: l */
    public static final C8736p m2166l(InterfaceC10570l interfaceC10570l, MutableState mutableState) {
        m2171q(mutableState, "");
        interfaceC10570l.invoke("");
        return C8736p.f16368a;
    }

    /* renamed from: m */
    public static final C8736p m2167m(InterfaceC10570l interfaceC10570l, MutableState mutableState, KeyboardActionScope KeyboardActions) {
        AbstractC9133u.m16133g(KeyboardActions, "$this$KeyboardActions");
        interfaceC10570l.invoke(m2170p(mutableState));
        return C8736p.f16368a;
    }

    /* renamed from: n */
    public static final C8736p m2168n(Modifier modifier, String str, InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p, KeyboardOptions keyboardOptions, InterfaceC10570l interfaceC10570l2, TextStyle textStyle, TextStyle textStyle2, int i10, int i11, Composer composer, int i12) {
        m2162h(modifier, str, interfaceC10570l, interfaceC10574p, keyboardOptions, interfaceC10570l2, textStyle, textStyle2, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C8736p.f16368a;
    }

    /* renamed from: o */
    public static final C8736p m2169o(String str) {
        AbstractC9133u.m16133g(str, "<this>");
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static final String m2170p(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    /* renamed from: q */
    public static final void m2171q(MutableState mutableState, String str) {
        mutableState.setValue(str);
    }
}
