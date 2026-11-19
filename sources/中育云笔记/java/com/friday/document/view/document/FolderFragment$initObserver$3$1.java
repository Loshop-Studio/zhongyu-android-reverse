package com.friday.document.view.document;

import com.friday.common.entity.FileEntity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.document.FolderFragment$initObserver$3$1", m26211f = "FolderFragment.kt", m26212l = {224, 228, 236}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FolderFragment$initObserver$3$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7336c;

    /* renamed from: d */
    public final /* synthetic */ FileEntity f7337d;

    /* renamed from: e */
    public final /* synthetic */ FolderFragment f7338e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderFragment$initObserver$3$1(FileEntity fileEntity, FolderFragment folderFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7337d = fileEntity;
        this.f7338e = folderFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FolderFragment$initObserver$3$1(this.f7337d, this.f7338e, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (kotlinx.coroutines.DelayKt.m20376b(1000, r6) != r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:7:0x0011, B:30:0x0086, B:11:0x001e, B:24:0x0072, B:26:0x0076, B:27:0x007b, B:31:0x0098, B:12:0x0022, B:18:0x0041, B:20:0x004f, B:21:0x005b, B:15:0x0029), top: B:36:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098 A[Catch: Exception -> 0x00a0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a0, blocks: (B:7:0x0011, B:30:0x0086, B:11:0x001e, B:24:0x0072, B:26:0x0076, B:27:0x007b, B:31:0x0098, B:12:0x0022, B:18:0x0041, B:20:0x004f, B:21:0x005b, B:15:0x0029), top: B:36:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r6.f7336c
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L26
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.AbstractC9924b.m20071b(r7)     // Catch: java.lang.Exception -> La0
            goto L86
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            kotlin.AbstractC9924b.m20071b(r7)     // Catch: java.lang.Exception -> La0
            goto L72
        L22:
            kotlin.AbstractC9924b.m20071b(r7)     // Catch: java.lang.Exception -> La0
            goto L41
        L26:
            kotlin.AbstractC9924b.m20071b(r7)
            java.lang.String r7 = "checkTab"
            com.jeremyliao.liveeventbus.core.Observable r7 = com.jeremyliao.liveeventbus.LiveEventBus.get(r7)     // Catch: java.lang.Exception -> La0
            java.lang.Integer r1 = p409xc.AbstractC11826a.m26208c(r4)     // Catch: java.lang.Exception -> La0
            r7.post(r1)     // Catch: java.lang.Exception -> La0
            r6.f7336c = r4     // Catch: java.lang.Exception -> La0
            r4 = 100
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.m20376b(r4, r6)     // Catch: java.lang.Exception -> La0
            if (r7 != r0) goto L41
            goto L85
        L41:
            com.friday.common.entity.FileEntity r7 = r6.f7337d     // Catch: java.lang.Exception -> La0
            java.lang.String r7 = r7.getParentId()     // Catch: java.lang.Exception -> La0
            java.lang.String r1 = "0"
            boolean r7 = kotlin.jvm.internal.AbstractC9979u.m20289b(r7, r1)     // Catch: java.lang.Exception -> La0
            if (r7 == 0) goto L5b
            com.friday.document.view.document.FolderFragment r7 = r6.f7338e     // Catch: java.lang.Exception -> La0
            com.friday.document.viewmodel.BaseFileViewModel r7 = r7.m5820E()     // Catch: java.lang.Exception -> La0
            com.friday.document.viewmodel.FolderViewModel r7 = (com.friday.document.viewmodel.FolderViewModel) r7     // Catch: java.lang.Exception -> La0
            r7.m6273y0()     // Catch: java.lang.Exception -> La0
            goto L7b
        L5b:
            com.friday.document.view.document.FolderFragment r7 = r6.f7338e     // Catch: java.lang.Exception -> La0
            com.friday.document.viewmodel.BaseFileViewModel r7 = r7.m5820E()     // Catch: java.lang.Exception -> La0
            com.friday.document.viewmodel.FolderViewModel r7 = (com.friday.document.viewmodel.FolderViewModel) r7     // Catch: java.lang.Exception -> La0
            com.friday.common.entity.FileEntity r1 = r6.f7337d     // Catch: java.lang.Exception -> La0
            java.lang.String r1 = r1.getParentId()     // Catch: java.lang.Exception -> La0
            r6.f7336c = r3     // Catch: java.lang.Exception -> La0
            java.lang.Object r7 = r7.m6292L0(r1, r6)     // Catch: java.lang.Exception -> La0
            if (r7 != r0) goto L72
            goto L85
        L72:
            com.friday.common.entity.FileEntity r7 = (com.friday.common.entity.FileEntity) r7     // Catch: java.lang.Exception -> La0
            if (r7 == 0) goto L98
            com.friday.document.view.document.FolderFragment r1 = r6.f7338e     // Catch: java.lang.Exception -> La0
            com.friday.document.view.document.FolderFragment.m5854b0(r1, r7)     // Catch: java.lang.Exception -> La0
        L7b:
            r6.f7336c = r2     // Catch: java.lang.Exception -> La0
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.m20376b(r1, r6)     // Catch: java.lang.Exception -> La0
            if (r7 != r0) goto L86
        L85:
            return r0
        L86:
            com.friday.document.view.document.FolderFragment r7 = r6.f7338e     // Catch: java.lang.Exception -> La0
            com.friday.document.viewmodel.BaseFileViewModel r7 = r7.m5820E()     // Catch: java.lang.Exception -> La0
            com.friday.document.viewmodel.FolderViewModel r7 = (com.friday.document.viewmodel.FolderViewModel) r7     // Catch: java.lang.Exception -> La0
            com.friday.common.entity.FileEntity r0 = r6.f7337d     // Catch: java.lang.Exception -> La0
            java.lang.String r0 = r0.getFileId()     // Catch: java.lang.Exception -> La0
            r7.m6262s0(r0)     // Catch: java.lang.Exception -> La0
            goto La0
        L98:
            java.lang.String r7 = "未找到该文件"
            p429z1.AbstractC11958b.m26588i(r7)     // Catch: java.lang.Exception -> La0
            qc.q r7 = p309qc.C10786q.f26013a     // Catch: java.lang.Exception -> La0
            return r7
        La0:
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.view.document.FolderFragment$initObserver$3$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/view/document/FolderFragment$initObserver$3$1.smali:130
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FolderFragment$initObserver$3$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
