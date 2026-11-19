package androidx.compose.p014ui.text.input;

import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.AnnotatedStringKt;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.TextRangeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9540l;
import p325rc.AbstractC10947g0;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class EditProcessor {
    public static final int $stable = 8;
    private TextFieldValue mBufferState = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), TextRange.Companion.m32971getZerod9O1mEE(), (TextRange) null, (AbstractC9972n) null);
    private EditingBuffer mBuffer = new EditingBuffer(this.mBufferState.getAnnotatedString(), this.mBufferState.m33214getSelectiond9O1mEE(), (AbstractC9972n) null);

    private final String generateBatchErrorMessage(List<? extends EditCommand> list, final EditCommand editCommand) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.getLength$ui_text_release() + ", composition=" + this.mBuffer.m33126getCompositionMzsxiRA$ui_text_release() + ", selection=" + ((Object) TextRange.m32969toStringimpl(this.mBuffer.m33127getSelectiond9O1mEE$ui_text_release())) + "):");
        AbstractC9979u.m20293f(sb2, "append(...)");
        sb2.append('\n');
        AbstractC9979u.m20293f(sb2, "append(...)");
        AbstractC10947g0.m23951t0(list, sb2, (124 & 2) != 0 ? ", " : SignParameters.NEW_LINE, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new InterfaceC9540l() { // from class: androidx.compose.ui.text.input.EditProcessor$generateBatchErrorMessage$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final CharSequence invoke(EditCommand editCommand2) {
                return (editCommand == editCommand2 ? " > " : "   ") + this.toStringForLog(editCommand2);
            }
        });
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toStringForLog(EditCommand editCommand) {
        if (editCommand instanceof CommitTextCommand) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) editCommand;
            sb2.append(commitTextCommand.getText().length());
            sb2.append(", newCursorPosition=");
            sb2.append(commitTextCommand.getNewCursorPosition());
            sb2.append(')');
            return sb2.toString();
        }
        if (editCommand instanceof SetComposingTextCommand) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("SetComposingTextCommand(text.length=");
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) editCommand;
            sb3.append(setComposingTextCommand.getText().length());
            sb3.append(", newCursorPosition=");
            sb3.append(setComposingTextCommand.getNewCursorPosition());
            sb3.append(')');
            return sb3.toString();
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
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Unknown EditCommand: ");
        String strMo20277f = AbstractC9983y.m20315b(editCommand.getClass()).mo20277f();
        if (strMo20277f == null) {
            strMo20277f = "{anonymous EditCommand}";
        }
        sb4.append(strMo20277f);
        return sb4.toString();
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
            long jM33127getSelectiond9O1mEE$ui_text_release = this.mBuffer.m33127getSelectiond9O1mEE$ui_text_release();
            TextRange textRangeM32954boximpl = TextRange.m32954boximpl(jM33127getSelectiond9O1mEE$ui_text_release);
            textRangeM32954boximpl.m32970unboximpl();
            TextRange textRange = TextRange.m32965getReversedimpl(this.mBufferState.m33214getSelectiond9O1mEE()) ? null : textRangeM32954boximpl;
            TextFieldValue textFieldValue = new TextFieldValue(annotatedString$ui_text_release, textRange != null ? textRange.m32970unboximpl() : TextRangeKt.TextRange(TextRange.m32963getMaximpl(jM33127getSelectiond9O1mEE$ui_text_release), TextRange.m32964getMinimpl(jM33127getSelectiond9O1mEE$ui_text_release)), this.mBuffer.m33126getCompositionMzsxiRA$ui_text_release(), (AbstractC9972n) null);
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
        boolean zM20289b = AbstractC9979u.m20289b(textFieldValue.m33213getCompositionMzsxiRA(), this.mBuffer.m33126getCompositionMzsxiRA$ui_text_release());
        boolean z10 = true;
        boolean z11 = false;
        if (!AbstractC9979u.m20289b(this.mBufferState.getAnnotatedString().getText(), textFieldValue.getAnnotatedString().getText())) {
            this.mBuffer = new EditingBuffer(textFieldValue.getAnnotatedString(), textFieldValue.m33214getSelectiond9O1mEE(), (AbstractC9972n) null);
        } else if (TextRange.m32959equalsimpl0(this.mBufferState.m33214getSelectiond9O1mEE(), textFieldValue.m33214getSelectiond9O1mEE())) {
            z10 = false;
        } else {
            this.mBuffer.setSelection$ui_text_release(TextRange.m32964getMinimpl(textFieldValue.m33214getSelectiond9O1mEE()), TextRange.m32963getMaximpl(textFieldValue.m33214getSelectiond9O1mEE()));
            z11 = true;
            z10 = false;
        }
        if (textFieldValue.m33213getCompositionMzsxiRA() == null) {
            this.mBuffer.commitComposition$ui_text_release();
        } else if (!TextRange.m32960getCollapsedimpl(textFieldValue.m33213getCompositionMzsxiRA().m32970unboximpl())) {
            this.mBuffer.setComposition$ui_text_release(TextRange.m32964getMinimpl(textFieldValue.m33213getCompositionMzsxiRA().m32970unboximpl()), TextRange.m32963getMaximpl(textFieldValue.m33213getCompositionMzsxiRA().m32970unboximpl()));
        }
        if (z10 || (!z11 && !zM20289b)) {
            this.mBuffer.commitComposition$ui_text_release();
            textFieldValue = TextFieldValue.m33209copy3r_uNRQ$default(textFieldValue, (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null);
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
