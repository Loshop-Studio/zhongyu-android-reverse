package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.focus.FocusEventModifierNode;
import androidx.compose.p013ui.focus.FocusState;
import androidx.compose.p013ui.node.DelegatableNode_androidKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m13558d2 = {"Landroidx/compose/foundation/text/handwriting/HandwritingHandlerNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "()V", "composeImm", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "getComposeImm", "()Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "composeImm$delegate", "Lkotlin/Lazy;", "focusState", "Landroidx/compose/ui/focus/FocusState;", "onFocusEvent", "", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
final class HandwritingHandlerNode extends Modifier.Node implements FocusEventModifierNode {

    /* renamed from: composeImm$delegate, reason: from kotlin metadata */
    private final Lazy composeImm = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ComposeInputMethodManager>() { // from class: androidx.compose.foundation.text.handwriting.HandwritingHandlerNode$composeImm$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ComposeInputMethodManager invoke() {
            return ComposeInputMethodManager_androidKt.ComposeInputMethodManager(DelegatableNode_androidKt.requireView(this.this$0));
        }
    });
    private FocusState focusState;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.handwriting.HandwritingHandlerNode$onFocusEvent$1", m13596f = "HandwritingHandler.android.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.foundation.text.handwriting.HandwritingHandlerNode$onFocusEvent$1 */
    public static final class C17051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C17051(Continuation<? super C17051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HandwritingHandlerNode.this.new C17051(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HandwritingHandlerNode.this.getComposeImm().acceptStylusHandwritingDelegation();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposeInputMethodManager getComposeImm() {
        return (ComposeInputMethodManager) this.composeImm.getValue();
    }

    @Override // androidx.compose.p013ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        if (Intrinsics.areEqual(this.focusState, focusState)) {
            return;
        }
        this.focusState = focusState;
        if (focusState.getHasFocus()) {
            BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C17051(null), 3, null);
        }
    }
}
