package androidx.compose.p009ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.p009ui.text.TextRange;
import androidx.compose.p009ui.text.input.ImeAction;
import androidx.compose.p009ui.text.input.KeyboardCapitalization;
import androidx.compose.p009ui.text.input.KeyboardType;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0000\u001a\u001c\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\f\u0010\u0011\u001a\u00020\u000b*\u00020\fH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m7880d2 = {"DEBUG_CLASS", "", "hasFlag", "", "bits", "", "flag", "asExecutor", "Ljava/util/concurrent/Executor;", "Landroid/view/Choreographer;", "update", "", "Landroid/view/inputmethod/EditorInfo;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "updateWithEmojiCompat", "ui_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nTextInputServiceAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,586:1\n1#2:587\n*E\n"})
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
            public final void doFrame(long j6) {
                runnable.run();
            }
        });
    }

    private static final boolean hasFlag(int i6, int i7) {
        return (i6 & i7) == i7;
    }

    public static final void update(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        String privateImeOptions;
        int imeAction = imeOptions.getImeAction();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        int i6 = 6;
        if (ImeAction.m16116equalsimpl0(imeAction, companion.m16129getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i6 = 0;
            }
        } else if (ImeAction.m16116equalsimpl0(imeAction, companion.m16133getNoneeUduSuo())) {
            i6 = 1;
        } else if (ImeAction.m16116equalsimpl0(imeAction, companion.m16131getGoeUduSuo())) {
            i6 = 2;
        } else if (ImeAction.m16116equalsimpl0(imeAction, companion.m16132getNexteUduSuo())) {
            i6 = 5;
        } else if (ImeAction.m16116equalsimpl0(imeAction, companion.m16134getPreviouseUduSuo())) {
            i6 = 7;
        } else if (ImeAction.m16116equalsimpl0(imeAction, companion.m16135getSearcheUduSuo())) {
            i6 = 3;
        } else if (ImeAction.m16116equalsimpl0(imeAction, companion.m16136getSendeUduSuo())) {
            i6 = 4;
        } else if (!ImeAction.m16116equalsimpl0(imeAction, companion.m16130getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i6;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        int keyboardType = imeOptions.getKeyboardType();
        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
        if (KeyboardType.m16169equalsimpl0(keyboardType, companion2.m16190getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m16169equalsimpl0(keyboardType, companion2.m16183getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m16169equalsimpl0(keyboardType, companion2.m16186getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m16169equalsimpl0(keyboardType, companion2.m16189getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m16169equalsimpl0(keyboardType, companion2.m16192getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m16169equalsimpl0(keyboardType, companion2.m16185getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m16169equalsimpl0(keyboardType, companion2.m16188getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m16169equalsimpl0(keyboardType, companion2.m16187getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else {
            if (!KeyboardType.m16169equalsimpl0(keyboardType, companion2.m16184getDecimalPjHm6EE())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m16116equalsimpl0(imeOptions.getImeAction(), companion.m16129getDefaulteUduSuo())) {
                editorInfo.imeOptions |= BasicMeasure.EXACTLY;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.INSTANCE;
            if (KeyboardCapitalization.m16152equalsimpl0(capitalization, companion3.m16161getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m16152equalsimpl0(capitalization, companion3.m16165getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m16152equalsimpl0(capitalization, companion3.m16163getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m15950getStartimpl(textFieldValue.getSelection());
        editorInfo.initialSelEnd = TextRange.m15945getEndimpl(textFieldValue.getSelection());
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
