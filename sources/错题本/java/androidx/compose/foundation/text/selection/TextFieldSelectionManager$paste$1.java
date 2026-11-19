package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.p011ui.platform.ClipEntry;
import androidx.compose.p011ui.platform.Clipboard;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRangeKt;
import androidx.compose.p011ui.text.input.TextFieldValueKt;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1", m5303f = "TextFieldSelectionManager.kt", m5304i = {}, m5305l = {647}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class TextFieldSelectionManager$paste$1 extends SuspendLambda implements InterfaceC6473e {
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$paste$1(TextFieldSelectionManager textFieldSelectionManager, InterfaceC5631c<? super TextFieldSelectionManager$paste$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new TextFieldSelectionManager$paste$1(this.this$0, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnnotatedString annotatedString;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5443s c5443s = C5443s.f8405a;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            Clipboard clipboard = this.this$0.getClipboard();
            if (clipboard != null) {
                this.label = 1;
                obj = clipboard.getClipEntry(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return c5443s;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        ClipEntry clipEntry = (ClipEntry) obj;
        if (clipEntry != null && (annotatedString = ClipboardUtils_androidKt.readAnnotatedString(clipEntry)) != null) {
            AnnotatedString annotatedStringPlus = TextFieldValueKt.getTextBeforeSelection(this.this$0.getValue$foundation_release(), this.this$0.getValue$foundation_release().getText().length()).plus(annotatedString).plus(TextFieldValueKt.getTextAfterSelection(this.this$0.getValue$foundation_release(), this.this$0.getValue$foundation_release().getText().length()));
            int length = annotatedString.length() + TextRange.m12768getMinimpl(this.this$0.getValue$foundation_release().getSelection());
            this.this$0.getOnValueChange().invoke(this.this$0.m8087createTextFieldValueFDrldGo(annotatedStringPlus, TextRangeKt.TextRange(length, length)));
            this.this$0.setHandleState(HandleState.None);
            UndoManager undoManager = this.this$0.getUndoManager();
            if (undoManager != null) {
                undoManager.forceNextSnapshot();
            }
        }
        return c5443s;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((TextFieldSelectionManager$paste$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
