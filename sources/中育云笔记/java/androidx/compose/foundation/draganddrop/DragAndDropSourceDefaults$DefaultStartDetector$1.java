package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p014ui.geometry.Offset;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1", m26211f = "AndroidDragAndDropSource.android.kt", m26212l = {33}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DragAndDropSourceDefaults$DefaultStartDetector$1 extends SuspendLambda implements InterfaceC9544p {
    private /* synthetic */ Object L$0;
    int label;

    public DragAndDropSourceDefaults$DefaultStartDetector$1(InterfaceC11588c<? super DragAndDropSourceDefaults$DefaultStartDetector$1> interfaceC11588c) {
        super(2, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        DragAndDropSourceDefaults$DefaultStartDetector$1 dragAndDropSourceDefaults$DefaultStartDetector$1 = new DragAndDropSourceDefaults$DefaultStartDetector$1(interfaceC11588c);
        dragAndDropSourceDefaults$DefaultStartDetector$1.L$0 = obj;
        return dragAndDropSourceDefaults$DefaultStartDetector$1;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(DragAndDropStartDetectorScope dragAndDropStartDetectorScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((DragAndDropSourceDefaults$DefaultStartDetector$1) create(dragAndDropStartDetectorScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            final DragAndDropStartDetectorScope dragAndDropStartDetectorScope = (DragAndDropStartDetectorScope) this.L$0;
            InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1.1
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m27086invokek4lQ0M(((Offset) obj2).m30647unboximpl());
                    return C10786q.f26013a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m27086invokek4lQ0M(long j10) {
                    dragAndDropStartDetectorScope.mo27091requestDragAndDropTransferk4lQ0M(j10);
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(dragAndDropStartDetectorScope, null, interfaceC9540l, null, null, this, 13, null) == objM25952f) {
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
