package com.friday.document.viewmodel;

import com.blankj.utilcode.util.LogUtils;
import com.friday.common.entity.FileEntity;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.NewestViewModel$retrySyncSingleFile$1", m26211f = "NewestViewModel.kt", m26212l = {103, 106}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NewestViewModel$retrySyncSingleFile$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f8097c;

    /* renamed from: d */
    public int f8098d;

    /* renamed from: e */
    public int f8099e;

    /* renamed from: f */
    public /* synthetic */ Object f8100f;

    /* renamed from: g */
    public final /* synthetic */ NewestViewModel f8101g;

    /* renamed from: h */
    public final /* synthetic */ FileEntity f8102h;

    @InterfaceC11829d(m26210c = "com.friday.document.viewmodel.NewestViewModel$retrySyncSingleFile$1$1", m26211f = "NewestViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.viewmodel.NewestViewModel$retrySyncSingleFile$1$1 */
    public static final class C61181 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f8103c;

        /* renamed from: d */
        public final /* synthetic */ Object f8104d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61181(Object obj, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f8104d = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C61181(this.f8104d, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f8103c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            Object obj2 = this.f8104d;
            if (Result.m20059k(obj2)) {
                LogUtils.m3886d("手动同步成功");
            }
            Throwable thM20056e = Result.m20056e(obj2);
            if (thM20056e != null) {
                LogUtils.m3887e("手动同步失败: " + thM20056e.getMessage());
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C61181) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewestViewModel$retrySyncSingleFile$1(NewestViewModel newestViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8101g = newestViewModel;
        this.f8102h = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        NewestViewModel$retrySyncSingleFile$1 newestViewModel$retrySyncSingleFile$1 = new NewestViewModel$retrySyncSingleFile$1(this.f8101g, this.f8102h, interfaceC11588c);
        newestViewModel$retrySyncSingleFile$1.f8100f = obj;
        return newestViewModel$retrySyncSingleFile$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (sd.AbstractC11109f.m24709g(r2, r4, r6) == r1) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f8100f
            sd.i0 r0 = (sd.InterfaceC11122i0) r0
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r6.f8099e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L28
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L16
            kotlin.AbstractC9924b.m20071b(r7)
            goto L7d
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            java.lang.Object r2 = r6.f8097c
            sd.i0 r2 = (sd.InterfaceC11122i0) r2
            kotlin.AbstractC9924b.m20071b(r7)     // Catch: java.lang.Throwable -> L26
            goto L4d
        L26:
            r7 = move-exception
            goto L54
        L28:
            kotlin.AbstractC9924b.m20071b(r7)
            com.friday.document.viewmodel.NewestViewModel r7 = r6.f8101g
            com.friday.common.entity.FileEntity r2 = r6.f8102h
            kotlin.Result$a r5 = kotlin.Result.f23263d     // Catch: java.lang.Throwable -> L26
            com.friday.document.service.FileManager r7 = r7.m6230N()     // Catch: java.lang.Throwable -> L26
            java.lang.Object r5 = p409xc.AbstractC11833h.m26224a(r0)     // Catch: java.lang.Throwable -> L26
            r6.f8100f = r5     // Catch: java.lang.Throwable -> L26
            java.lang.Object r5 = p409xc.AbstractC11833h.m26224a(r0)     // Catch: java.lang.Throwable -> L26
            r6.f8097c = r5     // Catch: java.lang.Throwable -> L26
            r5 = 0
            r6.f8098d = r5     // Catch: java.lang.Throwable -> L26
            r6.f8099e = r4     // Catch: java.lang.Throwable -> L26
            java.lang.Object r7 = r7.m5602G(r2, r6)     // Catch: java.lang.Throwable -> L26
            if (r7 != r1) goto L4d
            goto L7c
        L4d:
            qc.q r7 = p309qc.C10786q.f26013a     // Catch: java.lang.Throwable -> L26
            java.lang.Object r7 = kotlin.Result.m20054c(r7)     // Catch: java.lang.Throwable -> L26
            goto L5e
        L54:
            kotlin.Result$a r2 = kotlin.Result.f23263d
            java.lang.Object r7 = kotlin.AbstractC9924b.m20070a(r7)
            java.lang.Object r7 = kotlin.Result.m20054c(r7)
        L5e:
            sd.t1 r2 = sd.C11157r0.m24800c()
            com.friday.document.viewmodel.NewestViewModel$retrySyncSingleFile$1$1 r4 = new com.friday.document.viewmodel.NewestViewModel$retrySyncSingleFile$1$1
            r5 = 0
            r4.<init>(r7, r5)
            java.lang.Object r0 = p409xc.AbstractC11833h.m26224a(r0)
            r6.f8100f = r0
            java.lang.Object r7 = p409xc.AbstractC11833h.m26224a(r7)
            r6.f8097c = r7
            r6.f8099e = r3
            java.lang.Object r7 = sd.AbstractC11109f.m24709g(r2, r4, r6)
            if (r7 != r1) goto L7d
        L7c:
            return r1
        L7d:
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.NewestViewModel$retrySyncSingleFile$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/NewestViewModel$retrySyncSingleFile$1.smali:139
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NewestViewModel$retrySyncSingleFile$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
