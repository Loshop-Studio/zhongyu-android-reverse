package com.zykj.cloudhelper.viewmodel;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.cloudhelper.viewmodel.PickNoteViewModel$createFolder$2", m26211f = "PickNoteViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class PickNoteViewModel$createFolder$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f19550c;

    /* renamed from: d */
    public final /* synthetic */ PickNoteViewModel f19551d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickNoteViewModel$createFolder$2(PickNoteViewModel pickNoteViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f19551d = pickNoteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new PickNoteViewModel$createFolder$2(this.f19551d, interfaceC11588c);
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Throwable th, InterfaceC11588c interfaceC11588c) {
        return ((PickNoteViewModel$createFolder$2) create(th, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f19550c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        this.f19551d.m16488q().setValue(null);
        AbstractC11958b.m26588i("新建文件夹失败");
        return C10786q.f26013a;
    }
}
