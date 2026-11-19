package androidx.compose.p014ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.input.ImeAction;
import androidx.compose.p014ui.text.input.KeyboardCapitalization;
import androidx.compose.p014ui.text.input.KeyboardType;
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
        int iM33161getImeActioneUduSuo = imeOptions.m33161getImeActioneUduSuo();
        ImeAction.Companion companion = ImeAction.Companion;
        int i10 = 6;
        if (ImeAction.m33132equalsimpl0(iM33161getImeActioneUduSuo, companion.m33145getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i10 = 0;
            }
        } else if (ImeAction.m33132equalsimpl0(iM33161getImeActioneUduSuo, companion.m33149getNoneeUduSuo())) {
            i10 = 1;
        } else if (ImeAction.m33132equalsimpl0(iM33161getImeActioneUduSuo, companion.m33147getGoeUduSuo())) {
            i10 = 2;
        } else if (ImeAction.m33132equalsimpl0(iM33161getImeActioneUduSuo, companion.m33148getNexteUduSuo())) {
            i10 = 5;
        } else if (ImeAction.m33132equalsimpl0(iM33161getImeActioneUduSuo, companion.m33150getPreviouseUduSuo())) {
            i10 = 7;
        } else if (ImeAction.m33132equalsimpl0(iM33161getImeActioneUduSuo, companion.m33151getSearcheUduSuo())) {
            i10 = 3;
        } else if (ImeAction.m33132equalsimpl0(iM33161getImeActioneUduSuo, companion.m33152getSendeUduSuo())) {
            i10 = 4;
        } else if (!ImeAction.m33132equalsimpl0(iM33161getImeActioneUduSuo, companion.m33146getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i10;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        int iM33162getKeyboardTypePjHm6EE = imeOptions.m33162getKeyboardTypePjHm6EE();
        KeyboardType.Companion companion2 = KeyboardType.Companion;
        if (KeyboardType.m33185equalsimpl0(iM33162getKeyboardTypePjHm6EE, companion2.m33206getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m33185equalsimpl0(iM33162getKeyboardTypePjHm6EE, companion2.m33199getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m33185equalsimpl0(iM33162getKeyboardTypePjHm6EE, companion2.m33202getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m33185equalsimpl0(iM33162getKeyboardTypePjHm6EE, companion2.m33205getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m33185equalsimpl0(iM33162getKeyboardTypePjHm6EE, companion2.m33208getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m33185equalsimpl0(iM33162getKeyboardTypePjHm6EE, companion2.m33201getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m33185equalsimpl0(iM33162getKeyboardTypePjHm6EE, companion2.m33204getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m33185equalsimpl0(iM33162getKeyboardTypePjHm6EE, companion2.m33203getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else {
            if (!KeyboardType.m33185equalsimpl0(iM33162getKeyboardTypePjHm6EE, companion2.m33200getDecimalPjHm6EE())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m33132equalsimpl0(imeOptions.m33161getImeActioneUduSuo(), companion.m33145getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int iM33160getCapitalizationIUNYP9k = imeOptions.m33160getCapitalizationIUNYP9k();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.Companion;
            if (KeyboardCapitalization.m33168equalsimpl0(iM33160getCapitalizationIUNYP9k, companion3.m33177getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m33168equalsimpl0(iM33160getCapitalizationIUNYP9k, companion3.m33181getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m33168equalsimpl0(iM33160getCapitalizationIUNYP9k, companion3.m33179getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m32966getStartimpl(textFieldValue.m33214getSelectiond9O1mEE());
        editorInfo.initialSelEnd = TextRange.m32961getEndimpl(textFieldValue.m33214getSelectiond9O1mEE());
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
