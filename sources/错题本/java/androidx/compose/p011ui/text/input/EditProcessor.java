package androidx.compose.p011ui.text.input;

import android.support.v4.media.AbstractC0037f;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.AnnotatedStringKt;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRangeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017R$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u001c8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m5110d2 = {"Landroidx/compose/ui/text/input/EditProcessor;", "", "<init>", "()V", "", "Landroidx/compose/ui/text/input/EditCommand;", "editCommands", "failedCommand", "", "generateBatchErrorMessage", "(Ljava/util/List;Landroidx/compose/ui/text/input/EditCommand;)Ljava/lang/String;", "toStringForLog", "(Landroidx/compose/ui/text/input/EditCommand;)Ljava/lang/String;", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/TextInputSession;", "textInputSession", "Ld6/s;", "reset", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextInputSession;)V", "apply", "(Ljava/util/List;)Landroidx/compose/ui/text/input/TextFieldValue;", "toTextFieldValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "<set-?>", "mBufferState", "Landroidx/compose/ui/text/input/TextFieldValue;", "getMBufferState$ui_text_release", "Landroidx/compose/ui/text/input/EditingBuffer;", "mBuffer", "Landroidx/compose/ui/text/input/EditingBuffer;", "getMBuffer$ui_text_release", "()Landroidx/compose/ui/text/input/EditingBuffer;", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nEditProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n34#2,6:173\n1#3:179\n*S KotlinDebug\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n*L\n104#1:173,6\n*E\n"})
/* loaded from: classes2.dex */
public final class EditProcessor {
    public static final int $stable = 8;

    @NotNull
    private TextFieldValue mBufferState = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), TextRange.INSTANCE.m12775getZerod9O1mEE(), (TextRange) null, (AbstractC5824e) null);

    @NotNull
    private EditingBuffer mBuffer = new EditingBuffer(this.mBufferState.getAnnotatedString(), this.mBufferState.getSelection(), (AbstractC5824e) null);

    private final String generateBatchErrorMessage(List<? extends EditCommand> editCommands, final EditCommand failedCommand) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.getLength$ui_text_release() + ", composition=" + this.mBuffer.m12930getCompositionMzsxiRA$ui_text_release() + ", selection=" + ((Object) TextRange.m12773toStringimpl(this.mBuffer.m12931getSelectiond9O1mEE$ui_text_release())) + "):");
        sb.append('\n');
        AbstractC5805t.m5233m0(editCommands, sb, SignParameters.NEW_LINE, new InterfaceC6471c() { // from class: androidx.compose.ui.text.input.EditProcessor$generateBatchErrorMessage$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public final CharSequence invoke(EditCommand editCommand) {
                StringBuilder sbM97v = AbstractC0037f.m97v(failedCommand == editCommand ? " > " : "   ");
                sbM97v.append(this.toStringForLog(editCommand));
                return sbM97v.toString();
            }
        }, 60);
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toStringForLog(EditCommand editCommand) {
        if (editCommand instanceof CommitTextCommand) {
            StringBuilder sb = new StringBuilder("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) editCommand;
            sb.append(commitTextCommand.getText().length());
            sb.append(", newCursorPosition=");
            sb.append(commitTextCommand.getNewCursorPosition());
            sb.append(')');
            return sb.toString();
        }
        if (editCommand instanceof SetComposingTextCommand) {
            StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text.length=");
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
        String strM5320e = AbstractC5832m.m5340a(editCommand.getClass()).m5320e();
        if (strM5320e == null) {
            strM5320e = "{anonymous EditCommand}";
        }
        return "Unknown EditCommand: ".concat(strM5320e);
    }

    @NotNull
    public final TextFieldValue apply(@NotNull List<? extends EditCommand> editCommands) {
        EditCommand editCommand;
        EditCommand editCommand2 = null;
        try {
            int size = editCommands.size();
            int i = 0;
            EditCommand editCommand3 = null;
            while (i < size) {
                try {
                    editCommand = editCommands.get(i);
                } catch (Exception e) {
                    e = e;
                    editCommand2 = editCommand3;
                }
                try {
                    editCommand.applyTo(this.mBuffer);
                    i++;
                    editCommand3 = editCommand;
                } catch (Exception e4) {
                    e = e4;
                    editCommand2 = editCommand;
                    throw new RuntimeException(generateBatchErrorMessage(editCommands, editCommand2), e);
                }
            }
            AnnotatedString annotatedString$ui_text_release = this.mBuffer.toAnnotatedString$ui_text_release();
            long jM12931getSelectiond9O1mEE$ui_text_release = this.mBuffer.m12931getSelectiond9O1mEE$ui_text_release();
            TextRange textRangeM12758boximpl = TextRange.m12758boximpl(jM12931getSelectiond9O1mEE$ui_text_release);
            textRangeM12758boximpl.getPackedValue();
            TextRange textRange = TextRange.m12769getReversedimpl(this.mBufferState.getSelection()) ? null : textRangeM12758boximpl;
            TextFieldValue textFieldValue = new TextFieldValue(annotatedString$ui_text_release, textRange != null ? textRange.getPackedValue() : TextRangeKt.TextRange(TextRange.m12767getMaximpl(jM12931getSelectiond9O1mEE$ui_text_release), TextRange.m12768getMinimpl(jM12931getSelectiond9O1mEE$ui_text_release)), this.mBuffer.m12930getCompositionMzsxiRA$ui_text_release(), (AbstractC5824e) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (Exception e8) {
            e = e8;
        }
    }

    @NotNull
    /* renamed from: getMBuffer$ui_text_release, reason: from getter */
    public final EditingBuffer getMBuffer() {
        return this.mBuffer;
    }

    @NotNull
    /* renamed from: getMBufferState$ui_text_release, reason: from getter */
    public final TextFieldValue getMBufferState() {
        return this.mBufferState;
    }

    public final void reset(@NotNull TextFieldValue value, @Nullable TextInputSession textInputSession) {
        boolean zM5325b = AbstractC5830k.m5325b(value.getComposition(), this.mBuffer.m12930getCompositionMzsxiRA$ui_text_release());
        boolean z8 = true;
        boolean z9 = false;
        if (!AbstractC5830k.m5325b(this.mBufferState.getAnnotatedString().getText(), value.getAnnotatedString().getText())) {
            this.mBuffer = new EditingBuffer(value.getAnnotatedString(), value.getSelection(), (AbstractC5824e) null);
        } else if (TextRange.m12763equalsimpl0(this.mBufferState.getSelection(), value.getSelection())) {
            z8 = false;
        } else {
            this.mBuffer.setSelection$ui_text_release(TextRange.m12768getMinimpl(value.getSelection()), TextRange.m12767getMaximpl(value.getSelection()));
            z9 = true;
            z8 = false;
        }
        if (value.getComposition() == null) {
            this.mBuffer.commitComposition$ui_text_release();
        } else if (!TextRange.m12764getCollapsedimpl(value.getComposition().getPackedValue())) {
            this.mBuffer.setComposition$ui_text_release(TextRange.m12768getMinimpl(value.getComposition().getPackedValue()), TextRange.m12767getMaximpl(value.getComposition().getPackedValue()));
        }
        if (z8 || (!z9 && !zM5325b)) {
            this.mBuffer.commitComposition$ui_text_release();
            value = TextFieldValue.m13013copy3r_uNRQ$default(value, (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null);
        }
        TextFieldValue textFieldValue = this.mBufferState;
        this.mBufferState = value;
        if (textInputSession != null) {
            textInputSession.updateState(textFieldValue, value);
        }
    }

    @NotNull
    public final TextFieldValue toTextFieldValue() {
        return this.mBufferState;
    }
}
