package com.friday.document.viewmodel;

import com.friday.document.model.ShareFile;
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

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.StudentShareViewModel$downloadNoteFile$1", m26211f = "StudentShareViewModel.kt", m26212l = {234}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class StudentShareViewModel$downloadNoteFile$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8360c;

    /* renamed from: d */
    public final /* synthetic */ StudentShareViewModel f8361d;

    /* renamed from: e */
    public final /* synthetic */ ShareFile f8362e;

    @InterfaceC11829d(m26210c = "com.friday.document.viewmodel.StudentShareViewModel$downloadNoteFile$1$1", m26211f = "StudentShareViewModel.kt", m26212l = {236, 238, 240}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.viewmodel.StudentShareViewModel$downloadNoteFile$1$1 */
    public static final class C61291 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public Object f8363c;

        /* renamed from: d */
        public int f8364d;

        /* renamed from: e */
        public final /* synthetic */ StudentShareViewModel f8365e;

        /* renamed from: f */
        public final /* synthetic */ ShareFile f8366f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61291(StudentShareViewModel studentShareViewModel, ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f8365e = studentShareViewModel;
            this.f8366f = shareFile;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C61291(this.f8365e, this.f8366f, interfaceC11588c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
        
            if (r1.m5598C(r2, r4, r7) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
        
            if (r1.m5617v(r3, r7) == r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r7.f8364d
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L27
                if (r1 == r4) goto L23
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r0 = r7.f8363c
                com.friday.common.property.BaseResponse r0 = (com.friday.common.property.BaseResponse) r0
                kotlin.AbstractC9924b.m20071b(r8)
                goto L97
            L23:
                kotlin.AbstractC9924b.m20071b(r8)
                goto L45
            L27:
                kotlin.AbstractC9924b.m20071b(r8)
                com.friday.document.viewmodel.StudentShareViewModel r8 = r7.f8365e
                s2.b r8 = com.friday.document.viewmodel.StudentShareViewModel.m6449m(r8)
                com.friday.document.model.ShareFile r1 = r7.f8366f
                java.lang.String r1 = r1.getFileId()
                com.friday.document.model.ShareFile r5 = r7.f8366f
                long r5 = r5.getOwnerId()
                r7.f8364d = r4
                java.lang.Object r8 = r8.m24502a(r1, r5, r7)
                if (r8 != r0) goto L45
                goto L96
            L45:
                com.friday.common.property.BaseResponse r8 = (com.friday.common.property.BaseResponse) r8
                int r1 = r8.getCode()
                if (r1 != 0) goto L80
                java.lang.Object r1 = r8.getData()
                com.friday.common.entity.GetResourceEntity r1 = (com.friday.common.entity.GetResourceEntity) r1
                java.util.List r1 = r1.getResourceList()
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L80
                com.friday.document.viewmodel.StudentShareViewModel r1 = r7.f8365e
                com.friday.document.service.FileManager r1 = r1.m6464y()
                java.lang.Object r2 = r8.getData()
                com.friday.common.entity.GetResourceEntity r2 = (com.friday.common.entity.GetResourceEntity) r2
                java.util.List r2 = r2.getResourceList()
                com.friday.document.model.ShareFile r4 = r7.f8366f
                java.lang.Object r8 = p409xc.AbstractC11833h.m26224a(r8)
                r7.f8363c = r8
                r7.f8364d = r3
                java.lang.Object r8 = r1.m5598C(r2, r4, r7)
                if (r8 != r0) goto L97
                goto L96
            L80:
                com.friday.document.viewmodel.StudentShareViewModel r1 = r7.f8365e
                com.friday.document.service.FileManager r1 = r1.m6464y()
                com.friday.document.model.ShareFile r3 = r7.f8366f
                java.lang.Object r8 = p409xc.AbstractC11833h.m26224a(r8)
                r7.f8363c = r8
                r7.f8364d = r2
                java.lang.Object r8 = r1.m5617v(r3, r7)
                if (r8 != r0) goto L97
            L96:
                return r0
            L97:
                com.friday.document.viewmodel.StudentShareViewModel r8 = r7.f8365e
                androidx.lifecycle.MutableLiveData r8 = r8.m6453A()
                com.friday.document.model.ShareFile r0 = r7.f8366f
                r8.postValue(r0)
                qc.q r8 = p309qc.C10786q.f26013a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.StudentShareViewModel$downloadNoteFile$1.C61291.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/StudentShareViewModel$downloadNoteFile$1$1.smali:132
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C61291) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentShareViewModel$downloadNoteFile$1(StudentShareViewModel studentShareViewModel, ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8361d = studentShareViewModel;
        this.f8362e = shareFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new StudentShareViewModel$downloadNoteFile$1(this.f8361d, this.f8362e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f8360c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            AbstractC11106e0 abstractC11106e0M24799b = C11157r0.m24799b();
            C61291 c61291 = new C61291(this.f8361d, this.f8362e, null);
            this.f8360c = 1;
            if (AbstractC11109f.m24709g(abstractC11106e0M24799b, c61291, this) == objM25952f) {
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
        return ((StudentShareViewModel$downloadNoteFile$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
