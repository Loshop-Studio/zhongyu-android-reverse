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

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel$downloadCover$1", m26211f = "BaseFileViewModel.kt", m26212l = {531}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseFileViewModel$downloadCover$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7866c;

    /* renamed from: d */
    public final /* synthetic */ BaseFileViewModel f7867d;

    /* renamed from: e */
    public final /* synthetic */ FileEntity f7868e;

    @InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel$downloadCover$1$1", m26211f = "BaseFileViewModel.kt", m26212l = {532}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.viewmodel.BaseFileViewModel$downloadCover$1$1 */
    public static final class C61081 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7869c;

        /* renamed from: d */
        public final /* synthetic */ BaseFileViewModel f7870d;

        /* renamed from: e */
        public final /* synthetic */ FileEntity f7871e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61081(BaseFileViewModel baseFileViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f7870d = baseFileViewModel;
            this.f7871e = fileEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C61081(this.f7870d, this.f7871e, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7869c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                FileManager fileManagerM6230N = this.f7870d.m6230N();
                FileEntity fileEntity = this.f7871e;
                this.f7869c = 1;
                if (fileManagerM6230N.m5616u(fileEntity, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            this.f7870d.m6266u0(this.f7871e);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C61081) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileViewModel$downloadCover$1(BaseFileViewModel baseFileViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7867d = baseFileViewModel;
        this.f7868e = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BaseFileViewModel$downloadCover$1(this.f7867d, this.f7868e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7866c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            AbstractC11106e0 abstractC11106e0M24799b = C11157r0.m24799b();
            C61081 c61081 = new C61081(this.f7867d, this.f7868e, null);
            this.f7866c = 1;
            if (AbstractC11109f.m24709g(abstractC11106e0M24799b, c61081, this) == objM25952f) {
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
        return ((BaseFileViewModel$downloadCover$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
