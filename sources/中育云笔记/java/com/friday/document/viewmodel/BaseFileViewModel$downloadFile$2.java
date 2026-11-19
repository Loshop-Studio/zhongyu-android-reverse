package com.friday.document.viewmodel;

import com.blankj.utilcode.util.LogUtils;
import com.friday.document.R$string;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel$downloadFile$2", m26211f = "BaseFileViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseFileViewModel$downloadFile$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7878c;

    /* renamed from: d */
    public /* synthetic */ Object f7879d;

    /* renamed from: e */
    public final /* synthetic */ BaseFileViewModel f7880e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileViewModel$downloadFile$2(BaseFileViewModel baseFileViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7880e = baseFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        BaseFileViewModel$downloadFile$2 baseFileViewModel$downloadFile$2 = new BaseFileViewModel$downloadFile$2(this.f7880e, interfaceC11588c);
        baseFileViewModel$downloadFile$2.f7879d = obj;
        return baseFileViewModel$downloadFile$2;
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Throwable th, InterfaceC11588c interfaceC11588c) {
        return ((BaseFileViewModel$downloadFile$2) create(th, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th = (Throwable) this.f7879d;
        AbstractC11725a.m25952f();
        if (this.f7878c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        LogUtils.m3886d("笔记下载失败," + th.getMessage());
        AbstractC11958b.m26587h(R$string.download_error);
        th.printStackTrace();
        this.f7880e.m6247e0().setValue(null);
        return C10786q.f26013a;
    }
}
