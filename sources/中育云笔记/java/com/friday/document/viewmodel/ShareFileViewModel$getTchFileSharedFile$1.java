package com.friday.document.viewmodel;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p330s2.InterfaceC11052b;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ShareFileViewModel$getTchFileSharedFile$1", m26211f = "ShareFileViewModel.kt", m26212l = {Opcodes.RETURN}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShareFileViewModel$getTchFileSharedFile$1 extends SuspendLambda implements InterfaceC9540l {

    /* renamed from: c */
    public int f8306c;

    /* renamed from: d */
    public final /* synthetic */ ShareFileViewModel f8307d;

    /* renamed from: e */
    public final /* synthetic */ long f8308e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareFileViewModel$getTchFileSharedFile$1(ShareFileViewModel shareFileViewModel, long j10, InterfaceC11588c interfaceC11588c) {
        super(1, interfaceC11588c);
        this.f8307d = shareFileViewModel;
        this.f8308e = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(InterfaceC11588c interfaceC11588c) {
        return new ShareFileViewModel$getTchFileSharedFile$1(this.f8307d, this.f8308e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f8306c;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return obj;
        }
        AbstractC9924b.m20071b(obj);
        InterfaceC11052b interfaceC11052b = this.f8307d.f8284e;
        long j10 = this.f8308e;
        this.f8306c = 1;
        Object objM24507f = interfaceC11052b.m24507f(j10, this);
        return objM24507f == objM25952f ? objM25952f : objM24507f;
    }

    @Override // p181hd.InterfaceC9540l
    public final Object invoke(InterfaceC11588c interfaceC11588c) {
        return ((ShareFileViewModel$getTchFileSharedFile$1) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
