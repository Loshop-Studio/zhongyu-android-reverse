package androidx.compose.material3;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$1$1", m26211f = "ModalBottomSheet.kt", m26212l = {415}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ModalBottomSheetKt$Scrim$dismissSheet$1$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ InterfaceC9529a $onDismissRequest;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$Scrim$dismissSheet$1$1(InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super ModalBottomSheetKt$Scrim$dismissSheet$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$onDismissRequest = interfaceC9529a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        ModalBottomSheetKt$Scrim$dismissSheet$1$1 modalBottomSheetKt$Scrim$dismissSheet$1$1 = new ModalBottomSheetKt$Scrim$dismissSheet$1$1(this.$onDismissRequest, interfaceC11588c);
        modalBottomSheetKt$Scrim$dismissSheet$1$1.L$0 = obj;
        return modalBottomSheetKt$Scrim$dismissSheet$1$1;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((ModalBottomSheetKt$Scrim$dismissSheet$1$1) create(pointerInputScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final InterfaceC9529a interfaceC9529a = this.$onDismissRequest;
            InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$1$1.1
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m28845invokek4lQ0M(((Offset) obj2).m30647unboximpl());
                    return C10786q.f26013a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m28845invokek4lQ0M(long j10) {
                    interfaceC9529a.invoke();
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, interfaceC9540l, this, 7, null) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }
}
