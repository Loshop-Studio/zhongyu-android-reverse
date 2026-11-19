package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.p013ui.platform.ClipEntry;
import androidx.compose.p013ui.platform.Clipboard;
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
@DebugMetadata(m13595c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", m13596f = "TextFieldSelectionManager.kt", m13597i = {}, m13598l = {623}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes.dex */
public final class TextFieldSelectionManager$copy$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $cancelSelection;
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$copy$1(TextFieldSelectionManager textFieldSelectionManager, boolean z9, Continuation<? super TextFieldSelectionManager$copy$1> continuation) {
        super(2, continuation);
        this.this$0 = textFieldSelectionManager;
        this.$cancelSelection = z9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TextFieldSelectionManager$copy$1(this.this$0, this.$cancelSelection, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            if (TextRange.m23021getCollapsedimpl(this.this$0.getValue$foundation_release().getSelection())) {
                return Unit.INSTANCE;
            }
            Clipboard clipboard = this.this$0.getClipboard();
            if (clipboard != null) {
                ClipEntry clipEntry = ClipboardUtils_androidKt.toClipEntry(TextFieldValueKt.getSelectedText(this.this$0.getValue$foundation_release()));
                this.label = 1;
                if (clipboard.setClipEntry(clipEntry, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!this.$cancelSelection) {
            return Unit.INSTANCE;
        }
        int iM23024getMaximpl = TextRange.m23024getMaximpl(this.this$0.getValue$foundation_release().getSelection());
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        this.this$0.getOnValueChange$foundation_release().invoke(textFieldSelectionManager.m18453createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation_release().getText(), TextRangeKt.TextRange(iM23024getMaximpl, iM23024getMaximpl)));
        this.this$0.setHandleState(HandleState.None);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TextFieldSelectionManager$copy$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
