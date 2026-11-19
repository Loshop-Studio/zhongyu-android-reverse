package com.friday.document.view.viewer;

import com.friday.common.entity.FileEntity;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.AbstractC11109f;
import sd.AbstractC11164t1;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.viewer.TxtEditActivity$initData$4$1", m26211f = "TxtEditActivity.kt", m26212l = {150}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TxtEditActivity$initData$4$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7774c;

    /* renamed from: d */
    public final /* synthetic */ TxtEditActivity f7775d;

    /* renamed from: e */
    public final /* synthetic */ FileEntity f7776e;

    @InterfaceC11829d(m26210c = "com.friday.document.view.viewer.TxtEditActivity$initData$4$1$1", m26211f = "TxtEditActivity.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.viewer.TxtEditActivity$initData$4$1$1 */
    public static final class C61021 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7777c;

        /* renamed from: d */
        public final /* synthetic */ TxtEditActivity f7778d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61021(TxtEditActivity txtEditActivity, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f7778d = txtEditActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C61021(this.f7778d, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f7777c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            TxtEditActivity txtEditActivity = this.f7778d;
            if (txtEditActivity.f7761m) {
                TxtEditActivity.m6183U(txtEditActivity).f6321c.setText(this.f7778d.f7764p);
            } else {
                TxtEditActivity.m6183U(txtEditActivity).f6325g.setText(this.f7778d.f7764p);
            }
            this.f7778d.isShowLoading(false);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C61021) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TxtEditActivity$initData$4$1(TxtEditActivity txtEditActivity, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7775d = txtEditActivity;
        this.f7776e = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new TxtEditActivity$initData$4$1(this.f7775d, this.f7776e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7774c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            this.f7775d.f7764p = AbstractC11958b.m26590k(this.f7776e.getTxtFilePath(), null, false, 6, null);
            AbstractC11164t1 abstractC11164t1M24800c = C11157r0.m24800c();
            C61021 c61021 = new C61021(this.f7775d, null);
            this.f7774c = 1;
            if (AbstractC11109f.m24709g(abstractC11164t1M24800c, c61021, this) == objM25952f) {
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
        return ((TxtEditActivity$initData$4$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
