package com.friday.document.viewmodel;

import com.blankj.utilcode.util.LogUtils;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.NewestViewModel$clearSingleNoteCache$2", m26211f = "NewestViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NewestViewModel$clearSingleNoteCache$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8095c;

    /* renamed from: d */
    public /* synthetic */ Object f8096d;

    public NewestViewModel$clearSingleNoteCache$2(InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        NewestViewModel$clearSingleNoteCache$2 newestViewModel$clearSingleNoteCache$2 = new NewestViewModel$clearSingleNoteCache$2(interfaceC11588c);
        newestViewModel$clearSingleNoteCache$2.f8096d = obj;
        return newestViewModel$clearSingleNoteCache$2;
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Throwable th, InterfaceC11588c interfaceC11588c) {
        return ((NewestViewModel$clearSingleNoteCache$2) create(th, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th = (Throwable) this.f8096d;
        AbstractC11725a.m25952f();
        if (this.f8095c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        LogUtils.m3887e("清除笔记缓存失败: " + th.getMessage());
        AbstractC11958b.m26588i("清除失败，请重试");
        return C10786q.f26013a;
    }
}
