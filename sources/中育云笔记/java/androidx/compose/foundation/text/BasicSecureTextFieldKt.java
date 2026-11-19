package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.InputTransformationKt;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.platform.TextToolbar;
import androidx.compose.p014ui.platform.TextToolbarStatus;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class BasicSecureTextFieldKt {
    private static final char DefaultObfuscationCharacter = 8226;
    private static final long LAST_TYPED_CHARACTER_REVEAL_DURATION_MILLIS = 1500;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010b  */
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /* renamed from: BasicSecureTextField-Jb9bMDk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m27761BasicSecureTextFieldJb9bMDk(final androidx.compose.foundation.text.input.TextFieldState r36, androidx.compose.p014ui.Modifier r37, boolean r38, androidx.compose.foundation.text.input.InputTransformation r39, androidx.compose.p014ui.text.TextStyle r40, androidx.compose.foundation.text.KeyboardOptions r41, androidx.compose.foundation.text.input.KeyboardActionHandler r42, p181hd.InterfaceC9544p r43, androidx.compose.foundation.interaction.MutableInteractionSource r44, androidx.compose.p014ui.graphics.Brush r45, androidx.compose.foundation.text.input.TextFieldDecorator r46, int r47, char r48, androidx.compose.runtime.Composer r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicSecureTextFieldKt.m27761BasicSecureTextFieldJb9bMDk(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, hd.p, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.foundation.text.input.TextFieldDecorator, int, char, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /* renamed from: BasicSecureTextField-egD4TGM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m27762BasicSecureTextFieldegD4TGM(final androidx.compose.foundation.text.input.TextFieldState r34, androidx.compose.p014ui.Modifier r35, boolean r36, boolean r37, androidx.compose.foundation.text.input.InputTransformation r38, androidx.compose.p014ui.text.TextStyle r39, androidx.compose.foundation.text.KeyboardOptions r40, androidx.compose.foundation.text.input.KeyboardActionHandler r41, p181hd.InterfaceC9544p r42, androidx.compose.foundation.interaction.MutableInteractionSource r43, androidx.compose.p014ui.graphics.Brush r44, androidx.compose.foundation.text.input.TextFieldDecorator r45, int r46, char r47, androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicSecureTextFieldKt.m27762BasicSecureTextFieldegD4TGM(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, hd.p, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.foundation.text.input.TextFieldDecorator, int, char, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int BasicSecureTextField_egD4TGM$lambda$4$lambda$3(State state, int i10, int i11) {
        return ((Character) state.getValue()).charValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void DisableCutCopy(final InterfaceC9544p interfaceC9544p, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1085555050);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(interfaceC9544p) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1085555050, i11, -1, "androidx.compose.foundation.text.DisableCutCopy (BasicSecureTextField.kt:305)");
            }
            final TextToolbar textToolbar = (TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar());
            boolean zChanged = composerStartRestartGroup.changed(textToolbar);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new TextToolbar() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1
                    private final /* synthetic */ TextToolbar $$delegate_0;

                    {
                        this.$$delegate_0 = this.$currentToolbar;
                    }

                    @Override // androidx.compose.p014ui.platform.TextToolbar
                    public TextToolbarStatus getStatus() {
                        return this.$$delegate_0.getStatus();
                    }

                    @Override // androidx.compose.p014ui.platform.TextToolbar
                    public void hide() {
                        this.$$delegate_0.hide();
                    }

                    @Override // androidx.compose.p014ui.platform.TextToolbar
                    public void showMenu(Rect rect, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3, InterfaceC9529a interfaceC9529a4) {
                        this.$$delegate_0.showMenu(rect, interfaceC9529a, interfaceC9529a2, interfaceC9529a3, interfaceC9529a4);
                    }

                    @Override // androidx.compose.p014ui.platform.TextToolbar
                    public void showMenu(Rect rect, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3, InterfaceC9529a interfaceC9529a4, InterfaceC9529a interfaceC9529a5) {
                        this.$currentToolbar.showMenu(rect, null, interfaceC9529a2, null, interfaceC9529a4, interfaceC9529a5);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalTextToolbar().provides((BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1) objRememberedValue), interfaceC9544p, composerStartRestartGroup, ((i11 << 3) & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt.DisableCutCopy.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i12) {
                    BasicSecureTextFieldKt.DisableCutCopy(interfaceC9544p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputTransformation then(InputTransformation inputTransformation, InputTransformation inputTransformation2) {
        return inputTransformation == null ? inputTransformation2 : inputTransformation2 == null ? inputTransformation : InputTransformationKt.then(inputTransformation, inputTransformation2);
    }
}
