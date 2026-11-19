package androidx.compose.material3.internal;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.internal.DragGestureDetectorCopyKt", m26211f = "DragGestureDetectorCopy.kt", m26212l = {145, Opcodes.INVOKESPECIAL}, m26213m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE")
/* renamed from: androidx.compose.material3.internal.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 */
/* loaded from: classes2.dex */
public final class C2480x2966ccbb extends ContinuationImpl {
    float F$0;
    float F$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public C2480x2966ccbb(InterfaceC11588c<? super C2480x2966ccbb> interfaceC11588c) {
        super(interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorCopyKt.m29507awaitHorizontalPointerSlopOrCancellationgDDlDlE(null, 0L, 0, null, this);
    }
}
