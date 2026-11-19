package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.p014ui.platform.ClipEntry;
import androidx.compose.p014ui.platform.Clipboard;
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

@InterfaceC11829d(m26210c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", m26211f = "TextFieldSelectionManager.kt", m26212l = {623}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TextFieldSelectionManager$copy$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ boolean $cancelSelection;
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$copy$1(TextFieldSelectionManager textFieldSelectionManager, boolean z10, InterfaceC11588c<? super TextFieldSelectionManager$copy$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = textFieldSelectionManager;
        this.$cancelSelection = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new TextFieldSelectionManager$copy$1(this.this$0, this.$cancelSelection, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            if (TextRange.m32960getCollapsedimpl(this.this$0.getValue$foundation_release().m33214getSelectiond9O1mEE())) {
                return C10786q.f26013a;
            }
            Clipboard clipboard$foundation_release = this.this$0.getClipboard$foundation_release();
            if (clipboard$foundation_release != null) {
                ClipEntry clipEntry = ClipboardUtils_androidKt.toClipEntry(TextFieldValueKt.getSelectedText(this.this$0.getValue$foundation_release()));
                this.label = 1;
                if (clipboard$foundation_release.setClipEntry(clipEntry, this) == objM25952f) {
                    return objM25952f;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        if (!this.$cancelSelection) {
            return C10786q.f26013a;
        }
        int iM32963getMaximpl = TextRange.m32963getMaximpl(this.this$0.getValue$foundation_release().m33214getSelectiond9O1mEE());
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        this.this$0.getOnValueChange$foundation_release().invoke(textFieldSelectionManager.m28283createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(iM32963getMaximpl, iM32963getMaximpl)));
        this.this$0.setHandleState(HandleState.None);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((TextFieldSelectionManager$copy$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
