package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.geometry.Offset;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1", m17801f = "Draggable.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DraggableKt$NoOpOnDragStarted$1 extends SuspendLambda implements InterfaceC10575q {
    int label;

    public DraggableKt$NoOpOnDragStarted$1(InterfaceC9324c<? super DraggableKt$NoOpOnDragStarted$1> interfaceC9324c) {
        super(3, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10575q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m20585invoked4ec7I((InterfaceC8822b0) obj, ((Offset) obj2).m24045unboximpl(), (InterfaceC9324c) obj3);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m20585invoked4ec7I(InterfaceC8822b0 interfaceC8822b0, long j10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return new DraggableKt$NoOpOnDragStarted$1(interfaceC9324c).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        return C8736p.f16368a;
    }
}
