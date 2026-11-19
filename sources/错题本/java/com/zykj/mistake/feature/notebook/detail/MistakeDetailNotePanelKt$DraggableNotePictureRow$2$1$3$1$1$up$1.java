package com.zykj.mistake.feature.notebook.detail;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m5110d2 = {"<anonymous>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1$up$1", m5303f = "MistakeDetailNotePanel.kt", m5304i = {0}, m5305l = {ComposerKt.reuseKey}, m5306m = "invokeSuspend", m5307n = {"$this$withTimeoutOrNull"}, m5308s = {"L$0"})
/* loaded from: classes3.dex */
public final class MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1$up$1 extends RestrictedSuspendLambda implements InterfaceC6473e {
    private /* synthetic */ Object L$0;
    int label;

    public MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1$up$1(InterfaceC5631c<? super MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1$up$1> interfaceC5631c) {
        super(2, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1$up$1 mistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1$up$1 = new MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1$up$1(interfaceC5631c);
        mistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1$up$1.L$0 = obj;
        return mistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1$up$1;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super PointerInputChange> interfaceC5631c) {
        return ((MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1$up$1) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            return obj;
        }
        AbstractC5774b.m5119b(obj);
        this.L$0 = null;
        this.label = 1;
        Object objWaitForUpOrCancellation$default = TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null);
        return objWaitForUpOrCancellation$default == coroutineSingletons ? coroutineSingletons : objWaitForUpOrCancellation$default;
    }
}
