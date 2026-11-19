package com.friday.paint.viewmodel;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NewNoteViewModel$repairMissingImagesByPageDir$1", m26211f = "NewNoteViewModel.kt", m26212l = {435, 436}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NewNoteViewModel$repairMissingImagesByPageDir$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f10414c;

    /* renamed from: d */
    public int f10415d;

    /* renamed from: e */
    public final /* synthetic */ NewNoteViewModel f10416e;

    /* renamed from: f */
    public final /* synthetic */ String f10417f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewNoteViewModel$repairMissingImagesByPageDir$1(NewNoteViewModel newNoteViewModel, String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10416e = newNoteViewModel;
        this.f10417f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NewNoteViewModel$repairMissingImagesByPageDir$1(this.f10416e, this.f10417f, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r1.mo5613f(r6, r3, r5) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r5.f10415d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r0 = r5.f10414c
            com.friday.common.entity.FileEntity r0 = (com.friday.common.entity.FileEntity) r0
            kotlin.AbstractC9924b.m20071b(r6)     // Catch: java.lang.Exception -> L16
            goto L80
        L16:
            r6 = move-exception
            goto L5a
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L20:
            kotlin.AbstractC9924b.m20071b(r6)     // Catch: java.lang.Exception -> L16
            goto L3c
        L24:
            kotlin.AbstractC9924b.m20071b(r6)
            com.friday.paint.viewmodel.NewNoteViewModel r6 = r5.f10416e     // Catch: java.lang.Exception -> L16
            com.friday.common.dao.FileDao r6 = com.friday.paint.viewmodel.NewNoteViewModel.m7648h(r6)     // Catch: java.lang.Exception -> L16
            com.friday.paint.viewmodel.NewNoteViewModel r1 = r5.f10416e     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = r1.m7665G()     // Catch: java.lang.Exception -> L16
            r5.f10415d = r3     // Catch: java.lang.Exception -> L16
            java.lang.Object r6 = r6.mo4941r(r1, r5)     // Catch: java.lang.Exception -> L16
            if (r6 != r0) goto L3c
            goto L59
        L3c:
            com.friday.common.entity.FileEntity r6 = (com.friday.common.entity.FileEntity) r6     // Catch: java.lang.Exception -> L16
            if (r6 != 0) goto L43
            qc.q r6 = p309qc.C10786q.f26013a     // Catch: java.lang.Exception -> L16
            return r6
        L43:
            com.friday.paint.viewmodel.NewNoteViewModel r1 = r5.f10416e     // Catch: java.lang.Exception -> L16
            j2.d r1 = com.friday.paint.viewmodel.NewNoteViewModel.m7649i(r1)     // Catch: java.lang.Exception -> L16
            java.lang.String r3 = r5.f10417f     // Catch: java.lang.Exception -> L16
            java.lang.Object r4 = p409xc.AbstractC11833h.m26224a(r6)     // Catch: java.lang.Exception -> L16
            r5.f10414c = r4     // Catch: java.lang.Exception -> L16
            r5.f10415d = r2     // Catch: java.lang.Exception -> L16
            java.lang.Object r6 = r1.mo5613f(r6, r3, r5)     // Catch: java.lang.Exception -> L16
            if (r6 != r0) goto L80
        L59:
            return r0
        L5a:
            java.lang.String r0 = r5.f10417f
            java.lang.String r6 = r6.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "页面NewNoteViewModel.kt -> 恢复缺失图片失败，pageDir="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ": "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            com.blankj.utilcode.util.LogUtils.m3887e(r6)
        L80:
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.viewmodel.NewNoteViewModel$repairMissingImagesByPageDir$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1.smali:131
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NewNoteViewModel$repairMissingImagesByPageDir$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
