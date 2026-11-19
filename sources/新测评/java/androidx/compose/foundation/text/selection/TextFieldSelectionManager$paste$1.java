package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.p013ui.platform.ClipEntry;
import androidx.compose.p013ui.platform.Clipboard;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.p013ui.text.input.TextFieldValueKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1", m13596f = "TextFieldSelectionManager.kt", m13597i = {}, m13598l = {647}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes.dex */
public final class TextFieldSelectionManager$paste$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$paste$1(TextFieldSelectionManager textFieldSelectionManager, Continuation<? super TextFieldSelectionManager$paste$1> continuation) {
        super(2, continuation);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TextFieldSelectionManager$paste$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnnotatedString annotatedString;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Clipboard clipboard = this.this$0.getClipboard();
            if (clipboard != null) {
                this.label = 1;
                obj = clipboard.getClipEntry(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ClipEntry clipEntry = (ClipEntry) obj;
        if (clipEntry != null && (annotatedString = ClipboardUtils_androidKt.readAnnotatedString(clipEntry)) != null) {
            AnnotatedString annotatedStringPlus = TextFieldValueKt.getTextBeforeSelection(this.this$0.getValue$foundation_release(), this.this$0.getValue$foundation_release().getText().length()).plus(annotatedString).plus(TextFieldValueKt.getTextAfterSelection(this.this$0.getValue$foundation_release(), this.this$0.getValue$foundation_release().getText().length()));
            int iM23025getMinimpl = TextRange.m23025getMinimpl(this.this$0.getValue$foundation_release().getSelection()) + annotatedString.length();
            this.this$0.getOnValueChange$foundation_release().invoke(this.this$0.m18453createTextFieldValueFDrldGo(annotatedStringPlus, TextRangeKt.TextRange(iM23025getMinimpl, iM23025getMinimpl)));
            this.this$0.setHandleState(HandleState.None);
            UndoManager undoManager = this.this$0.getUndoManager();
            if (undoManager != null) {
                undoManager.forceNextSnapshot();
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TextFieldSelectionManager$paste$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
