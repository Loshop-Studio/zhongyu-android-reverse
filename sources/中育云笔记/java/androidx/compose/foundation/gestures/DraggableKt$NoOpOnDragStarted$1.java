package androidx.compose.foundation.gestures;

import androidx.compose.p014ui.geometry.Offset;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1", m26211f = "Draggable.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DraggableKt$NoOpOnDragStarted$1 extends SuspendLambda implements InterfaceC9545q {
    int label;

    public DraggableKt$NoOpOnDragStarted$1(InterfaceC11588c<? super DraggableKt$NoOpOnDragStarted$1> interfaceC11588c) {
        super(3, interfaceC11588c);
    }

    @Override // p181hd.InterfaceC9545q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m27187invoked4ec7I((InterfaceC11122i0) obj, ((Offset) obj2).m30647unboximpl(), (InterfaceC11588c) obj3);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m27187invoked4ec7I(InterfaceC11122i0 interfaceC11122i0, long j10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return new DraggableKt$NoOpOnDragStarted$1(interfaceC11588c).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        return C10786q.f26013a;
    }
}
