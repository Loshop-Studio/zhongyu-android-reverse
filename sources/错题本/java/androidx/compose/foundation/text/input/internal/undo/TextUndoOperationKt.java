package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.p011ui.text.TextRange;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m5110d2 = {"Landroidx/compose/foundation/text/input/TextFieldState;", "Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "op", "Ld6/s;", "undo", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;)V", "redo", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextUndoOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoOperation.kt\nandroidx/compose/foundation/text/input/internal/undo/TextUndoOperationKt\n+ 2 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,171:1\n281#2,11:172\n281#2,11:183\n*S KotlinDebug\n*F\n+ 1 TextUndoOperation.kt\nandroidx/compose/foundation/text/input/internal/undo/TextUndoOperationKt\n*L\n114#1:172,11\n122#1:183,11\n*E\n"})
/* loaded from: classes.dex */
public final class TextUndoOperationKt {
    public static final void redo(@NotNull TextFieldState textFieldState, @NotNull TextUndoOperation textUndoOperation) {
        textFieldState.getMainBuffer().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.replace(textUndoOperation.getIndex(), textUndoOperation.getPreText().length() + textUndoOperation.getIndex(), textUndoOperation.getPostText());
        TextFieldBufferKt.setSelectionCoerced(mainBuffer, TextRange.m12770getStartimpl(textUndoOperation.getPostSelection()), TextRange.m12765getEndimpl(textUndoOperation.getPostSelection()));
        textFieldState.updateValueAndNotifyListeners(textFieldState.getValue$foundation_release(), TextFieldBuffer.m7740toTextFieldCharSequenceI88jaVs$foundation_release$default(textFieldState.getMainBuffer(), 0L, null, null, 7, null), true);
    }

    public static final void undo(@NotNull TextFieldState textFieldState, @NotNull TextUndoOperation textUndoOperation) {
        textFieldState.getMainBuffer().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.replace(textUndoOperation.getIndex(), textUndoOperation.getPostText().length() + textUndoOperation.getIndex(), textUndoOperation.getPreText());
        TextFieldBufferKt.setSelectionCoerced(mainBuffer, TextRange.m12770getStartimpl(textUndoOperation.getPreSelection()), TextRange.m12765getEndimpl(textUndoOperation.getPreSelection()));
        textFieldState.updateValueAndNotifyListeners(textFieldState.getValue$foundation_release(), TextFieldBuffer.m7740toTextFieldCharSequenceI88jaVs$foundation_release$default(textFieldState.getMainBuffer(), 0L, null, null, 7, null), true);
    }
}
