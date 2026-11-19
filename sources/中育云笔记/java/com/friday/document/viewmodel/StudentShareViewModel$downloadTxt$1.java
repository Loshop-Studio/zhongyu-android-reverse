package com.friday.document.viewmodel;

import com.friday.common.helper.C5964d;
import com.friday.document.model.ShareFile;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.StudentShareViewModel$downloadTxt$1", m26211f = "StudentShareViewModel.kt", m26212l = {201, 208}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class StudentShareViewModel$downloadTxt$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8380c;

    /* renamed from: d */
    public final /* synthetic */ StudentShareViewModel f8381d;

    /* renamed from: e */
    public final /* synthetic */ ShareFile f8382e;

    @InterfaceC11829d(m26210c = "com.friday.document.viewmodel.StudentShareViewModel$downloadTxt$1$1", m26211f = "StudentShareViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.viewmodel.StudentShareViewModel$downloadTxt$1$1 */
    public static final class C61311 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f8383c;

        /* renamed from: d */
        public final /* synthetic */ ShareFile f8384d;

        /* renamed from: e */
        public final /* synthetic */ StudentShareViewModel f8385e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61311(ShareFile shareFile, StudentShareViewModel studentShareViewModel, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f8384d = shareFile;
            this.f8385e = studentShareViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C61311(this.f8384d, this.f8385e, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            AbstractC11725a.m25952f();
            if (this.f8383c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            C5964d.m5326h(C5964d.f6085d.m5337a(), this.f8384d.getFileUrl(), this.f8385e.f8336m + this.f8384d.getFileId() + ".txt", null, 4, null);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C61311) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentShareViewModel$downloadTxt$1(StudentShareViewModel studentShareViewModel, ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8381d = studentShareViewModel;
        this.f8382e = shareFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new StudentShareViewModel$downloadTxt$1(this.f8381d, this.f8382e, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
    
        if (r12.mo2811g(r3, r11) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r11.f8380c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.AbstractC9924b.m20071b(r12)
            goto L6b
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            kotlin.AbstractC9924b.m20071b(r12)
            goto L38
        L1e:
            kotlin.AbstractC9924b.m20071b(r12)
            sd.e0 r12 = sd.C11157r0.m24799b()
            com.friday.document.viewmodel.StudentShareViewModel$downloadTxt$1$1 r1 = new com.friday.document.viewmodel.StudentShareViewModel$downloadTxt$1$1
            com.friday.document.model.ShareFile r4 = r11.f8382e
            com.friday.document.viewmodel.StudentShareViewModel r5 = r11.f8381d
            r6 = 0
            r1.<init>(r4, r5, r6)
            r11.f8380c = r3
            java.lang.Object r12 = sd.AbstractC11109f.m24709g(r12, r1, r11)
            if (r12 != r0) goto L38
            goto L6a
        L38:
            com.friday.document.viewmodel.StudentShareViewModel r12 = r11.f8381d
            c2.g2 r12 = com.friday.document.viewmodel.StudentShareViewModel.m6447k(r12)
            com.friday.common.entity.ShareCacheEntity r3 = new com.friday.common.entity.ShareCacheEntity
            java.lang.String r4 = p215k2.AbstractC9803u.m19814a()
            java.lang.String r1 = "get32UUID(...)"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r4, r1)
            com.friday.document.model.ShareFile r1 = r11.f8382e
            java.lang.String r5 = r1.getFileId()
            com.friday.document.model.ShareFile r1 = r11.f8382e
            int r6 = r1.getVersion()
            com.friday.document.viewmodel.StudentShareViewModel r1 = r11.f8381d
            long r7 = com.friday.document.viewmodel.StudentShareViewModel.m6450n(r1)
            long r9 = java.lang.System.currentTimeMillis()
            r3.<init>(r4, r5, r6, r7, r9)
            r11.f8380c = r2
            java.lang.Object r12 = r12.mo2811g(r3, r11)
            if (r12 != r0) goto L6b
        L6a:
            return r0
        L6b:
            com.friday.document.viewmodel.StudentShareViewModel r12 = r11.f8381d
            androidx.lifecycle.MutableLiveData r12 = r12.m6454B()
            com.friday.document.model.ShareFile r0 = r11.f8382e
            r12.postValue(r0)
            qc.q r12 = p309qc.C10786q.f26013a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.StudentShareViewModel$downloadTxt$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1.smali:129
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((StudentShareViewModel$downloadTxt$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
