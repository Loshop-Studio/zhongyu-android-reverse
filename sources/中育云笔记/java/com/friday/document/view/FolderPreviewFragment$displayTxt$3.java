package com.friday.document.view;

import com.friday.common.entity.FileEntity;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.AbstractC11109f;
import sd.AbstractC11164t1;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.FolderPreviewFragment$displayTxt$3", m26211f = "FolderPreviewFragment.kt", m26212l = {351}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FolderPreviewFragment$displayTxt$3 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f7104c;

    /* renamed from: d */
    public int f7105d;

    /* renamed from: e */
    public final /* synthetic */ FileEntity f7106e;

    /* renamed from: f */
    public final /* synthetic */ FolderPreviewFragment f7107f;

    @InterfaceC11829d(m26210c = "com.friday.document.view.FolderPreviewFragment$displayTxt$3$1", m26211f = "FolderPreviewFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.FolderPreviewFragment$displayTxt$3$1 */
    public static final class C60021 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7108c;

        /* renamed from: d */
        public final /* synthetic */ FolderPreviewFragment f7109d;

        /* renamed from: e */
        public final /* synthetic */ String f7110e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60021(FolderPreviewFragment folderPreviewFragment, String str, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f7109d = folderPreviewFragment;
            this.f7110e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C60021(this.f7109d, this.f7110e, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f7108c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            FolderPreviewFragment.m5662F(this.f7109d).f6613d.f6574i.setText(this.f7110e);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60021) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderPreviewFragment$displayTxt$3(FileEntity fileEntity, FolderPreviewFragment folderPreviewFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7106e = fileEntity;
        this.f7107f = folderPreviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FolderPreviewFragment$displayTxt$3(this.f7106e, this.f7107f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7105d;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            String strM26590k = AbstractC11958b.m26590k(this.f7106e.getTxtFilePath(), null, false, 6, null);
            AbstractC11164t1 abstractC11164t1M24800c = C11157r0.m24800c();
            C60021 c60021 = new C60021(this.f7107f, strM26590k, null);
            this.f7104c = AbstractC11833h.m26224a(strM26590k);
            this.f7105d = 1;
            if (AbstractC11109f.m24709g(abstractC11164t1M24800c, c60021, this) == objM25952f) {
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
        return ((FolderPreviewFragment$displayTxt$3) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
