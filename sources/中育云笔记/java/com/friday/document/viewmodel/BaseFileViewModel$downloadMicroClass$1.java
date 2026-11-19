package com.friday.document.viewmodel;

import androidx.core.view.InputDeviceCompat;
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

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel$downloadMicroClass$1", m26211f = "BaseFileViewModel.kt", m26212l = {512}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseFileViewModel$downloadMicroClass$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7881c;

    /* renamed from: d */
    public final /* synthetic */ BaseFileViewModel f7882d;

    /* renamed from: e */
    public final /* synthetic */ FileEntity f7883e;

    @InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel$downloadMicroClass$1$1", m26211f = "BaseFileViewModel.kt", m26212l = {InputDeviceCompat.SOURCE_DPAD}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.viewmodel.BaseFileViewModel$downloadMicroClass$1$1 */
    public static final class C61091 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7884c;

        /* renamed from: d */
        public final /* synthetic */ BaseFileViewModel f7885d;

        /* renamed from: e */
        public final /* synthetic */ FileEntity f7886e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61091(BaseFileViewModel baseFileViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f7885d = baseFileViewModel;
            this.f7886e = fileEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C61091(this.f7885d, this.f7886e, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7884c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                FileManager fileManagerM6230N = this.f7885d.m6230N();
                FileEntity fileEntity = this.f7886e;
                this.f7884c = 1;
                if (fileManagerM6230N.mo5611d(fileEntity, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            this.f7885d.m6268v0(this.f7886e);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C61091) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileViewModel$downloadMicroClass$1(BaseFileViewModel baseFileViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7882d = baseFileViewModel;
        this.f7883e = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BaseFileViewModel$downloadMicroClass$1(this.f7882d, this.f7883e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7881c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            AbstractC11106e0 abstractC11106e0M24799b = C11157r0.m24799b();
            C61091 c61091 = new C61091(this.f7882d, this.f7883e, null);
            this.f7881c = 1;
            if (AbstractC11109f.m24709g(abstractC11106e0M24799b, c61091, this) == objM25952f) {
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
        return ((BaseFileViewModel$downloadMicroClass$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
