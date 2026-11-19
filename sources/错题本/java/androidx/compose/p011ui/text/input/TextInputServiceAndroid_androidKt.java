package androidx.compose.p011ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.KeyboardCapitalization;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m5110d2 = {"Landroid/view/inputmethod/EditorInfo;", "Ld6/s;", "updateWithEmojiCompat", "(Landroid/view/inputmethod/EditorInfo;)V", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "update", "(Landroid/view/inputmethod/EditorInfo;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroid/view/Choreographer;", "Ljava/util/concurrent/Executor;", "asExecutor", "(Landroid/view/Choreographer;)Ljava/util/concurrent/Executor;", "", "bits", "flag", "", "hasFlag", "(II)Z", "", "DEBUG_CLASS", "Ljava/lang/String;", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextInputServiceAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,586:1\n1#2:587\n*E\n"})
/* loaded from: classes2.dex */
public final class TextInputServiceAndroid_androidKt {

    @NotNull
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    @NotNull
    public static final Executor asExecutor(@NotNull final Choreographer choreographer) {
        return new Executor() { // from class: androidx.compose.ui.text.input.b
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                TextInputServiceAndroid_androidKt.asExecutor$lambda$2(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asExecutor$lambda$2(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.a
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j7) {
                runnable.run();
            }
        });
    }

    private static final boolean hasFlag(int i, int i8) {
        return (i & i8) == i8;
    }

    public static final void update(@NotNull EditorInfo editorInfo, @NotNull ImeOptions imeOptions, @NotNull TextFieldValue textFieldValue) {
        String privateImeOptions;
        int iM12965getImeActioneUduSuo = imeOptions.getImeAction();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        int i = 6;
        if (ImeAction.m12936equalsimpl0(iM12965getImeActioneUduSuo, companion.m12949getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i = 0;
            }
        } else if (ImeAction.m12936equalsimpl0(iM12965getImeActioneUduSuo, companion.m12953getNoneeUduSuo())) {
            i = 1;
        } else if (ImeAction.m12936equalsimpl0(iM12965getImeActioneUduSuo, companion.m12951getGoeUduSuo())) {
            i = 2;
        } else if (ImeAction.m12936equalsimpl0(iM12965getImeActioneUduSuo, companion.m12952getNexteUduSuo())) {
            i = 5;
        } else if (ImeAction.m12936equalsimpl0(iM12965getImeActioneUduSuo, companion.m12954getPreviouseUduSuo())) {
            i = 7;
        } else if (ImeAction.m12936equalsimpl0(iM12965getImeActioneUduSuo, companion.m12955getSearcheUduSuo())) {
            i = 3;
        } else if (ImeAction.m12936equalsimpl0(iM12965getImeActioneUduSuo, companion.m12956getSendeUduSuo())) {
            i = 4;
        } else if (!ImeAction.m12936equalsimpl0(iM12965getImeActioneUduSuo, companion.m12950getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        int iM12966getKeyboardTypePjHm6EE = imeOptions.getKeyboardType();
        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
        if (KeyboardType.m12989equalsimpl0(iM12966getKeyboardTypePjHm6EE, companion2.m13010getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m12989equalsimpl0(iM12966getKeyboardTypePjHm6EE, companion2.m13003getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m12989equalsimpl0(iM12966getKeyboardTypePjHm6EE, companion2.m13006getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m12989equalsimpl0(iM12966getKeyboardTypePjHm6EE, companion2.m13009getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m12989equalsimpl0(iM12966getKeyboardTypePjHm6EE, companion2.m13012getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m12989equalsimpl0(iM12966getKeyboardTypePjHm6EE, companion2.m13005getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m12989equalsimpl0(iM12966getKeyboardTypePjHm6EE, companion2.m13008getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m12989equalsimpl0(iM12966getKeyboardTypePjHm6EE, companion2.m13007getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else {
            if (!KeyboardType.m12989equalsimpl0(iM12966getKeyboardTypePjHm6EE, companion2.m13004getDecimalPjHm6EE())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m12936equalsimpl0(imeOptions.getImeAction(), companion.m12949getDefaulteUduSuo())) {
                editorInfo.imeOptions |= BasicMeasure.EXACTLY;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int iM12964getCapitalizationIUNYP9k = imeOptions.getCapitalization();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.INSTANCE;
            if (KeyboardCapitalization.m12972equalsimpl0(iM12964getCapitalizationIUNYP9k, companion3.m12981getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m12972equalsimpl0(iM12964getCapitalizationIUNYP9k, companion3.m12985getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m12972equalsimpl0(iM12964getCapitalizationIUNYP9k, companion3.m12983getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m12770getStartimpl(textFieldValue.getSelection());
        editorInfo.initialSelEnd = TextRange.m12765getEndimpl(textFieldValue.getSelection());
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
