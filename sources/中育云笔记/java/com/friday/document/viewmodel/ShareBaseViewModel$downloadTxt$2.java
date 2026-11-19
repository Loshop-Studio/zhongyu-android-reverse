package com.friday.document.viewmodel;

import com.alibaba.fastjson.asm.Opcodes;
import com.friday.common.entity.ShareCacheEntity;
import com.friday.common.helper.C5964d;
import com.friday.document.model.ShareFile;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p040c2.InterfaceC5250g2;
import p181hd.InterfaceC9544p;
import p215k2.AbstractC9803u;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ShareBaseViewModel$downloadTxt$2", m26211f = "ShareBaseViewModel.kt", m26212l = {Opcodes.IFNE}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShareBaseViewModel$downloadTxt$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8257c;

    /* renamed from: d */
    public final /* synthetic */ ShareFile f8258d;

    /* renamed from: e */
    public final /* synthetic */ ShareBaseViewModel f8259e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareBaseViewModel$downloadTxt$2(ShareFile shareFile, ShareBaseViewModel shareBaseViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8258d = shareFile;
        this.f8259e = shareBaseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ShareBaseViewModel$downloadTxt$2(this.f8258d, this.f8259e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f8257c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            C5964d.m5326h(C5964d.f6085d.m5337a(), this.f8258d.getFileUrl(), this.f8259e.f8198l + this.f8258d.getFileId() + ".txt", null, 4, null);
            InterfaceC5250g2 interfaceC5250g2 = this.f8259e.f8189c;
            String strM19814a = AbstractC9803u.m19814a();
            AbstractC9979u.m20293f(strM19814a, "get32UUID(...)");
            ShareCacheEntity shareCacheEntity = new ShareCacheEntity(strM19814a, this.f8258d.getFileId(), this.f8258d.getVersion(), this.f8259e.m6352J(), System.currentTimeMillis());
            this.f8257c = 1;
            if (interfaceC5250g2.mo2811g(shareCacheEntity, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ShareBaseViewModel$downloadTxt$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
