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

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ShareFileViewModel$getShareList$1", m26211f = "ShareFileViewModel.kt", m26212l = {Opcodes.IFNE}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShareFileViewModel$getShareList$1 extends SuspendLambda implements InterfaceC9540l {

    /* renamed from: c */
    public int f8304c;

    /* renamed from: d */
    public final /* synthetic */ ShareFileViewModel f8305d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareFileViewModel$getShareList$1(ShareFileViewModel shareFileViewModel, InterfaceC11588c interfaceC11588c) {
        super(1, interfaceC11588c);
        this.f8305d = shareFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(InterfaceC11588c interfaceC11588c) {
        return new ShareFileViewModel$getShareList$1(this.f8305d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f8304c;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return obj;
        }
        AbstractC9924b.m20071b(obj);
        InterfaceC11052b interfaceC11052b = this.f8305d.f8284e;
        this.f8304c = 1;
        Object objM24501g = InterfaceC11052b.m24501g(interfaceC11052b, null, this, 1, null);
        return objM24501g == objM25952f ? objM25952f : objM24501g;
    }

    @Override // p181hd.InterfaceC9540l
    public final Object invoke(InterfaceC11588c interfaceC11588c) {
        return ((ShareFileViewModel$getShareList$1) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
