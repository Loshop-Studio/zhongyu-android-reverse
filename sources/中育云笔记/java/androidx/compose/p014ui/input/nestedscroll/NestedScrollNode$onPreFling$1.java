package androidx.compose.p014ui.input.nestedscroll;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", m26211f = "NestedScrollNode.kt", m26212l = {Opcodes.IADD, 97}, m26213m = "onPreFling-QWom1Mo")
/* loaded from: classes2.dex */
public final class NestedScrollNode$onPreFling$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$onPreFling$1(NestedScrollNode nestedScrollNode, InterfaceC11588c<? super NestedScrollNode$onPreFling$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = nestedScrollNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo27535onPreFlingQWom1Mo(0L, this);
    }
}
