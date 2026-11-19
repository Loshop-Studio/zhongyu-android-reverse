package androidx.compose.foundation.gestures;

import androidx.compose.p014ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p014ui.input.pointer.PointerInputChange;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", m26211f = "DragGestureDetector.kt", m26212l = {971, 993}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends RestrictedSuspendLambda implements InterfaceC9544p {
    final /* synthetic */ Ref$ObjectRef<PointerInputChange> $currentDown;
    final /* synthetic */ Ref$BooleanRef $deepPress;
    final /* synthetic */ Ref$ObjectRef<PointerInputChange> $longPress;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef<PointerInputChange> ref$ObjectRef, Ref$ObjectRef<PointerInputChange> ref$ObjectRef2, InterfaceC11588c<? super DragGestureDetectorKt$awaitLongPressOrCancellation$2> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$deepPress = ref$BooleanRef;
        this.$currentDown = ref$ObjectRef;
        this.$longPress = ref$ObjectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.$deepPress, this.$currentDown, this.$longPress, interfaceC11588c);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.L$0 = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        r2 = r6 ? 1 : 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[EDGE_INSN: B:68:0x00e2->B:44:0x00e2 BREAK  A[LOOP:0: B:39:0x00cf->B:43:0x00df], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00be -> B:38:0x00c1). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
