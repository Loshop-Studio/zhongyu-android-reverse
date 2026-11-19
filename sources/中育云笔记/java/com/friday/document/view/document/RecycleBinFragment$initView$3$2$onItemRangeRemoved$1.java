package com.friday.document.view.document;

import com.friday.document.adapter.MultiModeFileEntity;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.AbstractC11109f;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.document.RecycleBinFragment$initView$3$2$onItemRangeRemoved$1", m26211f = "RecycleBinFragment.kt", m26212l = {129}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RecycleBinFragment$initView$3$2$onItemRangeRemoved$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7425c;

    /* renamed from: d */
    public final /* synthetic */ RecycleBinFragment f7426d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecycleBinFragment$initView$3$2$onItemRangeRemoved$1(RecycleBinFragment recycleBinFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7426d = recycleBinFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new RecycleBinFragment$initView$3$2$onItemRangeRemoved$1(this.f7426d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7425c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            AbstractC11106e0 abstractC11106e0M24799b = C11157r0.m24799b();
            RecycleBinFragment$initView$3$2$onItemRangeRemoved$1$find$1 recycleBinFragment$initView$3$2$onItemRangeRemoved$1$find$1 = new RecycleBinFragment$initView$3$2$onItemRangeRemoved$1$find$1(this.f7426d, null);
            this.f7425c = 1;
            obj = AbstractC11109f.m24709g(abstractC11106e0M24799b, recycleBinFragment$initView$3$2$onItemRangeRemoved$1$find$1, this);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        if (((MultiModeFileEntity) obj) == null) {
            this.f7426d.m5826y();
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((RecycleBinFragment$initView$3$2$onItemRangeRemoved$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
