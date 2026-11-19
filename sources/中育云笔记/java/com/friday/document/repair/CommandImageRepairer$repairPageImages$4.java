package com.friday.document.repair;

import com.blankj.utilcode.util.ToastUtils;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.repair.CommandImageRepairer$repairPageImages$4", m26211f = "CommandImageRepairer.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class CommandImageRepairer$repairPageImages$4 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f6703c;

    /* renamed from: d */
    public final /* synthetic */ Ref$IntRef f6704d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommandImageRepairer$repairPageImages$4(Ref$IntRef ref$IntRef, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f6704d = ref$IntRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new CommandImageRepairer$repairPageImages$4(this.f6704d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f6703c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        ToastUtils.showLong("已成功恢复 " + this.f6704d.f23400c + " 张图片，重新进入页面即可查看", new Object[0]);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((CommandImageRepairer$repairPageImages$4) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
