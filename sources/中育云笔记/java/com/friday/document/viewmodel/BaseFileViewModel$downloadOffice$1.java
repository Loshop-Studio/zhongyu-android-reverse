package com.friday.document.viewmodel;

import com.friday.common.entity.FileEntity;
import com.friday.document.service.FileManager;
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

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel$downloadOffice$1", m26211f = "BaseFileViewModel.kt", m26212l = {493}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseFileViewModel$downloadOffice$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7889c;

    /* renamed from: d */
    public final /* synthetic */ BaseFileViewModel f7890d;

    /* renamed from: e */
    public final /* synthetic */ FileEntity f7891e;

    @InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel$downloadOffice$1$1", m26211f = "BaseFileViewModel.kt", m26212l = {494}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.viewmodel.BaseFileViewModel$downloadOffice$1$1 */
    public static final class C61101 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7892c;

        /* renamed from: d */
        public final /* synthetic */ BaseFileViewModel f7893d;

        /* renamed from: e */
        public final /* synthetic */ FileEntity f7894e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61101(BaseFileViewModel baseFileViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f7893d = baseFileViewModel;
            this.f7894e = fileEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C61101(this.f7893d, this.f7894e, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7892c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                FileManager fileManagerM6230N = this.f7893d.m6230N();
                FileEntity fileEntity = this.f7894e;
                this.f7892c = 1;
                if (fileManagerM6230N.mo5612e(fileEntity, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            this.f7893d.m6226J().postValue(this.f7894e);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C61101) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileViewModel$downloadOffice$1(BaseFileViewModel baseFileViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7890d = baseFileViewModel;
        this.f7891e = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BaseFileViewModel$downloadOffice$1(this.f7890d, this.f7891e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7889c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            AbstractC11106e0 abstractC11106e0M24799b = C11157r0.m24799b();
            C61101 c61101 = new C61101(this.f7890d, this.f7891e, null);
            this.f7889c = 1;
            if (AbstractC11109f.m24709g(abstractC11106e0M24799b, c61101, this) == objM25952f) {
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
        return ((BaseFileViewModel$downloadOffice$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
