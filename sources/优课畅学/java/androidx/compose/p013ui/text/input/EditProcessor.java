package androidx.compose.p013ui.text.input;

import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.AnnotatedStringKt;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.smtt.sdk.TbsListener;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p134i7.AbstractC8778f0;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class EditProcessor {
    public static final int $stable = 8;
    private TextFieldValue mBufferState = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), TextRange.Companion.m26369getZerod9O1mEE(), (TextRange) null, (AbstractC9126n) null);
    private EditingBuffer mBuffer = new EditingBuffer(this.mBufferState.getAnnotatedString(), this.mBufferState.m26612getSelectiond9O1mEE(), (AbstractC9126n) null);

    private final String generateBatchErrorMessage(List<? extends EditCommand> list, final EditCommand editCommand) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.getLength$ui_text_release() + ", composition=" + this.mBuffer.m26524getCompositionMzsxiRA$ui_text_release() + ", selection=" + ((Object) TextRange.m26367toStringimpl(this.mBuffer.m26525getSelectiond9O1mEE$ui_text_release())) + "):");
        AbstractC9133u.m16132f(sb, "append(...)");
        sb.append('\n');
        AbstractC9133u.m16132f(sb, "append(...)");
        AbstractC8778f0.m14573s0(list, sb, (TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY & 2) != 0 ? ", " : SignParameters.NEW_LINE, (TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY & 4) != 0 ? "" : null, (TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY & 8) == 0 ? null : "", (TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY & 16) != 0 ? -1 : 0, (TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY & 32) != 0 ? "..." : null, (TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY & 64) != 0 ? null : new InterfaceC10570l() { // from class: androidx.compose.ui.text.input.EditProcessor$generateBatchErrorMessage$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final CharSequence invoke(EditCommand editCommand2) {
                return (editCommand == editCommand2 ? " > " : "   ") + this.toStringForLog(editCommand2);
            }
        });
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toStringForLog(EditCommand editCommand) {
        if (editCommand instanceof CommitTextCommand) {
            StringBuilder sb = new StringBuilder();
            sb.append("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) editCommand;
            sb.append(commitTextCommand.getText().length());
            sb.append(", newCursorPosition=");
            sb.append(commitTextCommand.getNewCursorPosition());
            sb.append(')');
            return sb.toString();
        }
        if (editCommand instanceof SetComposingTextCommand) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SetComposingTextCommand(text.length=");
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) editCommand;
            sb2.append(setComposingTextCommand.getText().length());
            sb2.append(", newCursorPosition=");
            sb2.append(setComposingTextCommand.getNewCursorPosition());
            sb2.append(')');
            return sb2.toString();
        }
        if (editCommand instanceof SetComposingRegionCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof DeleteSurroundingTextCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof DeleteSurroundingTextInCodePointsCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof SetSelectionCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof FinishComposingTextCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof BackspaceCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof MoveCursorCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof DeleteAllCommand) {
            return editCommand.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Unknown EditCommand: ");
        String strMo13672g = AbstractC9137y.m16154b(editCommand.getClass()).mo13672g();
        if (strMo13672g == null) {
            strMo13672g = "{anonymous EditCommand}";
        }
        sb3.append(strMo13672g);
        return sb3.toString();
    }

    public final TextFieldValue apply(List<? extends EditCommand> list) {
        EditCommand editCommand;
        EditCommand editCommand2 = null;
        try {
            int size = list.size();
            int i10 = 0;
            EditCommand editCommand3 = null;
            while (i10 < size) {
                try {
                    editCommand = list.get(i10);
                } catch (Exception e10) {
                    e = e10;
                    editCommand2 = editCommand3;
                }
                try {
                    editCommand.applyTo(this.mBuffer);
                    i10++;
                    editCommand3 = editCommand;
                } catch (Exception e11) {
                    e = e11;
                    editCommand2 = editCommand;
                    throw new RuntimeException(generateBatchErrorMessage(list, editCommand2), e);
                }
            }
            AnnotatedString annotatedString$ui_text_release = this.mBuffer.toAnnotatedString$ui_text_release();
            long jM26525getSelectiond9O1mEE$ui_text_release = this.mBuffer.m26525getSelectiond9O1mEE$ui_text_release();
            TextRange textRangeM26352boximpl = TextRange.m26352boximpl(jM26525getSelectiond9O1mEE$ui_text_release);
            textRangeM26352boximpl.m26368unboximpl();
            TextRange textRange = TextRange.m26363getReversedimpl(this.mBufferState.m26612getSelectiond9O1mEE()) ? null : textRangeM26352boximpl;
            TextFieldValue textFieldValue = new TextFieldValue(annotatedString$ui_text_release, textRange != null ? textRange.m26368unboximpl() : TextRangeKt.TextRange(TextRange.m26361getMaximpl(jM26525getSelectiond9O1mEE$ui_text_release), TextRange.m26362getMinimpl(jM26525getSelectiond9O1mEE$ui_text_release)), this.mBuffer.m26524getCompositionMzsxiRA$ui_text_release(), (AbstractC9126n) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (Exception e12) {
            e = e12;
        }
    }

    public final EditingBuffer getMBuffer$ui_text_release() {
        return this.mBuffer;
    }

    public final TextFieldValue getMBufferState$ui_text_release() {
        return this.mBufferState;
    }

    public final void reset(TextFieldValue textFieldValue, TextInputSession textInputSession) {
        boolean zM16128b = AbstractC9133u.m16128b(textFieldValue.m26611getCompositionMzsxiRA(), this.mBuffer.m26524getCompositionMzsxiRA$ui_text_release());
        boolean z10 = true;
        boolean z11 = false;
        if (!AbstractC9133u.m16128b(this.mBufferState.getAnnotatedString().getText(), textFieldValue.getAnnotatedString().getText())) {
            this.mBuffer = new EditingBuffer(textFieldValue.getAnnotatedString(), textFieldValue.m26612getSelectiond9O1mEE(), (AbstractC9126n) null);
        } else if (TextRange.m26357equalsimpl0(this.mBufferState.m26612getSelectiond9O1mEE(), textFieldValue.m26612getSelectiond9O1mEE())) {
            z10 = false;
        } else {
            this.mBuffer.setSelection$ui_text_release(TextRange.m26362getMinimpl(textFieldValue.m26612getSelectiond9O1mEE()), TextRange.m26361getMaximpl(textFieldValue.m26612getSelectiond9O1mEE()));
            z11 = true;
            z10 = false;
        }
        if (textFieldValue.m26611getCompositionMzsxiRA() == null) {
            this.mBuffer.commitComposition$ui_text_release();
        } else if (!TextRange.m26358getCollapsedimpl(textFieldValue.m26611getCompositionMzsxiRA().m26368unboximpl())) {
            this.mBuffer.setComposition$ui_text_release(TextRange.m26362getMinimpl(textFieldValue.m26611getCompositionMzsxiRA().m26368unboximpl()), TextRange.m26361getMaximpl(textFieldValue.m26611getCompositionMzsxiRA().m26368unboximpl()));
        }
        if (z10 || (!z11 && !zM16128b)) {
            this.mBuffer.commitComposition$ui_text_release();
            textFieldValue = TextFieldValue.m26607copy3r_uNRQ$default(textFieldValue, (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null);
        }
        TextFieldValue textFieldValue2 = this.mBufferState;
        this.mBufferState = textFieldValue;
        if (textInputSession != null) {
            textInputSession.updateState(textFieldValue2, textFieldValue);
        }
    }

    public final TextFieldValue toTextFieldValue() {
        return this.mBufferState;
    }
}
