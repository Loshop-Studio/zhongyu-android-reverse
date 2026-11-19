package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.p011ui.platform.ClipEntry;
import androidx.compose.p011ui.platform.Clipboard;
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
@DebugMetadata(m5302c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", m5303f = "TextFieldSelectionManager.kt", m5304i = {}, m5305l = {623}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class TextFieldSelectionManager$copy$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ boolean $cancelSelection;
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$copy$1(TextFieldSelectionManager textFieldSelectionManager, boolean z8, InterfaceC5631c<? super TextFieldSelectionManager$copy$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = textFieldSelectionManager;
        this.$cancelSelection = z8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new TextFieldSelectionManager$copy$1(this.this$0, this.$cancelSelection, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5443s c5443s = C5443s.f8405a;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            if (TextRange.m12764getCollapsedimpl(this.this$0.getValue$foundation_release().getSelection())) {
                return c5443s;
            }
            Clipboard clipboard = this.this$0.getClipboard();
            if (clipboard != null) {
                ClipEntry clipEntry = ClipboardUtils_androidKt.toClipEntry(TextFieldValueKt.getSelectedText(this.this$0.getValue$foundation_release()));
                this.label = 1;
                if (clipboard.setClipEntry(clipEntry, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        if (!this.$cancelSelection) {
            return c5443s;
        }
        int iM12767getMaximpl = TextRange.m12767getMaximpl(this.this$0.getValue$foundation_release().getSelection());
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        this.this$0.getOnValueChange().invoke(textFieldSelectionManager.m8087createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(iM12767getMaximpl, iM12767getMaximpl)));
        this.this$0.setHandleState(HandleState.None);
        return c5443s;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((TextFieldSelectionManager$copy$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
