package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.p014ui.platform.ClipEntry;
import androidx.compose.p014ui.platform.Clipboard;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.TextRangeKt;
import androidx.compose.p014ui.text.input.TextFieldValueKt;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1", m26211f = "TextFieldSelectionManager.kt", m26212l = {647}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TextFieldSelectionManager$paste$1 extends SuspendLambda implements InterfaceC9544p {
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$paste$1(TextFieldSelectionManager textFieldSelectionManager, InterfaceC11588c<? super TextFieldSelectionManager$paste$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new TextFieldSelectionManager$paste$1(this.this$0, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AnnotatedString annotatedString;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            Clipboard clipboard$foundation_release = this.this$0.getClipboard$foundation_release();
            if (clipboard$foundation_release != null) {
                this.label = 1;
                obj = clipboard$foundation_release.getClipEntry(this);
                if (obj == objM25952f) {
                    return objM25952f;
                }
            }
            return C10786q.f26013a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        ClipEntry clipEntry = (ClipEntry) obj;
        if (clipEntry != null && (annotatedString = ClipboardUtils_androidKt.readAnnotatedString(clipEntry)) != null) {
            AnnotatedString annotatedStringPlus = TextFieldValueKt.getTextBeforeSelection(this.this$0.getValue$foundation_release(), this.this$0.getValue$foundation_release().getText().length()).plus(annotatedString).plus(TextFieldValueKt.getTextAfterSelection(this.this$0.getValue$foundation_release(), this.this$0.getValue$foundation_release().getText().length()));
            int iM32964getMinimpl = TextRange.m32964getMinimpl(this.this$0.getValue$foundation_release().m33214getSelectiond9O1mEE()) + annotatedString.length();
            this.this$0.getOnValueChange$foundation_release().invoke(this.this$0.m28283createTextFieldValueFDrldGo(annotatedStringPlus, TextRangeKt.TextRange(iM32964getMinimpl, iM32964getMinimpl)));
            this.this$0.setHandleState(HandleState.None);
            UndoManager undoManager = this.this$0.getUndoManager();
            if (undoManager != null) {
                undoManager.forceNextSnapshot();
            }
            return C10786q.f26013a;
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((TextFieldSelectionManager$paste$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
