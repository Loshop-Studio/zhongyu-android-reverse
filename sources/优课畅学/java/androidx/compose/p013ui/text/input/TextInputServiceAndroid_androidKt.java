package androidx.compose.p013ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.input.ImeAction;
import androidx.compose.p013ui.text.input.KeyboardCapitalization;
import androidx.compose.p013ui.text.input.KeyboardType;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class TextInputServiceAndroid_androidKt {
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    public static final Executor asExecutor(final Choreographer choreographer) {
        return new Executor() { // from class: androidx.compose.ui.text.input.e
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                TextInputServiceAndroid_androidKt.asExecutor$lambda$2(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asExecutor$lambda$2(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.d
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                runnable.run();
            }
        });
    }

    private static final boolean hasFlag(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static final void update(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        String privateImeOptions;
        int iM26559getImeActioneUduSuo = imeOptions.m26559getImeActioneUduSuo();
        ImeAction.Companion companion = ImeAction.Companion;
        int i10 = 6;
        if (ImeAction.m26530equalsimpl0(iM26559getImeActioneUduSuo, companion.m26543getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i10 = 0;
            }
        } else if (ImeAction.m26530equalsimpl0(iM26559getImeActioneUduSuo, companion.m26547getNoneeUduSuo())) {
            i10 = 1;
        } else if (ImeAction.m26530equalsimpl0(iM26559getImeActioneUduSuo, companion.m26545getGoeUduSuo())) {
            i10 = 2;
        } else if (ImeAction.m26530equalsimpl0(iM26559getImeActioneUduSuo, companion.m26546getNexteUduSuo())) {
            i10 = 5;
        } else if (ImeAction.m26530equalsimpl0(iM26559getImeActioneUduSuo, companion.m26548getPreviouseUduSuo())) {
            i10 = 7;
        } else if (ImeAction.m26530equalsimpl0(iM26559getImeActioneUduSuo, companion.m26549getSearcheUduSuo())) {
            i10 = 3;
        } else if (ImeAction.m26530equalsimpl0(iM26559getImeActioneUduSuo, companion.m26550getSendeUduSuo())) {
            i10 = 4;
        } else if (!ImeAction.m26530equalsimpl0(iM26559getImeActioneUduSuo, companion.m26544getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i10;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        int iM26560getKeyboardTypePjHm6EE = imeOptions.m26560getKeyboardTypePjHm6EE();
        KeyboardType.Companion companion2 = KeyboardType.Companion;
        if (KeyboardType.m26583equalsimpl0(iM26560getKeyboardTypePjHm6EE, companion2.m26604getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m26583equalsimpl0(iM26560getKeyboardTypePjHm6EE, companion2.m26597getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m26583equalsimpl0(iM26560getKeyboardTypePjHm6EE, companion2.m26600getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m26583equalsimpl0(iM26560getKeyboardTypePjHm6EE, companion2.m26603getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m26583equalsimpl0(iM26560getKeyboardTypePjHm6EE, companion2.m26606getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m26583equalsimpl0(iM26560getKeyboardTypePjHm6EE, companion2.m26599getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m26583equalsimpl0(iM26560getKeyboardTypePjHm6EE, companion2.m26602getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m26583equalsimpl0(iM26560getKeyboardTypePjHm6EE, companion2.m26601getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else {
            if (!KeyboardType.m26583equalsimpl0(iM26560getKeyboardTypePjHm6EE, companion2.m26598getDecimalPjHm6EE())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m26530equalsimpl0(imeOptions.m26559getImeActioneUduSuo(), companion.m26543getDefaulteUduSuo())) {
                editorInfo.imeOptions |= BasicMeasure.EXACTLY;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int iM26558getCapitalizationIUNYP9k = imeOptions.m26558getCapitalizationIUNYP9k();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.Companion;
            if (KeyboardCapitalization.m26566equalsimpl0(iM26558getCapitalizationIUNYP9k, companion3.m26575getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m26566equalsimpl0(iM26558getCapitalizationIUNYP9k, companion3.m26579getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m26566equalsimpl0(iM26558getCapitalizationIUNYP9k, companion3.m26577getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m26364getStartimpl(textFieldValue.m26612getSelectiond9O1mEE());
        editorInfo.initialSelEnd = TextRange.m26359getEndimpl(textFieldValue.m26612getSelectiond9O1mEE());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (EmojiCompat.isConfigured()) {
            EmojiCompat.get().updateEditorInfo(editorInfo);
        }
    }
}
