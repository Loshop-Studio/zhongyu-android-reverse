package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p011ui.geometry.Offset;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropStartDetectorScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/draganddrop/DragAndDropStartDetectorScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1", m5303f = "AndroidDragAndDropSource.android.kt", m5304i = {}, m5305l = {33}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class DragAndDropSourceDefaults$DefaultStartDetector$1 extends SuspendLambda implements InterfaceC6473e {
    private /* synthetic */ Object L$0;
    int label;

    public DragAndDropSourceDefaults$DefaultStartDetector$1(InterfaceC5631c<? super DragAndDropSourceDefaults$DefaultStartDetector$1> interfaceC5631c) {
        super(2, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        DragAndDropSourceDefaults$DefaultStartDetector$1 dragAndDropSourceDefaults$DefaultStartDetector$1 = new DragAndDropSourceDefaults$DefaultStartDetector$1(interfaceC5631c);
        dragAndDropSourceDefaults$DefaultStartDetector$1.L$0 = obj;
        return dragAndDropSourceDefaults$DefaultStartDetector$1;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(DragAndDropStartDetectorScope dragAndDropStartDetectorScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((DragAndDropSourceDefaults$DefaultStartDetector$1) create(dragAndDropStartDetectorScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            final DragAndDropStartDetectorScope dragAndDropStartDetectorScope = (DragAndDropStartDetectorScope) this.L$0;
            InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1.1
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m6890invokek4lQ0M(((Offset) obj2).m10451unboximpl());
                    return C5443s.f8405a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m6890invokek4lQ0M(long j7) {
                    dragAndDropStartDetectorScope.mo6895requestDragAndDropTransferk4lQ0M(j7);
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(dragAndDropStartDetectorScope, null, interfaceC6471c, null, null, this, 13, null) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        return C5443s.f8405a;
    }
}
