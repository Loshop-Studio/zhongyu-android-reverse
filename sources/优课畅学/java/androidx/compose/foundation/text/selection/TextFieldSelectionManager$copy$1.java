package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.p013ui.platform.ClipEntry;
import androidx.compose.p013ui.platform.Clipboard;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.p013ui.text.input.TextFieldValueKt;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", m17801f = "TextFieldSelectionManager.kt", m17802l = {623}, m17803m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TextFieldSelectionManager$copy$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ boolean $cancelSelection;
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$copy$1(TextFieldSelectionManager textFieldSelectionManager, boolean z10, InterfaceC9324c<? super TextFieldSelectionManager$copy$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = textFieldSelectionManager;
        this.$cancelSelection = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new TextFieldSelectionManager$copy$1(this.this$0, this.$cancelSelection, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((TextFieldSelectionManager$copy$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            if (TextRange.m26358getCollapsedimpl(this.this$0.getValue$foundation_release().m26612getSelectiond9O1mEE())) {
                return C8736p.f16368a;
            }
            Clipboard clipboard$foundation_release = this.this$0.getClipboard$foundation_release();
            if (clipboard$foundation_release != null) {
                ClipEntry clipEntry = ClipboardUtils_androidKt.toClipEntry(TextFieldValueKt.getSelectedText(this.this$0.getValue$foundation_release()));
                this.label = 1;
                if (clipboard$foundation_release.setClipEntry(clipEntry, this) == objM17291f) {
                    return objM17291f;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        if (!this.$cancelSelection) {
            return C8736p.f16368a;
        }
        int iM26361getMaximpl = TextRange.m26361getMaximpl(this.this$0.getValue$foundation_release().m26612getSelectiond9O1mEE());
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        this.this$0.getOnValueChange$foundation_release().invoke(textFieldSelectionManager.m21681createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(iM26361getMaximpl, iM26361getMaximpl)));
        this.this$0.setHandleState(HandleState.None);
        return C8736p.f16368a;
    }
}
