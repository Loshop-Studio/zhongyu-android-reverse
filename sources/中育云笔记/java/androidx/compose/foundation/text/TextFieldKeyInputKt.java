package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.input.key.KeyInputModifierKt;
import androidx.compose.p014ui.text.input.OffsetMapping;
import androidx.compose.p014ui.text.input.TextFieldValue;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p280od.InterfaceC10473g;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class TextFieldKeyInputKt {
    /* renamed from: textFieldKeyInput-2WJ9YEU, reason: not valid java name */
    public static final Modifier m27906textFieldKeyInput2WJ9YEU(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final TextFieldSelectionManager textFieldSelectionManager, final TextFieldValue textFieldValue, final InterfaceC9540l interfaceC9540l, final boolean z10, final boolean z11, final OffsetMapping offsetMapping, final UndoManager undoManager, final int i10) {
        return ComposedModifierKt.composed$default(modifier, null, new InterfaceC9545q() { // from class: androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(851809892);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(851809892, i11, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:252)");
                }
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new TextPreparedSelectionState();
                    composer.updateRememberedValue(objRememberedValue);
                }
                TextPreparedSelectionState textPreparedSelectionState = (TextPreparedSelectionState) objRememberedValue;
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new DeadKeyCombiner();
                    composer.updateRememberedValue(objRememberedValue2);
                }
                TextFieldKeyInput textFieldKeyInput = new TextFieldKeyInput(legacyTextFieldState, textFieldSelectionManager, textFieldValue, z10, z11, textPreparedSelectionState, offsetMapping, undoManager, (DeadKeyCombiner) objRememberedValue2, null, interfaceC9540l, i10, 512, null);
                Modifier.Companion companion2 = Modifier.Companion;
                boolean zChangedInstance = composer.changedInstance(textFieldKeyInput);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new TextFieldKeyInputKt$textFieldKeyInput$2$1$1(textFieldKeyInput);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(companion2, (InterfaceC9540l) ((InterfaceC10473g) objRememberedValue3));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierOnKeyEvent;
            }
        }, 1, null);
    }

    /* renamed from: textFieldKeyInput-2WJ9YEU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m27907textFieldKeyInput2WJ9YEU$default(Modifier modifier, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, InterfaceC9540l interfaceC9540l, boolean z10, boolean z11, OffsetMapping offsetMapping, UndoManager undoManager, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$1
                public final void invoke(TextFieldValue textFieldValue2) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((TextFieldValue) obj2);
                    return C10786q.f26013a;
                }
            };
        }
        return m27906textFieldKeyInput2WJ9YEU(modifier, legacyTextFieldState, textFieldSelectionManager, textFieldValue, interfaceC9540l, z10, z11, offsetMapping, undoManager, i10);
    }
}
